/*
 * XML Type:  RoleClassRelationshipFormal_X
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML RoleClassRelationshipFormal_X(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX.
 */
public interface RoleClassRelationshipFormalX extends uk.nhs.connect.iucds.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RoleClassRelationshipFormalX.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("roleclassrelationshipformalxb4bdtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum CIT = Enum.forString("CIT");
    static final Enum CRINV = Enum.forString("CRINV");
    static final Enum CRSPNSR = Enum.forString("CRSPNSR");
    static final Enum COVPTY = Enum.forString("COVPTY");
    static final Enum GUAR = Enum.forString("GUAR");
    static final Enum PAYOR = Enum.forString("PAYOR");
    static final Enum PAT = Enum.forString("PAT");
    static final Enum PAYEE = Enum.forString("PAYEE");
    static final Enum POLHOLD = Enum.forString("POLHOLD");
    static final Enum QUAL = Enum.forString("QUAL");
    static final Enum RESBJ = Enum.forString("RESBJ");
    static final Enum SPNSR = Enum.forString("SPNSR");
    static final Enum STD = Enum.forString("STD");
    static final Enum UNDWRT = Enum.forString("UNDWRT");
    
    static final int INT_CIT = Enum.INT_CIT;
    static final int INT_CRINV = Enum.INT_CRINV;
    static final int INT_CRSPNSR = Enum.INT_CRSPNSR;
    static final int INT_COVPTY = Enum.INT_COVPTY;
    static final int INT_GUAR = Enum.INT_GUAR;
    static final int INT_PAYOR = Enum.INT_PAYOR;
    static final int INT_PAT = Enum.INT_PAT;
    static final int INT_PAYEE = Enum.INT_PAYEE;
    static final int INT_POLHOLD = Enum.INT_POLHOLD;
    static final int INT_QUAL = Enum.INT_QUAL;
    static final int INT_RESBJ = Enum.INT_RESBJ;
    static final int INT_SPNSR = Enum.INT_SPNSR;
    static final int INT_STD = Enum.INT_STD;
    static final int INT_UNDWRT = Enum.INT_UNDWRT;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_CIT
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
        
        static final int INT_CIT = 1;
        static final int INT_CRINV = 2;
        static final int INT_CRSPNSR = 3;
        static final int INT_COVPTY = 4;
        static final int INT_GUAR = 5;
        static final int INT_PAYOR = 6;
        static final int INT_PAT = 7;
        static final int INT_PAYEE = 8;
        static final int INT_POLHOLD = 9;
        static final int INT_QUAL = 10;
        static final int INT_RESBJ = 11;
        static final int INT_SPNSR = 12;
        static final int INT_STD = 13;
        static final int INT_UNDWRT = 14;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("CIT", INT_CIT),
                new Enum("CRINV", INT_CRINV),
                new Enum("CRSPNSR", INT_CRSPNSR),
                new Enum("COVPTY", INT_COVPTY),
                new Enum("GUAR", INT_GUAR),
                new Enum("PAYOR", INT_PAYOR),
                new Enum("PAT", INT_PAT),
                new Enum("PAYEE", INT_PAYEE),
                new Enum("POLHOLD", INT_POLHOLD),
                new Enum("QUAL", INT_QUAL),
                new Enum("RESBJ", INT_RESBJ),
                new Enum("SPNSR", INT_SPNSR),
                new Enum("STD", INT_STD),
                new Enum("UNDWRT", INT_UNDWRT),
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
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX newInstance() {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.RoleClassRelationshipFormalX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
