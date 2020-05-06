/*
 * XML Type:  POCD_MT000002UK01.RelatedSubject
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedSubject
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.RelatedSubject(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01RelatedSubjectImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedSubject
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01RelatedSubjectImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CODE$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName ADDR$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "addr");
    private static final javax.xml.namespace.QName TELECOM$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "telecom");
    private static final javax.xml.namespace.QName SUBJECT$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "subject");
    private static final javax.xml.namespace.QName NULLFLAVOR$16 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$18 = 
        new javax.xml.namespace.QName("", "classCode");
    
    
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
     * Gets the "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(CODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$8) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(uk.nhs.connect.iucds.cda.ucr.CE code)
    {
        generatedSetterHelperImpl(code, CODE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(CODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$8, 0);
        }
    }
    
    /**
     * Gets array of all "addr" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.AD[] getAddrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDR$10, targetList);
            uk.nhs.connect.iucds.cda.ucr.AD[] result = new uk.nhs.connect.iucds.cda.ucr.AD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "addr" element
     */
    public uk.nhs.connect.iucds.cda.ucr.AD getAddrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.AD target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.AD)get_store().find_element_user(ADDR$10, i);
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
            return get_store().count_elements(ADDR$10);
        }
    }
    
    /**
     * Sets array of all "addr" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAddrArray(uk.nhs.connect.iucds.cda.ucr.AD[] addrArray)
    {
        check_orphaned();
        arraySetterHelper(addrArray, ADDR$10);
    }
    
    /**
     * Sets ith "addr" element
     */
    public void setAddrArray(int i, uk.nhs.connect.iucds.cda.ucr.AD addr)
    {
        generatedSetterHelperImpl(addr, ADDR$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "addr" element
     */
    public uk.nhs.connect.iucds.cda.ucr.AD insertNewAddr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.AD target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.AD)get_store().insert_element_user(ADDR$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "addr" element
     */
    public uk.nhs.connect.iucds.cda.ucr.AD addNewAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.AD target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.AD)get_store().add_element_user(ADDR$10);
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
            get_store().remove_element(ADDR$10, i);
        }
    }
    
    /**
     * Gets array of all "telecom" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.TEL[] getTelecomArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TELECOM$12, targetList);
            uk.nhs.connect.iucds.cda.ucr.TEL[] result = new uk.nhs.connect.iucds.cda.ucr.TEL[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "telecom" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TEL getTelecomArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TEL target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TEL)get_store().find_element_user(TELECOM$12, i);
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
            return get_store().count_elements(TELECOM$12);
        }
    }
    
    /**
     * Sets array of all "telecom" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTelecomArray(uk.nhs.connect.iucds.cda.ucr.TEL[] telecomArray)
    {
        check_orphaned();
        arraySetterHelper(telecomArray, TELECOM$12);
    }
    
    /**
     * Sets ith "telecom" element
     */
    public void setTelecomArray(int i, uk.nhs.connect.iucds.cda.ucr.TEL telecom)
    {
        generatedSetterHelperImpl(telecom, TELECOM$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "telecom" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TEL insertNewTelecom(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TEL target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TEL)get_store().insert_element_user(TELECOM$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "telecom" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TEL addNewTelecom()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TEL target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TEL)get_store().add_element_user(TELECOM$12);
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
            get_store().remove_element(TELECOM$12, i);
        }
    }
    
    /**
     * Gets the "subject" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubjectPerson getSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubjectPerson target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubjectPerson)get_store().find_element_user(SUBJECT$14, 0);
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
    public void setSubject(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubjectPerson subject)
    {
        generatedSetterHelperImpl(subject, SUBJECT$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subject" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubjectPerson addNewSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubjectPerson target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubjectPerson)get_store().add_element_user(SUBJECT$14);
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
     * Gets the "nullFlavor" attribute
     */
    public java.lang.String getNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
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
            return get_store().find_attribute_user(NULLFLAVOR$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$16);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$16);
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
            get_store().remove_attribute(NULLFLAVOR$16);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.XDocumentSubjectX.Enum getClassCode()
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
            return (uk.nhs.connect.iucds.cda.ucr.XDocumentSubjectX.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.XDocumentSubject xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.XDocumentSubject target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.XDocumentSubject)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.XDocumentSubject)get_default_attribute_value(CLASSCODE$18);
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
            return get_store().find_attribute_user(CLASSCODE$18) != null;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(uk.nhs.connect.iucds.cda.ucr.XDocumentSubjectX.Enum classCode)
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
            target.setEnumValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.XDocumentSubject classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.XDocumentSubject target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.XDocumentSubject)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.XDocumentSubject)get_store().add_attribute_user(CLASSCODE$18);
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
            get_store().remove_attribute(CLASSCODE$18);
        }
    }
}
