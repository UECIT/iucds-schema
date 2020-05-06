/*
 * XML Type:  POCD_MT000002UK01.Encounter
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML POCD_MT000002UK01.Encounter(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000002UK01Encounter extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000002UK01Encounter.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pocdmt000002uk01encountera89btype");
    
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
     * True if has "typeId" element
     */
    boolean isSetTypeId();
    
    /**
     * Sets the "typeId" element
     */
    void setTypeId(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId typeId);
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId addNewTypeId();
    
    /**
     * Unsets the "typeId" element
     */
    void unsetTypeId();
    
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
     * Gets array of all "id" elements
     */
    uk.nhs.connect.iucds.cda.ucr.II[] getIdArray();
    
    /**
     * Gets ith "id" element
     */
    uk.nhs.connect.iucds.cda.ucr.II getIdArray(int i);
    
    /**
     * Returns number of "id" element
     */
    int sizeOfIdArray();
    
    /**
     * Sets array of all "id" element
     */
    void setIdArray(uk.nhs.connect.iucds.cda.ucr.II[] idArray);
    
    /**
     * Sets ith "id" element
     */
    void setIdArray(int i, uk.nhs.connect.iucds.cda.ucr.II id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    uk.nhs.connect.iucds.cda.ucr.II insertNewId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    uk.nhs.connect.iucds.cda.ucr.II addNewId();
    
    /**
     * Removes the ith "id" element
     */
    void removeId(int i);
    
    /**
     * Gets the "code" element
     */
    uk.nhs.connect.iucds.cda.ucr.CDNPfITCDAUrl getCode();
    
    /**
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(uk.nhs.connect.iucds.cda.ucr.CDNPfITCDAUrl code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    uk.nhs.connect.iucds.cda.ucr.CDNPfITCDAUrl addNewCode();
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
    /**
     * Gets the "text" element
     */
    uk.nhs.connect.iucds.cda.ucr.ED getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(uk.nhs.connect.iucds.cda.ucr.ED text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    uk.nhs.connect.iucds.cda.ucr.ED addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * Gets the "statusCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CS getStatusCode();
    
    /**
     * True if has "statusCode" element
     */
    boolean isSetStatusCode();
    
    /**
     * Sets the "statusCode" element
     */
    void setStatusCode(uk.nhs.connect.iucds.cda.ucr.CS statusCode);
    
    /**
     * Appends and returns a new empty "statusCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CS addNewStatusCode();
    
    /**
     * Unsets the "statusCode" element
     */
    void unsetStatusCode();
    
    /**
     * Gets the "effectiveTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.IVLTS getEffectiveTime();
    
    /**
     * True if has "effectiveTime" element
     */
    boolean isSetEffectiveTime();
    
    /**
     * Sets the "effectiveTime" element
     */
    void setEffectiveTime(uk.nhs.connect.iucds.cda.ucr.IVLTS effectiveTime);
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.IVLTS addNewEffectiveTime();
    
    /**
     * Unsets the "effectiveTime" element
     */
    void unsetEffectiveTime();
    
    /**
     * Gets the "priorityCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getPriorityCode();
    
    /**
     * True if has "priorityCode" element
     */
    boolean isSetPriorityCode();
    
    /**
     * Sets the "priorityCode" element
     */
    void setPriorityCode(uk.nhs.connect.iucds.cda.ucr.CE priorityCode);
    
    /**
     * Appends and returns a new empty "priorityCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewPriorityCode();
    
    /**
     * Unsets the "priorityCode" element
     */
    void unsetPriorityCode();
    
    /**
     * Gets the "subject" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject getSubject();
    
    /**
     * True if has "subject" element
     */
    boolean isSetSubject();
    
    /**
     * Sets the "subject" element
     */
    void setSubject(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject subject);
    
    /**
     * Appends and returns a new empty "subject" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Subject addNewSubject();
    
    /**
     * Unsets the "subject" element
     */
    void unsetSubject();
    
    /**
     * Gets array of all "specimen" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen[] getSpecimenArray();
    
    /**
     * Gets ith "specimen" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen getSpecimenArray(int i);
    
    /**
     * Returns number of "specimen" element
     */
    int sizeOfSpecimenArray();
    
    /**
     * Sets array of all "specimen" element
     */
    void setSpecimenArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen[] specimenArray);
    
    /**
     * Sets ith "specimen" element
     */
    void setSpecimenArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen specimen);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "specimen" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen insertNewSpecimen(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "specimen" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Specimen addNewSpecimen();
    
    /**
     * Removes the ith "specimen" element
     */
    void removeSpecimen(int i);
    
    /**
     * Gets array of all "performer" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2[] getPerformerArray();
    
    /**
     * Gets ith "performer" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 getPerformerArray(int i);
    
    /**
     * Returns number of "performer" element
     */
    int sizeOfPerformerArray();
    
    /**
     * Sets array of all "performer" element
     */
    void setPerformerArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2[] performerArray);
    
    /**
     * Sets ith "performer" element
     */
    void setPerformerArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 performer);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 insertNewPerformer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer2 addNewPerformer();
    
    /**
     * Removes the ith "performer" element
     */
    void removePerformer(int i);
    
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
     * Gets array of all "participant" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 getParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 participant);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Participant2 addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets array of all "entryRelationship" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship[] getEntryRelationshipArray();
    
    /**
     * Gets ith "entryRelationship" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship getEntryRelationshipArray(int i);
    
    /**
     * Returns number of "entryRelationship" element
     */
    int sizeOfEntryRelationshipArray();
    
    /**
     * Sets array of all "entryRelationship" element
     */
    void setEntryRelationshipArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship[] entryRelationshipArray);
    
    /**
     * Sets ith "entryRelationship" element
     */
    void setEntryRelationshipArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship entryRelationship);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entryRelationship" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship insertNewEntryRelationship(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entryRelationship" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01EntryRelationship addNewEntryRelationship();
    
    /**
     * Removes the ith "entryRelationship" element
     */
    void removeEntryRelationship(int i);
    
    /**
     * Gets array of all "reference" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference[] getReferenceArray();
    
    /**
     * Gets ith "reference" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference getReferenceArray(int i);
    
    /**
     * Returns number of "reference" element
     */
    int sizeOfReferenceArray();
    
    /**
     * Sets array of all "reference" element
     */
    void setReferenceArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference[] referenceArray);
    
    /**
     * Sets ith "reference" element
     */
    void setReferenceArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference reference);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "reference" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference insertNewReference(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "reference" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference addNewReference();
    
    /**
     * Removes the ith "reference" element
     */
    void removeReference(int i);
    
    /**
     * Gets array of all "precondition" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition[] getPreconditionArray();
    
    /**
     * Gets ith "precondition" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition getPreconditionArray(int i);
    
    /**
     * Returns number of "precondition" element
     */
    int sizeOfPreconditionArray();
    
    /**
     * Sets array of all "precondition" element
     */
    void setPreconditionArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition[] preconditionArray);
    
    /**
     * Sets ith "precondition" element
     */
    void setPreconditionArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition precondition);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "precondition" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition insertNewPrecondition(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "precondition" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Precondition addNewPrecondition();
    
    /**
     * Removes the ith "precondition" element
     */
    void removePrecondition(int i);
    
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
    java.lang.String getClassCode();
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.ActClass xgetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(java.lang.String classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.ActClass classCode);
    
    /**
     * Gets the "moodCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.XDocumentEncounterMood.Enum getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.XDocumentEncounterMood xgetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(uk.nhs.connect.iucds.cda.ucr.XDocumentEncounterMood.Enum moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(uk.nhs.connect.iucds.cda.ucr.XDocumentEncounterMood moodCode);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
