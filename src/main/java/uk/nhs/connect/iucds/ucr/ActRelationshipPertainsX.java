/*
 * XML Type:  ActRelationshipPertains_X
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML ActRelationshipPertains_X(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX.
 */
public interface ActRelationshipPertainsX extends uk.nhs.connect.iucds.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ActRelationshipPertainsX.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("actrelationshippertainsx00f8type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PERT = Enum.forString("PERT");
    static final Enum NAME = Enum.forString("NAME");
    static final Enum AUTH = Enum.forString("AUTH");
    static final Enum COVBY = Enum.forString("COVBY");
    static final Enum EXPL = Enum.forString("EXPL");
    static final Enum PREV = Enum.forString("PREV");
    static final Enum REFV = Enum.forString("REFV");
    static final Enum SUBJ = Enum.forString("SUBJ");
    static final Enum CAUS = Enum.forString("CAUS");
    static final Enum DRIV = Enum.forString("DRIV");
    static final Enum ITEMSLOC = Enum.forString("ITEMSLOC");
    static final Enum MFST = Enum.forString("MFST");
    static final Enum LIMIT = Enum.forString("LIMIT");
    static final Enum REFR = Enum.forString("REFR");
    static final Enum SUMM = Enum.forString("SUMM");
    
    static final int INT_PERT = Enum.INT_PERT;
    static final int INT_NAME = Enum.INT_NAME;
    static final int INT_AUTH = Enum.INT_AUTH;
    static final int INT_COVBY = Enum.INT_COVBY;
    static final int INT_EXPL = Enum.INT_EXPL;
    static final int INT_PREV = Enum.INT_PREV;
    static final int INT_REFV = Enum.INT_REFV;
    static final int INT_SUBJ = Enum.INT_SUBJ;
    static final int INT_CAUS = Enum.INT_CAUS;
    static final int INT_DRIV = Enum.INT_DRIV;
    static final int INT_ITEMSLOC = Enum.INT_ITEMSLOC;
    static final int INT_MFST = Enum.INT_MFST;
    static final int INT_LIMIT = Enum.INT_LIMIT;
    static final int INT_REFR = Enum.INT_REFR;
    static final int INT_SUMM = Enum.INT_SUMM;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PERT
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
        
        static final int INT_PERT = 1;
        static final int INT_NAME = 2;
        static final int INT_AUTH = 3;
        static final int INT_COVBY = 4;
        static final int INT_EXPL = 5;
        static final int INT_PREV = 6;
        static final int INT_REFV = 7;
        static final int INT_SUBJ = 8;
        static final int INT_CAUS = 9;
        static final int INT_DRIV = 10;
        static final int INT_ITEMSLOC = 11;
        static final int INT_MFST = 12;
        static final int INT_LIMIT = 13;
        static final int INT_REFR = 14;
        static final int INT_SUMM = 15;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("PERT", INT_PERT),
                new Enum("NAME", INT_NAME),
                new Enum("AUTH", INT_AUTH),
                new Enum("COVBY", INT_COVBY),
                new Enum("EXPL", INT_EXPL),
                new Enum("PREV", INT_PREV),
                new Enum("REFV", INT_REFV),
                new Enum("SUBJ", INT_SUBJ),
                new Enum("CAUS", INT_CAUS),
                new Enum("DRIV", INT_DRIV),
                new Enum("ITEMSLOC", INT_ITEMSLOC),
                new Enum("MFST", INT_MFST),
                new Enum("LIMIT", INT_LIMIT),
                new Enum("REFR", INT_REFR),
                new Enum("SUMM", INT_SUMM),
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
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX newInstance() {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.ActRelationshipPertainsX) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
