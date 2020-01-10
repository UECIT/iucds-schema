/*
 * XML Type:  POCD_MT200001GB02.Informant
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML POCD_MT200001GB02.Informant(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT200001GB02InformantImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT200001GB02InformantImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTID$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName COCDTP145007UK03RELATEDENTITY$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145007UK03.RelatedEntity");
    private static final javax.xml.namespace.QName COCDTP145210GB01ASSIGNEDENTITY$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145210GB01.AssignedEntity");
    private static final javax.xml.namespace.QName COCDTP145007UK05RELATEDENTITY$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145007UK05.RelatedEntity");
    private static final javax.xml.namespace.QName NULLFLAVOR$8 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$10 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName TYPECODE$12 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONTROLCODE$14 = 
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
     * Gets the "COCD_TP145007UK03.RelatedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity getCOCDTP145007UK03RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity)get_store().find_element_user(COCDTP145007UK03RELATEDENTITY$2, 0);
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
            return get_store().count_elements(COCDTP145007UK03RELATEDENTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145007UK03.RelatedEntity" element
     */
    public void setCOCDTP145007UK03RelatedEntity(uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity cocdtp145007UK03RelatedEntity)
    {
        generatedSetterHelperImpl(cocdtp145007UK03RelatedEntity, COCDTP145007UK03RELATEDENTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity)get_store().add_element_user(COCDTP145007UK03RELATEDENTITY$2);
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
            get_store().remove_element(COCDTP145007UK03RELATEDENTITY$2, 0);
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
            target = (uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity)get_store().find_element_user(COCDTP145210GB01ASSIGNEDENTITY$4, 0);
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
            return get_store().count_elements(COCDTP145210GB01ASSIGNEDENTITY$4) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145210GB01.AssignedEntity" element
     */
    public void setCOCDTP145210GB01AssignedEntity(uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity cocdtp145210GB01AssignedEntity)
    {
        generatedSetterHelperImpl(cocdtp145210GB01AssignedEntity, COCDTP145210GB01ASSIGNEDENTITY$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (uk.nhs.connect.iucds.ucr.COCDTP145210GB01AssignedEntity)get_store().add_element_user(COCDTP145210GB01ASSIGNEDENTITY$4);
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
            get_store().remove_element(COCDTP145210GB01ASSIGNEDENTITY$4, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145007UK05.RelatedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145007UK05RelatedEntity getCOCDTP145007UK05RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145007UK05RelatedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145007UK05RelatedEntity)get_store().find_element_user(COCDTP145007UK05RELATEDENTITY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145007UK05.RelatedEntity" element
     */
    public boolean isSetCOCDTP145007UK05RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145007UK05RELATEDENTITY$6) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145007UK05.RelatedEntity" element
     */
    public void setCOCDTP145007UK05RelatedEntity(uk.nhs.connect.iucds.ucr.COCDTP145007UK05RelatedEntity cocdtp145007UK05RelatedEntity)
    {
        generatedSetterHelperImpl(cocdtp145007UK05RelatedEntity, COCDTP145007UK05RELATEDENTITY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145007UK05.RelatedEntity" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145007UK05RelatedEntity addNewCOCDTP145007UK05RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145007UK05RelatedEntity target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145007UK05RelatedEntity)get_store().add_element_user(COCDTP145007UK05RELATEDENTITY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145007UK05.RelatedEntity" element
     */
    public void unsetCOCDTP145007UK05RelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145007UK05RELATEDENTITY$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$8);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$8);
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
            return get_store().find_attribute_user(NULLFLAVOR$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$8);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$8);
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
            get_store().remove_attribute(NULLFLAVOR$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$10);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$10);
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
            return get_store().find_attribute_user(UPDATEMODE$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$10);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$10);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$10);
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
            get_store().remove_attribute(UPDATEMODE$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPECODE$12);
            }
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
    public uk.nhs.connect.iucds.ucr.Cs2 xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(TYPECODE$12);
            }
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$12);
            }
            target.setStringValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(uk.nhs.connect.iucds.ucr.Cs2 typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(TYPECODE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONTROLCODE$14);
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
            target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.ContextControl)get_default_attribute_value(CONTEXTCONTROLCODE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONTROLCODE$14);
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
            target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().add_attribute_user(CONTEXTCONTROLCODE$14);
            }
            target.set(contextControlCode);
        }
    }
}
