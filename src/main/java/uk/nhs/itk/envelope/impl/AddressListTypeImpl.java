/*
 * XML Type:  addressListType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.AddressListType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML addressListType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class AddressListTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.AddressListType
{
    private static final long serialVersionUID = 1L;
    
    public AddressListTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDRESS$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "address");
    
    
    /**
     * Gets array of all "address" elements
     */
    public uk.nhs.itk.envelope.AddressType[] getAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDRESS$0, targetList);
            uk.nhs.itk.envelope.AddressType[] result = new uk.nhs.itk.envelope.AddressType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "address" element
     */
    public uk.nhs.itk.envelope.AddressType getAddressArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AddressType target = null;
            target = (uk.nhs.itk.envelope.AddressType)get_store().find_element_user(ADDRESS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "address" element
     */
    public int sizeOfAddressArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDRESS$0);
        }
    }
    
    /**
     * Sets array of all "address" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddressArray(uk.nhs.itk.envelope.AddressType[] addressArray)
    {
        check_orphaned();
        arraySetterHelper(addressArray, ADDRESS$0);
    }
    
    /**
     * Sets ith "address" element
     */
    public void setAddressArray(int i, uk.nhs.itk.envelope.AddressType address)
    {
        generatedSetterHelperImpl(address, ADDRESS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "address" element
     */
    public uk.nhs.itk.envelope.AddressType insertNewAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AddressType target = null;
            target = (uk.nhs.itk.envelope.AddressType)get_store().insert_element_user(ADDRESS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "address" element
     */
    public uk.nhs.itk.envelope.AddressType addNewAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.AddressType target = null;
            target = (uk.nhs.itk.envelope.AddressType)get_store().add_element_user(ADDRESS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "address" element
     */
    public void removeAddress(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDRESS$0, i);
        }
    }
}
