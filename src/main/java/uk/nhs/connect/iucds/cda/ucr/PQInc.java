/*
 * XML Type:  PQ_inc
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.PQInc
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML PQ_inc(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface PQInc extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PQInc.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("pqinca4adtype");
    
    /**
     * Gets array of all "translation" elements
     */
    uk.nhs.connect.iucds.cda.ucr.PQR[] getTranslationArray();
    
    /**
     * Gets ith "translation" element
     */
    uk.nhs.connect.iucds.cda.ucr.PQR getTranslationArray(int i);
    
    /**
     * Returns number of "translation" element
     */
    int sizeOfTranslationArray();
    
    /**
     * Sets array of all "translation" element
     */
    void setTranslationArray(uk.nhs.connect.iucds.cda.ucr.PQR[] translationArray);
    
    /**
     * Sets ith "translation" element
     */
    void setTranslationArray(int i, uk.nhs.connect.iucds.cda.ucr.PQR translation);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "translation" element
     */
    uk.nhs.connect.iucds.cda.ucr.PQR insertNewTranslation(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "translation" element
     */
    uk.nhs.connect.iucds.cda.ucr.PQR addNewTranslation();
    
    /**
     * Removes the ith "translation" element
     */
    void removeTranslation(int i);
    
    /**
     * Gets the "value" attribute
     */
    java.lang.Object getValue();
    
    /**
     * Gets (as xml) the "value" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.Real2 xgetValue();
    
    /**
     * True if has "value" attribute
     */
    boolean isSetValue();
    
    /**
     * Sets the "value" attribute
     */
    void setValue(java.lang.Object value);
    
    /**
     * Sets (as xml) the "value" attribute
     */
    void xsetValue(uk.nhs.connect.iucds.cda.ucr.Real2 value);
    
    /**
     * Unsets the "value" attribute
     */
    void unsetValue();
    
    /**
     * Gets the "unit" attribute
     */
    java.lang.String getUnit();
    
    /**
     * Gets (as xml) the "unit" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.Cs2 xgetUnit();
    
    /**
     * True if has "unit" attribute
     */
    boolean isSetUnit();
    
    /**
     * Sets the "unit" attribute
     */
    void setUnit(java.lang.String unit);
    
    /**
     * Sets (as xml) the "unit" attribute
     */
    void xsetUnit(uk.nhs.connect.iucds.cda.ucr.Cs2 unit);
    
    /**
     * Unsets the "unit" attribute
     */
    void unsetUnit();
    
    /**
     * Gets the "originalValue" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getOriginalValue();
    
    /**
     * True if has "originalValue" attribute
     */
    boolean isSetOriginalValue();
    
    /**
     * Sets the "originalValue" attribute
     */
    void setOriginalValue(org.apache.xmlbeans.XmlAnySimpleType originalValue);
    
    /**
     * Appends and returns a new empty "originalValue" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewOriginalValue();
    
    /**
     * Unsets the "originalValue" attribute
     */
    void unsetOriginalValue();
    
    /**
     * Gets the "originalUnit" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType getOriginalUnit();
    
    /**
     * True if has "originalUnit" attribute
     */
    boolean isSetOriginalUnit();
    
    /**
     * Sets the "originalUnit" attribute
     */
    void setOriginalUnit(org.apache.xmlbeans.XmlAnySimpleType originalUnit);
    
    /**
     * Appends and returns a new empty "originalUnit" attribute
     */
    org.apache.xmlbeans.XmlAnySimpleType addNewOriginalUnit();
    
    /**
     * Unsets the "originalUnit" attribute
     */
    void unsetOriginalUnit();
    
    /**
     * Gets the "nullFlavor" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.CsNullFlavor.Enum getNullFlavor();
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.CsNullFlavor xgetNullFlavor();
    
    /**
     * True if has "nullFlavor" attribute
     */
    boolean isSetNullFlavor();
    
    /**
     * Sets the "nullFlavor" attribute
     */
    void setNullFlavor(uk.nhs.connect.iucds.cda.ucr.CsNullFlavor.Enum nullFlavor);
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    void xsetNullFlavor(uk.nhs.connect.iucds.cda.ucr.CsNullFlavor nullFlavor);
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    void unsetNullFlavor();
    
    /**
     * Gets the "inclusive" attribute
     */
    boolean getInclusive();
    
    /**
     * Gets (as xml) the "inclusive" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.Bl2 xgetInclusive();
    
    /**
     * True if has "inclusive" attribute
     */
    boolean isSetInclusive();
    
    /**
     * Sets the "inclusive" attribute
     */
    void setInclusive(boolean inclusive);
    
    /**
     * Sets (as xml) the "inclusive" attribute
     */
    void xsetInclusive(uk.nhs.connect.iucds.cda.ucr.Bl2 inclusive);
    
    /**
     * Unsets the "inclusive" attribute
     */
    void unsetInclusive();
    
    /**
     * Gets the "updateMode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.CsUpdateMode.Enum getUpdateMode();
    
    /**
     * Gets (as xml) the "updateMode" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.CsUpdateMode xgetUpdateMode();
    
    /**
     * True if has "updateMode" attribute
     */
    boolean isSetUpdateMode();
    
    /**
     * Sets the "updateMode" attribute
     */
    void setUpdateMode(uk.nhs.connect.iucds.cda.ucr.CsUpdateMode.Enum updateMode);
    
    /**
     * Sets (as xml) the "updateMode" attribute
     */
    void xsetUpdateMode(uk.nhs.connect.iucds.cda.ucr.CsUpdateMode updateMode);
    
    /**
     * Unsets the "updateMode" attribute
     */
    void unsetUpdateMode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.PQInc newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.PQInc parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.PQInc) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
