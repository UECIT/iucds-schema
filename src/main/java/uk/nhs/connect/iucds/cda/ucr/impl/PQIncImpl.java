/*
 * XML Type:  PQ_inc
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.PQInc
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML PQ_inc(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class PQIncImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.PQInc
{
    private static final long serialVersionUID = 1L;
    
    public PQIncImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSLATION$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "translation");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName UNIT$4 = 
        new javax.xml.namespace.QName("", "unit");
    private static final javax.xml.namespace.QName ORIGINALVALUE$6 = 
        new javax.xml.namespace.QName("", "originalValue");
    private static final javax.xml.namespace.QName ORIGINALUNIT$8 = 
        new javax.xml.namespace.QName("", "originalUnit");
    private static final javax.xml.namespace.QName NULLFLAVOR$10 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName INCLUSIVE$12 = 
        new javax.xml.namespace.QName("", "inclusive");
    private static final javax.xml.namespace.QName UPDATEMODE$14 = 
        new javax.xml.namespace.QName("", "updateMode");
    
    
    /**
     * Gets array of all "translation" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.PQR[] getTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSLATION$0, targetList);
            uk.nhs.connect.iucds.cda.ucr.PQR[] result = new uk.nhs.connect.iucds.cda.ucr.PQR[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "translation" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PQR getTranslationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PQR target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PQR)get_store().find_element_user(TRANSLATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "translation" element
     */
    public int sizeOfTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSLATION$0);
        }
    }
    
    /**
     * Sets array of all "translation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTranslationArray(uk.nhs.connect.iucds.cda.ucr.PQR[] translationArray)
    {
        check_orphaned();
        arraySetterHelper(translationArray, TRANSLATION$0);
    }
    
    /**
     * Sets ith "translation" element
     */
    public void setTranslationArray(int i, uk.nhs.connect.iucds.cda.ucr.PQR translation)
    {
        generatedSetterHelperImpl(translation, TRANSLATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "translation" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PQR insertNewTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PQR target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PQR)get_store().insert_element_user(TRANSLATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "translation" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PQR addNewTranslation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PQR target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PQR)get_store().add_element_user(TRANSLATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "translation" element
     */
    public void removeTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSLATION$0, i);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.Object getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Real2 xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Real2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Real2)get_store().find_attribute_user(VALUE$2);
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
            return get_store().find_attribute_user(VALUE$2) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.Object value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
            }
            target.setObjectValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(uk.nhs.connect.iucds.cda.ucr.Real2 value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Real2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Real2)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Real2)get_store().add_attribute_user(VALUE$2);
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
            get_store().remove_attribute(VALUE$2);
        }
    }
    
    /**
     * Gets the "unit" attribute
     */
    public java.lang.String getUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNIT$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unit" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Cs2 xgetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(UNIT$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_default_attribute_value(UNIT$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "unit" attribute
     */
    public boolean isSetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNIT$4) != null;
        }
    }
    
    /**
     * Sets the "unit" attribute
     */
    public void setUnit(java.lang.String unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$4);
            }
            target.setStringValue(unit);
        }
    }
    
    /**
     * Sets (as xml) the "unit" attribute
     */
    public void xsetUnit(uk.nhs.connect.iucds.cda.ucr.Cs2 unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(UNIT$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().add_attribute_user(UNIT$4);
            }
            target.set(unit);
        }
    }
    
    /**
     * Unsets the "unit" attribute
     */
    public void unsetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNIT$4);
        }
    }
    
    /**
     * Gets the "originalValue" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getOriginalValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ORIGINALVALUE$6);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originalValue" attribute
     */
    public boolean isSetOriginalValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGINALVALUE$6) != null;
        }
    }
    
    /**
     * Sets the "originalValue" attribute
     */
    public void setOriginalValue(org.apache.xmlbeans.XmlAnySimpleType originalValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ORIGINALVALUE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ORIGINALVALUE$6);
            }
            target.set(originalValue);
        }
    }
    
    /**
     * Appends and returns a new empty "originalValue" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewOriginalValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ORIGINALVALUE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "originalValue" attribute
     */
    public void unsetOriginalValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGINALVALUE$6);
        }
    }
    
    /**
     * Gets the "originalUnit" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType getOriginalUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ORIGINALUNIT$8);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originalUnit" attribute
     */
    public boolean isSetOriginalUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORIGINALUNIT$8) != null;
        }
    }
    
    /**
     * Sets the "originalUnit" attribute
     */
    public void setOriginalUnit(org.apache.xmlbeans.XmlAnySimpleType originalUnit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(ORIGINALUNIT$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ORIGINALUNIT$8);
            }
            target.set(originalUnit);
        }
    }
    
    /**
     * Appends and returns a new empty "originalUnit" attribute
     */
    public org.apache.xmlbeans.XmlAnySimpleType addNewOriginalUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnySimpleType target = null;
            target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(ORIGINALUNIT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "originalUnit" attribute
     */
    public void unsetOriginalUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORIGINALUNIT$8);
        }
    }
    
    /**
     * Gets the "nullFlavor" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsNullFlavor.Enum getNullFlavor()
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
            return (uk.nhs.connect.iucds.cda.ucr.CsNullFlavor.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsNullFlavor xgetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsNullFlavor target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsNullFlavor)get_store().find_attribute_user(NULLFLAVOR$10);
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
    public void setNullFlavor(uk.nhs.connect.iucds.cda.ucr.CsNullFlavor.Enum nullFlavor)
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
            target.setEnumValue(nullFlavor);
        }
    }
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    public void xsetNullFlavor(uk.nhs.connect.iucds.cda.ucr.CsNullFlavor nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsNullFlavor target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsNullFlavor)get_store().find_attribute_user(NULLFLAVOR$10);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsNullFlavor)get_store().add_attribute_user(NULLFLAVOR$10);
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
     * Gets the "inclusive" attribute
     */
    public boolean getInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUSIVE$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "inclusive" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Bl2 xgetInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INCLUSIVE$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_default_attribute_value(INCLUSIVE$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "inclusive" attribute
     */
    public boolean isSetInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUSIVE$12) != null;
        }
    }
    
    /**
     * Sets the "inclusive" attribute
     */
    public void setInclusive(boolean inclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUSIVE$12);
            }
            target.setBooleanValue(inclusive);
        }
    }
    
    /**
     * Sets (as xml) the "inclusive" attribute
     */
    public void xsetInclusive(uk.nhs.connect.iucds.cda.ucr.Bl2 inclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INCLUSIVE$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().add_attribute_user(INCLUSIVE$12);
            }
            target.set(inclusive);
        }
    }
    
    /**
     * Unsets the "inclusive" attribute
     */
    public void unsetInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUSIVE$12);
        }
    }
    
    /**
     * Gets the "updateMode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsUpdateMode.Enum getUpdateMode()
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
            return (uk.nhs.connect.iucds.cda.ucr.CsUpdateMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "updateMode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsUpdateMode xgetUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsUpdateMode target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$14);
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
    public void setUpdateMode(uk.nhs.connect.iucds.cda.ucr.CsUpdateMode.Enum updateMode)
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
    public void xsetUpdateMode(uk.nhs.connect.iucds.cda.ucr.CsUpdateMode updateMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsUpdateMode target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$14);
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
}
