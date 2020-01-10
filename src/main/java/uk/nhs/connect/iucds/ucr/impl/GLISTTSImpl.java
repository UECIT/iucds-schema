/*
 * XML Type:  GLIST_TS
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.GLISTTS
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML GLIST_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class GLISTTSImpl extends uk.nhs.connect.iucds.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.ucr.GLISTTS
{
    private static final long serialVersionUID = 1L;
    
    public GLISTTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEAD$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "head");
    private static final javax.xml.namespace.QName INCREMENT$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "increment");
    private static final javax.xml.namespace.QName PERIOD$4 = 
        new javax.xml.namespace.QName("", "period");
    private static final javax.xml.namespace.QName DENOMINATOR$6 = 
        new javax.xml.namespace.QName("", "denominator");
    
    
    /**
     * Gets the "head" element
     */
    public uk.nhs.connect.iucds.ucr.TS getHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.ucr.TS)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "head" element
     */
    public void setHead(uk.nhs.connect.iucds.ucr.TS head)
    {
        generatedSetterHelperImpl(head, HEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "head" element
     */
    public uk.nhs.connect.iucds.ucr.TS addNewHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.ucr.TS)get_store().add_element_user(HEAD$0);
            return target;
        }
    }
    
    /**
     * Gets the "increment" element
     */
    public uk.nhs.connect.iucds.ucr.PQ getIncrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().find_element_user(INCREMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "increment" element
     */
    public void setIncrement(uk.nhs.connect.iucds.ucr.PQ increment)
    {
        generatedSetterHelperImpl(increment, INCREMENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "increment" element
     */
    public uk.nhs.connect.iucds.ucr.PQ addNewIncrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().add_element_user(INCREMENT$2);
            return target;
        }
    }
    
    /**
     * Gets the "period" attribute
     */
    public java.math.BigInteger getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "period" attribute
     */
    public uk.nhs.connect.iucds.ucr.Int2 xgetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Int2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Int2)get_store().find_attribute_user(PERIOD$4);
            return target;
        }
    }
    
    /**
     * True if has "period" attribute
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERIOD$4) != null;
        }
    }
    
    /**
     * Sets the "period" attribute
     */
    public void setPeriod(java.math.BigInteger period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIOD$4);
            }
            target.setBigIntegerValue(period);
        }
    }
    
    /**
     * Sets (as xml) the "period" attribute
     */
    public void xsetPeriod(uk.nhs.connect.iucds.ucr.Int2 period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Int2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Int2)get_store().find_attribute_user(PERIOD$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Int2)get_store().add_attribute_user(PERIOD$4);
            }
            target.set(period);
        }
    }
    
    /**
     * Unsets the "period" attribute
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERIOD$4);
        }
    }
    
    /**
     * Gets the "denominator" attribute
     */
    public java.math.BigInteger getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DENOMINATOR$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "denominator" attribute
     */
    public uk.nhs.connect.iucds.ucr.Int2 xgetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Int2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Int2)get_store().find_attribute_user(DENOMINATOR$6);
            return target;
        }
    }
    
    /**
     * True if has "denominator" attribute
     */
    public boolean isSetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DENOMINATOR$6) != null;
        }
    }
    
    /**
     * Sets the "denominator" attribute
     */
    public void setDenominator(java.math.BigInteger denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DENOMINATOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DENOMINATOR$6);
            }
            target.setBigIntegerValue(denominator);
        }
    }
    
    /**
     * Sets (as xml) the "denominator" attribute
     */
    public void xsetDenominator(uk.nhs.connect.iucds.ucr.Int2 denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Int2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Int2)get_store().find_attribute_user(DENOMINATOR$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Int2)get_store().add_attribute_user(DENOMINATOR$6);
            }
            target.set(denominator);
        }
    }
    
    /**
     * Unsets the "denominator" attribute
     */
    public void unsetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DENOMINATOR$6);
        }
    }
}
