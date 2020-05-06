/*
 * XML Type:  ActClassRoot_X
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ActClassRootX
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr;


/**
 * An XML ActClassRoot_X(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.cda.ucr.ActClassRootX.
 */
public interface ActClassRootX extends uk.nhs.connect.iucds.cda.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActClassRootX.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sD1B8CF57A1090BFEB260E672565E6976").resolveHandle("actclassrootx542ctype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INVE = Enum.forString("INVE");
    static final Enum PROC = Enum.forString("PROC");
    static final Enum CONS = Enum.forString("CONS");
    static final Enum SUBST = Enum.forString("SUBST");
    static final Enum REFR = Enum.forString("REFR");
    static final Enum TRNS = Enum.forString("TRNS");
    static final Enum LIST = Enum.forString("LIST");
    static final Enum ENC = Enum.forString("ENC");
    static final Enum XACT = Enum.forString("XACT");
    static final Enum SBADM = Enum.forString("SBADM");
    static final Enum DISPACT = Enum.forString("DISPACT");
    static final Enum ACCT = Enum.forString("ACCT");
    static final Enum CTTEVENT = Enum.forString("CTTEVENT");
    static final Enum CONTREG = Enum.forString("CONTREG");
    static final Enum SPCTRT = Enum.forString("SPCTRT");
    static final Enum REG = Enum.forString("REG");
    static final Enum ACCM = Enum.forString("ACCM");
    static final Enum ACSN = Enum.forString("ACSN");
    static final Enum ADJUD = Enum.forString("ADJUD");
    static final Enum INFRM = Enum.forString("INFRM");
    static final Enum PCPR = Enum.forString("PCPR");
    static final Enum INC = Enum.forString("INC");
    
    static final int INT_PROC = Enum.INT_PROC;
    static final int INT_CONS = Enum.INT_CONS;
    static final int INT_SUBST = Enum.INT_SUBST;
    static final int INT_REFR = Enum.INT_REFR;
    static final int INT_TRNS = Enum.INT_TRNS;
    static final int INT_LIST = Enum.INT_LIST;
    static final int INT_ENC = Enum.INT_ENC;
    static final int INT_XACT = Enum.INT_XACT;
    static final int INT_SBADM = Enum.INT_SBADM;
    static final int INT_DISPACT = Enum.INT_DISPACT;
    static final int INT_ACCT = Enum.INT_ACCT;
    static final int INT_CTTEVENT = Enum.INT_CTTEVENT;
    static final int INT_CONTREG = Enum.INT_CONTREG;
    static final int INT_SPCTRT = Enum.INT_SPCTRT;
    static final int INT_REG = Enum.INT_REG;
    static final int INT_ACCM = Enum.INT_ACCM;
    static final int INT_ACSN = Enum.INT_ACSN;
    static final int INT_ADJUD = Enum.INT_ADJUD;
    static final int INT_INFRM = Enum.INT_INFRM;
    static final int INT_PCPR = Enum.INT_PCPR;
    static final int INT_INC = Enum.INT_INC;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.cda.ucr.ActClassRootX.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INVE
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
        
        static final int INT_INVE = 1;
        static final int INT_PROC = 2;
        static final int INT_CONS = 3;
        static final int INT_SUBST = 4;
        static final int INT_REFR = 5;
        static final int INT_TRNS = 6;
        static final int INT_LIST = 7;
        static final int INT_ENC = 8;
        static final int INT_XACT = 9;
        static final int INT_SBADM = 10;
        static final int INT_DISPACT = 11;
        static final int INT_ACCT = 12;
        static final int INT_CTTEVENT = 13;
        static final int INT_CONTREG = 14;
        static final int INT_INVE_2 = 15;
        static final int INT_SPCTRT = 16;
        static final int INT_REG = 17;
        static final int INT_ACCM = 18;
        static final int INT_ACSN = 19;
        static final int INT_ADJUD = 20;
        static final int INT_INFRM = 21;
        static final int INT_PCPR = 22;
        static final int INT_INC = 23;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("INVE", INT_INVE),
                new Enum("PROC", INT_PROC),
                new Enum("CONS", INT_CONS),
                new Enum("SUBST", INT_SUBST),
                new Enum("REFR", INT_REFR),
                new Enum("TRNS", INT_TRNS),
                new Enum("LIST", INT_LIST),
                new Enum("ENC", INT_ENC),
                new Enum("XACT", INT_XACT),
                new Enum("SBADM", INT_SBADM),
                new Enum("DISPACT", INT_DISPACT),
                new Enum("ACCT", INT_ACCT),
                new Enum("CTTEVENT", INT_CTTEVENT),
                new Enum("CONTREG", INT_CONTREG),
                new Enum("INVE", INT_INVE_2),
                new Enum("SPCTRT", INT_SPCTRT),
                new Enum("REG", INT_REG),
                new Enum("ACCM", INT_ACCM),
                new Enum("ACSN", INT_ACSN),
                new Enum("ADJUD", INT_ADJUD),
                new Enum("INFRM", INT_INFRM),
                new Enum("PCPR", INT_PCPR),
                new Enum("INC", INT_INC),
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
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX newInstance() {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.cda.ucr.ActClassRootX parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.cda.ucr.ActClassRootX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
