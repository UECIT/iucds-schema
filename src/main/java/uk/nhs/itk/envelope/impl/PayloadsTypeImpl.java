/*
 * XML Type:  payloadsType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.PayloadsType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML payloadsType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class PayloadsTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.PayloadsType
{
    private static final long serialVersionUID = 1L;
    
    public PayloadsTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PAYLOAD$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "payload");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets array of all "payload" elements
     */
    public uk.nhs.itk.envelope.PayloadType[] getPayloadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PAYLOAD$0, targetList);
            uk.nhs.itk.envelope.PayloadType[] result = new uk.nhs.itk.envelope.PayloadType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "payload" element
     */
    public uk.nhs.itk.envelope.PayloadType getPayloadArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.PayloadType target = null;
            target = (uk.nhs.itk.envelope.PayloadType)get_store().find_element_user(PAYLOAD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "payload" element
     */
    public int sizeOfPayloadArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAYLOAD$0);
        }
    }
    
    /**
     * Sets array of all "payload" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPayloadArray(uk.nhs.itk.envelope.PayloadType[] payloadArray)
    {
        check_orphaned();
        arraySetterHelper(payloadArray, PAYLOAD$0);
    }
    
    /**
     * Sets ith "payload" element
     */
    public void setPayloadArray(int i, uk.nhs.itk.envelope.PayloadType payload)
    {
        generatedSetterHelperImpl(payload, PAYLOAD$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "payload" element
     */
    public uk.nhs.itk.envelope.PayloadType insertNewPayload(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.PayloadType target = null;
            target = (uk.nhs.itk.envelope.PayloadType)get_store().insert_element_user(PAYLOAD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "payload" element
     */
    public uk.nhs.itk.envelope.PayloadType addNewPayload()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.PayloadType target = null;
            target = (uk.nhs.itk.envelope.PayloadType)get_store().add_element_user(PAYLOAD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "payload" element
     */
    public void removePayload(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAYLOAD$0, i);
        }
    }
    
    /**
     * Gets the "count" attribute
     */
    public java.math.BigInteger getCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "count" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$2);
            return target;
        }
    }
    
    /**
     * Sets the "count" attribute
     */
    public void setCount(java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COUNT$2);
            }
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Sets (as xml) the "count" attribute
     */
    public void xsetCount(org.apache.xmlbeans.XmlInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(COUNT$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(COUNT$2);
            }
            target.set(count);
        }
    }
}
