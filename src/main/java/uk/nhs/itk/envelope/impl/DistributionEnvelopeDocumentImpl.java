/*
 * An XML document type.
 * Localname: DistributionEnvelope
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.DistributionEnvelopeDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * A document containing one DistributionEnvelope(@urn:nhs-itk:ns:201005) element.
 *
 * This is a complex type.
 */
public class DistributionEnvelopeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.DistributionEnvelopeDocument
{
    private static final long serialVersionUID = 1L;
    
    public DistributionEnvelopeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DISTRIBUTIONENVELOPE$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "DistributionEnvelope");
    
    
    /**
     * Gets the "DistributionEnvelope" element
     */
    public uk.nhs.itk.envelope.DistributionEnvelopeType getDistributionEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.DistributionEnvelopeType target = null;
            target = (uk.nhs.itk.envelope.DistributionEnvelopeType)get_store().find_element_user(DISTRIBUTIONENVELOPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DistributionEnvelope" element
     */
    public void setDistributionEnvelope(uk.nhs.itk.envelope.DistributionEnvelopeType distributionEnvelope)
    {
        generatedSetterHelperImpl(distributionEnvelope, DISTRIBUTIONENVELOPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DistributionEnvelope" element
     */
    public uk.nhs.itk.envelope.DistributionEnvelopeType addNewDistributionEnvelope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.DistributionEnvelopeType target = null;
            target = (uk.nhs.itk.envelope.DistributionEnvelopeType)get_store().add_element_user(DISTRIBUTIONENVELOPE$0);
            return target;
        }
    }
}
