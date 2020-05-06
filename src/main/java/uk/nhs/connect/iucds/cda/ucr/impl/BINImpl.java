/*
 * XML Type:  BIN
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.BIN
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML BIN(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class BINImpl extends uk.nhs.connect.iucds.cda.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.cda.ucr.BIN
{
    private static final long serialVersionUID = 1L;
    
    public BINImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPRESENTATION$0 = 
        new javax.xml.namespace.QName("", "representation");
    
    
    /**
     * Gets the "representation" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding.Enum getRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPRESENTATION$0);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "representation" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding xgetRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding)get_default_attribute_value(REPRESENTATION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "representation" attribute
     */
    public boolean isSetRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPRESENTATION$0) != null;
        }
    }
    
    /**
     * Sets the "representation" attribute
     */
    public void setRepresentation(uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding.Enum representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATION$0);
            }
            target.setEnumValue(representation);
        }
    }
    
    /**
     * Sets (as xml) the "representation" attribute
     */
    public void xsetRepresentation(uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsBinaryDataEncoding)get_store().add_attribute_user(REPRESENTATION$0);
            }
            target.set(representation);
        }
    }
    
    /**
     * Unsets the "representation" attribute
     */
    public void unsetRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPRESENTATION$0);
        }
    }
}
