/*
 * An XML document type.
 * Localname: td
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TdDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext;


/**
 * A document containing one td(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public interface TdDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TdDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("td0200doctype");
    
    /**
     * Gets the "td" element
     */
    uk.nhs.connect.npfit.presentationtext.TdDocument.Td getTd();
    
    /**
     * Sets the "td" element
     */
    void setTd(uk.nhs.connect.npfit.presentationtext.TdDocument.Td td);
    
    /**
     * Appends and returns a new empty "td" element
     */
    uk.nhs.connect.npfit.presentationtext.TdDocument.Td addNewTd();
    
    /**
     * An XML td(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public interface Td extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Td.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("td100celemtype");
        
        /**
         * Gets array of all "li" elements
         */
        uk.nhs.connect.npfit.presentationtext.LiDocument.Li[] getLiArray();
        
        /**
         * Gets ith "li" element
         */
        uk.nhs.connect.npfit.presentationtext.LiDocument.Li getLiArray(int i);
        
        /**
         * Returns number of "li" element
         */
        int sizeOfLiArray();
        
        /**
         * Sets array of all "li" element
         */
        void setLiArray(uk.nhs.connect.npfit.presentationtext.LiDocument.Li[] liArray);
        
        /**
         * Sets ith "li" element
         */
        void setLiArray(int i, uk.nhs.connect.npfit.presentationtext.LiDocument.Li li);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "li" element
         */
        uk.nhs.connect.npfit.presentationtext.LiDocument.Li insertNewLi(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "li" element
         */
        uk.nhs.connect.npfit.presentationtext.LiDocument.Li addNewLi();
        
        /**
         * Removes the ith "li" element
         */
        void removeLi(int i);
        
        /**
         * Gets array of all "ol" elements
         */
        uk.nhs.connect.npfit.presentationtext.OlDocument.Ol[] getOlArray();
        
        /**
         * Gets ith "ol" element
         */
        uk.nhs.connect.npfit.presentationtext.OlDocument.Ol getOlArray(int i);
        
        /**
         * Returns number of "ol" element
         */
        int sizeOfOlArray();
        
        /**
         * Sets array of all "ol" element
         */
        void setOlArray(uk.nhs.connect.npfit.presentationtext.OlDocument.Ol[] olArray);
        
        /**
         * Sets ith "ol" element
         */
        void setOlArray(int i, uk.nhs.connect.npfit.presentationtext.OlDocument.Ol ol);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ol" element
         */
        uk.nhs.connect.npfit.presentationtext.OlDocument.Ol insertNewOl(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ol" element
         */
        uk.nhs.connect.npfit.presentationtext.OlDocument.Ol addNewOl();
        
        /**
         * Removes the ith "ol" element
         */
        void removeOl(int i);
        
        /**
         * Gets array of all "ul" elements
         */
        uk.nhs.connect.npfit.presentationtext.UlDocument.Ul[] getUlArray();
        
        /**
         * Gets ith "ul" element
         */
        uk.nhs.connect.npfit.presentationtext.UlDocument.Ul getUlArray(int i);
        
        /**
         * Returns number of "ul" element
         */
        int sizeOfUlArray();
        
        /**
         * Sets array of all "ul" element
         */
        void setUlArray(uk.nhs.connect.npfit.presentationtext.UlDocument.Ul[] ulArray);
        
        /**
         * Sets ith "ul" element
         */
        void setUlArray(int i, uk.nhs.connect.npfit.presentationtext.UlDocument.Ul ul);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ul" element
         */
        uk.nhs.connect.npfit.presentationtext.UlDocument.Ul insertNewUl(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ul" element
         */
        uk.nhs.connect.npfit.presentationtext.UlDocument.Ul addNewUl();
        
        /**
         * Removes the ith "ul" element
         */
        void removeUl(int i);
        
        /**
         * Gets array of all "a" elements
         */
        uk.nhs.connect.npfit.presentationtext.ADocument.A[] getAArray();
        
        /**
         * Gets ith "a" element
         */
        uk.nhs.connect.npfit.presentationtext.ADocument.A getAArray(int i);
        
        /**
         * Returns number of "a" element
         */
        int sizeOfAArray();
        
        /**
         * Sets array of all "a" element
         */
        void setAArray(uk.nhs.connect.npfit.presentationtext.ADocument.A[] aArray);
        
        /**
         * Sets ith "a" element
         */
        void setAArray(int i, uk.nhs.connect.npfit.presentationtext.ADocument.A a);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "a" element
         */
        uk.nhs.connect.npfit.presentationtext.ADocument.A insertNewA(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "a" element
         */
        uk.nhs.connect.npfit.presentationtext.ADocument.A addNewA();
        
        /**
         * Removes the ith "a" element
         */
        void removeA(int i);
        
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
         * Gets the "rowspan" attribute
         */
        java.lang.String getRowspan();
        
        /**
         * Gets (as xml) the "rowspan" attribute
         */
        org.apache.xmlbeans.XmlString xgetRowspan();
        
        /**
         * True if has "rowspan" attribute
         */
        boolean isSetRowspan();
        
        /**
         * Sets the "rowspan" attribute
         */
        void setRowspan(java.lang.String rowspan);
        
        /**
         * Sets (as xml) the "rowspan" attribute
         */
        void xsetRowspan(org.apache.xmlbeans.XmlString rowspan);
        
        /**
         * Unsets the "rowspan" attribute
         */
        void unsetRowspan();
        
        /**
         * Gets the "colspan" attribute
         */
        java.lang.String getColspan();
        
        /**
         * Gets (as xml) the "colspan" attribute
         */
        org.apache.xmlbeans.XmlString xgetColspan();
        
        /**
         * True if has "colspan" attribute
         */
        boolean isSetColspan();
        
        /**
         * Sets the "colspan" attribute
         */
        void setColspan(java.lang.String colspan);
        
        /**
         * Sets (as xml) the "colspan" attribute
         */
        void xsetColspan(org.apache.xmlbeans.XmlString colspan);
        
        /**
         * Unsets the "colspan" attribute
         */
        void unsetColspan();
        
        /**
         * Gets the "abbr" attribute
         */
        java.lang.String getAbbr();
        
        /**
         * Gets (as xml) the "abbr" attribute
         */
        org.apache.xmlbeans.XmlString xgetAbbr();
        
        /**
         * True if has "abbr" attribute
         */
        boolean isSetAbbr();
        
        /**
         * Sets the "abbr" attribute
         */
        void setAbbr(java.lang.String abbr);
        
        /**
         * Sets (as xml) the "abbr" attribute
         */
        void xsetAbbr(org.apache.xmlbeans.XmlString abbr);
        
        /**
         * Unsets the "abbr" attribute
         */
        void unsetAbbr();
        
        /**
         * Gets the "headers" attribute
         */
        java.lang.String getHeaders();
        
        /**
         * Gets (as xml) the "headers" attribute
         */
        org.apache.xmlbeans.XmlString xgetHeaders();
        
        /**
         * True if has "headers" attribute
         */
        boolean isSetHeaders();
        
        /**
         * Sets the "headers" attribute
         */
        void setHeaders(java.lang.String headers);
        
        /**
         * Sets (as xml) the "headers" attribute
         */
        void xsetHeaders(org.apache.xmlbeans.XmlString headers);
        
        /**
         * Unsets the "headers" attribute
         */
        void unsetHeaders();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.npfit.presentationtext.TdDocument.Td newInstance() {
              return (uk.nhs.connect.npfit.presentationtext.TdDocument.Td) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.npfit.presentationtext.TdDocument.Td newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.npfit.presentationtext.TdDocument.Td) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.npfit.presentationtext.TdDocument newInstance() {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.TdDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.TdDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
