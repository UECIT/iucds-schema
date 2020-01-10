/*
 * XML Type:  TEL.NPFIT.use.required
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.TELNPFITUseRequired
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML TEL.NPFIT.use.required(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class TELNPFITUseRequiredImpl extends uk.nhs.connect.iucds.ucr.impl.URLImpl implements uk.nhs.connect.iucds.ucr.TELNPFITUseRequired
{
    private static final long serialVersionUID = 1L;
    
    public TELNPFITUseRequiredImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEABLEPERIOD$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "useablePeriod");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName USE$4 = 
        new javax.xml.namespace.QName("", "use");
    
    
    /**
     * Gets array of all "useablePeriod" elements
     */
    public uk.nhs.connect.iucds.ucr.IVLTS[] getUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEABLEPERIOD$0, targetList);
            uk.nhs.connect.iucds.ucr.IVLTS[] result = new uk.nhs.connect.iucds.ucr.IVLTS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "useablePeriod" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS getUseablePeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().find_element_user(USEABLEPERIOD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "useablePeriod" element
     */
    public int sizeOfUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEABLEPERIOD$0);
        }
    }
    
    /**
     * Sets array of all "useablePeriod" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUseablePeriodArray(uk.nhs.connect.iucds.ucr.IVLTS[] useablePeriodArray)
    {
        check_orphaned();
        arraySetterHelper(useablePeriodArray, USEABLEPERIOD$0);
    }
    
    /**
     * Sets ith "useablePeriod" element
     */
    public void setUseablePeriodArray(int i, uk.nhs.connect.iucds.ucr.IVLTS useablePeriod)
    {
        generatedSetterHelperImpl(useablePeriod, USEABLEPERIOD$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useablePeriod" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS insertNewUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().insert_element_user(USEABLEPERIOD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useablePeriod" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS addNewUseablePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().add_element_user(USEABLEPERIOD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "useablePeriod" element
     */
    public void removeUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEABLEPERIOD$0, i);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public uk.nhs.connect.iucds.ucr.II getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.II target = null;
            target = (uk.nhs.connect.iucds.ucr.II)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$2) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(uk.nhs.connect.iucds.ucr.II id)
    {
        generatedSetterHelperImpl(id, ID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "id" element
     */
    public uk.nhs.connect.iucds.ucr.II addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.II target = null;
            target = (uk.nhs.connect.iucds.ucr.II)get_store().add_element_user(ID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$2, 0);
        }
    }
    
    /**
     * Gets the "use" attribute
     */
    public java.util.List getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$4);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "use" attribute
     */
    public uk.nhs.connect.iucds.ucr.SetCsTelecommunicationAddressUse xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.SetCsTelecommunicationAddressUse target = null;
            target = (uk.nhs.connect.iucds.ucr.SetCsTelecommunicationAddressUse)get_store().find_attribute_user(USE$4);
            return target;
        }
    }
    
    /**
     * Sets the "use" attribute
     */
    public void setUse(java.util.List use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$4);
            }
            target.setListValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(uk.nhs.connect.iucds.ucr.SetCsTelecommunicationAddressUse use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.SetCsTelecommunicationAddressUse target = null;
            target = (uk.nhs.connect.iucds.ucr.SetCsTelecommunicationAddressUse)get_store().find_attribute_user(USE$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.SetCsTelecommunicationAddressUse)get_store().add_attribute_user(USE$4);
            }
            target.set(use);
        }
    }
}
