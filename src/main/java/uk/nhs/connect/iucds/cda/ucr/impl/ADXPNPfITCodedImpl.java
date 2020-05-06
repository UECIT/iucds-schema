/*
 * XML Type:  ADXP.NPfIT.Coded
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ADXPNPfITCoded
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML ADXP.NPfIT.Coded(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class ADXPNPfITCodedImpl extends uk.nhs.connect.iucds.cda.ucr.impl.ADXPNPfITNotAnyImpl implements uk.nhs.connect.iucds.cda.ucr.ADXPNPfITCoded
{
    private static final long serialVersionUID = 1L;
    
    public ADXPNPfITCodedImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    
    
    /**
     * Gets the "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CV getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CV)get_store().find_element_user(CODE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(uk.nhs.connect.iucds.cda.ucr.CV code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CV addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CV)get_store().add_element_user(CODE$0);
            return target;
        }
    }
}
