/*
 * XML Type:  manifestType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.ManifestType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML manifestType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class ManifestTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.ManifestType
{
    private static final long serialVersionUID = 1L;
    
    public ManifestTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MANIFESTITEM$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "manifestitem");
    private static final javax.xml.namespace.QName COUNT$2 = 
        new javax.xml.namespace.QName("", "count");
    
    
    /**
     * Gets array of all "manifestitem" elements
     */
    public uk.nhs.itk.envelope.ManifestItemType[] getManifestitemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(MANIFESTITEM$0, targetList);
            uk.nhs.itk.envelope.ManifestItemType[] result = new uk.nhs.itk.envelope.ManifestItemType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "manifestitem" element
     */
    public uk.nhs.itk.envelope.ManifestItemType getManifestitemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.ManifestItemType target = null;
            target = (uk.nhs.itk.envelope.ManifestItemType)get_store().find_element_user(MANIFESTITEM$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "manifestitem" element
     */
    public int sizeOfManifestitemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANIFESTITEM$0);
        }
    }
    
    /**
     * Sets array of all "manifestitem" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setManifestitemArray(uk.nhs.itk.envelope.ManifestItemType[] manifestitemArray)
    {
        check_orphaned();
        arraySetterHelper(manifestitemArray, MANIFESTITEM$0);
    }
    
    /**
     * Sets ith "manifestitem" element
     */
    public void setManifestitemArray(int i, uk.nhs.itk.envelope.ManifestItemType manifestitem)
    {
        generatedSetterHelperImpl(manifestitem, MANIFESTITEM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "manifestitem" element
     */
    public uk.nhs.itk.envelope.ManifestItemType insertNewManifestitem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.ManifestItemType target = null;
            target = (uk.nhs.itk.envelope.ManifestItemType)get_store().insert_element_user(MANIFESTITEM$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "manifestitem" element
     */
    public uk.nhs.itk.envelope.ManifestItemType addNewManifestitem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.ManifestItemType target = null;
            target = (uk.nhs.itk.envelope.ManifestItemType)get_store().add_element_user(MANIFESTITEM$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "manifestitem" element
     */
    public void removeManifestitem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANIFESTITEM$0, i);
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
