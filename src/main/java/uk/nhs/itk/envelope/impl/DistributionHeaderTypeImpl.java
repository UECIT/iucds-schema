/*
 * XML Type:  distributionHeaderType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.DistributionHeaderType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML distributionHeaderType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class DistributionHeaderTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.DistributionHeaderType
{
    private static final long serialVersionUID = 1L;
    
    public DistributionHeaderTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESSLIST$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "addresslist");
    private static final javax.xml.namespace.QName AUDITIDENTITY$2 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "auditIdentity");
    private static final javax.xml.namespace.QName MANIFEST$4 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "manifest");
    private static final javax.xml.namespace.QName SENDERADDRESS$6 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "senderAddress");
    private static final javax.xml.namespace.QName HANDLINGSPECIFICATION$8 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "handlingSpecification");
    private static final javax.xml.namespace.QName TRACKINGID$10 = 
        new javax.xml.namespace.QName("", "trackingid");
    private static final javax.xml.namespace.QName SERVICE$12 = 
        new javax.xml.namespace.QName("", "service");
    
    
    /**
     * Gets the "addresslist" element
     */
    public uk.nhs.itk.envelope.AddressListType getAddresslist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AddressListType target = null;
            target = (uk.nhs.itk.envelope.AddressListType)get_store().find_element_user(ADDRESSLIST$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "addresslist" element
     */
    public boolean isSetAddresslist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESSLIST$0) != 0;
        }
    }
    
    /**
     * Sets the "addresslist" element
     */
    public void setAddresslist(uk.nhs.itk.envelope.AddressListType addresslist)
    {
        generatedSetterHelperImpl(addresslist, ADDRESSLIST$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "addresslist" element
     */
    public uk.nhs.itk.envelope.AddressListType addNewAddresslist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AddressListType target = null;
            target = (uk.nhs.itk.envelope.AddressListType)get_store().add_element_user(ADDRESSLIST$0);
            return target;
        }
    }
    
    /**
     * Unsets the "addresslist" element
     */
    public void unsetAddresslist()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESSLIST$0, 0);
        }
    }
    
    /**
     * Gets the "auditIdentity" element
     */
    public uk.nhs.itk.envelope.AuditIdentityType getAuditIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AuditIdentityType target = null;
            target = (uk.nhs.itk.envelope.AuditIdentityType)get_store().find_element_user(AUDITIDENTITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "auditIdentity" element
     */
    public boolean isSetAuditIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUDITIDENTITY$2) != 0;
        }
    }
    
    /**
     * Sets the "auditIdentity" element
     */
    public void setAuditIdentity(uk.nhs.itk.envelope.AuditIdentityType auditIdentity)
    {
        generatedSetterHelperImpl(auditIdentity, AUDITIDENTITY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "auditIdentity" element
     */
    public uk.nhs.itk.envelope.AuditIdentityType addNewAuditIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AuditIdentityType target = null;
            target = (uk.nhs.itk.envelope.AuditIdentityType)get_store().add_element_user(AUDITIDENTITY$2);
            return target;
        }
    }
    
    /**
     * Unsets the "auditIdentity" element
     */
    public void unsetAuditIdentity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUDITIDENTITY$2, 0);
        }
    }
    
    /**
     * Gets the "manifest" element
     */
    public uk.nhs.itk.envelope.ManifestType getManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.ManifestType target = null;
            target = (uk.nhs.itk.envelope.ManifestType)get_store().find_element_user(MANIFEST$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "manifest" element
     */
    public void setManifest(uk.nhs.itk.envelope.ManifestType manifest)
    {
        generatedSetterHelperImpl(manifest, MANIFEST$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "manifest" element
     */
    public uk.nhs.itk.envelope.ManifestType addNewManifest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.ManifestType target = null;
            target = (uk.nhs.itk.envelope.ManifestType)get_store().add_element_user(MANIFEST$4);
            return target;
        }
    }
    
    /**
     * Gets the "senderAddress" element
     */
    public uk.nhs.itk.envelope.AddressType getSenderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AddressType target = null;
            target = (uk.nhs.itk.envelope.AddressType)get_store().find_element_user(SENDERADDRESS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "senderAddress" element
     */
    public boolean isSetSenderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDERADDRESS$6) != 0;
        }
    }
    
    /**
     * Sets the "senderAddress" element
     */
    public void setSenderAddress(uk.nhs.itk.envelope.AddressType senderAddress)
    {
        generatedSetterHelperImpl(senderAddress, SENDERADDRESS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "senderAddress" element
     */
    public uk.nhs.itk.envelope.AddressType addNewSenderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AddressType target = null;
            target = (uk.nhs.itk.envelope.AddressType)get_store().add_element_user(SENDERADDRESS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "senderAddress" element
     */
    public void unsetSenderAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDERADDRESS$6, 0);
        }
    }
    
    /**
     * Gets the "handlingSpecification" element
     */
    public uk.nhs.itk.envelope.HandlingType getHandlingSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.HandlingType target = null;
            target = (uk.nhs.itk.envelope.HandlingType)get_store().find_element_user(HANDLINGSPECIFICATION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "handlingSpecification" element
     */
    public boolean isSetHandlingSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HANDLINGSPECIFICATION$8) != 0;
        }
    }
    
    /**
     * Sets the "handlingSpecification" element
     */
    public void setHandlingSpecification(uk.nhs.itk.envelope.HandlingType handlingSpecification)
    {
        generatedSetterHelperImpl(handlingSpecification, HANDLINGSPECIFICATION$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "handlingSpecification" element
     */
    public uk.nhs.itk.envelope.HandlingType addNewHandlingSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.HandlingType target = null;
            target = (uk.nhs.itk.envelope.HandlingType)get_store().add_element_user(HANDLINGSPECIFICATION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "handlingSpecification" element
     */
    public void unsetHandlingSpecification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HANDLINGSPECIFICATION$8, 0);
        }
    }
    
    /**
     * Gets the "trackingid" attribute
     */
    public java.lang.String getTrackingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKINGID$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "trackingid" attribute
     */
    public uk.nhs.itk.envelope.Uuid xgetTrackingid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.Uuid target = null;
            target = (uk.nhs.itk.envelope.Uuid)get_store().find_attribute_user(TRACKINGID$10);
            return target;
        }
    }
    
    /**
     * Sets the "trackingid" attribute
     */
    public void setTrackingid(java.lang.String trackingid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TRACKINGID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TRACKINGID$10);
            }
            target.setStringValue(trackingid);
        }
    }
    
    /**
     * Sets (as xml) the "trackingid" attribute
     */
    public void xsetTrackingid(uk.nhs.itk.envelope.Uuid trackingid)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.Uuid target = null;
            target = (uk.nhs.itk.envelope.Uuid)get_store().find_attribute_user(TRACKINGID$10);
            if (target == null)
            {
                target = (uk.nhs.itk.envelope.Uuid)get_store().add_attribute_user(TRACKINGID$10);
            }
            target.set(trackingid);
        }
    }
    
    /**
     * Gets the "service" attribute
     */
    public java.lang.String getService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "service" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetService()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SERVICE$12);
            return target;
        }
    }
    
    /**
     * Sets the "service" attribute
     */
    public void setService(java.lang.String service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SERVICE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SERVICE$12);
            }
            target.setStringValue(service);
        }
    }
    
    /**
     * Sets (as xml) the "service" attribute
     */
    public void xsetService(org.apache.xmlbeans.XmlAnyURI service)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(SERVICE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(SERVICE$12);
            }
            target.set(service);
        }
    }
}
