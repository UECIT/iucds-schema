/*
 * An XML document type.
 * Localname: ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ClinicalDocumentDocument1
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * A document containing one ClinicalDocument(@urn:hl7-org:v3) element.
 *
 * This is a complex type.
 */
public class ClinicalDocumentDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.ClinicalDocumentDocument1
{
    private static final long serialVersionUID = 1L;
    
    public ClinicalDocumentDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLINICALDOCUMENT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "ClinicalDocument");
    
    
    /**
     * Gets the "ClinicalDocument" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 getClinicalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1)get_store().find_element_user(CLINICALDOCUMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ClinicalDocument" element
     */
    public void setClinicalDocument(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 clinicalDocument)
    {
        generatedSetterHelperImpl(clinicalDocument, CLINICALDOCUMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ClinicalDocument" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 addNewClinicalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1)get_store().add_element_user(CLINICALDOCUMENT$0);
            return target;
        }
    }
}
