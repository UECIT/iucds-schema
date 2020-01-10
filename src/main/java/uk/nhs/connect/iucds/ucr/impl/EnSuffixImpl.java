/*
 * XML Type:  en.suffix
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EnSuffix
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML en.suffix(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class EnSuffixImpl extends uk.nhs.connect.iucds.ucr.impl.ENXPImpl implements uk.nhs.connect.iucds.ucr.EnSuffix
{
    private static final long serialVersionUID = 1L;
    
    public EnSuffixImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTTYPE$0 = 
        new javax.xml.namespace.QName("", "partType");
    
    
    /**
     * Gets the "partType" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsEntityNamePartType.Enum getPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.CsEntityNamePartType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "partType" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsEntityNamePartType xgetPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsEntityNamePartType target = null;
            target = (uk.nhs.connect.iucds.ucr.CsEntityNamePartType)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsEntityNamePartType)get_default_attribute_value(PARTTYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "partType" attribute
     */
    public boolean isSetPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "partType" attribute
     */
    public void setPartType(uk.nhs.connect.iucds.ucr.CsEntityNamePartType.Enum partType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
            }
            target.setEnumValue(partType);
        }
    }
    
    /**
     * Sets (as xml) the "partType" attribute
     */
    public void xsetPartType(uk.nhs.connect.iucds.ucr.CsEntityNamePartType partType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsEntityNamePartType target = null;
            target = (uk.nhs.connect.iucds.ucr.CsEntityNamePartType)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsEntityNamePartType)get_store().add_attribute_user(PARTTYPE$0);
            }
            target.set(partType);
        }
    }
    
    /**
     * Unsets the "partType" attribute
     */
    public void unsetPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTTYPE$0);
        }
    }
}
