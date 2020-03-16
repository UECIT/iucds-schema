/*
 * XML Type:  MO
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.MO
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML MO(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class MOImpl extends uk.nhs.connect.iucds.cda.ucr.impl.QTYImpl implements uk.nhs.connect.iucds.cda.ucr.MO
{
    private static final long serialVersionUID = 1L;
    
    public MOImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "value");
    private static final javax.xml.namespace.QName CURRENCY$2 = 
        new javax.xml.namespace.QName("", "currency");
    
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.Object getValue()
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
            target = (uk.nhs.connect.iucds.cda.ucr.Real2)get_store().find_attribute_user(VALUE$0);
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
    public void setValue(java.lang.Object value)
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
            target = (uk.nhs.connect.iucds.cda.ucr.Real2)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Real2)get_store().add_attribute_user(VALUE$0);
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
    
    /**
     * Gets the "currency" attribute
     */
    public java.lang.String getCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "currency" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Cs2 xgetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(CURRENCY$2);
            return target;
        }
    }
    
    /**
     * True if has "currency" attribute
     */
    public boolean isSetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CURRENCY$2) != null;
        }
    }
    
    /**
     * Sets the "currency" attribute
     */
    public void setCurrency(java.lang.String currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CURRENCY$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CURRENCY$2);
            }
            target.setStringValue(currency);
        }
    }
    
    /**
     * Sets (as xml) the "currency" attribute
     */
    public void xsetCurrency(uk.nhs.connect.iucds.cda.ucr.Cs2 currency)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(CURRENCY$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().add_attribute_user(CURRENCY$2);
            }
            target.set(currency);
        }
    }
    
    /**
     * Unsets the "currency" attribute
     */
    public void unsetCurrency()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CURRENCY$2);
        }
    }
}
