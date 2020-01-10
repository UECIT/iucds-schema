/*
 * XML Type:  SealEventActionCode_displayName
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML SealEventActionCode_displayName(@urn:hl7-org:v3).
 *
 * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName.
 */
public interface SealEventActionCodeDisplayName extends uk.nhs.connect.iucds.ucr.St2
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SealEventActionCodeDisplayName.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("sealeventactioncodedisplaynameecb1type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum INFORMATION_HAS_BEEN_SEALED = Enum.forString("Information has been sealed");
    static final Enum INFORMATION_HAS_BEEN_SEALED_AND_LOCKED = Enum.forString("Information has been sealed and locked");
    static final Enum INFORMATION_THAT_WAS_SEALED_AND_LOCKED_IS_NOW_SEALED = Enum.forString("Information that was sealed and locked is now sealed");
    static final Enum INFORMATION_HAS_BEEN_UNSEALED = Enum.forString("Information has been unsealed");
    static final Enum AN_ADDITIONAL_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION = Enum.forString("An additional workgroup now has access to some sealed information");
    static final Enum THE_NEW_GP_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION = Enum.forString("The new GP workgroup now has access to some sealed information");
    static final Enum A_REPLACEMENT_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION_DUE_TO_ORGANIZATIONAL_CHANGE = Enum.forString("A replacement workgroup now has access to some sealed information due to organizational change");
    
    static final int INT_INFORMATION_HAS_BEEN_SEALED = Enum.INT_INFORMATION_HAS_BEEN_SEALED;
    static final int INT_INFORMATION_HAS_BEEN_SEALED_AND_LOCKED = Enum.INT_INFORMATION_HAS_BEEN_SEALED_AND_LOCKED;
    static final int INT_INFORMATION_THAT_WAS_SEALED_AND_LOCKED_IS_NOW_SEALED = Enum.INT_INFORMATION_THAT_WAS_SEALED_AND_LOCKED_IS_NOW_SEALED;
    static final int INT_INFORMATION_HAS_BEEN_UNSEALED = Enum.INT_INFORMATION_HAS_BEEN_UNSEALED;
    static final int INT_AN_ADDITIONAL_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION = Enum.INT_AN_ADDITIONAL_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION;
    static final int INT_THE_NEW_GP_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION = Enum.INT_THE_NEW_GP_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION;
    static final int INT_A_REPLACEMENT_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION_DUE_TO_ORGANIZATIONAL_CHANGE = Enum.INT_A_REPLACEMENT_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION_DUE_TO_ORGANIZATIONAL_CHANGE;
    
    /**
     * Enumeration value class for uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_INFORMATION_HAS_BEEN_SEALED
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
        
        static final int INT_INFORMATION_HAS_BEEN_SEALED = 1;
        static final int INT_INFORMATION_HAS_BEEN_SEALED_AND_LOCKED = 2;
        static final int INT_INFORMATION_THAT_WAS_SEALED_AND_LOCKED_IS_NOW_SEALED = 3;
        static final int INT_INFORMATION_HAS_BEEN_UNSEALED = 4;
        static final int INT_AN_ADDITIONAL_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION = 5;
        static final int INT_THE_NEW_GP_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION = 6;
        static final int INT_A_REPLACEMENT_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION_DUE_TO_ORGANIZATIONAL_CHANGE = 7;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("Information has been sealed", INT_INFORMATION_HAS_BEEN_SEALED),
                new Enum("Information has been sealed and locked", INT_INFORMATION_HAS_BEEN_SEALED_AND_LOCKED),
                new Enum("Information that was sealed and locked is now sealed", INT_INFORMATION_THAT_WAS_SEALED_AND_LOCKED_IS_NOW_SEALED),
                new Enum("Information has been unsealed", INT_INFORMATION_HAS_BEEN_UNSEALED),
                new Enum("An additional workgroup now has access to some sealed information", INT_AN_ADDITIONAL_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION),
                new Enum("The new GP workgroup now has access to some sealed information", INT_THE_NEW_GP_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION),
                new Enum("A replacement workgroup now has access to some sealed information due to organizational change", INT_A_REPLACEMENT_WORKGROUP_NOW_HAS_ACCESS_TO_SOME_SEALED_INFORMATION_DUE_TO_ORGANIZATIONAL_CHANGE),
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
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName newValue(java.lang.Object obj) {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) type.newValue( obj ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName newInstance() {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.SealEventActionCodeDisplayName) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
