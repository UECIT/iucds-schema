/*
 * XML Type:  handlingType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.HandlingType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML handlingType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class HandlingTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.HandlingType
{
    private static final long serialVersionUID = 1L;
    
    public HandlingTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SPEC$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "spec");
    
    
    /**
     * Gets array of all "spec" elements
     */
    public uk.nhs.itk.envelope.HandlingSpecType[] getSpecArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPEC$0, targetList);
            uk.nhs.itk.envelope.HandlingSpecType[] result = new uk.nhs.itk.envelope.HandlingSpecType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "spec" element
     */
    public uk.nhs.itk.envelope.HandlingSpecType getSpecArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.HandlingSpecType target = null;
            target = (uk.nhs.itk.envelope.HandlingSpecType)get_store().find_element_user(SPEC$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "spec" element
     */
    public int sizeOfSpecArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPEC$0);
        }
    }
    
    /**
     * Sets array of all "spec" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecArray(uk.nhs.itk.envelope.HandlingSpecType[] specArray)
    {
        check_orphaned();
        arraySetterHelper(specArray, SPEC$0);
    }
    
    /**
     * Sets ith "spec" element
     */
    public void setSpecArray(int i, uk.nhs.itk.envelope.HandlingSpecType spec)
    {
        generatedSetterHelperImpl(spec, SPEC$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "spec" element
     */
    public uk.nhs.itk.envelope.HandlingSpecType insertNewSpec(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.HandlingSpecType target = null;
            target = (uk.nhs.itk.envelope.HandlingSpecType)get_store().insert_element_user(SPEC$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "spec" element
     */
    public uk.nhs.itk.envelope.HandlingSpecType addNewSpec()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.HandlingSpecType target = null;
            target = (uk.nhs.itk.envelope.HandlingSpecType)get_store().add_element_user(SPEC$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "spec" element
     */
    public void removeSpec(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPEC$0, i);
        }
    }
}
