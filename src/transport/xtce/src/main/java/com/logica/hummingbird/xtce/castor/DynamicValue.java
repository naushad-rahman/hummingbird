/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.hbird.xtce.castor;

/**
 * Uses a parameter to for the value. The parameter value may be
 * optionally adjusted by a Linear function or use a series of
 * boolean expressions to lookup the value. Anything more complex
 * and a DynamicValue with a CustomAlgorithm may be used 
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class DynamicValue implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _parameterInstanceRef.
     */
    private org.hbird.xtce.castor.ParameterInstanceRef _parameterInstanceRef;

    /**
     * A slope and intercept may be applied to scale or shift the
     * value of the parameter in the dynamic value
     */
    private org.hbird.xtce.castor.LinearAdjustment _linearAdjustment;


      //----------------/
     //- Constructors -/
    //----------------/

    public DynamicValue() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'linearAdjustment'. The field
     * 'linearAdjustment' has the following description: A slope
     * and intercept may be applied to scale or shift the value of
     * the parameter in the dynamic value
     * 
     * @return the value of field 'LinearAdjustment'.
     */
    public org.hbird.xtce.castor.LinearAdjustment getLinearAdjustment(
    ) {
        return this._linearAdjustment;
    }

    /**
     * Returns the value of field 'parameterInstanceRef'.
     * 
     * @return the value of field 'ParameterInstanceRef'.
     */
    public org.hbird.xtce.castor.ParameterInstanceRef getParameterInstanceRef(
    ) {
        return this._parameterInstanceRef;
    }

    /**
     * Method isValid.
     * 
     * @return true if this object is valid according to the schema
     */
    public boolean isValid(
    ) {
        try {
            validate();
        } catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    }

    /**
     * 
     * 
     * @param out
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void marshal(
            final java.io.Writer out)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, out);
    }

    /**
     * 
     * 
     * @param handler
     * @throws java.io.IOException if an IOException occurs during
     * marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     */
    public void marshal(
            final org.xml.sax.ContentHandler handler)
    throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Marshaller.marshal(this, handler);
    }

    /**
     * Sets the value of field 'linearAdjustment'. The field
     * 'linearAdjustment' has the following description: A slope
     * and intercept may be applied to scale or shift the value of
     * the parameter in the dynamic value
     * 
     * @param linearAdjustment the value of field 'linearAdjustment'
     */
    public void setLinearAdjustment(
            final org.hbird.xtce.castor.LinearAdjustment linearAdjustment) {
        this._linearAdjustment = linearAdjustment;
    }

    /**
     * Sets the value of field 'parameterInstanceRef'.
     * 
     * @param parameterInstanceRef the value of field
     * 'parameterInstanceRef'.
     */
    public void setParameterInstanceRef(
            final org.hbird.xtce.castor.ParameterInstanceRef parameterInstanceRef) {
        this._parameterInstanceRef = parameterInstanceRef;
    }

    /**
     * Method unmarshal.
     * 
     * @param reader
     * @throws org.exolab.castor.xml.MarshalException if object is
     * null or if any SAXException is thrown during marshaling
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     * @return the unmarshaled
     * org.hbird.xtce.castor.DynamicValue
     */
    public static org.hbird.xtce.castor.DynamicValue unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.hbird.xtce.castor.DynamicValue) org.exolab.castor.xml.Unmarshaller.unmarshal(org.hbird.xtce.castor.DynamicValue.class, reader);
    }

    /**
     * 
     * 
     * @throws org.exolab.castor.xml.ValidationException if this
     * object is an invalid instance according to the schema
     */
    public void validate(
    )
    throws org.exolab.castor.xml.ValidationException {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    }

}
