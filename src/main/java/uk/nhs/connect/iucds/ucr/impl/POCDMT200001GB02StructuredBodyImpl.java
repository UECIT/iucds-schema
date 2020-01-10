/*
 * XML Type:  POCD_MT200001GB02.StructuredBody
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02StructuredBody
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML POCD_MT200001GB02.StructuredBody(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT200001GB02StructuredBodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02StructuredBody
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT200001GB02StructuredBodyImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPONENT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "component");
    private static final javax.xml.namespace.QName NULLFLAVOR$2 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$4 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName CLASSCODE$6 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$8 = 
        new javax.xml.namespace.QName("", "moodCode");
    
    
    /**
     * Gets the "component" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4 getComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4 target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4)get_store().find_element_user(COMPONENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "component" element
     */
    public void setComponent(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4 component)
    {
        generatedSetterHelperImpl(component, COMPONENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "component" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4 addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4 target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component4)get_store().add_element_user(COMPONENT$0);
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
     * Gets the "classCode" attribute
     */
    public java.lang.String getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$6);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(CLASSCODE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$6);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(CLASSCODE$6);
            }
            target.set(classCode);
        }
    }
    
    /**
     * Gets the "moodCode" attribute
     */
    public java.lang.String getMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOODCODE$8);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    public uk.nhs.connect.iucds.ucr.Cs2 xgetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(MOODCODE$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(MOODCODE$8);
            }
            return target;
        }
    }
    
    /**
     * Sets the "moodCode" attribute
     */
    public void setMoodCode(java.lang.String moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$8);
            }
            target.setStringValue(moodCode);
        }
    }
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    public void xsetMoodCode(uk.nhs.connect.iucds.ucr.Cs2 moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(MOODCODE$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(MOODCODE$8);
            }
            target.set(moodCode);
        }
    }
}
