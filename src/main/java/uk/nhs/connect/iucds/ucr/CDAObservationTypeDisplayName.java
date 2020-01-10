/*
 * XML Type:  CDAObservationType_displayName
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML CDAObservationType_displayName(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName.
 */
public interface CDAObservationTypeDisplayName extends uk.nhs.connect.iucds.ucr.St2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CDAObservationTypeDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("cdaobservationtypedisplaynamebcb9type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum RE_ADMISSION_FLAG = Enum.forString("ReAdmission Flag");
    static final Enum LAST_ASSESSMENT_REVIEW = Enum.forString("Last Assessment Review");
    static final Enum PLANNED_ASSESSMENT_REVIEW = Enum.forString("Planned Assessment Review");
    static final Enum COPY_PROVIDED_FLAG = Enum.forString("Copy Provided Flag");
    static final Enum CARE_PLAN_AGREEMENT = Enum.forString("Care Plan Agreement");
    static final Enum COMPONENT_PLANNED_END_DATE = Enum.forString("Component Planned End Date");
    static final Enum NEXT_COMPONENT_REVIEW = Enum.forString("Next Component Review");
    static final Enum LAST_COMPONENT_REVIEW = Enum.forString("Last Component Review");
    static final Enum CAF_INFORMATION_SET = Enum.forString("CAF Information Set");
    static final Enum COMPONENT_TEXT_HEADING_TYPE = Enum.forString("Component Text Heading Type");
    static final Enum ESTIMATED_DISCHARGE_DATE = Enum.forString("Estimated Discharge Date");
    static final Enum LAST_CARE_PLAN_REVIEW = Enum.forString("Last Care Plan Review");
    static final Enum NEXT_CARE_PLAN_REVIEW = Enum.forString("Next Care Plan Review");
    static final Enum TEXT_HEADING_TYPE = Enum.forString("Text Heading Type");
    static final Enum PROCEDURE_DATE_REPORTED = Enum.forString("Procedure Date Reported");
    static final Enum DI_REPORT_STATUS = Enum.forString("DI Report Status");
    static final Enum DIAGNOSTIC_IMAGING_URGENCY_INDICATOR = Enum.forString("Diagnostic Imaging Urgency Indicator");
    static final Enum NEXT_MENTAL_HEALTH_ACT_TRIBUNAL_DATE = Enum.forString("Next Mental Health Act Tribunal Date");
    static final Enum AT_RISK_REGISTER_ENTRY = Enum.forString("At Risk Register Entry");
    static final Enum PROTECTION_REGISTER_CATEGORY = Enum.forString("ProtectionRegisterCategory");
    static final Enum CARE_PROCESS_DATE_COMMENCED_OR_FIRST_REVIEW = Enum.forString("Care Process Date Commenced or First Review");
    static final Enum CARE_PROCESS_DATE_CONCLUDED_OR_MOST_RECENT_REVIEW = Enum.forString("Care Process Date Concluded or Most Recent Review");
    static final Enum CARE_PROCESS_ADMINISTRATION = Enum.forString("Care Process Administration");
    static final Enum CARE_REVIEW_ADMINISTRATION = Enum.forString("Care Review Administration");
    static final Enum CARE_PROCESS_DATE_OF_PREVIOUS_REVIEW = Enum.forString("Care Process Date of Previous Review");
    static final Enum CARE_PROCESS_DATE_OF_NEXT_PLANNED_REVIEW = Enum.forString("Care Process Date of Next Planned Review");
    static final Enum OTHER_ENTITY_ASSOCIATED_WITH_PATIENT = Enum.forString("Other Entity Associated With Patient");
    static final Enum CARE_REVIEW_STATUS = Enum.forString("Care Review Status");
    static final Enum SAMPLING_FREQUENCY = Enum.forString("Sampling Frequency");
    static final Enum DEVICE_MEASUREMENT_RANGE_PHYSICAL_QUANTITY = Enum.forString("Device Measurement Range Physical Quantity");
    static final Enum DEVICE_MEASUREMENT_RANGE_STRING = Enum.forString("Device Measurement Range String");
    static final Enum DEVICE_RESOLUTION_PHYSICAL_QUANTITY = Enum.forString("Device Resolution Physical Quantity");
    static final Enum DEVICE_RESOLUTION_STRING = Enum.forString("Device Resolution String");
    static final Enum DEVICE_ACCURACY_PHYSICAL_QUANTITY = Enum.forString("Device Accuracy Physical Quantity");
    static final Enum DEVICE_ACCURACY_STRING = Enum.forString("Device Accuracy String");
    static final Enum WAVEFORM_SAMPLE_PERIOD_OBSERVATION = Enum.forString("Waveform Sample Period Observation");
    static final Enum TEST_RESULT_OBSERVATION_SERIES = Enum.forString("Test Result Observation Series");
    static final Enum BLOOD_PRESSURE_OBSERVATION_SERIES = Enum.forString("Blood Pressure Observation Series");
    static final Enum BMI_OBSERVATION_SERIES = Enum.forString("BMI Observation Series");
    static final Enum MEAN_BLOOD_PRESSURE_OBSERVATION_SERIES = Enum.forString("Mean Blood Pressure Observation Series");
    static final Enum TEMPERATURE_OBSERVATION_SERIES = Enum.forString("Temperature Observation Series");
    static final Enum HEIGHT_OBSERVATION_SERIES = Enum.forString("Height Observation Series");
    static final Enum WEIGHT_OBSERVATION_SERIES = Enum.forString("Weight Observation Series");
    static final Enum PULSE_OBSERVATION_SERIES = Enum.forString("Pulse Observation Series");
    static final Enum THRESHOLD = Enum.forString("Threshold");
    static final Enum THRESHOLD_RATE = Enum.forString("Threshold Rate");
    static final Enum CHECKLIST_OUTCOME = Enum.forString("Checklist Outcome");
    static final Enum DST_OUTCOME = Enum.forString("DST Outcome");
    static final Enum CHC_REFERRAL_STATUS = Enum.forString("CHC Referral Status");
    static final Enum PERMISSION_TO_VIEW = Enum.forString("Permission To View");
    
    static final int INT_RE_ADMISSION_FLAG = Enum.INT_RE_ADMISSION_FLAG;
    static final int INT_LAST_ASSESSMENT_REVIEW = Enum.INT_LAST_ASSESSMENT_REVIEW;
    static final int INT_PLANNED_ASSESSMENT_REVIEW = Enum.INT_PLANNED_ASSESSMENT_REVIEW;
    static final int INT_COPY_PROVIDED_FLAG = Enum.INT_COPY_PROVIDED_FLAG;
    static final int INT_CARE_PLAN_AGREEMENT = Enum.INT_CARE_PLAN_AGREEMENT;
    static final int INT_COMPONENT_PLANNED_END_DATE = Enum.INT_COMPONENT_PLANNED_END_DATE;
    static final int INT_NEXT_COMPONENT_REVIEW = Enum.INT_NEXT_COMPONENT_REVIEW;
    static final int INT_LAST_COMPONENT_REVIEW = Enum.INT_LAST_COMPONENT_REVIEW;
    static final int INT_CAF_INFORMATION_SET = Enum.INT_CAF_INFORMATION_SET;
    static final int INT_COMPONENT_TEXT_HEADING_TYPE = Enum.INT_COMPONENT_TEXT_HEADING_TYPE;
    static final int INT_ESTIMATED_DISCHARGE_DATE = Enum.INT_ESTIMATED_DISCHARGE_DATE;
    static final int INT_LAST_CARE_PLAN_REVIEW = Enum.INT_LAST_CARE_PLAN_REVIEW;
    static final int INT_NEXT_CARE_PLAN_REVIEW = Enum.INT_NEXT_CARE_PLAN_REVIEW;
    static final int INT_TEXT_HEADING_TYPE = Enum.INT_TEXT_HEADING_TYPE;
    static final int INT_PROCEDURE_DATE_REPORTED = Enum.INT_PROCEDURE_DATE_REPORTED;
    static final int INT_DI_REPORT_STATUS = Enum.INT_DI_REPORT_STATUS;
    static final int INT_DIAGNOSTIC_IMAGING_URGENCY_INDICATOR = Enum.INT_DIAGNOSTIC_IMAGING_URGENCY_INDICATOR;
    static final int INT_NEXT_MENTAL_HEALTH_ACT_TRIBUNAL_DATE = Enum.INT_NEXT_MENTAL_HEALTH_ACT_TRIBUNAL_DATE;
    static final int INT_AT_RISK_REGISTER_ENTRY = Enum.INT_AT_RISK_REGISTER_ENTRY;
    static final int INT_PROTECTION_REGISTER_CATEGORY = Enum.INT_PROTECTION_REGISTER_CATEGORY;
    static final int INT_CARE_PROCESS_DATE_COMMENCED_OR_FIRST_REVIEW = Enum.INT_CARE_PROCESS_DATE_COMMENCED_OR_FIRST_REVIEW;
    static final int INT_CARE_PROCESS_DATE_CONCLUDED_OR_MOST_RECENT_REVIEW = Enum.INT_CARE_PROCESS_DATE_CONCLUDED_OR_MOST_RECENT_REVIEW;
    static final int INT_CARE_PROCESS_ADMINISTRATION = Enum.INT_CARE_PROCESS_ADMINISTRATION;
    static final int INT_CARE_REVIEW_ADMINISTRATION = Enum.INT_CARE_REVIEW_ADMINISTRATION;
    static final int INT_CARE_PROCESS_DATE_OF_PREVIOUS_REVIEW = Enum.INT_CARE_PROCESS_DATE_OF_PREVIOUS_REVIEW;
    static final int INT_CARE_PROCESS_DATE_OF_NEXT_PLANNED_REVIEW = Enum.INT_CARE_PROCESS_DATE_OF_NEXT_PLANNED_REVIEW;
    static final int INT_OTHER_ENTITY_ASSOCIATED_WITH_PATIENT = Enum.INT_OTHER_ENTITY_ASSOCIATED_WITH_PATIENT;
    static final int INT_CARE_REVIEW_STATUS = Enum.INT_CARE_REVIEW_STATUS;
    static final int INT_SAMPLING_FREQUENCY = Enum.INT_SAMPLING_FREQUENCY;
    static final int INT_DEVICE_MEASUREMENT_RANGE_PHYSICAL_QUANTITY = Enum.INT_DEVICE_MEASUREMENT_RANGE_PHYSICAL_QUANTITY;
    static final int INT_DEVICE_MEASUREMENT_RANGE_STRING = Enum.INT_DEVICE_MEASUREMENT_RANGE_STRING;
    static final int INT_DEVICE_RESOLUTION_PHYSICAL_QUANTITY = Enum.INT_DEVICE_RESOLUTION_PHYSICAL_QUANTITY;
    static final int INT_DEVICE_RESOLUTION_STRING = Enum.INT_DEVICE_RESOLUTION_STRING;
    static final int INT_DEVICE_ACCURACY_PHYSICAL_QUANTITY = Enum.INT_DEVICE_ACCURACY_PHYSICAL_QUANTITY;
    static final int INT_DEVICE_ACCURACY_STRING = Enum.INT_DEVICE_ACCURACY_STRING;
    static final int INT_WAVEFORM_SAMPLE_PERIOD_OBSERVATION = Enum.INT_WAVEFORM_SAMPLE_PERIOD_OBSERVATION;
    static final int INT_TEST_RESULT_OBSERVATION_SERIES = Enum.INT_TEST_RESULT_OBSERVATION_SERIES;
    static final int INT_BLOOD_PRESSURE_OBSERVATION_SERIES = Enum.INT_BLOOD_PRESSURE_OBSERVATION_SERIES;
    static final int INT_BMI_OBSERVATION_SERIES = Enum.INT_BMI_OBSERVATION_SERIES;
    static final int INT_MEAN_BLOOD_PRESSURE_OBSERVATION_SERIES = Enum.INT_MEAN_BLOOD_PRESSURE_OBSERVATION_SERIES;
    static final int INT_TEMPERATURE_OBSERVATION_SERIES = Enum.INT_TEMPERATURE_OBSERVATION_SERIES;
    static final int INT_HEIGHT_OBSERVATION_SERIES = Enum.INT_HEIGHT_OBSERVATION_SERIES;
    static final int INT_WEIGHT_OBSERVATION_SERIES = Enum.INT_WEIGHT_OBSERVATION_SERIES;
    static final int INT_PULSE_OBSERVATION_SERIES = Enum.INT_PULSE_OBSERVATION_SERIES;
    static final int INT_THRESHOLD = Enum.INT_THRESHOLD;
    static final int INT_THRESHOLD_RATE = Enum.INT_THRESHOLD_RATE;
    static final int INT_CHECKLIST_OUTCOME = Enum.INT_CHECKLIST_OUTCOME;
    static final int INT_DST_OUTCOME = Enum.INT_DST_OUTCOME;
    static final int INT_CHC_REFERRAL_STATUS = Enum.INT_CHC_REFERRAL_STATUS;
    static final int INT_PERMISSION_TO_VIEW = Enum.INT_PERMISSION_TO_VIEW;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_RE_ADMISSION_FLAG
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
        
        static final int INT_RE_ADMISSION_FLAG = 1;
        static final int INT_LAST_ASSESSMENT_REVIEW = 2;
        static final int INT_PLANNED_ASSESSMENT_REVIEW = 3;
        static final int INT_COPY_PROVIDED_FLAG = 4;
        static final int INT_CARE_PLAN_AGREEMENT = 5;
        static final int INT_COMPONENT_PLANNED_END_DATE = 6;
        static final int INT_NEXT_COMPONENT_REVIEW = 7;
        static final int INT_LAST_COMPONENT_REVIEW = 8;
        static final int INT_CAF_INFORMATION_SET = 9;
        static final int INT_COMPONENT_TEXT_HEADING_TYPE = 10;
        static final int INT_ESTIMATED_DISCHARGE_DATE = 11;
        static final int INT_LAST_CARE_PLAN_REVIEW = 12;
        static final int INT_NEXT_CARE_PLAN_REVIEW = 13;
        static final int INT_TEXT_HEADING_TYPE = 14;
        static final int INT_PROCEDURE_DATE_REPORTED = 15;
        static final int INT_DI_REPORT_STATUS = 16;
        static final int INT_DIAGNOSTIC_IMAGING_URGENCY_INDICATOR = 17;
        static final int INT_NEXT_MENTAL_HEALTH_ACT_TRIBUNAL_DATE = 18;
        static final int INT_AT_RISK_REGISTER_ENTRY = 19;
        static final int INT_PROTECTION_REGISTER_CATEGORY = 20;
        static final int INT_CARE_PROCESS_DATE_COMMENCED_OR_FIRST_REVIEW = 21;
        static final int INT_CARE_PROCESS_DATE_CONCLUDED_OR_MOST_RECENT_REVIEW = 22;
        static final int INT_CARE_PROCESS_ADMINISTRATION = 23;
        static final int INT_CARE_REVIEW_ADMINISTRATION = 24;
        static final int INT_CARE_PROCESS_DATE_OF_PREVIOUS_REVIEW = 25;
        static final int INT_CARE_PROCESS_DATE_OF_NEXT_PLANNED_REVIEW = 26;
        static final int INT_OTHER_ENTITY_ASSOCIATED_WITH_PATIENT = 27;
        static final int INT_CARE_REVIEW_STATUS = 28;
        static final int INT_SAMPLING_FREQUENCY = 29;
        static final int INT_DEVICE_MEASUREMENT_RANGE_PHYSICAL_QUANTITY = 30;
        static final int INT_DEVICE_MEASUREMENT_RANGE_STRING = 31;
        static final int INT_DEVICE_RESOLUTION_PHYSICAL_QUANTITY = 32;
        static final int INT_DEVICE_RESOLUTION_STRING = 33;
        static final int INT_DEVICE_ACCURACY_PHYSICAL_QUANTITY = 34;
        static final int INT_DEVICE_ACCURACY_STRING = 35;
        static final int INT_WAVEFORM_SAMPLE_PERIOD_OBSERVATION = 36;
        static final int INT_TEST_RESULT_OBSERVATION_SERIES = 37;
        static final int INT_BLOOD_PRESSURE_OBSERVATION_SERIES = 38;
        static final int INT_BMI_OBSERVATION_SERIES = 39;
        static final int INT_MEAN_BLOOD_PRESSURE_OBSERVATION_SERIES = 40;
        static final int INT_TEMPERATURE_OBSERVATION_SERIES = 41;
        static final int INT_HEIGHT_OBSERVATION_SERIES = 42;
        static final int INT_WEIGHT_OBSERVATION_SERIES = 43;
        static final int INT_PULSE_OBSERVATION_SERIES = 44;
        static final int INT_THRESHOLD = 45;
        static final int INT_THRESHOLD_RATE = 46;
        static final int INT_CHECKLIST_OUTCOME = 47;
        static final int INT_DST_OUTCOME = 48;
        static final int INT_CHC_REFERRAL_STATUS = 49;
        static final int INT_PERMISSION_TO_VIEW = 50;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("ReAdmission Flag", INT_RE_ADMISSION_FLAG),
                new Enum("Last Assessment Review", INT_LAST_ASSESSMENT_REVIEW),
                new Enum("Planned Assessment Review", INT_PLANNED_ASSESSMENT_REVIEW),
                new Enum("Copy Provided Flag", INT_COPY_PROVIDED_FLAG),
                new Enum("Care Plan Agreement", INT_CARE_PLAN_AGREEMENT),
                new Enum("Component Planned End Date", INT_COMPONENT_PLANNED_END_DATE),
                new Enum("Next Component Review", INT_NEXT_COMPONENT_REVIEW),
                new Enum("Last Component Review", INT_LAST_COMPONENT_REVIEW),
                new Enum("CAF Information Set", INT_CAF_INFORMATION_SET),
                new Enum("Component Text Heading Type", INT_COMPONENT_TEXT_HEADING_TYPE),
                new Enum("Estimated Discharge Date", INT_ESTIMATED_DISCHARGE_DATE),
                new Enum("Last Care Plan Review", INT_LAST_CARE_PLAN_REVIEW),
                new Enum("Next Care Plan Review", INT_NEXT_CARE_PLAN_REVIEW),
                new Enum("Text Heading Type", INT_TEXT_HEADING_TYPE),
                new Enum("Procedure Date Reported", INT_PROCEDURE_DATE_REPORTED),
                new Enum("DI Report Status", INT_DI_REPORT_STATUS),
                new Enum("Diagnostic Imaging Urgency Indicator", INT_DIAGNOSTIC_IMAGING_URGENCY_INDICATOR),
                new Enum("Next Mental Health Act Tribunal Date", INT_NEXT_MENTAL_HEALTH_ACT_TRIBUNAL_DATE),
                new Enum("At Risk Register Entry", INT_AT_RISK_REGISTER_ENTRY),
                new Enum("ProtectionRegisterCategory", INT_PROTECTION_REGISTER_CATEGORY),
                new Enum("Care Process Date Commenced or First Review", INT_CARE_PROCESS_DATE_COMMENCED_OR_FIRST_REVIEW),
                new Enum("Care Process Date Concluded or Most Recent Review", INT_CARE_PROCESS_DATE_CONCLUDED_OR_MOST_RECENT_REVIEW),
                new Enum("Care Process Administration", INT_CARE_PROCESS_ADMINISTRATION),
                new Enum("Care Review Administration", INT_CARE_REVIEW_ADMINISTRATION),
                new Enum("Care Process Date of Previous Review", INT_CARE_PROCESS_DATE_OF_PREVIOUS_REVIEW),
                new Enum("Care Process Date of Next Planned Review", INT_CARE_PROCESS_DATE_OF_NEXT_PLANNED_REVIEW),
                new Enum("Other Entity Associated With Patient", INT_OTHER_ENTITY_ASSOCIATED_WITH_PATIENT),
                new Enum("Care Review Status", INT_CARE_REVIEW_STATUS),
                new Enum("Sampling Frequency", INT_SAMPLING_FREQUENCY),
                new Enum("Device Measurement Range Physical Quantity", INT_DEVICE_MEASUREMENT_RANGE_PHYSICAL_QUANTITY),
                new Enum("Device Measurement Range String", INT_DEVICE_MEASUREMENT_RANGE_STRING),
                new Enum("Device Resolution Physical Quantity", INT_DEVICE_RESOLUTION_PHYSICAL_QUANTITY),
                new Enum("Device Resolution String", INT_DEVICE_RESOLUTION_STRING),
                new Enum("Device Accuracy Physical Quantity", INT_DEVICE_ACCURACY_PHYSICAL_QUANTITY),
                new Enum("Device Accuracy String", INT_DEVICE_ACCURACY_STRING),
                new Enum("Waveform Sample Period Observation", INT_WAVEFORM_SAMPLE_PERIOD_OBSERVATION),
                new Enum("Test Result Observation Series", INT_TEST_RESULT_OBSERVATION_SERIES),
                new Enum("Blood Pressure Observation Series", INT_BLOOD_PRESSURE_OBSERVATION_SERIES),
                new Enum("BMI Observation Series", INT_BMI_OBSERVATION_SERIES),
                new Enum("Mean Blood Pressure Observation Series", INT_MEAN_BLOOD_PRESSURE_OBSERVATION_SERIES),
                new Enum("Temperature Observation Series", INT_TEMPERATURE_OBSERVATION_SERIES),
                new Enum("Height Observation Series", INT_HEIGHT_OBSERVATION_SERIES),
                new Enum("Weight Observation Series", INT_WEIGHT_OBSERVATION_SERIES),
                new Enum("Pulse Observation Series", INT_PULSE_OBSERVATION_SERIES),
                new Enum("Threshold", INT_THRESHOLD),
                new Enum("Threshold Rate", INT_THRESHOLD_RATE),
                new Enum("Checklist Outcome", INT_CHECKLIST_OUTCOME),
                new Enum("DST Outcome", INT_DST_OUTCOME),
                new Enum("CHC Referral Status", INT_CHC_REFERRAL_STATUS),
                new Enum("Permission To View", INT_PERMISSION_TO_VIEW),
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
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName newInstance() {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.CDAObservationTypeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
