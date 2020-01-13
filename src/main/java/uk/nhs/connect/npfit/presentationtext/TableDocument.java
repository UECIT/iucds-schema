/*
 * An XML document type.
 * Localname: table
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TableDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext;


/**
 * A document containing one table(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public interface TableDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TableDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4BABE8FDCEE77C72D65F874A86ECBDEB").resolveHandle("table7b34doctype");
    
    /**
     * Gets the "table" element
     */
    uk.nhs.connect.npfit.presentationtext.TableDocument.Table getTable();
    
    /**
     * Sets the "table" element
     */
    void setTable(uk.nhs.connect.npfit.presentationtext.TableDocument.Table table);
    
    /**
     * Appends and returns a new empty "table" element
     */
    uk.nhs.connect.npfit.presentationtext.TableDocument.Table addNewTable();
    
    /**
     * An XML table(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public interface Table extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Table.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4BABE8FDCEE77C72D65F874A86ECBDEB").resolveHandle("table653aelemtype");
        
        /**
         * Gets the "caption" element
         */
        uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption getCaption();
        
        /**
         * True if has "caption" element
         */
        boolean isSetCaption();
        
        /**
         * Sets the "caption" element
         */
        void setCaption(uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption caption);
        
        /**
         * Appends and returns a new empty "caption" element
         */
        uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption addNewCaption();
        
        /**
         * Unsets the "caption" element
         */
        void unsetCaption();
        
        /**
         * Gets the "thead" element
         */
        uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead getThead();
        
        /**
         * True if has "thead" element
         */
        boolean isSetThead();
        
        /**
         * Sets the "thead" element
         */
        void setThead(uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead thead);
        
        /**
         * Appends and returns a new empty "thead" element
         */
        uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead addNewThead();
        
        /**
         * Unsets the "thead" element
         */
        void unsetThead();
        
        /**
         * Gets the "tfoot" element
         */
        uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot getTfoot();
        
        /**
         * True if has "tfoot" element
         */
        boolean isSetTfoot();
        
        /**
         * Sets the "tfoot" element
         */
        void setTfoot(uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot tfoot);
        
        /**
         * Appends and returns a new empty "tfoot" element
         */
        uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot addNewTfoot();
        
        /**
         * Unsets the "tfoot" element
         */
        void unsetTfoot();
        
        /**
         * Gets array of all "tbody" elements
         */
        uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody[] getTbodyArray();
        
        /**
         * Gets ith "tbody" element
         */
        uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody getTbodyArray(int i);
        
        /**
         * Returns number of "tbody" element
         */
        int sizeOfTbodyArray();
        
        /**
         * Sets array of all "tbody" element
         */
        void setTbodyArray(uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody[] tbodyArray);
        
        /**
         * Sets ith "tbody" element
         */
        void setTbodyArray(int i, uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody tbody);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tbody" element
         */
        uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody insertNewTbody(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tbody" element
         */
        uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody addNewTbody();
        
        /**
         * Removes the ith "tbody" element
         */
        void removeTbody(int i);
        
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
         * Gets the "summary" attribute
         */
        java.lang.String getSummary();
        
        /**
         * Gets (as xml) the "summary" attribute
         */
        org.apache.xmlbeans.XmlString xgetSummary();
        
        /**
         * True if has "summary" attribute
         */
        boolean isSetSummary();
        
        /**
         * Sets the "summary" attribute
         */
        void setSummary(java.lang.String summary);
        
        /**
         * Sets (as xml) the "summary" attribute
         */
        void xsetSummary(org.apache.xmlbeans.XmlString summary);
        
        /**
         * Unsets the "summary" attribute
         */
        void unsetSummary();
        
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
            public static uk.nhs.connect.npfit.presentationtext.TableDocument.Table newInstance() {
              return (uk.nhs.connect.npfit.presentationtext.TableDocument.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.npfit.presentationtext.TableDocument.Table newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.npfit.presentationtext.TableDocument.Table) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.npfit.presentationtext.TableDocument newInstance() {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.npfit.presentationtext.TableDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.npfit.presentationtext.TableDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
