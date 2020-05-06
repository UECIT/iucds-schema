/*
 * XML Type:  IVL_INT
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.IVLINT
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML IVL_INT(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IVLINTImpl extends uk.nhs.connect.iucds.cda.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.cda.ucr.IVLINT
{
    private static final long serialVersionUID = 1L;
    
    public IVLINTImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOW$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "low");
    private static final javax.xml.namespace.QName HIGH$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "high");
    private static final javax.xml.namespace.QName VALUE$4 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets the "low" element
     */
    public uk.nhs.connect.iucds.cda.ucr.IVLINT.Low getLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.IVLINT.Low target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.IVLINT.Low)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "low" element
     */
    public void setLow(uk.nhs.connect.iucds.cda.ucr.IVLINT.Low low)
    {
        generatedSetterHelperImpl(low, LOW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "low" element
     */
    public uk.nhs.connect.iucds.cda.ucr.IVLINT.Low addNewLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.IVLINT.Low target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.IVLINT.Low)get_store().add_element_user(LOW$0);
            return target;
        }
    }
    
    /**
     * Gets the "high" element
     */
    public uk.nhs.connect.iucds.cda.ucr.IVLINT.High getHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.IVLINT.High target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.IVLINT.High)get_store().find_element_user(HIGH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "high" element
     */
    public void setHigh(uk.nhs.connect.iucds.cda.ucr.IVLINT.High high)
    {
        generatedSetterHelperImpl(high, HIGH$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "high" element
     */
    public uk.nhs.connect.iucds.cda.ucr.IVLINT.High addNewHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.IVLINT.High target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.IVLINT.High)get_store().add_element_user(HIGH$2);
            return target;
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.math.BigInteger getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Int2 xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Int2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Int2)get_store().find_attribute_user(VALUE$4);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$4) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.math.BigInteger value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$4);
            }
            target.setBigIntegerValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(uk.nhs.connect.iucds.cda.ucr.Int2 value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Int2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Int2)get_store().find_attribute_user(VALUE$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Int2)get_store().add_attribute_user(VALUE$4);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$4);
        }
    }
    /**
     * An XML low(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class LowImpl extends uk.nhs.connect.iucds.cda.ucr.impl.INTImpl implements uk.nhs.connect.iucds.cda.ucr.IVLINT.Low
    {
        private static final long serialVersionUID = 1L;
        
        public LowImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUSIVE$0 = 
            new javax.xml.namespace.QName("", "inclusive");
        
        
        /**
         * Gets the "inclusive" attribute
         */
        public boolean getInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUSIVE$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "inclusive" attribute
         */
        public uk.nhs.connect.iucds.cda.ucr.Bl2 xgetInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_default_attribute_value(INCLUSIVE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "inclusive" attribute
         */
        public boolean isSetInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCLUSIVE$0) != null;
            }
        }
        
        /**
         * Sets the "inclusive" attribute
         */
        public void setInclusive(boolean inclusive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUSIVE$0);
                }
                target.setBooleanValue(inclusive);
            }
        }
        
        /**
         * Sets (as xml) the "inclusive" attribute
         */
        public void xsetInclusive(uk.nhs.connect.iucds.cda.ucr.Bl2 inclusive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().add_attribute_user(INCLUSIVE$0);
                }
                target.set(inclusive);
            }
        }
        
        /**
         * Unsets the "inclusive" attribute
         */
        public void unsetInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCLUSIVE$0);
            }
        }
    }
    /**
     * An XML high(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class HighImpl extends uk.nhs.connect.iucds.cda.ucr.impl.INTImpl implements uk.nhs.connect.iucds.cda.ucr.IVLINT.High
    {
        private static final long serialVersionUID = 1L;
        
        public HighImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName INCLUSIVE$0 = 
            new javax.xml.namespace.QName("", "inclusive");
        
        
        /**
         * Gets the "inclusive" attribute
         */
        public boolean getInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUSIVE$0);
                }
                if (target == null)
                {
                    return false;
                }
                return target.getBooleanValue();
            }
        }
        
        /**
         * Gets (as xml) the "inclusive" attribute
         */
        public uk.nhs.connect.iucds.cda.ucr.Bl2 xgetInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_default_attribute_value(INCLUSIVE$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "inclusive" attribute
         */
        public boolean isSetInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(INCLUSIVE$0) != null;
            }
        }
        
        /**
         * Sets the "inclusive" attribute
         */
        public void setInclusive(boolean inclusive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUSIVE$0);
                }
                target.setBooleanValue(inclusive);
            }
        }
        
        /**
         * Sets (as xml) the "inclusive" attribute
         */
        public void xsetInclusive(uk.nhs.connect.iucds.cda.ucr.Bl2 inclusive)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INCLUSIVE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().add_attribute_user(INCLUSIVE$0);
                }
                target.set(inclusive);
            }
        }
        
        /**
         * Unsets the "inclusive" attribute
         */
        public void unsetInclusive()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(INCLUSIVE$0);
            }
        }
    }
}
