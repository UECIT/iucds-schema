/*
 * XML Type:  POCD_MT000002UK01.Section
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML POCD_MT000002UK01.Section(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000002UK01Section extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000002UK01Section.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pocdmt000002uk01sectiondea9type");
    
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
     * Gets the "code" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getCode();
    
    /**
     * True if has "code" element
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(uk.nhs.connect.iucds.cda.ucr.CE code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewCode();
    
    /**
     * Unsets the "code" element
     */
    void unsetCode();
    
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
     * Gets the "text" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocText getText();
    
    /**
     * True if has "text" element
     */
    boolean isSetText();
    
    /**
     * Sets the "text" element
     */
    void setText(uk.nhs.connect.iucds.cda.ucr.StrucDocText text);
    
    /**
     * Appends and returns a new empty "text" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocText addNewText();
    
    /**
     * Unsets the "text" element
     */
    void unsetText();
    
    /**
     * Gets the "confidentialityCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getConfidentialityCode();
    
    /**
     * True if has "confidentialityCode" element
     */
    boolean isSetConfidentialityCode();
    
    /**
     * Sets the "confidentialityCode" element
     */
    void setConfidentialityCode(uk.nhs.connect.iucds.cda.ucr.CE confidentialityCode);
    
    /**
     * Appends and returns a new empty "confidentialityCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewConfidentialityCode();
    
    /**
     * Unsets the "confidentialityCode" element
     */
    void unsetConfidentialityCode();
    
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
     * Gets array of all "entry" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry[] getEntryArray();
    
    /**
     * Gets ith "entry" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry getEntryArray(int i);
    
    /**
     * Returns number of "entry" element
     */
    int sizeOfEntryArray();
    
    /**
     * Sets array of all "entry" element
     */
    void setEntryArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry[] entryArray);
    
    /**
     * Sets ith "entry" element
     */
    void setEntryArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry entry);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entry" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry insertNewEntry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entry" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry addNewEntry();
    
    /**
     * Removes the ith "entry" element
     */
    void removeEntry(int i);
    
    /**
     * Gets array of all "component" elements
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component5[] getComponentArray();
    
    /**
     * Gets ith "component" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component5 getComponentArray(int i);
    
    /**
     * Returns number of "component" element
     */
    int sizeOfComponentArray();
    
    /**
     * Sets array of all "component" element
     */
    void setComponentArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component5[] componentArray);
    
    /**
     * Sets ith "component" element
     */
    void setComponentArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component5 component);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "component" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component5 insertNewComponent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "component" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Component5 addNewComponent();
    
    /**
     * Removes the ith "component" element
     */
    void removeComponent(int i);
    
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
    uk.nhs.connect.iucds.cda.ucr.ActClass xgetClassCode();
    
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
    void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.ActClass classCode);
    
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
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Section) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
