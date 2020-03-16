/*
 * XML Type:  PQ
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.PQ
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class PQImpl extends uk.nhs.connect.iucds.cda.ucr.impl.QTYImpl implements uk.nhs.connect.iucds.cda.ucr.PQ
{
    private static final long serialVersionUID = 1L;
    
    public PQImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSLATION$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "translation");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName UNIT$4 = 
        new javax.xml.namespace.QName("", "unit");
    
    
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
}
