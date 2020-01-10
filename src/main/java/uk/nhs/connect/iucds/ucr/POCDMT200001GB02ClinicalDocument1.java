/*
 * XML Type:  POCD_MT200001GB02.ClinicalDocument
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML POCD_MT200001GB02.ClinicalDocument(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT200001GB02ClinicalDocument1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT200001GB02ClinicalDocument1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("pocdmt200001gb02clinicaldocumentb7b3type");
    
    /**
     * Gets the "code" element
     */
    uk.nhs.connect.iucds.ucr.CV getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(uk.nhs.connect.iucds.ucr.CV code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    uk.nhs.connect.iucds.ucr.CV addNewCode();
    
    /**
     * Gets the "confidentialityCode" element
     */
    uk.nhs.connect.iucds.ucr.CV getConfidentialityCode();
    
    /**
     * Sets the "confidentialityCode" element
     */
    void setConfidentialityCode(uk.nhs.connect.iucds.ucr.CV confidentialityCode);
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    uk.nhs.connect.iucds.ucr.CV addNewConfidentialityCode();
    
    /**
     * Gets the "effectiveTime" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime getEffectiveTime();
    
    /**
     * Sets the "effectiveTime" element
     */
    void setEffectiveTime(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime effectiveTime);
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime addNewEffectiveTime();
    
    /**
     * Gets the "id" element
     */
    uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory getId();
    
    /**
     * Sets the "id" element
     */
    void setId(uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory id);
    
    /**
     * Appends and returns a new empty "id" element
     */
    uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory addNewId();
    
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
     * Gets the "setId" element
     */
    uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory getSetId();
    
    /**
     * Sets the "setId" element
     */
    void setSetId(uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory setId);
    
    /**
     * Appends and returns a new empty "setId" element
     */
    uk.nhs.connect.iucds.ucr.IINPfITUuidMandatory addNewSetId();
    
    /**
     * Gets the "title" element
     */
    uk.nhs.connect.iucds.ucr.STTitle getTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(uk.nhs.connect.iucds.ucr.STTitle title);
    
    /**
     * Appends and returns a new empty "title" element
     */
    uk.nhs.connect.iucds.ucr.STTitle addNewTitle();
    
    /**
     * Gets the "typeId" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId getTypeId();
    
    /**
     * Sets the "typeId" element
     */
    void setTypeId(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId typeId);
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocumentTypeId addNewTypeId();
    
    /**
     * Gets the "versionNumber" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber getVersionNumber();
    
    /**
     * Sets the "versionNumber" element
     */
    void setVersionNumber(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber versionNumber);
    
    /**
     * Appends and returns a new empty "versionNumber" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber addNewVersionNumber();
    
    /**
     * Gets array of all "author" elements
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author[] getAuthorArray();
    
    /**
     * Gets ith "author" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author getAuthorArray(int i);
    
    /**
     * Returns number of "author" element
     */
    int sizeOfAuthorArray();
    
    /**
     * Sets array of all "author" element
     */
    void setAuthorArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author[] authorArray);
    
    /**
     * Sets ith "author" element
     */
    void setAuthorArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author author);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author insertNewAuthor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Author addNewAuthor();
    
    /**
     * Removes the ith "author" element
     */
    void removeAuthor(int i);
    
    /**
     * Gets array of all "authorization" elements
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization[] getAuthorizationArray();
    
    /**
     * Gets ith "authorization" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization getAuthorizationArray(int i);
    
    /**
     * Tests for nil ith "authorization" element
     */
    boolean isNilAuthorizationArray(int i);
    
    /**
     * Returns number of "authorization" element
     */
    int sizeOfAuthorizationArray();
    
    /**
     * Sets array of all "authorization" element
     */
    void setAuthorizationArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization[] authorizationArray);
    
    /**
     * Sets ith "authorization" element
     */
    void setAuthorizationArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization authorization);
    
    /**
     * Nils the ith "authorization" element
     */
    void setNilAuthorizationArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "authorization" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization insertNewAuthorization(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "authorization" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Authorization addNewAuthorization();
    
    /**
     * Removes the ith "authorization" element
     */
    void removeAuthorization(int i);
    
    /**
     * Gets the "component" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 getComponent();
    
    /**
     * Sets the "component" element
     */
    void setComponent(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 component);
    
    /**
     * Appends and returns a new empty "component" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component5 addNewComponent();
    
    /**
     * Gets the "componentOf" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component getComponentOf();
    
    /**
     * Sets the "componentOf" element
     */
    void setComponentOf(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component componentOf);
    
    /**
     * Appends and returns a new empty "componentOf" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Component addNewComponentOf();
    
    /**
     * Gets the "custodian" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian getCustodian();
    
    /**
     * Sets the "custodian" element
     */
    void setCustodian(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian custodian);
    
    /**
     * Appends and returns a new empty "custodian" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Custodian addNewCustodian();
    
    /**
     * Gets array of all "documentationOf" elements
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf[] getDocumentationOfArray();
    
    /**
     * Gets ith "documentationOf" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf getDocumentationOfArray(int i);
    
    /**
     * Tests for nil ith "documentationOf" element
     */
    boolean isNilDocumentationOfArray(int i);
    
    /**
     * Returns number of "documentationOf" element
     */
    int sizeOfDocumentationOfArray();
    
    /**
     * Sets array of all "documentationOf" element
     */
    void setDocumentationOfArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf[] documentationOfArray);
    
    /**
     * Sets ith "documentationOf" element
     */
    void setDocumentationOfArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf documentationOf);
    
    /**
     * Nils the ith "documentationOf" element
     */
    void setNilDocumentationOfArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "documentationOf" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf insertNewDocumentationOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "documentationOf" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02DocumentationOf addNewDocumentationOf();
    
    /**
     * Removes the ith "documentationOf" element
     */
    void removeDocumentationOf(int i);
    
    /**
     * Gets array of all "informant" elements
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant[] getInformantArray();
    
    /**
     * Gets ith "informant" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant getInformantArray(int i);
    
    /**
     * Tests for nil ith "informant" element
     */
    boolean isNilInformantArray(int i);
    
    /**
     * Returns number of "informant" element
     */
    int sizeOfInformantArray();
    
    /**
     * Sets array of all "informant" element
     */
    void setInformantArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant[] informantArray);
    
    /**
     * Sets ith "informant" element
     */
    void setInformantArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant informant);
    
    /**
     * Nils the ith "informant" element
     */
    void setNilInformantArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informant" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant insertNewInformant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informant" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Informant addNewInformant();
    
    /**
     * Removes the ith "informant" element
     */
    void removeInformant(int i);
    
    /**
     * Gets array of all "informationRecipient" elements
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient[] getInformationRecipientArray();
    
    /**
     * Gets ith "informationRecipient" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient getInformationRecipientArray(int i);
    
    /**
     * Returns number of "informationRecipient" element
     */
    int sizeOfInformationRecipientArray();
    
    /**
     * Sets array of all "informationRecipient" element
     */
    void setInformationRecipientArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient[] informationRecipientArray);
    
    /**
     * Sets ith "informationRecipient" element
     */
    void setInformationRecipientArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient informationRecipient);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "informationRecipient" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient insertNewInformationRecipient(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "informationRecipient" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02PrimaryInformationRecipient addNewInformationRecipient();
    
    /**
     * Removes the ith "informationRecipient" element
     */
    void removeInformationRecipient(int i);
    
    /**
     * Gets array of all "participant" elements
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant[] getParticipantArray();
    
    /**
     * Gets ith "participant" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant getParticipantArray(int i);
    
    /**
     * Tests for nil ith "participant" element
     */
    boolean isNilParticipantArray(int i);
    
    /**
     * Returns number of "participant" element
     */
    int sizeOfParticipantArray();
    
    /**
     * Sets array of all "participant" element
     */
    void setParticipantArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant[] participantArray);
    
    /**
     * Sets ith "participant" element
     */
    void setParticipantArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant participant);
    
    /**
     * Nils the ith "participant" element
     */
    void setNilParticipantArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "participant" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant insertNewParticipant(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "participant" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant addNewParticipant();
    
    /**
     * Removes the ith "participant" element
     */
    void removeParticipant(int i);
    
    /**
     * Gets the "recordTarget" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget getRecordTarget();
    
    /**
     * Sets the "recordTarget" element
     */
    void setRecordTarget(uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget recordTarget);
    
    /**
     * Appends and returns a new empty "recordTarget" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02RecordTarget addNewRecordTarget();
    
    /**
     * Gets the "relatedDocument" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf getRelatedDocument();
    
    /**
     * Tests for nil "relatedDocument" element
     */
    boolean isNilRelatedDocument();
    
    /**
     * True if has "relatedDocument" element
     */
    boolean isSetRelatedDocument();
    
    /**
     * Sets the "relatedDocument" element
     */
    void setRelatedDocument(uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf relatedDocument);
    
    /**
     * Appends and returns a new empty "relatedDocument" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02ReplacementOf addNewRelatedDocument();
    
    /**
     * Nils the "relatedDocument" element
     */
    void setNilRelatedDocument();
    
    /**
     * Unsets the "relatedDocument" element
     */
    void unsetRelatedDocument();
    
    /**
     * Gets array of all "tracker" elements
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker[] getTrackerArray();
    
    /**
     * Gets ith "tracker" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker getTrackerArray(int i);
    
    /**
     * Tests for nil ith "tracker" element
     */
    boolean isNilTrackerArray(int i);
    
    /**
     * Returns number of "tracker" element
     */
    int sizeOfTrackerArray();
    
    /**
     * Sets array of all "tracker" element
     */
    void setTrackerArray(uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker[] trackerArray);
    
    /**
     * Sets ith "tracker" element
     */
    void setTrackerArray(int i, uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker tracker);
    
    /**
     * Nils the ith "tracker" element
     */
    void setNilTrackerArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tracker" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker insertNewTracker(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tracker" element
     */
    uk.nhs.connect.iucds.ucr.POCDMT200001GB02Tracker addNewTracker();
    
    /**
     * Removes the ith "tracker" element
     */
    void removeTracker(int i);
    
    /**
     * Gets the "nullFlavor" attribute
     */
    java.lang.String getNullFlavor();
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    uk.nhs.connect.iucds.ucr.NullFlavor xgetNullFlavor();
    
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
    void xsetNullFlavor(uk.nhs.connect.iucds.ucr.NullFlavor nullFlavor);
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    void unsetNullFlavor();
    
    /**
     * Gets the "updateMode" attribute
     */
    uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum getUpdateMode();
    
    /**
     * Gets (as xml) the "updateMode" attribute
     */
    uk.nhs.connect.iucds.ucr.CsUpdateMode xgetUpdateMode();
    
    /**
     * True if has "updateMode" attribute
     */
    boolean isSetUpdateMode();
    
    /**
     * Sets the "updateMode" attribute
     */
    void setUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum updateMode);
    
    /**
     * Sets (as xml) the "updateMode" attribute
     */
    void xsetUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode updateMode);
    
    /**
     * Unsets the "updateMode" attribute
     */
    void unsetUpdateMode();
    
    /**
     * Gets the "classCode" attribute
     */
    java.lang.String getClassCode();
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    uk.nhs.connect.iucds.ucr.Cs2 xgetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(java.lang.String classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(uk.nhs.connect.iucds.ucr.Cs2 classCode);
    
    /**
     * Gets the "moodCode" attribute
     */
    java.lang.String getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    uk.nhs.connect.iucds.ucr.Cs2 xgetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(java.lang.String moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(uk.nhs.connect.iucds.ucr.Cs2 moodCode);
    
    /**
     * An XML effectiveTime(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public interface EffectiveTime extends uk.nhs.connect.iucds.ucr.TS
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EffectiveTime.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("effectivetime6b33elemtype");
        
        /**
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        uk.nhs.connect.iucds.ucr.Ts2 xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(uk.nhs.connect.iucds.ucr.Ts2 value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime newInstance() {
              return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.EffectiveTime) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML versionNumber(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public interface VersionNumber extends uk.nhs.connect.iucds.ucr.INT
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(VersionNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("versionnumber3be0elemtype");
        
        /**
         * Gets the "value" attribute
         */
        java.math.BigInteger getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        uk.nhs.connect.iucds.ucr.Int2 xgetValue();
        
        /**
         * True if has "value" attribute
         */
        boolean isSetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.math.BigInteger value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(uk.nhs.connect.iucds.ucr.Int2 value);
        
        /**
         * Unsets the "value" attribute
         */
        void unsetValue();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber newInstance() {
              return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1.VersionNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 newInstance() {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02ClinicalDocument1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
