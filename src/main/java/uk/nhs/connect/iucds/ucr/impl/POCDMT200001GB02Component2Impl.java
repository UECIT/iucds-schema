/*
 * XML Type:  POCD_MT200001GB02.Component2
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component2
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML POCD_MT200001GB02.Component2(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT200001GB02Component2Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component2
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT200001GB02Component2Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENTID$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName COCDTP146002GB01OBSERVATIONMEDIA$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP146002GB01.ObservationMedia");
    private static final javax.xml.namespace.QName COCDTP146050GB01PERMISSIONTOVIEW$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP146050GB01.PermissionToView");
    private static final javax.xml.namespace.QName COCDTP146091GB01INTEGRATEDURGENTCAREHISTORY$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP146091GB01.IntegratedUrgentCareHistory");
    private static final javax.xml.namespace.QName COCDTP146092GB01CLINICALDISCRIMINATOR$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP146092GB01.ClinicalDiscriminator");
    private static final javax.xml.namespace.QName COCDTP146093GB01APPOINTMENTREFERENCE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "COCD_TP146093GB01.AppointmentReference");
    private static final javax.xml.namespace.QName NULLFLAVOR$12 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$14 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName TYPECODE$16 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONDUCTIONIND$18 = 
        new javax.xml.namespace.QName("", "contextConductionInd");
    
    
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
     * Gets the "COCD_TP146002GB01.ObservationMedia" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146002GB01ObservationMedia getCOCDTP146002GB01ObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146002GB01ObservationMedia target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146002GB01ObservationMedia)get_store().find_element_user(COCDTP146002GB01OBSERVATIONMEDIA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP146002GB01.ObservationMedia" element
     */
    public boolean isSetCOCDTP146002GB01ObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP146002GB01OBSERVATIONMEDIA$2) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP146002GB01.ObservationMedia" element
     */
    public void setCOCDTP146002GB01ObservationMedia(uk.nhs.connect.iucds.ucr.COCDTP146002GB01ObservationMedia cocdtp146002GB01ObservationMedia)
    {
        generatedSetterHelperImpl(cocdtp146002GB01ObservationMedia, COCDTP146002GB01OBSERVATIONMEDIA$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP146002GB01.ObservationMedia" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146002GB01ObservationMedia addNewCOCDTP146002GB01ObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146002GB01ObservationMedia target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146002GB01ObservationMedia)get_store().add_element_user(COCDTP146002GB01OBSERVATIONMEDIA$2);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP146002GB01.ObservationMedia" element
     */
    public void unsetCOCDTP146002GB01ObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP146002GB01OBSERVATIONMEDIA$2, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP146050GB01.PermissionToView" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146050GB01PermissionToView getCOCDTP146050GB01PermissionToView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146050GB01PermissionToView target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146050GB01PermissionToView)get_store().find_element_user(COCDTP146050GB01PERMISSIONTOVIEW$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP146050GB01.PermissionToView" element
     */
    public boolean isSetCOCDTP146050GB01PermissionToView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP146050GB01PERMISSIONTOVIEW$4) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP146050GB01.PermissionToView" element
     */
    public void setCOCDTP146050GB01PermissionToView(uk.nhs.connect.iucds.ucr.COCDTP146050GB01PermissionToView cocdtp146050GB01PermissionToView)
    {
        generatedSetterHelperImpl(cocdtp146050GB01PermissionToView, COCDTP146050GB01PERMISSIONTOVIEW$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP146050GB01.PermissionToView" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146050GB01PermissionToView addNewCOCDTP146050GB01PermissionToView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146050GB01PermissionToView target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146050GB01PermissionToView)get_store().add_element_user(COCDTP146050GB01PERMISSIONTOVIEW$4);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP146050GB01.PermissionToView" element
     */
    public void unsetCOCDTP146050GB01PermissionToView()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP146050GB01PERMISSIONTOVIEW$4, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP146091GB01.IntegratedUrgentCareHistory" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146091GB01IntegratedUrgentCareHistory getCOCDTP146091GB01IntegratedUrgentCareHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146091GB01IntegratedUrgentCareHistory target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146091GB01IntegratedUrgentCareHistory)get_store().find_element_user(COCDTP146091GB01INTEGRATEDURGENTCAREHISTORY$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP146091GB01.IntegratedUrgentCareHistory" element
     */
    public boolean isSetCOCDTP146091GB01IntegratedUrgentCareHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP146091GB01INTEGRATEDURGENTCAREHISTORY$6) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP146091GB01.IntegratedUrgentCareHistory" element
     */
    public void setCOCDTP146091GB01IntegratedUrgentCareHistory(uk.nhs.connect.iucds.ucr.COCDTP146091GB01IntegratedUrgentCareHistory cocdtp146091GB01IntegratedUrgentCareHistory)
    {
        generatedSetterHelperImpl(cocdtp146091GB01IntegratedUrgentCareHistory, COCDTP146091GB01INTEGRATEDURGENTCAREHISTORY$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP146091GB01.IntegratedUrgentCareHistory" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146091GB01IntegratedUrgentCareHistory addNewCOCDTP146091GB01IntegratedUrgentCareHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146091GB01IntegratedUrgentCareHistory target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146091GB01IntegratedUrgentCareHistory)get_store().add_element_user(COCDTP146091GB01INTEGRATEDURGENTCAREHISTORY$6);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP146091GB01.IntegratedUrgentCareHistory" element
     */
    public void unsetCOCDTP146091GB01IntegratedUrgentCareHistory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP146091GB01INTEGRATEDURGENTCAREHISTORY$6, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP146092GB01.ClinicalDiscriminator" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146092GB01ClinicalDiscriminator getCOCDTP146092GB01ClinicalDiscriminator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146092GB01ClinicalDiscriminator target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146092GB01ClinicalDiscriminator)get_store().find_element_user(COCDTP146092GB01CLINICALDISCRIMINATOR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP146092GB01.ClinicalDiscriminator" element
     */
    public boolean isSetCOCDTP146092GB01ClinicalDiscriminator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP146092GB01CLINICALDISCRIMINATOR$8) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP146092GB01.ClinicalDiscriminator" element
     */
    public void setCOCDTP146092GB01ClinicalDiscriminator(uk.nhs.connect.iucds.ucr.COCDTP146092GB01ClinicalDiscriminator cocdtp146092GB01ClinicalDiscriminator)
    {
        generatedSetterHelperImpl(cocdtp146092GB01ClinicalDiscriminator, COCDTP146092GB01CLINICALDISCRIMINATOR$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP146092GB01.ClinicalDiscriminator" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146092GB01ClinicalDiscriminator addNewCOCDTP146092GB01ClinicalDiscriminator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146092GB01ClinicalDiscriminator target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146092GB01ClinicalDiscriminator)get_store().add_element_user(COCDTP146092GB01CLINICALDISCRIMINATOR$8);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP146092GB01.ClinicalDiscriminator" element
     */
    public void unsetCOCDTP146092GB01ClinicalDiscriminator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP146092GB01CLINICALDISCRIMINATOR$8, 0);
        }
    }
    
    /**
     * Gets the "COCD_TP146093GB01.AppointmentReference" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146093GB01AppointmentReference getCOCDTP146093GB01AppointmentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146093GB01AppointmentReference target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146093GB01AppointmentReference)get_store().find_element_user(COCDTP146093GB01APPOINTMENTREFERENCE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "COCD_TP146093GB01.AppointmentReference" element
     */
    public boolean isSetCOCDTP146093GB01AppointmentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COCDTP146093GB01APPOINTMENTREFERENCE$10) != 0;
        }
    }
    
    /**
     * Sets the "COCD_TP146093GB01.AppointmentReference" element
     */
    public void setCOCDTP146093GB01AppointmentReference(uk.nhs.connect.iucds.ucr.COCDTP146093GB01AppointmentReference cocdtp146093GB01AppointmentReference)
    {
        generatedSetterHelperImpl(cocdtp146093GB01AppointmentReference, COCDTP146093GB01APPOINTMENTREFERENCE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "COCD_TP146093GB01.AppointmentReference" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP146093GB01AppointmentReference addNewCOCDTP146093GB01AppointmentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP146093GB01AppointmentReference target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP146093GB01AppointmentReference)get_store().add_element_user(COCDTP146093GB01APPOINTMENTREFERENCE$10);
            return target;
        }
    }
    
    /**
     * Unsets the "COCD_TP146093GB01.AppointmentReference" element
     */
    public void unsetCOCDTP146093GB01AppointmentReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COCDTP146093GB01APPOINTMENTREFERENCE$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$12);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$12);
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
            return get_store().find_attribute_user(NULLFLAVOR$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$12);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$12);
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
            get_store().remove_attribute(NULLFLAVOR$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$14);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$14);
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
            return get_store().find_attribute_user(UPDATEMODE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$14);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$14);
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
            get_store().remove_attribute(UPDATEMODE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPECODE$16);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(TYPECODE$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$16);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(TYPECODE$16);
            }
            target.set(typeCode);
        }
    }
    
    /**
     * Gets the "contextConductionInd" attribute
     */
    public boolean getContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONDUCTIONIND$18);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "contextConductionInd" attribute
     */
    public uk.nhs.connect.iucds.ucr.Bl2 xgetContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Bl2)get_default_attribute_value(CONTEXTCONDUCTIONIND$18);
            }
            return target;
        }
    }
    
    /**
     * Sets the "contextConductionInd" attribute
     */
    public void setContextConductionInd(boolean contextConductionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$18);
            }
            target.setBooleanValue(contextConductionInd);
        }
    }
    
    /**
     * Sets (as xml) the "contextConductionInd" attribute
     */
    public void xsetContextConductionInd(uk.nhs.connect.iucds.ucr.Bl2 contextConductionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$18);
            }
            target.set(contextConductionInd);
        }
    }
}
