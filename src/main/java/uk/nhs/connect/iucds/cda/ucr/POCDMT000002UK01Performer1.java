/*
 * XML Type:  POCD_MT000002UK01.Performer1
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML POCD_MT000002UK01.Performer1(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT000002UK01Performer1 extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT000002UK01Performer1.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pocdmt000002uk01performer1c07btype");
    
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
     * Gets the "functionCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE getFunctionCode();
    
    /**
     * True if has "functionCode" element
     */
    boolean isSetFunctionCode();
    
    /**
     * Sets the "functionCode" element
     */
    void setFunctionCode(uk.nhs.connect.iucds.cda.ucr.CE functionCode);
    
    /**
     * Appends and returns a new empty "functionCode" element
     */
    uk.nhs.connect.iucds.cda.ucr.CE addNewFunctionCode();
    
    /**
     * Unsets the "functionCode" element
     */
    void unsetFunctionCode();
    
    /**
     * Gets the "time" element
     */
    uk.nhs.connect.iucds.cda.ucr.IVLTS getTime();
    
    /**
     * True if has "time" element
     */
    boolean isSetTime();
    
    /**
     * Sets the "time" element
     */
    void setTime(uk.nhs.connect.iucds.cda.ucr.IVLTS time);
    
    /**
     * Appends and returns a new empty "time" element
     */
    uk.nhs.connect.iucds.cda.ucr.IVLTS addNewTime();
    
    /**
     * Unsets the "time" element
     */
    void unsetTime();
    
    /**
     * Gets the "assignedEntity" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity getAssignedEntity();
    
    /**
     * Sets the "assignedEntity" element
     */
    void setAssignedEntity(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity assignedEntity);
    
    /**
     * Appends and returns a new empty "assignedEntity" element
     */
    uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity addNewAssignedEntity();
    
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
    java.lang.String getTypeCode();
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.Cs2 xgetTypeCode();
    
    /**
     * Sets the "typeCode" attribute
     */
    void setTypeCode(java.lang.String typeCode);
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    void xsetTypeCode(uk.nhs.connect.iucds.cda.ucr.Cs2 typeCode);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1 parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Performer1) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}