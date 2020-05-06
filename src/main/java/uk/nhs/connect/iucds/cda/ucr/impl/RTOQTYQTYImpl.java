/*
 * XML Type:  RTO_QTY_QTY
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML RTO_QTY_QTY(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class RTOQTYQTYImpl extends uk.nhs.connect.iucds.cda.ucr.impl.QTYImpl implements uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY
{
    private static final long serialVersionUID = 1L;
    
    public RTOQTYQTYImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERATOR$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "numerator");
    private static final javax.xml.namespace.QName DENOMINATOR$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "denominator");
    
    
    /**
     * Gets the "numerator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator getNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numerator" element
     */
    public void setNumerator(uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator numerator)
    {
        generatedSetterHelperImpl(numerator, NUMERATOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "numerator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator addNewNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator)get_store().add_element_user(NUMERATOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "denominator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator)get_store().find_element_user(DENOMINATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "denominator" element
     */
    public void setDenominator(uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator denominator)
    {
        generatedSetterHelperImpl(denominator, DENOMINATOR$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "denominator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator addNewDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator)get_store().add_element_user(DENOMINATOR$2);
            return target;
        }
    }
    /**
     * An XML numerator(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class NumeratorImpl extends uk.nhs.connect.iucds.cda.ucr.impl.QTYImpl implements uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Numerator
    {
        private static final long serialVersionUID = 1L;
        
        public NumeratorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_default_attribute_value(VALUE$0);
                }
                if (target == null)
                {
                    return null;
                }
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
                return get_store().find_attribute_user(VALUE$0) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(org.apache.xmlbeans.XmlAnySimpleType value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$0);
                return target;
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
                get_store().remove_attribute(VALUE$0);
            }
        }
    }
    /**
     * An XML denominator(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class DenominatorImpl extends uk.nhs.connect.iucds.cda.ucr.impl.QTYImpl implements uk.nhs.connect.iucds.cda.ucr.RTOQTYQTY.Denominator
    {
        private static final long serialVersionUID = 1L;
        
        public DenominatorImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_default_attribute_value(VALUE$0);
                }
                if (target == null)
                {
                    return null;
                }
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
                return get_store().find_attribute_user(VALUE$0) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(org.apache.xmlbeans.XmlAnySimpleType value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        
        /**
         * Appends and returns a new empty "value" attribute
         */
        public org.apache.xmlbeans.XmlAnySimpleType addNewValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlAnySimpleType target = null;
                target = (org.apache.xmlbeans.XmlAnySimpleType)get_store().add_attribute_user(VALUE$0);
                return target;
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
                get_store().remove_attribute(VALUE$0);
            }
        }
    }
}
