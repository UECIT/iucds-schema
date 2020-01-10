/*
 * XML Type:  CDAObservationType_code
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.CDAObservationTypeCode
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML CDAObservationType_code(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.CDAObservationTypeCode.
 */
public interface CDAObservationTypeCode extends uk.nhs.connect.iucds.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDAObservationTypeCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("cdaobservationtypecode25d9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum RAF = Enum.forString("RAF");
    static final Enum LAR = Enum.forString("LAR");
    static final Enum PAR = Enum.forString("PAR");
    static final Enum CPF = Enum.forString("CPF");
    static final Enum CPA = Enum.forString("CPA");
    static final Enum CPED = Enum.forString("CPED");
    static final Enum NCR = Enum.forString("NCR");
    static final Enum LCR = Enum.forString("LCR");
    static final Enum CAFIS = Enum.forString("CAFIS");
    static final Enum CTHT = Enum.forString("CTHT");
    static final Enum EDD = Enum.forString("EDD");
    static final Enum LCPR = Enum.forString("LCPR");
    static final Enum NCPR = Enum.forString("NCPR");
    static final Enum THT = Enum.forString("THT");
    static final Enum PDR = Enum.forString("PDR");
    static final Enum DIRS = Enum.forString("DIRS");
    static final Enum DIUI = Enum.forString("DIUI");
    static final Enum NMHATD = Enum.forString("NMHATD");
    static final Enum ARRE = Enum.forString("ARRE");
    static final Enum PRC = Enum.forString("PRC");
    static final Enum CPDCFR = Enum.forString("CPDCFR");
    static final Enum CPDCMRR = Enum.forString("CPDCMRR");
    static final Enum CPAD = Enum.forString("CPAD");
    static final Enum CRA = Enum.forString("CRA");
    static final Enum CPDOPR = Enum.forString("CPDOPR");
    static final Enum CPDONPR = Enum.forString("CPDONPR");
    static final Enum OEAWP = Enum.forString("OEAWP");
    static final Enum CRS = Enum.forString("CRS");
    static final Enum SF = Enum.forString("SF");
    static final Enum DMRPQ = Enum.forString("DMRPQ");
    static final Enum DMRST = Enum.forString("DMRST");
    static final Enum DRPQ = Enum.forString("DRPQ");
    static final Enum DRST = Enum.forString("DRST");
    static final Enum DAPQ = Enum.forString("DAPQ");
    static final Enum DAST = Enum.forString("DAST");
    static final Enum WSPO = Enum.forString("WSPO");
    static final Enum TESOBS = Enum.forString("TESOBS");
    static final Enum BPOBS = Enum.forString("BPOBS");
    static final Enum BMIOBS = Enum.forString("BMIOBS");
    static final Enum MBPOBS = Enum.forString("MBPOBS");
    static final Enum TEMOBS = Enum.forString("TEMOBS");
    static final Enum HOBS = Enum.forString("HOBS");
    static final Enum WOBS = Enum.forString("WOBS");
    static final Enum PULOBS = Enum.forString("PULOBS");
    static final Enum THR = Enum.forString("THR");
    static final Enum THRR = Enum.forString("THRR");
    static final Enum CO = Enum.forString("CO");
    static final Enum DSTO = Enum.forString("DSTO");
    static final Enum CHCRS = Enum.forString("CHCRS");
    static final Enum PTV = Enum.forString("PTV");
    
    static final int INT_RAF = Enum.INT_RAF;
    static final int INT_LAR = Enum.INT_LAR;
    static final int INT_PAR = Enum.INT_PAR;
    static final int INT_CPF = Enum.INT_CPF;
    static final int INT_CPA = Enum.INT_CPA;
    static final int INT_CPED = Enum.INT_CPED;
    static final int INT_NCR = Enum.INT_NCR;
    static final int INT_LCR = Enum.INT_LCR;
    static final int INT_CAFIS = Enum.INT_CAFIS;
    static final int INT_CTHT = Enum.INT_CTHT;
    static final int INT_EDD = Enum.INT_EDD;
    static final int INT_LCPR = Enum.INT_LCPR;
    static final int INT_NCPR = Enum.INT_NCPR;
    static final int INT_THT = Enum.INT_THT;
    static final int INT_PDR = Enum.INT_PDR;
    static final int INT_DIRS = Enum.INT_DIRS;
    static final int INT_DIUI = Enum.INT_DIUI;
    static final int INT_NMHATD = Enum.INT_NMHATD;
    static final int INT_ARRE = Enum.INT_ARRE;
    static final int INT_PRC = Enum.INT_PRC;
    static final int INT_CPDCFR = Enum.INT_CPDCFR;
    static final int INT_CPDCMRR = Enum.INT_CPDCMRR;
    static final int INT_CPAD = Enum.INT_CPAD;
    static final int INT_CRA = Enum.INT_CRA;
    static final int INT_CPDOPR = Enum.INT_CPDOPR;
    static final int INT_CPDONPR = Enum.INT_CPDONPR;
    static final int INT_OEAWP = Enum.INT_OEAWP;
    static final int INT_CRS = Enum.INT_CRS;
    static final int INT_SF = Enum.INT_SF;
    static final int INT_DMRPQ = Enum.INT_DMRPQ;
    static final int INT_DMRST = Enum.INT_DMRST;
    static final int INT_DRPQ = Enum.INT_DRPQ;
    static final int INT_DRST = Enum.INT_DRST;
    static final int INT_DAPQ = Enum.INT_DAPQ;
    static final int INT_DAST = Enum.INT_DAST;
    static final int INT_WSPO = Enum.INT_WSPO;
    static final int INT_TESOBS = Enum.INT_TESOBS;
    static final int INT_BPOBS = Enum.INT_BPOBS;
    static final int INT_BMIOBS = Enum.INT_BMIOBS;
    static final int INT_MBPOBS = Enum.INT_MBPOBS;
    static final int INT_TEMOBS = Enum.INT_TEMOBS;
    static final int INT_HOBS = Enum.INT_HOBS;
    static final int INT_WOBS = Enum.INT_WOBS;
    static final int INT_PULOBS = Enum.INT_PULOBS;
    static final int INT_THR = Enum.INT_THR;
    static final int INT_THRR = Enum.INT_THRR;
    static final int INT_CO = Enum.INT_CO;
    static final int INT_DSTO = Enum.INT_DSTO;
    static final int INT_CHCRS = Enum.INT_CHCRS;
    static final int INT_PTV = Enum.INT_PTV;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.CDAObservationTypeCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_RAF
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
        
        static final int INT_RAF = 1;
        static final int INT_LAR = 2;
        static final int INT_PAR = 3;
        static final int INT_CPF = 4;
        static final int INT_CPA = 5;
        static final int INT_CPED = 6;
        static final int INT_NCR = 7;
        static final int INT_LCR = 8;
        static final int INT_CAFIS = 9;
        static final int INT_CTHT = 10;
        static final int INT_EDD = 11;
        static final int INT_LCPR = 12;
        static final int INT_NCPR = 13;
        static final int INT_THT = 14;
        static final int INT_PDR = 15;
        static final int INT_DIRS = 16;
        static final int INT_DIUI = 17;
        static final int INT_NMHATD = 18;
        static final int INT_ARRE = 19;
        static final int INT_PRC = 20;
        static final int INT_CPDCFR = 21;
        static final int INT_CPDCMRR = 22;
        static final int INT_CPAD = 23;
        static final int INT_CRA = 24;
        static final int INT_CPDOPR = 25;
        static final int INT_CPDONPR = 26;
        static final int INT_OEAWP = 27;
        static final int INT_CRS = 28;
        static final int INT_SF = 29;
        static final int INT_DMRPQ = 30;
        static final int INT_DMRST = 31;
        static final int INT_DRPQ = 32;
        static final int INT_DRST = 33;
        static final int INT_DAPQ = 34;
        static final int INT_DAST = 35;
        static final int INT_WSPO = 36;
        static final int INT_TESOBS = 37;
        static final int INT_BPOBS = 38;
        static final int INT_BMIOBS = 39;
        static final int INT_MBPOBS = 40;
        static final int INT_TEMOBS = 41;
        static final int INT_HOBS = 42;
        static final int INT_WOBS = 43;
        static final int INT_PULOBS = 44;
        static final int INT_THR = 45;
        static final int INT_THRR = 46;
        static final int INT_CO = 47;
        static final int INT_DSTO = 48;
        static final int INT_CHCRS = 49;
        static final int INT_PTV = 50;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("RAF", INT_RAF),
                new Enum("LAR", INT_LAR),
                new Enum("PAR", INT_PAR),
                new Enum("CPF", INT_CPF),
                new Enum("CPA", INT_CPA),
                new Enum("CPED", INT_CPED),
                new Enum("NCR", INT_NCR),
                new Enum("LCR", INT_LCR),
                new Enum("CAFIS", INT_CAFIS),
                new Enum("CTHT", INT_CTHT),
                new Enum("EDD", INT_EDD),
                new Enum("LCPR", INT_LCPR),
                new Enum("NCPR", INT_NCPR),
                new Enum("THT", INT_THT),
                new Enum("PDR", INT_PDR),
                new Enum("DIRS", INT_DIRS),
                new Enum("DIUI", INT_DIUI),
                new Enum("NMHATD", INT_NMHATD),
                new Enum("ARRE", INT_ARRE),
                new Enum("PRC", INT_PRC),
                new Enum("CPDCFR", INT_CPDCFR),
                new Enum("CPDCMRR", INT_CPDCMRR),
                new Enum("CPAD", INT_CPAD),
                new Enum("CRA", INT_CRA),
                new Enum("CPDOPR", INT_CPDOPR),
                new Enum("CPDONPR", INT_CPDONPR),
                new Enum("OEAWP", INT_OEAWP),
                new Enum("CRS", INT_CRS),
                new Enum("SF", INT_SF),
                new Enum("DMRPQ", INT_DMRPQ),
                new Enum("DMRST", INT_DMRST),
                new Enum("DRPQ", INT_DRPQ),
                new Enum("DRST", INT_DRST),
                new Enum("DAPQ", INT_DAPQ),
                new Enum("DAST", INT_DAST),
                new Enum("WSPO", INT_WSPO),
                new Enum("TESOBS", INT_TESOBS),
                new Enum("BPOBS", INT_BPOBS),
                new Enum("BMIOBS", INT_BMIOBS),
                new Enum("MBPOBS", INT_MBPOBS),
                new Enum("TEMOBS", INT_TEMOBS),
                new Enum("HOBS", INT_HOBS),
                new Enum("WOBS", INT_WOBS),
                new Enum("PULOBS", INT_PULOBS),
                new Enum("THR", INT_THR),
                new Enum("THRR", INT_THRR),
                new Enum("CO", INT_CO),
                new Enum("DSTO", INT_DSTO),
                new Enum("CHCRS", INT_CHCRS),
                new Enum("PTV", INT_PTV),
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
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode newInstance() {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
