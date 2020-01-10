/*
 * XML Type:  ObservationType_displayName
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML ObservationType_displayName(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName.
 */
public interface ObservationTypeDisplayName extends uk.nhs.connect.iucds.ucr.St2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ObservationTypeDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("observationtypedisplayname63abtype");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum ASSESSMENT_NOTIFICATION_DATA_PAYLOAD = Enum.forString("Assessment Notification Data Payload");
    static final Enum DISCHARGE_NOTIFICATION_DATA_PAYLOAD = Enum.forString("Discharge Notification Data Payload");
    static final Enum MENTAL_CAPACITY_TO_CONSENT = Enum.forString("Mental Capacity (to consent)");
    static final Enum REIMBURSEMENT_RULE = Enum.forString("Reimbursement Rule");
    static final Enum ELIGIBILITY_TO_SERVICES_UNDER_SECTION_117 = Enum.forString("Eligibility to Services under Section 117");
    static final Enum CONTINUING_HEALTHCARE_ASSESSMENT_STATUS = Enum.forString("Continuing Healthcare Assessment Status");
    static final Enum DISCHARGE_NOTIFICATION_DATE_TIME = Enum.forString("Discharge Notification date time");
    static final Enum MENTAL_CAPACITY_TO_AGREE_TO_PLAN_OF_CARE = Enum.forString("Mental Capacity (to agree to plan of care)");
    static final Enum SAFE_TO_DISCHARGE = Enum.forString("Safe to Discharge");
    static final Enum PATIENT_AGREEMENT_TO_CARE_NEED = Enum.forString("Patient Agreement to Care Need");
    static final Enum ASSESSMENT_NOTIFICATION_REJECT_REASON = Enum.forString("Assessment Notification Reject Reason");
    static final Enum DISCHARGE_NOTIFICATION_DISAGREE_RESPONSE = Enum.forString("Discharge Notification Disagree Response");
    static final Enum DISCHARGE_NOTIFICATION_AGREE_RESPONSE = Enum.forString("Discharge Notification Agree Response");
    static final Enum MDT_SAFE_TO_DISCHARGE_DATE = Enum.forString("MDT Safe to Discharge Date");
    static final Enum DISCHARGE_NOTIFICATION_CANCELLATION_REASON_CODE = Enum.forString("Discharge Notification Cancellation Reason Code");
    static final Enum ASSESSMENT_DOCUMENT_REJECTION_REASON_CODE = Enum.forString("Assessment Document Rejection Reason Code");
    static final Enum ASSESSMENT_DOCUMENT_REJECTION_REASON_TEXT = Enum.forString("Assessment Document Rejection Reason Text");
    static final Enum CONTINUING_HEALTHCARE_CANCELLATION_REASON_CODE = Enum.forString("Continuing Healthcare Cancellation Reason Code");
    static final Enum CONTINUING_HEALTHCARE_CANCELLATION_REASON_TEXT = Enum.forString("Continuing Healthcare Cancellation Reason Text");
    
    static final int INT_ASSESSMENT_NOTIFICATION_DATA_PAYLOAD = Enum.INT_ASSESSMENT_NOTIFICATION_DATA_PAYLOAD;
    static final int INT_DISCHARGE_NOTIFICATION_DATA_PAYLOAD = Enum.INT_DISCHARGE_NOTIFICATION_DATA_PAYLOAD;
    static final int INT_MENTAL_CAPACITY_TO_CONSENT = Enum.INT_MENTAL_CAPACITY_TO_CONSENT;
    static final int INT_REIMBURSEMENT_RULE = Enum.INT_REIMBURSEMENT_RULE;
    static final int INT_ELIGIBILITY_TO_SERVICES_UNDER_SECTION_117 = Enum.INT_ELIGIBILITY_TO_SERVICES_UNDER_SECTION_117;
    static final int INT_CONTINUING_HEALTHCARE_ASSESSMENT_STATUS = Enum.INT_CONTINUING_HEALTHCARE_ASSESSMENT_STATUS;
    static final int INT_DISCHARGE_NOTIFICATION_DATE_TIME = Enum.INT_DISCHARGE_NOTIFICATION_DATE_TIME;
    static final int INT_MENTAL_CAPACITY_TO_AGREE_TO_PLAN_OF_CARE = Enum.INT_MENTAL_CAPACITY_TO_AGREE_TO_PLAN_OF_CARE;
    static final int INT_SAFE_TO_DISCHARGE = Enum.INT_SAFE_TO_DISCHARGE;
    static final int INT_PATIENT_AGREEMENT_TO_CARE_NEED = Enum.INT_PATIENT_AGREEMENT_TO_CARE_NEED;
    static final int INT_ASSESSMENT_NOTIFICATION_REJECT_REASON = Enum.INT_ASSESSMENT_NOTIFICATION_REJECT_REASON;
    static final int INT_DISCHARGE_NOTIFICATION_DISAGREE_RESPONSE = Enum.INT_DISCHARGE_NOTIFICATION_DISAGREE_RESPONSE;
    static final int INT_DISCHARGE_NOTIFICATION_AGREE_RESPONSE = Enum.INT_DISCHARGE_NOTIFICATION_AGREE_RESPONSE;
    static final int INT_MDT_SAFE_TO_DISCHARGE_DATE = Enum.INT_MDT_SAFE_TO_DISCHARGE_DATE;
    static final int INT_DISCHARGE_NOTIFICATION_CANCELLATION_REASON_CODE = Enum.INT_DISCHARGE_NOTIFICATION_CANCELLATION_REASON_CODE;
    static final int INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_CODE = Enum.INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_CODE;
    static final int INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_TEXT = Enum.INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_TEXT;
    static final int INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_CODE = Enum.INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_CODE;
    static final int INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_TEXT = Enum.INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_TEXT;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_ASSESSMENT_NOTIFICATION_DATA_PAYLOAD
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
        
        static final int INT_ASSESSMENT_NOTIFICATION_DATA_PAYLOAD = 1;
        static final int INT_DISCHARGE_NOTIFICATION_DATA_PAYLOAD = 2;
        static final int INT_MENTAL_CAPACITY_TO_CONSENT = 3;
        static final int INT_REIMBURSEMENT_RULE = 4;
        static final int INT_ELIGIBILITY_TO_SERVICES_UNDER_SECTION_117 = 5;
        static final int INT_CONTINUING_HEALTHCARE_ASSESSMENT_STATUS = 6;
        static final int INT_DISCHARGE_NOTIFICATION_DATE_TIME = 7;
        static final int INT_MENTAL_CAPACITY_TO_AGREE_TO_PLAN_OF_CARE = 8;
        static final int INT_SAFE_TO_DISCHARGE = 9;
        static final int INT_PATIENT_AGREEMENT_TO_CARE_NEED = 10;
        static final int INT_ASSESSMENT_NOTIFICATION_REJECT_REASON = 11;
        static final int INT_DISCHARGE_NOTIFICATION_DISAGREE_RESPONSE = 12;
        static final int INT_DISCHARGE_NOTIFICATION_AGREE_RESPONSE = 13;
        static final int INT_MDT_SAFE_TO_DISCHARGE_DATE = 14;
        static final int INT_DISCHARGE_NOTIFICATION_CANCELLATION_REASON_CODE = 15;
        static final int INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_CODE = 16;
        static final int INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_TEXT = 17;
        static final int INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_CODE = 18;
        static final int INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_TEXT = 19;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Assessment Notification Data Payload", INT_ASSESSMENT_NOTIFICATION_DATA_PAYLOAD),
                new Enum("Discharge Notification Data Payload", INT_DISCHARGE_NOTIFICATION_DATA_PAYLOAD),
                new Enum("Mental Capacity (to consent)", INT_MENTAL_CAPACITY_TO_CONSENT),
                new Enum("Reimbursement Rule", INT_REIMBURSEMENT_RULE),
                new Enum("Eligibility to Services under Section 117", INT_ELIGIBILITY_TO_SERVICES_UNDER_SECTION_117),
                new Enum("Continuing Healthcare Assessment Status", INT_CONTINUING_HEALTHCARE_ASSESSMENT_STATUS),
                new Enum("Discharge Notification date time", INT_DISCHARGE_NOTIFICATION_DATE_TIME),
                new Enum("Mental Capacity (to agree to plan of care)", INT_MENTAL_CAPACITY_TO_AGREE_TO_PLAN_OF_CARE),
                new Enum("Safe to Discharge", INT_SAFE_TO_DISCHARGE),
                new Enum("Patient Agreement to Care Need", INT_PATIENT_AGREEMENT_TO_CARE_NEED),
                new Enum("Assessment Notification Reject Reason", INT_ASSESSMENT_NOTIFICATION_REJECT_REASON),
                new Enum("Discharge Notification Disagree Response", INT_DISCHARGE_NOTIFICATION_DISAGREE_RESPONSE),
                new Enum("Discharge Notification Agree Response", INT_DISCHARGE_NOTIFICATION_AGREE_RESPONSE),
                new Enum("MDT Safe to Discharge Date", INT_MDT_SAFE_TO_DISCHARGE_DATE),
                new Enum("Discharge Notification Cancellation Reason Code", INT_DISCHARGE_NOTIFICATION_CANCELLATION_REASON_CODE),
                new Enum("Assessment Document Rejection Reason Code", INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_CODE),
                new Enum("Assessment Document Rejection Reason Text", INT_ASSESSMENT_DOCUMENT_REJECTION_REASON_TEXT),
                new Enum("Continuing Healthcare Cancellation Reason Code", INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_CODE),
                new Enum("Continuing Healthcare Cancellation Reason Text", INT_CONTINUING_HEALTHCARE_CANCELLATION_REASON_TEXT),
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
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName newInstance() {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.ObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
