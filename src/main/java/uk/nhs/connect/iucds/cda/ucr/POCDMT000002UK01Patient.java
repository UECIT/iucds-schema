/*
 * XML Type:  POCD_MT000002UK01.Patient
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML POCD_MT000002UK01.Patient(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000002UK01Patient extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000002UK01Patient.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pocdmt000002uk01patientae89type");
    
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
     * Gets the "id" element
     */
    uk.nhs.connect.iucds.cda.ucr.II getId();
    
    /**
     * True if has "id" element
     */
    boolean isSetId();
    
    /**
     * Sets the "id" element
     */
    void setId(uk.nhs.connect.iucds.cda.ucr.II id);
    
    /**
     * Appends and returns a new empty "id" element
     */
    uk.nhs.connect.iucds.cda.ucr.II addNewId();
    
    /**
     * Unsets the "id" element
     */
    void unsetId();
    
    /**
     * Gets array of all "name" elements
     */
    uk.nhs.connect.iucds.cda.ucr.PN[] getNameArray();
    
    /**
     * Gets ith "name" element
     */
    uk.nhs.connect.iucds.cda.ucr.PN getNameArray(int i);
    
    /**
     * Returns number of "name" element
     */
    int sizeOfNameArray();
    
    /**
     * Sets array of all "name" element
     */
    void setNameArray(uk.nhs.connect.iucds.cda.ucr.PN[] nameArray);
    
    /**
     * Sets ith "name" element
     */
    void setNameArray(int i, uk.nhs.connect.iucds.cda.ucr.PN name);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "name" element
     */
    uk.nhs.connect.iucds.cda.ucr.PN insertNewName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "name" element
     */
    uk.nhs.connect.iucds.cda.ucr.PN addNewName();
    
    /**
     * Removes the ith "name" element
     */
    void removeName(int i);
    
    /**
     * Gets the "administrativeGenderCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getAdministrativeGenderCode();
    
    /**
     * True if has "administrativeGenderCode" element
     */
    boolean isSetAdministrativeGenderCode();
    
    /**
     * Sets the "administrativeGenderCode" element
     */
    void setAdministrativeGenderCode(uk.nhs.connect.iucds.cda.ucr.CE administrativeGenderCode);
    
    /**
     * Appends and returns a new empty "administrativeGenderCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewAdministrativeGenderCode();
    
    /**
     * Unsets the "administrativeGenderCode" element
     */
    void unsetAdministrativeGenderCode();
    
    /**
     * Gets the "birthTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.TS getBirthTime();
    
    /**
     * True if has "birthTime" element
     */
    boolean isSetBirthTime();
    
    /**
     * Sets the "birthTime" element
     */
    void setBirthTime(uk.nhs.connect.iucds.cda.ucr.TS birthTime);
    
    /**
     * Appends and returns a new empty "birthTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.TS addNewBirthTime();
    
    /**
     * Unsets the "birthTime" element
     */
    void unsetBirthTime();
    
    /**
     * Gets the "maritalStatusCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getMaritalStatusCode();
    
    /**
     * True if has "maritalStatusCode" element
     */
    boolean isSetMaritalStatusCode();
    
    /**
     * Sets the "maritalStatusCode" element
     */
    void setMaritalStatusCode(uk.nhs.connect.iucds.cda.ucr.CE maritalStatusCode);
    
    /**
     * Appends and returns a new empty "maritalStatusCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewMaritalStatusCode();
    
    /**
     * Unsets the "maritalStatusCode" element
     */
    void unsetMaritalStatusCode();
    
    /**
     * Gets the "religiousAffiliationCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getReligiousAffiliationCode();
    
    /**
     * True if has "religiousAffiliationCode" element
     */
    boolean isSetReligiousAffiliationCode();
    
    /**
     * Sets the "religiousAffiliationCode" element
     */
    void setReligiousAffiliationCode(uk.nhs.connect.iucds.cda.ucr.CE religiousAffiliationCode);
    
    /**
     * Appends and returns a new empty "religiousAffiliationCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewReligiousAffiliationCode();
    
    /**
     * Unsets the "religiousAffiliationCode" element
     */
    void unsetReligiousAffiliationCode();
    
    /**
     * Gets the "raceCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getRaceCode();
    
    /**
     * True if has "raceCode" element
     */
    boolean isSetRaceCode();
    
    /**
     * Sets the "raceCode" element
     */
    void setRaceCode(uk.nhs.connect.iucds.cda.ucr.CE raceCode);
    
    /**
     * Appends and returns a new empty "raceCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewRaceCode();
    
    /**
     * Unsets the "raceCode" element
     */
    void unsetRaceCode();
    
    /**
     * Gets the "ethnicGroupCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getEthnicGroupCode();
    
    /**
     * True if has "ethnicGroupCode" element
     */
    boolean isSetEthnicGroupCode();
    
    /**
     * Sets the "ethnicGroupCode" element
     */
    void setEthnicGroupCode(uk.nhs.connect.iucds.cda.ucr.CE ethnicGroupCode);
    
    /**
     * Appends and returns a new empty "ethnicGroupCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewEthnicGroupCode();
    
    /**
     * Unsets the "ethnicGroupCode" element
     */
    void unsetEthnicGroupCode();
    
    /**
     * Gets array of all "guardian" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian[] getGuardianArray();
    
    /**
     * Gets ith "guardian" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian getGuardianArray(int i);
    
    /**
     * Returns number of "guardian" element
     */
    int sizeOfGuardianArray();
    
    /**
     * Sets array of all "guardian" element
     */
    void setGuardianArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian[] guardianArray);
    
    /**
     * Sets ith "guardian" element
     */
    void setGuardianArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian guardian);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "guardian" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian insertNewGuardian(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "guardian" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Guardian addNewGuardian();
    
    /**
     * Removes the ith "guardian" element
     */
    void removeGuardian(int i);
    
    /**
     * Gets the "birthplace" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace getBirthplace();
    
    /**
     * True if has "birthplace" element
     */
    boolean isSetBirthplace();
    
    /**
     * Sets the "birthplace" element
     */
    void setBirthplace(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace birthplace);
    
    /**
     * Appends and returns a new empty "birthplace" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Birthplace addNewBirthplace();
    
    /**
     * Unsets the "birthplace" element
     */
    void unsetBirthplace();
    
    /**
     * Gets array of all "languageCommunication" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication[] getLanguageCommunicationArray();
    
    /**
     * Gets ith "languageCommunication" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication getLanguageCommunicationArray(int i);
    
    /**
     * Returns number of "languageCommunication" element
     */
    int sizeOfLanguageCommunicationArray();
    
    /**
     * Sets array of all "languageCommunication" element
     */
    void setLanguageCommunicationArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication[] languageCommunicationArray);
    
    /**
     * Sets ith "languageCommunication" element
     */
    void setLanguageCommunicationArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication languageCommunication);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "languageCommunication" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication insertNewLanguageCommunication(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "languageCommunication" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01LanguageCommunication addNewLanguageCommunication();
    
    /**
     * Removes the ith "languageCommunication" element
     */
    void removeLanguageCommunication(int i);
    
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
    uk.nhs.connect.iucds.cda.ucr.EntityClass xgetClassCode();
    
    /**
     * True if has "classCode" attribute
     */
    boolean isSetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(java.lang.String classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.EntityClass classCode);
    
    /**
     * Unsets the "classCode" attribute
     */
    void unsetClassCode();
    
    /**
     * Gets the "determinerCode" attribute
     */
    java.lang.String getDeterminerCode();
    
    /**
     * Gets (as xml) the "determinerCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.EntityDeterminer xgetDeterminerCode();
    
    /**
     * True if has "determinerCode" attribute
     */
    boolean isSetDeterminerCode();
    
    /**
     * Sets the "determinerCode" attribute
     */
    void setDeterminerCode(java.lang.String determinerCode);
    
    /**
     * Sets (as xml) the "determinerCode" attribute
     */
    void xsetDeterminerCode(uk.nhs.connect.iucds.cda.ucr.EntityDeterminer determinerCode);
    
    /**
     * Unsets the "determinerCode" attribute
     */
    void unsetDeterminerCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
