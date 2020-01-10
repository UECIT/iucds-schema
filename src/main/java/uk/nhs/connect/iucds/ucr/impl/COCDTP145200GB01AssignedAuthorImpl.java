/*
 * XML Type:  COCD_TP145200GB01.AssignedAuthor
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML COCD_TP145200GB01.AssignedAuthor(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class COCDTP145200GB01AssignedAuthorImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor
{
    private static final long serialVersionUID = 1L;
    
    public COCDTP145200GB01AssignedAuthorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ADDR$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "addr");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName TELECOM$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "telecom");
    private static final javax.xml.namespace.QName TEMPLATEID$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName ASSIGNEDPERSON$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "assignedPerson");
    private static final javax.xml.namespace.QName REPRESENTEDORGANIZATION$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "representedOrganization");
    private static final javax.xml.namespace.QName NULLFLAVOR$14 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$16 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName CLASSCODE$18 = 
        new javax.xml.namespace.QName("", "classCode");
    
    
    /**
     * Gets array of all "addr" elements
     */
    public uk.nhs.connect.iucds.ucr.AD[] getAddrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDR$0, targetList);
            uk.nhs.connect.iucds.ucr.AD[] result = new uk.nhs.connect.iucds.ucr.AD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "addr" element
     */
    public uk.nhs.connect.iucds.ucr.AD getAddrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.AD target = null;
            target = (uk.nhs.connect.iucds.ucr.AD)get_store().find_element_user(ADDR$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "addr" element
     */
    public int sizeOfAddrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDR$0);
        }
    }
    
    /**
     * Sets array of all "addr" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddrArray(uk.nhs.connect.iucds.ucr.AD[] addrArray)
    {
        check_orphaned();
        arraySetterHelper(addrArray, ADDR$0);
    }
    
    /**
     * Sets ith "addr" element
     */
    public void setAddrArray(int i, uk.nhs.connect.iucds.ucr.AD addr)
    {
        generatedSetterHelperImpl(addr, ADDR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addr" element
     */
    public uk.nhs.connect.iucds.ucr.AD insertNewAddr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.AD target = null;
            target = (uk.nhs.connect.iucds.ucr.AD)get_store().insert_element_user(ADDR$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addr" element
     */
    public uk.nhs.connect.iucds.ucr.AD addNewAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.AD target = null;
            target = (uk.nhs.connect.iucds.ucr.AD)get_store().add_element_user(ADDR$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "addr" element
     */
    public void removeAddr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDR$0, i);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public uk.nhs.connect.iucds.ucr.CVNPfITCodedplainRequired getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CVNPfITCodedplainRequired target = null;
            target = (uk.nhs.connect.iucds.ucr.CVNPfITCodedplainRequired)get_store().find_element_user(CODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(uk.nhs.connect.iucds.ucr.CVNPfITCodedplainRequired code)
    {
        generatedSetterHelperImpl(code, CODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public uk.nhs.connect.iucds.ucr.CVNPfITCodedplainRequired addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CVNPfITCodedplainRequired target = null;
            target = (uk.nhs.connect.iucds.ucr.CVNPfITCodedplainRequired)get_store().add_element_user(CODE$2);
            return target;
        }
    }
    
    /**
     * Gets array of all "id" elements
     */
    public uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$4, targetList);
            uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName[] result = new uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName target = null;
            target = (uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName)get_store().find_element_user(ID$4, i);
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
            return get_store().count_elements(ID$4);
        }
    }
    
    /**
     * Sets array of all "id" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdArray(uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName[] idArray)
    {
        check_orphaned();
        arraySetterHelper(idArray, ID$4);
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName id)
    {
        generatedSetterHelperImpl(id, ID$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName target = null;
            target = (uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName)get_store().insert_element_user(ID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    public uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName target = null;
            target = (uk.nhs.connect.iucds.ucr.IINPfITOidRequiredAssigningAuthorityName)get_store().add_element_user(ID$4);
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
            get_store().remove_element(ID$4, i);
        }
    }
    
    /**
     * Gets array of all "telecom" elements
     */
    public uk.nhs.connect.iucds.ucr.TEL[] getTelecomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELECOM$6, targetList);
            uk.nhs.connect.iucds.ucr.TEL[] result = new uk.nhs.connect.iucds.ucr.TEL[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "telecom" element
     */
    public uk.nhs.connect.iucds.ucr.TEL getTelecomArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.TEL target = null;
            target = (uk.nhs.connect.iucds.ucr.TEL)get_store().find_element_user(TELECOM$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "telecom" element
     */
    public int sizeOfTelecomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TELECOM$6);
        }
    }
    
    /**
     * Sets array of all "telecom" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTelecomArray(uk.nhs.connect.iucds.ucr.TEL[] telecomArray)
    {
        check_orphaned();
        arraySetterHelper(telecomArray, TELECOM$6);
    }
    
    /**
     * Sets ith "telecom" element
     */
    public void setTelecomArray(int i, uk.nhs.connect.iucds.ucr.TEL telecom)
    {
        generatedSetterHelperImpl(telecom, TELECOM$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "telecom" element
     */
    public uk.nhs.connect.iucds.ucr.TEL insertNewTelecom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.TEL target = null;
            target = (uk.nhs.connect.iucds.ucr.TEL)get_store().insert_element_user(TELECOM$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "telecom" element
     */
    public uk.nhs.connect.iucds.ucr.TEL addNewTelecom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.TEL target = null;
            target = (uk.nhs.connect.iucds.ucr.TEL)get_store().add_element_user(TELECOM$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "telecom" element
     */
    public void removeTelecom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TELECOM$6, i);
        }
    }
    
    /**
     * Gets the "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId getTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId)get_store().find_element_user(TEMPLATEID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "templateId" element
     */
    public void setTemplateId(uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId templateId)
    {
        generatedSetterHelperImpl(templateId, TEMPLATEID$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "templateId" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId addNewTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId)get_store().add_element_user(TEMPLATEID$8);
            return target;
        }
    }
    
    /**
     * Gets the "assignedPerson" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01Person getAssignedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01Person target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01Person)get_store().find_element_user(ASSIGNEDPERSON$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "assignedPerson" element
     */
    public void setAssignedPerson(uk.nhs.connect.iucds.ucr.COCDTP145200GB01Person assignedPerson)
    {
        generatedSetterHelperImpl(assignedPerson, ASSIGNEDPERSON$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "assignedPerson" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01Person addNewAssignedPerson()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01Person target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01Person)get_store().add_element_user(ASSIGNEDPERSON$10);
            return target;
        }
    }
    
    /**
     * Gets the "representedOrganization" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01Organization getRepresentedOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01Organization target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01Organization)get_store().find_element_user(REPRESENTEDORGANIZATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "representedOrganization" element
     */
    public void setRepresentedOrganization(uk.nhs.connect.iucds.ucr.COCDTP145200GB01Organization representedOrganization)
    {
        generatedSetterHelperImpl(representedOrganization, REPRESENTEDORGANIZATION$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "representedOrganization" element
     */
    public uk.nhs.connect.iucds.ucr.COCDTP145200GB01Organization addNewRepresentedOrganization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.COCDTP145200GB01Organization target = null;
            target = (uk.nhs.connect.iucds.ucr.COCDTP145200GB01Organization)get_store().add_element_user(REPRESENTEDORGANIZATION$12);
            return target;
        }
    }
    
    /**
     * Gets the "nullFlavor" attribute
     */
    public java.lang.String getNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    public uk.nhs.connect.iucds.ucr.NullFlavor xgetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$14);
            return target;
        }
    }
    
    /**
     * True if has "nullFlavor" attribute
     */
    public boolean isSetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NULLFLAVOR$14) != null;
        }
    }
    
    /**
     * Sets the "nullFlavor" attribute
     */
    public void setNullFlavor(java.lang.String nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$14);
            }
            target.setStringValue(nullFlavor);
        }
    }
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    public void xsetNullFlavor(uk.nhs.connect.iucds.ucr.NullFlavor nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$14);
            }
            target.set(nullFlavor);
        }
    }
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    public void unsetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NULLFLAVOR$14);
        }
    }
    
    /**
     * Gets the "updateMode" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum getUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$16);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "updateMode" attribute
     */
    public uk.nhs.connect.iucds.ucr.CsUpdateMode xgetUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsUpdateMode target = null;
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$16);
            return target;
        }
    }
    
    /**
     * True if has "updateMode" attribute
     */
    public boolean isSetUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UPDATEMODE$16) != null;
        }
    }
    
    /**
     * Sets the "updateMode" attribute
     */
    public void setUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum updateMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$16);
            }
            target.setEnumValue(updateMode);
        }
    }
    
    /**
     * Sets (as xml) the "updateMode" attribute
     */
    public void xsetUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode updateMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CsUpdateMode target = null;
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$16);
            }
            target.set(updateMode);
        }
    }
    
    /**
     * Unsets the "updateMode" attribute
     */
    public void unsetUpdateMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UPDATEMODE$16);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public java.lang.String getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$18);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public uk.nhs.connect.iucds.ucr.Cs2 xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(CLASSCODE$18);
            }
            return target;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(java.lang.String classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$18);
            }
            target.setStringValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(uk.nhs.connect.iucds.ucr.Cs2 classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(CLASSCODE$18);
            }
            target.set(classCode);
        }
    }
    /**
     * An XML templateId(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class TemplateIdImpl extends uk.nhs.connect.iucds.ucr.impl.IIImpl implements uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId
    {
        private static final long serialVersionUID = 1L;
        
        public TemplateIdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ROOT$0 = 
            new javax.xml.namespace.QName("", "root");
        private static final javax.xml.namespace.QName EXTENSION$2 = 
            new javax.xml.namespace.QName("", "extension");
        
        
        /**
         * Gets the "root" attribute
         */
        public java.lang.String getRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "root" attribute
         */
        public uk.nhs.connect.iucds.ucr.Uid xgetRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Uid target = null;
                target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(ROOT$0);
                return target;
            }
        }
        
        /**
         * True if has "root" attribute
         */
        public boolean isSetRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ROOT$0) != null;
            }
        }
        
        /**
         * Sets the "root" attribute
         */
        public void setRoot(java.lang.String root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOT$0);
                }
                target.setStringValue(root);
            }
        }
        
        /**
         * Sets (as xml) the "root" attribute
         */
        public void xsetRoot(uk.nhs.connect.iucds.ucr.Uid root)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Uid target = null;
                target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(ROOT$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Uid)get_store().add_attribute_user(ROOT$0);
                }
                target.set(root);
            }
        }
        
        /**
         * Unsets the "root" attribute
         */
        public void unsetRoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ROOT$0);
            }
        }
        
        /**
         * Gets the "extension" attribute
         */
        public java.lang.String getExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "extension" attribute
         */
        public uk.nhs.connect.iucds.ucr.St2 xgetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.St2 target = null;
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(EXTENSION$2);
                return target;
            }
        }
        
        /**
         * True if has "extension" attribute
         */
        public boolean isSetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(EXTENSION$2) != null;
            }
        }
        
        /**
         * Sets the "extension" attribute
         */
        public void setExtension(java.lang.String extension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENSION$2);
                }
                target.setStringValue(extension);
            }
        }
        
        /**
         * Sets (as xml) the "extension" attribute
         */
        public void xsetExtension(uk.nhs.connect.iucds.ucr.St2 extension)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.St2 target = null;
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(EXTENSION$2);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.St2)get_store().add_attribute_user(EXTENSION$2);
                }
                target.set(extension);
            }
        }
        
        /**
         * Unsets the "extension" attribute
         */
        public void unsetExtension()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(EXTENSION$2);
            }
        }
        /**
         * An XML root(@).
         *
         * This is a union type. Instances are of one of the following types:
         *     uk.nhs.connect.iucds.ucr.Oid
         *     uk.nhs.connect.iucds.ucr.Uuid
         *     uk.nhs.connect.iucds.ucr.Ruid
         */
        public static class RootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId.Root, uk.nhs.connect.iucds.ucr.Oid, uk.nhs.connect.iucds.ucr.Uuid, uk.nhs.connect.iucds.ucr.Ruid
        {
            private static final long serialVersionUID = 1L;
            
            public RootImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected RootImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML extension(@).
         *
         * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor$TemplateId$Extension.
         */
        public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.COCDTP145200GB01AssignedAuthor.TemplateId.Extension
        {
            private static final long serialVersionUID = 1L;
            
            public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected ExtensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
    }
}
