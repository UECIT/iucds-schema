/*
 * XML Type:  POCD_MT000002UK01.ObservationMedia
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML POCD_MT000002UK01.ObservationMedia(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000002UK01ObservationMedia extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000002UK01ObservationMedia.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pocdmt000002uk01observationmedia40e6type");
    
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
     * Gets the "value" element
     */
    uk.nhs.connect.iucds.cda.ucr.ED getValue();
    
    /**
     * Sets the "value" element
     */
    void setValue(uk.nhs.connect.iucds.cda.ucr.ED value);
    
    /**
     * Appends and returns a new empty "value" element
     */
    uk.nhs.connect.iucds.cda.ucr.ED addNewValue();
    
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
     * Gets the "ID" attribute
     */
    java.lang.String getID();
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    org.apache.xmlbeans.XmlID xgetID();
    
    /**
     * True if has "ID" attribute
     */
    boolean isSetID();
    
    /**
     * Sets the "ID" attribute
     */
    void setID(java.lang.String id);
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    void xsetID(org.apache.xmlbeans.XmlID id);
    
    /**
     * Unsets the "ID" attribute
     */
    void unsetID();
    
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
    uk.nhs.connect.iucds.cda.ucr.ActClassObservation xgetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(java.lang.String classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.ActClassObservation classCode);
    
    /**
     * Gets the "moodCode" attribute
     */
    java.lang.String getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.ActMood xgetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(java.lang.String moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(uk.nhs.connect.iucds.cda.ucr.ActMood moodCode);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
