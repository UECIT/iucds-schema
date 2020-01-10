/*
 * An XML document type.
 * Localname: VersionID
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.VersionIDDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.impl;
/**
 * A document containing one VersionID(@urn:nhs-itk:ns:201005) element.
 *
 * This is a complex type.
 */
public class VersionIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.VersionIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public VersionIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VERSIONID$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "VersionID");
    
    
    /**
     * Gets the "VersionID" element
     */
    public java.lang.String getVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "VersionID" element
     */
    public org.apache.xmlbeans.XmlString xgetVersionID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "VersionID" element
     */
    public void setVersionID(java.lang.String versionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSIONID$0);
            }
            target.setStringValue(versionID);
        }
    }
    
    /**
     * Sets (as xml) the "VersionID" element
     */
    public void xsetVersionID(org.apache.xmlbeans.XmlString versionID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSIONID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSIONID$0);
            }
            target.set(versionID);
        }
    }
}
