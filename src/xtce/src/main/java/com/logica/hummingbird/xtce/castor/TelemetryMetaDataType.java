/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.logica.hummingbird.xtce.castor;

/**
 * All the data about telemetry is contained in TelemetryMetaData
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class TelemetryMetaDataType implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * A list of parameter types
     */
    private com.logica.hummingbird.xtce.castor.ParameterTypeSet _parameterTypeSet;

    /**
     * A list of Parameters for this Space System. 
     */
    private com.logica.hummingbird.xtce.castor.ParameterSet _parameterSet;

    /**
     * Holds the list of all potential container definitions for
     * telemetry. Containers may parts of packets or TDM, and then
     * groups of the containers, and then an entire entity -- such
     * as a packet. In order to maximize re-used for duplication,
     * the pieces may defined once here, and then assembled as
     * needed into larger structures, also here.
     */
    private com.logica.hummingbird.xtce.castor.ContainerSet _containerSet;

    /**
     * Messages are an alternative method of uniquely identifying
     * containers within a Service. A message provides a test in
     * the form of MatchCriteria to match to a container. A simple
     * example might be: [When minorframeID=21, the message is the
     * 21st minorframe container. The collection of messages to
     * search thru will be bound by a Service.
     */
    private com.logica.hummingbird.xtce.castor.MessageSet _messageSet;

    /**
     * Field _streamSet.
     */
    private com.logica.hummingbird.xtce.castor.StreamSet _streamSet;

    /**
     * Field _algorithmSet.
     */
    private com.logica.hummingbird.xtce.castor.AlgorithmSet _algorithmSet;


      //----------------/
     //- Constructors -/
    //----------------/

    public TelemetryMetaDataType() {
        super();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Returns the value of field 'algorithmSet'.
     * 
     * @return the value of field 'AlgorithmSet'.
     */
    public com.logica.hummingbird.xtce.castor.AlgorithmSet getAlgorithmSet(
    ) {
        return this._algorithmSet;
    }

    /**
     * Returns the value of field 'containerSet'. The field
     * 'containerSet' has the following description: Holds the list
     * of all potential container definitions for telemetry.
     * Containers may parts of packets or TDM, and then groups of
     * the containers, and then an entire entity -- such as a
     * packet. In order to maximize re-used for duplication, the
     * pieces may defined once here, and then assembled as needed
     * into larger structures, also here.
     * 
     * @return the value of field 'ContainerSet'.
     */
    public com.logica.hummingbird.xtce.castor.ContainerSet getContainerSet(
    ) {
        return this._containerSet;
    }

    /**
     * Returns the value of field 'messageSet'. The field
     * 'messageSet' has the following description: Messages are an
     * alternative method of uniquely identifying containers within
     * a Service. A message provides a test in the form of
     * MatchCriteria to match to a container. A simple example
     * might be: [When minorframeID=21, the message is the 21st
     * minorframe container. The collection of messages to search
     * thru will be bound by a Service.
     * 
     * @return the value of field 'MessageSet'.
     */
    public com.logica.hummingbird.xtce.castor.MessageSet getMessageSet(
    ) {
        return this._messageSet;
    }

    /**
     * Returns the value of field 'parameterSet'. The field
     * 'parameterSet' has the following description: A list of
     * Parameters for this Space System. 
     * 
     * @return the value of field 'ParameterSet'.
     */
    public com.logica.hummingbird.xtce.castor.ParameterSet getParameterSet(
    ) {
        return this._parameterSet;
    }

    /**
     * Returns the value of field 'parameterTypeSet'. The field
     * 'parameterTypeSet' has the following description: A list of
     * parameter types
     * 
     * @return the value of field 'ParameterTypeSet'.
     */
    public com.logica.hummingbird.xtce.castor.ParameterTypeSet getParameterTypeSet(
    ) {
        return this._parameterTypeSet;
    }

    /**
     * Returns the value of field 'streamSet'.
     * 
     * @return the value of field 'StreamSet'.
     */
    public com.logica.hummingbird.xtce.castor.StreamSet getStreamSet(
    ) {
        return this._streamSet;
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
     * Sets the value of field 'algorithmSet'.
     * 
     * @param algorithmSet the value of field 'algorithmSet'.
     */
    public void setAlgorithmSet(
            final com.logica.hummingbird.xtce.castor.AlgorithmSet algorithmSet) {
        this._algorithmSet = algorithmSet;
    }

    /**
     * Sets the value of field 'containerSet'. The field
     * 'containerSet' has the following description: Holds the list
     * of all potential container definitions for telemetry.
     * Containers may parts of packets or TDM, and then groups of
     * the containers, and then an entire entity -- such as a
     * packet. In order to maximize re-used for duplication, the
     * pieces may defined once here, and then assembled as needed
     * into larger structures, also here.
     * 
     * @param containerSet the value of field 'containerSet'.
     */
    public void setContainerSet(
            final com.logica.hummingbird.xtce.castor.ContainerSet containerSet) {
        this._containerSet = containerSet;
    }

    /**
     * Sets the value of field 'messageSet'. The field 'messageSet'
     * has the following description: Messages are an alternative
     * method of uniquely identifying containers within a Service.
     * A message provides a test in the form of MatchCriteria to
     * match to a container. A simple example might be: [When
     * minorframeID=21, the message is the 21st minorframe
     * container. The collection of messages to search thru will be
     * bound by a Service.
     * 
     * @param messageSet the value of field 'messageSet'.
     */
    public void setMessageSet(
            final com.logica.hummingbird.xtce.castor.MessageSet messageSet) {
        this._messageSet = messageSet;
    }

    /**
     * Sets the value of field 'parameterSet'. The field
     * 'parameterSet' has the following description: A list of
     * Parameters for this Space System. 
     * 
     * @param parameterSet the value of field 'parameterSet'.
     */
    public void setParameterSet(
            final com.logica.hummingbird.xtce.castor.ParameterSet parameterSet) {
        this._parameterSet = parameterSet;
    }

    /**
     * Sets the value of field 'parameterTypeSet'. The field
     * 'parameterTypeSet' has the following description: A list of
     * parameter types
     * 
     * @param parameterTypeSet the value of field 'parameterTypeSet'
     */
    public void setParameterTypeSet(
            final com.logica.hummingbird.xtce.castor.ParameterTypeSet parameterTypeSet) {
        this._parameterTypeSet = parameterTypeSet;
    }

    /**
     * Sets the value of field 'streamSet'.
     * 
     * @param streamSet the value of field 'streamSet'.
     */
    public void setStreamSet(
            final com.logica.hummingbird.xtce.castor.StreamSet streamSet) {
        this._streamSet = streamSet;
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
     * com.logica.hummingbird.xtce.castor.TelemetryMetaDataType
     */
    public static com.logica.hummingbird.xtce.castor.TelemetryMetaDataType unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.logica.hummingbird.xtce.castor.TelemetryMetaDataType) org.exolab.castor.xml.Unmarshaller.unmarshal(com.logica.hummingbird.xtce.castor.TelemetryMetaDataType.class, reader);
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
