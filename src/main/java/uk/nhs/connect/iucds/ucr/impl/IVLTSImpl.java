/*
 * XML Type:  IVL_TS
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.IVLTS
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML IVL_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IVLTSImpl extends uk.nhs.connect.iucds.ucr.impl.SXCMTSImpl implements uk.nhs.connect.iucds.ucr.IVLTS
{
    private static final long serialVersionUID = 1L;
    
    public IVLTSImpl(org.apache.xmlbeans.SchemaType sType)
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
    
    
    /**
     * Gets the "low" element
     */
    public uk.nhs.connect.iucds.ucr.IVXBTS getLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVXBTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVXBTS)get_store().find_element_user(LOW$0, 0);
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
    public void setLow(uk.nhs.connect.iucds.ucr.IVXBTS low)
    {
        generatedSetterHelperImpl(low, LOW$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "low" element
     */
    public uk.nhs.connect.iucds.ucr.IVXBTS addNewLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVXBTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVXBTS)get_store().add_element_user(LOW$0);
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
    public uk.nhs.connect.iucds.ucr.IVXBTS getHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVXBTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVXBTS)get_store().find_element_user(HIGH$4, 0);
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
    public void setHigh(uk.nhs.connect.iucds.ucr.IVXBTS high)
    {
        generatedSetterHelperImpl(high, HIGH$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "high" element
     */
    public uk.nhs.connect.iucds.ucr.IVXBTS addNewHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVXBTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVXBTS)get_store().add_element_user(HIGH$4);
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
    public uk.nhs.connect.iucds.ucr.TS getCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.ucr.TS)get_store().find_element_user(CENTER$6, 0);
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
    public void setCenter(uk.nhs.connect.iucds.ucr.TS center)
    {
        generatedSetterHelperImpl(center, CENTER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "center" element
     */
    public uk.nhs.connect.iucds.ucr.TS addNewCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.ucr.TS)get_store().add_element_user(CENTER$6);
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
}
