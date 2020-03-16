/*
 * XML Type:  POCD_MT000002UK01.Component4
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component4
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.Component4(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01Component4Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component4
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01Component4Impl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName SEQUENCENUMBER$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sequenceNumber");
    private static final javax.xml.namespace.QName SEPERATABLEIND$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "seperatableInd");
    private static final javax.xml.namespace.QName ACT$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "act");
    private static final javax.xml.namespace.QName ENCOUNTER$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "encounter");
    private static final javax.xml.namespace.QName OBSERVATION$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "observation");
    private static final javax.xml.namespace.QName OBSERVATIONMEDIA$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "observationMedia");
    private static final javax.xml.namespace.QName ORGANIZER$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "organizer");
    private static final javax.xml.namespace.QName PROCEDURE$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "procedure");
    private static final javax.xml.namespace.QName REGIONOFINTEREST$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "regionOfInterest");
    private static final javax.xml.namespace.QName SUBSTANCEADMINISTRATION$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "substanceAdministration");
    private static final javax.xml.namespace.QName SUPPLY$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "supply");
    private static final javax.xml.namespace.QName NULLFLAVOR$30 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName TYPECODE$32 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONDUCTIONIND$34 = 
        new javax.xml.namespace.QName("", "contextConductionInd");
    
    
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
     * Gets the "sequenceNumber" element
     */
    public uk.nhs.connect.iucds.cda.ucr.INT getSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.INT target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.INT)get_store().find_element_user(SEQUENCENUMBER$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sequenceNumber" element
     */
    public boolean isSetSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEQUENCENUMBER$8) != 0;
        }
    }
    
    /**
     * Sets the "sequenceNumber" element
     */
    public void setSequenceNumber(uk.nhs.connect.iucds.cda.ucr.INT sequenceNumber)
    {
        generatedSetterHelperImpl(sequenceNumber, SEQUENCENUMBER$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sequenceNumber" element
     */
    public uk.nhs.connect.iucds.cda.ucr.INT addNewSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.INT target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.INT)get_store().add_element_user(SEQUENCENUMBER$8);
            return target;
        }
    }
    
    /**
     * Unsets the "sequenceNumber" element
     */
    public void unsetSequenceNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEQUENCENUMBER$8, 0);
        }
    }
    
    /**
     * Gets the "seperatableInd" element
     */
    public uk.nhs.connect.iucds.cda.ucr.BL getSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.BL target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.BL)get_store().find_element_user(SEPERATABLEIND$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "seperatableInd" element
     */
    public boolean isSetSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEPERATABLEIND$10) != 0;
        }
    }
    
    /**
     * Sets the "seperatableInd" element
     */
    public void setSeperatableInd(uk.nhs.connect.iucds.cda.ucr.BL seperatableInd)
    {
        generatedSetterHelperImpl(seperatableInd, SEPERATABLEIND$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "seperatableInd" element
     */
    public uk.nhs.connect.iucds.cda.ucr.BL addNewSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.BL target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.BL)get_store().add_element_user(SEPERATABLEIND$10);
            return target;
        }
    }
    
    /**
     * Unsets the "seperatableInd" element
     */
    public void unsetSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEPERATABLEIND$10, 0);
        }
    }
    
    /**
     * Gets the "act" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act getAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act)get_store().find_element_user(ACT$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "act" element
     */
    public boolean isSetAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACT$12) != 0;
        }
    }
    
    /**
     * Sets the "act" element
     */
    public void setAct(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act act)
    {
        generatedSetterHelperImpl(act, ACT$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "act" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act addNewAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act)get_store().add_element_user(ACT$12);
            return target;
        }
    }
    
    /**
     * Unsets the "act" element
     */
    public void unsetAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACT$12, 0);
        }
    }
    
    /**
     * Gets the "encounter" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter getEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter)get_store().find_element_user(ENCOUNTER$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "encounter" element
     */
    public boolean isSetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENCOUNTER$14) != 0;
        }
    }
    
    /**
     * Sets the "encounter" element
     */
    public void setEncounter(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter encounter)
    {
        generatedSetterHelperImpl(encounter, ENCOUNTER$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter addNewEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter)get_store().add_element_user(ENCOUNTER$14);
            return target;
        }
    }
    
    /**
     * Unsets the "encounter" element
     */
    public void unsetEncounter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENCOUNTER$14, 0);
        }
    }
    
    /**
     * Gets the "observation" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation getObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation)get_store().find_element_user(OBSERVATION$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "observation" element
     */
    public boolean isSetObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBSERVATION$16) != 0;
        }
    }
    
    /**
     * Sets the "observation" element
     */
    public void setObservation(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation observation)
    {
        generatedSetterHelperImpl(observation, OBSERVATION$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "observation" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation addNewObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation)get_store().add_element_user(OBSERVATION$16);
            return target;
        }
    }
    
    /**
     * Unsets the "observation" element
     */
    public void unsetObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBSERVATION$16, 0);
        }
    }
    
    /**
     * Gets the "observationMedia" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia getObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia)get_store().find_element_user(OBSERVATIONMEDIA$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "observationMedia" element
     */
    public boolean isSetObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBSERVATIONMEDIA$18) != 0;
        }
    }
    
    /**
     * Sets the "observationMedia" element
     */
    public void setObservationMedia(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia observationMedia)
    {
        generatedSetterHelperImpl(observationMedia, OBSERVATIONMEDIA$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "observationMedia" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia addNewObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia)get_store().add_element_user(OBSERVATIONMEDIA$18);
            return target;
        }
    }
    
    /**
     * Unsets the "observationMedia" element
     */
    public void unsetObservationMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBSERVATIONMEDIA$18, 0);
        }
    }
    
    /**
     * Gets the "organizer" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer getOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer)get_store().find_element_user(ORGANIZER$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "organizer" element
     */
    public boolean isSetOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORGANIZER$20) != 0;
        }
    }
    
    /**
     * Sets the "organizer" element
     */
    public void setOrganizer(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer organizer)
    {
        generatedSetterHelperImpl(organizer, ORGANIZER$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "organizer" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer addNewOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer)get_store().add_element_user(ORGANIZER$20);
            return target;
        }
    }
    
    /**
     * Unsets the "organizer" element
     */
    public void unsetOrganizer()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORGANIZER$20, 0);
        }
    }
    
    /**
     * Gets the "procedure" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure getProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure)get_store().find_element_user(PROCEDURE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "procedure" element
     */
    public boolean isSetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROCEDURE$22) != 0;
        }
    }
    
    /**
     * Sets the "procedure" element
     */
    public void setProcedure(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure procedure)
    {
        generatedSetterHelperImpl(procedure, PROCEDURE$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "procedure" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure addNewProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure)get_store().add_element_user(PROCEDURE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "procedure" element
     */
    public void unsetProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROCEDURE$22, 0);
        }
    }
    
    /**
     * Gets the "regionOfInterest" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest getRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest)get_store().find_element_user(REGIONOFINTEREST$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "regionOfInterest" element
     */
    public boolean isSetRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REGIONOFINTEREST$24) != 0;
        }
    }
    
    /**
     * Sets the "regionOfInterest" element
     */
    public void setRegionOfInterest(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest regionOfInterest)
    {
        generatedSetterHelperImpl(regionOfInterest, REGIONOFINTEREST$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "regionOfInterest" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest addNewRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest)get_store().add_element_user(REGIONOFINTEREST$24);
            return target;
        }
    }
    
    /**
     * Unsets the "regionOfInterest" element
     */
    public void unsetRegionOfInterest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REGIONOFINTEREST$24, 0);
        }
    }
    
    /**
     * Gets the "substanceAdministration" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration getSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration)get_store().find_element_user(SUBSTANCEADMINISTRATION$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "substanceAdministration" element
     */
    public boolean isSetSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSTANCEADMINISTRATION$26) != 0;
        }
    }
    
    /**
     * Sets the "substanceAdministration" element
     */
    public void setSubstanceAdministration(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration substanceAdministration)
    {
        generatedSetterHelperImpl(substanceAdministration, SUBSTANCEADMINISTRATION$26, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "substanceAdministration" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration addNewSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration)get_store().add_element_user(SUBSTANCEADMINISTRATION$26);
            return target;
        }
    }
    
    /**
     * Unsets the "substanceAdministration" element
     */
    public void unsetSubstanceAdministration()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSTANCEADMINISTRATION$26, 0);
        }
    }
    
    /**
     * Gets the "supply" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply getSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply)get_store().find_element_user(SUPPLY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "supply" element
     */
    public boolean isSetSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPLY$28) != 0;
        }
    }
    
    /**
     * Sets the "supply" element
     */
    public void setSupply(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply supply)
    {
        generatedSetterHelperImpl(supply, SUPPLY$28, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "supply" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply addNewSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply)get_store().add_element_user(SUPPLY$28);
            return target;
        }
    }
    
    /**
     * Unsets the "supply" element
     */
    public void unsetSupply()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPLY$28, 0);
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
     * Gets the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponentX.Enum getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPECODE$32);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponentX.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent)get_store().find_attribute_user(TYPECODE$32);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent)get_default_attribute_value(TYPECODE$32);
            }
            return target;
        }
    }
    
    /**
     * True if has "typeCode" attribute
     */
    public boolean isSetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPECODE$32) != null;
        }
    }
    
    /**
     * Sets the "typeCode" attribute
     */
    public void setTypeCode(uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponentX.Enum typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$32);
            }
            target.setEnumValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent)get_store().find_attribute_user(TYPECODE$32);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ActRelationshipHasComponent)get_store().add_attribute_user(TYPECODE$32);
            }
            target.set(typeCode);
        }
    }
    
    /**
     * Unsets the "typeCode" attribute
     */
    public void unsetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPECODE$32);
        }
    }
    
    /**
     * Gets the "contextConductionInd" attribute
     */
    public boolean getContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONDUCTIONIND$34);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "contextConductionInd" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Bl2 xgetContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$34);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_default_attribute_value(CONTEXTCONDUCTIONIND$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "contextConductionInd" attribute
     */
    public boolean isSetContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTEXTCONDUCTIONIND$34) != null;
        }
    }
    
    /**
     * Sets the "contextConductionInd" attribute
     */
    public void setContextConductionInd(boolean contextConductionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$34);
            }
            target.setBooleanValue(contextConductionInd);
        }
    }
    
    /**
     * Sets (as xml) the "contextConductionInd" attribute
     */
    public void xsetContextConductionInd(uk.nhs.connect.iucds.cda.ucr.Bl2 contextConductionInd)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(CONTEXTCONDUCTIONIND$34);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().add_attribute_user(CONTEXTCONDUCTIONIND$34);
            }
            target.set(contextConductionInd);
        }
    }
    
    /**
     * Unsets the "contextConductionInd" attribute
     */
    public void unsetContextConductionInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTEXTCONDUCTIONIND$34);
        }
    }
}
