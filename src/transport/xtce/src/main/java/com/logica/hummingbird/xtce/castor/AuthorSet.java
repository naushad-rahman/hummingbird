/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.hbird.xtce.castor;

/**
 * Class AuthorSet.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public class AuthorSet implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _authorList.
     */
    private java.util.List<java.lang.String> _authorList;


      //----------------/
     //- Constructors -/
    //----------------/

    public AuthorSet() {
        super();
        this._authorList = new java.util.ArrayList<java.lang.String>();
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * 
     * 
     * @param vAuthor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAuthor(
            final java.lang.String vAuthor)
    throws java.lang.IndexOutOfBoundsException {
        this._authorList.add(vAuthor);
    }

    /**
     * 
     * 
     * @param index
     * @param vAuthor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void addAuthor(
            final int index,
            final java.lang.String vAuthor)
    throws java.lang.IndexOutOfBoundsException {
        this._authorList.add(index, vAuthor);
    }

    /**
     * Method enumerateAuthor.
     * 
     * @return an Enumeration over all possible elements of this
     * collection
     */
    public java.util.Enumeration<? extends java.lang.String> enumerateAuthor(
    ) {
        return java.util.Collections.enumeration(this._authorList);
    }

    /**
     * Method getAuthor.
     * 
     * @param index
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     * @return the value of the java.lang.String at the given index
     */
    public java.lang.String getAuthor(
            final int index)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._authorList.size()) {
            throw new IndexOutOfBoundsException("getAuthor: Index value '" + index + "' not in range [0.." + (this._authorList.size() - 1) + "]");
        }

        return (java.lang.String) _authorList.get(index);
    }

    /**
     * Method getAuthor.Returns the contents of the collection in
     * an Array.  <p>Note:  Just in case the collection contents
     * are changing in another thread, we pass a 0-length Array of
     * the correct type into the API call.  This way we <i>know</i>
     * that the Array returned is of exactly the correct length.
     * 
     * @return this collection as an Array
     */
    public java.lang.String[] getAuthor(
    ) {
        java.lang.String[] array = new java.lang.String[0];
        return (java.lang.String[]) this._authorList.toArray(array);
    }

    /**
     * Method getAuthorCount.
     * 
     * @return the size of this collection
     */
    public int getAuthorCount(
    ) {
        return this._authorList.size();
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
     * Method iterateAuthor.
     * 
     * @return an Iterator over all possible elements in this
     * collection
     */
    public java.util.Iterator<? extends java.lang.String> iterateAuthor(
    ) {
        return this._authorList.iterator();
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
    public void removeAllAuthor(
    ) {
        this._authorList.clear();
    }

    /**
     * Method removeAuthor.
     * 
     * @param vAuthor
     * @return true if the object was removed from the collection.
     */
    public boolean removeAuthor(
            final java.lang.String vAuthor) {
        boolean removed = _authorList.remove(vAuthor);
        return removed;
    }

    /**
     * Method removeAuthorAt.
     * 
     * @param index
     * @return the element removed from the collection
     */
    public java.lang.String removeAuthorAt(
            final int index) {
        java.lang.Object obj = this._authorList.remove(index);
        return (java.lang.String) obj;
    }

    /**
     * 
     * 
     * @param index
     * @param vAuthor
     * @throws java.lang.IndexOutOfBoundsException if the index
     * given is outside the bounds of the collection
     */
    public void setAuthor(
            final int index,
            final java.lang.String vAuthor)
    throws java.lang.IndexOutOfBoundsException {
        // check bounds for index
        if (index < 0 || index >= this._authorList.size()) {
            throw new IndexOutOfBoundsException("setAuthor: Index value '" + index + "' not in range [0.." + (this._authorList.size() - 1) + "]");
        }

        this._authorList.set(index, vAuthor);
    }

    /**
     * 
     * 
     * @param vAuthorArray
     */
    public void setAuthor(
            final java.lang.String[] vAuthorArray) {
        //-- copy array
        _authorList.clear();

        for (int i = 0; i < vAuthorArray.length; i++) {
                this._authorList.add(vAuthorArray[i]);
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
     * org.hbird.xtce.castor.AuthorSet
     */
    public static org.hbird.xtce.castor.AuthorSet unmarshal(
            final java.io.Reader reader)
    throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException {
        return (org.hbird.xtce.castor.AuthorSet) org.exolab.castor.xml.Unmarshaller.unmarshal(org.hbird.xtce.castor.AuthorSet.class, reader);
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
