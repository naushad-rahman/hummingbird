/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.3.0.1</a>, using an XML
 * Schema.
 * $Id$
 */

package com.logica.hummingbird.xtce.castor.descriptors;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import com.logica.hummingbird.xtce.castor.CommandContainerEntryListTypeItem;

/**
 * Class CommandContainerEntryListTypeItemDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class CommandContainerEntryListTypeItemDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public CommandContainerEntryListTypeItemDescriptor() {
        super();
        _nsURI = "http://www.omg.org/space/xtce";
        _xmlName = "CommandContainerEntryListType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsChoice();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _parameterRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.ParameterRefEntry.class, "_parameterRefEntry", "ParameterRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getParameterRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setParameterRefEntry( (com.logica.hummingbird.xtce.castor.ParameterRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.ParameterRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.ParameterRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _parameterRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _parameterSegmentRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntry.class, "_parameterSegmentRefEntry", "ParameterSegmentRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getParameterSegmentRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setParameterSegmentRefEntry( (com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.ParameterSegmentRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _parameterSegmentRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _containerRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.ContainerRefEntry.class, "_containerRefEntry", "ContainerRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getContainerRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setContainerRefEntry( (com.logica.hummingbird.xtce.castor.ContainerRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.ContainerRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.ContainerRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _containerRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _containerSegmentRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.ContainerSegmentRefEntry.class, "_containerSegmentRefEntry", "ContainerSegmentRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getContainerSegmentRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setContainerSegmentRefEntry( (com.logica.hummingbird.xtce.castor.ContainerSegmentRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.ContainerSegmentRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.ContainerSegmentRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _containerSegmentRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _streamSegmentEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.StreamSegmentEntry.class, "_streamSegmentEntry", "StreamSegmentEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getStreamSegmentEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setStreamSegmentEntry( (com.logica.hummingbird.xtce.castor.StreamSegmentEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.StreamSegmentEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.StreamSegmentEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _streamSegmentEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _indirectParameterRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.IndirectParameterRefEntry.class, "_indirectParameterRefEntry", "IndirectParameterRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getIndirectParameterRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setIndirectParameterRefEntry( (com.logica.hummingbird.xtce.castor.IndirectParameterRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.IndirectParameterRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.IndirectParameterRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _indirectParameterRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _arrayParameterRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.ArrayParameterRefEntry.class, "_arrayParameterRefEntry", "ArrayParameterRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getArrayParameterRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setArrayParameterRefEntry( (com.logica.hummingbird.xtce.castor.ArrayParameterRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.ArrayParameterRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.ArrayParameterRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _arrayParameterRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _argumentRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.ArgumentRefEntry.class, "_argumentRefEntry", "ArgumentRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getArgumentRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setArgumentRefEntry( (com.logica.hummingbird.xtce.castor.ArgumentRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.ArgumentRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.ArgumentRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _argumentRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _arrayArgumentRefEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.ArrayArgumentRefEntry.class, "_arrayArgumentRefEntry", "ArrayArgumentRefEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getArrayArgumentRefEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setArrayArgumentRefEntry( (com.logica.hummingbird.xtce.castor.ArrayArgumentRefEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.ArrayArgumentRefEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.ArrayArgumentRefEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _arrayArgumentRefEntry
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _fixedValueEntry
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.FixedValueEntry.class, "_fixedValueEntry", "FixedValueEntry", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                return target.getFixedValueEntry();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    CommandContainerEntryListTypeItem target = (CommandContainerEntryListTypeItem) object;
                    target.setFixedValueEntry( (com.logica.hummingbird.xtce.castor.FixedValueEntry) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.FixedValueEntry();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.FixedValueEntry");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _fixedValueEntry
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
        return com.logica.hummingbird.xtce.castor.CommandContainerEntryListTypeItem.class;
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
