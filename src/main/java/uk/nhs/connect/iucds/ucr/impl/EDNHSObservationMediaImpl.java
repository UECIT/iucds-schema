/*
 * XML Type:  ED.NHS.ObservationMedia
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EDNHSObservationMedia
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ED.NHS.ObservationMedia(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class EDNHSObservationMediaImpl extends uk.nhs.connect.iucds.ucr.impl.EDImpl implements uk.nhs.connect.iucds.ucr.EDNHSObservationMedia
{
    private static final long serialVersionUID = 1L;
    
    public EDNHSObservationMediaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPRESENTATION$0 = 
        new javax.xml.namespace.QName("", "representation");
    private static final javax.xml.namespace.QName MEDIATYPE$2 = 
        new javax.xml.namespace.QName("", "mediaType");
    
    
    /**
     * Gets the "representation" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding.Enum getRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "representation" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding xgetRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding target = null;
            target = (uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding)get_store().find_attribute_user(REPRESENTATION$0);
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
    public void setRepresentation(uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding.Enum representation)
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
    public void xsetRepresentation(uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding target = null;
            target = (uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsBinaryDataEncoding)get_store().add_attribute_user(REPRESENTATION$0);
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
    
    /**
     * Gets the "mediaType" attribute
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" attribute
     */
    public uk.nhs.connect.iucds.ucr.Cs2 xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(MEDIATYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "mediaType" attribute
     */
    public boolean isSetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEDIATYPE$2) != null;
        }
    }
    
    /**
     * Sets the "mediaType" attribute
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$2);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" attribute
     */
    public void xsetMediaType(uk.nhs.connect.iucds.ucr.Cs2 mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(MEDIATYPE$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(MEDIATYPE$2);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Unsets the "mediaType" attribute
     */
    public void unsetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEDIATYPE$2);
        }
    }
}
