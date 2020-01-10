/*
 * XML Type:  ADXP
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ADXP
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ADXP(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class ADXPImpl extends uk.nhs.connect.iucds.ucr.impl.STImpl implements uk.nhs.connect.iucds.ucr.ADXP
{
    private static final long serialVersionUID = 1L;
    
    public ADXPImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTTYPE$0 = 
        new javax.xml.namespace.QName("", "partType");
    
    
    /**
     * Gets the "partType" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum getPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "partType" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsAddressPartType xgetPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
            target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
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
    public void setPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType.Enum partType)
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
    public void xsetPartType(uk.nhs.connect.iucds.ucr.CsAddressPartType partType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsAddressPartType target = null;
            target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsAddressPartType)get_store().add_attribute_user(PARTTYPE$0);
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
