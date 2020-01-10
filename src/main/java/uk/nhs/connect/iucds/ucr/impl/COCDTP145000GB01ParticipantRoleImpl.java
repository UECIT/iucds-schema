/*
 * XML Type:  COCD_TP145000GB01.ParticipantRole
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML COCD_TP145000GB01.ParticipantRole(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class COCDTP145000GB01ParticipantRoleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole
{
    private static final long serialVersionUID = 1L;
    
    public COCDTP145000GB01ParticipantRoleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName TEMPLATEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName PLAYINGDEVICE$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "playingDevice");
    private static final javax.xml.namespace.QName NULLFLAVOR$6 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$8 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName CLASSCODE$10 = 
        new javax.xml.namespace.QName("", "classCode");
    
    
    /**
     * Gets the "code" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId getTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId)get_store().find_element_user(TEMPLATEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "templateId" element
     */
    public void setTemplateId(uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId templateId)
    {
        generatedSetterHelperImpl(templateId, TEMPLATEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId addNewTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId)get_store().add_element_user(TEMPLATEID$2);
            return target;
        }
    }
    
    /**
     * Gets the "playingDevice" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145000GB01Device getPlayingDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145000GB01Device target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145000GB01Device)get_store().find_element_user(PLAYINGDEVICE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "playingDevice" element
     */
    public void setPlayingDevice(uk.nhs.connect.iucds.ucr.COCDTP145000GB01Device playingDevice)
    {
        generatedSetterHelperImpl(playingDevice, PLAYINGDEVICE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "playingDevice" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145000GB01Device addNewPlayingDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145000GB01Device target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145000GB01Device)get_store().add_element_user(PLAYINGDEVICE$4);
            return target;
        }
    }
    
    /**
     * Gets the "nullFlavor" attribute
     */
    public java.lang.String getNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    public uk.nhs.connect.iucds.ucr.NullFlavor xgetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$6);
            return target;
        }
    }
    
    /**
     * True if has "nullFlavor" attribute
     */
    public boolean isSetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NULLFLAVOR$6) != null;
        }
    }
    
    /**
     * Sets the "nullFlavor" attribute
     */
    public void setNullFlavor(java.lang.String nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$6);
            }
            target.setStringValue(nullFlavor);
        }
    }
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    public void xsetNullFlavor(uk.nhs.connect.iucds.ucr.NullFlavor nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$6);
            }
            target.set(nullFlavor);
        }
    }
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    public void unsetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NULLFLAVOR$6);
        }
    }
    
    /**
     * Gets the "updateMode" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum getUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$8);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "updateMode" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsUpdateMode xgetUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsUpdateMode target = null;
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$8);
            return target;
        }
    }
    
    /**
     * True if has "updateMode" attribute
     */
    public boolean isSetUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UPDATEMODE$8) != null;
        }
    }
    
    /**
     * Sets the "updateMode" attribute
     */
    public void setUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum updateMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$8);
            }
            target.setEnumValue(updateMode);
        }
    }
    
    /**
     * Sets (as xml) the "updateMode" attribute
     */
    public void xsetUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode updateMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsUpdateMode target = null;
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$8);
            }
            target.set(updateMode);
        }
    }
    
    /**
     * Unsets the "updateMode" attribute
     */
    public void unsetUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UPDATEMODE$8);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public java.lang.String getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public uk.nhs.connect.iucds.ucr.Cs2 xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$10);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(CLASSCODE$10);
            }
            return target;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(java.lang.String classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$10);
            }
            target.setStringValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(uk.nhs.connect.iucds.ucr.Cs2 classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$10);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(CLASSCODE$10);
            }
            target.set(classCode);
        }
    }
    /**
     * An XML code(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class CodeImpl extends uk.nhs.connect.iucds.ucr.impl.CVImpl implements uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.Code
    {
        private static final long serialVersionUID = 1L;
        
        public CodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName CODESYSTEM$2 = 
            new javax.xml.namespace.QName("", "codeSystem");
        
        
        /**
         * Gets the "code" attribute
         */
        public java.lang.String getCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODE$0);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "code" attribute
         */
        public uk.nhs.connect.iucds.ucr.Cs2 xgetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Cs2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(CODE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "code" attribute
         */
        public boolean isSetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODE$0) != null;
            }
        }
        
        /**
         * Sets the "code" attribute
         */
        public void setCode(java.lang.String code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$0);
                }
                target.setStringValue(code);
            }
        }
        
        /**
         * Sets (as xml) the "code" attribute
         */
        public void xsetCode(uk.nhs.connect.iucds.ucr.Cs2 code)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Cs2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CODE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(CODE$0);
                }
                target.set(code);
            }
        }
        
        /**
         * Unsets the "code" attribute
         */
        public void unsetCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODE$0);
            }
        }
        
        /**
         * Gets the "codeSystem" attribute
         */
        public java.lang.String getCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODESYSTEM$2);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "codeSystem" attribute
         */
        public uk.nhs.connect.iucds.ucr.Uid xgetCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Uid target = null;
                target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$2);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Uid)get_default_attribute_value(CODESYSTEM$2);
                }
                return target;
            }
        }
        
        /**
         * True if has "codeSystem" attribute
         */
        public boolean isSetCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODESYSTEM$2) != null;
            }
        }
        
        /**
         * Sets the "codeSystem" attribute
         */
        public void setCodeSystem(java.lang.String codeSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$2);
                }
                target.setStringValue(codeSystem);
            }
        }
        
        /**
         * Sets (as xml) the "codeSystem" attribute
         */
        public void xsetCodeSystem(uk.nhs.connect.iucds.ucr.Uid codeSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Uid target = null;
                target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$2);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Uid)get_store().add_attribute_user(CODESYSTEM$2);
                }
                target.set(codeSystem);
            }
        }
        
        /**
         * Unsets the "codeSystem" attribute
         */
        public void unsetCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODESYSTEM$2);
            }
        }
    }
    /**
     * An XML templateId(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class TemplateIdImpl extends uk.nhs.connect.iucds.ucr.impl.IIImpl implements uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId
    {
        private static final long serialVersionUID = 1L;
        
        public TemplateIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("", "root");
        private static final javax.xml.namespace.QName EXTENSION$2 = 
            new javax.xml.namespace.QName("", "extension");
        
        
        /**
         * Gets the "root" attribute
         */
        public java.lang.String getRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "root" attribute
         */
        public uk.nhs.connect.iucds.ucr.Uid xgetRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Uid target = null;
                target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(ROOT$0);
                return target;
            }
        }
        
        /**
         * True if has "root" attribute
         */
        public boolean isSetRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROOT$0) != null;
            }
        }
        
        /**
         * Sets the "root" attribute
         */
        public void setRoot(java.lang.String root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOT$0);
                }
                target.setStringValue(root);
            }
        }
        
        /**
         * Sets (as xml) the "root" attribute
         */
        public void xsetRoot(uk.nhs.connect.iucds.ucr.Uid root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Uid target = null;
                target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(ROOT$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Uid)get_store().add_attribute_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Unsets the "root" attribute
         */
        public void unsetRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROOT$0);
            }
        }
        
        /**
         * Gets the "extension" attribute
         */
        public java.lang.String getExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extension" attribute
         */
        public uk.nhs.connect.iucds.ucr.St2 xgetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.St2 target = null;
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(EXTENSION$2);
                return target;
            }
        }
        
        /**
         * True if has "extension" attribute
         */
        public boolean isSetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENSION$2) != null;
            }
        }
        
        /**
         * Sets the "extension" attribute
         */
        public void setExtension(java.lang.String extension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENSION$2);
                }
                target.setStringValue(extension);
            }
        }
        
        /**
         * Sets (as xml) the "extension" attribute
         */
        public void xsetExtension(uk.nhs.connect.iucds.ucr.St2 extension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.St2 target = null;
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(EXTENSION$2);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.St2)get_store().add_attribute_user(EXTENSION$2);
                }
                target.set(extension);
            }
        }
        
        /**
         * Unsets the "extension" attribute
         */
        public void unsetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENSION$2);
            }
        }
        /**
         * An XML root(@).
         *
         * This is a union type. Instances are of one of the following types:
         *     uk.nhs.connect.iucds.ucr.Oid
         *     uk.nhs.connect.iucds.ucr.Uuid
         *     uk.nhs.connect.iucds.ucr.Ruid
         */
        public static class RootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId.Root, uk.nhs.connect.iucds.ucr.Oid, uk.nhs.connect.iucds.ucr.Uuid, uk.nhs.connect.iucds.ucr.Ruid
        {
            private static final long serialVersionUID = 1L;
            
            public RootImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RootImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML extension(@).
         *
         * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole$TemplateId$Extension.
         */
        public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.COCDTP145000GB01ParticipantRole.TemplateId.Extension
        {
            private static final long serialVersionUID = 1L;
            
            public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ExtensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
