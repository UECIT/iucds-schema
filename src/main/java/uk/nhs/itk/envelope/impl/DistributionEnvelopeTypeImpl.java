/*
 * XML Type:  distributionEnvelopeType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.DistributionEnvelopeType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML distributionEnvelopeType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class DistributionEnvelopeTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.DistributionEnvelopeType
{
    private static final long serialVersionUID = 1L;
    
    public DistributionEnvelopeTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEADER$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "header");
    private static final javax.xml.namespace.QName PAYLOADS$2 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "payloads");
    
    
    /**
     * Gets the "header" element
     */
    public uk.nhs.itk.envelope.DistributionHeaderType getHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.DistributionHeaderType target = null;
            target = (uk.nhs.itk.envelope.DistributionHeaderType)get_store().find_element_user(HEADER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "header" element
     */
    public void setHeader(uk.nhs.itk.envelope.DistributionHeaderType header)
    {
        generatedSetterHelperImpl(header, HEADER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "header" element
     */
    public uk.nhs.itk.envelope.DistributionHeaderType addNewHeader()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.DistributionHeaderType target = null;
            target = (uk.nhs.itk.envelope.DistributionHeaderType)get_store().add_element_user(HEADER$0);
            return target;
        }
    }
    
    /**
     * Gets the "payloads" element
     */
    public uk.nhs.itk.envelope.PayloadsType getPayloads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.PayloadsType target = null;
            target = (uk.nhs.itk.envelope.PayloadsType)get_store().find_element_user(PAYLOADS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "payloads" element
     */
    public void setPayloads(uk.nhs.itk.envelope.PayloadsType payloads)
    {
        generatedSetterHelperImpl(payloads, PAYLOADS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "payloads" element
     */
    public uk.nhs.itk.envelope.PayloadsType addNewPayloads()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.PayloadsType target = null;
            target = (uk.nhs.itk.envelope.PayloadsType)get_store().add_element_user(PAYLOADS$2);
            return target;
        }
    }
}
