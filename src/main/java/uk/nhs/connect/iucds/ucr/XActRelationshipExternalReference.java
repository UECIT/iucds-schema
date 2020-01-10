/*
 * XML Type:  x_ActRelationshipExternalReference
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML x_ActRelationshipExternalReference(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.XActRelationshipExternalReferenceX
 */
public interface XActRelationshipExternalReference extends org.apache.xmlbeans.XmlAnySimpleType
{
    java.lang.Object getObjectValue();
    void setObjectValue(java.lang.Object val);
    /** @deprecated */
    java.lang.Object objectValue();
    /** @deprecated */
    void objectSet(java.lang.Object val);
    org.apache.xmlbeans.SchemaType instanceType();
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XActRelationshipExternalReference.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("xactrelationshipexternalreference3f30type");
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference newInstance() {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.XActRelationshipExternalReference) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
