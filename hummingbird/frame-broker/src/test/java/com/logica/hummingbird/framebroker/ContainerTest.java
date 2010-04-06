/**
 * 
 */
package com.logica.hummingbird.framebroker;

import static org.junit.Assert.assertEquals;

import java.util.BitSet;

import org.apache.commons.lang.StringUtils;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import com.logica.hummingbird.framebroker.exceptions.BitSetOperationException;
import com.logica.hummingbird.framebroker.exceptions.UnknownContainerNameException;
import com.logica.hummingbird.framebroker.parameters.IntegerParameter;
import com.logica.hummingbird.framebroker.parameters.Parameter;

/**
 * @author Mark Doyle
 * 
 */
public class ContainerTest {
	/**
	 * Logger for this class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(ContainerTest.class);

	private static final MockContainerModelFactory MOCK_CONTAINER_MODEL_FACTORY = new MockContainerModelFactory();

	private static IFrameBroker testFrameBroker = null;

	private static final String EXPECTED_BIT_SET_DUMP = "11010100 01011011 11000000 00000000 00000000 00000000 00000000 00000000 "
			+ System.getProperty("line.separator")
			+ "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 "
			+ System.getProperty("line.separator");
	
	/**
	 * Based upon the MockContainerFactory this Bit String encodes the Mock Container model with a param type ID of 555 and a param A test value of 123
	 */
	private final static String BITSET_AS_STRING = "11010100010110111100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000";
	
	/**
	 * Constant used to reference param type ID 555 in the tests.
	 */
	private static final String PACKET_TYPE_ID_555 = "555";
	
	/**
	 * A value used in testing to set param A to a value.
	 */
	private static final int PARAM_A_TEST_VALUE = 123;

	/**
	 * Set's up the FrameBroker with a mock container model factory.
	 */
	@BeforeClass
	public static void setUpForAllTests() {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Setting up for all tests");
		}
		testFrameBroker = new ContainerProcessor(MOCK_CONTAINER_MODEL_FACTORY);
	}

	/**
	 * Test method for checking a valid BitSet can be unmarshalled into a collection of Java objects (the Containers)
	 * {@link com.logica.hummingbird.framebroker.Container#unmarshall(java.util.BitSet)}
	 * .
	 * 
	 * @throws UnknownContainerNameException
	 * @throws BitSetOperationException 
	 */
	@Test
	public void testUnmarshall() throws UnknownContainerNameException, BitSetOperationException {
		LOG.info("Beginning test");
		
		BitSet frame = BitSetUtility.fromString(BITSET_AS_STRING);
		testFrameBroker.unmarshall("TMFrame", frame);
		
		// Check the unmarshalling was successful...
		IContainer tmframe = testFrameBroker.getContainer("TMFrame");
		Assert.isInstanceOf(Container.class, tmframe);
		
		// Test the parameter type ID (Apid) was unmarshalled as an IntegerParameter with value 555 (PACKET_TYPE_ID_555)
		IContainer paramTypeID = testFrameBroker.getContainer(MockContainerModelFactory.PACKET_ID_NAME);
		Assert.isInstanceOf(IntegerParameter.class, paramTypeID);
		Number value = ((IntegerParameter)paramTypeID).getValue();
		assertEquals("Parameter has incorrect value.", Integer.parseInt(PACKET_TYPE_ID_555), value.intValue());
		
		// Test that there is a Test Param A (32 bit unsigned int) as expected.
		IContainer testParamA = testFrameBroker.getContainer(MockContainerModelFactory.TEST_PARAM_VALUE_A);
		Assert.isInstanceOf(IntegerParameter.class, testParamA);
		Number testParamValue = ((IntegerParameter)testParamA).getValue();
		assertEquals("Parameter has incorrect value.", PARAM_A_TEST_VALUE, testParamValue.intValue());
	}

	/**
	 * Tests marshalling a <b>valid</b> population of a Mock Container Model.  The Model is
	 * populated in the test method.
	 * {@link com.logica.hummingbird.framebroker.Container#marshall(java.util.BitSet, int)}
	 * .
	 * 
	 * @throws UnknownContainerNameException
	 */
	@Test
	public void testMarshallOfValidModel() throws UnknownContainerNameException {
		LOG.info("Beginning test");
		
		LOG.debug(MOCK_CONTAINER_MODEL_FACTORY.getContainer("TMFrame").toString());

		/** Populate the input mock frame **/
		// Set the Apid to Packet ID type A
		Parameter apid = MOCK_CONTAINER_MODEL_FACTORY.getParameter(MockContainerModelFactory.PACKET_ID_NAME);
		apid.setValue(Float.valueOf(MockContainerModelFactory.PACKET_TYPE_A_ID));

		// Set parameter A value
		Parameter paramA = MOCK_CONTAINER_MODEL_FACTORY.getParameter(MockContainerModelFactory.TEST_PARAM_VALUE_A);
		paramA.setValue(PARAM_A_TEST_VALUE);

		// Get the frame length, that is, the sum of itself and it's tree of sub
		// containers and set the bitset to this length.
		int length = MOCK_CONTAINER_MODEL_FACTORY.getContainer("TMFrame").getLength();
		if (LOG.isDebugEnabled()) {
			LOG.debug("TMFrame length = " + length);
		}
		BitSet frame = new BitSet(length);

		// Marshall the Frame to a bitset
		testFrameBroker.marshall("TMFrame", frame);

		LOG.debug("Bitset length = " + frame.size());
		String binDump = BitSetUtility.binDump(frame);
		LOG.debug(binDump);

		// Assert the bitset is as expected. // TODO there is probably a better
		// way to do this than a binDump String comparison haha.
		assertEquals("Bit dump not equal", EXPECTED_BIT_SET_DUMP, binDump);

		// Now let's marshall a parameter and run some tests.
		BitSet apidBitSet = new BitSet(MOCK_CONTAINER_MODEL_FACTORY.getParameter(MockContainerModelFactory.PACKET_ID_NAME).getLength());
		testFrameBroker.marshall(MockContainerModelFactory.PACKET_ID_NAME, apidBitSet);
		String apidBinDump = BitSetUtility.binDump(apidBitSet);
		if (LOG.isDebugEnabled()) {
			LOG.debug(MOCK_CONTAINER_MODEL_FACTORY.getParameter(MockContainerModelFactory.PACKET_ID_NAME) + " = "
					+ apidBinDump);
		}

		String apidBinValue = Integer.toBinaryString(Integer.valueOf(MockContainerModelFactory.PACKET_TYPE_A_ID));
		// LSB first so we need to reverse the dumped string.
		apidBinValue = new StringBuffer(apidBinValue).reverse().toString();
		// BitSets are rounded up to 64 bits so we will have to pad the marshalled APID with extra 0's
		// We will calculate the required zeros using the apid's length so we don't spoil the test
		int requiredPadding = 64 - apidBinValue.length();
		char[] zeroPadding = new char[requiredPadding];
		for (int c = 0; c < requiredPadding; c++) {
			zeroPadding[c] = '0';
		}
		StringBuffer apidBinValueWithPadding = new StringBuffer(apidBinValue);
		apidBinValueWithPadding.append(zeroPadding);
		assertEquals("Apid does not match", StringUtils.deleteWhitespace(apidBinDump), apidBinValueWithPadding.toString());
	}

}
