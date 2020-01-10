/*
 * An XML document type.
 * Localname: SimpleMessageResponse
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.SimpleMessageResponseDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.impl;
/**
 * A document containing one SimpleMessageResponse(@urn:nhs-itk:ns:201005) element.
 *
 * This is a complex type.
 */
public class SimpleMessageResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.SimpleMessageResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public SimpleMessageResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SIMPLEMESSAGERESPONSE$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "SimpleMessageResponse");
    
    
    /**
     * Gets the "SimpleMessageResponse" element
     */
    public java.lang.String getSimpleMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SimpleMessageResponse" element
     */
    public org.apache.xmlbeans.XmlString xgetSimpleMessageResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIMPLEMESSAGERESPONSE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "SimpleMessageResponse" element
     */
    public void setSimpleMessageResponse(java.lang.String simpleMessageResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SIMPLEMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SIMPLEMESSAGERESPONSE$0);
            }
            target.setStringValue(simpleMessageResponse);
        }
    }
    
    /**
     * Sets (as xml) the "SimpleMessageResponse" element
     */
    public void xsetSimpleMessageResponse(org.apache.xmlbeans.XmlString simpleMessageResponse)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SIMPLEMESSAGERESPONSE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SIMPLEMESSAGERESPONSE$0);
            }
            target.set(simpleMessageResponse);
        }
    }
}
