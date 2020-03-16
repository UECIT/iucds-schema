/*
 * XML Type:  ANY
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ANY
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML ANY(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class ANYImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.ANY
{
    private static final long serialVersionUID = 1L;
    
    public ANYImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NULLFLAVOR$0 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$2 = 
        new javax.xml.namespace.QName("", "updateMode");
    
    
    /**
     * Gets the "nullFlavor" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsNullFlavor.Enum getNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$0);
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
            target = (uk.nhs.connect.iucds.cda.ucr.CsNullFlavor)get_store().find_attribute_user(NULLFLAVOR$0);
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
            return get_store().find_attribute_user(NULLFLAVOR$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$0);
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
            target = (uk.nhs.connect.iucds.cda.ucr.CsNullFlavor)get_store().find_attribute_user(NULLFLAVOR$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsNullFlavor)get_store().add_attribute_user(NULLFLAVOR$0);
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
            get_store().remove_attribute(NULLFLAVOR$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$2);
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
            target = (uk.nhs.connect.iucds.cda.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$2);
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
            return get_store().find_attribute_user(UPDATEMODE$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$2);
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
            target = (uk.nhs.connect.iucds.cda.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$2);
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
            get_store().remove_attribute(UPDATEMODE$2);
        }
    }
}
