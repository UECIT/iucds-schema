/*
 * XML Type:  CDAOrganizationType_code
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML CDAOrganizationType_code(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode.
 */
public interface CDAOrganizationTypeCode extends uk.nhs.connect.iucds.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDAOrganizationTypeCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("cdaorganizationtypecode57eetype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum X_001 = Enum.forString("001");
    static final Enum X_002 = Enum.forString("002");
    static final Enum X_003 = Enum.forString("003");
    static final Enum X_004 = Enum.forString("004");
    static final Enum X_005 = Enum.forString("005");
    static final Enum X_006 = Enum.forString("006");
    static final Enum X_007 = Enum.forString("007");
    static final Enum X_008 = Enum.forString("008");
    static final Enum X_009 = Enum.forString("009");
    static final Enum X_010 = Enum.forString("010");
    static final Enum X_011 = Enum.forString("011");
    static final Enum X_012 = Enum.forString("012");
    static final Enum X_013 = Enum.forString("013");
    static final Enum X_014 = Enum.forString("014");
    static final Enum X_015 = Enum.forString("015");
    static final Enum X_016 = Enum.forString("016");
    static final Enum X_017 = Enum.forString("017");
    static final Enum X_018 = Enum.forString("018");
    static final Enum X_019 = Enum.forString("019");
    static final Enum X_020 = Enum.forString("020");
    static final Enum X_021 = Enum.forString("021");
    static final Enum X_999 = Enum.forString("999");
    
    static final int INT_X_001 = Enum.INT_X_001;
    static final int INT_X_002 = Enum.INT_X_002;
    static final int INT_X_003 = Enum.INT_X_003;
    static final int INT_X_004 = Enum.INT_X_004;
    static final int INT_X_005 = Enum.INT_X_005;
    static final int INT_X_006 = Enum.INT_X_006;
    static final int INT_X_007 = Enum.INT_X_007;
    static final int INT_X_008 = Enum.INT_X_008;
    static final int INT_X_009 = Enum.INT_X_009;
    static final int INT_X_010 = Enum.INT_X_010;
    static final int INT_X_011 = Enum.INT_X_011;
    static final int INT_X_012 = Enum.INT_X_012;
    static final int INT_X_013 = Enum.INT_X_013;
    static final int INT_X_014 = Enum.INT_X_014;
    static final int INT_X_015 = Enum.INT_X_015;
    static final int INT_X_016 = Enum.INT_X_016;
    static final int INT_X_017 = Enum.INT_X_017;
    static final int INT_X_018 = Enum.INT_X_018;
    static final int INT_X_019 = Enum.INT_X_019;
    static final int INT_X_020 = Enum.INT_X_020;
    static final int INT_X_021 = Enum.INT_X_021;
    static final int INT_X_999 = Enum.INT_X_999;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_X_001
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
        
        static final int INT_X_001 = 1;
        static final int INT_X_002 = 2;
        static final int INT_X_003 = 3;
        static final int INT_X_004 = 4;
        static final int INT_X_005 = 5;
        static final int INT_X_006 = 6;
        static final int INT_X_007 = 7;
        static final int INT_X_008 = 8;
        static final int INT_X_009 = 9;
        static final int INT_X_010 = 10;
        static final int INT_X_011 = 11;
        static final int INT_X_012 = 12;
        static final int INT_X_013 = 13;
        static final int INT_X_014 = 14;
        static final int INT_X_015 = 15;
        static final int INT_X_016 = 16;
        static final int INT_X_017 = 17;
        static final int INT_X_018 = 18;
        static final int INT_X_019 = 19;
        static final int INT_X_020 = 20;
        static final int INT_X_021 = 21;
        static final int INT_X_999 = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("001", INT_X_001),
                new Enum("002", INT_X_002),
                new Enum("003", INT_X_003),
                new Enum("004", INT_X_004),
                new Enum("005", INT_X_005),
                new Enum("006", INT_X_006),
                new Enum("007", INT_X_007),
                new Enum("008", INT_X_008),
                new Enum("009", INT_X_009),
                new Enum("010", INT_X_010),
                new Enum("011", INT_X_011),
                new Enum("012", INT_X_012),
                new Enum("013", INT_X_013),
                new Enum("014", INT_X_014),
                new Enum("015", INT_X_015),
                new Enum("016", INT_X_016),
                new Enum("017", INT_X_017),
                new Enum("018", INT_X_018),
                new Enum("019", INT_X_019),
                new Enum("020", INT_X_020),
                new Enum("021", INT_X_021),
                new Enum("999", INT_X_999),
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
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode newInstance() {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
