/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.logica.hummingbird.xtce.castor;

/**
 * Class NumericAlarmConditionTypeSequence.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class NumericAlarmConditionTypeSequence implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * StaticAlarmRanges are used to trigger alarms when the
     * parameter value passes some threshold value
     */
    private com.logica.hummingbird.xtce.castor.StaticAlarmRanges _staticAlarmRanges;

    /**
     * ChangePerSecondAlarmRanges are used to trigger alarms when
     * the parameter value's rate-of-change passes some threshold
     * value. An alarm condition that triggers when the value
     * changes too fast (or too slow)
     */
    private com.logica.hummingbird.xtce.castor.ChangePerSecondAlarmRanges _changePerSecondAlarmRanges;


      //----------------/
     //- Constructors -/
    //----------------/

    public NumericAlarmConditionTypeSequence() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'changePerSecondAlarmRanges'. The
     * field 'changePerSecondAlarmRanges' has the following
     * description: ChangePerSecondAlarmRanges are used to trigger
     * alarms when the parameter value's rate-of-change passes some
     * threshold value. An alarm condition that triggers when the
     * value changes too fast (or too slow)
     * 
     * @return the value of field 'ChangePerSecondAlarmRanges'.
     */
    public com.logica.hummingbird.xtce.castor.ChangePerSecondAlarmRanges getChangePerSecondAlarmRanges(
    ) {
        return this._changePerSecondAlarmRanges;
    }

    /**
     * Returns the value of field 'staticAlarmRanges'. The field
     * 'staticAlarmRanges' has the following description:
     * StaticAlarmRanges are used to trigger alarms when the
     * parameter value passes some threshold value
     * 
     * @return the value of field 'StaticAlarmRanges'.
     */
    public com.logica.hummingbird.xtce.castor.StaticAlarmRanges getStaticAlarmRanges(
    ) {
        return this._staticAlarmRanges;
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
     * Sets the value of field 'changePerSecondAlarmRanges'. The
     * field 'changePerSecondAlarmRanges' has the following
     * description: ChangePerSecondAlarmRanges are used to trigger
     * alarms when the parameter value's rate-of-change passes some
     * threshold value. An alarm condition that triggers when the
     * value changes too fast (or too slow)
     * 
     * @param changePerSecondAlarmRanges the value of field
     * 'changePerSecondAlarmRanges'.
     */
    public void setChangePerSecondAlarmRanges(
            final com.logica.hummingbird.xtce.castor.ChangePerSecondAlarmRanges changePerSecondAlarmRanges) {
        this._changePerSecondAlarmRanges = changePerSecondAlarmRanges;
    }

    /**
     * Sets the value of field 'staticAlarmRanges'. The field
     * 'staticAlarmRanges' has the following description:
     * StaticAlarmRanges are used to trigger alarms when the
     * parameter value passes some threshold value
     * 
     * @param staticAlarmRanges the value of field
     * 'staticAlarmRanges'.
     */
    public void setStaticAlarmRanges(
            final com.logica.hummingbird.xtce.castor.StaticAlarmRanges staticAlarmRanges) {
        this._staticAlarmRanges = staticAlarmRanges;
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
     * com.logica.hummingbird.xtce.castor.NumericAlarmConditionTypeSequence
     */
    public static com.logica.hummingbird.xtce.castor.NumericAlarmConditionTypeSequence unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.logica.hummingbird.xtce.castor.NumericAlarmConditionTypeSequence) org.exolab.castor.xml.Unmarshaller.unmarshal(com.logica.hummingbird.xtce.castor.NumericAlarmConditionTypeSequence.class, reader);
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
