/*
 * XML Type:  CDAOrganizationType_displayName
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML CDAOrganizationType_displayName(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName.
 */
public interface CDAOrganizationTypeDisplayName extends uk.nhs.connect.iucds.ucr.St2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDAOrganizationTypeDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("cdaorganizationtypedisplaynamef904type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum GENERAL_MEDICAL_PRACTICE = Enum.forString("General Medical Practice");
    static final Enum GENERAL_DENTAL_PRACTICE = Enum.forString("General Dental Practice");
    static final Enum COMMUNITY_PHARMACY = Enum.forString("Community Pharmacy");
    static final Enum COMMUNITY_OPTICIANS = Enum.forString("Community Opticians");
    static final Enum PRIMARY_CARE_TRUST = Enum.forString("Primary Care Trust");
    static final Enum STRATEGIC_HEALTH_AUTHORITY = Enum.forString("Strategic Health Authority");
    static final Enum SPECIAL_HEALTH_AUTHORITY = Enum.forString("Special Health Authority");
    static final Enum ACUTE_TRUST = Enum.forString("Acute Trust");
    static final Enum CARE_TRUST = Enum.forString("Care Trust");
    static final Enum COMMUNITY_TRUST = Enum.forString("Community Trust");
    static final Enum DIAGNOSTIC_AND_INVESTIGATION_CENTRE = Enum.forString("Diagnostic and Investigation Centre");
    static final Enum WALK_IN_CENTRE = Enum.forString("Walk-in Centre");
    static final Enum NHS_DIRECT = Enum.forString("NHS Direct");
    static final Enum LOCAL_AUTHORITY_SOCIAL_SERVICES_DEPARTMENT = Enum.forString("Local Authority Social Services Department");
    static final Enum NURSING_HOME = Enum.forString("Nursing Home");
    static final Enum RESIDENTIAL_HOME = Enum.forString("Residential Home");
    static final Enum HOSPICE = Enum.forString("Hospice");
    static final Enum AMBULANCE_TRUST = Enum.forString("Ambulance Trust");
    static final Enum PRIVATE_HOSPITAL = Enum.forString("Private Hospital");
    static final Enum GMP_DEPUTISING_SERVICE = Enum.forString("GMP Deputising Service");
    static final Enum NURSING_AGENCY = Enum.forString("Nursing Agency");
    static final Enum NOT_SPECIFIED = Enum.forString("Not specified");
    
    static final int INT_GENERAL_MEDICAL_PRACTICE = Enum.INT_GENERAL_MEDICAL_PRACTICE;
    static final int INT_GENERAL_DENTAL_PRACTICE = Enum.INT_GENERAL_DENTAL_PRACTICE;
    static final int INT_COMMUNITY_PHARMACY = Enum.INT_COMMUNITY_PHARMACY;
    static final int INT_COMMUNITY_OPTICIANS = Enum.INT_COMMUNITY_OPTICIANS;
    static final int INT_PRIMARY_CARE_TRUST = Enum.INT_PRIMARY_CARE_TRUST;
    static final int INT_STRATEGIC_HEALTH_AUTHORITY = Enum.INT_STRATEGIC_HEALTH_AUTHORITY;
    static final int INT_SPECIAL_HEALTH_AUTHORITY = Enum.INT_SPECIAL_HEALTH_AUTHORITY;
    static final int INT_ACUTE_TRUST = Enum.INT_ACUTE_TRUST;
    static final int INT_CARE_TRUST = Enum.INT_CARE_TRUST;
    static final int INT_COMMUNITY_TRUST = Enum.INT_COMMUNITY_TRUST;
    static final int INT_DIAGNOSTIC_AND_INVESTIGATION_CENTRE = Enum.INT_DIAGNOSTIC_AND_INVESTIGATION_CENTRE;
    static final int INT_WALK_IN_CENTRE = Enum.INT_WALK_IN_CENTRE;
    static final int INT_NHS_DIRECT = Enum.INT_NHS_DIRECT;
    static final int INT_LOCAL_AUTHORITY_SOCIAL_SERVICES_DEPARTMENT = Enum.INT_LOCAL_AUTHORITY_SOCIAL_SERVICES_DEPARTMENT;
    static final int INT_NURSING_HOME = Enum.INT_NURSING_HOME;
    static final int INT_RESIDENTIAL_HOME = Enum.INT_RESIDENTIAL_HOME;
    static final int INT_HOSPICE = Enum.INT_HOSPICE;
    static final int INT_AMBULANCE_TRUST = Enum.INT_AMBULANCE_TRUST;
    static final int INT_PRIVATE_HOSPITAL = Enum.INT_PRIVATE_HOSPITAL;
    static final int INT_GMP_DEPUTISING_SERVICE = Enum.INT_GMP_DEPUTISING_SERVICE;
    static final int INT_NURSING_AGENCY = Enum.INT_NURSING_AGENCY;
    static final int INT_NOT_SPECIFIED = Enum.INT_NOT_SPECIFIED;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_GENERAL_MEDICAL_PRACTICE
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
        
        static final int INT_GENERAL_MEDICAL_PRACTICE = 1;
        static final int INT_GENERAL_DENTAL_PRACTICE = 2;
        static final int INT_COMMUNITY_PHARMACY = 3;
        static final int INT_COMMUNITY_OPTICIANS = 4;
        static final int INT_PRIMARY_CARE_TRUST = 5;
        static final int INT_STRATEGIC_HEALTH_AUTHORITY = 6;
        static final int INT_SPECIAL_HEALTH_AUTHORITY = 7;
        static final int INT_ACUTE_TRUST = 8;
        static final int INT_CARE_TRUST = 9;
        static final int INT_COMMUNITY_TRUST = 10;
        static final int INT_DIAGNOSTIC_AND_INVESTIGATION_CENTRE = 11;
        static final int INT_WALK_IN_CENTRE = 12;
        static final int INT_NHS_DIRECT = 13;
        static final int INT_LOCAL_AUTHORITY_SOCIAL_SERVICES_DEPARTMENT = 14;
        static final int INT_NURSING_HOME = 15;
        static final int INT_RESIDENTIAL_HOME = 16;
        static final int INT_HOSPICE = 17;
        static final int INT_AMBULANCE_TRUST = 18;
        static final int INT_PRIVATE_HOSPITAL = 19;
        static final int INT_GMP_DEPUTISING_SERVICE = 20;
        static final int INT_NURSING_AGENCY = 21;
        static final int INT_NOT_SPECIFIED = 22;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("General Medical Practice", INT_GENERAL_MEDICAL_PRACTICE),
                new Enum("General Dental Practice", INT_GENERAL_DENTAL_PRACTICE),
                new Enum("Community Pharmacy", INT_COMMUNITY_PHARMACY),
                new Enum("Community Opticians", INT_COMMUNITY_OPTICIANS),
                new Enum("Primary Care Trust", INT_PRIMARY_CARE_TRUST),
                new Enum("Strategic Health Authority", INT_STRATEGIC_HEALTH_AUTHORITY),
                new Enum("Special Health Authority", INT_SPECIAL_HEALTH_AUTHORITY),
                new Enum("Acute Trust", INT_ACUTE_TRUST),
                new Enum("Care Trust", INT_CARE_TRUST),
                new Enum("Community Trust", INT_COMMUNITY_TRUST),
                new Enum("Diagnostic and Investigation Centre", INT_DIAGNOSTIC_AND_INVESTIGATION_CENTRE),
                new Enum("Walk-in Centre", INT_WALK_IN_CENTRE),
                new Enum("NHS Direct", INT_NHS_DIRECT),
                new Enum("Local Authority Social Services Department", INT_LOCAL_AUTHORITY_SOCIAL_SERVICES_DEPARTMENT),
                new Enum("Nursing Home", INT_NURSING_HOME),
                new Enum("Residential Home", INT_RESIDENTIAL_HOME),
                new Enum("Hospice", INT_HOSPICE),
                new Enum("Ambulance Trust", INT_AMBULANCE_TRUST),
                new Enum("Private Hospital", INT_PRIVATE_HOSPITAL),
                new Enum("GMP Deputising Service", INT_GMP_DEPUTISING_SERVICE),
                new Enum("Nursing Agency", INT_NURSING_AGENCY),
                new Enum("Not specified", INT_NOT_SPECIFIED),
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
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName newInstance() {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAOrganizationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
