/*
 * XML Type:  BL
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.BL
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML BL(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class BLImpl extends uk.nhs.connect.iucds.cda.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.cda.ucr.BL
{
    private static final long serialVersionUID = 1L;
    
    public BLImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets the "value" attribute
     */
    public boolean getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Bl2 xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(VALUE$0);
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
    public void setValue(boolean value)
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
            target.setBooleanValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(uk.nhs.connect.iucds.cda.ucr.Bl2 value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().add_attribute_user(VALUE$0);
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
