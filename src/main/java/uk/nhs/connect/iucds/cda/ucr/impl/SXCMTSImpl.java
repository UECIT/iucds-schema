/*
 * XML Type:  SXCM_TS
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.SXCMTS
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML SXCM_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class SXCMTSImpl extends uk.nhs.connect.iucds.cda.ucr.impl.TSImpl implements uk.nhs.connect.iucds.cda.ucr.SXCMTS
{
    private static final long serialVersionUID = 1L;
    
    public SXCMTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("", "operator");
    
    
    /**
     * Gets the "operator" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsSetOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$0);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.CsSetOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsSetOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsSetOperator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsSetOperator)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsSetOperator)get_default_attribute_value(OPERATOR$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$0) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(uk.nhs.connect.iucds.cda.ucr.CsSetOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$0);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(uk.nhs.connect.iucds.cda.ucr.CsSetOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsSetOperator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsSetOperator)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsSetOperator)get_store().add_attribute_user(OPERATOR$0);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$0);
        }
    }
}
