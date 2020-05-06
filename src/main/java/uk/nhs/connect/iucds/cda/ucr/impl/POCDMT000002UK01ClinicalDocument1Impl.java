/*
 * XML Type:  POCD_MT000002UK01.ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.ClinicalDocument(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01ClinicalDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01ClinicalDocument1Impl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName MESSAGETYPE$8 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "messageType");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName CODE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName TITLE$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "title");
    private static final javax.xml.namespace.QName EFFECTIVETIME$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "effectiveTime");
    private static final javax.xml.namespace.QName CONFIDENTIALITYCODE$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "confidentialityCode");
    private static final javax.xml.namespace.QName LANGUAGECODE$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "languageCode");
    private static final javax.xml.namespace.QName SETID$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "setId");
    private static final javax.xml.namespace.QName VERSIONNUMBER$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "versionNumber");
    private static final javax.xml.namespace.QName COPYTIME$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "copyTime");
    private static final javax.xml.namespace.QName RECORDTARGET$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "recordTarget");
    private static final javax.xml.namespace.QName AUTHOR$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "author");
    private static final javax.xml.namespace.QName DATAENTERER$32 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "dataEnterer");
    private static final javax.xml.namespace.QName INFORMANT$34 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informant");
    private static final javax.xml.namespace.QName CUSTODIAN$36 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "custodian");
    private static final javax.xml.namespace.QName INFORMATIONRECIPIENT$38 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informationRecipient");
    private static final javax.xml.namespace.QName LEGALAUTHENTICATOR$40 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "legalAuthenticator");
    private static final javax.xml.namespace.QName AUTHENTICATOR$42 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "authenticator");
    private static final javax.xml.namespace.QName PARTICIPANT$44 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "participant");
    private static final javax.xml.namespace.QName INFULFILLMENTOF$46 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "inFulfillmentOf");
    private static final javax.xml.namespace.QName DOCUMENTATIONOF$48 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "documentationOf");
    private static final javax.xml.namespace.QName RELATEDDOCUMENT$50 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "relatedDocument");
    private static final javax.xml.namespace.QName AUTHORIZATION$52 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "authorization");
    private static final javax.xml.namespace.QName COMPONENTOF$54 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "componentOf");
    private static final javax.xml.namespace.QName COMPONENT$56 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "component");
    private static final javax.xml.namespace.QName NULLFLAVOR$58 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$60 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$62 = 
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
     * Gets the "messageType" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.MessageType getMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.MessageType target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.MessageType)get_store().find_element_user(MESSAGETYPE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageType" element
     */
    public void setMessageType(uk.nhs.connect.npfit.hl7.localisation.MessageType messageType)
    {
        generatedSetterHelperImpl(messageType, MESSAGETYPE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "messageType" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.MessageType addNewMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.MessageType target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.MessageType)get_store().add_element_user(MESSAGETYPE$8);
            return target;
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
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().find_element_user(ID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(uk.nhs.connect.iucds.cda.ucr.II id)
    {
        generatedSetterHelperImpl(id, ID$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().add_element_user(ID$10);
            return target;
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
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(CODE$12, 0);
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
    public void setCode(uk.nhs.connect.iucds.cda.ucr.CE code)
    {
        generatedSetterHelperImpl(code, CODE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(CODE$12);
            return target;
        }
    }
    
    /**
     * Gets the "title" element
     */
    public uk.nhs.connect.iucds.cda.ucr.ST getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ST target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ST)get_store().find_element_user(TITLE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$14) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(uk.nhs.connect.iucds.cda.ucr.ST title)
    {
        generatedSetterHelperImpl(title, TITLE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public uk.nhs.connect.iucds.cda.ucr.ST addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ST target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ST)get_store().add_element_user(TITLE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$14, 0);
        }
    }
    
    /**
     * Gets the "effectiveTime" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TS getEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TS)get_store().find_element_user(EFFECTIVETIME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "effectiveTime" element
     */
    public void setEffectiveTime(uk.nhs.connect.iucds.cda.ucr.TS effectiveTime)
    {
        generatedSetterHelperImpl(effectiveTime, EFFECTIVETIME$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TS addNewEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TS)get_store().add_element_user(EFFECTIVETIME$16);
            return target;
        }
    }
    
    /**
     * Gets the "confidentialityCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(CONFIDENTIALITYCODE$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "confidentialityCode" element
     */
    public void setConfidentialityCode(uk.nhs.connect.iucds.cda.ucr.CE confidentialityCode)
    {
        generatedSetterHelperImpl(confidentialityCode, CONFIDENTIALITYCODE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(CONFIDENTIALITYCODE$18);
            return target;
        }
    }
    
    /**
     * Gets the "languageCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS getLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().find_element_user(LANGUAGECODE$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "languageCode" element
     */
    public boolean isSetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LANGUAGECODE$20) != 0;
        }
    }
    
    /**
     * Sets the "languageCode" element
     */
    public void setLanguageCode(uk.nhs.connect.iucds.cda.ucr.CS languageCode)
    {
        generatedSetterHelperImpl(languageCode, LANGUAGECODE$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "languageCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS addNewLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().add_element_user(LANGUAGECODE$20);
            return target;
        }
    }
    
    /**
     * Unsets the "languageCode" element
     */
    public void unsetLanguageCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LANGUAGECODE$20, 0);
        }
    }
    
    /**
     * Gets the "setId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II getSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().find_element_user(SETID$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "setId" element
     */
    public boolean isSetSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SETID$22) != 0;
        }
    }
    
    /**
     * Sets the "setId" element
     */
    public void setSetId(uk.nhs.connect.iucds.cda.ucr.II setId)
    {
        generatedSetterHelperImpl(setId, SETID$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II addNewSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().add_element_user(SETID$22);
            return target;
        }
    }
    
    /**
     * Unsets the "setId" element
     */
    public void unsetSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SETID$22, 0);
        }
    }
    
    /**
     * Gets the "versionNumber" element
     */
    public uk.nhs.connect.iucds.cda.ucr.INT getVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.INT target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.INT)get_store().find_element_user(VERSIONNUMBER$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "versionNumber" element
     */
    public boolean isSetVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VERSIONNUMBER$24) != 0;
        }
    }
    
    /**
     * Sets the "versionNumber" element
     */
    public void setVersionNumber(uk.nhs.connect.iucds.cda.ucr.INT versionNumber)
    {
        generatedSetterHelperImpl(versionNumber, VERSIONNUMBER$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "versionNumber" element
     */
    public uk.nhs.connect.iucds.cda.ucr.INT addNewVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.INT target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.INT)get_store().add_element_user(VERSIONNUMBER$24);
            return target;
        }
    }
    
    /**
     * Unsets the "versionNumber" element
     */
    public void unsetVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VERSIONNUMBER$24, 0);
        }
    }
    
    /**
     * Gets the "copyTime" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TS getCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TS)get_store().find_element_user(COPYTIME$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "copyTime" element
     */
    public boolean isSetCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COPYTIME$26) != 0;
        }
    }
    
    /**
     * Sets the "copyTime" element
     */
    public void setCopyTime(uk.nhs.connect.iucds.cda.ucr.TS copyTime)
    {
        generatedSetterHelperImpl(copyTime, COPYTIME$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "copyTime" element
     */
    public uk.nhs.connect.iucds.cda.ucr.TS addNewCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.TS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.TS)get_store().add_element_user(COPYTIME$26);
            return target;
        }
    }
    
    /**
     * Unsets the "copyTime" element
     */
    public void unsetCopyTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COPYTIME$26, 0);
        }
    }
    
    /**
     * Gets array of all "recordTarget" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget[] getRecordTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RECORDTARGET$28, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "recordTarget" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget getRecordTargetArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget)get_store().find_element_user(RECORDTARGET$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "recordTarget" element
     */
    public int sizeOfRecordTargetArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RECORDTARGET$28);
        }
    }
    
    /**
     * Sets array of all "recordTarget" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRecordTargetArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget[] recordTargetArray)
    {
        check_orphaned();
        arraySetterHelper(recordTargetArray, RECORDTARGET$28);
    }
    
    /**
     * Sets ith "recordTarget" element
     */
    public void setRecordTargetArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget recordTarget)
    {
        generatedSetterHelperImpl(recordTarget, RECORDTARGET$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordTarget" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget insertNewRecordTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget)get_store().insert_element_user(RECORDTARGET$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordTarget" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget addNewRecordTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget)get_store().add_element_user(RECORDTARGET$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "recordTarget" element
     */
    public void removeRecordTarget(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RECORDTARGET$28, i);
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
            get_store().find_all_element_users(AUTHOR$30, targetList);
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
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author)get_store().find_element_user(AUTHOR$30, i);
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
            return get_store().count_elements(AUTHOR$30);
        }
    }
    
    /**
     * Sets array of all "author" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author[] authorArray)
    {
        check_orphaned();
        arraySetterHelper(authorArray, AUTHOR$30);
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author author)
    {
        generatedSetterHelperImpl(author, AUTHOR$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author)get_store().insert_element_user(AUTHOR$30, i);
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
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author)get_store().add_element_user(AUTHOR$30);
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
            get_store().remove_element(AUTHOR$30, i);
        }
    }
    
    /**
     * Gets the "dataEnterer" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer getDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer)get_store().find_element_user(DATAENTERER$32, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "dataEnterer" element
     */
    public boolean isSetDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATAENTERER$32) != 0;
        }
    }
    
    /**
     * Sets the "dataEnterer" element
     */
    public void setDataEnterer(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer dataEnterer)
    {
        generatedSetterHelperImpl(dataEnterer, DATAENTERER$32, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "dataEnterer" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer addNewDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer)get_store().add_element_user(DATAENTERER$32);
            return target;
        }
    }
    
    /**
     * Unsets the "dataEnterer" element
     */
    public void unsetDataEnterer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATAENTERER$32, 0);
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
            get_store().find_all_element_users(INFORMANT$34, targetList);
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
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12)get_store().find_element_user(INFORMANT$34, i);
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
            return get_store().count_elements(INFORMANT$34);
        }
    }
    
    /**
     * Sets array of all "informant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInformantArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12[] informantArray)
    {
        check_orphaned();
        arraySetterHelper(informantArray, INFORMANT$34);
    }
    
    /**
     * Sets ith "informant" element
     */
    public void setInformantArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 informant)
    {
        generatedSetterHelperImpl(informant, INFORMANT$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12)get_store().insert_element_user(INFORMANT$34, i);
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
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12)get_store().add_element_user(INFORMANT$34);
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
            get_store().remove_element(INFORMANT$34, i);
        }
    }
    
    /**
     * Gets the "custodian" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian getCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian)get_store().find_element_user(CUSTODIAN$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "custodian" element
     */
    public void setCustodian(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian custodian)
    {
        generatedSetterHelperImpl(custodian, CUSTODIAN$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian addNewCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian)get_store().add_element_user(CUSTODIAN$36);
            return target;
        }
    }
    
    /**
     * Gets array of all "informationRecipient" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient[] getInformationRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMATIONRECIPIENT$38, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "informationRecipient" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient getInformationRecipientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient)get_store().find_element_user(INFORMATIONRECIPIENT$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "informationRecipient" element
     */
    public int sizeOfInformationRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFORMATIONRECIPIENT$38);
        }
    }
    
    /**
     * Sets array of all "informationRecipient" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInformationRecipientArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient[] informationRecipientArray)
    {
        check_orphaned();
        arraySetterHelper(informationRecipientArray, INFORMATIONRECIPIENT$38);
    }
    
    /**
     * Sets ith "informationRecipient" element
     */
    public void setInformationRecipientArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient informationRecipient)
    {
        generatedSetterHelperImpl(informationRecipient, INFORMATIONRECIPIENT$38, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationRecipient" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient insertNewInformationRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient)get_store().insert_element_user(INFORMATIONRECIPIENT$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informationRecipient" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient addNewInformationRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient)get_store().add_element_user(INFORMATIONRECIPIENT$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "informationRecipient" element
     */
    public void removeInformationRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFORMATIONRECIPIENT$38, i);
        }
    }
    
    /**
     * Gets the "legalAuthenticator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator getLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator)get_store().find_element_user(LEGALAUTHENTICATOR$40, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "legalAuthenticator" element
     */
    public boolean isSetLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LEGALAUTHENTICATOR$40) != 0;
        }
    }
    
    /**
     * Sets the "legalAuthenticator" element
     */
    public void setLegalAuthenticator(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator legalAuthenticator)
    {
        generatedSetterHelperImpl(legalAuthenticator, LEGALAUTHENTICATOR$40, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "legalAuthenticator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator addNewLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator)get_store().add_element_user(LEGALAUTHENTICATOR$40);
            return target;
        }
    }
    
    /**
     * Unsets the "legalAuthenticator" element
     */
    public void unsetLegalAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LEGALAUTHENTICATOR$40, 0);
        }
    }
    
    /**
     * Gets array of all "authenticator" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator[] getAuthenticatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHENTICATOR$42, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "authenticator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator getAuthenticatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator)get_store().find_element_user(AUTHENTICATOR$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "authenticator" element
     */
    public int sizeOfAuthenticatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHENTICATOR$42);
        }
    }
    
    /**
     * Sets array of all "authenticator" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthenticatorArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator[] authenticatorArray)
    {
        check_orphaned();
        arraySetterHelper(authenticatorArray, AUTHENTICATOR$42);
    }
    
    /**
     * Sets ith "authenticator" element
     */
    public void setAuthenticatorArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator authenticator)
    {
        generatedSetterHelperImpl(authenticator, AUTHENTICATOR$42, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authenticator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator insertNewAuthenticator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator)get_store().insert_element_user(AUTHENTICATOR$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authenticator" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator addNewAuthenticator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator)get_store().add_element_user(AUTHENTICATOR$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "authenticator" element
     */
    public void removeAuthenticator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHENTICATOR$42, i);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$44, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1)get_store().find_element_user(PARTICIPANT$44, i);
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
            return get_store().count_elements(PARTICIPANT$44);
        }
    }
    
    /**
     * Sets array of all "participant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1[] participantArray)
    {
        check_orphaned();
        arraySetterHelper(participantArray, PARTICIPANT$44);
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 participant)
    {
        generatedSetterHelperImpl(participant, PARTICIPANT$44, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1)get_store().insert_element_user(PARTICIPANT$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1)get_store().add_element_user(PARTICIPANT$44);
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
            get_store().remove_element(PARTICIPANT$44, i);
        }
    }
    
    /**
     * Gets array of all "inFulfillmentOf" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf[] getInFulfillmentOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFULFILLMENTOF$46, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "inFulfillmentOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf getInFulfillmentOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf)get_store().find_element_user(INFULFILLMENTOF$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "inFulfillmentOf" element
     */
    public int sizeOfInFulfillmentOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INFULFILLMENTOF$46);
        }
    }
    
    /**
     * Sets array of all "inFulfillmentOf" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInFulfillmentOfArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf[] inFulfillmentOfArray)
    {
        check_orphaned();
        arraySetterHelper(inFulfillmentOfArray, INFULFILLMENTOF$46);
    }
    
    /**
     * Sets ith "inFulfillmentOf" element
     */
    public void setInFulfillmentOfArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf inFulfillmentOf)
    {
        generatedSetterHelperImpl(inFulfillmentOf, INFULFILLMENTOF$46, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inFulfillmentOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf insertNewInFulfillmentOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf)get_store().insert_element_user(INFULFILLMENTOF$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inFulfillmentOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf addNewInFulfillmentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf)get_store().add_element_user(INFULFILLMENTOF$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "inFulfillmentOf" element
     */
    public void removeInFulfillmentOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INFULFILLMENTOF$46, i);
        }
    }
    
    /**
     * Gets array of all "documentationOf" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf[] getDocumentationOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTATIONOF$48, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentationOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf getDocumentationOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf)get_store().find_element_user(DOCUMENTATIONOF$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "documentationOf" element
     */
    public int sizeOfDocumentationOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOCUMENTATIONOF$48);
        }
    }
    
    /**
     * Sets array of all "documentationOf" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentationOfArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf[] documentationOfArray)
    {
        check_orphaned();
        arraySetterHelper(documentationOfArray, DOCUMENTATIONOF$48);
    }
    
    /**
     * Sets ith "documentationOf" element
     */
    public void setDocumentationOfArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf documentationOf)
    {
        generatedSetterHelperImpl(documentationOf, DOCUMENTATIONOF$48, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf insertNewDocumentationOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf)get_store().insert_element_user(DOCUMENTATIONOF$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf addNewDocumentationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf)get_store().add_element_user(DOCUMENTATIONOF$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "documentationOf" element
     */
    public void removeDocumentationOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOCUMENTATIONOF$48, i);
        }
    }
    
    /**
     * Gets array of all "relatedDocument" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1[] getRelatedDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RELATEDDOCUMENT$50, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "relatedDocument" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 getRelatedDocumentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1)get_store().find_element_user(RELATEDDOCUMENT$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "relatedDocument" element
     */
    public int sizeOfRelatedDocumentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDDOCUMENT$50);
        }
    }
    
    /**
     * Sets array of all "relatedDocument" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelatedDocumentArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1[] relatedDocumentArray)
    {
        check_orphaned();
        arraySetterHelper(relatedDocumentArray, RELATEDDOCUMENT$50);
    }
    
    /**
     * Sets ith "relatedDocument" element
     */
    public void setRelatedDocumentArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 relatedDocument)
    {
        generatedSetterHelperImpl(relatedDocument, RELATEDDOCUMENT$50, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedDocument" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 insertNewRelatedDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1)get_store().insert_element_user(RELATEDDOCUMENT$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedDocument" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 addNewRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1)get_store().add_element_user(RELATEDDOCUMENT$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "relatedDocument" element
     */
    public void removeRelatedDocument(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDDOCUMENT$50, i);
        }
    }
    
    /**
     * Gets array of all "authorization" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization[] getAuthorizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHORIZATION$52, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "authorization" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization getAuthorizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization)get_store().find_element_user(AUTHORIZATION$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "authorization" element
     */
    public int sizeOfAuthorizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHORIZATION$52);
        }
    }
    
    /**
     * Sets array of all "authorization" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorizationArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization[] authorizationArray)
    {
        check_orphaned();
        arraySetterHelper(authorizationArray, AUTHORIZATION$52);
    }
    
    /**
     * Sets ith "authorization" element
     */
    public void setAuthorizationArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization authorization)
    {
        generatedSetterHelperImpl(authorization, AUTHORIZATION$52, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorization" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization insertNewAuthorization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization)get_store().insert_element_user(AUTHORIZATION$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorization" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization addNewAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization)get_store().add_element_user(AUTHORIZATION$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "authorization" element
     */
    public void removeAuthorization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHORIZATION$52, i);
        }
    }
    
    /**
     * Gets the "componentOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 getComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1)get_store().find_element_user(COMPONENTOF$54, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "componentOf" element
     */
    public boolean isSetComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPONENTOF$54) != 0;
        }
    }
    
    /**
     * Sets the "componentOf" element
     */
    public void setComponentOf(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 componentOf)
    {
        generatedSetterHelperImpl(componentOf, COMPONENTOF$54, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "componentOf" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 addNewComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1)get_store().add_element_user(COMPONENTOF$54);
            return target;
        }
    }
    
    /**
     * Unsets the "componentOf" element
     */
    public void unsetComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPONENTOF$54, 0);
        }
    }
    
    /**
     * Gets the "component" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 getComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2)get_store().find_element_user(COMPONENT$56, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "component" element
     */
    public void setComponent(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 component)
    {
        generatedSetterHelperImpl(component, COMPONENT$56, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "component" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2)get_store().add_element_user(COMPONENT$56);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$58);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$58);
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
            return get_store().find_attribute_user(NULLFLAVOR$58) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$58);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$58);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$58);
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
            get_store().remove_attribute(NULLFLAVOR$58);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.ActClinicalDocumentX.Enum getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$60);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.ActClinicalDocumentX.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1 xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1)get_store().find_attribute_user(CLASSCODE$60);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1)get_default_attribute_value(CLASSCODE$60);
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
            return get_store().find_attribute_user(CLASSCODE$60) != null;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(uk.nhs.connect.iucds.cda.ucr.ActClinicalDocumentX.Enum classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$60);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$60);
            }
            target.setEnumValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1 classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1)get_store().find_attribute_user(CLASSCODE$60);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1)get_store().add_attribute_user(CLASSCODE$60);
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
            get_store().remove_attribute(CLASSCODE$60);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOODCODE$62);
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
            target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_store().find_attribute_user(MOODCODE$62);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_default_attribute_value(MOODCODE$62);
            }
            return target;
        }
    }
    
    /**
     * True if has "moodCode" attribute
     */
    public boolean isSetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MOODCODE$62) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$62);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$62);
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
            target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_store().find_attribute_user(MOODCODE$62);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActMood)get_store().add_attribute_user(MOODCODE$62);
            }
            target.set(moodCode);
        }
    }
    
    /**
     * Unsets the "moodCode" attribute
     */
    public void unsetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MOODCODE$62);
        }
    }
}
