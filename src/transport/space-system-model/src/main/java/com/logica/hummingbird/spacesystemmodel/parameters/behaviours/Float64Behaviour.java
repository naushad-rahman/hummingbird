package org.hbird.spacesystemmodel.parameters.behaviours;

import java.util.BitSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.hbird.util.BitSetUtility;
import org.hbird.util.exceptions.BitSetOperationException;

/**
 * Parameter behaviour for an IEEE 754 64-bit precision Float.
 * 
 * @author Mark Doyle
 * @author Johannes Klug
 * 
 */
public class Float64Behaviour extends AbstractFloatBehaviour {
	private final static Logger LOG = LoggerFactory.getLogger(Float64Behaviour.class);

	public Float64Behaviour() {
		super(64);
	}

	@Override
	public Double valueFromBitSet(BitSet packet) {
		// The technique this method uses is to convert the bitset to a string and then parse it as a double
		// Awesome tekkers.

		int offset = 0;

		BitSet actualBitSet = packet.get(offset, offset + (int) getSizeInBits());

		if (LOG.isDebugEnabled()) {
			LOG.debug("Float Parameter BitSet taken from bitset in = " + BitSetUtility.binDump(actualBitSet));
		}
		
		// Float 64 so convert to a Double
		return Double.longBitsToDouble(BitSetUtility.toLong(actualBitSet));
	}

	@Override
	public BitSet insertIntoBitSet(Number number, BitSet bitSetTarget, int offset) throws BitSetOperationException {
		double value = number.doubleValue();

		// Convert the value to a bitset
		// Parse as IEEE-754 Double Precision (64-bit) (Java Double)
		Long longBits = Double.doubleToLongBits(value);

		String binaryString = Long.toBinaryString(longBits);

		if (value >= 0) {
			// We have to add the Sign bit manually for positive Numbers
			binaryString = '0' + binaryString;
		}

		// Get the BitSet from the String.
		BitSet valueBitSet = this.bitSetFromString(binaryString);

		// Insert the value BitSet into the target BitSet and return
		for (int i = 0; i < getSizeInBits(); i++) {
			if (valueBitSet.get(i)) {
				bitSetTarget.set(i + offset);
			}
			else {
				bitSetTarget.clear(i + offset);
			}
		}
		return bitSetTarget;
	}


	@Override
	public String getTypeName() {
		return "Double (IEEE754 Double precision 64-bit)";
	}

}
