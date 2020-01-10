/*
 * XML Type:  IVL_PQ
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.IVLPQ
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML IVL_PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IVLPQImpl extends uk.nhs.connect.iucds.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.ucr.IVLPQ
{
    private static final long serialVersionUID = 1L;
    
    public IVLPQImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOW$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "low");
    private static final javax.xml.namespace.QName WIDTH$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "width");
    private static final javax.xml.namespace.QName HIGH$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "high");
    private static final javax.xml.namespace.QName CENTER$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "center");
    private static final javax.xml.namespace.QName OPERATOR$8 = 
        new javax.xml.namespace.QName("", "operator");
    
    
    /**
     * Gets the "low" element
     */
    public uk.nhs.connect.iucds.ucr.PQInc getLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQInc target = null;
            target = (uk.nhs.connect.iucds.ucr.PQInc)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "low" element
     */
    public boolean isSetLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOW$0) != 0;
        }
    }
    
    /**
     * Sets the "low" element
     */
    public void setLow(uk.nhs.connect.iucds.ucr.PQInc low)
    {
        generatedSetterHelperImpl(low, LOW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "low" element
     */
    public uk.nhs.connect.iucds.ucr.PQInc addNewLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQInc target = null;
            target = (uk.nhs.connect.iucds.ucr.PQInc)get_store().add_element_user(LOW$0);
            return target;
        }
    }
    
    /**
     * Unsets the "low" element
     */
    public void unsetLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOW$0, 0);
        }
    }
    
    /**
     * Gets the "width" element
     */
    public uk.nhs.connect.iucds.ucr.PQ getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().find_element_user(WIDTH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "width" element
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WIDTH$2) != 0;
        }
    }
    
    /**
     * Sets the "width" element
     */
    public void setWidth(uk.nhs.connect.iucds.ucr.PQ width)
    {
        generatedSetterHelperImpl(width, WIDTH$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "width" element
     */
    public uk.nhs.connect.iucds.ucr.PQ addNewWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().add_element_user(WIDTH$2);
            return target;
        }
    }
    
    /**
     * Unsets the "width" element
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WIDTH$2, 0);
        }
    }
    
    /**
     * Gets the "high" element
     */
    public uk.nhs.connect.iucds.ucr.PQInc getHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQInc target = null;
            target = (uk.nhs.connect.iucds.ucr.PQInc)get_store().find_element_user(HIGH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "high" element
     */
    public boolean isSetHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIGH$4) != 0;
        }
    }
    
    /**
     * Sets the "high" element
     */
    public void setHigh(uk.nhs.connect.iucds.ucr.PQInc high)
    {
        generatedSetterHelperImpl(high, HIGH$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "high" element
     */
    public uk.nhs.connect.iucds.ucr.PQInc addNewHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQInc target = null;
            target = (uk.nhs.connect.iucds.ucr.PQInc)get_store().add_element_user(HIGH$4);
            return target;
        }
    }
    
    /**
     * Unsets the "high" element
     */
    public void unsetHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIGH$4, 0);
        }
    }
    
    /**
     * Gets the "center" element
     */
    public uk.nhs.connect.iucds.ucr.PQ getCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().find_element_user(CENTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "center" element
     */
    public boolean isSetCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CENTER$6) != 0;
        }
    }
    
    /**
     * Sets the "center" element
     */
    public void setCenter(uk.nhs.connect.iucds.ucr.PQ center)
    {
        generatedSetterHelperImpl(center, CENTER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "center" element
     */
    public uk.nhs.connect.iucds.ucr.PQ addNewCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().add_element_user(CENTER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "center" element
     */
    public void unsetCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CENTER$6, 0);
        }
    }
    
    /**
     * Gets the "operator" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsSetOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$8);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.CsSetOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsSetOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsSetOperator target = null;
            target = (uk.nhs.connect.iucds.ucr.CsSetOperator)get_store().find_attribute_user(OPERATOR$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsSetOperator)get_default_attribute_value(OPERATOR$8);
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
            return get_store().find_attribute_user(OPERATOR$8) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(uk.nhs.connect.iucds.ucr.CsSetOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$8);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(uk.nhs.connect.iucds.ucr.CsSetOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsSetOperator target = null;
            target = (uk.nhs.connect.iucds.ucr.CsSetOperator)get_store().find_attribute_user(OPERATOR$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsSetOperator)get_store().add_attribute_user(OPERATOR$8);
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
            get_store().remove_attribute(OPERATOR$8);
        }
    }
}
