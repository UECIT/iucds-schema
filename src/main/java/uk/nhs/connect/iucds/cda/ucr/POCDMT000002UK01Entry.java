/*
 * XML Type:  POCD_MT000002UK01.Entry
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML POCD_MT000002UK01.Entry(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000002UK01Entry extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000002UK01Entry.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pocdmt000002uk01entry8f7ctype");
    
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
     * Gets the "act" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act getAct();
    
    /**
     * True if has "act" element
     */
    boolean isSetAct();
    
    /**
     * Sets the "act" element
     */
    void setAct(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act act);
    
    /**
     * Appends and returns a new empty "act" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Act addNewAct();
    
    /**
     * Unsets the "act" element
     */
    void unsetAct();
    
    /**
     * Gets the "encounter" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter getEncounter();
    
    /**
     * True if has "encounter" element
     */
    boolean isSetEncounter();
    
    /**
     * Sets the "encounter" element
     */
    void setEncounter(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter encounter);
    
    /**
     * Appends and returns a new empty "encounter" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Encounter addNewEncounter();
    
    /**
     * Unsets the "encounter" element
     */
    void unsetEncounter();
    
    /**
     * Gets the "observation" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation getObservation();
    
    /**
     * True if has "observation" element
     */
    boolean isSetObservation();
    
    /**
     * Sets the "observation" element
     */
    void setObservation(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation observation);
    
    /**
     * Appends and returns a new empty "observation" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Observation addNewObservation();
    
    /**
     * Unsets the "observation" element
     */
    void unsetObservation();
    
    /**
     * Gets the "observationMedia" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia getObservationMedia();
    
    /**
     * True if has "observationMedia" element
     */
    boolean isSetObservationMedia();
    
    /**
     * Sets the "observationMedia" element
     */
    void setObservationMedia(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia observationMedia);
    
    /**
     * Appends and returns a new empty "observationMedia" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ObservationMedia addNewObservationMedia();
    
    /**
     * Unsets the "observationMedia" element
     */
    void unsetObservationMedia();
    
    /**
     * Gets the "organizer" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer getOrganizer();
    
    /**
     * True if has "organizer" element
     */
    boolean isSetOrganizer();
    
    /**
     * Sets the "organizer" element
     */
    void setOrganizer(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer organizer);
    
    /**
     * Appends and returns a new empty "organizer" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Organizer addNewOrganizer();
    
    /**
     * Unsets the "organizer" element
     */
    void unsetOrganizer();
    
    /**
     * Gets the "procedure" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure getProcedure();
    
    /**
     * True if has "procedure" element
     */
    boolean isSetProcedure();
    
    /**
     * Sets the "procedure" element
     */
    void setProcedure(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure procedure);
    
    /**
     * Appends and returns a new empty "procedure" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Procedure addNewProcedure();
    
    /**
     * Unsets the "procedure" element
     */
    void unsetProcedure();
    
    /**
     * Gets the "regionOfInterest" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest getRegionOfInterest();
    
    /**
     * True if has "regionOfInterest" element
     */
    boolean isSetRegionOfInterest();
    
    /**
     * Sets the "regionOfInterest" element
     */
    void setRegionOfInterest(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest regionOfInterest);
    
    /**
     * Appends and returns a new empty "regionOfInterest" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RegionOfInterest addNewRegionOfInterest();
    
    /**
     * Unsets the "regionOfInterest" element
     */
    void unsetRegionOfInterest();
    
    /**
     * Gets the "substanceAdministration" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration getSubstanceAdministration();
    
    /**
     * True if has "substanceAdministration" element
     */
    boolean isSetSubstanceAdministration();
    
    /**
     * Sets the "substanceAdministration" element
     */
    void setSubstanceAdministration(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration substanceAdministration);
    
    /**
     * Appends and returns a new empty "substanceAdministration" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01SubstanceAdministration addNewSubstanceAdministration();
    
    /**
     * Unsets the "substanceAdministration" element
     */
    void unsetSubstanceAdministration();
    
    /**
     * Gets the "supply" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply getSupply();
    
    /**
     * True if has "supply" element
     */
    boolean isSetSupply();
    
    /**
     * Sets the "supply" element
     */
    void setSupply(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply supply);
    
    /**
     * Appends and returns a new empty "supply" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Supply addNewSupply();
    
    /**
     * Unsets the "supply" element
     */
    void unsetSupply();
    
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
     * Gets the "typeCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.XActRelationshipEntry.Enum getTypeCode();
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.XActRelationshipEntry xgetTypeCode();
    
    /**
     * True if has "typeCode" attribute
     */
    boolean isSetTypeCode();
    
    /**
     * Sets the "typeCode" attribute
     */
    void setTypeCode(uk.nhs.connect.iucds.cda.ucr.XActRelationshipEntry.Enum typeCode);
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    void xsetTypeCode(uk.nhs.connect.iucds.cda.ucr.XActRelationshipEntry typeCode);
    
    /**
     * Unsets the "typeCode" attribute
     */
    void unsetTypeCode();
    
    /**
     * Gets the "contextConductionInd" attribute
     */
    boolean getContextConductionInd();
    
    /**
     * Gets (as xml) the "contextConductionInd" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.Bl2 xgetContextConductionInd();
    
    /**
     * True if has "contextConductionInd" attribute
     */
    boolean isSetContextConductionInd();
    
    /**
     * Sets the "contextConductionInd" attribute
     */
    void setContextConductionInd(boolean contextConductionInd);
    
    /**
     * Sets (as xml) the "contextConductionInd" attribute
     */
    void xsetContextConductionInd(uk.nhs.connect.iucds.cda.ucr.Bl2 contextConductionInd);
    
    /**
     * Unsets the "contextConductionInd" attribute
     */
    void unsetContextConductionInd();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Entry) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
