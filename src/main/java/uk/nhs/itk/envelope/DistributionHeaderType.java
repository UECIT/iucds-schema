/*
 * XML Type:  distributionHeaderType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.DistributionHeaderType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope;


/**
 * An XML distributionHeaderType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public interface DistributionHeaderType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DistributionHeaderType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sA11CF2E434611342D443F7F6909CDE22").resolveHandle("distributionheadertype8574type");
    
    /**
     * Gets the "addresslist" element
     */
    uk.nhs.itk.envelope.AddressListType getAddresslist();
    
    /**
     * True if has "addresslist" element
     */
    boolean isSetAddresslist();
    
    /**
     * Sets the "addresslist" element
     */
    void setAddresslist(uk.nhs.itk.envelope.AddressListType addresslist);
    
    /**
     * Appends and returns a new empty "addresslist" element
     */
    uk.nhs.itk.envelope.AddressListType addNewAddresslist();
    
    /**
     * Unsets the "addresslist" element
     */
    void unsetAddresslist();
    
    /**
     * Gets the "auditIdentity" element
     */
    uk.nhs.itk.envelope.AuditIdentityType getAuditIdentity();
    
    /**
     * True if has "auditIdentity" element
     */
    boolean isSetAuditIdentity();
    
    /**
     * Sets the "auditIdentity" element
     */
    void setAuditIdentity(uk.nhs.itk.envelope.AuditIdentityType auditIdentity);
    
    /**
     * Appends and returns a new empty "auditIdentity" element
     */
    uk.nhs.itk.envelope.AuditIdentityType addNewAuditIdentity();
    
    /**
     * Unsets the "auditIdentity" element
     */
    void unsetAuditIdentity();
    
    /**
     * Gets the "manifest" element
     */
    uk.nhs.itk.envelope.ManifestType getManifest();
    
    /**
     * Sets the "manifest" element
     */
    void setManifest(uk.nhs.itk.envelope.ManifestType manifest);
    
    /**
     * Appends and returns a new empty "manifest" element
     */
    uk.nhs.itk.envelope.ManifestType addNewManifest();
    
    /**
     * Gets the "senderAddress" element
     */
    uk.nhs.itk.envelope.AddressType getSenderAddress();
    
    /**
     * True if has "senderAddress" element
     */
    boolean isSetSenderAddress();
    
    /**
     * Sets the "senderAddress" element
     */
    void setSenderAddress(uk.nhs.itk.envelope.AddressType senderAddress);
    
    /**
     * Appends and returns a new empty "senderAddress" element
     */
    uk.nhs.itk.envelope.AddressType addNewSenderAddress();
    
    /**
     * Unsets the "senderAddress" element
     */
    void unsetSenderAddress();
    
    /**
     * Gets the "handlingSpecification" element
     */
    uk.nhs.itk.envelope.HandlingType getHandlingSpecification();
    
    /**
     * True if has "handlingSpecification" element
     */
    boolean isSetHandlingSpecification();
    
    /**
     * Sets the "handlingSpecification" element
     */
    void setHandlingSpecification(uk.nhs.itk.envelope.HandlingType handlingSpecification);
    
    /**
     * Appends and returns a new empty "handlingSpecification" element
     */
    uk.nhs.itk.envelope.HandlingType addNewHandlingSpecification();
    
    /**
     * Unsets the "handlingSpecification" element
     */
    void unsetHandlingSpecification();
    
    /**
     * Gets the "trackingid" attribute
     */
    java.lang.String getTrackingid();
    
    /**
     * Gets (as xml) the "trackingid" attribute
     */
    uk.nhs.itk.envelope.Uuid xgetTrackingid();
    
    /**
     * Sets the "trackingid" attribute
     */
    void setTrackingid(java.lang.String trackingid);
    
    /**
     * Sets (as xml) the "trackingid" attribute
     */
    void xsetTrackingid(uk.nhs.itk.envelope.Uuid trackingid);
    
    /**
     * Gets the "service" attribute
     */
    java.lang.String getService();
    
    /**
     * Gets (as xml) the "service" attribute
     */
    org.apache.xmlbeans.XmlAnyURI xgetService();
    
    /**
     * Sets the "service" attribute
     */
    void setService(java.lang.String service);
    
    /**
     * Sets (as xml) the "service" attribute
     */
    void xsetService(org.apache.xmlbeans.XmlAnyURI service);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.itk.envelope.DistributionHeaderType newInstance() {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.itk.envelope.DistributionHeaderType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.itk.envelope.DistributionHeaderType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
