/**
 * Licensed under the Apache License, Version 2.0. You may obtain a copy of 
 * the License at http://www.apache.org/licenses/LICENSE-2.0 or at this project's root.
 */

package org.hbird.transport.packetbroker;

import java.util.BitSet;

import org.hbird.transport.commons.util.exceptions.BitSetOperationException;
import org.hbird.transport.packetbroker.producers.AbstractProducer;
import org.hbird.transport.packetbroker.producers.HummingbirdPacketProducer;
import org.hbird.transport.packetbroker.producers.HummingbirdParameterProducer;
import org.hbird.transport.spacesystemmodel.ParameterGroup;
import org.hbird.transport.spacesystemmodel.SpaceSystemModelFactory;
import org.hbird.transport.spacesystemmodel.exceptions.UnknownParameterGroupException;
import org.hbird.transport.telemetry.HummingbirdPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO Improve comment. The notification model for observers could have been implemented in two ways; Firstly we could
 * notify the observer when it changes. This is architecturally pleasing as there is a direct coupling between the 2.
 * Notify the observers when the complete container has been unmarshalled.
 */
public class HummingbirdPacketBroker implements PacketBroker {
	private static final Logger LOG = LoggerFactory.getLogger(HummingbirdPacketBroker.class);

	/** The factory used to locate the models. */
	protected SpaceSystemModelFactory factory = null;

	protected AbstractProducer packetProducer;
	protected AbstractProducer parameterProducer;

	/**
	 * Constructor.
	 * 
	 * Set up the SpaceSystemModelFactory and the necessary message producers.
	 * 
	 * @param factory
	 *            The factory to be used to obtain references to the container.
	 * */
	public HummingbirdPacketBroker(SpaceSystemModelFactory factory) {
		this.factory = factory;
		this.packetProducer = new HummingbirdPacketProducer(factory);
		this.parameterProducer = new HummingbirdParameterProducer(factory, (HummingbirdPacketProducer) packetProducer);
	}

	@Override
	public final void unmarshall(String packetname, BitSet packet) throws UnknownParameterGroupException {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Unmarshalling container " + packetname + " with BitSet " + packet);
		}
		factory.getParameterGroup(packetname).unmarshall(packet);
	}

	@Override
	public final void marshall(String packetname, BitSet packet) throws UnknownParameterGroupException, BitSetOperationException {
		if (LOG.isDebugEnabled()) {
			LOG.debug("Unmarshalling container " + packetname + " with BitSet " + packet + " at offset 0");
		}
		factory.getParameterGroup(packetname).marshall(packet, 0);
	}

	@Override
	public final void marshall(String packetname, String packet) throws UnknownParameterGroupException {
		packet = factory.getParameterGroup(packetname).toString();
	}

	@Override
	public final ParameterGroup getContainer(String container) throws UnknownParameterGroupException {
		return factory.getParameterGroup(container);
	}

	@Override
	public final SpaceSystemModelFactory getFactory() {
		return factory;
	}

	@Override
	public final void setFactory(SpaceSystemModelFactory factory) {
		this.factory = factory;
	}

	@Override
	public final HummingbirdPacket getPacket() {
		return this.packetProducer.getPacket();
	}
}
