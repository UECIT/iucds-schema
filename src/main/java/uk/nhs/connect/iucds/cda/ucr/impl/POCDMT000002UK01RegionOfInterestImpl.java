/*
 * XML Type:  POCD_MT000002UK01.RegionOfInterest
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.RegionOfInterest(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01RegionOfInterestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01RegionOfInterestImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CODE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName VALUE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "value");
    private static final javax.xml.namespace.QName SUBJECT$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "subject");
    private static final javax.xml.namespace.QName SPECIMEN$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "specimen");
    private static final javax.xml.namespace.QName PERFORMER$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "performer");
    private static final javax.xml.namespace.QName AUTHOR$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "author");
    private static final javax.xml.namespace.QName INFORMANT$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informant");
    private static final javax.xml.namespace.QName PARTICIPANT$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "participant");
    private static final javax.xml.namespace.QName ENTRYRELATIONSHIP$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "entryRelationship");
    private static final javax.xml.namespace.QName REFERENCE$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "reference");
    private static final javax.xml.namespace.QName PRECONDITION$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "precondition");
    private static final javax.xml.namespace.QName ID$32 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName NULLFLAVOR$34 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$36 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$38 = 
        new javax.xml.namespace.QName("", "moodCode");
    
    
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
     * Gets array of all "id" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.II[] getIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ID$8, targetList);
            uk.nhs.connect.iucds.cda.ucr.II[] result = new uk.nhs.connect.iucds.cda.ucr.II[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "id" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II getIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().find_element_user(ID$8, i);
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
            return get_store().count_elements(ID$8);
        }
    }
    
    /**
     * Sets array of all "id" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setIdArray(uk.nhs.connect.iucds.cda.ucr.II[] idArray)
    {
        check_orphaned();
        arraySetterHelper(idArray, ID$8);
    }
    
    /**
     * Sets ith "id" element
     */
    public void setIdArray(int i, uk.nhs.connect.iucds.cda.ucr.II id)
    {
        generatedSetterHelperImpl(id, ID$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II insertNewId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().insert_element_user(ID$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
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
     * Removes the ith "id" element
     */
    public void removeId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$8, i);
        }
    }
    
    /**
     * Gets the "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().find_element_user(CODE$10, 0);
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
    public void setCode(uk.nhs.connect.iucds.cda.ucr.CS code)
    {
        generatedSetterHelperImpl(code, CODE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().add_element_user(CODE$10);
            return target;
        }
    }
    
    /**
     * Gets array of all "value" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue[] getValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(VALUE$12, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "value" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue getValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue)get_store().find_element_user(VALUE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "value" element
     */
    public int sizeOfValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$12);
        }
    }
    
    /**
     * Sets array of all "value" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setValueArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue[] valueArray)
    {
        check_orphaned();
        arraySetterHelper(valueArray, VALUE$12);
    }
    
    /**
     * Sets ith "value" element
     */
    public void setValueArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue value)
    {
        generatedSetterHelperImpl(value, VALUE$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "value" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue insertNewValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue)get_store().insert_element_user(VALUE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "value" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterestValue)get_store().add_element_user(VALUE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "value" element
     */
    public void removeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$12, i);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject)get_store().find_element_user(SUBJECT$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "subject" element
     */
    public boolean isSetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBJECT$14) != 0;
        }
    }
    
    /**
     * Sets the "subject" element
     */
    public void setSubject(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject)get_store().add_element_user(SUBJECT$14);
            return target;
        }
    }
    
    /**
     * Unsets the "subject" element
     */
    public void unsetSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBJECT$14, 0);
        }
    }
    
    /**
     * Gets array of all "specimen" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen[] getSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SPECIMEN$16, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "specimen" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen getSpecimenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen)get_store().find_element_user(SPECIMEN$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "specimen" element
     */
    public int sizeOfSpecimenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SPECIMEN$16);
        }
    }
    
    /**
     * Sets array of all "specimen" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSpecimenArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen[] specimenArray)
    {
        check_orphaned();
        arraySetterHelper(specimenArray, SPECIMEN$16);
    }
    
    /**
     * Sets ith "specimen" element
     */
    public void setSpecimenArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen specimen)
    {
        generatedSetterHelperImpl(specimen, SPECIMEN$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specimen" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen insertNewSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen)get_store().insert_element_user(SPECIMEN$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specimen" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen addNewSpecimen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen)get_store().add_element_user(SPECIMEN$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "specimen" element
     */
    public void removeSpecimen(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SPECIMEN$16, i);
        }
    }
    
    /**
     * Gets array of all "performer" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2[] getPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PERFORMER$18, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "performer" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 getPerformerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2)get_store().find_element_user(PERFORMER$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "performer" element
     */
    public int sizeOfPerformerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERFORMER$18);
        }
    }
    
    /**
     * Sets array of all "performer" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPerformerArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2[] performerArray)
    {
        check_orphaned();
        arraySetterHelper(performerArray, PERFORMER$18);
    }
    
    /**
     * Sets ith "performer" element
     */
    public void setPerformerArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 performer)
    {
        generatedSetterHelperImpl(performer, PERFORMER$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 insertNewPerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2)get_store().insert_element_user(PERFORMER$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 addNewPerformer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2)get_store().add_element_user(PERFORMER$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "performer" element
     */
    public void removePerformer(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERFORMER$18, i);
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$20, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author)get_store().find_element_user(AUTHOR$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$20);
        }
    }
    
    /**
     * Sets array of all "author" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author[] authorArray)
    {
        check_orphaned();
        arraySetterHelper(authorArray, AUTHOR$20);
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author author)
    {
        generatedSetterHelperImpl(author, AUTHOR$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author)get_store().insert_element_user(AUTHOR$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author)get_store().add_element_user(AUTHOR$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$20, i);
        }
    }
    
    /**
     * Gets array of all "informant" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12[] getInformantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMANT$22, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "informant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 getInformantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12)get_store().find_element_user(INFORMANT$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "informant" element
     */
    public int sizeOfInformantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMANT$22);
        }
    }
    
    /**
     * Sets array of all "informant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInformantArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12[] informantArray)
    {
        check_orphaned();
        arraySetterHelper(informantArray, INFORMANT$22);
    }
    
    /**
     * Sets ith "informant" element
     */
    public void setInformantArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 informant)
    {
        generatedSetterHelperImpl(informant, INFORMANT$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 insertNewInformant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12)get_store().insert_element_user(INFORMANT$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 addNewInformant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12)get_store().add_element_user(INFORMANT$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "informant" element
     */
    public void removeInformant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMANT$22, i);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$24, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2)get_store().find_element_user(PARTICIPANT$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "participant" element
     */
    public int sizeOfParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTICIPANT$24);
        }
    }
    
    /**
     * Sets array of all "participant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2[] participantArray)
    {
        check_orphaned();
        arraySetterHelper(participantArray, PARTICIPANT$24);
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 participant)
    {
        generatedSetterHelperImpl(participant, PARTICIPANT$24, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2)get_store().insert_element_user(PARTICIPANT$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2)get_store().add_element_user(PARTICIPANT$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "participant" element
     */
    public void removeParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTICIPANT$24, i);
        }
    }
    
    /**
     * Gets array of all "entryRelationship" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship[] getEntryRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTRYRELATIONSHIP$26, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entryRelationship" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship getEntryRelationshipArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship)get_store().find_element_user(ENTRYRELATIONSHIP$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entryRelationship" element
     */
    public int sizeOfEntryRelationshipArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTRYRELATIONSHIP$26);
        }
    }
    
    /**
     * Sets array of all "entryRelationship" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntryRelationshipArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship[] entryRelationshipArray)
    {
        check_orphaned();
        arraySetterHelper(entryRelationshipArray, ENTRYRELATIONSHIP$26);
    }
    
    /**
     * Sets ith "entryRelationship" element
     */
    public void setEntryRelationshipArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship entryRelationship)
    {
        generatedSetterHelperImpl(entryRelationship, ENTRYRELATIONSHIP$26, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entryRelationship" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship insertNewEntryRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship)get_store().insert_element_user(ENTRYRELATIONSHIP$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entryRelationship" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship addNewEntryRelationship()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship)get_store().add_element_user(ENTRYRELATIONSHIP$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "entryRelationship" element
     */
    public void removeEntryRelationship(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTRYRELATIONSHIP$26, i);
        }
    }
    
    /**
     * Gets array of all "reference" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference[] getReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REFERENCE$28, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "reference" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference getReferenceArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference)get_store().find_element_user(REFERENCE$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "reference" element
     */
    public int sizeOfReferenceArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$28);
        }
    }
    
    /**
     * Sets array of all "reference" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setReferenceArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference[] referenceArray)
    {
        check_orphaned();
        arraySetterHelper(referenceArray, REFERENCE$28);
    }
    
    /**
     * Sets ith "reference" element
     */
    public void setReferenceArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference insertNewReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference)get_store().insert_element_user(REFERENCE$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference)get_store().add_element_user(REFERENCE$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "reference" element
     */
    public void removeReference(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$28, i);
        }
    }
    
    /**
     * Gets array of all "precondition" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition[] getPreconditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRECONDITION$30, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "precondition" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition getPreconditionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition)get_store().find_element_user(PRECONDITION$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "precondition" element
     */
    public int sizeOfPreconditionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECONDITION$30);
        }
    }
    
    /**
     * Sets array of all "precondition" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPreconditionArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition[] preconditionArray)
    {
        check_orphaned();
        arraySetterHelper(preconditionArray, PRECONDITION$30);
    }
    
    /**
     * Sets ith "precondition" element
     */
    public void setPreconditionArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition precondition)
    {
        generatedSetterHelperImpl(precondition, PRECONDITION$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "precondition" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition insertNewPrecondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition)get_store().insert_element_user(PRECONDITION$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "precondition" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition addNewPrecondition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition)get_store().add_element_user(PRECONDITION$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "precondition" element
     */
    public void removePrecondition(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECONDITION$30, i);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$32);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$32);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$32) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$32);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$32);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$32);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$34);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$34);
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
            return get_store().find_attribute_user(NULLFLAVOR$34) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$34);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$34);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$34);
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
            get_store().remove_attribute(NULLFLAVOR$34);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$36);
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
    public uk.nhs.connect.iucds.cda.ucr.ActClass xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActClass target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActClass)get_store().find_attribute_user(CLASSCODE$36);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActClass)get_default_attribute_value(CLASSCODE$36);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$36);
            }
            target.setStringValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.ActClass classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActClass target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActClass)get_store().find_attribute_user(CLASSCODE$36);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActClass)get_store().add_attribute_user(CLASSCODE$36);
            }
            target.set(classCode);
        }
    }
    
    /**
     * Gets the "moodCode" attribute
     */
    public java.lang.String getMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOODCODE$38);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.ActMood xgetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActMood target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_store().find_attribute_user(MOODCODE$38);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_default_attribute_value(MOODCODE$38);
            }
            return target;
        }
    }
    
    /**
     * Sets the "moodCode" attribute
     */
    public void setMoodCode(java.lang.String moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$38);
            }
            target.setStringValue(moodCode);
        }
    }
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    public void xsetMoodCode(uk.nhs.connect.iucds.cda.ucr.ActMood moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActMood target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_store().find_attribute_user(MOODCODE$38);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_store().add_attribute_user(MOODCODE$38);
            }
            target.set(moodCode);
        }
    }
}
