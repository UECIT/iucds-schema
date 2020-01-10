/*
 * XML Type:  POCD_MT200001GB02.PrimaryInformationRecipient
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML POCD_MT200001GB02.PrimaryInformationRecipient(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT200001GB02PrimaryInformationRecipientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT200001GB02PrimaryInformationRecipientImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTID$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName COCDTP145202GB02INTENDEDRECIPIENT$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145202GB02.IntendedRecipient");
    private static final javax.xml.namespace.QName COCDTP145203GB03INTENDEDRECIPIENT$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145203GB03.IntendedRecipient");
    private static final javax.xml.namespace.QName COCDTP145204GB03RECIPIENTWORKGROUP$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145204GB03.RecipientWorkgroup");
    private static final javax.xml.namespace.QName NULLFLAVOR$8 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$10 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName TYPECODE$12 = 
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
     * Gets the "COCD_TP145202GB02.IntendedRecipient" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145202GB02IntendedRecipient getCOCDTP145202GB02IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145202GB02IntendedRecipient target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145202GB02IntendedRecipient)get_store().find_element_user(COCDTP145202GB02INTENDEDRECIPIENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145202GB02.IntendedRecipient" element
     */
    public boolean isSetCOCDTP145202GB02IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145202GB02INTENDEDRECIPIENT$2) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145202GB02.IntendedRecipient" element
     */
    public void setCOCDTP145202GB02IntendedRecipient(uk.nhs.connect.iucds.ucr.COCDTP145202GB02IntendedRecipient cocdtp145202GB02IntendedRecipient)
    {
        generatedSetterHelperImpl(cocdtp145202GB02IntendedRecipient, COCDTP145202GB02INTENDEDRECIPIENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145202GB02.IntendedRecipient" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145202GB02IntendedRecipient addNewCOCDTP145202GB02IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145202GB02IntendedRecipient target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145202GB02IntendedRecipient)get_store().add_element_user(COCDTP145202GB02INTENDEDRECIPIENT$2);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145202GB02.IntendedRecipient" element
     */
    public void unsetCOCDTP145202GB02IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145202GB02INTENDEDRECIPIENT$2, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145203GB03.IntendedRecipient" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145203GB03IntendedRecipient getCOCDTP145203GB03IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145203GB03IntendedRecipient target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145203GB03IntendedRecipient)get_store().find_element_user(COCDTP145203GB03INTENDEDRECIPIENT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145203GB03.IntendedRecipient" element
     */
    public boolean isSetCOCDTP145203GB03IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145203GB03INTENDEDRECIPIENT$4) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145203GB03.IntendedRecipient" element
     */
    public void setCOCDTP145203GB03IntendedRecipient(uk.nhs.connect.iucds.ucr.COCDTP145203GB03IntendedRecipient cocdtp145203GB03IntendedRecipient)
    {
        generatedSetterHelperImpl(cocdtp145203GB03IntendedRecipient, COCDTP145203GB03INTENDEDRECIPIENT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145203GB03.IntendedRecipient" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145203GB03IntendedRecipient addNewCOCDTP145203GB03IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145203GB03IntendedRecipient target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145203GB03IntendedRecipient)get_store().add_element_user(COCDTP145203GB03INTENDEDRECIPIENT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145203GB03.IntendedRecipient" element
     */
    public void unsetCOCDTP145203GB03IntendedRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145203GB03INTENDEDRECIPIENT$4, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145204GB03.RecipientWorkgroup" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145204GB03RecipientWorkgroup getCOCDTP145204GB03RecipientWorkgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145204GB03RecipientWorkgroup target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145204GB03RecipientWorkgroup)get_store().find_element_user(COCDTP145204GB03RECIPIENTWORKGROUP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145204GB03.RecipientWorkgroup" element
     */
    public boolean isSetCOCDTP145204GB03RecipientWorkgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145204GB03RECIPIENTWORKGROUP$6) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145204GB03.RecipientWorkgroup" element
     */
    public void setCOCDTP145204GB03RecipientWorkgroup(uk.nhs.connect.iucds.ucr.COCDTP145204GB03RecipientWorkgroup cocdtp145204GB03RecipientWorkgroup)
    {
        generatedSetterHelperImpl(cocdtp145204GB03RecipientWorkgroup, COCDTP145204GB03RECIPIENTWORKGROUP$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145204GB03.RecipientWorkgroup" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145204GB03RecipientWorkgroup addNewCOCDTP145204GB03RecipientWorkgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145204GB03RecipientWorkgroup target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145204GB03RecipientWorkgroup)get_store().add_element_user(COCDTP145204GB03RECIPIENTWORKGROUP$6);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145204GB03.RecipientWorkgroup" element
     */
    public void unsetCOCDTP145204GB03RecipientWorkgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145204GB03RECIPIENTWORKGROUP$6, 0);
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
}
