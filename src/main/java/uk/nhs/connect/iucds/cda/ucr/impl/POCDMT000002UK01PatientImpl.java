/*
 * XML Type:  POCD_MT000002UK01.Patient
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.Patient(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01PatientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01PatientImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALMCODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "realmCode");
    private static final javax.xml.namespace.QName TYPEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "typeId");
    private static final javax.xml.namespace.QName TEMPLATEID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName CONTENTID$6 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName NAME$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "name");
    private static final javax.xml.namespace.QName ADMINISTRATIVEGENDERCODE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "administrativeGenderCode");
    private static final javax.xml.namespace.QName BIRTHTIME$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "birthTime");
    private static final javax.xml.namespace.QName MARITALSTATUSCODE$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "maritalStatusCode");
    private static final javax.xml.namespace.QName RELIGIOUSAFFILIATIONCODE$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "religiousAffiliationCode");
    private static final javax.xml.namespace.QName RACECODE$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "raceCode");
    private static final javax.xml.namespace.QName ETHNICGROUPCODE$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "ethnicGroupCode");
    private static final javax.xml.namespace.QName GUARDIAN$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "guardian");
    private static final javax.xml.namespace.QName BIRTHPLACE$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "birthplace");
    private static final javax.xml.namespace.QName LANGUAGECOMMUNICATION$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "languageCommunication");
    private static final javax.xml.namespace.QName NULLFLAVOR$30 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$32 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName DETERMINERCODE$34 = 
        new javax.xml.namespace.QName("", "determinerCode");
    
    
    /**
     * Gets array of all "realmCode" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.CS[] getRealmCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REALMCODE$0, targetList);
            uk.nhs.connect.iucds.cda.ucr.CS[] result = new uk.nhs.connect.iucds.cda.ucr.CS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "realmCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS getRealmCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().find_element_user(REALMCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "realmCode" element
     */
    public int sizeOfRealmCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMCODE$0);
        }
    }
    
    /**
     * Sets array of all "realmCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRealmCodeArray(uk.nhs.connect.iucds.cda.ucr.CS[] realmCodeArray)
    {
        check_orphaned();
        arraySetterHelper(realmCodeArray, REALMCODE$0);
    }
    
    /**
     * Sets ith "realmCode" element
     */
    public void setRealmCodeArray(int i, uk.nhs.connect.iucds.cda.ucr.CS realmCode)
    {
        generatedSetterHelperImpl(realmCode, REALMCODE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realmCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS insertNewRealmCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().insert_element_user(REALMCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realmCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS addNewRealmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().add_element_user(REALMCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "realmCode" element
     */
    public void removeRealmCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMCODE$0, i);
        }
    }
    
    /**
     * Gets the "typeId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId getTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId)get_store().find_element_user(TYPEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "typeId" element
     */
    public boolean isSetTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEID$2) != 0;
        }
    }
    
    /**
     * Sets the "typeId" element
     */
    public void setTypeId(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId typeId)
    {
        generatedSetterHelperImpl(typeId, TYPEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId addNewTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId)get_store().add_element_user(TYPEID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "typeId" element
     */
    public void unsetTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEID$2, 0);
        }
    }
    
    /**
     * Gets array of all "templateId" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.II[] getTemplateIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEMPLATEID$4, targetList);
            uk.nhs.connect.iucds.cda.ucr.II[] result = new uk.nhs.connect.iucds.cda.ucr.II[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "templateId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II getTemplateIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().find_element_user(TEMPLATEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "templateId" element
     */
    public int sizeOfTemplateIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPLATEID$4);
        }
    }
    
    /**
     * Sets array of all "templateId" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTemplateIdArray(uk.nhs.connect.iucds.cda.ucr.II[] templateIdArray)
    {
        check_orphaned();
        arraySetterHelper(templateIdArray, TEMPLATEID$4);
    }
    
    /**
     * Sets ith "templateId" element
     */
    public void setTemplateIdArray(int i, uk.nhs.connect.iucds.cda.ucr.II templateId)
    {
        generatedSetterHelperImpl(templateId, TEMPLATEID$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "templateId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II insertNewTemplateId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().insert_element_user(TEMPLATEID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "templateId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II addNewTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().add_element_user(TEMPLATEID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "templateId" element
     */
    public void removeTemplateId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPLATEID$4, i);
        }
    }
    
    /**
     * Gets the "contentId" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.TemplateContent getContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.TemplateContent target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.TemplateContent)get_store().find_element_user(CONTENTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contentId" element
     */
    public boolean isSetContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTID$6) != 0;
        }
    }
    
    /**
     * Sets the "contentId" element
     */
    public void setContentId(uk.nhs.connect.npfit.hl7.localisation.TemplateContent contentId)
    {
        generatedSetterHelperImpl(contentId, CONTENTID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contentId" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.TemplateContent addNewContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.TemplateContent target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.TemplateContent)get_store().add_element_user(CONTENTID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "contentId" element
     */
    public void unsetContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTID$6, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().find_element_user(ID$8, 0);
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
            return get_store().count_elements(ID$8) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(uk.nhs.connect.iucds.cda.ucr.II id)
    {
        generatedSetterHelperImpl(id, ID$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "id" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().add_element_user(ID$8);
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
            get_store().remove_element(ID$8, 0);
        }
    }
    
    /**
     * Gets array of all "name" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.PN[] getNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(NAME$10, targetList);
            uk.nhs.connect.iucds.cda.ucr.PN[] result = new uk.nhs.connect.iucds.cda.ucr.PN[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "name" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PN getNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PN target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PN)get_store().find_element_user(NAME$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "name" element
     */
    public int sizeOfNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$10);
        }
    }
    
    /**
     * Sets array of all "name" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setNameArray(uk.nhs.connect.iucds.cda.ucr.PN[] nameArray)
    {
        check_orphaned();
        arraySetterHelper(nameArray, NAME$10);
    }
    
    /**
     * Sets ith "name" element
     */
    public void setNameArray(int i, uk.nhs.connect.iucds.cda.ucr.PN name)
    {
        generatedSetterHelperImpl(name, NAME$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PN insertNewName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PN target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PN)get_store().insert_element_user(NAME$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    public uk.nhs.connect.iucds.cda.ucr.PN addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.PN target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.PN)get_store().add_element_user(NAME$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "name" element
     */
    public void removeName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$10, i);
        }
    }
    
    /**
     * Gets the "administrativeGenderCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(ADMINISTRATIVEGENDERCODE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "administrativeGenderCode" element
     */
    public boolean isSetAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADMINISTRATIVEGENDERCODE$12) != 0;
        }
    }
    
    /**
     * Sets the "administrativeGenderCode" element
     */
    public void setAdministrativeGenderCode(uk.nhs.connect.iucds.cda.ucr.CE administrativeGenderCode)
    {
        generatedSetterHelperImpl(administrativeGenderCode, ADMINISTRATIVEGENDERCODE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "administrativeGenderCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(ADMINISTRATIVEGENDERCODE$12);
            return target;
        }
    }
    
    /**
     * Unsets the "administrativeGenderCode" element
     */
    public void unsetAdministrativeGenderCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADMINISTRATIVEGENDERCODE$12, 0);
        }
    }
    
    /**
     * Gets the "birthTime" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TS getBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TS)get_store().find_element_user(BIRTHTIME$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "birthTime" element
     */
    public boolean isSetBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHTIME$14) != 0;
        }
    }
    
    /**
     * Sets the "birthTime" element
     */
    public void setBirthTime(uk.nhs.connect.iucds.cda.ucr.TS birthTime)
    {
        generatedSetterHelperImpl(birthTime, BIRTHTIME$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "birthTime" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TS addNewBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TS)get_store().add_element_user(BIRTHTIME$14);
            return target;
        }
    }
    
    /**
     * Unsets the "birthTime" element
     */
    public void unsetBirthTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHTIME$14, 0);
        }
    }
    
    /**
     * Gets the "maritalStatusCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(MARITALSTATUSCODE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "maritalStatusCode" element
     */
    public boolean isSetMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MARITALSTATUSCODE$16) != 0;
        }
    }
    
    /**
     * Sets the "maritalStatusCode" element
     */
    public void setMaritalStatusCode(uk.nhs.connect.iucds.cda.ucr.CE maritalStatusCode)
    {
        generatedSetterHelperImpl(maritalStatusCode, MARITALSTATUSCODE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maritalStatusCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(MARITALSTATUSCODE$16);
            return target;
        }
    }
    
    /**
     * Unsets the "maritalStatusCode" element
     */
    public void unsetMaritalStatusCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MARITALSTATUSCODE$16, 0);
        }
    }
    
    /**
     * Gets the "religiousAffiliationCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(RELIGIOUSAFFILIATIONCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "religiousAffiliationCode" element
     */
    public boolean isSetReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELIGIOUSAFFILIATIONCODE$18) != 0;
        }
    }
    
    /**
     * Sets the "religiousAffiliationCode" element
     */
    public void setReligiousAffiliationCode(uk.nhs.connect.iucds.cda.ucr.CE religiousAffiliationCode)
    {
        generatedSetterHelperImpl(religiousAffiliationCode, RELIGIOUSAFFILIATIONCODE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "religiousAffiliationCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(RELIGIOUSAFFILIATIONCODE$18);
            return target;
        }
    }
    
    /**
     * Unsets the "religiousAffiliationCode" element
     */
    public void unsetReligiousAffiliationCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELIGIOUSAFFILIATIONCODE$18, 0);
        }
    }
    
    /**
     * Gets the "raceCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(RACECODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "raceCode" element
     */
    public boolean isSetRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RACECODE$20) != 0;
        }
    }
    
    /**
     * Sets the "raceCode" element
     */
    public void setRaceCode(uk.nhs.connect.iucds.cda.ucr.CE raceCode)
    {
        generatedSetterHelperImpl(raceCode, RACECODE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "raceCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(RACECODE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "raceCode" element
     */
    public void unsetRaceCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RACECODE$20, 0);
        }
    }
    
    /**
     * Gets the "ethnicGroupCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(ETHNICGROUPCODE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "ethnicGroupCode" element
     */
    public boolean isSetEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ETHNICGROUPCODE$22) != 0;
        }
    }
    
    /**
     * Sets the "ethnicGroupCode" element
     */
    public void setEthnicGroupCode(uk.nhs.connect.iucds.cda.ucr.CE ethnicGroupCode)
    {
        generatedSetterHelperImpl(ethnicGroupCode, ETHNICGROUPCODE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ethnicGroupCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(ETHNICGROUPCODE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "ethnicGroupCode" element
     */
    public void unsetEthnicGroupCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ETHNICGROUPCODE$22, 0);
        }
    }
    
    /**
     * Gets array of all "guardian" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian[] getGuardianArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GUARDIAN$24, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "guardian" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian getGuardianArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian)get_store().find_element_user(GUARDIAN$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "guardian" element
     */
    public int sizeOfGuardianArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GUARDIAN$24);
        }
    }
    
    /**
     * Sets array of all "guardian" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGuardianArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian[] guardianArray)
    {
        check_orphaned();
        arraySetterHelper(guardianArray, GUARDIAN$24);
    }
    
    /**
     * Sets ith "guardian" element
     */
    public void setGuardianArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian guardian)
    {
        generatedSetterHelperImpl(guardian, GUARDIAN$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guardian" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian insertNewGuardian(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian)get_store().insert_element_user(GUARDIAN$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guardian" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian addNewGuardian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian)get_store().add_element_user(GUARDIAN$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "guardian" element
     */
    public void removeGuardian(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GUARDIAN$24, i);
        }
    }
    
    /**
     * Gets the "birthplace" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace getBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace)get_store().find_element_user(BIRTHPLACE$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "birthplace" element
     */
    public boolean isSetBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BIRTHPLACE$26) != 0;
        }
    }
    
    /**
     * Sets the "birthplace" element
     */
    public void setBirthplace(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace birthplace)
    {
        generatedSetterHelperImpl(birthplace, BIRTHPLACE$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "birthplace" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace addNewBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace)get_store().add_element_user(BIRTHPLACE$26);
            return target;
        }
    }
    
    /**
     * Unsets the "birthplace" element
     */
    public void unsetBirthplace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BIRTHPLACE$26, 0);
        }
    }
    
    /**
     * Gets array of all "languageCommunication" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication[] getLanguageCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LANGUAGECOMMUNICATION$28, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "languageCommunication" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication getLanguageCommunicationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication)get_store().find_element_user(LANGUAGECOMMUNICATION$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "languageCommunication" element
     */
    public int sizeOfLanguageCommunicationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECOMMUNICATION$28);
        }
    }
    
    /**
     * Sets array of all "languageCommunication" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLanguageCommunicationArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication[] languageCommunicationArray)
    {
        check_orphaned();
        arraySetterHelper(languageCommunicationArray, LANGUAGECOMMUNICATION$28);
    }
    
    /**
     * Sets ith "languageCommunication" element
     */
    public void setLanguageCommunicationArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication languageCommunication)
    {
        generatedSetterHelperImpl(languageCommunication, LANGUAGECOMMUNICATION$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageCommunication" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication insertNewLanguageCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication)get_store().insert_element_user(LANGUAGECOMMUNICATION$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "languageCommunication" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication addNewLanguageCommunication()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication)get_store().add_element_user(LANGUAGECOMMUNICATION$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "languageCommunication" element
     */
    public void removeLanguageCommunication(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECOMMUNICATION$28, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$30);
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
    public uk.nhs.connect.iucds.cda.ucr.NullFlavor xgetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$30);
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
            return get_store().find_attribute_user(NULLFLAVOR$30) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$30);
            }
            target.setStringValue(nullFlavor);
        }
    }
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    public void xsetNullFlavor(uk.nhs.connect.iucds.cda.ucr.NullFlavor nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$30);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$30);
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
            get_store().remove_attribute(NULLFLAVOR$30);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$32);
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
    public uk.nhs.connect.iucds.cda.ucr.EntityClass xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityClass target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityClass)get_store().find_attribute_user(CLASSCODE$32);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityClass)get_default_attribute_value(CLASSCODE$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "classCode" attribute
     */
    public boolean isSetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSCODE$32) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$32);
            }
            target.setStringValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.EntityClass classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityClass target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityClass)get_store().find_attribute_user(CLASSCODE$32);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityClass)get_store().add_attribute_user(CLASSCODE$32);
            }
            target.set(classCode);
        }
    }
    
    /**
     * Unsets the "classCode" attribute
     */
    public void unsetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSCODE$32);
        }
    }
    
    /**
     * Gets the "determinerCode" attribute
     */
    public java.lang.String getDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINERCODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DETERMINERCODE$34);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "determinerCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.EntityDeterminer xgetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityDeterminer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_store().find_attribute_user(DETERMINERCODE$34);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_default_attribute_value(DETERMINERCODE$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "determinerCode" attribute
     */
    public boolean isSetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETERMINERCODE$34) != null;
        }
    }
    
    /**
     * Sets the "determinerCode" attribute
     */
    public void setDeterminerCode(java.lang.String determinerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINERCODE$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETERMINERCODE$34);
            }
            target.setStringValue(determinerCode);
        }
    }
    
    /**
     * Sets (as xml) the "determinerCode" attribute
     */
    public void xsetDeterminerCode(uk.nhs.connect.iucds.cda.ucr.EntityDeterminer determinerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityDeterminer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_store().find_attribute_user(DETERMINERCODE$34);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_store().add_attribute_user(DETERMINERCODE$34);
            }
            target.set(determinerCode);
        }
    }
    
    /**
     * Unsets the "determinerCode" attribute
     */
    public void unsetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETERMINERCODE$34);
        }
    }
}
