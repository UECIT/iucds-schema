/*
 * XML Type:  StrucDoc.FootnoteRef
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML StrucDoc.FootnoteRef(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface StrucDocFootnoteRef extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrucDocFootnoteRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("strucdocfootnoteref246ftype");
    
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
     * Gets the "language" attribute
     */
    java.lang.String getLanguage();
    
    /**
     * Gets (as xml) the "language" attribute
     */
    org.apache.xmlbeans.XmlNMTOKEN xgetLanguage();
    
    /**
     * True if has "language" attribute
     */
    boolean isSetLanguage();
    
    /**
     * Sets the "language" attribute
     */
    void setLanguage(java.lang.String language);
    
    /**
     * Sets (as xml) the "language" attribute
     */
    void xsetLanguage(org.apache.xmlbeans.XmlNMTOKEN language);
    
    /**
     * Unsets the "language" attribute
     */
    void unsetLanguage();
    
    /**
     * Gets the "styleCode" attribute
     */
    java.util.List getStyleCode();
    
    /**
     * Gets (as xml) the "styleCode" attribute
     */
    org.apache.xmlbeans.XmlNMTOKENS xgetStyleCode();
    
    /**
     * True if has "styleCode" attribute
     */
    boolean isSetStyleCode();
    
    /**
     * Sets the "styleCode" attribute
     */
    void setStyleCode(java.util.List styleCode);
    
    /**
     * Sets (as xml) the "styleCode" attribute
     */
    void xsetStyleCode(org.apache.xmlbeans.XmlNMTOKENS styleCode);
    
    /**
     * Unsets the "styleCode" attribute
     */
    void unsetStyleCode();
    
    /**
     * Gets the "IDREF" attribute
     */
    java.lang.String getIDREF();
    
    /**
     * Gets (as xml) the "IDREF" attribute
     */
    org.apache.xmlbeans.XmlIDREF xgetIDREF();
    
    /**
     * Sets the "IDREF" attribute
     */
    void setIDREF(java.lang.String idref);
    
    /**
     * Sets (as xml) the "IDREF" attribute
     */
    void xsetIDREF(org.apache.xmlbeans.XmlIDREF idref);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef newInstance() {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
