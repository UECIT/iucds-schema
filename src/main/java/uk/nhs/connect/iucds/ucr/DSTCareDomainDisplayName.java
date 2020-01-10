/*
 * XML Type:  DSTCareDomain_displayName
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML DSTCareDomain_displayName(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName.
 */
public interface DSTCareDomainDisplayName extends uk.nhs.connect.iucds.ucr.St2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DSTCareDomainDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("dstcaredomaindisplaynamebc17type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum BEHAVIOUR = Enum.forString("Behaviour");
    static final Enum COGNITION = Enum.forString("Cognition");
    static final Enum PSYCHOLOGICAL_AND_EMOTIONAL_NEEDS = Enum.forString("Psychological and Emotional Needs");
    static final Enum COMMUNICATION = Enum.forString("Communication");
    static final Enum MOBILITY = Enum.forString("Mobility");
    static final Enum NUTRITION_FOOD_AND_DRINK = Enum.forString("Nutrition - Food and Drink");
    static final Enum CONTINENCE = Enum.forString("Continence");
    static final Enum SKIN_INCLUDING_TISSUE_VIABILITY = Enum.forString("Skin (including tissue viability)");
    static final Enum BREATHING = Enum.forString("Breathing");
    static final Enum DRUG_THERAPIES_AND_MEDICATION_SYMPTOM_CONTROL = Enum.forString("Drug Therapies and Medication - Symptom Control");
    static final Enum ALTERED_STATES_OF_CONSCIOUSNESS = Enum.forString("Altered States of Consciousness");
    static final Enum OTHER_SIGNIFICANT_CARE_NEEDS = Enum.forString("Other significant care needs");
    
    static final int INT_BEHAVIOUR = Enum.INT_BEHAVIOUR;
    static final int INT_COGNITION = Enum.INT_COGNITION;
    static final int INT_PSYCHOLOGICAL_AND_EMOTIONAL_NEEDS = Enum.INT_PSYCHOLOGICAL_AND_EMOTIONAL_NEEDS;
    static final int INT_COMMUNICATION = Enum.INT_COMMUNICATION;
    static final int INT_MOBILITY = Enum.INT_MOBILITY;
    static final int INT_NUTRITION_FOOD_AND_DRINK = Enum.INT_NUTRITION_FOOD_AND_DRINK;
    static final int INT_CONTINENCE = Enum.INT_CONTINENCE;
    static final int INT_SKIN_INCLUDING_TISSUE_VIABILITY = Enum.INT_SKIN_INCLUDING_TISSUE_VIABILITY;
    static final int INT_BREATHING = Enum.INT_BREATHING;
    static final int INT_DRUG_THERAPIES_AND_MEDICATION_SYMPTOM_CONTROL = Enum.INT_DRUG_THERAPIES_AND_MEDICATION_SYMPTOM_CONTROL;
    static final int INT_ALTERED_STATES_OF_CONSCIOUSNESS = Enum.INT_ALTERED_STATES_OF_CONSCIOUSNESS;
    static final int INT_OTHER_SIGNIFICANT_CARE_NEEDS = Enum.INT_OTHER_SIGNIFICANT_CARE_NEEDS;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_BEHAVIOUR
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
        
        static final int INT_BEHAVIOUR = 1;
        static final int INT_COGNITION = 2;
        static final int INT_PSYCHOLOGICAL_AND_EMOTIONAL_NEEDS = 3;
        static final int INT_COMMUNICATION = 4;
        static final int INT_MOBILITY = 5;
        static final int INT_NUTRITION_FOOD_AND_DRINK = 6;
        static final int INT_CONTINENCE = 7;
        static final int INT_SKIN_INCLUDING_TISSUE_VIABILITY = 8;
        static final int INT_BREATHING = 9;
        static final int INT_DRUG_THERAPIES_AND_MEDICATION_SYMPTOM_CONTROL = 10;
        static final int INT_ALTERED_STATES_OF_CONSCIOUSNESS = 11;
        static final int INT_OTHER_SIGNIFICANT_CARE_NEEDS = 12;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Behaviour", INT_BEHAVIOUR),
                new Enum("Cognition", INT_COGNITION),
                new Enum("Psychological and Emotional Needs", INT_PSYCHOLOGICAL_AND_EMOTIONAL_NEEDS),
                new Enum("Communication", INT_COMMUNICATION),
                new Enum("Mobility", INT_MOBILITY),
                new Enum("Nutrition - Food and Drink", INT_NUTRITION_FOOD_AND_DRINK),
                new Enum("Continence", INT_CONTINENCE),
                new Enum("Skin (including tissue viability)", INT_SKIN_INCLUDING_TISSUE_VIABILITY),
                new Enum("Breathing", INT_BREATHING),
                new Enum("Drug Therapies and Medication - Symptom Control", INT_DRUG_THERAPIES_AND_MEDICATION_SYMPTOM_CONTROL),
                new Enum("Altered States of Consciousness", INT_ALTERED_STATES_OF_CONSCIOUSNESS),
                new Enum("Other significant care needs", INT_OTHER_SIGNIFICANT_CARE_NEEDS),
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
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName newInstance() {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.DSTCareDomainDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
