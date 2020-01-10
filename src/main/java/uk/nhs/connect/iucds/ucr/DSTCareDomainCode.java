/*
 * XML Type:  DSTCareDomain_code
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.DSTCareDomainCode
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML DSTCareDomain_code(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.DSTCareDomainCode.
 */
public interface DSTCareDomainCode extends uk.nhs.connect.iucds.ucr.Cs2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DSTCareDomainCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("dstcaredomaincode943btype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum DSTBEH = Enum.forString("DSTBEH");
    static final Enum DSTCOG = Enum.forString("DSTCOG");
    static final Enum DSTPSY = Enum.forString("DSTPSY");
    static final Enum DSTCOM = Enum.forString("DSTCOM");
    static final Enum DSTMOB = Enum.forString("DSTMOB");
    static final Enum DSTNUT = Enum.forString("DSTNUT");
    static final Enum DSTCON = Enum.forString("DSTCON");
    static final Enum DSTSKI = Enum.forString("DSTSKI");
    static final Enum DSTBRE = Enum.forString("DSTBRE");
    static final Enum DSTMED = Enum.forString("DSTMED");
    static final Enum DSTCONS = Enum.forString("DSTCONS");
    static final Enum DSTOSN = Enum.forString("DSTOSN");
    
    static final int INT_DSTBEH = Enum.INT_DSTBEH;
    static final int INT_DSTCOG = Enum.INT_DSTCOG;
    static final int INT_DSTPSY = Enum.INT_DSTPSY;
    static final int INT_DSTCOM = Enum.INT_DSTCOM;
    static final int INT_DSTMOB = Enum.INT_DSTMOB;
    static final int INT_DSTNUT = Enum.INT_DSTNUT;
    static final int INT_DSTCON = Enum.INT_DSTCON;
    static final int INT_DSTSKI = Enum.INT_DSTSKI;
    static final int INT_DSTBRE = Enum.INT_DSTBRE;
    static final int INT_DSTMED = Enum.INT_DSTMED;
    static final int INT_DSTCONS = Enum.INT_DSTCONS;
    static final int INT_DSTOSN = Enum.INT_DSTOSN;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.DSTCareDomainCode.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_DSTBEH
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
        
        static final int INT_DSTBEH = 1;
        static final int INT_DSTCOG = 2;
        static final int INT_DSTPSY = 3;
        static final int INT_DSTCOM = 4;
        static final int INT_DSTMOB = 5;
        static final int INT_DSTNUT = 6;
        static final int INT_DSTCON = 7;
        static final int INT_DSTSKI = 8;
        static final int INT_DSTBRE = 9;
        static final int INT_DSTMED = 10;
        static final int INT_DSTCONS = 11;
        static final int INT_DSTOSN = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("DSTBEH", INT_DSTBEH),
                new Enum("DSTCOG", INT_DSTCOG),
                new Enum("DSTPSY", INT_DSTPSY),
                new Enum("DSTCOM", INT_DSTCOM),
                new Enum("DSTMOB", INT_DSTMOB),
                new Enum("DSTNUT", INT_DSTNUT),
                new Enum("DSTCON", INT_DSTCON),
                new Enum("DSTSKI", INT_DSTSKI),
                new Enum("DSTBRE", INT_DSTBRE),
                new Enum("DSTMED", INT_DSTMED),
                new Enum("DSTCONS", INT_DSTCONS),
                new Enum("DSTOSN", INT_DSTOSN),
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
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode newInstance() {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainCode parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
