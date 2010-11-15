/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.logica.hummingbird.xtce.castor;

/**
 * An entry that is only a portion of a parameter value indicating
 * that the entire parameter value must be assembled from other
 * parameter segments. It is assumed that parameter segments happen
 * sequentially in time, that is the first part if a telemetry
 * parameter first, however (and there's always a however), if this
 * is not the case the order of this parameter segment may be
 * supplied with the order attribute where the first segment
 * order="0".
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ParameterSegmentRefEntryType extends com.logica.hummingbird.xtce.castor.SequenceEntryType 
implements java.io.Serializable
{


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _parameterRef.
     */
    private java.lang.String _parameterRef;

    /**
     * Field _order.
     */
    private long _order;

    /**
     * keeps track of state for field: _order
     */
    private boolean _has_order;

    /**
     * Field _sizeInBits.
     */
    private long _sizeInBits;

    /**
     * keeps track of state for field: _sizeInBits
     */
    private boolean _has_sizeInBits;


      //----------------/
     //- Constructors -/
    //----------------/

    public ParameterSegmentRefEntryType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     */
    public void deleteOrder(
    ) {
        this._has_order= false;
    }

    /**
     */
    public void deleteSizeInBits(
    ) {
        this._has_sizeInBits= false;
    }

    /**
     * Returns the value of field 'order'.
     * 
     * @return the value of field 'Order'.
     */
    public long getOrder(
    ) {
        return this._order;
    }

    /**
     * Returns the value of field 'parameterRef'.
     * 
     * @return the value of field 'ParameterRef'.
     */
    public java.lang.String getParameterRef(
    ) {
        return this._parameterRef;
    }

    /**
     * Returns the value of field 'sizeInBits'.
     * 
     * @return the value of field 'SizeInBits'.
     */
    public long getSizeInBits(
    ) {
        return this._sizeInBits;
    }

    /**
     * Method hasOrder.
     * 
     * @return true if at least one Order has been added
     */
    public boolean hasOrder(
    ) {
        return this._has_order;
    }

    /**
     * Method hasSizeInBits.
     * 
     * @return true if at least one SizeInBits has been added
     */
    public boolean hasSizeInBits(
    ) {
        return this._has_sizeInBits;
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
     * Sets the value of field 'order'.
     * 
     * @param order the value of field 'order'.
     */
    public void setOrder(
            final long order) {
        this._order = order;
        this._has_order = true;
    }

    /**
     * Sets the value of field 'parameterRef'.
     * 
     * @param parameterRef the value of field 'parameterRef'.
     */
    public void setParameterRef(
            final java.lang.String parameterRef) {
        this._parameterRef = parameterRef;
    }

    /**
     * Sets the value of field 'sizeInBits'.
     * 
     * @param sizeInBits the value of field 'sizeInBits'.
     */
    public void setSizeInBits(
            final long sizeInBits) {
        this._sizeInBits = sizeInBits;
        this._has_sizeInBits = true;
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
     * com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntryType
     */
    public static com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntryType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntryType) org.exolab.castor.xml.Unmarshaller.unmarshal(com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntryType.class, reader);
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
