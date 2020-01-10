/*
 * An XML document type.
 * Localname: HL7Content
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.HL7ContentDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.impl;
/**
 * A document containing one HL7Content(@urn:nhs-itk:ns:201005) element.
 *
 * This is a complex type.
 */
public class HL7ContentDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.HL7ContentDocument
{
    private static final long serialVersionUID = 1L;
    
    public HL7ContentDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HL7CONTENT$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "HL7Content");
    
    
    /**
     * Gets the "HL7Content" element
     */
    public java.lang.String getHL7Content()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HL7CONTENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "HL7Content" element
     */
    public org.apache.xmlbeans.XmlString xgetHL7Content()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HL7CONTENT$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "HL7Content" element
     */
    public void setHL7Content(java.lang.String hl7Content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HL7CONTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HL7CONTENT$0);
            }
            target.setStringValue(hl7Content);
        }
    }
    
    /**
     * Sets (as xml) the "HL7Content" element
     */
    public void xsetHL7Content(org.apache.xmlbeans.XmlString hl7Content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(HL7CONTENT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(HL7CONTENT$0);
            }
            target.set(hl7Content);
        }
    }
}
