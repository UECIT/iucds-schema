/*
 * An XML document type.
 * Localname: recipientRoleCode
 * Namespace: NPFIT:HL7:Localisation
 * Java type: uk.nhs.connect.npfit.hl7.localisation.RecipientRoleCodeDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.hl7.localisation.impl;
/**
 * A document containing one recipientRoleCode(@NPFIT:HL7:Localisation) element.
 *
 * This is a complex type.
 */
public class RecipientRoleCodeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.hl7.localisation.RecipientRoleCodeDocument
{
    private static final long serialVersionUID = 1L;
    
    public RecipientRoleCodeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RECIPIENTROLECODE$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "recipientRoleCode");
    
    
    /**
     * Gets the "recipientRoleCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CV getRecipientRoleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CV)get_store().find_element_user(RECIPIENTROLECODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recipientRoleCode" element
     */
    public void setRecipientRoleCode(uk.nhs.connect.iucds.cda.ucr.CV recipientRoleCode)
    {
        generatedSetterHelperImpl(recipientRoleCode, RECIPIENTROLECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recipientRoleCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CV addNewRecipientRoleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CV)get_store().add_element_user(RECIPIENTROLECODE$0);
            return target;
        }
    }
}
