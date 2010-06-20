package com.logica.hummingbird.integrationtests;
import java.util.BitSet;

import org.apache.camel.EndpointInject;
import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.logica.hummingbird.MessageType;
import com.logica.hummingbird.framebroker.CamelCcsdsFrameBroker;
import com.logica.hummingbird.telemetry.ccsds.CcsdsTmFrame;
import com.logica.hummingbird.telemetry.ccsds.CcsdsTmPacket;
import com.logica.hummingbird.telemetry.ccsds.CcsdsTmNumberParameter;
import com.logica.hummingbird.xtce.XtceModelFactory;

public class RouterTest extends CamelTestSupport {
	
	protected static XtceModelFactory xtceFactory;
	
	protected static CamelCcsdsFrameBroker processor = null; 
	
    @EndpointInject(uri = "mock:frames")
    protected MockEndpoint frameEndpoint;
    
    @EndpointInject(uri = "mock:packets")
    protected MockEndpoint packetEndpoint;
    
    @EndpointInject(uri = "mock:parameters")
    protected MockEndpoint parameterEndpoint;

    @Produce(uri = "direct:start")
    protected ProducerTemplate template;
    
//    @Before
//    public void prepare() {
//    	Logger logger =  Logger.getRootLogger();
//    	logger.setLevel(Level.WARN);
//    }
    
    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
        	
            public void configure() throws Exception {
            	
            	xtceFactory = new XtceModelFactory("src/test/resources/humsat.xml");
            	processor = new CamelCcsdsFrameBroker(xtceFactory);
            	
                from("direct:start")
                .split().method(processor, "split")
                .choice()
                .when(header("Type").isEqualTo(MessageType.TMPacket)).to(packetEndpoint)
                .when(header("Type").isEqualTo(MessageType.TMParameter)).to(parameterEndpoint)
                .when(header("Type").isEqualTo(MessageType.TMFrame)).to(frameEndpoint)
                    ;
            }
        };
    }

    @Test
    public void testRouter() throws Exception {

        /** Send to end point. */
		assertNotNull("template is null.", template);
		template.sendBody(getFrame());
        
        /** Check we got the expected output. */        
		parameterEndpoint.expectedMessageCount(24);
		parameterEndpoint.assertIsSatisfied();
		
		packetEndpoint.expectedMessageCount(1);
		packetEndpoint.assertIsSatisfied();
		
		frameEndpoint.expectedMessageCount(1);
		frameEndpoint.assertIsSatisfied();
		
		System.out.println("Number of received frames: " + frameEndpoint.getReceivedCounter());
		System.out.println("Number of received packets: " + packetEndpoint.getReceivedCounter());
		System.out.println("Number of received parameters: " + parameterEndpoint.getReceivedCounter());

    }
    
    @Test
    public void testInstances() throws Exception {
    	
        /** Send to end point. */
		assertNotNull("template is null.", template);
		template.sendBody(getFrame());
    	
    	assertIsInstanceOf(CcsdsTmNumberParameter.class, parameterEndpoint.getReceivedExchanges().get(0).getIn().getBody());
    	assertIsInstanceOf(CcsdsTmPacket.class, packetEndpoint.getReceivedExchanges().get(0).getIn().getBody());
    	assertIsInstanceOf(CcsdsTmFrame.class, frameEndpoint.getReceivedExchanges().get(0).getIn().getBody());
    	
    }
    
    // TODO use MockModelFactory from test-support for this!
    public static BitSet getFrame() throws Exception {
    	
    	/** Create FRAME */

		/** Build the frame. */
		xtceFactory.getParameter("CCSDS_FVERSION").setValue(1);
		xtceFactory.getParameter("CCSDS_SC_ID").setValue(3);
		xtceFactory.getParameter("CCSDS_TF_VC").setValue(3);
		xtceFactory.getParameter("CCSDS_OP_CTRL").setValue(1);
		xtceFactory.getParameter("CCSDS_MS_CNT").setValue(5);
		xtceFactory.getParameter("CCSDS_VC_CNT").setValue(6);
		xtceFactory.getParameter("CCSDS_TF_SECH").setValue(1);
		xtceFactory.getParameter("CCSDS_TF_SYNC").setValue(1);
		xtceFactory.getParameter("CCSDS_TF_ORDER").setValue(1);
		xtceFactory.getParameter("CCSDS_TF_SEGM").setValue(1);
		xtceFactory.getParameter("CCSDS_TF_FH").setValue(1);
		xtceFactory.getParameter("CCSDS_TF_HV").setValue(1);
		xtceFactory.getParameter("CCSDS_TF_HL").setValue(1);
		
		/** ... and the base packet. */
		xtceFactory.getParameter("CCSDS_VERSION").setValue(3);
		xtceFactory.getParameter("CCSDS_TYPE").setValue(1);
		xtceFactory.getParameter("CCSDS_SEC_HD").setValue(0);
		xtceFactory.getParameter("CCSDS_APID").setValue(123);
		xtceFactory.getParameter("CCSDS_GP_FLAGS").setValue(1);
		xtceFactory.getParameter("CCSDS_SSC").setValue(1);
		xtceFactory.getParameter("CCSDS_PLENGTH").setValue(1);

		/** ... and the actual packet. */
		xtceFactory.getParameter("TEST_COUNTER").setValue(10);
		xtceFactory.getParameter("AST10061").setValue(1);

		/** ... and the Frame tail*/
		xtceFactory.getParameter("CCSDS_TF_OC").setValue(12);
		xtceFactory.getParameter("CCSDS_TF_EC").setValue(12);
		
		BitSet frame = new BitSet();

		System.out.println("Initial values:");
				int length = xtceFactory.getContainer("TMFrame").getLength();
		assertEquals(175, length);
		System.out.println("Total length: " + xtceFactory.getContainer("TMFrame").getLength() + " bit(s).");
		
		/** Flip the bit 175 (one larger than the size based on 0 index) to make sure the
		 * bit set does not truncate itself. Else it will remove the trailing 0's, i.e. its
		 * length will become LESS than 175. */
		frame.set(length);
		
		/** Marshall it to a BitSet. */
		//ContainerProcessor processor = new ContainerProcessor(xtceFactory);
		if (processor == null) {
			processor = new CamelCcsdsFrameBroker(xtceFactory);
		}
		processor.marshall("TMFrame", frame);
		
		return frame;
    }
		
}
