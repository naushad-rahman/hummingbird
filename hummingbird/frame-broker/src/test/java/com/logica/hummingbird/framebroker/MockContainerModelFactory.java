package com.logica.hummingbird.framebroker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.logica.hummingbird.framebroker.exceptions.UnknownContainerNameException;
import com.logica.hummingbird.framebroker.parameters.FloatParameter;
import com.logica.hummingbird.framebroker.parameters.IntegerParameter;
import com.logica.hummingbird.framebroker.parameters.Parameter;
import com.logica.hummingbird.framebroker.parameters.ParameterType;
import com.logica.hummingbird.framebroker.parameters.ParameterType.eParameterType;

/**
 * 
 * @author Mark Doyle
 * 
 */
public class MockContainerModelFactory implements IContainerFactory {

	/**
	 * Logger for this class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(MockContainerModelFactory.class);

	private Map<String, Container> containers = new HashMap<String, Container>();
	private Map<String, Parameter> parameters = new HashMap<String, Parameter>();

	private boolean initialised = false;

	/**
	 * Creates an operational mock Container hierarchy which is used by the
	 * FrameBroker.
	 * 
	 */
	@Override
	public void initialise() {
		if (LOG.isTraceEnabled()) {
			LOG.trace("Beginning initialisation of container model mock up");
		}

		/** Build the upper frame skeleton of the Model **/
		// Create the Frame, header, packet and tail and add them to the
		// containers collection
		Container tmFrame = new Container("TMFrame", "Test frame", "Test TM frame for unit testing");
		this.addToContainers(tmFrame);
		Container tmHeader = new Container("TMHeader", "Test header", "Test TM header for unit testing");
		this.addToContainers(tmHeader);
		Container tmPacket = new Container("TMPacket", "Test packet", "Test TM packet for unit testing");
		this.addToContainers(tmPacket);
		Container tmTail = new Container("TMTail", "Test tail", "Test TM tail for unit testing");
		this.addToContainers(tmTail);
		// Add the header, packet and tail to the frame container.
		ArrayList<IContainer> containersToAdd = new ArrayList<IContainer>(3);
		containersToAdd.add(tmHeader);
		containersToAdd.add(tmPacket);
		containersToAdd.add(tmTail);
		tmFrame.addContainer(containersToAdd);

		/** Build the lower packet level of the model **/
		// Create the packet header and add it to the containers collection.
		Container tmPacketHeader = new Container("TMPacketHeader", "Test packet header", "Test TM packet header for unit testing");
		this.addToContainers(tmPacketHeader);

		// Create the apid (ID) parameter type and add it to the packet header
		// and containers collection.
		ParameterType paramType11bitInt = new ParameterType("11bitInt", "11bit integer type", "Parameter type for 11bit integers", eParameterType.INTEGER,
				false, 0, 11);
		IntegerParameter packetTypeId = new IntegerParameter("ApId", "Test Apid", "Test Application Id", paramType11bitInt, 0);
		this.addToContainers(packetTypeId);
		tmPacketHeader.addContainer(packetTypeId);

		// Create the packet body and add it to the containers collection
		Container tmPacketBody = new Container("TMPacketBody", "Test packet body", "Test TM packet header for unit testing");
		this.addToContainers(tmPacketBody);

		// Create a packet type, add it to the packet body, add a restriction to
		// associate it to an ID, and add it to the containers collection
		Container packetTypeA = new Container("TMPacketTypeA", "Test packet body", "Test TM packet for unit testing");
		packetTypeA.addRestriction(packetTypeId, "555");
		this.addToContainers(packetTypeA);
		tmPacketBody.addContainer(packetTypeA);

		// Create a parameter for packetTypeA and add it to the packet type and
		// the container collection
		ParameterType test32bitInt = new ParameterType("test32bitInt", "test param", "32 bit int test param", eParameterType.INTEGER, true, 0, 32);
		IntegerParameter testParameterA = new IntegerParameter("Test param value", "test param", "test param holding an int value", test32bitInt, 5000);
		packetTypeA.addContainer(testParameterA);
		this.addToContainers(testParameterA);

		// Create a packet type, add it to the packet body, add a restriction to
		// associate it to an ID, and add it to the containers collection
		Container packetTypeB = new Container("TMPacketTypeB", "Test packet body", "Test TM packet for unit testing");
		packetTypeB.addRestriction(packetTypeId, "333");
		this.addToContainers(packetTypeB);
		tmPacketBody.addContainer(packetTypeB);

		// Create a parameter for packetTypeB and add it to the packet type and
		// the container collection
		ParameterType test64bitFloat = new ParameterType("test64bitFloat", "test param", "64 float test param", eParameterType.FLOAT, true, 0, 64);
		FloatParameter testParameterB = new FloatParameter("Test param value", "test param", "test param holding a float value", test64bitFloat, 43.53f);
		packetTypeA.addContainer(testParameterB);
		this.addToContainers(testParameterB);

		// Add the packet inners (header and body) to the packet
		List<IContainer> packetInners = new ArrayList<IContainer>(2);
		packetInners.add(tmPacketHeader);
		packetInners.add(tmPacketBody);
		tmPacket.addContainer(packetInners);

		if (LOG.isTraceEnabled()) {
			LOG.trace("Completed mock container model initialisaion");
		}
		this.initialised = true;
	}

	@Override
	public IContainer getContainer(String name) throws UnknownContainerNameException {
		if (initialised == false) {
			initialise();
		}

		Container container = containers.get(name);

		if (container == null) {
			throw new UnknownContainerNameException(containers, "Your container lookup for '" + name
					+ "' did not return any containers. Check your SpaceSystem configuration.");
		}

		return container;
	}

	@Override
	public Map<String, Parameter> getAllParameters() {
		return parameters;
	}

	@Override
	public Parameter getParameter(String name) {
		if (initialised == false) {
			initialise();
		}
		return parameters.get(name);
	}

	/**
	 * Convenience method to add a container with the key set to the containers
	 * name. This is less error prone and less work assuming you want the key to
	 * be the same as the container name.
	 * 
	 * @param container
	 */
	public void addToContainers(Container container) {
		this.containers.put(container.getName(), container);
	}

}
