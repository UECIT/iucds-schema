/*
 * XML Type:  POCD_MT200001GB02.Participant
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML POCD_MT200001GB02.Participant(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT200001GB02ParticipantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT200001GB02ParticipantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTID$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName FUNCTIONCODE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "functionCode");
    private static final javax.xml.namespace.QName COCDTP145214GB01ASSOCIATEDENTITY$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145214GB01.AssociatedEntity");
    private static final javax.xml.namespace.QName COCDTP145007UK03RELATEDENTITY$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145007UK03.RelatedEntity");
    private static final javax.xml.namespace.QName COCDTP145212GB02WORKGROUP$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145212GB02.Workgroup");
    private static final javax.xml.namespace.QName NULLFLAVOR$10 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$12 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName TYPECODE$14 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONTROLCODE$16 = 
        new javax.xml.namespace.QName("", "contextControlCode");
    
    
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
     * Gets the "functionCode" element
     */
    public uk.nhs.connect.iucds.ucr.CE getFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.ucr.CE)get_store().find_element_user(FUNCTIONCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "functionCode" element
     */
    public boolean isSetFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FUNCTIONCODE$2) != 0;
        }
    }
    
    /**
     * Sets the "functionCode" element
     */
    public void setFunctionCode(uk.nhs.connect.iucds.ucr.CE functionCode)
    {
        generatedSetterHelperImpl(functionCode, FUNCTIONCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "functionCode" element
     */
    public uk.nhs.connect.iucds.ucr.CE addNewFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.ucr.CE)get_store().add_element_user(FUNCTIONCODE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "functionCode" element
     */
    public void unsetFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FUNCTIONCODE$2, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145214GB01.AssociatedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity getCOCDTP145214GB01AssociatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity)get_store().find_element_user(COCDTP145214GB01ASSOCIATEDENTITY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145214GB01.AssociatedEntity" element
     */
    public boolean isSetCOCDTP145214GB01AssociatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145214GB01ASSOCIATEDENTITY$4) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145214GB01.AssociatedEntity" element
     */
    public void setCOCDTP145214GB01AssociatedEntity(uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity cocdtp145214GB01AssociatedEntity)
    {
        generatedSetterHelperImpl(cocdtp145214GB01AssociatedEntity, COCDTP145214GB01ASSOCIATEDENTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145214GB01.AssociatedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity addNewCOCDTP145214GB01AssociatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity)get_store().add_element_user(COCDTP145214GB01ASSOCIATEDENTITY$4);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145214GB01.AssociatedEntity" element
     */
    public void unsetCOCDTP145214GB01AssociatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145214GB01ASSOCIATEDENTITY$4, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145007UK03.RelatedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity getCOCDTP145007UK03RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity)get_store().find_element_user(COCDTP145007UK03RELATEDENTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145007UK03.RelatedEntity" element
     */
    public boolean isSetCOCDTP145007UK03RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145007UK03RELATEDENTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145007UK03.RelatedEntity" element
     */
    public void setCOCDTP145007UK03RelatedEntity(uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity cocdtp145007UK03RelatedEntity)
    {
        generatedSetterHelperImpl(cocdtp145007UK03RelatedEntity, COCDTP145007UK03RELATEDENTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145007UK03.RelatedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity addNewCOCDTP145007UK03RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity)get_store().add_element_user(COCDTP145007UK03RELATEDENTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145007UK03.RelatedEntity" element
     */
    public void unsetCOCDTP145007UK03RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145007UK03RELATEDENTITY$6, 0);
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
    public java.lang.String getTypeCode()
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
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.ucr.ParticipationType xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ParticipationType target = null;
            target = (uk.nhs.connect.iucds.ucr.ParticipationType)get_store().find_attribute_user(TYPECODE$14);
            return target;
        }
    }
    
    /**
     * Sets the "typeCode" attribute
     */
    public void setTypeCode(java.lang.String typeCode)
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
            target.setStringValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(uk.nhs.connect.iucds.ucr.ParticipationType typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ParticipationType target = null;
            target = (uk.nhs.connect.iucds.ucr.ParticipationType)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.ParticipationType)get_store().add_attribute_user(TYPECODE$14);
            }
            target.set(typeCode);
        }
    }
    
    /**
     * Gets the "contextControlCode" attribute
     */
    public java.lang.String getContextControlCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONTROLCODE$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contextControlCode" attribute
     */
    public uk.nhs.connect.iucds.ucr.ContextControl xgetContextControlCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ContextControl target = null;
            target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.ContextControl)get_default_attribute_value(CONTEXTCONTROLCODE$16);
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextControlCode" attribute
     */
    public void setContextControlCode(java.lang.String contextControlCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONTROLCODE$16);
            }
            target.setStringValue(contextControlCode);
        }
    }
    
    /**
     * Sets (as xml) the "contextControlCode" attribute
     */
    public void xsetContextControlCode(uk.nhs.connect.iucds.ucr.ContextControl contextControlCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ContextControl target = null;
            target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().add_attribute_user(CONTEXTCONTROLCODE$16);
            }
            target.set(contextControlCode);
        }
    }
}
