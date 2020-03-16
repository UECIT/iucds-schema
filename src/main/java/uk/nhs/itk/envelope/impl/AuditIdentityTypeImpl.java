/*
 * XML Type:  auditIdentityType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.AuditIdentityType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML auditIdentityType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class AuditIdentityTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.AuditIdentityType
{
    private static final long serialVersionUID = 1L;
    
    public AuditIdentityTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "id");
    
    
    /**
     * Gets array of all "id" elements
     */
    public uk.nhs.itk.envelope.IdentityType[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$0, targetList);
            uk.nhs.itk.envelope.IdentityType[] result = new uk.nhs.itk.envelope.IdentityType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public uk.nhs.itk.envelope.IdentityType getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.IdentityType target = null;
            target = (uk.nhs.itk.envelope.IdentityType)get_store().find_element_user(ID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "id" element
     */
    public int sizeOfIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$0);
        }
    }
    
    /**
     * Sets array of all "id" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdArray(uk.nhs.itk.envelope.IdentityType[] idArray)
    {
        check_orphaned();
        arraySetterHelper(idArray, ID$0);
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, uk.nhs.itk.envelope.IdentityType id)
    {
        generatedSetterHelperImpl(id, ID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public uk.nhs.itk.envelope.IdentityType insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.IdentityType target = null;
            target = (uk.nhs.itk.envelope.IdentityType)get_store().insert_element_user(ID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    public uk.nhs.itk.envelope.IdentityType addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.envelope.IdentityType target = null;
            target = (uk.nhs.itk.envelope.IdentityType)get_store().add_element_user(ID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$0, i);
        }
    }
}
