/*
 * XML Type:  StrucDoc.Thead
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.StrucDocThead
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML StrucDoc.Thead(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface StrucDocThead extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(StrucDocThead.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("strucdocthead1e0etype");
    
    /**
     * Gets array of all "tr" elements
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocTr[] getTrArray();
    
    /**
     * Gets ith "tr" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocTr getTrArray(int i);
    
    /**
     * Returns number of "tr" element
     */
    int sizeOfTrArray();
    
    /**
     * Sets array of all "tr" element
     */
    void setTrArray(uk.nhs.connect.iucds.cda.ucr.StrucDocTr[] trArray);
    
    /**
     * Sets ith "tr" element
     */
    void setTrArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocTr tr);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tr" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocTr insertNewTr(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tr" element
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocTr addNewTr();
    
    /**
     * Removes the ith "tr" element
     */
    void removeTr(int i);
    
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
     * Gets the "align" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align.Enum getAlign();
    
    /**
     * Gets (as xml) the "align" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align xgetAlign();
    
    /**
     * True if has "align" attribute
     */
    boolean isSetAlign();
    
    /**
     * Sets the "align" attribute
     */
    void setAlign(uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align.Enum align);
    
    /**
     * Sets (as xml) the "align" attribute
     */
    void xsetAlign(uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align align);
    
    /**
     * Unsets the "align" attribute
     */
    void unsetAlign();
    
    /**
     * Gets the "char" attribute
     */
    java.lang.String getChar();
    
    /**
     * Gets (as xml) the "char" attribute
     */
    org.apache.xmlbeans.XmlString xgetChar();
    
    /**
     * True if has "char" attribute
     */
    boolean isSetChar();
    
    /**
     * Sets the "char" attribute
     */
    void setChar(java.lang.String xchar);
    
    /**
     * Sets (as xml) the "char" attribute
     */
    void xsetChar(org.apache.xmlbeans.XmlString xchar);
    
    /**
     * Unsets the "char" attribute
     */
    void unsetChar();
    
    /**
     * Gets the "charoff" attribute
     */
    java.lang.String getCharoff();
    
    /**
     * Gets (as xml) the "charoff" attribute
     */
    org.apache.xmlbeans.XmlString xgetCharoff();
    
    /**
     * True if has "charoff" attribute
     */
    boolean isSetCharoff();
    
    /**
     * Sets the "charoff" attribute
     */
    void setCharoff(java.lang.String charoff);
    
    /**
     * Sets (as xml) the "charoff" attribute
     */
    void xsetCharoff(org.apache.xmlbeans.XmlString charoff);
    
    /**
     * Unsets the "charoff" attribute
     */
    void unsetCharoff();
    
    /**
     * Gets the "valign" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign.Enum getValign();
    
    /**
     * Gets (as xml) the "valign" attribute
     */
    uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign xgetValign();
    
    /**
     * True if has "valign" attribute
     */
    boolean isSetValign();
    
    /**
     * Sets the "valign" attribute
     */
    void setValign(uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign.Enum valign);
    
    /**
     * Sets (as xml) the "valign" attribute
     */
    void xsetValign(uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign valign);
    
    /**
     * Unsets the "valign" attribute
     */
    void unsetValign();
    
    /**
     * An XML align(@).
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.cda.ucr.StrucDocThead$Align.
     */
    public interface Align extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Align.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("align6a7battrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum LEFT = Enum.forString("left");
        static final Enum CENTER = Enum.forString("center");
        static final Enum RIGHT = Enum.forString("right");
        static final Enum JUSTIFY = Enum.forString("justify");
        static final Enum CHAR = Enum.forString("char");
        
        static final int INT_LEFT = Enum.INT_LEFT;
        static final int INT_CENTER = Enum.INT_CENTER;
        static final int INT_RIGHT = Enum.INT_RIGHT;
        static final int INT_JUSTIFY = Enum.INT_JUSTIFY;
        static final int INT_CHAR = Enum.INT_CHAR;
        
        /**
         * Enumeration value class for uk.nhs.connect.iucds.cda.ucr.StrucDocThead$Align.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_LEFT
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_LEFT = 1;
            static final int INT_CENTER = 2;
            static final int INT_RIGHT = 3;
            static final int INT_JUSTIFY = 4;
            static final int INT_CHAR = 5;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("left", INT_LEFT),
                    new Enum("center", INT_CENTER),
                    new Enum("right", INT_RIGHT),
                    new Enum("justify", INT_JUSTIFY),
                    new Enum("char", INT_CHAR),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align newValue(java.lang.Object obj) {
              return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align) type.newValue( obj ); }
            
            public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align newInstance() {
              return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Align) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML valign(@).
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.cda.ucr.StrucDocThead$Valign.
     */
    public interface Valign extends org.apache.xmlbeans.XmlNMTOKEN
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Valign.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("valign957dattrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum TOP = Enum.forString("top");
        static final Enum MIDDLE = Enum.forString("middle");
        static final Enum BOTTOM = Enum.forString("bottom");
        static final Enum BASELINE = Enum.forString("baseline");
        
        static final int INT_TOP = Enum.INT_TOP;
        static final int INT_MIDDLE = Enum.INT_MIDDLE;
        static final int INT_BOTTOM = Enum.INT_BOTTOM;
        static final int INT_BASELINE = Enum.INT_BASELINE;
        
        /**
         * Enumeration value class for uk.nhs.connect.iucds.cda.ucr.StrucDocThead$Valign.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_TOP
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_TOP = 1;
            static final int INT_MIDDLE = 2;
            static final int INT_BOTTOM = 3;
            static final int INT_BASELINE = 4;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("top", INT_TOP),
                    new Enum("middle", INT_MIDDLE),
                    new Enum("bottom", INT_BOTTOM),
                    new Enum("baseline", INT_BASELINE),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign newValue(java.lang.Object obj) {
              return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign) type.newValue( obj ); }
            
            public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign newInstance() {
              return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead.Valign) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.StrucDocThead parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.StrucDocThead) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
