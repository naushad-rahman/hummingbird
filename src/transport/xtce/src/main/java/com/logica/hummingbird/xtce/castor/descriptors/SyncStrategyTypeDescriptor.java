/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package org.hbird.xtce.castor.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import org.hbird.xtce.castor.SyncStrategyType;

/**
 * Class SyncStrategyTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class SyncStrategyTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _elementDefinition.
     */
    private boolean _elementDefinition;

    /**
     * Field _nsPrefix.
     */
    private java.lang.String _nsPrefix;

    /**
     * Field _nsURI.
     */
    private java.lang.String _nsURI;

    /**
     * Field _xmlName.
     */
    private java.lang.String _xmlName;

    /**
     * Field _identity.
     */
    private org.exolab.castor.xml.XMLFieldDescriptor _identity;


      //----------------/
     //- Constructors -/
    //----------------/

    public SyncStrategyTypeDescriptor() {
        super();
        _nsURI = "http://www.omg.org/space/xtce";
        _xmlName = "SyncStrategyType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- _verifyToLockGoodFrames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Long.TYPE, "_verifyToLockGoodFrames", "verifyToLockGoodFrames", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                SyncStrategyType target = (SyncStrategyType) object;
                if (!target.hasVerifyToLockGoodFrames()) { return null; }
                return new java.lang.Long(target.getVerifyToLockGoodFrames());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    SyncStrategyType target = (SyncStrategyType) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteVerifyToLockGoodFrames();
                        return;
                    }
                    target.setVerifyToLockGoodFrames( ((java.lang.Long) value).longValue());
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("nonNegativeInteger");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _verifyToLockGoodFrames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.LongValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.LongValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(0L);
        }
        desc.setValidator(fieldValidator);
        //-- _checkToLockGoodFrames
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Long.TYPE, "_checkToLockGoodFrames", "checkToLockGoodFrames", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                SyncStrategyType target = (SyncStrategyType) object;
                if (!target.hasCheckToLockGoodFrames()) { return null; }
                return new java.lang.Long(target.getCheckToLockGoodFrames());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    SyncStrategyType target = (SyncStrategyType) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteCheckToLockGoodFrames();
                        return;
                    }
                    target.setCheckToLockGoodFrames( ((java.lang.Long) value).longValue());
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("nonNegativeInteger");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _checkToLockGoodFrames
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.LongValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.LongValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(0L);
        }
        desc.setValidator(fieldValidator);
        //-- _maxBitErrorsInSyncPattern
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(java.lang.Long.TYPE, "_maxBitErrorsInSyncPattern", "maxBitErrorsInSyncPattern", org.exolab.castor.xml.NodeType.Attribute);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                SyncStrategyType target = (SyncStrategyType) object;
                if (!target.hasMaxBitErrorsInSyncPattern()) { return null; }
                return new java.lang.Long(target.getMaxBitErrorsInSyncPattern());
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    SyncStrategyType target = (SyncStrategyType) object;
                    // if null, use delete method for optional primitives 
                    if (value == null) {
                        target.deleteMaxBitErrorsInSyncPattern();
                        return;
                    }
                    target.setMaxBitErrorsInSyncPattern( ((java.lang.Long) value).longValue());
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return null;
            }
        };
        desc.setSchemaType("nonNegativeInteger");
        desc.setHandler(handler);
        desc.setMultivalued(false);
        addFieldDescriptor(desc);

        //-- validation code for: _maxBitErrorsInSyncPattern
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
            org.exolab.castor.xml.validators.LongValidator typeValidator;
            typeValidator = new org.exolab.castor.xml.validators.LongValidator();
            fieldValidator.setValidator(typeValidator);
            typeValidator.setMinInclusive(0L);
        }
        desc.setValidator(fieldValidator);
        //-- initialize element descriptors

        //-- _autoInvert
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(org.hbird.xtce.castor.AutoInvert.class, "_autoInvert", "AutoInvert", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                SyncStrategyType target = (SyncStrategyType) object;
                return target.getAutoInvert();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    SyncStrategyType target = (SyncStrategyType) object;
                    target.setAutoInvert( (org.hbird.xtce.castor.AutoInvert) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new org.hbird.xtce.castor.AutoInvert();
            }
        };
        desc.setSchemaType("org.hbird.xtce.castor.AutoInvert");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _autoInvert
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
    }


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method getAccessMode.
     * 
     * @return the access mode specified for this class.
     */
    @Override()
    public org.exolab.castor.mapping.AccessMode getAccessMode(
    ) {
        return null;
    }

    /**
     * Method getIdentity.
     * 
     * @return the identity field, null if this class has no
     * identity.
     */
    @Override()
    public org.exolab.castor.mapping.FieldDescriptor getIdentity(
    ) {
        return _identity;
    }

    /**
     * Method getJavaClass.
     * 
     * @return the Java class represented by this descriptor.
     */
    @Override()
    public java.lang.Class getJavaClass(
    ) {
        return org.hbird.xtce.castor.SyncStrategyType.class;
    }

    /**
     * Method getNameSpacePrefix.
     * 
     * @return the namespace prefix to use when marshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpacePrefix(
    ) {
        return _nsPrefix;
    }

    /**
     * Method getNameSpaceURI.
     * 
     * @return the namespace URI used when marshaling and
     * unmarshaling as XML.
     */
    @Override()
    public java.lang.String getNameSpaceURI(
    ) {
        return _nsURI;
    }

    /**
     * Method getValidator.
     * 
     * @return a specific validator for the class described by this
     * ClassDescriptor.
     */
    @Override()
    public org.exolab.castor.xml.TypeValidator getValidator(
    ) {
        return this;
    }

    /**
     * Method getXMLName.
     * 
     * @return the XML Name for the Class being described.
     */
    @Override()
    public java.lang.String getXMLName(
    ) {
        return _xmlName;
    }

    /**
     * Method isElementDefinition.
     * 
     * @return true if XML schema definition of this Class is that
     * of a global
     * element or element with anonymous type definition.
     */
    public boolean isElementDefinition(
    ) {
        return _elementDefinition;
    }

}
