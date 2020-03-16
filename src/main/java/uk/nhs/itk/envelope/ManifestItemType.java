/*
 * XML Type:  manifestItemType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.ManifestItemType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope;


/**
 * An XML manifestItemType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public interface ManifestItemType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ManifestItemType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA11CF2E434611342D443F7F6909CDE22").resolveHandle("manifestitemtypec0a5type");
    
    /**
     * Gets the "id" attribute
     */
    java.lang.String getId();
    
    /**
     * Gets (as xml) the "id" attribute
     */
    org.apache.xmlbeans.XmlIDREF xgetId();
    
    /**
     * Sets the "id" attribute
     */
    void setId(java.lang.String id);
    
    /**
     * Sets (as xml) the "id" attribute
     */
    void xsetId(org.apache.xmlbeans.XmlIDREF id);
    
    /**
     * Gets the "mimetype" attribute
     */
    java.lang.String getMimetype();
    
    /**
     * Gets (as xml) the "mimetype" attribute
     */
    org.apache.xmlbeans.XmlString xgetMimetype();
    
    /**
     * Sets the "mimetype" attribute
     */
    void setMimetype(java.lang.String mimetype);
    
    /**
     * Sets (as xml) the "mimetype" attribute
     */
    void xsetMimetype(org.apache.xmlbeans.XmlString mimetype);
    
    /**
     * Gets the "profileid" attribute
     */
    java.lang.String getProfileid();
    
    /**
     * Gets (as xml) the "profileid" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetProfileid();
    
    /**
     * True if has "profileid" attribute
     */
    boolean isSetProfileid();
    
    /**
     * Sets the "profileid" attribute
     */
    void setProfileid(java.lang.String profileid);
    
    /**
     * Sets (as xml) the "profileid" attribute
     */
    void xsetProfileid(org.apache.xmlbeans.XmlAnyURI profileid);
    
    /**
     * Unsets the "profileid" attribute
     */
    void unsetProfileid();
    
    /**
     * Gets the "metadata" attribute
     */
    boolean getMetadata();
    
    /**
     * Gets (as xml) the "metadata" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetMetadata();
    
    /**
     * True if has "metadata" attribute
     */
    boolean isSetMetadata();
    
    /**
     * Sets the "metadata" attribute
     */
    void setMetadata(boolean metadata);
    
    /**
     * Sets (as xml) the "metadata" attribute
     */
    void xsetMetadata(org.apache.xmlbeans.XmlBoolean metadata);
    
    /**
     * Unsets the "metadata" attribute
     */
    void unsetMetadata();
    
    /**
     * Gets the "compressed" attribute
     */
    boolean getCompressed();
    
    /**
     * Gets (as xml) the "compressed" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetCompressed();
    
    /**
     * True if has "compressed" attribute
     */
    boolean isSetCompressed();
    
    /**
     * Sets the "compressed" attribute
     */
    void setCompressed(boolean compressed);
    
    /**
     * Sets (as xml) the "compressed" attribute
     */
    void xsetCompressed(org.apache.xmlbeans.XmlBoolean compressed);
    
    /**
     * Unsets the "compressed" attribute
     */
    void unsetCompressed();
    
    /**
     * Gets the "base64" attribute
     */
    boolean getBase64();
    
    /**
     * Gets (as xml) the "base64" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetBase64();
    
    /**
     * True if has "base64" attribute
     */
    boolean isSetBase64();
    
    /**
     * Sets the "base64" attribute
     */
    void setBase64(boolean base64);
    
    /**
     * Sets (as xml) the "base64" attribute
     */
    void xsetBase64(org.apache.xmlbeans.XmlBoolean base64);
    
    /**
     * Unsets the "base64" attribute
     */
    void unsetBase64();
    
    /**
     * Gets the "encrypted" attribute
     */
    boolean getEncrypted();
    
    /**
     * Gets (as xml) the "encrypted" attribute
     */
    org.apache.xmlbeans.XmlBoolean xgetEncrypted();
    
    /**
     * True if has "encrypted" attribute
     */
    boolean isSetEncrypted();
    
    /**
     * Sets the "encrypted" attribute
     */
    void setEncrypted(boolean encrypted);
    
    /**
     * Sets (as xml) the "encrypted" attribute
     */
    void xsetEncrypted(org.apache.xmlbeans.XmlBoolean encrypted);
    
    /**
     * Unsets the "encrypted" attribute
     */
    void unsetEncrypted();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.itk.envelope.ManifestItemType newInstance() {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.itk.envelope.ManifestItemType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.itk.envelope.ManifestItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.itk.envelope.ManifestItemType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.itk.envelope.ManifestItemType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
