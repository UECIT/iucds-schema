/*
 * XML Type:  RequesterRelationshipType_displayName
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML RequesterRelationshipType_displayName(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName.
 */
public interface RequesterRelationshipTypeDisplayName extends uk.nhs.connect.iucds.ucr.St2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RequesterRelationshipTypeDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("requesterrelationshiptypedisplayname77c3type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PARENT_LEGAL_GUARDIAN_OF_CHILD = Enum.forString("Parent/Legal Guardian of child");
    static final Enum CLINICIAN_ON_BEHALF_OF_AN_ADULT = Enum.forString("Clinician on behalf of an adult");
    static final Enum CLINICIAN_ON_BEHALF_OF_A_CHILD = Enum.forString("Clinician on behalf of a child");
    static final Enum POWER_OF_ATTORNEY = Enum.forString("Power of Attorney");
    static final Enum COURT_APPOINTED = Enum.forString("Court Appointed");
    static final Enum PATIENT = Enum.forString("Patient");
    
    static final int INT_PARENT_LEGAL_GUARDIAN_OF_CHILD = Enum.INT_PARENT_LEGAL_GUARDIAN_OF_CHILD;
    static final int INT_CLINICIAN_ON_BEHALF_OF_AN_ADULT = Enum.INT_CLINICIAN_ON_BEHALF_OF_AN_ADULT;
    static final int INT_CLINICIAN_ON_BEHALF_OF_A_CHILD = Enum.INT_CLINICIAN_ON_BEHALF_OF_A_CHILD;
    static final int INT_POWER_OF_ATTORNEY = Enum.INT_POWER_OF_ATTORNEY;
    static final int INT_COURT_APPOINTED = Enum.INT_COURT_APPOINTED;
    static final int INT_PATIENT = Enum.INT_PATIENT;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PARENT_LEGAL_GUARDIAN_OF_CHILD
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
        
        static final int INT_PARENT_LEGAL_GUARDIAN_OF_CHILD = 1;
        static final int INT_CLINICIAN_ON_BEHALF_OF_AN_ADULT = 2;
        static final int INT_CLINICIAN_ON_BEHALF_OF_A_CHILD = 3;
        static final int INT_POWER_OF_ATTORNEY = 4;
        static final int INT_COURT_APPOINTED = 5;
        static final int INT_PATIENT = 6;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Parent/Legal Guardian of child", INT_PARENT_LEGAL_GUARDIAN_OF_CHILD),
                new Enum("Clinician on behalf of an adult", INT_CLINICIAN_ON_BEHALF_OF_AN_ADULT),
                new Enum("Clinician on behalf of a child", INT_CLINICIAN_ON_BEHALF_OF_A_CHILD),
                new Enum("Power of Attorney", INT_POWER_OF_ATTORNEY),
                new Enum("Court Appointed", INT_COURT_APPOINTED),
                new Enum("Patient", INT_PATIENT),
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
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName newInstance() {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.RequesterRelationshipTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
