/*
 * XML Type:  II.NPfIT.oid.mandatory
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.IINPfITOidMandatory
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML II.NPfIT.oid.mandatory(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IINPfITOidMandatoryImpl extends uk.nhs.connect.iucds.cda.ucr.impl.IINPfITOidRequiredImpl implements uk.nhs.connect.iucds.cda.ucr.IINPfITOidMandatory
{
    private static final long serialVersionUID = 1L;
    
    public IINPfITOidMandatoryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("", "root");
    private static final javax.xml.namespace.QName EXTENSION$2 = 
        new javax.xml.namespace.QName("", "extension");
    
    
    /**
     * Gets the "root" attribute
     */
    public java.lang.String getRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "root" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Uid xgetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Uid target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().find_attribute_user(ROOT$0);
            return target;
        }
    }
    
    /**
     * True if has "root" attribute
     */
    public boolean isSetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROOT$0) != null;
        }
    }
    
    /**
     * Sets the "root" attribute
     */
    public void setRoot(java.lang.String root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOT$0);
            }
            target.setStringValue(root);
        }
    }
    
    /**
     * Sets (as xml) the "root" attribute
     */
    public void xsetRoot(uk.nhs.connect.iucds.cda.ucr.Uid root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Uid target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().find_attribute_user(ROOT$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().add_attribute_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Unsets the "root" attribute
     */
    public void unsetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROOT$0);
        }
    }
    
    /**
     * Gets the "extension" attribute
     */
    public java.lang.String getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extension" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.St2 xgetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().find_attribute_user(EXTENSION$2);
            return target;
        }
    }
    
    /**
     * True if has "extension" attribute
     */
    public boolean isSetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTENSION$2) != null;
        }
    }
    
    /**
     * Sets the "extension" attribute
     */
    public void setExtension(java.lang.String extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENSION$2);
            }
            target.setStringValue(extension);
        }
    }
    
    /**
     * Sets (as xml) the "extension" attribute
     */
    public void xsetExtension(uk.nhs.connect.iucds.cda.ucr.St2 extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().find_attribute_user(EXTENSION$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().add_attribute_user(EXTENSION$2);
            }
            target.set(extension);
        }
    }
    
    /**
     * Unsets the "extension" attribute
     */
    public void unsetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTENSION$2);
        }
    }
}
