/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.logica.hummingbird.xtce.castor;

/**
 * All comparisons must be true
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class ComparisonList implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _comparisonList.
     */
    private java.util.List<com.logica.hummingbird.xtce.castor.Comparison> _comparisonList;


      //----------------/
     //- Constructors -/
    //----------------/

    public ComparisonList() {
        super();
        this._comparisonList = new java.util.ArrayList<com.logica.hummingbird.xtce.castor.Comparison>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vComparison
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComparison(
            final com.logica.hummingbird.xtce.castor.Comparison vComparison)
    throws java.lang.IndexOutOfBoundsException {
        this._comparisonList.add(vComparison);
    }

    /**
     * 
     * 
     * @param index
     * @param vComparison
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addComparison(
            final int index,
            final com.logica.hummingbird.xtce.castor.Comparison vComparison)
    throws java.lang.IndexOutOfBoundsException {
        this._comparisonList.add(index, vComparison);
    }

    /**
     * Method enumerateComparison.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends com.logica.hummingbird.xtce.castor.Comparison> enumerateComparison(
    ) {
        return java.util.Collections.enumeration(this._comparisonList);
    }

    /**
     * Method getComparison.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the
     * com.logica.hummingbird.xtce.castor.Comparison at the given
     * index
     */
    public com.logica.hummingbird.xtce.castor.Comparison getComparison(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._comparisonList.size()) {
            throw new IndexOutOfBoundsException("getComparison: Index value '" + index + "' not in range [0.." + (this._comparisonList.size() - 1) + "]");
        }

        return (com.logica.hummingbird.xtce.castor.Comparison) _comparisonList.get(index);
    }

    /**
     * Method getComparison.Returns the contents of the collection
     * in an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public com.logica.hummingbird.xtce.castor.Comparison[] getComparison(
    ) {
        com.logica.hummingbird.xtce.castor.Comparison[] array = new com.logica.hummingbird.xtce.castor.Comparison[0];
        return (com.logica.hummingbird.xtce.castor.Comparison[]) this._comparisonList.toArray(array);
    }

    /**
     * Method getComparisonCount.
     * 
     * @return the size of this collection
     */
    public int getComparisonCount(
    ) {
        return this._comparisonList.size();
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
     * Method iterateComparison.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends com.logica.hummingbird.xtce.castor.Comparison> iterateComparison(
    ) {
        return this._comparisonList.iterator();
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
    public void removeAllComparison(
    ) {
        this._comparisonList.clear();
    }

    /**
     * Method removeComparison.
     * 
     * @param vComparison
     * @return true if the object was removed from the collection.
     */
    public boolean removeComparison(
            final com.logica.hummingbird.xtce.castor.Comparison vComparison) {
        boolean removed = _comparisonList.remove(vComparison);
        return removed;
    }

    /**
     * Method removeComparisonAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public com.logica.hummingbird.xtce.castor.Comparison removeComparisonAt(
            final int index) {
        java.lang.Object obj = this._comparisonList.remove(index);
        return (com.logica.hummingbird.xtce.castor.Comparison) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vComparison
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setComparison(
            final int index,
            final com.logica.hummingbird.xtce.castor.Comparison vComparison)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._comparisonList.size()) {
            throw new IndexOutOfBoundsException("setComparison: Index value '" + index + "' not in range [0.." + (this._comparisonList.size() - 1) + "]");
        }

        this._comparisonList.set(index, vComparison);
    }

    /**
     * 
     * 
     * @param vComparisonArray
     */
    public void setComparison(
            final com.logica.hummingbird.xtce.castor.Comparison[] vComparisonArray) {
        //-- copy array
        _comparisonList.clear();

        for (int i = 0; i < vComparisonArray.length; i++) {
                this._comparisonList.add(vComparisonArray[i]);
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
     * com.logica.hummingbird.xtce.castor.ComparisonList
     */
    public static com.logica.hummingbird.xtce.castor.ComparisonList unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (com.logica.hummingbird.xtce.castor.ComparisonList) org.exolab.castor.xml.Unmarshaller.unmarshal(com.logica.hummingbird.xtce.castor.ComparisonList.class, reader);
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
