/*
 * XML Type:  CV.NPfIT.CodedOriginaltext.required
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CVNPfITCodedOriginaltextRequired
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML CV.NPfIT.CodedOriginaltext.required(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CVNPfITCodedOriginaltextRequiredImpl extends uk.nhs.connect.iucds.cda.ucr.impl.CVImpl implements uk.nhs.connect.iucds.cda.ucr.CVNPfITCodedOriginaltextRequired
{
    private static final long serialVersionUID = 1L;
    
    public CVNPfITCodedOriginaltextRequiredImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINALTEXT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "originalText");
    
    
    /**
     * Gets the "originalText" element
     */
    public uk.nhs.connect.iucds.cda.ucr.ED getOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ED target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ED)get_store().find_element_user(ORIGINALTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originalText" element
     */
    public boolean isSetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "originalText" element
     */
    public void setOriginalText(uk.nhs.connect.iucds.cda.ucr.ED originalText)
    {
        generatedSetterHelperImpl(originalText, ORIGINALTEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "originalText" element
     */
    public uk.nhs.connect.iucds.cda.ucr.ED addNewOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ED target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ED)get_store().add_element_user(ORIGINALTEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "originalText" element
     */
    public void unsetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALTEXT$0, 0);
        }
    }
}
