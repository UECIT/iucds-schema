/*
 * XML Type:  EN
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.EN
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML EN(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface EN extends uk.nhs.connect.iucds.cda.ucr.ANY
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EN.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("en8504type");
    
    /**
     * Gets array of all "delimiter" elements
     */
    uk.nhs.connect.iucds.cda.ucr.EnDelimiter[] getDelimiterArray();
    
    /**
     * Gets ith "delimiter" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnDelimiter getDelimiterArray(int i);
    
    /**
     * Returns number of "delimiter" element
     */
    int sizeOfDelimiterArray();
    
    /**
     * Sets array of all "delimiter" element
     */
    void setDelimiterArray(uk.nhs.connect.iucds.cda.ucr.EnDelimiter[] delimiterArray);
    
    /**
     * Sets ith "delimiter" element
     */
    void setDelimiterArray(int i, uk.nhs.connect.iucds.cda.ucr.EnDelimiter delimiter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delimiter" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnDelimiter insertNewDelimiter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delimiter" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnDelimiter addNewDelimiter();
    
    /**
     * Removes the ith "delimiter" element
     */
    void removeDelimiter(int i);
    
    /**
     * Gets array of all "family" elements
     */
    uk.nhs.connect.iucds.cda.ucr.EnFamily[] getFamilyArray();
    
    /**
     * Gets ith "family" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnFamily getFamilyArray(int i);
    
    /**
     * Returns number of "family" element
     */
    int sizeOfFamilyArray();
    
    /**
     * Sets array of all "family" element
     */
    void setFamilyArray(uk.nhs.connect.iucds.cda.ucr.EnFamily[] familyArray);
    
    /**
     * Sets ith "family" element
     */
    void setFamilyArray(int i, uk.nhs.connect.iucds.cda.ucr.EnFamily family);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "family" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnFamily insertNewFamily(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnFamily addNewFamily();
    
    /**
     * Removes the ith "family" element
     */
    void removeFamily(int i);
    
    /**
     * Gets array of all "given" elements
     */
    uk.nhs.connect.iucds.cda.ucr.EnGiven[] getGivenArray();
    
    /**
     * Gets ith "given" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnGiven getGivenArray(int i);
    
    /**
     * Returns number of "given" element
     */
    int sizeOfGivenArray();
    
    /**
     * Sets array of all "given" element
     */
    void setGivenArray(uk.nhs.connect.iucds.cda.ucr.EnGiven[] givenArray);
    
    /**
     * Sets ith "given" element
     */
    void setGivenArray(int i, uk.nhs.connect.iucds.cda.ucr.EnGiven given);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "given" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnGiven insertNewGiven(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "given" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnGiven addNewGiven();
    
    /**
     * Removes the ith "given" element
     */
    void removeGiven(int i);
    
    /**
     * Gets array of all "prefix" elements
     */
    uk.nhs.connect.iucds.cda.ucr.EnPrefix[] getPrefixArray();
    
    /**
     * Gets ith "prefix" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnPrefix getPrefixArray(int i);
    
    /**
     * Returns number of "prefix" element
     */
    int sizeOfPrefixArray();
    
    /**
     * Sets array of all "prefix" element
     */
    void setPrefixArray(uk.nhs.connect.iucds.cda.ucr.EnPrefix[] prefixArray);
    
    /**
     * Sets ith "prefix" element
     */
    void setPrefixArray(int i, uk.nhs.connect.iucds.cda.ucr.EnPrefix prefix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnPrefix insertNewPrefix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnPrefix addNewPrefix();
    
    /**
     * Removes the ith "prefix" element
     */
    void removePrefix(int i);
    
    /**
     * Gets array of all "suffix" elements
     */
    uk.nhs.connect.iucds.cda.ucr.EnSuffix[] getSuffixArray();
    
    /**
     * Gets ith "suffix" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnSuffix getSuffixArray(int i);
    
    /**
     * Returns number of "suffix" element
     */
    int sizeOfSuffixArray();
    
    /**
     * Sets array of all "suffix" element
     */
    void setSuffixArray(uk.nhs.connect.iucds.cda.ucr.EnSuffix[] suffixArray);
    
    /**
     * Sets ith "suffix" element
     */
    void setSuffixArray(int i, uk.nhs.connect.iucds.cda.ucr.EnSuffix suffix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suffix" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnSuffix insertNewSuffix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suffix" element
     */
    uk.nhs.connect.iucds.cda.ucr.EnSuffix addNewSuffix();
    
    /**
     * Removes the ith "suffix" element
     */
    void removeSuffix(int i);
    
    /**
     * Gets the "validTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.IVLTS getValidTime();
    
    /**
     * True if has "validTime" element
     */
    boolean isSetValidTime();
    
    /**
     * Sets the "validTime" element
     */
    void setValidTime(uk.nhs.connect.iucds.cda.ucr.IVLTS validTime);
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    uk.nhs.connect.iucds.cda.ucr.IVLTS addNewValidTime();
    
    /**
     * Unsets the "validTime" element
     */
    void unsetValidTime();
    
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
     * Gets the "use" attribute
     */
    java.util.List getUse();
    
    /**
     * Gets (as xml) the "use" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.SetCsEntityNameUse xgetUse();
    
    /**
     * True if has "use" attribute
     */
    boolean isSetUse();
    
    /**
     * Sets the "use" attribute
     */
    void setUse(java.util.List use);
    
    /**
     * Sets (as xml) the "use" attribute
     */
    void xsetUse(uk.nhs.connect.iucds.cda.ucr.SetCsEntityNameUse use);
    
    /**
     * Unsets the "use" attribute
     */
    void unsetUse();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.EN newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.EN parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.EN) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
