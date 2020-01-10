/*
 * XML Type:  COCD_TP146246GB01.Author_1
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML COCD_TP146246GB01.Author_1(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class COCDTP146246GB01Author1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1
{
    private static final long serialVersionUID = 1L;
    
    public COCDTP146246GB01Author1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTID$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName FUNCTIONCODE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "functionCode");
    private static final javax.xml.namespace.QName TEMPLATEID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName TIME$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "time");
    private static final javax.xml.namespace.QName COCDTP145200GB01ASSIGNEDAUTHOR$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145200GB01.AssignedAuthor");
    private static final javax.xml.namespace.QName COCDTP145208GB01ASSIGNEDAUTHOR$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145208GB01.AssignedAuthor");
    private static final javax.xml.namespace.QName COCDTP145212GB02WORKGROUP$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145212GB02.Workgroup");
    private static final javax.xml.namespace.QName COCDTP145207GB01ASSIGNEDAUTHORDEVICE$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP145207GB01.AssignedAuthorDevice");
    private static final javax.xml.namespace.QName NULLFLAVOR$16 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$18 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName TYPECODE$20 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONTROLCODE$22 = 
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
    public uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode getFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode)get_store().find_element_user(FUNCTIONCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "functionCode" element
     */
    public void setFunctionCode(uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode functionCode)
    {
        generatedSetterHelperImpl(functionCode, FUNCTIONCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "functionCode" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode addNewFunctionCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode)get_store().add_element_user(FUNCTIONCODE$2);
            return target;
        }
    }
    
    /**
     * Gets the "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId getTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId)get_store().find_element_user(TEMPLATEID$4, 0);
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
    public void setTemplateId(uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId templateId)
    {
        generatedSetterHelperImpl(templateId, TEMPLATEID$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId addNewTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId)get_store().add_element_user(TEMPLATEID$4);
            return target;
        }
    }
    
    /**
     * Gets the "time" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time getTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time)get_store().find_element_user(TIME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "time" element
     */
    public void setTime(uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time time)
    {
        generatedSetterHelperImpl(time, TIME$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "time" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time addNewTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time)get_store().add_element_user(TIME$6);
            return target;
        }
    }
    
    /**
     * Gets the "COCD_TP145200GB01.AssignedAuthor" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor getCOCDTP145200GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor)get_store().find_element_user(COCDTP145200GB01ASSIGNEDAUTHOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145200GB01.AssignedAuthor" element
     */
    public boolean isSetCOCDTP145200GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145200GB01ASSIGNEDAUTHOR$8) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145200GB01.AssignedAuthor" element
     */
    public void setCOCDTP145200GB01AssignedAuthor(uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor cocdtp145200GB01AssignedAuthor)
    {
        generatedSetterHelperImpl(cocdtp145200GB01AssignedAuthor, COCDTP145200GB01ASSIGNEDAUTHOR$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145200GB01.AssignedAuthor" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor addNewCOCDTP145200GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor)get_store().add_element_user(COCDTP145200GB01ASSIGNEDAUTHOR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145200GB01.AssignedAuthor" element
     */
    public void unsetCOCDTP145200GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145200GB01ASSIGNEDAUTHOR$8, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145208GB01.AssignedAuthor" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145208GB01AssignedAuthor getCOCDTP145208GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145208GB01AssignedAuthor target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145208GB01AssignedAuthor)get_store().find_element_user(COCDTP145208GB01ASSIGNEDAUTHOR$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145208GB01.AssignedAuthor" element
     */
    public boolean isSetCOCDTP145208GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145208GB01ASSIGNEDAUTHOR$10) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145208GB01.AssignedAuthor" element
     */
    public void setCOCDTP145208GB01AssignedAuthor(uk.nhs.connect.iucds.ucr.COCDTP145208GB01AssignedAuthor cocdtp145208GB01AssignedAuthor)
    {
        generatedSetterHelperImpl(cocdtp145208GB01AssignedAuthor, COCDTP145208GB01ASSIGNEDAUTHOR$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145208GB01.AssignedAuthor" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145208GB01AssignedAuthor addNewCOCDTP145208GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145208GB01AssignedAuthor target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145208GB01AssignedAuthor)get_store().add_element_user(COCDTP145208GB01ASSIGNEDAUTHOR$10);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145208GB01.AssignedAuthor" element
     */
    public void unsetCOCDTP145208GB01AssignedAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145208GB01ASSIGNEDAUTHOR$10, 0);
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
            target = (uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup)get_store().find_element_user(COCDTP145212GB02WORKGROUP$12, 0);
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
            return get_store().count_elements(COCDTP145212GB02WORKGROUP$12) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145212GB02.Workgroup" element
     */
    public void setCOCDTP145212GB02Workgroup(uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup cocdtp145212GB02Workgroup)
    {
        generatedSetterHelperImpl(cocdtp145212GB02Workgroup, COCDTP145212GB02WORKGROUP$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup)get_store().add_element_user(COCDTP145212GB02WORKGROUP$12);
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
            get_store().remove_element(COCDTP145212GB02WORKGROUP$12, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP145207GB01.AssignedAuthorDevice" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145207GB01AssignedAuthorDevice getCOCDTP145207GB01AssignedAuthorDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145207GB01AssignedAuthorDevice target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145207GB01AssignedAuthorDevice)get_store().find_element_user(COCDTP145207GB01ASSIGNEDAUTHORDEVICE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP145207GB01.AssignedAuthorDevice" element
     */
    public boolean isSetCOCDTP145207GB01AssignedAuthorDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP145207GB01ASSIGNEDAUTHORDEVICE$14) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP145207GB01.AssignedAuthorDevice" element
     */
    public void setCOCDTP145207GB01AssignedAuthorDevice(uk.nhs.connect.iucds.ucr.COCDTP145207GB01AssignedAuthorDevice cocdtp145207GB01AssignedAuthorDevice)
    {
        generatedSetterHelperImpl(cocdtp145207GB01AssignedAuthorDevice, COCDTP145207GB01ASSIGNEDAUTHORDEVICE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP145207GB01.AssignedAuthorDevice" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145207GB01AssignedAuthorDevice addNewCOCDTP145207GB01AssignedAuthorDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145207GB01AssignedAuthorDevice target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145207GB01AssignedAuthorDevice)get_store().add_element_user(COCDTP145207GB01ASSIGNEDAUTHORDEVICE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP145207GB01.AssignedAuthorDevice" element
     */
    public void unsetCOCDTP145207GB01AssignedAuthorDevice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP145207GB01ASSIGNEDAUTHORDEVICE$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
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
            return get_store().find_attribute_user(NULLFLAVOR$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$16);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$16);
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
            get_store().remove_attribute(NULLFLAVOR$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$18);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$18);
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
            return get_store().find_attribute_user(UPDATEMODE$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$18);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$18);
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
            get_store().remove_attribute(UPDATEMODE$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPECODE$20);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$20);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(TYPECODE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$20);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$20);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(TYPECODE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONTROLCODE$22);
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
            target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$22);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.ContextControl)get_default_attribute_value(CONTEXTCONTROLCODE$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONTROLCODE$22);
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
            target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$22);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.ContextControl)get_store().add_attribute_user(CONTEXTCONTROLCODE$22);
            }
            target.set(contextControlCode);
        }
    }
    /**
     * An XML functionCode(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class FunctionCodeImpl extends uk.nhs.connect.iucds.ucr.impl.CVImpl implements uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.FunctionCode
    {
        private static final long serialVersionUID = 1L;
        
        public FunctionCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CODE$0 = 
            new javax.xml.namespace.QName("", "code");
        private static final javax.xml.namespace.QName CODESYSTEM$2 = 
            new javax.xml.namespace.QName("", "codeSystem");
        private static final javax.xml.namespace.QName DISPLAYNAME$4 = 
            new javax.xml.namespace.QName("", "displayName");
        
        
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
        
        /**
         * Gets the "displayName" attribute
         */
        public java.lang.String getDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DISPLAYNAME$4);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "displayName" attribute
         */
        public uk.nhs.connect.iucds.ucr.St2 xgetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.St2 target = null;
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$4);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.St2)get_default_attribute_value(DISPLAYNAME$4);
                }
                return target;
            }
        }
        
        /**
         * True if has "displayName" attribute
         */
        public boolean isSetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(DISPLAYNAME$4) != null;
            }
        }
        
        /**
         * Sets the "displayName" attribute
         */
        public void setDisplayName(java.lang.String displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$4);
                }
                target.setStringValue(displayName);
            }
        }
        
        /**
         * Sets (as xml) the "displayName" attribute
         */
        public void xsetDisplayName(uk.nhs.connect.iucds.ucr.St2 displayName)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.St2 target = null;
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$4);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.St2)get_store().add_attribute_user(DISPLAYNAME$4);
                }
                target.set(displayName);
            }
        }
        
        /**
         * Unsets the "displayName" attribute
         */
        public void unsetDisplayName()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(DISPLAYNAME$4);
            }
        }
    }
    /**
     * An XML templateId(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class TemplateIdImpl extends uk.nhs.connect.iucds.ucr.impl.IIImpl implements uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId
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
        public static class RootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId.Root, uk.nhs.connect.iucds.ucr.Oid, uk.nhs.connect.iucds.ucr.Uuid, uk.nhs.connect.iucds.ucr.Ruid
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
         * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1$TemplateId$Extension.
         */
        public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.TemplateId.Extension
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
    /**
     * An XML time(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class TimeImpl extends uk.nhs.connect.iucds.ucr.impl.TSImpl implements uk.nhs.connect.iucds.ucr.COCDTP146246GB01Author1.Time
    {
        private static final long serialVersionUID = 1L;
        
        public TimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public uk.nhs.connect.iucds.ucr.Ts2 xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Ts2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Ts2)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$0) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(uk.nhs.connect.iucds.ucr.Ts2 value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Ts2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Ts2)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Ts2)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$0);
            }
        }
    }
}
