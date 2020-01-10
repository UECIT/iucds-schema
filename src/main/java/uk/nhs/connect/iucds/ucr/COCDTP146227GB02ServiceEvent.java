/*
 * XML Type:  COCD_TP146227GB02.ServiceEvent
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr;


/**
 * An XML COCD_TP146227GB02.ServiceEvent(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface COCDTP146227GB02ServiceEvent extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(COCDTP146227GB02ServiceEvent.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("cocdtp146227gb02serviceevente4a9type");
    
    /**
     * Gets the "code" element
     */
    uk.nhs.connect.iucds.ucr.CE getCode();
    
    /**
     * Sets the "code" element
     */
    void setCode(uk.nhs.connect.iucds.ucr.CE code);
    
    /**
     * Appends and returns a new empty "code" element
     */
    uk.nhs.connect.iucds.ucr.CE addNewCode();
    
    /**
     * Gets the "effectiveTime" element
     */
    uk.nhs.connect.iucds.ucr.IVLTS getEffectiveTime();
    
    /**
     * True if has "effectiveTime" element
     */
    boolean isSetEffectiveTime();
    
    /**
     * Sets the "effectiveTime" element
     */
    void setEffectiveTime(uk.nhs.connect.iucds.ucr.IVLTS effectiveTime);
    
    /**
     * Appends and returns a new empty "effectiveTime" element
     */
    uk.nhs.connect.iucds.ucr.IVLTS addNewEffectiveTime();
    
    /**
     * Unsets the "effectiveTime" element
     */
    void unsetEffectiveTime();
    
    /**
     * Gets array of all "id" elements
     */
    uk.nhs.connect.iucds.ucr.II[] getIdArray();
    
    /**
     * Gets ith "id" element
     */
    uk.nhs.connect.iucds.ucr.II getIdArray(int i);
    
    /**
     * Returns number of "id" element
     */
    int sizeOfIdArray();
    
    /**
     * Sets array of all "id" element
     */
    void setIdArray(uk.nhs.connect.iucds.ucr.II[] idArray);
    
    /**
     * Sets ith "id" element
     */
    void setIdArray(int i, uk.nhs.connect.iucds.ucr.II id);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "id" element
     */
    uk.nhs.connect.iucds.ucr.II insertNewId(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "id" element
     */
    uk.nhs.connect.iucds.ucr.II addNewId();
    
    /**
     * Removes the ith "id" element
     */
    void removeId(int i);
    
    /**
     * Gets the "templateId" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId getTemplateId();
    
    /**
     * Sets the "templateId" element
     */
    void setTemplateId(uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId templateId);
    
    /**
     * Appends and returns a new empty "templateId" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId addNewTemplateId();
    
    /**
     * Gets array of all "performer" elements
     */
    uk.nhs.connect.iucds.ucr.COCDTP146227GB02Participant[] getPerformerArray();
    
    /**
     * Gets ith "performer" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP146227GB02Participant getPerformerArray(int i);
    
    /**
     * Tests for nil ith "performer" element
     */
    boolean isNilPerformerArray(int i);
    
    /**
     * Returns number of "performer" element
     */
    int sizeOfPerformerArray();
    
    /**
     * Sets array of all "performer" element
     */
    void setPerformerArray(uk.nhs.connect.iucds.ucr.COCDTP146227GB02Participant[] performerArray);
    
    /**
     * Sets ith "performer" element
     */
    void setPerformerArray(int i, uk.nhs.connect.iucds.ucr.COCDTP146227GB02Participant performer);
    
    /**
     * Nils the ith "performer" element
     */
    void setNilPerformerArray(int i);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "performer" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP146227GB02Participant insertNewPerformer(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "performer" element
     */
    uk.nhs.connect.iucds.ucr.COCDTP146227GB02Participant addNewPerformer();
    
    /**
     * Removes the ith "performer" element
     */
    void removePerformer(int i);
    
    /**
     * Gets the "nullFlavor" attribute
     */
    java.lang.String getNullFlavor();
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    uk.nhs.connect.iucds.ucr.NullFlavor xgetNullFlavor();
    
    /**
     * True if has "nullFlavor" attribute
     */
    boolean isSetNullFlavor();
    
    /**
     * Sets the "nullFlavor" attribute
     */
    void setNullFlavor(java.lang.String nullFlavor);
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    void xsetNullFlavor(uk.nhs.connect.iucds.ucr.NullFlavor nullFlavor);
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    void unsetNullFlavor();
    
    /**
     * Gets the "updateMode" attribute
     */
    uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum getUpdateMode();
    
    /**
     * Gets (as xml) the "updateMode" attribute
     */
    uk.nhs.connect.iucds.ucr.CsUpdateMode xgetUpdateMode();
    
    /**
     * True if has "updateMode" attribute
     */
    boolean isSetUpdateMode();
    
    /**
     * Sets the "updateMode" attribute
     */
    void setUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode.Enum updateMode);
    
    /**
     * Sets (as xml) the "updateMode" attribute
     */
    void xsetUpdateMode(uk.nhs.connect.iucds.ucr.CsUpdateMode updateMode);
    
    /**
     * Unsets the "updateMode" attribute
     */
    void unsetUpdateMode();
    
    /**
     * Gets the "classCode" attribute
     */
    java.lang.String getClassCode();
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    uk.nhs.connect.iucds.ucr.Cs2 xgetClassCode();
    
    /**
     * Sets the "classCode" attribute
     */
    void setClassCode(java.lang.String classCode);
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    void xsetClassCode(uk.nhs.connect.iucds.ucr.Cs2 classCode);
    
    /**
     * Gets the "moodCode" attribute
     */
    java.lang.String getMoodCode();
    
    /**
     * Gets (as xml) the "moodCode" attribute
     */
    uk.nhs.connect.iucds.ucr.Cs2 xgetMoodCode();
    
    /**
     * Sets the "moodCode" attribute
     */
    void setMoodCode(java.lang.String moodCode);
    
    /**
     * Sets (as xml) the "moodCode" attribute
     */
    void xsetMoodCode(uk.nhs.connect.iucds.ucr.Cs2 moodCode);
    
    /**
     * An XML templateId(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public interface TemplateId extends uk.nhs.connect.iucds.ucr.II
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TemplateId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("templateid687aelemtype");
        
        /**
         * Gets the "root" attribute
         */
        java.lang.String getRoot();
        
        /**
         * Gets (as xml) the "root" attribute
         */
        uk.nhs.connect.iucds.ucr.Uid xgetRoot();
        
        /**
         * True if has "root" attribute
         */
        boolean isSetRoot();
        
        /**
         * Sets the "root" attribute
         */
        void setRoot(java.lang.String root);
        
        /**
         * Sets (as xml) the "root" attribute
         */
        void xsetRoot(uk.nhs.connect.iucds.ucr.Uid root);
        
        /**
         * Unsets the "root" attribute
         */
        void unsetRoot();
        
        /**
         * Gets the "extension" attribute
         */
        java.lang.String getExtension();
        
        /**
         * Gets (as xml) the "extension" attribute
         */
        uk.nhs.connect.iucds.ucr.St2 xgetExtension();
        
        /**
         * True if has "extension" attribute
         */
        boolean isSetExtension();
        
        /**
         * Sets the "extension" attribute
         */
        void setExtension(java.lang.String extension);
        
        /**
         * Sets (as xml) the "extension" attribute
         */
        void xsetExtension(uk.nhs.connect.iucds.ucr.St2 extension);
        
        /**
         * Unsets the "extension" attribute
         */
        void unsetExtension();
        
        /**
         * An XML root(@).
         *
         * This is a union type. Instances are of one of the following types:
         *     uk.nhs.connect.iucds.ucr.Oid
         *     uk.nhs.connect.iucds.ucr.Uuid
         *     uk.nhs.connect.iucds.ucr.Ruid
         */
        public interface Root extends uk.nhs.connect.iucds.ucr.Uid
        {
            java.lang.Object getObjectValue();
            void setObjectValue(java.lang.Object val);
            /** @deprecated */
            java.lang.Object objectValue();
            /** @deprecated */
            void objectSet(java.lang.Object val);
            org.apache.xmlbeans.SchemaType instanceType();
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Root.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("root0cb8attrtype");
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Root newValue(java.lang.Object obj) {
                  return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Root) type.newValue( obj ); }
                
                public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Root newInstance() {
                  return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Root) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Root newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Root) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML extension(@).
         *
         * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent$TemplateId$Extension.
         */
        public interface Extension extends uk.nhs.connect.iucds.ucr.St2
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEB085C7A72CF0D5D84903172D46F8E5B").resolveHandle("extensiona633attrtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum COCD_TP_146227_GB_02_SERVICE_EVENT = Enum.forString("COCD_TP146227GB02#ServiceEvent");
            
            static final int INT_COCD_TP_146227_GB_02_SERVICE_EVENT = Enum.INT_COCD_TP_146227_GB_02_SERVICE_EVENT;
            
            /**
             * Enumeration value class for uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent$TemplateId$Extension.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_COCD_TP_146227_GB_02_SERVICE_EVENT
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
                
                static final int INT_COCD_TP_146227_GB_02_SERVICE_EVENT = 1;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("COCD_TP146227GB02#ServiceEvent", INT_COCD_TP_146227_GB_02_SERVICE_EVENT),
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
                public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Extension newValue(java.lang.Object obj) {
                  return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Extension) type.newValue( obj ); }
                
                public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Extension newInstance() {
                  return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Extension newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId newInstance() {
              return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent.TemplateId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent newInstance() {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (uk.nhs.connect.iucds.ucr.COCDTP146227GB02ServiceEvent) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
