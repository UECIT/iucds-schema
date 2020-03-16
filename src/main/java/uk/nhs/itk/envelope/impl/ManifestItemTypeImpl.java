/*
 * XML Type:  manifestItemType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.ManifestItemType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML manifestItemType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class ManifestItemTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.ManifestItemType
{
    private static final long serialVersionUID = 1L;
    
    public ManifestItemTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName MIMETYPE$2 = 
        new javax.xml.namespace.QName("", "mimetype");
    private static final javax.xml.namespace.QName PROFILEID$4 = 
        new javax.xml.namespace.QName("", "profileid");
    private static final javax.xml.namespace.QName METADATA$6 = 
        new javax.xml.namespace.QName("", "metadata");
    private static final javax.xml.namespace.QName COMPRESSED$8 = 
        new javax.xml.namespace.QName("", "compressed");
    private static final javax.xml.namespace.QName BASE64$10 = 
        new javax.xml.namespace.QName("", "base64");
    private static final javax.xml.namespace.QName ENCRYPTED$12 = 
        new javax.xml.namespace.QName("", "encrypted");
    
    
    /**
     * Gets the "id" attribute
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" attribute
     */
    public org.apache.xmlbeans.XmlIDREF xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(ID$0);
            return target;
        }
    }
    
    /**
     * Sets the "id" attribute
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" attribute
     */
    public void xsetId(org.apache.xmlbeans.XmlIDREF id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREF target = null;
            target = (org.apache.xmlbeans.XmlIDREF)get_store().find_attribute_user(ID$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREF)get_store().add_attribute_user(ID$0);
            }
            target.set(id);
        }
    }
    
    /**
     * Gets the "mimetype" attribute
     */
    public java.lang.String getMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mimetype" attribute
     */
    public org.apache.xmlbeans.XmlString xgetMimetype()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$2);
            return target;
        }
    }
    
    /**
     * Sets the "mimetype" attribute
     */
    public void setMimetype(java.lang.String mimetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MIMETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MIMETYPE$2);
            }
            target.setStringValue(mimetype);
        }
    }
    
    /**
     * Sets (as xml) the "mimetype" attribute
     */
    public void xsetMimetype(org.apache.xmlbeans.XmlString mimetype)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(MIMETYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(MIMETYPE$2);
            }
            target.set(mimetype);
        }
    }
    
    /**
     * Gets the "profileid" attribute
     */
    public java.lang.String getProfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILEID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "profileid" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetProfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROFILEID$4);
            return target;
        }
    }
    
    /**
     * True if has "profileid" attribute
     */
    public boolean isSetProfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROFILEID$4) != null;
        }
    }
    
    /**
     * Sets the "profileid" attribute
     */
    public void setProfileid(java.lang.String profileid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROFILEID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROFILEID$4);
            }
            target.setStringValue(profileid);
        }
    }
    
    /**
     * Sets (as xml) the "profileid" attribute
     */
    public void xsetProfileid(org.apache.xmlbeans.XmlAnyURI profileid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(PROFILEID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(PROFILEID$4);
            }
            target.set(profileid);
        }
    }
    
    /**
     * Unsets the "profileid" attribute
     */
    public void unsetProfileid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROFILEID$4);
        }
    }
    
    /**
     * Gets the "metadata" attribute
     */
    public boolean getMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(METADATA$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "metadata" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(METADATA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(METADATA$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "metadata" attribute
     */
    public boolean isSetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(METADATA$6) != null;
        }
    }
    
    /**
     * Sets the "metadata" attribute
     */
    public void setMetadata(boolean metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(METADATA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(METADATA$6);
            }
            target.setBooleanValue(metadata);
        }
    }
    
    /**
     * Sets (as xml) the "metadata" attribute
     */
    public void xsetMetadata(org.apache.xmlbeans.XmlBoolean metadata)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(METADATA$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(METADATA$6);
            }
            target.set(metadata);
        }
    }
    
    /**
     * Unsets the "metadata" attribute
     */
    public void unsetMetadata()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(METADATA$6);
        }
    }
    
    /**
     * Gets the "compressed" attribute
     */
    public boolean getCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COMPRESSED$8);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "compressed" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPRESSED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(COMPRESSED$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "compressed" attribute
     */
    public boolean isSetCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPRESSED$8) != null;
        }
    }
    
    /**
     * Sets the "compressed" attribute
     */
    public void setCompressed(boolean compressed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPRESSED$8);
            }
            target.setBooleanValue(compressed);
        }
    }
    
    /**
     * Sets (as xml) the "compressed" attribute
     */
    public void xsetCompressed(org.apache.xmlbeans.XmlBoolean compressed)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(COMPRESSED$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(COMPRESSED$8);
            }
            target.set(compressed);
        }
    }
    
    /**
     * Unsets the "compressed" attribute
     */
    public void unsetCompressed()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPRESSED$8);
        }
    }
    
    /**
     * Gets the "base64" attribute
     */
    public boolean getBase64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE64$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(BASE64$10);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "base64" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetBase64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE64$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(BASE64$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "base64" attribute
     */
    public boolean isSetBase64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BASE64$10) != null;
        }
    }
    
    /**
     * Sets the "base64" attribute
     */
    public void setBase64(boolean base64)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BASE64$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BASE64$10);
            }
            target.setBooleanValue(base64);
        }
    }
    
    /**
     * Sets (as xml) the "base64" attribute
     */
    public void xsetBase64(org.apache.xmlbeans.XmlBoolean base64)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(BASE64$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(BASE64$10);
            }
            target.set(base64);
        }
    }
    
    /**
     * Unsets the "base64" attribute
     */
    public void unsetBase64()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BASE64$10);
        }
    }
    
    /**
     * Gets the "encrypted" attribute
     */
    public boolean getEncrypted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ENCRYPTED$12);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "encrypted" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetEncrypted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENCRYPTED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(ENCRYPTED$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "encrypted" attribute
     */
    public boolean isSetEncrypted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENCRYPTED$12) != null;
        }
    }
    
    /**
     * Sets the "encrypted" attribute
     */
    public void setEncrypted(boolean encrypted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENCRYPTED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENCRYPTED$12);
            }
            target.setBooleanValue(encrypted);
        }
    }
    
    /**
     * Sets (as xml) the "encrypted" attribute
     */
    public void xsetEncrypted(org.apache.xmlbeans.XmlBoolean encrypted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(ENCRYPTED$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(ENCRYPTED$12);
            }
            target.set(encrypted);
        }
    }
    
    /**
     * Unsets the "encrypted" attribute
     */
    public void unsetEncrypted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENCRYPTED$12);
        }
    }
}
