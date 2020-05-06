/*
 * XML Type:  StrucDoc.Paragraph
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML StrucDoc.Paragraph(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface StrucDocParagraph extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrucDocParagraph.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("strucdocparagraph6bb4type");
    
    /**
     * Gets the "caption" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocCaption getCaption();
    
    /**
     * True if has "caption" element
     */
    boolean isSetCaption();
    
    /**
     * Sets the "caption" element
     */
    void setCaption(uk.nhs.connect.iucds.cda.ucr.StrucDocCaption caption);
    
    /**
     * Appends and returns a new empty "caption" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocCaption addNewCaption();
    
    /**
     * Unsets the "caption" element
     */
    void unsetCaption();
    
    /**
     * Gets array of all "content" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocContent[] getContentArray();
    
    /**
     * Gets ith "content" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocContent getContentArray(int i);
    
    /**
     * Returns number of "content" element
     */
    int sizeOfContentArray();
    
    /**
     * Sets array of all "content" element
     */
    void setContentArray(uk.nhs.connect.iucds.cda.ucr.StrucDocContent[] contentArray);
    
    /**
     * Sets ith "content" element
     */
    void setContentArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocContent content);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocContent insertNewContent(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocContent addNewContent();
    
    /**
     * Removes the ith "content" element
     */
    void removeContent(int i);
    
    /**
     * Gets array of all "linkHtml" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml[] getLinkHtmlArray();
    
    /**
     * Gets ith "linkHtml" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml getLinkHtmlArray(int i);
    
    /**
     * Returns number of "linkHtml" element
     */
    int sizeOfLinkHtmlArray();
    
    /**
     * Sets array of all "linkHtml" element
     */
    void setLinkHtmlArray(uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml[] linkHtmlArray);
    
    /**
     * Sets ith "linkHtml" element
     */
    void setLinkHtmlArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml linkHtml);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkHtml" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml insertNewLinkHtml(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkHtml" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml addNewLinkHtml();
    
    /**
     * Removes the ith "linkHtml" element
     */
    void removeLinkHtml(int i);
    
    /**
     * Gets array of all "sub" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSub[] getSubArray();
    
    /**
     * Gets ith "sub" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSub getSubArray(int i);
    
    /**
     * Returns number of "sub" element
     */
    int sizeOfSubArray();
    
    /**
     * Sets array of all "sub" element
     */
    void setSubArray(uk.nhs.connect.iucds.cda.ucr.StrucDocSub[] subArray);
    
    /**
     * Sets ith "sub" element
     */
    void setSubArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocSub sub);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sub" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSub insertNewSub(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sub" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSub addNewSub();
    
    /**
     * Removes the ith "sub" element
     */
    void removeSub(int i);
    
    /**
     * Gets array of all "sup" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSup[] getSupArray();
    
    /**
     * Gets ith "sup" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSup getSupArray(int i);
    
    /**
     * Returns number of "sup" element
     */
    int sizeOfSupArray();
    
    /**
     * Sets array of all "sup" element
     */
    void setSupArray(uk.nhs.connect.iucds.cda.ucr.StrucDocSup[] supArray);
    
    /**
     * Sets ith "sup" element
     */
    void setSupArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocSup sup);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sup" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSup insertNewSup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sup" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocSup addNewSup();
    
    /**
     * Removes the ith "sup" element
     */
    void removeSup(int i);
    
    /**
     * Gets array of all "br" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocBr[] getBrArray();
    
    /**
     * Gets ith "br" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocBr getBrArray(int i);
    
    /**
     * Returns number of "br" element
     */
    int sizeOfBrArray();
    
    /**
     * Sets array of all "br" element
     */
    void setBrArray(uk.nhs.connect.iucds.cda.ucr.StrucDocBr[] brArray);
    
    /**
     * Sets ith "br" element
     */
    void setBrArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocBr br);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocBr insertNewBr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocBr addNewBr();
    
    /**
     * Removes the ith "br" element
     */
    void removeBr(int i);
    
    /**
     * Gets array of all "footnote" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote[] getFootnoteArray();
    
    /**
     * Gets ith "footnote" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote getFootnoteArray(int i);
    
    /**
     * Returns number of "footnote" element
     */
    int sizeOfFootnoteArray();
    
    /**
     * Sets array of all "footnote" element
     */
    void setFootnoteArray(uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote[] footnoteArray);
    
    /**
     * Sets ith "footnote" element
     */
    void setFootnoteArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote footnote);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote insertNewFootnote(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote addNewFootnote();
    
    /**
     * Removes the ith "footnote" element
     */
    void removeFootnote(int i);
    
    /**
     * Gets array of all "footnoteRef" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnoteRef[] getFootnoteRefArray();
    
    /**
     * Gets ith "footnoteRef" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnoteRef getFootnoteRefArray(int i);
    
    /**
     * Returns number of "footnoteRef" element
     */
    int sizeOfFootnoteRefArray();
    
    /**
     * Sets array of all "footnoteRef" element
     */
    void setFootnoteRefArray(uk.nhs.connect.iucds.cda.ucr.StrucDocFootnoteRef[] footnoteRefArray);
    
    /**
     * Sets ith "footnoteRef" element
     */
    void setFootnoteRefArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocFootnoteRef footnoteRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnoteRef" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnoteRef insertNewFootnoteRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnoteRef" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocFootnoteRef addNewFootnoteRef();
    
    /**
     * Removes the ith "footnoteRef" element
     */
    void removeFootnoteRef(int i);
    
    /**
     * Gets array of all "renderMultiMedia" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia[] getRenderMultiMediaArray();
    
    /**
     * Gets ith "renderMultiMedia" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia getRenderMultiMediaArray(int i);
    
    /**
     * Returns number of "renderMultiMedia" element
     */
    int sizeOfRenderMultiMediaArray();
    
    /**
     * Sets array of all "renderMultiMedia" element
     */
    void setRenderMultiMediaArray(uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia[] renderMultiMediaArray);
    
    /**
     * Sets ith "renderMultiMedia" element
     */
    void setRenderMultiMediaArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia renderMultiMedia);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "renderMultiMedia" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia insertNewRenderMultiMedia(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "renderMultiMedia" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia addNewRenderMultiMedia();
    
    /**
     * Removes the ith "renderMultiMedia" element
     */
    void removeRenderMultiMedia(int i);
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
