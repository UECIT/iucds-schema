/*
 * XML Type:  POCD_MT200001GB02.Participant
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML POCD_MT200001GB02.Participant(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface POCDMT200001GB02Participant extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(POCDMT200001GB02Participant.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("pocdmt200001gb02participantaef8type");
    
    /**
     * Gets the "contentId" element
     */
    uk.nhs.connect.npfit.hl7.localisation.TemplateContent getContentId();
    
    /**
     * Sets the "contentId" element
     */
    void setContentId(uk.nhs.connect.npfit.hl7.localisation.TemplateContent contentId);
    
    /**
     * Appends and returns a new empty "contentId" element
     */
    uk.nhs.connect.npfit.hl7.localisation.TemplateContent addNewContentId();
    
    /**
     * Gets the "functionCode" element
     */
    uk.nhs.connect.iucds.ucr.CE getFunctionCode();
    
    /**
     * True if has "functionCode" element
     */
    boolean isSetFunctionCode();
    
    /**
     * Sets the "functionCode" element
     */
    void setFunctionCode(uk.nhs.connect.iucds.ucr.CE functionCode);
    
    /**
     * Appends and returns a new empty "functionCode" element
     */
    uk.nhs.connect.iucds.ucr.CE addNewFunctionCode();
    
    /**
     * Unsets the "functionCode" element
     */
    void unsetFunctionCode();
    
    /**
     * Gets the "COCD_TP145214GB01.AssociatedEntity" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity getCOCDTP145214GB01AssociatedEntity();
    
    /**
     * True if has "COCD_TP145214GB01.AssociatedEntity" element
     */
    boolean isSetCOCDTP145214GB01AssociatedEntity();
    
    /**
     * Sets the "COCD_TP145214GB01.AssociatedEntity" element
     */
    void setCOCDTP145214GB01AssociatedEntity(uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity cocdtp145214GB01AssociatedEntity);
    
    /**
     * Appends and returns a new empty "COCD_TP145214GB01.AssociatedEntity" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP145214GB01AssociatedEntity addNewCOCDTP145214GB01AssociatedEntity();
    
    /**
     * Unsets the "COCD_TP145214GB01.AssociatedEntity" element
     */
    void unsetCOCDTP145214GB01AssociatedEntity();
    
    /**
     * Gets the "COCD_TP145007UK03.RelatedEntity" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity getCOCDTP145007UK03RelatedEntity();
    
    /**
     * True if has "COCD_TP145007UK03.RelatedEntity" element
     */
    boolean isSetCOCDTP145007UK03RelatedEntity();
    
    /**
     * Sets the "COCD_TP145007UK03.RelatedEntity" element
     */
    void setCOCDTP145007UK03RelatedEntity(uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity cocdtp145007UK03RelatedEntity);
    
    /**
     * Appends and returns a new empty "COCD_TP145007UK03.RelatedEntity" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP145007UK03RelatedEntity addNewCOCDTP145007UK03RelatedEntity();
    
    /**
     * Unsets the "COCD_TP145007UK03.RelatedEntity" element
     */
    void unsetCOCDTP145007UK03RelatedEntity();
    
    /**
     * Gets the "COCD_TP145212GB02.Workgroup" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup getCOCDTP145212GB02Workgroup();
    
    /**
     * True if has "COCD_TP145212GB02.Workgroup" element
     */
    boolean isSetCOCDTP145212GB02Workgroup();
    
    /**
     * Sets the "COCD_TP145212GB02.Workgroup" element
     */
    void setCOCDTP145212GB02Workgroup(uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup cocdtp145212GB02Workgroup);
    
    /**
     * Appends and returns a new empty "COCD_TP145212GB02.Workgroup" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP145212GB02Workgroup addNewCOCDTP145212GB02Workgroup();
    
    /**
     * Unsets the "COCD_TP145212GB02.Workgroup" element
     */
    void unsetCOCDTP145212GB02Workgroup();
    
    /**
     * Gets the "nullFlavor" attribute
     */
    java.lang.String getNullFlavor();
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    uk.nhs.connect.iucds.ucr.NullFlavor xgetNullFlavor();
    
    /**
     * True if has "nullFlavor" attribute
     */
    boolean isSetNullFlavor();
    
    /**
     * Sets the "nullFlavor" attribute
     */
    void setNullFlavor(java.lang.String nullFlavor);
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    void xsetNullFlavor(uk.nhs.connect.iucds.ucr.NullFlavor nullFlavor);
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    void unsetNullFlavor();
    
    /**
     * Gets the "updateMode" attribute
     */
    uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum getUpdateMode();
    
    /**
     * Gets (as xml) the "updateMode" attribute
     */
    uk.nhs.connect.iucds.ucr.CsUpdateMode xgetUpdateMode();
    
    /**
     * True if has "updateMode" attribute
     */
    boolean isSetUpdateMode();
    
    /**
     * Sets the "updateMode" attribute
     */
    void setUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum updateMode);
    
    /**
     * Sets (as xml) the "updateMode" attribute
     */
    void xsetUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode updateMode);
    
    /**
     * Unsets the "updateMode" attribute
     */
    void unsetUpdateMode();
    
    /**
     * Gets the "typeCode" attribute
     */
    java.lang.String getTypeCode();
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    uk.nhs.connect.iucds.ucr.ParticipationType xgetTypeCode();
    
    /**
     * Sets the "typeCode" attribute
     */
    void setTypeCode(java.lang.String typeCode);
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    void xsetTypeCode(uk.nhs.connect.iucds.ucr.ParticipationType typeCode);
    
    /**
     * Gets the "contextControlCode" attribute
     */
    java.lang.String getContextControlCode();
    
    /**
     * Gets (as xml) the "contextControlCode" attribute
     */
    uk.nhs.connect.iucds.ucr.ContextControl xgetContextControlCode();
    
    /**
     * Sets the "contextControlCode" attribute
     */
    void setContextControlCode(java.lang.String contextControlCode);
    
    /**
     * Sets (as xml) the "contextControlCode" attribute
     */
    void xsetContextControlCode(uk.nhs.connect.iucds.ucr.ContextControl contextControlCode);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant newInstance() {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.POCDMT200001GB02Participant) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
