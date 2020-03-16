/*
 * XML Type:  CD
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CD
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML CD(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface CD extends uk.nhs.connect.iucds.cda.ucr.ANY
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("cd1e4ctype");
    
    /**
     * Gets the "originalText" element
     */
    uk.nhs.connect.iucds.cda.ucr.ED getOriginalText();
    
    /**
     * True if has "originalText" element
     */
    boolean isSetOriginalText();
    
    /**
     * Sets the "originalText" element
     */
    void setOriginalText(uk.nhs.connect.iucds.cda.ucr.ED originalText);
    
    /**
     * Appends and returns a new empty "originalText" element
     */
    uk.nhs.connect.iucds.cda.ucr.ED addNewOriginalText();
    
    /**
     * Unsets the "originalText" element
     */
    void unsetOriginalText();
    
    /**
     * Gets array of all "qualifier" elements
     */
    uk.nhs.connect.iucds.cda.ucr.CR[] getQualifierArray();
    
    /**
     * Gets ith "qualifier" element
     */
    uk.nhs.connect.iucds.cda.ucr.CR getQualifierArray(int i);
    
    /**
     * Returns number of "qualifier" element
     */
    int sizeOfQualifierArray();
    
    /**
     * Sets array of all "qualifier" element
     */
    void setQualifierArray(uk.nhs.connect.iucds.cda.ucr.CR[] qualifierArray);
    
    /**
     * Sets ith "qualifier" element
     */
    void setQualifierArray(int i, uk.nhs.connect.iucds.cda.ucr.CR qualifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
     */
    uk.nhs.connect.iucds.cda.ucr.CR insertNewQualifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qualifier" element
     */
    uk.nhs.connect.iucds.cda.ucr.CR addNewQualifier();
    
    /**
     * Removes the ith "qualifier" element
     */
    void removeQualifier(int i);
    
    /**
     * Gets array of all "group" elements
     */
    uk.nhs.connect.iucds.cda.ucr.CD.Group[] getGroupArray();
    
    /**
     * Gets ith "group" element
     */
    uk.nhs.connect.iucds.cda.ucr.CD.Group getGroupArray(int i);
    
    /**
     * Returns number of "group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "group" element
     */
    void setGroupArray(uk.nhs.connect.iucds.cda.ucr.CD.Group[] groupArray);
    
    /**
     * Sets ith "group" element
     */
    void setGroupArray(int i, uk.nhs.connect.iucds.cda.ucr.CD.Group group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    uk.nhs.connect.iucds.cda.ucr.CD.Group insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    uk.nhs.connect.iucds.cda.ucr.CD.Group addNewGroup();
    
    /**
     * Removes the ith "group" element
     */
    void removeGroup(int i);
    
    /**
     * Gets array of all "translation" elements
     */
    uk.nhs.connect.iucds.cda.ucr.CD[] getTranslationArray();
    
    /**
     * Gets ith "translation" element
     */
    uk.nhs.connect.iucds.cda.ucr.CD getTranslationArray(int i);
    
    /**
     * Returns number of "translation" element
     */
    int sizeOfTranslationArray();
    
    /**
     * Sets array of all "translation" element
     */
    void setTranslationArray(uk.nhs.connect.iucds.cda.ucr.CD[] translationArray);
    
    /**
     * Sets ith "translation" element
     */
    void setTranslationArray(int i, uk.nhs.connect.iucds.cda.ucr.CD translation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "translation" element
     */
    uk.nhs.connect.iucds.cda.ucr.CD insertNewTranslation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "translation" element
     */
    uk.nhs.connect.iucds.cda.ucr.CD addNewTranslation();
    
    /**
     * Removes the ith "translation" element
     */
    void removeTranslation(int i);
    
    /**
     * Gets the "code" attribute
     */
    java.lang.String getCode();
    
    /**
     * Gets (as xml) the "code" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.Cs2 xgetCode();
    
    /**
     * True if has "code" attribute
     */
    boolean isSetCode();
    
    /**
     * Sets the "code" attribute
     */
    void setCode(java.lang.String code);
    
    /**
     * Sets (as xml) the "code" attribute
     */
    void xsetCode(uk.nhs.connect.iucds.cda.ucr.Cs2 code);
    
    /**
     * Unsets the "code" attribute
     */
    void unsetCode();
    
    /**
     * Gets the "codeSystem" attribute
     */
    java.lang.String getCodeSystem();
    
    /**
     * Gets (as xml) the "codeSystem" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.Uid xgetCodeSystem();
    
    /**
     * True if has "codeSystem" attribute
     */
    boolean isSetCodeSystem();
    
    /**
     * Sets the "codeSystem" attribute
     */
    void setCodeSystem(java.lang.String codeSystem);
    
    /**
     * Sets (as xml) the "codeSystem" attribute
     */
    void xsetCodeSystem(uk.nhs.connect.iucds.cda.ucr.Uid codeSystem);
    
    /**
     * Unsets the "codeSystem" attribute
     */
    void unsetCodeSystem();
    
    /**
     * Gets the "codeSystemName" attribute
     */
    java.lang.String getCodeSystemName();
    
    /**
     * Gets (as xml) the "codeSystemName" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.St2 xgetCodeSystemName();
    
    /**
     * True if has "codeSystemName" attribute
     */
    boolean isSetCodeSystemName();
    
    /**
     * Sets the "codeSystemName" attribute
     */
    void setCodeSystemName(java.lang.String codeSystemName);
    
    /**
     * Sets (as xml) the "codeSystemName" attribute
     */
    void xsetCodeSystemName(uk.nhs.connect.iucds.cda.ucr.St2 codeSystemName);
    
    /**
     * Unsets the "codeSystemName" attribute
     */
    void unsetCodeSystemName();
    
    /**
     * Gets the "codeSystemVersion" attribute
     */
    java.lang.String getCodeSystemVersion();
    
    /**
     * Gets (as xml) the "codeSystemVersion" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.St2 xgetCodeSystemVersion();
    
    /**
     * True if has "codeSystemVersion" attribute
     */
    boolean isSetCodeSystemVersion();
    
    /**
     * Sets the "codeSystemVersion" attribute
     */
    void setCodeSystemVersion(java.lang.String codeSystemVersion);
    
    /**
     * Sets (as xml) the "codeSystemVersion" attribute
     */
    void xsetCodeSystemVersion(uk.nhs.connect.iucds.cda.ucr.St2 codeSystemVersion);
    
    /**
     * Unsets the "codeSystemVersion" attribute
     */
    void unsetCodeSystemVersion();
    
    /**
     * Gets the "displayName" attribute
     */
    java.lang.String getDisplayName();
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.St2 xgetDisplayName();
    
    /**
     * True if has "displayName" attribute
     */
    boolean isSetDisplayName();
    
    /**
     * Sets the "displayName" attribute
     */
    void setDisplayName(java.lang.String displayName);
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    void xsetDisplayName(uk.nhs.connect.iucds.cda.ucr.St2 displayName);
    
    /**
     * Unsets the "displayName" attribute
     */
    void unsetDisplayName();
    
    /**
     * An XML group(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public interface Group extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Group.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("group07b7elemtype");
        
        /**
         * Gets array of all "qualifier" elements
         */
        uk.nhs.connect.iucds.cda.ucr.CR[] getQualifierArray();
        
        /**
         * Gets ith "qualifier" element
         */
        uk.nhs.connect.iucds.cda.ucr.CR getQualifierArray(int i);
        
        /**
         * Returns number of "qualifier" element
         */
        int sizeOfQualifierArray();
        
        /**
         * Sets array of all "qualifier" element
         */
        void setQualifierArray(uk.nhs.connect.iucds.cda.ucr.CR[] qualifierArray);
        
        /**
         * Sets ith "qualifier" element
         */
        void setQualifierArray(int i, uk.nhs.connect.iucds.cda.ucr.CR qualifier);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
         */
        uk.nhs.connect.iucds.cda.ucr.CR insertNewQualifier(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifier" element
         */
        uk.nhs.connect.iucds.cda.ucr.CR addNewQualifier();
        
        /**
         * Removes the ith "qualifier" element
         */
        void removeQualifier(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.iucds.cda.ucr.CD.Group newInstance() {
              return (uk.nhs.connect.iucds.cda.ucr.CD.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.iucds.cda.ucr.CD.Group newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.iucds.cda.ucr.CD.Group) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.CD newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.CD parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.CD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
