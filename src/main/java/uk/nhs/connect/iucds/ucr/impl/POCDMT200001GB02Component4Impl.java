/*
 * XML Type:  POCD_MT200001GB02.Component4
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML POCD_MT200001GB02.Component4(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT200001GB02Component4Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT200001GB02Component4Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLASSIFICATIONSECTION$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "classificationSection");
    private static final javax.xml.namespace.QName NULLFLAVOR$2 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$4 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName TYPECODE$6 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONDUCTIONIND$8 = 
        new javax.xml.namespace.QName("", "contextConductionInd");
    
    
    /**
     * Gets the "classificationSection" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClassificationSection getClassificationSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClassificationSection target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClassificationSection)get_store().find_element_user(CLASSIFICATIONSECTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "classificationSection" element
     */
    public void setClassificationSection(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClassificationSection classificationSection)
    {
        generatedSetterHelperImpl(classificationSection, CLASSIFICATIONSECTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "classificationSection" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClassificationSection addNewClassificationSection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClassificationSection target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClassificationSection)get_store().add_element_user(CLASSIFICATIONSECTION$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$2);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$2);
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
            return get_store().find_attribute_user(NULLFLAVOR$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$2);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$2);
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
            get_store().remove_attribute(NULLFLAVOR$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$4);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$4);
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
            return get_store().find_attribute_user(UPDATEMODE$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$4);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$4);
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
            get_store().remove_attribute(UPDATEMODE$4);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPECODE$6);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(TYPECODE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$6);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(TYPECODE$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(TYPECODE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONDUCTIONIND$8);
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
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Bl2)get_default_attribute_value(CONTEXTCONDUCTIONIND$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$8);
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
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$8);
            }
            target.set(contextConductionInd);
        }
    }
}
