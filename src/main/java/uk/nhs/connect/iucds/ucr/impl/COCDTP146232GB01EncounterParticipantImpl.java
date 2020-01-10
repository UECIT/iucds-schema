/*
 * XML Type:  COCD_TP146232GB01.EncounterParticipant
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML COCD_TP146232GB01.EncounterParticipant(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class COCDTP146232GB01EncounterParticipantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant
{
    private static final long serialVersionUID = 1L;
    
    public COCDTP146232GB01EncounterParticipantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTID$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName TEMPLATEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName TIME$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "time");
    private static final javax.xml.namespace.QName COCDTP145210GB01ASSIGNEDENTITY$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145210GB01.AssignedEntity");
    private static final javax.xml.namespace.QName COCDTP145212GB02WORKGROUP$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145212GB02.Workgroup");
    private static final javax.xml.namespace.QName NULLFLAVOR$10 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$12 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName TYPECODE$14 = 
        new javax.xml.namespace.QName("", "typeCode");
    
    
    /**
     * Gets the "contentId" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.TemplateContent getContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.TemplateContent target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.TemplateContent)get_store().find_element_user(CONTENTID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "contentId" element
     */
    public void setContentId(uk.nhs.connect.npfit.hl7.localisation.TemplateContent contentId)
    {
        generatedSetterHelperImpl(contentId, CONTENTID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contentId" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.TemplateContent addNewContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.TemplateContent target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.TemplateContent)get_store().add_element_user(CONTENTID$0);
            return target;
        }
    }
    
    /**
     * Gets the "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId getTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId)get_store().find_element_user(TEMPLATEID$2, 0);
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
    public void setTemplateId(uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId templateId)
    {
        generatedSetterHelperImpl(templateId, TEMPLATEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId addNewTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId)get_store().add_element_user(TEMPLATEID$2);
            return target;
        }
    }
    
    /**
     * Gets the "time" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().find_element_user(TIME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "time" element
     */
    public boolean isSetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TIME$4) != 0;
        }
    }
    
    /**
     * Sets the "time" element
     */
    public void setTime(uk.nhs.connect.iucds.ucr.IVLTS time)
    {
        generatedSetterHelperImpl(time, TIME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "time" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().add_element_user(TIME$4);
            return target;
        }
    }
    
    /**
     * Unsets the "time" element
     */
    public void unsetTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TIME$4, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145210GB01.AssignedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity getCOCDTP145210GB01AssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity)get_store().find_element_user(COCDTP145210GB01ASSIGNEDENTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145210GB01.AssignedEntity" element
     */
    public boolean isSetCOCDTP145210GB01AssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145210GB01ASSIGNEDENTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145210GB01.AssignedEntity" element
     */
    public void setCOCDTP145210GB01AssignedEntity(uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity cocdtp145210GB01AssignedEntity)
    {
        generatedSetterHelperImpl(cocdtp145210GB01AssignedEntity, COCDTP145210GB01ASSIGNEDENTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145210GB01.AssignedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity addNewCOCDTP145210GB01AssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity)get_store().add_element_user(COCDTP145210GB01ASSIGNEDENTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145210GB01.AssignedEntity" element
     */
    public void unsetCOCDTP145210GB01AssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145210GB01ASSIGNEDENTITY$6, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145212GB02.Workgroup" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup getCOCDTP145212GB02Workgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup)get_store().find_element_user(COCDTP145212GB02WORKGROUP$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145212GB02.Workgroup" element
     */
    public boolean isSetCOCDTP145212GB02Workgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145212GB02WORKGROUP$8) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145212GB02.Workgroup" element
     */
    public void setCOCDTP145212GB02Workgroup(uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup cocdtp145212GB02Workgroup)
    {
        generatedSetterHelperImpl(cocdtp145212GB02Workgroup, COCDTP145212GB02WORKGROUP$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145212GB02.Workgroup" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup addNewCOCDTP145212GB02Workgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup)get_store().add_element_user(COCDTP145212GB02WORKGROUP$8);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145212GB02.Workgroup" element
     */
    public void unsetCOCDTP145212GB02Workgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145212GB02WORKGROUP$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$10);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$10);
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
            return get_store().find_attribute_user(NULLFLAVOR$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$10);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$10);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$10);
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
            get_store().remove_attribute(NULLFLAVOR$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$12);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$12);
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
            return get_store().find_attribute_user(UPDATEMODE$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$12);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$12);
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
            get_store().remove_attribute(UPDATEMODE$12);
        }
    }
    
    /**
     * Gets the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.ucr.XEncounterParticipant.Enum getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.XEncounterParticipant.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.ucr.XEncounterParticipant xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.XEncounterParticipant target = null;
            target = (uk.nhs.connect.iucds.ucr.XEncounterParticipant)get_store().find_attribute_user(TYPECODE$14);
            return target;
        }
    }
    
    /**
     * Sets the "typeCode" attribute
     */
    public void setTypeCode(uk.nhs.connect.iucds.ucr.XEncounterParticipant.Enum typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$14);
            }
            target.setEnumValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(uk.nhs.connect.iucds.ucr.XEncounterParticipant typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.XEncounterParticipant target = null;
            target = (uk.nhs.connect.iucds.ucr.XEncounterParticipant)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.XEncounterParticipant)get_store().add_attribute_user(TYPECODE$14);
            }
            target.set(typeCode);
        }
    }
    /**
     * An XML templateId(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class TemplateIdImpl extends uk.nhs.connect.iucds.ucr.impl.IIImpl implements uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId
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
        public static class RootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId.Root, uk.nhs.connect.iucds.ucr.Oid, uk.nhs.connect.iucds.ucr.Uuid, uk.nhs.connect.iucds.ucr.Ruid
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
         * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant$TemplateId$Extension.
         */
        public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.COCDTP146232GB01EncounterParticipant.TemplateId.Extension
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
