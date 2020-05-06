/*
 * XML Type:  SLIST_PQ
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.SLISTPQ
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML SLIST_PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class SLISTPQImpl extends uk.nhs.connect.iucds.cda.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.cda.ucr.SLISTPQ
{
    private static final long serialVersionUID = 1L;
    
    public SLISTPQImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGIN$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "origin");
    private static final javax.xml.namespace.QName SCALE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "scale");
    private static final javax.xml.namespace.QName DIGITS$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "digits");
    
    
    /**
     * Gets the "origin" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PQ getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PQ)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(uk.nhs.connect.iucds.cda.ucr.PQ origin)
    {
        generatedSetterHelperImpl(origin, ORIGIN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PQ addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PQ)get_store().add_element_user(ORIGIN$0);
            return target;
        }
    }
    
    /**
     * Gets the "scale" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PQ getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PQ)get_store().find_element_user(SCALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scale" element
     */
    public void setScale(uk.nhs.connect.iucds.cda.ucr.PQ scale)
    {
        generatedSetterHelperImpl(scale, SCALE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "scale" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PQ addNewScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PQ)get_store().add_element_user(SCALE$2);
            return target;
        }
    }
    
    /**
     * Gets the "digits" element
     */
    public java.util.List getDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGITS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "digits" element
     */
    public uk.nhs.connect.iucds.cda.ucr.ListInt xgetDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ListInt target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ListInt)get_store().find_element_user(DIGITS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "digits" element
     */
    public void setDigits(java.util.List digits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGITS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIGITS$4);
            }
            target.setListValue(digits);
        }
    }
    
    /**
     * Sets (as xml) the "digits" element
     */
    public void xsetDigits(uk.nhs.connect.iucds.cda.ucr.ListInt digits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ListInt target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ListInt)get_store().find_element_user(DIGITS$4, 0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ListInt)get_store().add_element_user(DIGITS$4);
            }
            target.set(digits);
        }
    }
}
