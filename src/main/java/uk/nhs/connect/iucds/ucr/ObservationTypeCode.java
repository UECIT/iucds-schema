/*
 * XML Type:  ObservationType_code
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ObservationTypeCode
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML ObservationType_code(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.ObservationTypeCode.
 */
public interface ObservationTypeCode extends uk.nhs.connect.iucds.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObservationTypeCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("observationtypecode8b27type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ANDP = Enum.forString("ANDP");
    static final Enum DNDP = Enum.forString("DNDP");
    static final Enum MCC = Enum.forString("MCC");
    static final Enum RR = Enum.forString("RR");
    static final Enum ESS_117 = Enum.forString("ESS117");
    static final Enum CHCS = Enum.forString("CHCS");
    static final Enum DNDT = Enum.forString("DNDT");
    static final Enum MCPC = Enum.forString("MCPC");
    static final Enum STD = Enum.forString("STD");
    static final Enum AGTCN = Enum.forString("AGTCN");
    static final Enum ANRR = Enum.forString("ANRR");
    static final Enum DNDR = Enum.forString("DNDR");
    static final Enum DNAR = Enum.forString("DNAR");
    static final Enum MDTSTD = Enum.forString("MDTSTD");
    static final Enum DNCRC = Enum.forString("DNCRC");
    static final Enum ADRRC = Enum.forString("ADRRC");
    static final Enum ADRRT = Enum.forString("ADRRT");
    static final Enum CHCRC = Enum.forString("CHCRC");
    static final Enum CHCRT = Enum.forString("CHCRT");
    
    static final int INT_ANDP = Enum.INT_ANDP;
    static final int INT_DNDP = Enum.INT_DNDP;
    static final int INT_MCC = Enum.INT_MCC;
    static final int INT_RR = Enum.INT_RR;
    static final int INT_ESS_117 = Enum.INT_ESS_117;
    static final int INT_CHCS = Enum.INT_CHCS;
    static final int INT_DNDT = Enum.INT_DNDT;
    static final int INT_MCPC = Enum.INT_MCPC;
    static final int INT_STD = Enum.INT_STD;
    static final int INT_AGTCN = Enum.INT_AGTCN;
    static final int INT_ANRR = Enum.INT_ANRR;
    static final int INT_DNDR = Enum.INT_DNDR;
    static final int INT_DNAR = Enum.INT_DNAR;
    static final int INT_MDTSTD = Enum.INT_MDTSTD;
    static final int INT_DNCRC = Enum.INT_DNCRC;
    static final int INT_ADRRC = Enum.INT_ADRRC;
    static final int INT_ADRRT = Enum.INT_ADRRT;
    static final int INT_CHCRC = Enum.INT_CHCRC;
    static final int INT_CHCRT = Enum.INT_CHCRT;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.ObservationTypeCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ANDP
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
        
        static final int INT_ANDP = 1;
        static final int INT_DNDP = 2;
        static final int INT_MCC = 3;
        static final int INT_RR = 4;
        static final int INT_ESS_117 = 5;
        static final int INT_CHCS = 6;
        static final int INT_DNDT = 7;
        static final int INT_MCPC = 8;
        static final int INT_STD = 9;
        static final int INT_AGTCN = 10;
        static final int INT_ANRR = 11;
        static final int INT_DNDR = 12;
        static final int INT_DNAR = 13;
        static final int INT_MDTSTD = 14;
        static final int INT_DNCRC = 15;
        static final int INT_ADRRC = 16;
        static final int INT_ADRRT = 17;
        static final int INT_CHCRC = 18;
        static final int INT_CHCRT = 19;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ANDP", INT_ANDP),
                new Enum("DNDP", INT_DNDP),
                new Enum("MCC", INT_MCC),
                new Enum("RR", INT_RR),
                new Enum("ESS117", INT_ESS_117),
                new Enum("CHCS", INT_CHCS),
                new Enum("DNDT", INT_DNDT),
                new Enum("MCPC", INT_MCPC),
                new Enum("STD", INT_STD),
                new Enum("AGTCN", INT_AGTCN),
                new Enum("ANRR", INT_ANRR),
                new Enum("DNDR", INT_DNDR),
                new Enum("DNAR", INT_DNAR),
                new Enum("MDTSTD", INT_MDTSTD),
                new Enum("DNCRC", INT_DNCRC),
                new Enum("ADRRC", INT_ADRRC),
                new Enum("ADRRT", INT_ADRRT),
                new Enum("CHCRC", INT_CHCRC),
                new Enum("CHCRT", INT_CHCRT),
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
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode newInstance() {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
