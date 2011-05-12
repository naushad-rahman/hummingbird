/* ----------------------------------------------------------------------------
 * (c) Copyright Logica 2010
 *
 * All rights reserved. This document is protected by international copyright 
 * law and may not be reprinted, reproduced, copied or utilised in whole or in 
 * part by any means including electronic, mechanical, or other means without 
 * the prior written consent of Logica. 
 * Whilst reasonable care has been taken by Logica to ensure the information 
 * contained herein is reasonably accurate, Logica shall not, under any 
 * circumstances be liable for any loss or damage (direct or consequential) 
 * suffered by any party as a result of the contents of this publication or the 
 * reliance of any party thereon or any inaccuracy or omission therein. The 
 * information in this document is therefore provided on an "as is" basis 
 * without warranty and is subject to change without further notice and cannot 
 * be construed as a commitment by Logica. 
 * The products mentioned in this document are identified by the names, 
 * trademarks, service marks and logos of their respective companies or 
 * organisations and may not be used in any advertising or publicity or in any 
 * other way whatsoever without the prior written consent of those companies 
 * or organisations and Logica.
 * ----------------------------------------------------------------------------
 * System       : Hummingbird
 * Author       : VillemosG
 * Created on   : 08.01.2010
 * ----------------------------------------------------------------------------
 */
package org.hbird.transport.spacesystemmodel.parameters.types;

import java.util.List;

import org.hbird.transport.spacesystemmodel.NamedElement;
import org.hbird.transport.spacesystemmodel.Unit;
import org.hbird.transport.spacesystemmodel.exceptions.InvalidParameterTypeException;
import org.hbird.transport.spacesystemmodel.parameters.behaviours.NumberParameterTypeBehaviour;

/**
 * FIXME Javadoc
 * 
 */
public class NumberParameterType extends NamedElement {

	private final NumberParameterTypeBehaviour numberBehaviour;

	/** The initial value of the parameter. */
	protected final long initialValue;

	/** The unit of the parameter. */
	protected List<Unit> unit = null;

	/**
	 * Constructor of the ParameterType class.
	 * 
	 * @param name
	 *            The name of the container.
	 * @param shortDescription
	 *            A one line description of the container, used for tooltip type information.
	 * @param longDescription
	 *            A detailed description of the container.
	 * @param type
	 *            The simple java type.
	 * @param signed
	 *            Flag indicating whether the type is signed or not.
	 * @param initialValue
	 *            The default value of all parameters of this type.
	 * @param sizeInBits
	 *            The size of the parameters of this type in bits.
	 * @throws InvalidParameterTypeException
	 * 
	 */
	public NumberParameterType(String name, String shortDescription, String longDescription, NumberParameterTypeBehaviour numberType, long initialValue)
			throws InvalidParameterTypeException {
		super(name, shortDescription, longDescription);

		this.numberBehaviour = numberType;
		this.initialValue = initialValue;
	}

	/**
	 * Returns the initial value, i.e. the default value of all parameters of this type.
	 * 
	 * @return long The initial value of the parameters of this type.
	 * 
	 */
	public long getInitialValue() {
		return initialValue;
	}

	/**
	 * Returns the size in bits.
	 * 
	 * @return long The size in bits.
	 * 
	 */
	public long getSizeInBits() {
		return numberBehaviour.getSizeInBits();
	}


	/**
	 * Returns the unit of the type.
	 * 
	 * @return List<Unit> Returns the unit of the type.
	 * 
	 */
	public List<Unit> getUnit() {
		return unit;
	}

	/**
	 * Sets the unit of the type.
	 * 
	 * @param unit
	 *            The units of the type.
	 * 
	 */
	public void setUnit(List<Unit> unit) {
		this.unit = unit;
	}

	/**
	 * Adds a unit to the list of units.
	 * 
	 * @param unit
	 *            The unit of the type.
	 * 
	 */
	public void addUnit(Unit unit) {
		this.unit.add(unit);
	}


	public NumberParameterTypeBehaviour getNumberBehaviour() {
		return numberBehaviour;
	}
}
