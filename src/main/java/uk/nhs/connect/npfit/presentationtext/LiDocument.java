/*
 * An XML document type.
 * Localname: li
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.LiDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext;


/**
 * A document containing one li(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public interface LiDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(LiDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("li1a13doctype");
    
    /**
     * Gets the "li" element
     */
    uk.nhs.connect.npfit.presentationtext.LiDocument.Li getLi();
    
    /**
     * Sets the "li" element
     */
    void setLi(uk.nhs.connect.npfit.presentationtext.LiDocument.Li li);
    
    /**
     * Appends and returns a new empty "li" element
     */
    uk.nhs.connect.npfit.presentationtext.LiDocument.Li addNewLi();
    
    /**
     * An XML li(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public interface Li extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Li.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("li23ecelemtype");
        
        /**
         * Gets the "a" element
         */
        uk.nhs.connect.npfit.presentationtext.ADocument.A getA();
        
        /**
         * True if has "a" element
         */
        boolean isSetA();
        
        /**
         * Sets the "a" element
         */
        void setA(uk.nhs.connect.npfit.presentationtext.ADocument.A a);
        
        /**
         * Appends and returns a new empty "a" element
         */
        uk.nhs.connect.npfit.presentationtext.ADocument.A addNewA();
        
        /**
         * Unsets the "a" element
         */
        void unsetA();
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetId();
        
        /**
         * True if has "id" attribute
         */
        boolean isSetId();
        
        /**
         * Sets the "id" attribute
         */
        void setId(java.lang.String id);
        
        /**
         * Sets (as xml) the "id" attribute
         */
        void xsetId(org.apache.xmlbeans.XmlNMTOKEN id);
        
        /**
         * Unsets the "id" attribute
         */
        void unsetId();
        
        /**
         * Gets the "class" attribute
         */
        java.lang.String getClass1();
        
        /**
         * Gets (as xml) the "class" attribute
         */
        org.apache.xmlbeans.XmlNMTOKEN xgetClass1();
        
        /**
         * True if has "class" attribute
         */
        boolean isSetClass1();
        
        /**
         * Sets the "class" attribute
         */
        void setClass1(java.lang.String class1);
        
        /**
         * Sets (as xml) the "class" attribute
         */
        void xsetClass1(org.apache.xmlbeans.XmlNMTOKEN class1);
        
        /**
         * Unsets the "class" attribute
         */
        void unsetClass1();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.npfit.presentationtext.LiDocument.Li newInstance() {
              return (uk.nhs.connect.npfit.presentationtext.LiDocument.Li) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.npfit.presentationtext.LiDocument.Li newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.npfit.presentationtext.LiDocument.Li) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.npfit.presentationtext.LiDocument newInstance() {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.LiDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.LiDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
