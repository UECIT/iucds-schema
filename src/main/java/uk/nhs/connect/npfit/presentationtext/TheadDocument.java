/*
 * An XML document type.
 * Localname: thead
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TheadDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext;


/**
 * A document containing one thead(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public interface TheadDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TheadDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("thead186edoctype");
    
    /**
     * Gets the "thead" element
     */
    uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead getThead();
    
    /**
     * Sets the "thead" element
     */
    void setThead(uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead thead);
    
    /**
     * Appends and returns a new empty "thead" element
     */
    uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead addNewThead();
    
    /**
     * An XML thead(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public interface Thead extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Thead.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("theadc5aeelemtype");
        
        /**
         * Gets array of all "tr" elements
         */
        uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[] getTrArray();
        
        /**
         * Gets ith "tr" element
         */
        uk.nhs.connect.npfit.presentationtext.TrDocument.Tr getTrArray(int i);
        
        /**
         * Returns number of "tr" element
         */
        int sizeOfTrArray();
        
        /**
         * Sets array of all "tr" element
         */
        void setTrArray(uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[] trArray);
        
        /**
         * Sets ith "tr" element
         */
        void setTrArray(int i, uk.nhs.connect.npfit.presentationtext.TrDocument.Tr tr);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tr" element
         */
        uk.nhs.connect.npfit.presentationtext.TrDocument.Tr insertNewTr(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tr" element
         */
        uk.nhs.connect.npfit.presentationtext.TrDocument.Tr addNewTr();
        
        /**
         * Removes the ith "tr" element
         */
        void removeTr(int i);
        
        /**
         * Gets the "id" attribute
         */
        java.lang.String getId();
        
        /**
         * Gets (as xml) the "id" attribute
         */
        org.apache.xmlbeans.XmlString xgetId();
        
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
        void xsetId(org.apache.xmlbeans.XmlString id);
        
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
        org.apache.xmlbeans.XmlString xgetClass1();
        
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
        void xsetClass1(org.apache.xmlbeans.XmlString class1);
        
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
            public static uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead newInstance() {
              return (uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument newInstance() {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.TheadDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.TheadDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
