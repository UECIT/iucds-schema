/*
 * XML Type:  PIVL_TS
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.PIVLTS
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML PIVL_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class PIVLTSImpl extends uk.nhs.connect.iucds.ucr.impl.SXCMTSImpl implements uk.nhs.connect.iucds.ucr.PIVLTS
{
    private static final long serialVersionUID = 1L;
    
    public PIVLTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHASE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "phase");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "period");
    private static final javax.xml.namespace.QName ALIGNMENT$4 = 
        new javax.xml.namespace.QName("", "alignment");
    private static final javax.xml.namespace.QName INSTITUTIONSPECIFIED$6 = 
        new javax.xml.namespace.QName("", "institutionSpecified");
    
    
    /**
     * Gets the "phase" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS getPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().find_element_user(PHASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "phase" element
     */
    public boolean isSetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHASE$0) != 0;
        }
    }
    
    /**
     * Sets the "phase" element
     */
    public void setPhase(uk.nhs.connect.iucds.ucr.IVLTS phase)
    {
        generatedSetterHelperImpl(phase, PHASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "phase" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS addNewPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().add_element_user(PHASE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "phase" element
     */
    public void unsetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHASE$0, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public uk.nhs.connect.iucds.ucr.PQ getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(uk.nhs.connect.iucds.ucr.PQ period)
    {
        generatedSetterHelperImpl(period, PERIOD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public uk.nhs.connect.iucds.ucr.PQ addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.PQ target = null;
            target = (uk.nhs.connect.iucds.ucr.PQ)get_store().add_element_user(PERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$2, 0);
        }
    }
    
    /**
     * Gets the "alignment" attribute
     */
    public java.lang.String getAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alignment" attribute
     */
    public uk.nhs.connect.iucds.ucr.CalendarCycle xgetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CalendarCycle target = null;
            target = (uk.nhs.connect.iucds.ucr.CalendarCycle)get_store().find_attribute_user(ALIGNMENT$4);
            return target;
        }
    }
    
    /**
     * True if has "alignment" attribute
     */
    public boolean isSetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIGNMENT$4) != null;
        }
    }
    
    /**
     * Sets the "alignment" attribute
     */
    public void setAlignment(java.lang.String alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNMENT$4);
            }
            target.setStringValue(alignment);
        }
    }
    
    /**
     * Sets (as xml) the "alignment" attribute
     */
    public void xsetAlignment(uk.nhs.connect.iucds.ucr.CalendarCycle alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CalendarCycle target = null;
            target = (uk.nhs.connect.iucds.ucr.CalendarCycle)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CalendarCycle)get_store().add_attribute_user(ALIGNMENT$4);
            }
            target.set(alignment);
        }
    }
    
    /**
     * Unsets the "alignment" attribute
     */
    public void unsetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIGNMENT$4);
        }
    }
    
    /**
     * Gets the "institutionSpecified" attribute
     */
    public boolean getInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSTITUTIONSPECIFIED$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "institutionSpecified" attribute
     */
    public uk.nhs.connect.iucds.ucr.Bl2 xgetInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Bl2)get_default_attribute_value(INSTITUTIONSPECIFIED$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "institutionSpecified" attribute
     */
    public boolean isSetInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSTITUTIONSPECIFIED$6) != null;
        }
    }
    
    /**
     * Sets the "institutionSpecified" attribute
     */
    public void setInstitutionSpecified(boolean institutionSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTITUTIONSPECIFIED$6);
            }
            target.setBooleanValue(institutionSpecified);
        }
    }
    
    /**
     * Sets (as xml) the "institutionSpecified" attribute
     */
    public void xsetInstitutionSpecified(uk.nhs.connect.iucds.ucr.Bl2 institutionSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Bl2)get_store().add_attribute_user(INSTITUTIONSPECIFIED$6);
            }
            target.set(institutionSpecified);
        }
    }
    
    /**
     * Unsets the "institutionSpecified" attribute
     */
    public void unsetInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSTITUTIONSPECIFIED$6);
        }
    }
}
