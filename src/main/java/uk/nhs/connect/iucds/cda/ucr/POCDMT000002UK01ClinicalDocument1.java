/*
 * XML Type:  POCD_MT000002UK01.ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML POCD_MT000002UK01.ClinicalDocument(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000002UK01ClinicalDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000002UK01ClinicalDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pocdmt000002uk01clinicaldocument37f0type");
    
    /**
     * Gets array of all "realmCode" elements
     */
    uk.nhs.connect.iucds.cda.ucr.CS[] getRealmCodeArray();
    
    /**
     * Gets ith "realmCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CS getRealmCodeArray(int i);
    
    /**
     * Returns number of "realmCode" element
     */
    int sizeOfRealmCodeArray();
    
    /**
     * Sets array of all "realmCode" element
     */
    void setRealmCodeArray(uk.nhs.connect.iucds.cda.ucr.CS[] realmCodeArray);
    
    /**
     * Sets ith "realmCode" element
     */
    void setRealmCodeArray(int i, uk.nhs.connect.iucds.cda.ucr.CS realmCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realmCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CS insertNewRealmCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realmCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CS addNewRealmCode();
    
    /**
     * Removes the ith "realmCode" element
     */
    void removeRealmCode(int i);
    
    /**
     * Gets the "typeId" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId getTypeId();
    
    /**
     * Sets the "typeId" element
     */
    void setTypeId(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId typeId);
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId addNewTypeId();
    
    /**
     * Gets array of all "templateId" elements
     */
    uk.nhs.connect.iucds.cda.ucr.II[] getTemplateIdArray();
    
    /**
     * Gets ith "templateId" element
     */
    uk.nhs.connect.iucds.cda.ucr.II getTemplateIdArray(int i);
    
    /**
     * Returns number of "templateId" element
     */
    int sizeOfTemplateIdArray();
    
    /**
     * Sets array of all "templateId" element
     */
    void setTemplateIdArray(uk.nhs.connect.iucds.cda.ucr.II[] templateIdArray);
    
    /**
     * Sets ith "templateId" element
     */
    void setTemplateIdArray(int i, uk.nhs.connect.iucds.cda.ucr.II templateId);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "templateId" element
     */
    uk.nhs.connect.iucds.cda.ucr.II insertNewTemplateId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "templateId" element
     */
    uk.nhs.connect.iucds.cda.ucr.II addNewTemplateId();
    
    /**
     * Removes the ith "templateId" element
     */
    void removeTemplateId(int i);
    
    /**
     * Gets the "contentId" element
     */
    uk.nhs.connect.npfit.hl7.localisation.TemplateContent getContentId();
    
    /**
     * True if has "contentId" element
     */
    boolean isSetContentId();
    
    /**
     * Sets the "contentId" element
     */
    void setContentId(uk.nhs.connect.npfit.hl7.localisation.TemplateContent contentId);
    
    /**
     * Appends and returns a new empty "contentId" element
     */
    uk.nhs.connect.npfit.hl7.localisation.TemplateContent addNewContentId();
    
    /**
     * Unsets the "contentId" element
     */
    void unsetContentId();
    
    /**
     * Gets the "messageType" element
     */
    uk.nhs.connect.npfit.hl7.localisation.MessageType getMessageType();
    
    /**
     * Sets the "messageType" element
     */
    void setMessageType(uk.nhs.connect.npfit.hl7.localisation.MessageType messageType);
    
    /**
     * Appends and returns a new empty "messageType" element
     */
    uk.nhs.connect.npfit.hl7.localisation.MessageType addNewMessageType();
    
    /**
     * Gets the "id" element
     */
    uk.nhs.connect.iucds.cda.ucr.II getId();
    
    /**
     * Sets the "id" element
     */
    void setId(uk.nhs.connect.iucds.cda.ucr.II id);
    
    /**
     * Appends and returns a new empty "id" element
     */
    uk.nhs.connect.iucds.cda.ucr.II addNewId();
    
    /**
     * Gets the "code" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(uk.nhs.connect.iucds.cda.ucr.CE code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewCode();
    
    /**
     * Gets the "title" element
     */
    uk.nhs.connect.iucds.cda.ucr.ST getTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(uk.nhs.connect.iucds.cda.ucr.ST title);
    
    /**
     * Appends and returns a new empty "title" element
     */
    uk.nhs.connect.iucds.cda.ucr.ST addNewTitle();
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "effectiveTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.TS getEffectiveTime();
    
    /**
     * Sets the "effectiveTime" element
     */
    void setEffectiveTime(uk.nhs.connect.iucds.cda.ucr.TS effectiveTime);
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.TS addNewEffectiveTime();
    
    /**
     * Gets the "confidentialityCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getConfidentialityCode();
    
    /**
     * Sets the "confidentialityCode" element
     */
    void setConfidentialityCode(uk.nhs.connect.iucds.cda.ucr.CE confidentialityCode);
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewConfidentialityCode();
    
    /**
     * Gets the "languageCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CS getLanguageCode();
    
    /**
     * True if has "languageCode" element
     */
    boolean isSetLanguageCode();
    
    /**
     * Sets the "languageCode" element
     */
    void setLanguageCode(uk.nhs.connect.iucds.cda.ucr.CS languageCode);
    
    /**
     * Appends and returns a new empty "languageCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CS addNewLanguageCode();
    
    /**
     * Unsets the "languageCode" element
     */
    void unsetLanguageCode();
    
    /**
     * Gets the "setId" element
     */
    uk.nhs.connect.iucds.cda.ucr.II getSetId();
    
    /**
     * True if has "setId" element
     */
    boolean isSetSetId();
    
    /**
     * Sets the "setId" element
     */
    void setSetId(uk.nhs.connect.iucds.cda.ucr.II setId);
    
    /**
     * Appends and returns a new empty "setId" element
     */
    uk.nhs.connect.iucds.cda.ucr.II addNewSetId();
    
    /**
     * Unsets the "setId" element
     */
    void unsetSetId();
    
    /**
     * Gets the "versionNumber" element
     */
    uk.nhs.connect.iucds.cda.ucr.INT getVersionNumber();
    
    /**
     * True if has "versionNumber" element
     */
    boolean isSetVersionNumber();
    
    /**
     * Sets the "versionNumber" element
     */
    void setVersionNumber(uk.nhs.connect.iucds.cda.ucr.INT versionNumber);
    
    /**
     * Appends and returns a new empty "versionNumber" element
     */
    uk.nhs.connect.iucds.cda.ucr.INT addNewVersionNumber();
    
    /**
     * Unsets the "versionNumber" element
     */
    void unsetVersionNumber();
    
    /**
     * Gets the "copyTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.TS getCopyTime();
    
    /**
     * True if has "copyTime" element
     */
    boolean isSetCopyTime();
    
    /**
     * Sets the "copyTime" element
     */
    void setCopyTime(uk.nhs.connect.iucds.cda.ucr.TS copyTime);
    
    /**
     * Appends and returns a new empty "copyTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.TS addNewCopyTime();
    
    /**
     * Unsets the "copyTime" element
     */
    void unsetCopyTime();
    
    /**
     * Gets array of all "recordTarget" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget[] getRecordTargetArray();
    
    /**
     * Gets ith "recordTarget" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget getRecordTargetArray(int i);
    
    /**
     * Returns number of "recordTarget" element
     */
    int sizeOfRecordTargetArray();
    
    /**
     * Sets array of all "recordTarget" element
     */
    void setRecordTargetArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget[] recordTargetArray);
    
    /**
     * Sets ith "recordTarget" element
     */
    void setRecordTargetArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget recordTarget);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "recordTarget" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget insertNewRecordTarget(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "recordTarget" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RecordTarget addNewRecordTarget();
    
    /**
     * Removes the ith "recordTarget" element
     */
    void removeRecordTarget(int i);
    
    /**
     * Gets array of all "author" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author[] getAuthorArray();
    
    /**
     * Gets ith "author" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author getAuthorArray(int i);
    
    /**
     * Returns number of "author" element
     */
    int sizeOfAuthorArray();
    
    /**
     * Sets array of all "author" element
     */
    void setAuthorArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author[] authorArray);
    
    /**
     * Sets ith "author" element
     */
    void setAuthorArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author author);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author insertNewAuthor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Author addNewAuthor();
    
    /**
     * Removes the ith "author" element
     */
    void removeAuthor(int i);
    
    /**
     * Gets the "dataEnterer" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer getDataEnterer();
    
    /**
     * True if has "dataEnterer" element
     */
    boolean isSetDataEnterer();
    
    /**
     * Sets the "dataEnterer" element
     */
    void setDataEnterer(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer dataEnterer);
    
    /**
     * Appends and returns a new empty "dataEnterer" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DataEnterer addNewDataEnterer();
    
    /**
     * Unsets the "dataEnterer" element
     */
    void unsetDataEnterer();
    
    /**
     * Gets array of all "informant" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12[] getInformantArray();
    
    /**
     * Gets ith "informant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 getInformantArray(int i);
    
    /**
     * Returns number of "informant" element
     */
    int sizeOfInformantArray();
    
    /**
     * Sets array of all "informant" element
     */
    void setInformantArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12[] informantArray);
    
    /**
     * Sets ith "informant" element
     */
    void setInformantArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 informant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 insertNewInformant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12 addNewInformant();
    
    /**
     * Removes the ith "informant" element
     */
    void removeInformant(int i);
    
    /**
     * Gets the "custodian" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian getCustodian();
    
    /**
     * Sets the "custodian" element
     */
    void setCustodian(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian custodian);
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Custodian addNewCustodian();
    
    /**
     * Gets array of all "informationRecipient" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient[] getInformationRecipientArray();
    
    /**
     * Gets ith "informationRecipient" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient getInformationRecipientArray(int i);
    
    /**
     * Returns number of "informationRecipient" element
     */
    int sizeOfInformationRecipientArray();
    
    /**
     * Sets array of all "informationRecipient" element
     */
    void setInformationRecipientArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient[] informationRecipientArray);
    
    /**
     * Sets ith "informationRecipient" element
     */
    void setInformationRecipientArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient informationRecipient);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationRecipient" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient insertNewInformationRecipient(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informationRecipient" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InformationRecipient addNewInformationRecipient();
    
    /**
     * Removes the ith "informationRecipient" element
     */
    void removeInformationRecipient(int i);
    
    /**
     * Gets the "legalAuthenticator" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator getLegalAuthenticator();
    
    /**
     * True if has "legalAuthenticator" element
     */
    boolean isSetLegalAuthenticator();
    
    /**
     * Sets the "legalAuthenticator" element
     */
    void setLegalAuthenticator(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator legalAuthenticator);
    
    /**
     * Appends and returns a new empty "legalAuthenticator" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LegalAuthenticator addNewLegalAuthenticator();
    
    /**
     * Unsets the "legalAuthenticator" element
     */
    void unsetLegalAuthenticator();
    
    /**
     * Gets array of all "authenticator" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator[] getAuthenticatorArray();
    
    /**
     * Gets ith "authenticator" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator getAuthenticatorArray(int i);
    
    /**
     * Returns number of "authenticator" element
     */
    int sizeOfAuthenticatorArray();
    
    /**
     * Sets array of all "authenticator" element
     */
    void setAuthenticatorArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator[] authenticatorArray);
    
    /**
     * Sets ith "authenticator" element
     */
    void setAuthenticatorArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator authenticator);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authenticator" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator insertNewAuthenticator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authenticator" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authenticator addNewAuthenticator();
    
    /**
     * Removes the ith "authenticator" element
     */
    void removeAuthenticator(int i);
    
    /**
     * Gets array of all "participant" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant1 addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets array of all "inFulfillmentOf" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf[] getInFulfillmentOfArray();
    
    /**
     * Gets ith "inFulfillmentOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf getInFulfillmentOfArray(int i);
    
    /**
     * Returns number of "inFulfillmentOf" element
     */
    int sizeOfInFulfillmentOfArray();
    
    /**
     * Sets array of all "inFulfillmentOf" element
     */
    void setInFulfillmentOfArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf[] inFulfillmentOfArray);
    
    /**
     * Sets ith "inFulfillmentOf" element
     */
    void setInFulfillmentOfArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf inFulfillmentOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "inFulfillmentOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf insertNewInFulfillmentOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "inFulfillmentOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InFulfillmentOf addNewInFulfillmentOf();
    
    /**
     * Removes the ith "inFulfillmentOf" element
     */
    void removeInFulfillmentOf(int i);
    
    /**
     * Gets array of all "documentationOf" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf[] getDocumentationOfArray();
    
    /**
     * Gets ith "documentationOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf getDocumentationOfArray(int i);
    
    /**
     * Returns number of "documentationOf" element
     */
    int sizeOfDocumentationOfArray();
    
    /**
     * Sets array of all "documentationOf" element
     */
    void setDocumentationOfArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf[] documentationOfArray);
    
    /**
     * Sets ith "documentationOf" element
     */
    void setDocumentationOfArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf documentationOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf insertNewDocumentationOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01DocumentationOf addNewDocumentationOf();
    
    /**
     * Removes the ith "documentationOf" element
     */
    void removeDocumentationOf(int i);
    
    /**
     * Gets array of all "relatedDocument" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1[] getRelatedDocumentArray();
    
    /**
     * Gets ith "relatedDocument" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 getRelatedDocumentArray(int i);
    
    /**
     * Returns number of "relatedDocument" element
     */
    int sizeOfRelatedDocumentArray();
    
    /**
     * Sets array of all "relatedDocument" element
     */
    void setRelatedDocumentArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1[] relatedDocumentArray);
    
    /**
     * Sets ith "relatedDocument" element
     */
    void setRelatedDocumentArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 relatedDocument);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "relatedDocument" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 insertNewRelatedDocument(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "relatedDocument" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedDocument1 addNewRelatedDocument();
    
    /**
     * Removes the ith "relatedDocument" element
     */
    void removeRelatedDocument(int i);
    
    /**
     * Gets array of all "authorization" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization[] getAuthorizationArray();
    
    /**
     * Gets ith "authorization" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization getAuthorizationArray(int i);
    
    /**
     * Returns number of "authorization" element
     */
    int sizeOfAuthorizationArray();
    
    /**
     * Sets array of all "authorization" element
     */
    void setAuthorizationArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization[] authorizationArray);
    
    /**
     * Sets ith "authorization" element
     */
    void setAuthorizationArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization authorization);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorization" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization insertNewAuthorization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorization" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Authorization addNewAuthorization();
    
    /**
     * Removes the ith "authorization" element
     */
    void removeAuthorization(int i);
    
    /**
     * Gets the "componentOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 getComponentOf();
    
    /**
     * True if has "componentOf" element
     */
    boolean isSetComponentOf();
    
    /**
     * Sets the "componentOf" element
     */
    void setComponentOf(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 componentOf);
    
    /**
     * Appends and returns a new empty "componentOf" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component1 addNewComponentOf();
    
    /**
     * Unsets the "componentOf" element
     */
    void unsetComponentOf();
    
    /**
     * Gets the "component" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 getComponent();
    
    /**
     * Sets the "component" element
     */
    void setComponent(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 component);
    
    /**
     * Appends and returns a new empty "component" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component2 addNewComponent();
    
    /**
     * Gets the "nullFlavor" attribute
     */
    java.lang.String getNullFlavor();
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.NullFlavor xgetNullFlavor();
    
    /**
     * True if has "nullFlavor" attribute
     */
    boolean isSetNullFlavor();
    
    /**
     * Sets the "nullFlavor" attribute
     */
    void setNullFlavor(java.lang.String nullFlavor);
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    void xsetNullFlavor(uk.nhs.connect.iucds.cda.ucr.NullFlavor nullFlavor);
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    void unsetNullFlavor();
    
    /**
     * Gets the "classCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.ActClinicalDocumentX.Enum getClassCode();
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1 xgetClassCode();
    
    /**
     * True if has "classCode" attribute
     */
    boolean isSetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(uk.nhs.connect.iucds.cda.ucr.ActClinicalDocumentX.Enum classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.ActClinicalDocument1 classCode);
    
    /**
     * Unsets the "classCode" attribute
     */
    void unsetClassCode();
    
    /**
     * Gets the "moodCode" attribute
     */
    java.lang.String getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.ActMood xgetMoodCode();
    
    /**
     * True if has "moodCode" attribute
     */
    boolean isSetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(java.lang.String moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(uk.nhs.connect.iucds.cda.ucr.ActMood moodCode);
    
    /**
     * Unsets the "moodCode" attribute
     */
    void unsetMoodCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
