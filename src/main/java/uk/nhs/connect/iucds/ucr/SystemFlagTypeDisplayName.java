/*
 * XML Type:  SystemFlagType_displayName
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML SystemFlagType_displayName(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName.
 */
public interface SystemFlagTypeDisplayName extends uk.nhs.connect.iucds.ucr.St2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemFlagTypeDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("systemflagtypedisplayname500atype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum PATIENT_HAS_SUFFERED_TRAUMA_FLAG = Enum.forString("Patient has suffered trauma flag");
    static final Enum FIRE_RISK_AT_INCIDENT_LOCATION_FLAG = Enum.forString("Fire risk at incident location flag");
    static final Enum SCENE_SAFE_FLAG = Enum.forString("Scene safe flag");
    static final Enum POLICE_IN_ATTENDANCE_OR_REQUIRED_AT_INCIDENT_LOCATION_FLAG = Enum.forString("Police in attendance or required at incident location flag");
    static final Enum PATIENT_IS_TRAPPED_FLAG = Enum.forString("Patient is trapped flag");
    
    static final int INT_PATIENT_HAS_SUFFERED_TRAUMA_FLAG = Enum.INT_PATIENT_HAS_SUFFERED_TRAUMA_FLAG;
    static final int INT_FIRE_RISK_AT_INCIDENT_LOCATION_FLAG = Enum.INT_FIRE_RISK_AT_INCIDENT_LOCATION_FLAG;
    static final int INT_SCENE_SAFE_FLAG = Enum.INT_SCENE_SAFE_FLAG;
    static final int INT_POLICE_IN_ATTENDANCE_OR_REQUIRED_AT_INCIDENT_LOCATION_FLAG = Enum.INT_POLICE_IN_ATTENDANCE_OR_REQUIRED_AT_INCIDENT_LOCATION_FLAG;
    static final int INT_PATIENT_IS_TRAPPED_FLAG = Enum.INT_PATIENT_IS_TRAPPED_FLAG;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_PATIENT_HAS_SUFFERED_TRAUMA_FLAG
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
        
        static final int INT_PATIENT_HAS_SUFFERED_TRAUMA_FLAG = 1;
        static final int INT_FIRE_RISK_AT_INCIDENT_LOCATION_FLAG = 2;
        static final int INT_SCENE_SAFE_FLAG = 3;
        static final int INT_POLICE_IN_ATTENDANCE_OR_REQUIRED_AT_INCIDENT_LOCATION_FLAG = 4;
        static final int INT_PATIENT_IS_TRAPPED_FLAG = 5;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Patient has suffered trauma flag", INT_PATIENT_HAS_SUFFERED_TRAUMA_FLAG),
                new Enum("Fire risk at incident location flag", INT_FIRE_RISK_AT_INCIDENT_LOCATION_FLAG),
                new Enum("Scene safe flag", INT_SCENE_SAFE_FLAG),
                new Enum("Police in attendance or required at incident location flag", INT_POLICE_IN_ATTENDANCE_OR_REQUIRED_AT_INCIDENT_LOCATION_FLAG),
                new Enum("Patient is trapped flag", INT_PATIENT_IS_TRAPPED_FLAG),
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
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName newInstance() {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.SystemFlagTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
