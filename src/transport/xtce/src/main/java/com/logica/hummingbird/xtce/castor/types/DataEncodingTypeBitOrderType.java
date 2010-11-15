/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.hbird.xtce.castor.types;

/**
 * Enumeration DataEncodingTypeBitOrderType.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings("serial")
public enum DataEncodingTypeBitOrderType implements java.io.Serializable {


      //------------------/
     //- Enum Constants -/
    //------------------/

    /**
     * Constant LEASTSIGNIFICANTBITFIRST
     */
    LEASTSIGNIFICANTBITFIRST("leastSignificantBitFirst"),
    /**
     * Constant MOSTSIGNIFICANTBITFIRST
     */
    MOSTSIGNIFICANTBITFIRST("mostSignificantBitFirst");

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field value.
     */
    private final java.lang.String value;


      //----------------/
     //- Constructors -/
    //----------------/

    private DataEncodingTypeBitOrderType(final java.lang.String value) {
        this.value = value;
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method fromValue.
     * 
     * @param value
     * @return the constant for this value
     */
    public static org.hbird.xtce.castor.types.DataEncodingTypeBitOrderType fromValue(
            final java.lang.String value) {
        for (DataEncodingTypeBitOrderType c: DataEncodingTypeBitOrderType.values()) {
            if (c.value.equals(value)) {
                return c;
            }
        }
        throw new IllegalArgumentException(value);
    }

    /**
     * 
     * 
     * @param value
     */
    public void setValue(
            final java.lang.String value) {
    }

    /**
     * Method toString.
     * 
     * @return the value of this constant
     */
    public java.lang.String toString(
    ) {
        return this.value;
    }

    /**
     * Method value.
     * 
     * @return the value of this constant
     */
    public java.lang.String value(
    ) {
        return this.value;
    }

}
