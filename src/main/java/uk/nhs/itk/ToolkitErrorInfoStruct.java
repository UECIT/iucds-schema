/*
 * XML Type:  ToolkitErrorInfoStruct
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.ToolkitErrorInfoStruct
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk;


/**
 * An XML ToolkitErrorInfoStruct(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public interface ToolkitErrorInfoStruct extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ToolkitErrorInfoStruct.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0507910213A0A5EFBE69DF14BF9CC2C5").resolveHandle("toolkiterrorinfostructb336type");
    
    /**
     * Gets the "ErrorID" element
     */
    java.lang.String getErrorID();
    
    /**
     * Gets (as xml) the "ErrorID" element
     */
    org.apache.xmlbeans.XmlAnyURI xgetErrorID();
    
    /**
     * Sets the "ErrorID" element
     */
    void setErrorID(java.lang.String errorID);
    
    /**
     * Sets (as xml) the "ErrorID" element
     */
    void xsetErrorID(org.apache.xmlbeans.XmlAnyURI errorID);
    
    /**
     * Gets the "ErrorCode" element
     */
    uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode getErrorCode();
    
    /**
     * Sets the "ErrorCode" element
     */
    void setErrorCode(uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode errorCode);
    
    /**
     * Appends and returns a new empty "ErrorCode" element
     */
    uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode addNewErrorCode();
    
    /**
     * Gets the "ErrorText" element
     */
    java.lang.String getErrorText();
    
    /**
     * Gets (as xml) the "ErrorText" element
     */
    org.apache.xmlbeans.XmlString xgetErrorText();
    
    /**
     * Sets the "ErrorText" element
     */
    void setErrorText(java.lang.String errorText);
    
    /**
     * Sets (as xml) the "ErrorText" element
     */
    void xsetErrorText(org.apache.xmlbeans.XmlString errorText);
    
    /**
     * Gets the "ErrorDiagnosticText" element
     */
    java.lang.String getErrorDiagnosticText();
    
    /**
     * Gets (as xml) the "ErrorDiagnosticText" element
     */
    org.apache.xmlbeans.XmlString xgetErrorDiagnosticText();
    
    /**
     * True if has "ErrorDiagnosticText" element
     */
    boolean isSetErrorDiagnosticText();
    
    /**
     * Sets the "ErrorDiagnosticText" element
     */
    void setErrorDiagnosticText(java.lang.String errorDiagnosticText);
    
    /**
     * Sets (as xml) the "ErrorDiagnosticText" element
     */
    void xsetErrorDiagnosticText(org.apache.xmlbeans.XmlString errorDiagnosticText);
    
    /**
     * Unsets the "ErrorDiagnosticText" element
     */
    void unsetErrorDiagnosticText();
    
    /**
     * An XML ErrorCode(@urn:nhs-itk:ns:201005).
     *
     * This is an atomic type that is a restriction of uk.nhs.itk.ToolkitErrorInfoStruct$ErrorCode.
     */
    public interface ErrorCode extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ErrorCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s0507910213A0A5EFBE69DF14BF9CC2C5").resolveHandle("errorcoded6b5elemtype");
        
        /**
         * Gets the "codeSystem" attribute
         */
        java.lang.String getCodeSystem();
        
        /**
         * Gets (as xml) the "codeSystem" attribute
         */
        org.apache.xmlbeans.XmlString xgetCodeSystem();
        
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
        void xsetCodeSystem(org.apache.xmlbeans.XmlString codeSystem);
        
        /**
         * Unsets the "codeSystem" attribute
         */
        void unsetCodeSystem();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode newInstance() {
              return (uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.itk.ToolkitErrorInfoStruct newInstance() {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.itk.ToolkitErrorInfoStruct parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.itk.ToolkitErrorInfoStruct) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
