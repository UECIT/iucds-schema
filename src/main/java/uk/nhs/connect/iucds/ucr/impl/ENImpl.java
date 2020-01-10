/*
 * XML Type:  EN
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EN
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML EN(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class ENImpl extends uk.nhs.connect.iucds.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.ucr.EN
{
    private static final long serialVersionUID = 1L;
    
    public ENImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIMITER$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "delimiter");
    private static final javax.xml.namespace.QName FAMILY$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "family");
    private static final javax.xml.namespace.QName GIVEN$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "given");
    private static final javax.xml.namespace.QName PREFIX$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "prefix");
    private static final javax.xml.namespace.QName SUFFIX$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "suffix");
    private static final javax.xml.namespace.QName VALIDTIME$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "validTime");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName USE$14 = 
        new javax.xml.namespace.QName("", "use");
    
    
    /**
     * Gets array of all "delimiter" elements
     */
    public uk.nhs.connect.iucds.ucr.EnDelimiter[] getDelimiterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIMITER$0, targetList);
            uk.nhs.connect.iucds.ucr.EnDelimiter[] result = new uk.nhs.connect.iucds.ucr.EnDelimiter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "delimiter" element
     */
    public uk.nhs.connect.iucds.ucr.EnDelimiter getDelimiterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnDelimiter target = null;
            target = (uk.nhs.connect.iucds.ucr.EnDelimiter)get_store().find_element_user(DELIMITER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "delimiter" element
     */
    public int sizeOfDelimiterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIMITER$0);
        }
    }
    
    /**
     * Sets array of all "delimiter" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDelimiterArray(uk.nhs.connect.iucds.ucr.EnDelimiter[] delimiterArray)
    {
        check_orphaned();
        arraySetterHelper(delimiterArray, DELIMITER$0);
    }
    
    /**
     * Sets ith "delimiter" element
     */
    public void setDelimiterArray(int i, uk.nhs.connect.iucds.ucr.EnDelimiter delimiter)
    {
        generatedSetterHelperImpl(delimiter, DELIMITER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delimiter" element
     */
    public uk.nhs.connect.iucds.ucr.EnDelimiter insertNewDelimiter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnDelimiter target = null;
            target = (uk.nhs.connect.iucds.ucr.EnDelimiter)get_store().insert_element_user(DELIMITER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delimiter" element
     */
    public uk.nhs.connect.iucds.ucr.EnDelimiter addNewDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnDelimiter target = null;
            target = (uk.nhs.connect.iucds.ucr.EnDelimiter)get_store().add_element_user(DELIMITER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "delimiter" element
     */
    public void removeDelimiter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIMITER$0, i);
        }
    }
    
    /**
     * Gets array of all "family" elements
     */
    public uk.nhs.connect.iucds.ucr.EnFamily[] getFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAMILY$2, targetList);
            uk.nhs.connect.iucds.ucr.EnFamily[] result = new uk.nhs.connect.iucds.ucr.EnFamily[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "family" element
     */
    public uk.nhs.connect.iucds.ucr.EnFamily getFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnFamily target = null;
            target = (uk.nhs.connect.iucds.ucr.EnFamily)get_store().find_element_user(FAMILY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "family" element
     */
    public int sizeOfFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILY$2);
        }
    }
    
    /**
     * Sets array of all "family" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFamilyArray(uk.nhs.connect.iucds.ucr.EnFamily[] familyArray)
    {
        check_orphaned();
        arraySetterHelper(familyArray, FAMILY$2);
    }
    
    /**
     * Sets ith "family" element
     */
    public void setFamilyArray(int i, uk.nhs.connect.iucds.ucr.EnFamily family)
    {
        generatedSetterHelperImpl(family, FAMILY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "family" element
     */
    public uk.nhs.connect.iucds.ucr.EnFamily insertNewFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnFamily target = null;
            target = (uk.nhs.connect.iucds.ucr.EnFamily)get_store().insert_element_user(FAMILY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    public uk.nhs.connect.iucds.ucr.EnFamily addNewFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnFamily target = null;
            target = (uk.nhs.connect.iucds.ucr.EnFamily)get_store().add_element_user(FAMILY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "family" element
     */
    public void removeFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILY$2, i);
        }
    }
    
    /**
     * Gets array of all "given" elements
     */
    public uk.nhs.connect.iucds.ucr.EnGiven[] getGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GIVEN$4, targetList);
            uk.nhs.connect.iucds.ucr.EnGiven[] result = new uk.nhs.connect.iucds.ucr.EnGiven[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "given" element
     */
    public uk.nhs.connect.iucds.ucr.EnGiven getGivenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnGiven target = null;
            target = (uk.nhs.connect.iucds.ucr.EnGiven)get_store().find_element_user(GIVEN$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "given" element
     */
    public int sizeOfGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVEN$4);
        }
    }
    
    /**
     * Sets array of all "given" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGivenArray(uk.nhs.connect.iucds.ucr.EnGiven[] givenArray)
    {
        check_orphaned();
        arraySetterHelper(givenArray, GIVEN$4);
    }
    
    /**
     * Sets ith "given" element
     */
    public void setGivenArray(int i, uk.nhs.connect.iucds.ucr.EnGiven given)
    {
        generatedSetterHelperImpl(given, GIVEN$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "given" element
     */
    public uk.nhs.connect.iucds.ucr.EnGiven insertNewGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnGiven target = null;
            target = (uk.nhs.connect.iucds.ucr.EnGiven)get_store().insert_element_user(GIVEN$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "given" element
     */
    public uk.nhs.connect.iucds.ucr.EnGiven addNewGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnGiven target = null;
            target = (uk.nhs.connect.iucds.ucr.EnGiven)get_store().add_element_user(GIVEN$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "given" element
     */
    public void removeGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVEN$4, i);
        }
    }
    
    /**
     * Gets array of all "prefix" elements
     */
    public uk.nhs.connect.iucds.ucr.EnPrefix[] getPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREFIX$6, targetList);
            uk.nhs.connect.iucds.ucr.EnPrefix[] result = new uk.nhs.connect.iucds.ucr.EnPrefix[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prefix" element
     */
    public uk.nhs.connect.iucds.ucr.EnPrefix getPrefixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnPrefix target = null;
            target = (uk.nhs.connect.iucds.ucr.EnPrefix)get_store().find_element_user(PREFIX$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prefix" element
     */
    public int sizeOfPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFIX$6);
        }
    }
    
    /**
     * Sets array of all "prefix" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPrefixArray(uk.nhs.connect.iucds.ucr.EnPrefix[] prefixArray)
    {
        check_orphaned();
        arraySetterHelper(prefixArray, PREFIX$6);
    }
    
    /**
     * Sets ith "prefix" element
     */
    public void setPrefixArray(int i, uk.nhs.connect.iucds.ucr.EnPrefix prefix)
    {
        generatedSetterHelperImpl(prefix, PREFIX$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    public uk.nhs.connect.iucds.ucr.EnPrefix insertNewPrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnPrefix target = null;
            target = (uk.nhs.connect.iucds.ucr.EnPrefix)get_store().insert_element_user(PREFIX$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    public uk.nhs.connect.iucds.ucr.EnPrefix addNewPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnPrefix target = null;
            target = (uk.nhs.connect.iucds.ucr.EnPrefix)get_store().add_element_user(PREFIX$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "prefix" element
     */
    public void removePrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFIX$6, i);
        }
    }
    
    /**
     * Gets array of all "suffix" elements
     */
    public uk.nhs.connect.iucds.ucr.EnSuffix[] getSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUFFIX$8, targetList);
            uk.nhs.connect.iucds.ucr.EnSuffix[] result = new uk.nhs.connect.iucds.ucr.EnSuffix[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "suffix" element
     */
    public uk.nhs.connect.iucds.ucr.EnSuffix getSuffixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnSuffix target = null;
            target = (uk.nhs.connect.iucds.ucr.EnSuffix)get_store().find_element_user(SUFFIX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "suffix" element
     */
    public int sizeOfSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFFIX$8);
        }
    }
    
    /**
     * Sets array of all "suffix" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSuffixArray(uk.nhs.connect.iucds.ucr.EnSuffix[] suffixArray)
    {
        check_orphaned();
        arraySetterHelper(suffixArray, SUFFIX$8);
    }
    
    /**
     * Sets ith "suffix" element
     */
    public void setSuffixArray(int i, uk.nhs.connect.iucds.ucr.EnSuffix suffix)
    {
        generatedSetterHelperImpl(suffix, SUFFIX$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suffix" element
     */
    public uk.nhs.connect.iucds.ucr.EnSuffix insertNewSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnSuffix target = null;
            target = (uk.nhs.connect.iucds.ucr.EnSuffix)get_store().insert_element_user(SUFFIX$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suffix" element
     */
    public uk.nhs.connect.iucds.ucr.EnSuffix addNewSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EnSuffix target = null;
            target = (uk.nhs.connect.iucds.ucr.EnSuffix)get_store().add_element_user(SUFFIX$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "suffix" element
     */
    public void removeSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFFIX$8, i);
        }
    }
    
    /**
     * Gets the "validTime" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().find_element_user(VALIDTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validTime" element
     */
    public boolean isSetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDTIME$10) != 0;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
    public void setValidTime(uk.nhs.connect.iucds.ucr.IVLTS validTime)
    {
        generatedSetterHelperImpl(validTime, VALIDTIME$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public uk.nhs.connect.iucds.ucr.IVLTS addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IVLTS target = null;
            target = (uk.nhs.connect.iucds.ucr.IVLTS)get_store().add_element_user(VALIDTIME$10);
            return target;
        }
    }
    
    /**
     * Unsets the "validTime" element
     */
    public void unsetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDTIME$10, 0);
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
            target = (uk.nhs.connect.iucds.ucr.II)get_store().find_element_user(ID$12, 0);
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
            return get_store().count_elements(ID$12) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(uk.nhs.connect.iucds.ucr.II id)
    {
        generatedSetterHelperImpl(id, ID$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (uk.nhs.connect.iucds.ucr.II)get_store().add_element_user(ID$12);
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
            get_store().remove_element(ID$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$14);
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
    public uk.nhs.connect.iucds.ucr.SetCsEntityNameUse xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.SetCsEntityNameUse target = null;
            target = (uk.nhs.connect.iucds.ucr.SetCsEntityNameUse)get_store().find_attribute_user(USE$14);
            return target;
        }
    }
    
    /**
     * True if has "use" attribute
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$14);
            }
            target.setListValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(uk.nhs.connect.iucds.ucr.SetCsEntityNameUse use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.SetCsEntityNameUse target = null;
            target = (uk.nhs.connect.iucds.ucr.SetCsEntityNameUse)get_store().find_attribute_user(USE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.SetCsEntityNameUse)get_store().add_attribute_user(USE$14);
            }
            target.set(use);
        }
    }
    
    /**
     * Unsets the "use" attribute
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USE$14);
        }
    }
}
