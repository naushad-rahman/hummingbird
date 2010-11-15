/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.logica.hummingbird.xtce.castor;

/**
 * Class ContextAlarmList.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class CommandMetaDataTypeArgumentTypeSetIntegerArgumentTypeContextAlarmList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _contextAlarmList.
     */
    private java.util.List<com.logica.hummingbird.xtce.castor.ContextAlarm> _contextAlarmList;


      //----------------/
     //- Constructors -/
    //----------------/

    public CommandMetaDataTypeArgumentTypeSetIntegerArgumentTypeContextAlarmList() {
        super();
        this._contextAlarmList = new java.util.ArrayList<com.logica.hummingbird.xtce.castor.ContextAlarm>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vContextAlarm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContextAlarm(
            final com.logica.hummingbird.xtce.castor.ContextAlarm vContextAlarm)
    throws java.lang.IndexOutOfBoundsException {
        this._contextAlarmList.add(vContextAlarm);
    }

    /**
     * 
     * 
     * @param index
     * @param vContextAlarm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addContextAlarm(
            final int index,
            final com.logica.hummingbird.xtce.castor.ContextAlarm vContextAlarm)
    throws java.lang.IndexOutOfBoundsException {
        this._contextAlarmList.add(index, vContextAlarm);
    }

    /**
     * Method enumerateContextAlarm.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends com.logica.hummingbird.xtce.castor.ContextAlarm> enumerateContextAlarm(
    ) {
        return java.util.Collections.enumeration(this._contextAlarmList);
    }

    /**
     * Method getContextAlarm.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.logica.hummingbird.xtce.castor.ContextAlarm at the given
     * index
     */
    public com.logica.hummingbird.xtce.castor.ContextAlarm getContextAlarm(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contextAlarmList.size()) {
            throw new IndexOutOfBoundsException("getContextAlarm: Index value '" + index + "' not in range [0.." + (this._contextAlarmList.size() - 1) + "]");
        }

        return (com.logica.hummingbird.xtce.castor.ContextAlarm) _contextAlarmList.get(index);
    }

    /**
     * Method getContextAlarm.Returns the contents of the
     * collection in an Array.  <p>Note:  Just in case the
     * collection contents are changing in another thread, we pass
     * a 0-length Array of the correct type into the API call. 
     * This way we <i>know</i> that the Array returned is of
     * exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.logica.hummingbird.xtce.castor.ContextAlarm[] getContextAlarm(
    ) {
        com.logica.hummingbird.xtce.castor.ContextAlarm[] array = new com.logica.hummingbird.xtce.castor.ContextAlarm[0];
        return (com.logica.hummingbird.xtce.castor.ContextAlarm[]) this._contextAlarmList.toArray(array);
    }

    /**
     * Method getContextAlarmCount.
     * 
     * @return the size of this collection
     */
    public int getContextAlarmCount(
    ) {
        return this._contextAlarmList.size();
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
     * Method iterateContextAlarm.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends com.logica.hummingbird.xtce.castor.ContextAlarm> iterateContextAlarm(
    ) {
        return this._contextAlarmList.iterator();
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
     */
    public void removeAllContextAlarm(
    ) {
        this._contextAlarmList.clear();
    }

    /**
     * Method removeContextAlarm.
     * 
     * @param vContextAlarm
     * @return true if the object was removed from the collection.
     */
    public boolean removeContextAlarm(
            final com.logica.hummingbird.xtce.castor.ContextAlarm vContextAlarm) {
        boolean removed = _contextAlarmList.remove(vContextAlarm);
        return removed;
    }

    /**
     * Method removeContextAlarmAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.logica.hummingbird.xtce.castor.ContextAlarm removeContextAlarmAt(
            final int index) {
        java.lang.Object obj = this._contextAlarmList.remove(index);
        return (com.logica.hummingbird.xtce.castor.ContextAlarm) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vContextAlarm
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setContextAlarm(
            final int index,
            final com.logica.hummingbird.xtce.castor.ContextAlarm vContextAlarm)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._contextAlarmList.size()) {
            throw new IndexOutOfBoundsException("setContextAlarm: Index value '" + index + "' not in range [0.." + (this._contextAlarmList.size() - 1) + "]");
        }

        this._contextAlarmList.set(index, vContextAlarm);
    }

    /**
     * 
     * 
     * @param vContextAlarmArray
     */
    public void setContextAlarm(
            final com.logica.hummingbird.xtce.castor.ContextAlarm[] vContextAlarmArray) {
        //-- copy array
        _contextAlarmList.clear();

        for (int i = 0; i < vContextAlarmArray.length; i++) {
                this._contextAlarmList.add(vContextAlarmArray[i]);
        }
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
     * com.logica.hummingbird.xtce.castor.CommandMetaDataTypeArgumentTypeSetIntegerArgumentTypeContextAlarmList
     */
    public static com.logica.hummingbird.xtce.castor.CommandMetaDataTypeArgumentTypeSetIntegerArgumentTypeContextAlarmList unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.logica.hummingbird.xtce.castor.CommandMetaDataTypeArgumentTypeSetIntegerArgumentTypeContextAlarmList) org.exolab.castor.xml.Unmarshaller.unmarshal(com.logica.hummingbird.xtce.castor.CommandMetaDataTypeArgumentTypeSetIntegerArgumentTypeContextAlarmList.class, reader);
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
