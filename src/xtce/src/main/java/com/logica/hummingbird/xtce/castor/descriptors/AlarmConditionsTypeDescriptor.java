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

import com.logica.hummingbird.xtce.castor.AlarmConditionsType;

/**
 * Class AlarmConditionsTypeDescriptor.
 * 
 * @version $Revision$ $Date$
 */
public class AlarmConditionsTypeDescriptor extends org.exolab.castor.xml.util.XMLClassDescriptorImpl {


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

    public AlarmConditionsTypeDescriptor() {
        super();
        _nsURI = "http://www.omg.org/space/xtce";
        _xmlName = "AlarmConditionsType";
        _elementDefinition = false;

        //-- set grouping compositor
        setCompositorAsSequence();
        org.exolab.castor.xml.util.XMLFieldDescriptorImpl  desc           = null;
        org.exolab.castor.mapping.FieldHandler             handler        = null;
        org.exolab.castor.xml.FieldValidator               fieldValidator = null;
        //-- initialize attribute descriptors

        //-- initialize element descriptors

        //-- _watchAlarm
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.WatchAlarm.class, "_watchAlarm", "WatchAlarm", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AlarmConditionsType target = (AlarmConditionsType) object;
                return target.getWatchAlarm();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AlarmConditionsType target = (AlarmConditionsType) object;
                    target.setWatchAlarm( (com.logica.hummingbird.xtce.castor.WatchAlarm) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.WatchAlarm();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.WatchAlarm");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _watchAlarm
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _warningAlarm
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.WarningAlarm.class, "_warningAlarm", "WarningAlarm", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AlarmConditionsType target = (AlarmConditionsType) object;
                return target.getWarningAlarm();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AlarmConditionsType target = (AlarmConditionsType) object;
                    target.setWarningAlarm( (com.logica.hummingbird.xtce.castor.WarningAlarm) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.WarningAlarm();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.WarningAlarm");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _warningAlarm
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _distressAlarm
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.DistressAlarm.class, "_distressAlarm", "DistressAlarm", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AlarmConditionsType target = (AlarmConditionsType) object;
                return target.getDistressAlarm();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AlarmConditionsType target = (AlarmConditionsType) object;
                    target.setDistressAlarm( (com.logica.hummingbird.xtce.castor.DistressAlarm) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.DistressAlarm();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.DistressAlarm");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _distressAlarm
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _critialAlarm
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.CritialAlarm.class, "_critialAlarm", "CritialAlarm", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AlarmConditionsType target = (AlarmConditionsType) object;
                return target.getCritialAlarm();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AlarmConditionsType target = (AlarmConditionsType) object;
                    target.setCritialAlarm( (com.logica.hummingbird.xtce.castor.CritialAlarm) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.CritialAlarm();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.CritialAlarm");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _critialAlarm
        fieldValidator = new org.exolab.castor.xml.FieldValidator();
        { //-- local scope
        }
        desc.setValidator(fieldValidator);
        //-- _severeAlarm
        desc = new org.exolab.castor.xml.util.XMLFieldDescriptorImpl(com.logica.hummingbird.xtce.castor.SevereAlarm.class, "_severeAlarm", "SevereAlarm", org.exolab.castor.xml.NodeType.Element);
        handler = new org.exolab.castor.xml.XMLFieldHandler() {
            @Override
            public java.lang.Object getValue( java.lang.Object object ) 
                throws IllegalStateException
            {
                AlarmConditionsType target = (AlarmConditionsType) object;
                return target.getSevereAlarm();
            }
            @Override
            public void setValue( java.lang.Object object, java.lang.Object value) 
                throws IllegalStateException, IllegalArgumentException
            {
                try {
                    AlarmConditionsType target = (AlarmConditionsType) object;
                    target.setSevereAlarm( (com.logica.hummingbird.xtce.castor.SevereAlarm) value);
                } catch (java.lang.Exception ex) {
                    throw new IllegalStateException(ex.toString());
                }
            }
            @Override
            @SuppressWarnings("unused")
            public java.lang.Object newInstance(java.lang.Object parent) {
                return new com.logica.hummingbird.xtce.castor.SevereAlarm();
            }
        };
        desc.setSchemaType("com.logica.hummingbird.xtce.castor.SevereAlarm");
        desc.setHandler(handler);
        desc.setNameSpaceURI("http://www.omg.org/space/xtce");
        desc.setMultivalued(false);
        addFieldDescriptor(desc);
        addSequenceElement(desc);

        //-- validation code for: _severeAlarm
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
        return com.logica.hummingbird.xtce.castor.AlarmConditionsType.class;
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
