/*
 * XML Type:  cs_AddressPartType
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CsAddressPartType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML cs_AddressPartType(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.cda.ucr.CsAddressPartType.
 */
public interface CsAddressPartType extends uk.nhs.connect.iucds.cda.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CsAddressPartType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("csaddressparttypee89btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DEL = Enum.forString("DEL");
    static final Enum CNT = Enum.forString("CNT");
    static final Enum STA = Enum.forString("STA");
    static final Enum CPA = Enum.forString("CPA");
    static final Enum CTY = Enum.forString("CTY");
    static final Enum ZIP = Enum.forString("ZIP");
    static final Enum SAL = Enum.forString("SAL");
    static final Enum BNR = Enum.forString("BNR");
    static final Enum BNN = Enum.forString("BNN");
    static final Enum DIR = Enum.forString("DIR");
    static final Enum STR = Enum.forString("STR");
    static final Enum STB = Enum.forString("STB");
    static final Enum STTYP = Enum.forString("STTYP");
    static final Enum ADL = Enum.forString("ADL");
    static final Enum UNID = Enum.forString("UNID");
    static final Enum UNIT = Enum.forString("UNIT");
    static final Enum CAR = Enum.forString("CAR");
    static final Enum CEN = Enum.forString("CEN");
    static final Enum DESC = Enum.forString("DESC");
    static final Enum ADDRK = Enum.forString("ADDRK");
    static final Enum PRE = Enum.forString("PRE");
    
    static final int INT_DEL = Enum.INT_DEL;
    static final int INT_CNT = Enum.INT_CNT;
    static final int INT_STA = Enum.INT_STA;
    static final int INT_CPA = Enum.INT_CPA;
    static final int INT_CTY = Enum.INT_CTY;
    static final int INT_ZIP = Enum.INT_ZIP;
    static final int INT_SAL = Enum.INT_SAL;
    static final int INT_BNR = Enum.INT_BNR;
    static final int INT_BNN = Enum.INT_BNN;
    static final int INT_DIR = Enum.INT_DIR;
    static final int INT_STR = Enum.INT_STR;
    static final int INT_STB = Enum.INT_STB;
    static final int INT_STTYP = Enum.INT_STTYP;
    static final int INT_ADL = Enum.INT_ADL;
    static final int INT_UNID = Enum.INT_UNID;
    static final int INT_UNIT = Enum.INT_UNIT;
    static final int INT_CAR = Enum.INT_CAR;
    static final int INT_CEN = Enum.INT_CEN;
    static final int INT_DESC = Enum.INT_DESC;
    static final int INT_ADDRK = Enum.INT_ADDRK;
    static final int INT_PRE = Enum.INT_PRE;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.cda.ucr.CsAddressPartType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DEL
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
        
        static final int INT_DEL = 1;
        static final int INT_CNT = 2;
        static final int INT_STA = 3;
        static final int INT_CPA = 4;
        static final int INT_CTY = 5;
        static final int INT_ZIP = 6;
        static final int INT_SAL = 7;
        static final int INT_BNR = 8;
        static final int INT_BNN = 9;
        static final int INT_DIR = 10;
        static final int INT_STR = 11;
        static final int INT_STB = 12;
        static final int INT_STTYP = 13;
        static final int INT_ADL = 14;
        static final int INT_UNID = 15;
        static final int INT_UNIT = 16;
        static final int INT_CAR = 17;
        static final int INT_CEN = 18;
        static final int INT_DESC = 19;
        static final int INT_ADDRK = 20;
        static final int INT_PRE = 21;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("DEL", INT_DEL),
                new Enum("CNT", INT_CNT),
                new Enum("STA", INT_STA),
                new Enum("CPA", INT_CPA),
                new Enum("CTY", INT_CTY),
                new Enum("ZIP", INT_ZIP),
                new Enum("SAL", INT_SAL),
                new Enum("BNR", INT_BNR),
                new Enum("BNN", INT_BNN),
                new Enum("DIR", INT_DIR),
                new Enum("STR", INT_STR),
                new Enum("STB", INT_STB),
                new Enum("STTYP", INT_STTYP),
                new Enum("ADL", INT_ADL),
                new Enum("UNID", INT_UNID),
                new Enum("UNIT", INT_UNIT),
                new Enum("CAR", INT_CAR),
                new Enum("CEN", INT_CEN),
                new Enum("DESC", INT_DESC),
                new Enum("ADDRK", INT_ADDRK),
                new Enum("PRE", INT_PRE),
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
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.CsAddressPartType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.CsAddressPartType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
