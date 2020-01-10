/*
 * XML Type:  POCD_MT200001GB02.ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML POCD_MT200001GB02.ClinicalDocument(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT200001GB02ClinicalDocument1Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT200001GB02ClinicalDocument1Impl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName CONFIDENTIALITYCODE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "confidentialityCode");
    private static final javax.xml.namespace.QName EFFECTIVETIME$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "effectiveTime");
    private static final javax.xml.namespace.QName ID$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "id");
    private static final javax.xml.namespace.QName MESSAGETYPE$8 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "messageType");
    private static final javax.xml.namespace.QName SETID$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "setId");
    private static final javax.xml.namespace.QName TITLE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "title");
    private static final javax.xml.namespace.QName TYPEID$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "typeId");
    private static final javax.xml.namespace.QName VERSIONNUMBER$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "versionNumber");
    private static final javax.xml.namespace.QName AUTHOR$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "author");
    private static final javax.xml.namespace.QName AUTHORIZATION$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "authorization");
    private static final javax.xml.namespace.QName COMPONENT$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "component");
    private static final javax.xml.namespace.QName COMPONENTOF$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "componentOf");
    private static final javax.xml.namespace.QName CUSTODIAN$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "custodian");
    private static final javax.xml.namespace.QName DOCUMENTATIONOF$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "documentationOf");
    private static final javax.xml.namespace.QName INFORMANT$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informant");
    private static final javax.xml.namespace.QName INFORMATIONRECIPIENT$32 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "informationRecipient");
    private static final javax.xml.namespace.QName PARTICIPANT$34 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "participant");
    private static final javax.xml.namespace.QName RECORDTARGET$36 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "recordTarget");
    private static final javax.xml.namespace.QName RELATEDDOCUMENT$38 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "relatedDocument");
    private static final javax.xml.namespace.QName TRACKER$40 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "tracker");
    private static final javax.xml.namespace.QName NULLFLAVOR$42 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName UPDATEMODE$44 = 
        new javax.xml.namespace.QName("", "updateMode");
    private static final javax.xml.namespace.QName CLASSCODE$46 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName MOODCODE$48 = 
        new javax.xml.namespace.QName("", "moodCode");
    
    
    /**
     * Gets the "code" element
     */
    public uk.nhs.connect.iucds.ucr.CV getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.ucr.CV)get_store().find_element_user(CODE$0, 0);
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
    public void setCode(uk.nhs.connect.iucds.ucr.CV code)
    {
        generatedSetterHelperImpl(code, CODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public uk.nhs.connect.iucds.ucr.CV addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.ucr.CV)get_store().add_element_user(CODE$0);
            return target;
        }
    }
    
    /**
     * Gets the "confidentialityCode" element
     */
    public uk.nhs.connect.iucds.ucr.CV getConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.ucr.CV)get_store().find_element_user(CONFIDENTIALITYCODE$2, 0);
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
    public void setConfidentialityCode(uk.nhs.connect.iucds.ucr.CV confidentialityCode)
    {
        generatedSetterHelperImpl(confidentialityCode, CONFIDENTIALITYCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    public uk.nhs.connect.iucds.ucr.CV addNewConfidentialityCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.ucr.CV)get_store().add_element_user(CONFIDENTIALITYCODE$2);
            return target;
        }
    }
    
    /**
     * Gets the "effectiveTime" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime getEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime)get_store().find_element_user(EFFECTIVETIME$4, 0);
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
    public void setEffectiveTime(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime effectiveTime)
    {
        generatedSetterHelperImpl(effectiveTime, EFFECTIVETIME$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime addNewEffectiveTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime)get_store().add_element_user(EFFECTIVETIME$4);
            return target;
        }
    }
    
    /**
     * Gets the "id" element
     */
    public uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory target = null;
            target = (uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory)get_store().find_element_user(ID$6, 0);
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
    public void setId(uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory id)
    {
        generatedSetterHelperImpl(id, ID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "id" element
     */
    public uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory target = null;
            target = (uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory)get_store().add_element_user(ID$6);
            return target;
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
     * Gets the "setId" element
     */
    public uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory getSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory target = null;
            target = (uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory)get_store().find_element_user(SETID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "setId" element
     */
    public void setSetId(uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory setId)
    {
        generatedSetterHelperImpl(setId, SETID$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "setId" element
     */
    public uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory addNewSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory target = null;
            target = (uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory)get_store().add_element_user(SETID$10);
            return target;
        }
    }
    
    /**
     * Gets the "title" element
     */
    public uk.nhs.connect.iucds.ucr.STTitle getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.STTitle target = null;
            target = (uk.nhs.connect.iucds.ucr.STTitle)get_store().find_element_user(TITLE$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(uk.nhs.connect.iucds.ucr.STTitle title)
    {
        generatedSetterHelperImpl(title, TITLE$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "title" element
     */
    public uk.nhs.connect.iucds.ucr.STTitle addNewTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.STTitle target = null;
            target = (uk.nhs.connect.iucds.ucr.STTitle)get_store().add_element_user(TITLE$12);
            return target;
        }
    }
    
    /**
     * Gets the "typeId" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId getTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId)get_store().find_element_user(TYPEID$14, 0);
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
    public void setTypeId(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId typeId)
    {
        generatedSetterHelperImpl(typeId, TYPEID$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId addNewTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId)get_store().add_element_user(TYPEID$14);
            return target;
        }
    }
    
    /**
     * Gets the "versionNumber" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber getVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber)get_store().find_element_user(VERSIONNUMBER$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "versionNumber" element
     */
    public void setVersionNumber(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber versionNumber)
    {
        generatedSetterHelperImpl(versionNumber, VERSIONNUMBER$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "versionNumber" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber addNewVersionNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber)get_store().add_element_user(VERSIONNUMBER$16);
            return target;
        }
    }
    
    /**
     * Gets array of all "author" elements
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHOR$18, targetList);
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author[] result = new uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author)get_store().find_element_user(AUTHOR$18, i);
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
            return get_store().count_elements(AUTHOR$18);
        }
    }
    
    /**
     * Sets array of all "author" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author[] authorArray)
    {
        check_orphaned();
        arraySetterHelper(authorArray, AUTHOR$18);
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author author)
    {
        generatedSetterHelperImpl(author, AUTHOR$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author)get_store().insert_element_user(AUTHOR$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author)get_store().add_element_user(AUTHOR$18);
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
            get_store().remove_element(AUTHOR$18, i);
        }
    }
    
    /**
     * Gets array of all "authorization" elements
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization[] getAuthorizationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(AUTHORIZATION$20, targetList);
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization[] result = new uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "authorization" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization getAuthorizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization)get_store().find_element_user(AUTHORIZATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "authorization" element
     */
    public boolean isNilAuthorizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization)get_store().find_element_user(AUTHORIZATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
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
            return get_store().count_elements(AUTHORIZATION$20);
        }
    }
    
    /**
     * Sets array of all "authorization" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAuthorizationArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization[] authorizationArray)
    {
        check_orphaned();
        arraySetterHelper(authorizationArray, AUTHORIZATION$20);
    }
    
    /**
     * Sets ith "authorization" element
     */
    public void setAuthorizationArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization authorization)
    {
        generatedSetterHelperImpl(authorization, AUTHORIZATION$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "authorization" element
     */
    public void setNilAuthorizationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization)get_store().find_element_user(AUTHORIZATION$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorization" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization insertNewAuthorization(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization)get_store().insert_element_user(AUTHORIZATION$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorization" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization addNewAuthorization()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization)get_store().add_element_user(AUTHORIZATION$20);
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
            get_store().remove_element(AUTHORIZATION$20, i);
        }
    }
    
    /**
     * Gets the "component" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 getComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5)get_store().find_element_user(COMPONENT$22, 0);
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
    public void setComponent(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 component)
    {
        generatedSetterHelperImpl(component, COMPONENT$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "component" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 addNewComponent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5)get_store().add_element_user(COMPONENT$22);
            return target;
        }
    }
    
    /**
     * Gets the "componentOf" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component getComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component)get_store().find_element_user(COMPONENTOF$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "componentOf" element
     */
    public void setComponentOf(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component componentOf)
    {
        generatedSetterHelperImpl(componentOf, COMPONENTOF$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "componentOf" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component addNewComponentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component)get_store().add_element_user(COMPONENTOF$24);
            return target;
        }
    }
    
    /**
     * Gets the "custodian" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian getCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian)get_store().find_element_user(CUSTODIAN$26, 0);
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
    public void setCustodian(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian custodian)
    {
        generatedSetterHelperImpl(custodian, CUSTODIAN$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian addNewCustodian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian)get_store().add_element_user(CUSTODIAN$26);
            return target;
        }
    }
    
    /**
     * Gets array of all "documentationOf" elements
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf[] getDocumentationOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DOCUMENTATIONOF$28, targetList);
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf[] result = new uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "documentationOf" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf getDocumentationOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf)get_store().find_element_user(DOCUMENTATIONOF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "documentationOf" element
     */
    public boolean isNilDocumentationOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf)get_store().find_element_user(DOCUMENTATIONOF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
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
            return get_store().count_elements(DOCUMENTATIONOF$28);
        }
    }
    
    /**
     * Sets array of all "documentationOf" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setDocumentationOfArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf[] documentationOfArray)
    {
        check_orphaned();
        arraySetterHelper(documentationOfArray, DOCUMENTATIONOF$28);
    }
    
    /**
     * Sets ith "documentationOf" element
     */
    public void setDocumentationOfArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf documentationOf)
    {
        generatedSetterHelperImpl(documentationOf, DOCUMENTATIONOF$28, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "documentationOf" element
     */
    public void setNilDocumentationOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf)get_store().find_element_user(DOCUMENTATIONOF$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationOf" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf insertNewDocumentationOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf)get_store().insert_element_user(DOCUMENTATIONOF$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationOf" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf addNewDocumentationOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf)get_store().add_element_user(DOCUMENTATIONOF$28);
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
            get_store().remove_element(DOCUMENTATIONOF$28, i);
        }
    }
    
    /**
     * Gets array of all "informant" elements
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant[] getInformantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMANT$30, targetList);
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant[] result = new uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "informant" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant getInformantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant)get_store().find_element_user(INFORMANT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "informant" element
     */
    public boolean isNilInformantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant)get_store().find_element_user(INFORMANT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
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
            return get_store().count_elements(INFORMANT$30);
        }
    }
    
    /**
     * Sets array of all "informant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInformantArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant[] informantArray)
    {
        check_orphaned();
        arraySetterHelper(informantArray, INFORMANT$30);
    }
    
    /**
     * Sets ith "informant" element
     */
    public void setInformantArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant informant)
    {
        generatedSetterHelperImpl(informant, INFORMANT$30, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "informant" element
     */
    public void setNilInformantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant)get_store().find_element_user(INFORMANT$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informant" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant insertNewInformant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant)get_store().insert_element_user(INFORMANT$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informant" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant addNewInformant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant)get_store().add_element_user(INFORMANT$30);
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
            get_store().remove_element(INFORMANT$30, i);
        }
    }
    
    /**
     * Gets array of all "informationRecipient" elements
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient[] getInformationRecipientArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(INFORMATIONRECIPIENT$32, targetList);
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient[] result = new uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "informationRecipient" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient getInformationRecipientArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient)get_store().find_element_user(INFORMATIONRECIPIENT$32, i);
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
            return get_store().count_elements(INFORMATIONRECIPIENT$32);
        }
    }
    
    /**
     * Sets array of all "informationRecipient" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInformationRecipientArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient[] informationRecipientArray)
    {
        check_orphaned();
        arraySetterHelper(informationRecipientArray, INFORMATIONRECIPIENT$32);
    }
    
    /**
     * Sets ith "informationRecipient" element
     */
    public void setInformationRecipientArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient informationRecipient)
    {
        generatedSetterHelperImpl(informationRecipient, INFORMATIONRECIPIENT$32, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationRecipient" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient insertNewInformationRecipient(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient)get_store().insert_element_user(INFORMATIONRECIPIENT$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informationRecipient" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient addNewInformationRecipient()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient)get_store().add_element_user(INFORMATIONRECIPIENT$32);
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
            get_store().remove_element(INFORMATIONRECIPIENT$32, i);
        }
    }
    
    /**
     * Gets array of all "participant" elements
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant[] getParticipantArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTICIPANT$34, targetList);
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant[] result = new uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "participant" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant getParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant)get_store().find_element_user(PARTICIPANT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "participant" element
     */
    public boolean isNilParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant)get_store().find_element_user(PARTICIPANT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
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
            return get_store().count_elements(PARTICIPANT$34);
        }
    }
    
    /**
     * Sets array of all "participant" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParticipantArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant[] participantArray)
    {
        check_orphaned();
        arraySetterHelper(participantArray, PARTICIPANT$34);
    }
    
    /**
     * Sets ith "participant" element
     */
    public void setParticipantArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant participant)
    {
        generatedSetterHelperImpl(participant, PARTICIPANT$34, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "participant" element
     */
    public void setNilParticipantArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant)get_store().find_element_user(PARTICIPANT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant insertNewParticipant(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant)get_store().insert_element_user(PARTICIPANT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant addNewParticipant()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant)get_store().add_element_user(PARTICIPANT$34);
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
            get_store().remove_element(PARTICIPANT$34, i);
        }
    }
    
    /**
     * Gets the "recordTarget" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget getRecordTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget)get_store().find_element_user(RECORDTARGET$36, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "recordTarget" element
     */
    public void setRecordTarget(uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget recordTarget)
    {
        generatedSetterHelperImpl(recordTarget, RECORDTARGET$36, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "recordTarget" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget addNewRecordTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget)get_store().add_element_user(RECORDTARGET$36);
            return target;
        }
    }
    
    /**
     * Gets the "relatedDocument" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf getRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf)get_store().find_element_user(RELATEDDOCUMENT$38, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "relatedDocument" element
     */
    public boolean isNilRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf)get_store().find_element_user(RELATEDDOCUMENT$38, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "relatedDocument" element
     */
    public boolean isSetRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDDOCUMENT$38) != 0;
        }
    }
    
    /**
     * Sets the "relatedDocument" element
     */
    public void setRelatedDocument(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf relatedDocument)
    {
        generatedSetterHelperImpl(relatedDocument, RELATEDDOCUMENT$38, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedDocument" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf addNewRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf)get_store().add_element_user(RELATEDDOCUMENT$38);
            return target;
        }
    }
    
    /**
     * Nils the "relatedDocument" element
     */
    public void setNilRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf)get_store().find_element_user(RELATEDDOCUMENT$38, 0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf)get_store().add_element_user(RELATEDDOCUMENT$38);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "relatedDocument" element
     */
    public void unsetRelatedDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDDOCUMENT$38, 0);
        }
    }
    
    /**
     * Gets array of all "tracker" elements
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker[] getTrackerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRACKER$40, targetList);
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker[] result = new uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tracker" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker getTrackerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker)get_store().find_element_user(TRACKER$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Tests for nil ith "tracker" element
     */
    public boolean isNilTrackerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker)get_store().find_element_user(TRACKER$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.isNil();
        }
    }
    
    /**
     * Returns number of "tracker" element
     */
    public int sizeOfTrackerArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKER$40);
        }
    }
    
    /**
     * Sets array of all "tracker" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTrackerArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker[] trackerArray)
    {
        check_orphaned();
        arraySetterHelper(trackerArray, TRACKER$40);
    }
    
    /**
     * Sets ith "tracker" element
     */
    public void setTrackerArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker tracker)
    {
        generatedSetterHelperImpl(tracker, TRACKER$40, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Nils the ith "tracker" element
     */
    public void setNilTrackerArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker)get_store().find_element_user(TRACKER$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setNil();
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tracker" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker insertNewTracker(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker)get_store().insert_element_user(TRACKER$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tracker" element
     */
    public uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker addNewTracker()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker target = null;
            target = (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker)get_store().add_element_user(TRACKER$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "tracker" element
     */
    public void removeTracker(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKER$40, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$42);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$42);
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
            return get_store().find_attribute_user(NULLFLAVOR$42) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$42);
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
            target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$42);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$42);
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
            get_store().remove_attribute(NULLFLAVOR$42);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$44);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$44);
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
            return get_store().find_attribute_user(UPDATEMODE$44) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UPDATEMODE$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UPDATEMODE$44);
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
            target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().find_attribute_user(UPDATEMODE$44);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.CsUpdateMode)get_store().add_attribute_user(UPDATEMODE$44);
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
            get_store().remove_attribute(UPDATEMODE$44);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$46);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$46);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(CLASSCODE$46);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$46);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$46);
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
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CLASSCODE$46);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(CLASSCODE$46);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MOODCODE$48);
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
    public uk.nhs.connect.iucds.ucr.Cs2 xgetMoodCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(MOODCODE$48);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_default_attribute_value(MOODCODE$48);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MOODCODE$48);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MOODCODE$48);
            }
            target.setStringValue(moodCode);
        }
    }
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    public void xsetMoodCode(uk.nhs.connect.iucds.ucr.Cs2 moodCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(MOODCODE$48);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(MOODCODE$48);
            }
            target.set(moodCode);
        }
    }
    /**
     * An XML effectiveTime(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class EffectiveTimeImpl extends uk.nhs.connect.iucds.ucr.impl.TSImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime
    {
        private static final long serialVersionUID = 1L;
        
        public EffectiveTimeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public uk.nhs.connect.iucds.ucr.Ts2 xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Ts2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Ts2)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$0) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(uk.nhs.connect.iucds.ucr.Ts2 value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Ts2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Ts2)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Ts2)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$0);
            }
        }
    }
    /**
     * An XML versionNumber(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class VersionNumberImpl extends uk.nhs.connect.iucds.ucr.impl.INTImpl implements uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber
    {
        private static final long serialVersionUID = 1L;
        
        public VersionNumberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName VALUE$0 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "value" attribute
         */
        public java.math.BigInteger getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    return null;
                }
                return target.getBigIntegerValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public uk.nhs.connect.iucds.ucr.Int2 xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Int2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Int2)get_store().find_attribute_user(VALUE$0);
                return target;
            }
        }
        
        /**
         * True if has "value" attribute
         */
        public boolean isSetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VALUE$0) != null;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.math.BigInteger value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
                }
                target.setBigIntegerValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(uk.nhs.connect.iucds.ucr.Int2 value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.Int2 target = null;
                target = (uk.nhs.connect.iucds.ucr.Int2)get_store().find_attribute_user(VALUE$0);
                if (target == null)
                {
                    target = (uk.nhs.connect.iucds.ucr.Int2)get_store().add_attribute_user(VALUE$0);
                }
                target.set(value);
            }
        }
        
        /**
         * Unsets the "value" attribute
         */
        public void unsetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VALUE$0);
            }
        }
    }
}
