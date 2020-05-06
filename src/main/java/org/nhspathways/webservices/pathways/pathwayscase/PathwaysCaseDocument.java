/*
 * An XML document type.
 * Localname: PathwaysCase
 * Namespace: http://nhspathways.org/webservices/pathways/pathwaysCase
 * Java type: org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument
 *
 * Automatically generated - do not modify.
 */
package org.nhspathways.webservices.pathways.pathwayscase;


/**
 * A document containing one PathwaysCase(@http://nhspathways.org/webservices/pathways/pathwaysCase) element.
 *
 * This is a complex type.
 */
public interface PathwaysCaseDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathwaysCaseDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("pathwayscase1ee7doctype");
    
    /**
     * Gets the "PathwaysCase" element
     */
    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase getPathwaysCase();
    
    /**
     * Sets the "PathwaysCase" element
     */
    void setPathwaysCase(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase pathwaysCase);
    
    /**
     * Appends and returns a new empty "PathwaysCase" element
     */
    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase addNewPathwaysCase();
    
    /**
     * An XML PathwaysCase(@http://nhspathways.org/webservices/pathways/pathwaysCase).
     *
     * This is a complex type.
     */
    public interface PathwaysCase extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathwaysCase.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("pathwayscase6a7celemtype");
        
        /**
         * Gets the "dispositionOverrideCode" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode getDispositionOverrideCode();
        
        /**
         * True if has "dispositionOverrideCode" element
         */
        boolean isSetDispositionOverrideCode();
        
        /**
         * Sets the "dispositionOverrideCode" element
         */
        void setDispositionOverrideCode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode dispositionOverrideCode);
        
        /**
         * Appends and returns a new empty "dispositionOverrideCode" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode addNewDispositionOverrideCode();
        
        /**
         * Unsets the "dispositionOverrideCode" element
         */
        void unsetDispositionOverrideCode();
        
        /**
         * Gets the "appointment" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment getAppointment();
        
        /**
         * True if has "appointment" element
         */
        boolean isSetAppointment();
        
        /**
         * Sets the "appointment" element
         */
        void setAppointment(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment appointment);
        
        /**
         * Appends and returns a new empty "appointment" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment addNewAppointment();
        
        /**
         * Unsets the "appointment" element
         */
        void unsetAppointment();
        
        /**
         * Gets the "serviceDestination" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination getServiceDestination();
        
        /**
         * Sets the "serviceDestination" element
         */
        void setServiceDestination(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination serviceDestination);
        
        /**
         * Appends and returns a new empty "serviceDestination" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination addNewServiceDestination();
        
        /**
         * Gets the "messageStatus" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus.Enum getMessageStatus();
        
        /**
         * Gets (as xml) the "messageStatus" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus xgetMessageStatus();
        
        /**
         * Sets the "messageStatus" element
         */
        void setMessageStatus(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus.Enum messageStatus);
        
        /**
         * Sets (as xml) the "messageStatus" element
         */
        void xsetMessageStatus(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus messageStatus);
        
        /**
         * Gets the "caseReceiveStart" element
         */
        java.util.Calendar getCaseReceiveStart();
        
        /**
         * Gets (as xml) the "caseReceiveStart" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCaseReceiveStart();
        
        /**
         * Sets the "caseReceiveStart" element
         */
        void setCaseReceiveStart(java.util.Calendar caseReceiveStart);
        
        /**
         * Sets (as xml) the "caseReceiveStart" element
         */
        void xsetCaseReceiveStart(org.apache.xmlbeans.XmlDateTime caseReceiveStart);
        
        /**
         * Gets the "caseReceiveEnd" element
         */
        java.util.Calendar getCaseReceiveEnd();
        
        /**
         * Gets (as xml) the "caseReceiveEnd" element
         */
        org.apache.xmlbeans.XmlDateTime xgetCaseReceiveEnd();
        
        /**
         * True if has "caseReceiveEnd" element
         */
        boolean isSetCaseReceiveEnd();
        
        /**
         * Sets the "caseReceiveEnd" element
         */
        void setCaseReceiveEnd(java.util.Calendar caseReceiveEnd);
        
        /**
         * Sets (as xml) the "caseReceiveEnd" element
         */
        void xsetCaseReceiveEnd(org.apache.xmlbeans.XmlDateTime caseReceiveEnd);
        
        /**
         * Unsets the "caseReceiveEnd" element
         */
        void unsetCaseReceiveEnd();
        
        /**
         * Gets the "outcome" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome getOutcome();
        
        /**
         * True if has "outcome" element
         */
        boolean isSetOutcome();
        
        /**
         * Sets the "outcome" element
         */
        void setOutcome(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome outcome);
        
        /**
         * Appends and returns a new empty "outcome" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome addNewOutcome();
        
        /**
         * Unsets the "outcome" element
         */
        void unsetOutcome();
        
        /**
         * Gets the "caseDetails" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails getCaseDetails();
        
        /**
         * Sets the "caseDetails" element
         */
        void setCaseDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails caseDetails);
        
        /**
         * Appends and returns a new empty "caseDetails" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails addNewCaseDetails();
        
        /**
         * Gets the "patient" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient getPatient();
        
        /**
         * True if has "patient" element
         */
        boolean isSetPatient();
        
        /**
         * Sets the "patient" element
         */
        void setPatient(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient patient);
        
        /**
         * Appends and returns a new empty "patient" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient addNewPatient();
        
        /**
         * Unsets the "patient" element
         */
        void unsetPatient();
        
        /**
         * Gets the "returnPhone" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone getReturnPhone();
        
        /**
         * Sets the "returnPhone" element
         */
        void setReturnPhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone returnPhone);
        
        /**
         * Appends and returns a new empty "returnPhone" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone addNewReturnPhone();
        
        /**
         * Gets the "billingAddress" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress getBillingAddress();
        
        /**
         * True if has "billingAddress" element
         */
        boolean isSetBillingAddress();
        
        /**
         * Sets the "billingAddress" element
         */
        void setBillingAddress(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress billingAddress);
        
        /**
         * Appends and returns a new empty "billingAddress" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress addNewBillingAddress();
        
        /**
         * Unsets the "billingAddress" element
         */
        void unsetBillingAddress();
        
        /**
         * Gets the "pathwayDetails" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails getPathwayDetails();
        
        /**
         * True if has "pathwayDetails" element
         */
        boolean isSetPathwayDetails();
        
        /**
         * Sets the "pathwayDetails" element
         */
        void setPathwayDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails pathwayDetails);
        
        /**
         * Appends and returns a new empty "pathwayDetails" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails addNewPathwayDetails();
        
        /**
         * Unsets the "pathwayDetails" element
         */
        void unsetPathwayDetails();
        
        /**
         * Gets the "site" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site getSite();
        
        /**
         * Sets the "site" element
         */
        void setSite(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site site);
        
        /**
         * Appends and returns a new empty "site" element
         */
        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site addNewSite();
        
        /**
         * An XML dispositionOverrideCode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface DispositionOverrideCode extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DispositionOverrideCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("dispositionoverridecode4d60elemtype");
            
            /**
             * Gets the "code" element
             */
            java.lang.String getCode();
            
            /**
             * Gets (as xml) the "code" element
             */
            org.apache.xmlbeans.XmlString xgetCode();
            
            /**
             * Sets the "code" element
             */
            void setCode(java.lang.String code);
            
            /**
             * Sets (as xml) the "code" element
             */
            void xsetCode(org.apache.xmlbeans.XmlString code);
            
            /**
             * Gets the "reason" element
             */
            java.lang.String getReason();
            
            /**
             * Gets (as xml) the "reason" element
             */
            org.apache.xmlbeans.XmlString xgetReason();
            
            /**
             * True if has "reason" element
             */
            boolean isSetReason();
            
            /**
             * Sets the "reason" element
             */
            void setReason(java.lang.String reason);
            
            /**
             * Sets (as xml) the "reason" element
             */
            void xsetReason(org.apache.xmlbeans.XmlString reason);
            
            /**
             * Unsets the "reason" element
             */
            void unsetReason();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML appointment(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface Appointment extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Appointment.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("appointment6211elemtype");
            
            /**
             * Gets the "appointmentRef" element
             */
            java.lang.String getAppointmentRef();
            
            /**
             * Gets (as xml) the "appointmentRef" element
             */
            org.apache.xmlbeans.XmlString xgetAppointmentRef();
            
            /**
             * Sets the "appointmentRef" element
             */
            void setAppointmentRef(java.lang.String appointmentRef);
            
            /**
             * Sets (as xml) the "appointmentRef" element
             */
            void xsetAppointmentRef(org.apache.xmlbeans.XmlString appointmentRef);
            
            /**
             * Gets the "attributableDelay" element
             */
            boolean getAttributableDelay();
            
            /**
             * Gets (as xml) the "attributableDelay" element
             */
            org.apache.xmlbeans.XmlBoolean xgetAttributableDelay();
            
            /**
             * True if has "attributableDelay" element
             */
            boolean isSetAttributableDelay();
            
            /**
             * Sets the "attributableDelay" element
             */
            void setAttributableDelay(boolean attributableDelay);
            
            /**
             * Sets (as xml) the "attributableDelay" element
             */
            void xsetAttributableDelay(org.apache.xmlbeans.XmlBoolean attributableDelay);
            
            /**
             * Unsets the "attributableDelay" element
             */
            void unsetAttributableDelay();
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML serviceDestination(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface ServiceDestination extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ServiceDestination.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("servicedestinationb227elemtype");
            
            /**
             * Gets the "name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" element
             */
            org.apache.xmlbeans.XmlString xgetName();
            
            /**
             * True if has "name" element
             */
            boolean isSetName();
            
            /**
             * Sets the "name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" element
             */
            void xsetName(org.apache.xmlbeans.XmlString name);
            
            /**
             * Unsets the "name" element
             */
            void unsetName();
            
            /**
             * Gets the "code" element
             */
            java.lang.String getCode();
            
            /**
             * Gets (as xml) the "code" element
             */
            org.apache.xmlbeans.XmlString xgetCode();
            
            /**
             * Sets the "code" element
             */
            void setCode(java.lang.String code);
            
            /**
             * Sets (as xml) the "code" element
             */
            void xsetCode(org.apache.xmlbeans.XmlString code);
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML messageStatus(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$MessageStatus.
         */
        public interface MessageStatus extends org.apache.xmlbeans.XmlString
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MessageStatus.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("messagestatus6b97elemtype");
            
            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
            
            static final Enum PARTIAL_EXPECTING_UPDATE = Enum.forString("PartialExpectingUpdate");
            static final Enum COMPLETE = Enum.forString("Complete");
            
            static final int INT_PARTIAL_EXPECTING_UPDATE = Enum.INT_PARTIAL_EXPECTING_UPDATE;
            static final int INT_COMPLETE = Enum.INT_COMPLETE;
            
            /**
             * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$MessageStatus.
             * These enum values can be used as follows:
             * <pre>
             * enum.toString(); // returns the string value of the enum
             * enum.intValue(); // returns an int value, useful for switches
             * // e.g., case Enum.INT_PARTIAL_EXPECTING_UPDATE
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
                
                static final int INT_PARTIAL_EXPECTING_UPDATE = 1;
                static final int INT_COMPLETE = 2;
                
                public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                    new org.apache.xmlbeans.StringEnumAbstractBase.Table
                (
                    new Enum[]
                    {
                      new Enum("PartialExpectingUpdate", INT_PARTIAL_EXPECTING_UPDATE),
                      new Enum("Complete", INT_COMPLETE),
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
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus newValue(java.lang.Object obj) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus) type.newValue( obj ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML outcome(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface Outcome extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Outcome.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("outcome60feelemtype");
            
            /**
             * Gets the "title" element
             */
            java.lang.String getTitle();
            
            /**
             * Gets (as xml) the "title" element
             */
            org.apache.xmlbeans.XmlString xgetTitle();
            
            /**
             * True if has "title" element
             */
            boolean isSetTitle();
            
            /**
             * Sets the "title" element
             */
            void setTitle(java.lang.String title);
            
            /**
             * Sets (as xml) the "title" element
             */
            void xsetTitle(org.apache.xmlbeans.XmlString title);
            
            /**
             * Unsets the "title" element
             */
            void unsetTitle();
            
            /**
             * Gets the "code" element
             */
            java.lang.String getCode();
            
            /**
             * Gets (as xml) the "code" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code xgetCode();
            
            /**
             * Sets the "code" element
             */
            void setCode(java.lang.String code);
            
            /**
             * Sets (as xml) the "code" element
             */
            void xsetCode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code code);
            
            /**
             * An XML code(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Outcome$Code.
             */
            public interface Code extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Code.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("codeb395elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML caseDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface CaseDetails extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CaseDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("casedetails6f5eelemtype");
            
            /**
             * Gets the "caseRef" element
             */
            java.lang.String getCaseRef();
            
            /**
             * Gets (as xml) the "caseRef" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef xgetCaseRef();
            
            /**
             * Sets the "caseRef" element
             */
            void setCaseRef(java.lang.String caseRef);
            
            /**
             * Sets (as xml) the "caseRef" element
             */
            void xsetCaseRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef caseRef);
            
            /**
             * Gets the "caseId" element
             */
            java.lang.String getCaseId();
            
            /**
             * Gets (as xml) the "caseId" element
             */
            org.apache.xmlbeans.XmlString xgetCaseId();
            
            /**
             * True if has "caseId" element
             */
            boolean isSetCaseId();
            
            /**
             * Sets the "caseId" element
             */
            void setCaseId(java.lang.String caseId);
            
            /**
             * Sets (as xml) the "caseId" element
             */
            void xsetCaseId(org.apache.xmlbeans.XmlString caseId);
            
            /**
             * Unsets the "caseId" element
             */
            void unsetCaseId();
            
            /**
             * Gets the "address" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address getAddress();
            
            /**
             * True if has "address" element
             */
            boolean isSetAddress();
            
            /**
             * Sets the "address" element
             */
            void setAddress(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address address);
            
            /**
             * Appends and returns a new empty "address" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address addNewAddress();
            
            /**
             * Unsets the "address" element
             */
            void unsetAddress();
            
            /**
             * Gets the "condition" element
             */
            java.lang.String getCondition();
            
            /**
             * Gets (as xml) the "condition" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition xgetCondition();
            
            /**
             * Sets the "condition" element
             */
            void setCondition(java.lang.String condition);
            
            /**
             * Sets (as xml) the "condition" element
             */
            void xsetCondition(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition condition);
            
            /**
             * Gets the "contactDetails" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails getContactDetails();
            
            /**
             * Sets the "contactDetails" element
             */
            void setContactDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails contactDetails);
            
            /**
             * Appends and returns a new empty "contactDetails" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails addNewContactDetails();
            
            /**
             * An XML caseRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$CaseRef.
             */
            public interface CaseRef extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CaseRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("caseref050felemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML address(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface Address extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Address.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("addressf2feelemtype");
                
                /**
                 * Gets the "building" element
                 */
                java.lang.String getBuilding();
                
                /**
                 * Gets (as xml) the "building" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building xgetBuilding();
                
                /**
                 * Sets the "building" element
                 */
                void setBuilding(java.lang.String building);
                
                /**
                 * Sets (as xml) the "building" element
                 */
                void xsetBuilding(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building building);
                
                /**
                 * Gets the "street" element
                 */
                java.lang.String getStreet();
                
                /**
                 * Gets (as xml) the "street" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street xgetStreet();
                
                /**
                 * Sets the "street" element
                 */
                void setStreet(java.lang.String street);
                
                /**
                 * Sets (as xml) the "street" element
                 */
                void xsetStreet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street street);
                
                /**
                 * Gets the "locality" element
                 */
                java.lang.String getLocality();
                
                /**
                 * Gets (as xml) the "locality" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality xgetLocality();
                
                /**
                 * Sets the "locality" element
                 */
                void setLocality(java.lang.String locality);
                
                /**
                 * Sets (as xml) the "locality" element
                 */
                void xsetLocality(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality locality);
                
                /**
                 * Gets the "town" element
                 */
                java.lang.String getTown();
                
                /**
                 * Gets (as xml) the "town" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town xgetTown();
                
                /**
                 * Sets the "town" element
                 */
                void setTown(java.lang.String town);
                
                /**
                 * Sets (as xml) the "town" element
                 */
                void xsetTown(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town town);
                
                /**
                 * Gets the "county" element
                 */
                java.lang.String getCounty();
                
                /**
                 * Gets (as xml) the "county" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County xgetCounty();
                
                /**
                 * Sets the "county" element
                 */
                void setCounty(java.lang.String county);
                
                /**
                 * Sets (as xml) the "county" element
                 */
                void xsetCounty(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County county);
                
                /**
                 * Gets the "postcode" element
                 */
                java.lang.String getPostcode();
                
                /**
                 * Gets (as xml) the "postcode" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode xgetPostcode();
                
                /**
                 * Sets the "postcode" element
                 */
                void setPostcode(java.lang.String postcode);
                
                /**
                 * Sets (as xml) the "postcode" element
                 */
                void xsetPostcode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode postcode);
                
                /**
                 * Gets the "mapRef" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef getMapRef();
                
                /**
                 * True if has "mapRef" element
                 */
                boolean isSetMapRef();
                
                /**
                 * Sets the "mapRef" element
                 */
                void setMapRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef mapRef);
                
                /**
                 * Appends and returns a new empty "mapRef" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef addNewMapRef();
                
                /**
                 * Unsets the "mapRef" element
                 */
                void unsetMapRef();
                
                /**
                 * Gets the "country" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country getCountry();
                
                /**
                 * True if has "country" element
                 */
                boolean isSetCountry();
                
                /**
                 * Sets the "country" element
                 */
                void setCountry(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country country);
                
                /**
                 * Appends and returns a new empty "country" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country addNewCountry();
                
                /**
                 * Unsets the "country" element
                 */
                void unsetCountry();
                
                /**
                 * Gets the "directions" element
                 */
                java.lang.String getDirections();
                
                /**
                 * Gets (as xml) the "directions" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions xgetDirections();
                
                /**
                 * True if has "directions" element
                 */
                boolean isSetDirections();
                
                /**
                 * Sets the "directions" element
                 */
                void setDirections(java.lang.String directions);
                
                /**
                 * Sets (as xml) the "directions" element
                 */
                void xsetDirections(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions directions);
                
                /**
                 * Unsets the "directions" element
                 */
                void unsetDirections();
                
                /**
                 * An XML building(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Building.
                 */
                public interface Building extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Building.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("buildinga5aeelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML street(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Street.
                 */
                public interface Street extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Street.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("streetae7felemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML locality(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Locality.
                 */
                public interface Locality extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Locality.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("locality1b1felemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML town(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Town.
                 */
                public interface Town extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Town.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("town3210elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML county(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$County.
                 */
                public interface County extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(County.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("countyaa58elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML postcode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Postcode.
                 */
                public interface Postcode extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Postcode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("postcodee0b5elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML mapRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface MapRef extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MapRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("mapref466belemtype");
                    
                    /**
                     * Gets the "longitude" element
                     */
                    org.apache.xmlbeans.XmlObject getLongitude();
                    
                    /**
                     * True if has "longitude" element
                     */
                    boolean isSetLongitude();
                    
                    /**
                     * Sets the "longitude" element
                     */
                    void setLongitude(org.apache.xmlbeans.XmlObject longitude);
                    
                    /**
                     * Appends and returns a new empty "longitude" element
                     */
                    org.apache.xmlbeans.XmlObject addNewLongitude();
                    
                    /**
                     * Unsets the "longitude" element
                     */
                    void unsetLongitude();
                    
                    /**
                     * Gets the "latitude" element
                     */
                    org.apache.xmlbeans.XmlObject getLatitude();
                    
                    /**
                     * True if has "latitude" element
                     */
                    boolean isSetLatitude();
                    
                    /**
                     * Sets the "latitude" element
                     */
                    void setLatitude(org.apache.xmlbeans.XmlObject latitude);
                    
                    /**
                     * Appends and returns a new empty "latitude" element
                     */
                    org.apache.xmlbeans.XmlObject addNewLatitude();
                    
                    /**
                     * Unsets the "latitude" element
                     */
                    void unsetLatitude();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML country(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface Country extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Country.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("countryd2bcelemtype");
                    
                    /**
                     * Gets the "name" element
                     */
                    java.lang.String getName();
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    org.apache.xmlbeans.XmlString xgetName();
                    
                    /**
                     * Sets the "name" element
                     */
                    void setName(java.lang.String name);
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    void xsetName(org.apache.xmlbeans.XmlString name);
                    
                    /**
                     * Gets the "isoAlpha2" element
                     */
                    java.lang.String getIsoAlpha2();
                    
                    /**
                     * Gets (as xml) the "isoAlpha2" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 xgetIsoAlpha2();
                    
                    /**
                     * Sets the "isoAlpha2" element
                     */
                    void setIsoAlpha2(java.lang.String isoAlpha2);
                    
                    /**
                     * Sets (as xml) the "isoAlpha2" element
                     */
                    void xsetIsoAlpha2(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 isoAlpha2);
                    
                    /**
                     * An XML isoAlpha2(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Country$IsoAlpha2.
                     */
                    public interface IsoAlpha2 extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsoAlpha2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("isoalpha26077elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML directions(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Directions.
                 */
                public interface Directions extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Directions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("directionsd18eelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML condition(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Condition.
             */
            public interface Condition extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Condition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("condition9037elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML contactDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface ContactDetails extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ContactDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("contactdetails6980elemtype");
                
                /**
                 * Gets array of all "caller" elements
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller[] getCallerArray();
                
                /**
                 * Gets ith "caller" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller getCallerArray(int i);
                
                /**
                 * Returns number of "caller" element
                 */
                int sizeOfCallerArray();
                
                /**
                 * Sets array of all "caller" element
                 */
                void setCallerArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller[] callerArray);
                
                /**
                 * Sets ith "caller" element
                 */
                void setCallerArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller caller);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "caller" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller insertNewCaller(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "caller" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller addNewCaller();
                
                /**
                 * Removes the ith "caller" element
                 */
                void removeCaller(int i);
                
                /**
                 * Gets array of all "patientPhone" elements
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone[] getPatientPhoneArray();
                
                /**
                 * Gets ith "patientPhone" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone getPatientPhoneArray(int i);
                
                /**
                 * Returns number of "patientPhone" element
                 */
                int sizeOfPatientPhoneArray();
                
                /**
                 * Sets array of all "patientPhone" element
                 */
                void setPatientPhoneArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone[] patientPhoneArray);
                
                /**
                 * Sets ith "patientPhone" element
                 */
                void setPatientPhoneArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone patientPhone);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "patientPhone" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone insertNewPatientPhone(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "patientPhone" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone addNewPatientPhone();
                
                /**
                 * Removes the ith "patientPhone" element
                 */
                void removePatientPhone(int i);
                
                /**
                 * An XML caller(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface Caller extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Caller.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("callercc67elemtype");
                    
                    /**
                     * Gets the "name" element
                     */
                    java.lang.String getName();
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name xgetName();
                    
                    /**
                     * True if has "name" element
                     */
                    boolean isSetName();
                    
                    /**
                     * Sets the "name" element
                     */
                    void setName(java.lang.String name);
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    void xsetName(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name name);
                    
                    /**
                     * Unsets the "name" element
                     */
                    void unsetName();
                    
                    /**
                     * Gets the "phone" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone getPhone();
                    
                    /**
                     * True if has "phone" element
                     */
                    boolean isSetPhone();
                    
                    /**
                     * Sets the "phone" element
                     */
                    void setPhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone phone);
                    
                    /**
                     * Appends and returns a new empty "phone" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone addNewPhone();
                    
                    /**
                     * Unsets the "phone" element
                     */
                    void unsetPhone();
                    
                    /**
                     * An XML name(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Name.
                     */
                    public interface Name extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("namec460elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML phone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface Phone extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Phone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("phoneb54delemtype");
                      
                      /**
                       * Gets the "prefix" element
                       */
                      java.lang.String getPrefix();
                      
                      /**
                       * Gets (as xml) the "prefix" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix xgetPrefix();
                      
                      /**
                       * True if has "prefix" element
                       */
                      boolean isSetPrefix();
                      
                      /**
                       * Sets the "prefix" element
                       */
                      void setPrefix(java.lang.String prefix);
                      
                      /**
                       * Sets (as xml) the "prefix" element
                       */
                      void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix prefix);
                      
                      /**
                       * Unsets the "prefix" element
                       */
                      void unsetPrefix();
                      
                      /**
                       * Gets the "number" element
                       */
                      java.lang.String getNumber();
                      
                      /**
                       * Gets (as xml) the "number" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number xgetNumber();
                      
                      /**
                       * Sets the "number" element
                       */
                      void setNumber(java.lang.String number);
                      
                      /**
                       * Sets (as xml) the "number" element
                       */
                      void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number number);
                      
                      /**
                       * Gets the "extension" element
                       */
                      java.lang.String getExtension();
                      
                      /**
                       * Gets (as xml) the "extension" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension xgetExtension();
                      
                      /**
                       * True if has "extension" element
                       */
                      boolean isSetExtension();
                      
                      /**
                       * Sets the "extension" element
                       */
                      void setExtension(java.lang.String extension);
                      
                      /**
                       * Sets (as xml) the "extension" element
                       */
                      void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension extension);
                      
                      /**
                       * Unsets the "extension" element
                       */
                      void unsetExtension();
                      
                      /**
                       * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Phone$Prefix.
                       */
                      public interface Prefix extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prefix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("prefix9c5felemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix newValue(java.lang.Object obj) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix) type.newValue( obj ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Phone$Number.
                       */
                      public interface Number extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Number.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("numberf7c8elemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number newValue(java.lang.Object obj) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number) type.newValue( obj ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Phone$Extension.
                       */
                      public interface Extension extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("extension6042elemtype");
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension newValue(java.lang.Object obj) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension) type.newValue( obj ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML patientPhone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface PatientPhone extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PatientPhone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("patientphone4dc5elemtype");
                    
                    /**
                     * Gets the "prefix" element
                     */
                    java.lang.String getPrefix();
                    
                    /**
                     * Gets (as xml) the "prefix" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix xgetPrefix();
                    
                    /**
                     * True if has "prefix" element
                     */
                    boolean isSetPrefix();
                    
                    /**
                     * Sets the "prefix" element
                     */
                    void setPrefix(java.lang.String prefix);
                    
                    /**
                     * Sets (as xml) the "prefix" element
                     */
                    void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix prefix);
                    
                    /**
                     * Unsets the "prefix" element
                     */
                    void unsetPrefix();
                    
                    /**
                     * Gets the "number" element
                     */
                    java.lang.String getNumber();
                    
                    /**
                     * Gets (as xml) the "number" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number xgetNumber();
                    
                    /**
                     * Sets the "number" element
                     */
                    void setNumber(java.lang.String number);
                    
                    /**
                     * Sets (as xml) the "number" element
                     */
                    void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number number);
                    
                    /**
                     * Gets the "extension" element
                     */
                    java.lang.String getExtension();
                    
                    /**
                     * Gets (as xml) the "extension" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension xgetExtension();
                    
                    /**
                     * True if has "extension" element
                     */
                    boolean isSetExtension();
                    
                    /**
                     * Sets the "extension" element
                     */
                    void setExtension(java.lang.String extension);
                    
                    /**
                     * Sets (as xml) the "extension" element
                     */
                    void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension extension);
                    
                    /**
                     * Unsets the "extension" element
                     */
                    void unsetExtension();
                    
                    /**
                     * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$PatientPhone$Prefix.
                     */
                    public interface Prefix extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prefix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("prefixd157elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$PatientPhone$Number.
                     */
                    public interface Number extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Number.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("numberf300elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$PatientPhone$Extension.
                     */
                    public interface Extension extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("extension31faelemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML patient(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface Patient extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Patient.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("patient1bebelemtype");
            
            /**
             * Gets the "ref" element
             */
            java.lang.String getRef();
            
            /**
             * Gets (as xml) the "ref" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref xgetRef();
            
            /**
             * True if has "ref" element
             */
            boolean isSetRef();
            
            /**
             * Sets the "ref" element
             */
            void setRef(java.lang.String ref);
            
            /**
             * Sets (as xml) the "ref" element
             */
            void xsetRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref ref);
            
            /**
             * Unsets the "ref" element
             */
            void unsetRef();
            
            /**
             * Gets the "forename" element
             */
            java.lang.String getForename();
            
            /**
             * Gets (as xml) the "forename" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename xgetForename();
            
            /**
             * True if has "forename" element
             */
            boolean isSetForename();
            
            /**
             * Sets the "forename" element
             */
            void setForename(java.lang.String forename);
            
            /**
             * Sets (as xml) the "forename" element
             */
            void xsetForename(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename forename);
            
            /**
             * Unsets the "forename" element
             */
            void unsetForename();
            
            /**
             * Gets the "surname" element
             */
            java.lang.String getSurname();
            
            /**
             * Gets (as xml) the "surname" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname xgetSurname();
            
            /**
             * True if has "surname" element
             */
            boolean isSetSurname();
            
            /**
             * Sets the "surname" element
             */
            void setSurname(java.lang.String surname);
            
            /**
             * Sets (as xml) the "surname" element
             */
            void xsetSurname(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname surname);
            
            /**
             * Unsets the "surname" element
             */
            void unsetSurname();
            
            /**
             * Gets the "address" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address getAddress();
            
            /**
             * True if has "address" element
             */
            boolean isSetAddress();
            
            /**
             * Sets the "address" element
             */
            void setAddress(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address address);
            
            /**
             * Appends and returns a new empty "address" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address addNewAddress();
            
            /**
             * Unsets the "address" element
             */
            void unsetAddress();
            
            /**
             * Gets the "phone" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone getPhone();
            
            /**
             * True if has "phone" element
             */
            boolean isSetPhone();
            
            /**
             * Sets the "phone" element
             */
            void setPhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone phone);
            
            /**
             * Appends and returns a new empty "phone" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone addNewPhone();
            
            /**
             * Unsets the "phone" element
             */
            void unsetPhone();
            
            /**
             * Gets the "gender" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender.Enum getGender();
            
            /**
             * Gets (as xml) the "gender" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender xgetGender();
            
            /**
             * Sets the "gender" element
             */
            void setGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender.Enum gender);
            
            /**
             * Sets (as xml) the "gender" element
             */
            void xsetGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender gender);
            
            /**
             * Gets the "nationalNumber" element
             */
            java.lang.String getNationalNumber();
            
            /**
             * Gets (as xml) the "nationalNumber" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber xgetNationalNumber();
            
            /**
             * True if has "nationalNumber" element
             */
            boolean isSetNationalNumber();
            
            /**
             * Sets the "nationalNumber" element
             */
            void setNationalNumber(java.lang.String nationalNumber);
            
            /**
             * Sets (as xml) the "nationalNumber" element
             */
            void xsetNationalNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber nationalNumber);
            
            /**
             * Unsets the "nationalNumber" element
             */
            void unsetNationalNumber();
            
            /**
             * Gets the "providerDetails" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails getProviderDetails();
            
            /**
             * True if has "providerDetails" element
             */
            boolean isSetProviderDetails();
            
            /**
             * Sets the "providerDetails" element
             */
            void setProviderDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails providerDetails);
            
            /**
             * Appends and returns a new empty "providerDetails" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails addNewProviderDetails();
            
            /**
             * Unsets the "providerDetails" element
             */
            void unsetProviderDetails();
            
            /**
             * Gets the "dateOfBirth" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth getDateOfBirth();
            
            /**
             * True if has "dateOfBirth" element
             */
            boolean isSetDateOfBirth();
            
            /**
             * Sets the "dateOfBirth" element
             */
            void setDateOfBirth(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth dateOfBirth);
            
            /**
             * Appends and returns a new empty "dateOfBirth" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth addNewDateOfBirth();
            
            /**
             * Unsets the "dateOfBirth" element
             */
            void unsetDateOfBirth();
            
            /**
             * Gets the "mobilePhone" element
             */
            java.lang.String getMobilePhone();
            
            /**
             * Gets (as xml) the "mobilePhone" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone xgetMobilePhone();
            
            /**
             * True if has "mobilePhone" element
             */
            boolean isSetMobilePhone();
            
            /**
             * Sets the "mobilePhone" element
             */
            void setMobilePhone(java.lang.String mobilePhone);
            
            /**
             * Sets (as xml) the "mobilePhone" element
             */
            void xsetMobilePhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone mobilePhone);
            
            /**
             * Unsets the "mobilePhone" element
             */
            void unsetMobilePhone();
            
            /**
             * An XML ref(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Ref.
             */
            public interface Ref extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Ref.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("ref26ccelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML forename(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Forename.
             */
            public interface Forename extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Forename.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("forename0268elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML surname(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Surname.
             */
            public interface Surname extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Surname.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("surnameab84elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML address(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface Address extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Address.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("address6f8belemtype");
                
                /**
                 * Gets the "building" element
                 */
                java.lang.String getBuilding();
                
                /**
                 * Gets (as xml) the "building" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building xgetBuilding();
                
                /**
                 * Sets the "building" element
                 */
                void setBuilding(java.lang.String building);
                
                /**
                 * Sets (as xml) the "building" element
                 */
                void xsetBuilding(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building building);
                
                /**
                 * Gets the "street" element
                 */
                java.lang.String getStreet();
                
                /**
                 * Gets (as xml) the "street" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street xgetStreet();
                
                /**
                 * Sets the "street" element
                 */
                void setStreet(java.lang.String street);
                
                /**
                 * Sets (as xml) the "street" element
                 */
                void xsetStreet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street street);
                
                /**
                 * Gets the "locality" element
                 */
                java.lang.String getLocality();
                
                /**
                 * Gets (as xml) the "locality" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality xgetLocality();
                
                /**
                 * Sets the "locality" element
                 */
                void setLocality(java.lang.String locality);
                
                /**
                 * Sets (as xml) the "locality" element
                 */
                void xsetLocality(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality locality);
                
                /**
                 * Gets the "town" element
                 */
                java.lang.String getTown();
                
                /**
                 * Gets (as xml) the "town" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town xgetTown();
                
                /**
                 * Sets the "town" element
                 */
                void setTown(java.lang.String town);
                
                /**
                 * Sets (as xml) the "town" element
                 */
                void xsetTown(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town town);
                
                /**
                 * Gets the "county" element
                 */
                java.lang.String getCounty();
                
                /**
                 * Gets (as xml) the "county" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County xgetCounty();
                
                /**
                 * Sets the "county" element
                 */
                void setCounty(java.lang.String county);
                
                /**
                 * Sets (as xml) the "county" element
                 */
                void xsetCounty(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County county);
                
                /**
                 * Gets the "postcode" element
                 */
                java.lang.String getPostcode();
                
                /**
                 * Gets (as xml) the "postcode" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode xgetPostcode();
                
                /**
                 * Sets the "postcode" element
                 */
                void setPostcode(java.lang.String postcode);
                
                /**
                 * Sets (as xml) the "postcode" element
                 */
                void xsetPostcode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode postcode);
                
                /**
                 * Gets the "mapRef" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef getMapRef();
                
                /**
                 * True if has "mapRef" element
                 */
                boolean isSetMapRef();
                
                /**
                 * Sets the "mapRef" element
                 */
                void setMapRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef mapRef);
                
                /**
                 * Appends and returns a new empty "mapRef" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef addNewMapRef();
                
                /**
                 * Unsets the "mapRef" element
                 */
                void unsetMapRef();
                
                /**
                 * Gets the "country" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country getCountry();
                
                /**
                 * True if has "country" element
                 */
                boolean isSetCountry();
                
                /**
                 * Sets the "country" element
                 */
                void setCountry(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country country);
                
                /**
                 * Appends and returns a new empty "country" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country addNewCountry();
                
                /**
                 * Unsets the "country" element
                 */
                void unsetCountry();
                
                /**
                 * Gets the "directions" element
                 */
                java.lang.String getDirections();
                
                /**
                 * Gets (as xml) the "directions" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions xgetDirections();
                
                /**
                 * True if has "directions" element
                 */
                boolean isSetDirections();
                
                /**
                 * Sets the "directions" element
                 */
                void setDirections(java.lang.String directions);
                
                /**
                 * Sets (as xml) the "directions" element
                 */
                void xsetDirections(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions directions);
                
                /**
                 * Unsets the "directions" element
                 */
                void unsetDirections();
                
                /**
                 * An XML building(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Building.
                 */
                public interface Building extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Building.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("buildingfa3belemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML street(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Street.
                 */
                public interface Street extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Street.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("street138celemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML locality(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Locality.
                 */
                public interface Locality extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Locality.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("localityd02celemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML town(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Town.
                 */
                public interface Town extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Town.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("town079delemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML county(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$County.
                 */
                public interface County extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(County.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("countye3e5elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML postcode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Postcode.
                 */
                public interface Postcode extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Postcode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("postcoded0c2elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML mapRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface MapRef extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MapRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("mapref8178elemtype");
                    
                    /**
                     * Gets the "longitude" element
                     */
                    org.apache.xmlbeans.XmlObject getLongitude();
                    
                    /**
                     * True if has "longitude" element
                     */
                    boolean isSetLongitude();
                    
                    /**
                     * Sets the "longitude" element
                     */
                    void setLongitude(org.apache.xmlbeans.XmlObject longitude);
                    
                    /**
                     * Appends and returns a new empty "longitude" element
                     */
                    org.apache.xmlbeans.XmlObject addNewLongitude();
                    
                    /**
                     * Unsets the "longitude" element
                     */
                    void unsetLongitude();
                    
                    /**
                     * Gets the "latitude" element
                     */
                    org.apache.xmlbeans.XmlObject getLatitude();
                    
                    /**
                     * True if has "latitude" element
                     */
                    boolean isSetLatitude();
                    
                    /**
                     * Sets the "latitude" element
                     */
                    void setLatitude(org.apache.xmlbeans.XmlObject latitude);
                    
                    /**
                     * Appends and returns a new empty "latitude" element
                     */
                    org.apache.xmlbeans.XmlObject addNewLatitude();
                    
                    /**
                     * Unsets the "latitude" element
                     */
                    void unsetLatitude();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML country(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface Country extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Country.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("countryde49elemtype");
                    
                    /**
                     * Gets the "name" element
                     */
                    java.lang.String getName();
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    org.apache.xmlbeans.XmlString xgetName();
                    
                    /**
                     * Sets the "name" element
                     */
                    void setName(java.lang.String name);
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    void xsetName(org.apache.xmlbeans.XmlString name);
                    
                    /**
                     * Gets the "isoAlpha2" element
                     */
                    java.lang.String getIsoAlpha2();
                    
                    /**
                     * Gets (as xml) the "isoAlpha2" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 xgetIsoAlpha2();
                    
                    /**
                     * True if has "isoAlpha2" element
                     */
                    boolean isSetIsoAlpha2();
                    
                    /**
                     * Sets the "isoAlpha2" element
                     */
                    void setIsoAlpha2(java.lang.String isoAlpha2);
                    
                    /**
                     * Sets (as xml) the "isoAlpha2" element
                     */
                    void xsetIsoAlpha2(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 isoAlpha2);
                    
                    /**
                     * Unsets the "isoAlpha2" element
                     */
                    void unsetIsoAlpha2();
                    
                    /**
                     * An XML isoAlpha2(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Country$IsoAlpha2.
                     */
                    public interface IsoAlpha2 extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsoAlpha2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("isoalpha28184elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML directions(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Directions.
                 */
                public interface Directions extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Directions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("directions161belemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML phone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface Phone extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Phone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("phone7b51elemtype");
                
                /**
                 * Gets the "prefix" element
                 */
                java.lang.String getPrefix();
                
                /**
                 * Gets (as xml) the "prefix" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix xgetPrefix();
                
                /**
                 * True if has "prefix" element
                 */
                boolean isSetPrefix();
                
                /**
                 * Sets the "prefix" element
                 */
                void setPrefix(java.lang.String prefix);
                
                /**
                 * Sets (as xml) the "prefix" element
                 */
                void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix prefix);
                
                /**
                 * Unsets the "prefix" element
                 */
                void unsetPrefix();
                
                /**
                 * Gets the "number" element
                 */
                java.lang.String getNumber();
                
                /**
                 * Gets (as xml) the "number" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number xgetNumber();
                
                /**
                 * Sets the "number" element
                 */
                void setNumber(java.lang.String number);
                
                /**
                 * Sets (as xml) the "number" element
                 */
                void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number number);
                
                /**
                 * Gets the "extension" element
                 */
                java.lang.String getExtension();
                
                /**
                 * Gets (as xml) the "extension" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension xgetExtension();
                
                /**
                 * True if has "extension" element
                 */
                boolean isSetExtension();
                
                /**
                 * Sets the "extension" element
                 */
                void setExtension(java.lang.String extension);
                
                /**
                 * Sets (as xml) the "extension" element
                 */
                void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension extension);
                
                /**
                 * Unsets the "extension" element
                 */
                void unsetExtension();
                
                /**
                 * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Phone$Prefix.
                 */
                public interface Prefix extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prefix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("prefixade3elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Phone$Number.
                 */
                public interface Number extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Number.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("numberb70celemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Phone$Extension.
                 */
                public interface Extension extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("extension5106elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML gender(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Gender.
             */
            public interface Gender extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gender.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("genderba2eelemtype");
                
                org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                
                static final Enum MALE = Enum.forString("Male");
                static final Enum FEMALE = Enum.forString("Female");
                static final Enum UNKNOWN = Enum.forString("Unknown");
                static final Enum NOT_SPECIFIED = Enum.forString("Not Specified");
                
                static final int INT_MALE = Enum.INT_MALE;
                static final int INT_FEMALE = Enum.INT_FEMALE;
                static final int INT_UNKNOWN = Enum.INT_UNKNOWN;
                static final int INT_NOT_SPECIFIED = Enum.INT_NOT_SPECIFIED;
                
                /**
                 * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Gender.
                 * These enum values can be used as follows:
                 * <pre>
                 * enum.toString(); // returns the string value of the enum
                 * enum.intValue(); // returns an int value, useful for switches
                 * // e.g., case Enum.INT_MALE
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
                    
                    static final int INT_MALE = 1;
                    static final int INT_FEMALE = 2;
                    static final int INT_UNKNOWN = 3;
                    static final int INT_NOT_SPECIFIED = 4;
                    
                    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                        new org.apache.xmlbeans.StringEnumAbstractBase.Table
                    (
                      new Enum[]
                      {
                        new Enum("Male", INT_MALE),
                        new Enum("Female", INT_FEMALE),
                        new Enum("Unknown", INT_UNKNOWN),
                        new Enum("Not Specified", INT_NOT_SPECIFIED),
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
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML nationalNumber(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$NationalNumber.
             */
            public interface NationalNumber extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NationalNumber.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("nationalnumber3894elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML providerDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface ProviderDetails extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProviderDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("providerdetails500eelemtype");
                
                /**
                 * Gets the "provider" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider getProvider();
                
                /**
                 * True if has "provider" element
                 */
                boolean isSetProvider();
                
                /**
                 * Sets the "provider" element
                 */
                void setProvider(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider provider);
                
                /**
                 * Appends and returns a new empty "provider" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider addNewProvider();
                
                /**
                 * Unsets the "provider" element
                 */
                void unsetProvider();
                
                /**
                 * Gets the "providerGroup" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup getProviderGroup();
                
                /**
                 * Sets the "providerGroup" element
                 */
                void setProviderGroup(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup providerGroup);
                
                /**
                 * Appends and returns a new empty "providerGroup" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup addNewProviderGroup();
                
                /**
                 * Gets the "type" attribute
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type.Enum getType();
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type xgetType();
                
                /**
                 * Sets the "type" attribute
                 */
                void setType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type.Enum type);
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                void xsetType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type type);
                
                /**
                 * An XML provider(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface Provider extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Provider.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("provider8861elemtype");
                    
                    /**
                     * Gets the "name" element
                     */
                    java.lang.String getName();
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    org.apache.xmlbeans.XmlString xgetName();
                    
                    /**
                     * Sets the "name" element
                     */
                    void setName(java.lang.String name);
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    void xsetName(org.apache.xmlbeans.XmlString name);
                    
                    /**
                     * Gets the "id" element
                     */
                    java.lang.String getId();
                    
                    /**
                     * Gets (as xml) the "id" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id xgetId();
                    
                    /**
                     * Sets the "id" element
                     */
                    void setId(java.lang.String id);
                    
                    /**
                     * Sets (as xml) the "id" element
                     */
                    void xsetId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id id);
                    
                    /**
                     * An XML id(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$ProviderDetails$Provider$Id.
                     */
                    public interface Id extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("ide9d8elemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML providerGroup(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface ProviderGroup extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ProviderGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("providergroupd454elemtype");
                    
                    /**
                     * Gets the "name" element
                     */
                    java.lang.String getName();
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    org.apache.xmlbeans.XmlString xgetName();
                    
                    /**
                     * Sets the "name" element
                     */
                    void setName(java.lang.String name);
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    void xsetName(org.apache.xmlbeans.XmlString name);
                    
                    /**
                     * Gets the "id" element
                     */
                    java.lang.String getId();
                    
                    /**
                     * Gets (as xml) the "id" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id xgetId();
                    
                    /**
                     * Sets the "id" element
                     */
                    void setId(java.lang.String id);
                    
                    /**
                     * Sets (as xml) the "id" element
                     */
                    void xsetId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id id);
                    
                    /**
                     * An XML id(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$ProviderDetails$ProviderGroup$Id.
                     */
                    public interface Id extends org.apache.xmlbeans.XmlString
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("idc53delemtype");
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id newValue(java.lang.Object obj) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id) type.newValue( obj ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML type(@).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$ProviderDetails$Type.
                 */
                public interface Type extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("type9c74attrtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum DOCTOR = Enum.forString("DOCTOR");
                    
                    static final int INT_DOCTOR = Enum.INT_DOCTOR;
                    
                    /**
                     * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$ProviderDetails$Type.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_DOCTOR
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
                      
                      static final int INT_DOCTOR = 1;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("DOCTOR", INT_DOCTOR),
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
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML dateOfBirth(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface DateOfBirth extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DateOfBirth.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("dateofbirthaea5elemtype");
                
                /**
                 * Gets the "dob" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob getDob();
                
                /**
                 * True if has "dob" element
                 */
                boolean isSetDob();
                
                /**
                 * Sets the "dob" element
                 */
                void setDob(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob dob);
                
                /**
                 * Appends and returns a new empty "dob" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob addNewDob();
                
                /**
                 * Unsets the "dob" element
                 */
                void unsetDob();
                
                /**
                 * Gets the "age" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age getAge();
                
                /**
                 * True if has "age" element
                 */
                boolean isSetAge();
                
                /**
                 * Sets the "age" element
                 */
                void setAge(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age age);
                
                /**
                 * Appends and returns a new empty "age" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age addNewAge();
                
                /**
                 * Unsets the "age" element
                 */
                void unsetAge();
                
                /**
                 * An XML dob(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$DateOfBirth$Dob.
                 */
                public interface Dob extends org.apache.xmlbeans.XmlDate
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Dob.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("dob22a2elemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML age(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface Age extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Age.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("age85daelemtype");
                    
                    /**
                     * Gets the "years" element
                     */
                    int getYears();
                    
                    /**
                     * Gets (as xml) the "years" element
                     */
                    org.apache.xmlbeans.XmlInt xgetYears();
                    
                    /**
                     * Sets the "years" element
                     */
                    void setYears(int years);
                    
                    /**
                     * Sets (as xml) the "years" element
                     */
                    void xsetYears(org.apache.xmlbeans.XmlInt years);
                    
                    /**
                     * Gets the "months" element
                     */
                    int getMonths();
                    
                    /**
                     * Gets (as xml) the "months" element
                     */
                    org.apache.xmlbeans.XmlInt xgetMonths();
                    
                    /**
                     * True if has "months" element
                     */
                    boolean isSetMonths();
                    
                    /**
                     * Sets the "months" element
                     */
                    void setMonths(int months);
                    
                    /**
                     * Sets (as xml) the "months" element
                     */
                    void xsetMonths(org.apache.xmlbeans.XmlInt months);
                    
                    /**
                     * Unsets the "months" element
                     */
                    void unsetMonths();
                    
                    /**
                     * Gets the "days" element
                     */
                    int getDays();
                    
                    /**
                     * Gets (as xml) the "days" element
                     */
                    org.apache.xmlbeans.XmlInt xgetDays();
                    
                    /**
                     * True if has "days" element
                     */
                    boolean isSetDays();
                    
                    /**
                     * Sets the "days" element
                     */
                    void setDays(int days);
                    
                    /**
                     * Sets (as xml) the "days" element
                     */
                    void xsetDays(org.apache.xmlbeans.XmlInt days);
                    
                    /**
                     * Unsets the "days" element
                     */
                    void unsetDays();
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML mobilePhone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$MobilePhone.
             */
            public interface MobilePhone extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MobilePhone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("mobilephone8c93elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML returnPhone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface ReturnPhone extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReturnPhone.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("returnphone08b2elemtype");
            
            /**
             * Gets the "prefix" element
             */
            java.lang.String getPrefix();
            
            /**
             * Gets (as xml) the "prefix" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix xgetPrefix();
            
            /**
             * True if has "prefix" element
             */
            boolean isSetPrefix();
            
            /**
             * Sets the "prefix" element
             */
            void setPrefix(java.lang.String prefix);
            
            /**
             * Sets (as xml) the "prefix" element
             */
            void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix prefix);
            
            /**
             * Unsets the "prefix" element
             */
            void unsetPrefix();
            
            /**
             * Gets the "number" element
             */
            java.lang.String getNumber();
            
            /**
             * Gets (as xml) the "number" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number xgetNumber();
            
            /**
             * Sets the "number" element
             */
            void setNumber(java.lang.String number);
            
            /**
             * Sets (as xml) the "number" element
             */
            void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number number);
            
            /**
             * Gets the "extension" element
             */
            java.lang.String getExtension();
            
            /**
             * Gets (as xml) the "extension" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension xgetExtension();
            
            /**
             * True if has "extension" element
             */
            boolean isSetExtension();
            
            /**
             * Sets the "extension" element
             */
            void setExtension(java.lang.String extension);
            
            /**
             * Sets (as xml) the "extension" element
             */
            void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension extension);
            
            /**
             * Unsets the "extension" element
             */
            void unsetExtension();
            
            /**
             * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$ReturnPhone$Prefix.
             */
            public interface Prefix extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Prefix.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("prefix5444elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$ReturnPhone$Number.
             */
            public interface Number extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Number.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("number59edelemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$ReturnPhone$Extension.
             */
            public interface Extension extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Extension.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("extension00e7elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML billingAddress(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface BillingAddress extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BillingAddress.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("billingaddress5b47elemtype");
            
            /**
             * Gets the "building" element
             */
            java.lang.String getBuilding();
            
            /**
             * Gets (as xml) the "building" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building xgetBuilding();
            
            /**
             * Sets the "building" element
             */
            void setBuilding(java.lang.String building);
            
            /**
             * Sets (as xml) the "building" element
             */
            void xsetBuilding(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building building);
            
            /**
             * Gets the "street" element
             */
            java.lang.String getStreet();
            
            /**
             * Gets (as xml) the "street" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street xgetStreet();
            
            /**
             * Sets the "street" element
             */
            void setStreet(java.lang.String street);
            
            /**
             * Sets (as xml) the "street" element
             */
            void xsetStreet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street street);
            
            /**
             * Gets the "locality" element
             */
            java.lang.String getLocality();
            
            /**
             * Gets (as xml) the "locality" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality xgetLocality();
            
            /**
             * Sets the "locality" element
             */
            void setLocality(java.lang.String locality);
            
            /**
             * Sets (as xml) the "locality" element
             */
            void xsetLocality(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality locality);
            
            /**
             * Gets the "town" element
             */
            java.lang.String getTown();
            
            /**
             * Gets (as xml) the "town" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town xgetTown();
            
            /**
             * Sets the "town" element
             */
            void setTown(java.lang.String town);
            
            /**
             * Sets (as xml) the "town" element
             */
            void xsetTown(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town town);
            
            /**
             * Gets the "county" element
             */
            java.lang.String getCounty();
            
            /**
             * Gets (as xml) the "county" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County xgetCounty();
            
            /**
             * Sets the "county" element
             */
            void setCounty(java.lang.String county);
            
            /**
             * Sets (as xml) the "county" element
             */
            void xsetCounty(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County county);
            
            /**
             * Gets the "postcode" element
             */
            java.lang.String getPostcode();
            
            /**
             * Gets (as xml) the "postcode" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode xgetPostcode();
            
            /**
             * Sets the "postcode" element
             */
            void setPostcode(java.lang.String postcode);
            
            /**
             * Sets (as xml) the "postcode" element
             */
            void xsetPostcode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode postcode);
            
            /**
             * Gets the "mapRef" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef getMapRef();
            
            /**
             * True if has "mapRef" element
             */
            boolean isSetMapRef();
            
            /**
             * Sets the "mapRef" element
             */
            void setMapRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef mapRef);
            
            /**
             * Appends and returns a new empty "mapRef" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef addNewMapRef();
            
            /**
             * Unsets the "mapRef" element
             */
            void unsetMapRef();
            
            /**
             * Gets the "country" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country getCountry();
            
            /**
             * True if has "country" element
             */
            boolean isSetCountry();
            
            /**
             * Sets the "country" element
             */
            void setCountry(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country country);
            
            /**
             * Appends and returns a new empty "country" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country addNewCountry();
            
            /**
             * Unsets the "country" element
             */
            void unsetCountry();
            
            /**
             * Gets the "directions" element
             */
            java.lang.String getDirections();
            
            /**
             * Gets (as xml) the "directions" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions xgetDirections();
            
            /**
             * True if has "directions" element
             */
            boolean isSetDirections();
            
            /**
             * Sets the "directions" element
             */
            void setDirections(java.lang.String directions);
            
            /**
             * Sets (as xml) the "directions" element
             */
            void xsetDirections(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions directions);
            
            /**
             * Unsets the "directions" element
             */
            void unsetDirections();
            
            /**
             * An XML building(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Building.
             */
            public interface Building extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Building.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("building4e97elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML street(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Street.
             */
            public interface Street extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Street.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("street1ee6elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML locality(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Locality.
             */
            public interface Locality extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Locality.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("localitya646elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML town(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Town.
             */
            public interface Town extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Town.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("town0c75elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML county(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$County.
             */
            public interface County extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(County.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("countyd52delemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML postcode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Postcode.
             */
            public interface Postcode extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Postcode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("postcode5d70elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML mapRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface MapRef extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MapRef.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("mapref587aelemtype");
                
                /**
                 * Gets the "longitude" element
                 */
                org.apache.xmlbeans.XmlObject getLongitude();
                
                /**
                 * True if has "longitude" element
                 */
                boolean isSetLongitude();
                
                /**
                 * Sets the "longitude" element
                 */
                void setLongitude(org.apache.xmlbeans.XmlObject longitude);
                
                /**
                 * Appends and returns a new empty "longitude" element
                 */
                org.apache.xmlbeans.XmlObject addNewLongitude();
                
                /**
                 * Unsets the "longitude" element
                 */
                void unsetLongitude();
                
                /**
                 * Gets the "latitude" element
                 */
                org.apache.xmlbeans.XmlObject getLatitude();
                
                /**
                 * True if has "latitude" element
                 */
                boolean isSetLatitude();
                
                /**
                 * Sets the "latitude" element
                 */
                void setLatitude(org.apache.xmlbeans.XmlObject latitude);
                
                /**
                 * Appends and returns a new empty "latitude" element
                 */
                org.apache.xmlbeans.XmlObject addNewLatitude();
                
                /**
                 * Unsets the "latitude" element
                 */
                void unsetLatitude();
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML country(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface Country extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Country.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("country9549elemtype");
                
                /**
                 * Gets the "name" element
                 */
                java.lang.String getName();
                
                /**
                 * Gets (as xml) the "name" element
                 */
                org.apache.xmlbeans.XmlString xgetName();
                
                /**
                 * Sets the "name" element
                 */
                void setName(java.lang.String name);
                
                /**
                 * Sets (as xml) the "name" element
                 */
                void xsetName(org.apache.xmlbeans.XmlString name);
                
                /**
                 * Gets the "isoAlpha2" element
                 */
                java.lang.String getIsoAlpha2();
                
                /**
                 * Gets (as xml) the "isoAlpha2" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 xgetIsoAlpha2();
                
                /**
                 * Sets the "isoAlpha2" element
                 */
                void setIsoAlpha2(java.lang.String isoAlpha2);
                
                /**
                 * Sets (as xml) the "isoAlpha2" element
                 */
                void xsetIsoAlpha2(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 isoAlpha2);
                
                /**
                 * An XML isoAlpha2(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Country$IsoAlpha2.
                 */
                public interface IsoAlpha2 extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(IsoAlpha2.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("isoalpha233eeelemtype");
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML directions(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Directions.
             */
            public interface Directions extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Directions.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("directionsbeb7elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML pathwayDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface PathwayDetails extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathwayDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("pathwaydetails1f28elemtype");
            
            /**
             * Gets the "pathwayTriageDetails" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails getPathwayTriageDetails();
            
            /**
             * Sets the "pathwayTriageDetails" element
             */
            void setPathwayTriageDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails pathwayTriageDetails);
            
            /**
             * Appends and returns a new empty "pathwayTriageDetails" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails addNewPathwayTriageDetails();
            
            /**
             * Gets the "demographics" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics getDemographics();
            
            /**
             * Sets the "demographics" element
             */
            void setDemographics(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics demographics);
            
            /**
             * Appends and returns a new empty "demographics" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics addNewDemographics();
            
            /**
             * Gets the "sharedCaseId" element
             */
            java.lang.String getSharedCaseId();
            
            /**
             * Gets (as xml) the "sharedCaseId" element
             */
            org.apache.xmlbeans.XmlString xgetSharedCaseId();
            
            /**
             * Sets the "sharedCaseId" element
             */
            void setSharedCaseId(java.lang.String sharedCaseId);
            
            /**
             * Sets (as xml) the "sharedCaseId" element
             */
            void xsetSharedCaseId(org.apache.xmlbeans.XmlString sharedCaseId);
            
            /**
             * An XML pathwayTriageDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface PathwayTriageDetails extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathwayTriageDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("pathwaytriagedetailsb368elemtype");
                
                /**
                 * Gets array of all "pathwayTriage" elements
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage[] getPathwayTriageArray();
                
                /**
                 * Gets ith "pathwayTriage" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage getPathwayTriageArray(int i);
                
                /**
                 * Returns number of "pathwayTriage" element
                 */
                int sizeOfPathwayTriageArray();
                
                /**
                 * Sets array of all "pathwayTriage" element
                 */
                void setPathwayTriageArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage[] pathwayTriageArray);
                
                /**
                 * Sets ith "pathwayTriage" element
                 */
                void setPathwayTriageArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage pathwayTriage);
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "pathwayTriage" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage insertNewPathwayTriage(int i);
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "pathwayTriage" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage addNewPathwayTriage();
                
                /**
                 * Removes the ith "pathwayTriage" element
                 */
                void removePathwayTriage(int i);
                
                /**
                 * An XML pathwayTriage(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public interface PathwayTriage extends org.apache.xmlbeans.XmlObject
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathwayTriage.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("pathwaytriage46feelemtype");
                    
                    /**
                     * Gets the "start" element
                     */
                    java.util.Calendar getStart();
                    
                    /**
                     * Gets (as xml) the "start" element
                     */
                    org.apache.xmlbeans.XmlDateTime xgetStart();
                    
                    /**
                     * Sets the "start" element
                     */
                    void setStart(java.util.Calendar start);
                    
                    /**
                     * Sets (as xml) the "start" element
                     */
                    void xsetStart(org.apache.xmlbeans.XmlDateTime start);
                    
                    /**
                     * Gets the "finish" element
                     */
                    java.util.Calendar getFinish();
                    
                    /**
                     * Gets (as xml) the "finish" element
                     */
                    org.apache.xmlbeans.XmlDateTime xgetFinish();
                    
                    /**
                     * True if has "finish" element
                     */
                    boolean isSetFinish();
                    
                    /**
                     * Sets the "finish" element
                     */
                    void setFinish(java.util.Calendar finish);
                    
                    /**
                     * Sets (as xml) the "finish" element
                     */
                    void xsetFinish(org.apache.xmlbeans.XmlDateTime finish);
                    
                    /**
                     * Unsets the "finish" element
                     */
                    void unsetFinish();
                    
                    /**
                     * Gets the "triageDisposition" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition getTriageDisposition();
                    
                    /**
                     * True if has "triageDisposition" element
                     */
                    boolean isSetTriageDisposition();
                    
                    /**
                     * Sets the "triageDisposition" element
                     */
                    void setTriageDisposition(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition triageDisposition);
                    
                    /**
                     * Appends and returns a new empty "triageDisposition" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition addNewTriageDisposition();
                    
                    /**
                     * Unsets the "triageDisposition" element
                     */
                    void unsetTriageDisposition();
                    
                    /**
                     * Gets the "finalDisposition" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition getFinalDisposition();
                    
                    /**
                     * True if has "finalDisposition" element
                     */
                    boolean isSetFinalDisposition();
                    
                    /**
                     * Sets the "finalDisposition" element
                     */
                    void setFinalDisposition(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition finalDisposition);
                    
                    /**
                     * Appends and returns a new empty "finalDisposition" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition addNewFinalDisposition();
                    
                    /**
                     * Unsets the "finalDisposition" element
                     */
                    void unsetFinalDisposition();
                    
                    /**
                     * Gets the "transferCodeDetails" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails getTransferCodeDetails();
                    
                    /**
                     * True if has "transferCodeDetails" element
                     */
                    boolean isSetTransferCodeDetails();
                    
                    /**
                     * Sets the "transferCodeDetails" element
                     */
                    void setTransferCodeDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails transferCodeDetails);
                    
                    /**
                     * Appends and returns a new empty "transferCodeDetails" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails addNewTransferCodeDetails();
                    
                    /**
                     * Unsets the "transferCodeDetails" element
                     */
                    void unsetTransferCodeDetails();
                    
                    /**
                     * Gets the "systemFlags" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags getSystemFlags();
                    
                    /**
                     * True if has "systemFlags" element
                     */
                    boolean isSetSystemFlags();
                    
                    /**
                     * Sets the "systemFlags" element
                     */
                    void setSystemFlags(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags systemFlags);
                    
                    /**
                     * Appends and returns a new empty "systemFlags" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags addNewSystemFlags();
                    
                    /**
                     * Unsets the "systemFlags" element
                     */
                    void unsetSystemFlags();
                    
                    /**
                     * Gets the "user" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User getUser();
                    
                    /**
                     * Sets the "user" element
                     */
                    void setUser(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User user);
                    
                    /**
                     * Appends and returns a new empty "user" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User addNewUser();
                    
                    /**
                     * Gets the "triageLineDetails" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails getTriageLineDetails();
                    
                    /**
                     * True if has "triageLineDetails" element
                     */
                    boolean isSetTriageLineDetails();
                    
                    /**
                     * Sets the "triageLineDetails" element
                     */
                    void setTriageLineDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails triageLineDetails);
                    
                    /**
                     * Appends and returns a new empty "triageLineDetails" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails addNewTriageLineDetails();
                    
                    /**
                     * Unsets the "triageLineDetails" element
                     */
                    void unsetTriageLineDetails();
                    
                    /**
                     * Gets the "origSite" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite getOrigSite();
                    
                    /**
                     * Sets the "origSite" element
                     */
                    void setOrigSite(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite origSite);
                    
                    /**
                     * Appends and returns a new empty "origSite" element
                     */
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite addNewOrigSite();
                    
                    /**
                     * Gets the "callerIsPatient" element
                     */
                    boolean getCallerIsPatient();
                    
                    /**
                     * Gets (as xml) the "callerIsPatient" element
                     */
                    org.apache.xmlbeans.XmlBoolean xgetCallerIsPatient();
                    
                    /**
                     * Sets the "callerIsPatient" element
                     */
                    void setCallerIsPatient(boolean callerIsPatient);
                    
                    /**
                     * Sets (as xml) the "callerIsPatient" element
                     */
                    void xsetCallerIsPatient(org.apache.xmlbeans.XmlBoolean callerIsPatient);
                    
                    /**
                     * An XML triageDisposition(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface TriageDisposition extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriageDisposition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("triagedispositiona90felemtype");
                      
                      /**
                       * Gets the "initialDispCode" element
                       */
                      java.lang.String getInitialDispCode();
                      
                      /**
                       * Gets (as xml) the "initialDispCode" element
                       */
                      org.apache.xmlbeans.XmlString xgetInitialDispCode();
                      
                      /**
                       * Sets the "initialDispCode" element
                       */
                      void setInitialDispCode(java.lang.String initialDispCode);
                      
                      /**
                       * Sets (as xml) the "initialDispCode" element
                       */
                      void xsetInitialDispCode(org.apache.xmlbeans.XmlString initialDispCode);
                      
                      /**
                       * Gets the "initialDispText" element
                       */
                      java.lang.String getInitialDispText();
                      
                      /**
                       * Gets (as xml) the "initialDispText" element
                       */
                      org.apache.xmlbeans.XmlString xgetInitialDispText();
                      
                      /**
                       * Sets the "initialDispText" element
                       */
                      void setInitialDispText(java.lang.String initialDispText);
                      
                      /**
                       * Sets (as xml) the "initialDispText" element
                       */
                      void xsetInitialDispText(org.apache.xmlbeans.XmlString initialDispText);
                      
                      /**
                       * Gets the "timeReached" element
                       */
                      java.util.Calendar getTimeReached();
                      
                      /**
                       * Gets (as xml) the "timeReached" element
                       */
                      org.apache.xmlbeans.XmlDateTime xgetTimeReached();
                      
                      /**
                       * Sets the "timeReached" element
                       */
                      void setTimeReached(java.util.Calendar timeReached);
                      
                      /**
                       * Sets (as xml) the "timeReached" element
                       */
                      void xsetTimeReached(org.apache.xmlbeans.XmlDateTime timeReached);
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML finalDisposition(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface FinalDisposition extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(FinalDisposition.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("finaldisposition5461elemtype");
                      
                      /**
                       * Gets the "finalDispCode" element
                       */
                      java.lang.String getFinalDispCode();
                      
                      /**
                       * Gets (as xml) the "finalDispCode" element
                       */
                      org.apache.xmlbeans.XmlString xgetFinalDispCode();
                      
                      /**
                       * Sets the "finalDispCode" element
                       */
                      void setFinalDispCode(java.lang.String finalDispCode);
                      
                      /**
                       * Sets (as xml) the "finalDispCode" element
                       */
                      void xsetFinalDispCode(org.apache.xmlbeans.XmlString finalDispCode);
                      
                      /**
                       * Gets the "finalDisptext" element
                       */
                      java.lang.String getFinalDisptext();
                      
                      /**
                       * Gets (as xml) the "finalDisptext" element
                       */
                      org.apache.xmlbeans.XmlString xgetFinalDisptext();
                      
                      /**
                       * Sets the "finalDisptext" element
                       */
                      void setFinalDisptext(java.lang.String finalDisptext);
                      
                      /**
                       * Sets (as xml) the "finalDisptext" element
                       */
                      void xsetFinalDisptext(org.apache.xmlbeans.XmlString finalDisptext);
                      
                      /**
                       * Gets the "override" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override.Enum getOverride();
                      
                      /**
                       * Gets (as xml) the "override" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override xgetOverride();
                      
                      /**
                       * True if has "override" element
                       */
                      boolean isSetOverride();
                      
                      /**
                       * Sets the "override" element
                       */
                      void setOverride(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override.Enum override);
                      
                      /**
                       * Sets (as xml) the "override" element
                       */
                      void xsetOverride(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override override);
                      
                      /**
                       * Unsets the "override" element
                       */
                      void unsetOverride();
                      
                      /**
                       * An XML override(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$FinalDisposition$Override.
                       */
                      public interface Override extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Override.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("overridec6c9elemtype");
                        
                        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                        
                        static final Enum HIGHER = Enum.forString("Higher");
                        static final Enum LOWER = Enum.forString("Lower");
                        static final Enum CALLER_UNLIKELY_TO_FOLLOW = Enum.forString("CallerUnlikelyToFollow");
                        
                        static final int INT_HIGHER = Enum.INT_HIGHER;
                        static final int INT_LOWER = Enum.INT_LOWER;
                        static final int INT_CALLER_UNLIKELY_TO_FOLLOW = Enum.INT_CALLER_UNLIKELY_TO_FOLLOW;
                        
                        /**
                         * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$FinalDisposition$Override.
                         * These enum values can be used as follows:
                         * <pre>
                         * enum.toString(); // returns the string value of the enum
                         * enum.intValue(); // returns an int value, useful for switches
                         * // e.g., case Enum.INT_HIGHER
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
                          
                          static final int INT_HIGHER = 1;
                          static final int INT_LOWER = 2;
                          static final int INT_CALLER_UNLIKELY_TO_FOLLOW = 3;
                          
                          public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                              new org.apache.xmlbeans.StringEnumAbstractBase.Table
                          (
                            new Enum[]
                            {
                              new Enum("Higher", INT_HIGHER),
                              new Enum("Lower", INT_LOWER),
                              new Enum("CallerUnlikelyToFollow", INT_CALLER_UNLIKELY_TO_FOLLOW),
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
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override newValue(java.lang.Object obj) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override) type.newValue( obj ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML transferCodeDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface TransferCodeDetails extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransferCodeDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("transfercodedetails7128elemtype");
                      
                      /**
                       * Gets array of all "transferCode" elements
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode[] getTransferCodeArray();
                      
                      /**
                       * Gets ith "transferCode" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode getTransferCodeArray(int i);
                      
                      /**
                       * Returns number of "transferCode" element
                       */
                      int sizeOfTransferCodeArray();
                      
                      /**
                       * Sets array of all "transferCode" element
                       */
                      void setTransferCodeArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode[] transferCodeArray);
                      
                      /**
                       * Sets ith "transferCode" element
                       */
                      void setTransferCodeArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode transferCode);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "transferCode" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode insertNewTransferCode(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "transferCode" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode addNewTransferCode();
                      
                      /**
                       * Removes the ith "transferCode" element
                       */
                      void removeTransferCode(int i);
                      
                      /**
                       * An XML transferCode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TransferCodeDetails$TransferCode.
                       */
                      public interface TransferCode extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TransferCode.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("transfercodebc94elemtype");
                        
                        /**
                         * Gets the "type" attribute
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type.Enum getType();
                        
                        /**
                         * Gets (as xml) the "type" attribute
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type xgetType();
                        
                        /**
                         * Sets the "type" attribute
                         */
                        void setType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type.Enum type);
                        
                        /**
                         * Sets (as xml) the "type" attribute
                         */
                        void xsetType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type type);
                        
                        /**
                         * An XML type(@).
                         *
                         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TransferCodeDetails$TransferCode$Type.
                         */
                        public interface Type extends org.apache.xmlbeans.XmlString
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("type2ceeattrtype");
                          
                          org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                          void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                          
                          static final Enum T_1 = Enum.forString("T1");
                          static final Enum T_2 = Enum.forString("T2");
                          static final Enum T_3 = Enum.forString("T3");
                          static final Enum T_4 = Enum.forString("T4");
                          
                          static final int INT_T_1 = Enum.INT_T_1;
                          static final int INT_T_2 = Enum.INT_T_2;
                          static final int INT_T_3 = Enum.INT_T_3;
                          static final int INT_T_4 = Enum.INT_T_4;
                          
                          /**
                           * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TransferCodeDetails$TransferCode$Type.
                           * These enum values can be used as follows:
                           * <pre>
                           * enum.toString(); // returns the string value of the enum
                           * enum.intValue(); // returns an int value, useful for switches
                           * // e.g., case Enum.INT_T_1
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
                            
                            static final int INT_T_1 = 1;
                            static final int INT_T_2 = 2;
                            static final int INT_T_3 = 3;
                            static final int INT_T_4 = 4;
                            
                            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                                new org.apache.xmlbeans.StringEnumAbstractBase.Table
                            (
                              new Enum[]
                              {
                                new Enum("T1", INT_T_1),
                                new Enum("T2", INT_T_2),
                                new Enum("T3", INT_T_3),
                                new Enum("T4", INT_T_4),
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
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type newValue(java.lang.Object obj) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type) type.newValue( obj ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML systemFlags(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface SystemFlags extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemFlags.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("systemflags047aelemtype");
                      
                      /**
                       * Gets array of all "systemFlag" elements
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum[] getSystemFlagArray();
                      
                      /**
                       * Gets ith "systemFlag" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum getSystemFlagArray(int i);
                      
                      /**
                       * Gets (as xml) array of all "systemFlag" elements
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag[] xgetSystemFlagArray();
                      
                      /**
                       * Gets (as xml) ith "systemFlag" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag xgetSystemFlagArray(int i);
                      
                      /**
                       * Returns number of "systemFlag" element
                       */
                      int sizeOfSystemFlagArray();
                      
                      /**
                       * Sets array of all "systemFlag" element
                       */
                      void setSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum[] systemFlagArray);
                      
                      /**
                       * Sets ith "systemFlag" element
                       */
                      void setSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum systemFlag);
                      
                      /**
                       * Sets (as xml) array of all "systemFlag" element
                       */
                      void xsetSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag[] systemFlagArray);
                      
                      /**
                       * Sets (as xml) ith "systemFlag" element
                       */
                      void xsetSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag systemFlag);
                      
                      /**
                       * Inserts the value as the ith "systemFlag" element
                       */
                      void insertSystemFlag(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum systemFlag);
                      
                      /**
                       * Appends the value as the last "systemFlag" element
                       */
                      void addSystemFlag(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum systemFlag);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "systemFlag" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag insertNewSystemFlag(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "systemFlag" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag addNewSystemFlag();
                      
                      /**
                       * Removes the ith "systemFlag" element
                       */
                      void removeSystemFlag(int i);
                      
                      /**
                       * An XML systemFlag(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$SystemFlags$SystemFlag.
                       */
                      public interface SystemFlag extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemFlag.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("systemflag3703elemtype");
                        
                        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                        
                        static final Enum TRAUMA = Enum.forString("Trauma");
                        static final Enum NON_TRAUMA = Enum.forString("NonTrauma");
                        static final Enum SCENE_SAFE = Enum.forString("SceneSafe");
                        static final Enum SCENE_UNSAFE = Enum.forString("SceneUnsafe");
                        static final Enum POLICE = Enum.forString("Police");
                        static final Enum FIRE = Enum.forString("Fire");
                        static final Enum CATA_LEVEL_1 = Enum.forString("CATALevel1");
                        static final Enum CATA_LEVEL_2 = Enum.forString("CATALevel2");
                        static final Enum CATA_LEVEL_3 = Enum.forString("CATALevel3");
                        static final Enum CATA_LEVEL_4 = Enum.forString("CATALevel4");
                        static final Enum CATB_LEVEL_1 = Enum.forString("CATBLevel1");
                        static final Enum CATB_LEVEL_2 = Enum.forString("CATBLevel2");
                        static final Enum CATB_LEVEL_3 = Enum.forString("CATBLevel3");
                        static final Enum CATB_LEVEL_4 = Enum.forString("CATBLevel4");
                        static final Enum TRAPPED = Enum.forString("Trapped");
                        
                        static final int INT_TRAUMA = Enum.INT_TRAUMA;
                        static final int INT_NON_TRAUMA = Enum.INT_NON_TRAUMA;
                        static final int INT_SCENE_SAFE = Enum.INT_SCENE_SAFE;
                        static final int INT_SCENE_UNSAFE = Enum.INT_SCENE_UNSAFE;
                        static final int INT_POLICE = Enum.INT_POLICE;
                        static final int INT_FIRE = Enum.INT_FIRE;
                        static final int INT_CATA_LEVEL_1 = Enum.INT_CATA_LEVEL_1;
                        static final int INT_CATA_LEVEL_2 = Enum.INT_CATA_LEVEL_2;
                        static final int INT_CATA_LEVEL_3 = Enum.INT_CATA_LEVEL_3;
                        static final int INT_CATA_LEVEL_4 = Enum.INT_CATA_LEVEL_4;
                        static final int INT_CATB_LEVEL_1 = Enum.INT_CATB_LEVEL_1;
                        static final int INT_CATB_LEVEL_2 = Enum.INT_CATB_LEVEL_2;
                        static final int INT_CATB_LEVEL_3 = Enum.INT_CATB_LEVEL_3;
                        static final int INT_CATB_LEVEL_4 = Enum.INT_CATB_LEVEL_4;
                        static final int INT_TRAPPED = Enum.INT_TRAPPED;
                        
                        /**
                         * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$SystemFlags$SystemFlag.
                         * These enum values can be used as follows:
                         * <pre>
                         * enum.toString(); // returns the string value of the enum
                         * enum.intValue(); // returns an int value, useful for switches
                         * // e.g., case Enum.INT_TRAUMA
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
                          
                          static final int INT_TRAUMA = 1;
                          static final int INT_NON_TRAUMA = 2;
                          static final int INT_SCENE_SAFE = 3;
                          static final int INT_SCENE_UNSAFE = 4;
                          static final int INT_POLICE = 5;
                          static final int INT_FIRE = 6;
                          static final int INT_CATA_LEVEL_1 = 7;
                          static final int INT_CATA_LEVEL_2 = 8;
                          static final int INT_CATA_LEVEL_3 = 9;
                          static final int INT_CATA_LEVEL_4 = 10;
                          static final int INT_CATB_LEVEL_1 = 11;
                          static final int INT_CATB_LEVEL_2 = 12;
                          static final int INT_CATB_LEVEL_3 = 13;
                          static final int INT_CATB_LEVEL_4 = 14;
                          static final int INT_TRAPPED = 15;
                          
                          public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                              new org.apache.xmlbeans.StringEnumAbstractBase.Table
                          (
                            new Enum[]
                            {
                              new Enum("Trauma", INT_TRAUMA),
                              new Enum("NonTrauma", INT_NON_TRAUMA),
                              new Enum("SceneSafe", INT_SCENE_SAFE),
                              new Enum("SceneUnsafe", INT_SCENE_UNSAFE),
                              new Enum("Police", INT_POLICE),
                              new Enum("Fire", INT_FIRE),
                              new Enum("CATALevel1", INT_CATA_LEVEL_1),
                              new Enum("CATALevel2", INT_CATA_LEVEL_2),
                              new Enum("CATALevel3", INT_CATA_LEVEL_3),
                              new Enum("CATALevel4", INT_CATA_LEVEL_4),
                              new Enum("CATBLevel1", INT_CATB_LEVEL_1),
                              new Enum("CATBLevel2", INT_CATB_LEVEL_2),
                              new Enum("CATBLevel3", INT_CATB_LEVEL_3),
                              new Enum("CATBLevel4", INT_CATB_LEVEL_4),
                              new Enum("Trapped", INT_TRAPPED),
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
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag newValue(java.lang.Object obj) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag) type.newValue( obj ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML user(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface User extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(User.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("user13b7elemtype");
                      
                      /**
                       * Gets the "id" element
                       */
                      java.lang.String getId();
                      
                      /**
                       * Gets (as xml) the "id" element
                       */
                      org.apache.xmlbeans.XmlString xgetId();
                      
                      /**
                       * Sets the "id" element
                       */
                      void setId(java.lang.String id);
                      
                      /**
                       * Sets (as xml) the "id" element
                       */
                      void xsetId(org.apache.xmlbeans.XmlString id);
                      
                      /**
                       * Gets the "name" element
                       */
                      java.lang.String getName();
                      
                      /**
                       * Gets (as xml) the "name" element
                       */
                      org.apache.xmlbeans.XmlString xgetName();
                      
                      /**
                       * Sets the "name" element
                       */
                      void setName(java.lang.String name);
                      
                      /**
                       * Sets (as xml) the "name" element
                       */
                      void xsetName(org.apache.xmlbeans.XmlString name);
                      
                      /**
                       * Gets the "skillSet" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet.Enum getSkillSet();
                      
                      /**
                       * Gets (as xml) the "skillSet" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet xgetSkillSet();
                      
                      /**
                       * Sets the "skillSet" element
                       */
                      void setSkillSet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet.Enum skillSet);
                      
                      /**
                       * Sets (as xml) the "skillSet" element
                       */
                      void xsetSkillSet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet skillSet);
                      
                      /**
                       * An XML skillSet(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$User$SkillSet.
                       */
                      public interface SkillSet extends org.apache.xmlbeans.XmlString
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SkillSet.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("skillset20e4elemtype");
                        
                        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                        
                        static final Enum T_1 = Enum.forString("T1");
                        static final Enum T_2 = Enum.forString("T2");
                        static final Enum T_3 = Enum.forString("T3");
                        static final Enum T_4 = Enum.forString("T4");
                        
                        static final int INT_T_1 = Enum.INT_T_1;
                        static final int INT_T_2 = Enum.INT_T_2;
                        static final int INT_T_3 = Enum.INT_T_3;
                        static final int INT_T_4 = Enum.INT_T_4;
                        
                        /**
                         * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$User$SkillSet.
                         * These enum values can be used as follows:
                         * <pre>
                         * enum.toString(); // returns the string value of the enum
                         * enum.intValue(); // returns an int value, useful for switches
                         * // e.g., case Enum.INT_T_1
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
                          
                          static final int INT_T_1 = 1;
                          static final int INT_T_2 = 2;
                          static final int INT_T_3 = 3;
                          static final int INT_T_4 = 4;
                          
                          public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                              new org.apache.xmlbeans.StringEnumAbstractBase.Table
                          (
                            new Enum[]
                            {
                              new Enum("T1", INT_T_1),
                              new Enum("T2", INT_T_2),
                              new Enum("T3", INT_T_3),
                              new Enum("T4", INT_T_4),
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
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet newValue(java.lang.Object obj) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet) type.newValue( obj ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML triageLineDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface TriageLineDetails extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriageLineDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("triagelinedetails3c38elemtype");
                      
                      /**
                       * Gets array of all "triageLine" elements
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine[] getTriageLineArray();
                      
                      /**
                       * Gets ith "triageLine" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine getTriageLineArray(int i);
                      
                      /**
                       * Returns number of "triageLine" element
                       */
                      int sizeOfTriageLineArray();
                      
                      /**
                       * Sets array of all "triageLine" element
                       */
                      void setTriageLineArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine[] triageLineArray);
                      
                      /**
                       * Sets ith "triageLine" element
                       */
                      void setTriageLineArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine triageLine);
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "triageLine" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine insertNewTriageLine(int i);
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "triageLine" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine addNewTriageLine();
                      
                      /**
                       * Removes the ith "triageLine" element
                       */
                      void removeTriageLine(int i);
                      
                      /**
                       * An XML triageLine(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is a complex type.
                       */
                      public interface TriageLine extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriageLine.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("triageline2194elemtype");
                        
                        /**
                         * Gets the "start" element
                         */
                        java.util.Calendar getStart();
                        
                        /**
                         * Gets (as xml) the "start" element
                         */
                        org.apache.xmlbeans.XmlDateTime xgetStart();
                        
                        /**
                         * Sets the "start" element
                         */
                        void setStart(java.util.Calendar start);
                        
                        /**
                         * Sets (as xml) the "start" element
                         */
                        void xsetStart(org.apache.xmlbeans.XmlDateTime start);
                        
                        /**
                         * Gets the "finish" element
                         */
                        java.util.Calendar getFinish();
                        
                        /**
                         * Gets (as xml) the "finish" element
                         */
                        org.apache.xmlbeans.XmlDateTime xgetFinish();
                        
                        /**
                         * Sets the "finish" element
                         */
                        void setFinish(java.util.Calendar finish);
                        
                        /**
                         * Sets (as xml) the "finish" element
                         */
                        void xsetFinish(org.apache.xmlbeans.XmlDateTime finish);
                        
                        /**
                         * Gets the "questionType" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType.Enum getQuestionType();
                        
                        /**
                         * Gets (as xml) the "questionType" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType xgetQuestionType();
                        
                        /**
                         * Sets the "questionType" element
                         */
                        void setQuestionType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType.Enum questionType);
                        
                        /**
                         * Sets (as xml) the "questionType" element
                         */
                        void xsetQuestionType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType questionType);
                        
                        /**
                         * Gets the "question" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question getQuestion();
                        
                        /**
                         * True if has "question" element
                         */
                        boolean isSetQuestion();
                        
                        /**
                         * Sets the "question" element
                         */
                        void setQuestion(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question question);
                        
                        /**
                         * Appends and returns a new empty "question" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question addNewQuestion();
                        
                        /**
                         * Unsets the "question" element
                         */
                        void unsetQuestion();
                        
                        /**
                         * Gets the "careAdviceKeywordDetails" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails getCareAdviceKeywordDetails();
                        
                        /**
                         * True if has "careAdviceKeywordDetails" element
                         */
                        boolean isSetCareAdviceKeywordDetails();
                        
                        /**
                         * Sets the "careAdviceKeywordDetails" element
                         */
                        void setCareAdviceKeywordDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails careAdviceKeywordDetails);
                        
                        /**
                         * Appends and returns a new empty "careAdviceKeywordDetails" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails addNewCareAdviceKeywordDetails();
                        
                        /**
                         * Unsets the "careAdviceKeywordDetails" element
                         */
                        void unsetCareAdviceKeywordDetails();
                        
                        /**
                         * Gets the "dispositionInstruction" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction getDispositionInstruction();
                        
                        /**
                         * True if has "dispositionInstruction" element
                         */
                        boolean isSetDispositionInstruction();
                        
                        /**
                         * Sets the "dispositionInstruction" element
                         */
                        void setDispositionInstruction(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction dispositionInstruction);
                        
                        /**
                         * Appends and returns a new empty "dispositionInstruction" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction addNewDispositionInstruction();
                        
                        /**
                         * Unsets the "dispositionInstruction" element
                         */
                        void unsetDispositionInstruction();
                        
                        /**
                         * Gets the "careAdviceDetails" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails getCareAdviceDetails();
                        
                        /**
                         * True if has "careAdviceDetails" element
                         */
                        boolean isSetCareAdviceDetails();
                        
                        /**
                         * Sets the "careAdviceDetails" element
                         */
                        void setCareAdviceDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails careAdviceDetails);
                        
                        /**
                         * Appends and returns a new empty "careAdviceDetails" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails addNewCareAdviceDetails();
                        
                        /**
                         * Unsets the "careAdviceDetails" element
                         */
                        void unsetCareAdviceDetails();
                        
                        /**
                         * Gets the "clinicalArea" element
                         */
                        java.lang.String getClinicalArea();
                        
                        /**
                         * Gets (as xml) the "clinicalArea" element
                         */
                        org.apache.xmlbeans.XmlString xgetClinicalArea();
                        
                        /**
                         * True if has "clinicalArea" element
                         */
                        boolean isSetClinicalArea();
                        
                        /**
                         * Sets the "clinicalArea" element
                         */
                        void setClinicalArea(java.lang.String clinicalArea);
                        
                        /**
                         * Sets (as xml) the "clinicalArea" element
                         */
                        void xsetClinicalArea(org.apache.xmlbeans.XmlString clinicalArea);
                        
                        /**
                         * Unsets the "clinicalArea" element
                         */
                        void unsetClinicalArea();
                        
                        /**
                         * Gets the "reportText" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText getReportText();
                        
                        /**
                         * Sets the "reportText" element
                         */
                        void setReportText(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText reportText);
                        
                        /**
                         * Appends and returns a new empty "reportText" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText addNewReportText();
                        
                        /**
                         * Gets the "userComment" element
                         */
                        java.lang.String getUserComment();
                        
                        /**
                         * Gets (as xml) the "userComment" element
                         */
                        org.apache.xmlbeans.XmlString xgetUserComment();
                        
                        /**
                         * True if has "userComment" element
                         */
                        boolean isSetUserComment();
                        
                        /**
                         * Sets the "userComment" element
                         */
                        void setUserComment(java.lang.String userComment);
                        
                        /**
                         * Sets (as xml) the "userComment" element
                         */
                        void xsetUserComment(org.apache.xmlbeans.XmlString userComment);
                        
                        /**
                         * Unsets the "userComment" element
                         */
                        void unsetUserComment();
                        
                        /**
                         * Gets the "action" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action.Enum getAction();
                        
                        /**
                         * Gets (as xml) the "action" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action xgetAction();
                        
                        /**
                         * Sets the "action" element
                         */
                        void setAction(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action.Enum action);
                        
                        /**
                         * Sets (as xml) the "action" element
                         */
                        void xsetAction(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action action);
                        
                        /**
                         * Gets the "includeInReport" element
                         */
                        boolean getIncludeInReport();
                        
                        /**
                         * Gets (as xml) the "includeInReport" element
                         */
                        org.apache.xmlbeans.XmlBoolean xgetIncludeInReport();
                        
                        /**
                         * Sets the "includeInReport" element
                         */
                        void setIncludeInReport(boolean includeInReport);
                        
                        /**
                         * Sets (as xml) the "includeInReport" element
                         */
                        void xsetIncludeInReport(org.apache.xmlbeans.XmlBoolean includeInReport);
                        
                        /**
                         * Gets the "systemFlags" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags getSystemFlags();
                        
                        /**
                         * True if has "systemFlags" element
                         */
                        boolean isSetSystemFlags();
                        
                        /**
                         * Sets the "systemFlags" element
                         */
                        void setSystemFlags(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags systemFlags);
                        
                        /**
                         * Appends and returns a new empty "systemFlags" element
                         */
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags addNewSystemFlags();
                        
                        /**
                         * Unsets the "systemFlags" element
                         */
                        void unsetSystemFlags();
                        
                        /**
                         * An XML questionType(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$QuestionType.
                         */
                        public interface QuestionType extends org.apache.xmlbeans.XmlString
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(QuestionType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("questiontype7a70elemtype");
                          
                          org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                          void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                          
                          static final Enum PATHWAYS_SELECTION = Enum.forString("PathwaysSelection");
                          static final Enum MULTIPLE_CHOICE = Enum.forString("MultipleChoice");
                          static final Enum SINGLE_ANSWER = Enum.forString("SingleAnswer");
                          static final Enum DISPOSITION = Enum.forString("Disposition");
                          static final Enum HOME_CARE_ADVICE = Enum.forString("HomeCareAdvice");
                          static final Enum INTERIM_CARE_ADVICE = Enum.forString("InterimCareAdvice");
                          static final Enum SET_VARIABLE = Enum.forString("SetVariable");
                          static final Enum QUERY_VARIABLE = Enum.forString("QueryVariable");
                          static final Enum CMS_LOOKUP = Enum.forString("CMS Lookup");
                          
                          static final int INT_PATHWAYS_SELECTION = Enum.INT_PATHWAYS_SELECTION;
                          static final int INT_MULTIPLE_CHOICE = Enum.INT_MULTIPLE_CHOICE;
                          static final int INT_SINGLE_ANSWER = Enum.INT_SINGLE_ANSWER;
                          static final int INT_DISPOSITION = Enum.INT_DISPOSITION;
                          static final int INT_HOME_CARE_ADVICE = Enum.INT_HOME_CARE_ADVICE;
                          static final int INT_INTERIM_CARE_ADVICE = Enum.INT_INTERIM_CARE_ADVICE;
                          static final int INT_SET_VARIABLE = Enum.INT_SET_VARIABLE;
                          static final int INT_QUERY_VARIABLE = Enum.INT_QUERY_VARIABLE;
                          static final int INT_CMS_LOOKUP = Enum.INT_CMS_LOOKUP;
                          
                          /**
                           * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$QuestionType.
                           * These enum values can be used as follows:
                           * <pre>
                           * enum.toString(); // returns the string value of the enum
                           * enum.intValue(); // returns an int value, useful for switches
                           * // e.g., case Enum.INT_PATHWAYS_SELECTION
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
                            
                            static final int INT_PATHWAYS_SELECTION = 1;
                            static final int INT_MULTIPLE_CHOICE = 2;
                            static final int INT_SINGLE_ANSWER = 3;
                            static final int INT_DISPOSITION = 4;
                            static final int INT_HOME_CARE_ADVICE = 5;
                            static final int INT_INTERIM_CARE_ADVICE = 6;
                            static final int INT_SET_VARIABLE = 7;
                            static final int INT_QUERY_VARIABLE = 8;
                            static final int INT_CMS_LOOKUP = 9;
                            
                            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                                new org.apache.xmlbeans.StringEnumAbstractBase.Table
                            (
                              new Enum[]
                              {
                                new Enum("PathwaysSelection", INT_PATHWAYS_SELECTION),
                                new Enum("MultipleChoice", INT_MULTIPLE_CHOICE),
                                new Enum("SingleAnswer", INT_SINGLE_ANSWER),
                                new Enum("Disposition", INT_DISPOSITION),
                                new Enum("HomeCareAdvice", INT_HOME_CARE_ADVICE),
                                new Enum("InterimCareAdvice", INT_INTERIM_CARE_ADVICE),
                                new Enum("SetVariable", INT_SET_VARIABLE),
                                new Enum("QueryVariable", INT_QUERY_VARIABLE),
                                new Enum("CMS Lookup", INT_CMS_LOOKUP),
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
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType newValue(java.lang.Object obj) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType) type.newValue( obj ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * An XML question(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public interface Question extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Question.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("question6216elemtype");
                          
                          /**
                           * Gets the "triageLogicId" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId getTriageLogicId();
                          
                          /**
                           * Sets the "triageLogicId" element
                           */
                          void setTriageLogicId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId triageLogicId);
                          
                          /**
                           * Appends and returns a new empty "triageLogicId" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId addNewTriageLogicId();
                          
                          /**
                           * Gets the "questionId" element
                           */
                          java.lang.String getQuestionId();
                          
                          /**
                           * Gets (as xml) the "questionId" element
                           */
                          org.apache.xmlbeans.XmlString xgetQuestionId();
                          
                          /**
                           * Sets the "questionId" element
                           */
                          void setQuestionId(java.lang.String questionId);
                          
                          /**
                           * Sets (as xml) the "questionId" element
                           */
                          void xsetQuestionId(org.apache.xmlbeans.XmlString questionId);
                          
                          /**
                           * Gets the "questionText" element
                           */
                          java.lang.String getQuestionText();
                          
                          /**
                           * Gets (as xml) the "questionText" element
                           */
                          org.apache.xmlbeans.XmlString xgetQuestionText();
                          
                          /**
                           * Sets the "questionText" element
                           */
                          void setQuestionText(java.lang.String questionText);
                          
                          /**
                           * Sets (as xml) the "questionText" element
                           */
                          void xsetQuestionText(org.apache.xmlbeans.XmlString questionText);
                          
                          /**
                           * Gets the "questionRationale" element
                           */
                          java.lang.String getQuestionRationale();
                          
                          /**
                           * Gets (as xml) the "questionRationale" element
                           */
                          org.apache.xmlbeans.XmlString xgetQuestionRationale();
                          
                          /**
                           * True if has "questionRationale" element
                           */
                          boolean isSetQuestionRationale();
                          
                          /**
                           * Sets the "questionRationale" element
                           */
                          void setQuestionRationale(java.lang.String questionRationale);
                          
                          /**
                           * Sets (as xml) the "questionRationale" element
                           */
                          void xsetQuestionRationale(org.apache.xmlbeans.XmlString questionRationale);
                          
                          /**
                           * Unsets the "questionRationale" element
                           */
                          void unsetQuestionRationale();
                          
                          /**
                           * Gets the "answers" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers getAnswers();
                          
                          /**
                           * Sets the "answers" element
                           */
                          void setAnswers(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers answers);
                          
                          /**
                           * Appends and returns a new empty "answers" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers addNewAnswers();
                          
                          /**
                           * Gets the "dispositionRationale" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale getDispositionRationale();
                          
                          /**
                           * True if has "dispositionRationale" element
                           */
                          boolean isSetDispositionRationale();
                          
                          /**
                           * Sets the "dispositionRationale" element
                           */
                          void setDispositionRationale(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale dispositionRationale);
                          
                          /**
                           * Appends and returns a new empty "dispositionRationale" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale addNewDispositionRationale();
                          
                          /**
                           * Unsets the "dispositionRationale" element
                           */
                          void unsetDispositionRationale();
                          
                          /**
                           * An XML triageLogicId(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public interface TriageLogicId extends org.apache.xmlbeans.XmlObject
                          {
                            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                              org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(TriageLogicId.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("triagelogicid9605elemtype");
                            
                            /**
                             * Gets the "pathwayVersion" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion getPathwayVersion();
                            
                            /**
                             * Sets the "pathwayVersion" element
                             */
                            void setPathwayVersion(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion pathwayVersion);
                            
                            /**
                             * Appends and returns a new empty "pathwayVersion" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion addNewPathwayVersion();
                            
                            /**
                             * Gets the "pathwayId" element
                             */
                            java.lang.String getPathwayId();
                            
                            /**
                             * Gets (as xml) the "pathwayId" element
                             */
                            org.apache.xmlbeans.XmlString xgetPathwayId();
                            
                            /**
                             * Sets the "pathwayId" element
                             */
                            void setPathwayId(java.lang.String pathwayId);
                            
                            /**
                             * Sets (as xml) the "pathwayId" element
                             */
                            void xsetPathwayId(org.apache.xmlbeans.XmlString pathwayId);
                            
                            /**
                             * Gets the "pathwayOrderNo" element
                             */
                            java.lang.String getPathwayOrderNo();
                            
                            /**
                             * Gets (as xml) the "pathwayOrderNo" element
                             */
                            org.apache.xmlbeans.XmlString xgetPathwayOrderNo();
                            
                            /**
                             * Sets the "pathwayOrderNo" element
                             */
                            void setPathwayOrderNo(java.lang.String pathwayOrderNo);
                            
                            /**
                             * Sets (as xml) the "pathwayOrderNo" element
                             */
                            void xsetPathwayOrderNo(org.apache.xmlbeans.XmlString pathwayOrderNo);
                            
                            /**
                             * An XML pathwayVersion(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public interface PathwayVersion extends org.apache.xmlbeans.XmlObject
                            {
                              public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PathwayVersion.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("pathwayversionb85belemtype");
                              
                              /**
                               * Gets the "major" element
                               */
                              int getMajor();
                              
                              /**
                               * Gets (as xml) the "major" element
                               */
                              org.apache.xmlbeans.XmlInt xgetMajor();
                              
                              /**
                               * Sets the "major" element
                               */
                              void setMajor(int major);
                              
                              /**
                               * Sets (as xml) the "major" element
                               */
                              void xsetMajor(org.apache.xmlbeans.XmlInt major);
                              
                              /**
                               * Gets the "minor" element
                               */
                              int getMinor();
                              
                              /**
                               * Gets (as xml) the "minor" element
                               */
                              org.apache.xmlbeans.XmlInt xgetMinor();
                              
                              /**
                               * Sets the "minor" element
                               */
                              void setMinor(int minor);
                              
                              /**
                               * Sets (as xml) the "minor" element
                               */
                              void xsetMinor(org.apache.xmlbeans.XmlInt minor);
                              
                              /**
                               * Gets the "subRevision" element
                               */
                              int getSubRevision();
                              
                              /**
                               * Gets (as xml) the "subRevision" element
                               */
                              org.apache.xmlbeans.XmlInt xgetSubRevision();
                              
                              /**
                               * Sets the "subRevision" element
                               */
                              void setSubRevision(int subRevision);
                              
                              /**
                               * Sets (as xml) the "subRevision" element
                               */
                              void xsetSubRevision(org.apache.xmlbeans.XmlInt subRevision);
                              
                              /**
                               * A factory class with static methods for creating instances
                               * of this type.
                               */
                              
                              public static final class Factory
                              {
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion newInstance() {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                                
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion newInstance(org.apache.xmlbeans.XmlOptions options) {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                                
                                private Factory() { } // No instance of this class allowed
                              }
                            }
                            
                            /**
                             * A factory class with static methods for creating instances
                             * of this type.
                             */
                            
                            public static final class Factory
                            {
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId newInstance() {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                              
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId newInstance(org.apache.xmlbeans.XmlOptions options) {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                              
                              private Factory() { } // No instance of this class allowed
                            }
                          }
                          
                          /**
                           * An XML answers(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public interface Answers extends org.apache.xmlbeans.XmlObject
                          {
                            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                              org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Answers.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("answers5c95elemtype");
                            
                            /**
                             * Gets array of all "answer" elements
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer[] getAnswerArray();
                            
                            /**
                             * Gets ith "answer" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer getAnswerArray(int i);
                            
                            /**
                             * Returns number of "answer" element
                             */
                            int sizeOfAnswerArray();
                            
                            /**
                             * Sets array of all "answer" element
                             */
                            void setAnswerArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer[] answerArray);
                            
                            /**
                             * Sets ith "answer" element
                             */
                            void setAnswerArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer answer);
                            
                            /**
                             * Inserts and returns a new empty value (as xml) as the ith "answer" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer insertNewAnswer(int i);
                            
                            /**
                             * Appends and returns a new empty value (as xml) as the last "answer" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer addNewAnswer();
                            
                            /**
                             * Removes the ith "answer" element
                             */
                            void removeAnswer(int i);
                            
                            /**
                             * An XML answer(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public interface Answer extends org.apache.xmlbeans.XmlObject
                            {
                              public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Answer.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("answer3e7belemtype");
                              
                              /**
                               * Gets the "text" element
                               */
                              java.lang.String getText();
                              
                              /**
                               * Gets (as xml) the "text" element
                               */
                              org.apache.xmlbeans.XmlString xgetText();
                              
                              /**
                               * Sets the "text" element
                               */
                              void setText(java.lang.String text);
                              
                              /**
                               * Sets (as xml) the "text" element
                               */
                              void xsetText(org.apache.xmlbeans.XmlString text);
                              
                              /**
                               * Gets the "rationale" element
                               */
                              java.lang.String getRationale();
                              
                              /**
                               * Gets (as xml) the "rationale" element
                               */
                              org.apache.xmlbeans.XmlString xgetRationale();
                              
                              /**
                               * Sets the "rationale" element
                               */
                              void setRationale(java.lang.String rationale);
                              
                              /**
                               * Sets (as xml) the "rationale" element
                               */
                              void xsetRationale(org.apache.xmlbeans.XmlString rationale);
                              
                              /**
                               * Gets the "selected" attribute
                               */
                              boolean getSelected();
                              
                              /**
                               * Gets (as xml) the "selected" attribute
                               */
                              org.apache.xmlbeans.XmlBoolean xgetSelected();
                              
                              /**
                               * Sets the "selected" attribute
                               */
                              void setSelected(boolean selected);
                              
                              /**
                               * Sets (as xml) the "selected" attribute
                               */
                              void xsetSelected(org.apache.xmlbeans.XmlBoolean selected);
                              
                              /**
                               * A factory class with static methods for creating instances
                               * of this type.
                               */
                              
                              public static final class Factory
                              {
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer newInstance() {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                                
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer newInstance(org.apache.xmlbeans.XmlOptions options) {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                                
                                private Factory() { } // No instance of this class allowed
                              }
                            }
                            
                            /**
                             * A factory class with static methods for creating instances
                             * of this type.
                             */
                            
                            public static final class Factory
                            {
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers newInstance() {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                              
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers newInstance(org.apache.xmlbeans.XmlOptions options) {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                              
                              private Factory() { } // No instance of this class allowed
                            }
                          }
                          
                          /**
                           * An XML dispositionRationale(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public interface DispositionRationale extends org.apache.xmlbeans.XmlObject
                          {
                            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                              org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DispositionRationale.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("dispositionrationalee8faelemtype");
                            
                            /**
                             * Gets the "term" element
                             */
                            java.lang.String getTerm();
                            
                            /**
                             * Gets (as xml) the "term" element
                             */
                            org.apache.xmlbeans.XmlString xgetTerm();
                            
                            /**
                             * Sets the "term" element
                             */
                            void setTerm(java.lang.String term);
                            
                            /**
                             * Sets (as xml) the "term" element
                             */
                            void xsetTerm(org.apache.xmlbeans.XmlString term);
                            
                            /**
                             * Gets the "code" element
                             */
                            java.lang.String getCode();
                            
                            /**
                             * Gets (as xml) the "code" element
                             */
                            org.apache.xmlbeans.XmlString xgetCode();
                            
                            /**
                             * Sets the "code" element
                             */
                            void setCode(java.lang.String code);
                            
                            /**
                             * Sets (as xml) the "code" element
                             */
                            void xsetCode(org.apache.xmlbeans.XmlString code);
                            
                            /**
                             * A factory class with static methods for creating instances
                             * of this type.
                             */
                            
                            public static final class Factory
                            {
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale newInstance() {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                              
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale newInstance(org.apache.xmlbeans.XmlOptions options) {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                              
                              private Factory() { } // No instance of this class allowed
                            }
                          }
                          
                          /**
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * An XML careAdviceKeywordDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public interface CareAdviceKeywordDetails extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CareAdviceKeywordDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("careadvicekeyworddetails2612elemtype");
                          
                          /**
                           * Gets array of all "careAdviceKeyword" elements
                           */
                          java.lang.String[] getCareAdviceKeywordArray();
                          
                          /**
                           * Gets ith "careAdviceKeyword" element
                           */
                          java.lang.String getCareAdviceKeywordArray(int i);
                          
                          /**
                           * Gets (as xml) array of all "careAdviceKeyword" elements
                           */
                          org.apache.xmlbeans.XmlString[] xgetCareAdviceKeywordArray();
                          
                          /**
                           * Gets (as xml) ith "careAdviceKeyword" element
                           */
                          org.apache.xmlbeans.XmlString xgetCareAdviceKeywordArray(int i);
                          
                          /**
                           * Returns number of "careAdviceKeyword" element
                           */
                          int sizeOfCareAdviceKeywordArray();
                          
                          /**
                           * Sets array of all "careAdviceKeyword" element
                           */
                          void setCareAdviceKeywordArray(java.lang.String[] careAdviceKeywordArray);
                          
                          /**
                           * Sets ith "careAdviceKeyword" element
                           */
                          void setCareAdviceKeywordArray(int i, java.lang.String careAdviceKeyword);
                          
                          /**
                           * Sets (as xml) array of all "careAdviceKeyword" element
                           */
                          void xsetCareAdviceKeywordArray(org.apache.xmlbeans.XmlString[] careAdviceKeywordArray);
                          
                          /**
                           * Sets (as xml) ith "careAdviceKeyword" element
                           */
                          void xsetCareAdviceKeywordArray(int i, org.apache.xmlbeans.XmlString careAdviceKeyword);
                          
                          /**
                           * Inserts the value as the ith "careAdviceKeyword" element
                           */
                          void insertCareAdviceKeyword(int i, java.lang.String careAdviceKeyword);
                          
                          /**
                           * Appends the value as the last "careAdviceKeyword" element
                           */
                          void addCareAdviceKeyword(java.lang.String careAdviceKeyword);
                          
                          /**
                           * Inserts and returns a new empty value (as xml) as the ith "careAdviceKeyword" element
                           */
                          org.apache.xmlbeans.XmlString insertNewCareAdviceKeyword(int i);
                          
                          /**
                           * Appends and returns a new empty value (as xml) as the last "careAdviceKeyword" element
                           */
                          org.apache.xmlbeans.XmlString addNewCareAdviceKeyword();
                          
                          /**
                           * Removes the ith "careAdviceKeyword" element
                           */
                          void removeCareAdviceKeyword(int i);
                          
                          /**
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * An XML dispositionInstruction(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public interface DispositionInstruction extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DispositionInstruction.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("dispositioninstructione287elemtype");
                          
                          /**
                           * Gets the "id" element
                           */
                          java.lang.String getId();
                          
                          /**
                           * Gets (as xml) the "id" element
                           */
                          org.apache.xmlbeans.XmlString xgetId();
                          
                          /**
                           * Sets the "id" element
                           */
                          void setId(java.lang.String id);
                          
                          /**
                           * Sets (as xml) the "id" element
                           */
                          void xsetId(org.apache.xmlbeans.XmlString id);
                          
                          /**
                           * Gets the "itemDetails" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails getItemDetails();
                          
                          /**
                           * Sets the "itemDetails" element
                           */
                          void setItemDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails itemDetails);
                          
                          /**
                           * Appends and returns a new empty "itemDetails" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails addNewItemDetails();
                          
                          /**
                           * An XML itemDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public interface ItemDetails extends org.apache.xmlbeans.XmlObject
                          {
                            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                              org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("itemdetails2cccelemtype");
                            
                            /**
                             * Gets array of all "item" elements
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item[] getItemArray();
                            
                            /**
                             * Gets ith "item" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item getItemArray(int i);
                            
                            /**
                             * Returns number of "item" element
                             */
                            int sizeOfItemArray();
                            
                            /**
                             * Sets array of all "item" element
                             */
                            void setItemArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item[] itemArray);
                            
                            /**
                             * Sets ith "item" element
                             */
                            void setItemArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item item);
                            
                            /**
                             * Inserts and returns a new empty value (as xml) as the ith "item" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item insertNewItem(int i);
                            
                            /**
                             * Appends and returns a new empty value (as xml) as the last "item" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item addNewItem();
                            
                            /**
                             * Removes the ith "item" element
                             */
                            void removeItem(int i);
                            
                            /**
                             * An XML item(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public interface Item extends org.apache.xmlbeans.XmlObject
                            {
                              public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("item683delemtype");
                              
                              /**
                               * Gets the "id" element
                               */
                              java.lang.String getId();
                              
                              /**
                               * Gets (as xml) the "id" element
                               */
                              org.apache.xmlbeans.XmlString xgetId();
                              
                              /**
                               * Sets the "id" element
                               */
                              void setId(java.lang.String id);
                              
                              /**
                               * Sets (as xml) the "id" element
                               */
                              void xsetId(org.apache.xmlbeans.XmlString id);
                              
                              /**
                               * Gets the "text" element
                               */
                              java.lang.String getText();
                              
                              /**
                               * Gets (as xml) the "text" element
                               */
                              org.apache.xmlbeans.XmlString xgetText();
                              
                              /**
                               * Sets the "text" element
                               */
                              void setText(java.lang.String text);
                              
                              /**
                               * Sets (as xml) the "text" element
                               */
                              void xsetText(org.apache.xmlbeans.XmlString text);
                              
                              /**
                               * A factory class with static methods for creating instances
                               * of this type.
                               */
                              
                              public static final class Factory
                              {
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item newInstance() {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                                
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                                
                                private Factory() { } // No instance of this class allowed
                              }
                            }
                            
                            /**
                             * A factory class with static methods for creating instances
                             * of this type.
                             */
                            
                            public static final class Factory
                            {
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails newInstance() {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                              
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                              
                              private Factory() { } // No instance of this class allowed
                            }
                          }
                          
                          /**
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * An XML careAdviceDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public interface CareAdviceDetails extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CareAdviceDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("careadvicedetails0c99elemtype");
                          
                          /**
                           * Gets array of all "careAdvice" elements
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice[] getCareAdviceArray();
                          
                          /**
                           * Gets ith "careAdvice" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice getCareAdviceArray(int i);
                          
                          /**
                           * Returns number of "careAdvice" element
                           */
                          int sizeOfCareAdviceArray();
                          
                          /**
                           * Sets array of all "careAdvice" element
                           */
                          void setCareAdviceArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice[] careAdviceArray);
                          
                          /**
                           * Sets ith "careAdvice" element
                           */
                          void setCareAdviceArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice careAdvice);
                          
                          /**
                           * Inserts and returns a new empty value (as xml) as the ith "careAdvice" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice insertNewCareAdvice(int i);
                          
                          /**
                           * Appends and returns a new empty value (as xml) as the last "careAdvice" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice addNewCareAdvice();
                          
                          /**
                           * Removes the ith "careAdvice" element
                           */
                          void removeCareAdvice(int i);
                          
                          /**
                           * An XML careAdvice(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public interface CareAdvice extends org.apache.xmlbeans.XmlObject
                          {
                            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                              org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(CareAdvice.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("careadvice481eelemtype");
                            
                            /**
                             * Gets the "id" element
                             */
                            java.lang.String getId();
                            
                            /**
                             * Gets (as xml) the "id" element
                             */
                            org.apache.xmlbeans.XmlString xgetId();
                            
                            /**
                             * Sets the "id" element
                             */
                            void setId(java.lang.String id);
                            
                            /**
                             * Sets (as xml) the "id" element
                             */
                            void xsetId(org.apache.xmlbeans.XmlString id);
                            
                            /**
                             * Gets the "topic" element
                             */
                            java.lang.String getTopic();
                            
                            /**
                             * Gets (as xml) the "topic" element
                             */
                            org.apache.xmlbeans.XmlString xgetTopic();
                            
                            /**
                             * Sets the "topic" element
                             */
                            void setTopic(java.lang.String topic);
                            
                            /**
                             * Sets (as xml) the "topic" element
                             */
                            void xsetTopic(org.apache.xmlbeans.XmlString topic);
                            
                            /**
                             * Gets the "itemDetails" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails getItemDetails();
                            
                            /**
                             * Sets the "itemDetails" element
                             */
                            void setItemDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails itemDetails);
                            
                            /**
                             * Appends and returns a new empty "itemDetails" element
                             */
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails addNewItemDetails();
                            
                            /**
                             * An XML itemDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public interface ItemDetails extends org.apache.xmlbeans.XmlObject
                            {
                              public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ItemDetails.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("itemdetails7d63elemtype");
                              
                              /**
                               * Gets array of all "item" elements
                               */
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item[] getItemArray();
                              
                              /**
                               * Gets ith "item" element
                               */
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item getItemArray(int i);
                              
                              /**
                               * Returns number of "item" element
                               */
                              int sizeOfItemArray();
                              
                              /**
                               * Sets array of all "item" element
                               */
                              void setItemArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item[] itemArray);
                              
                              /**
                               * Sets ith "item" element
                               */
                              void setItemArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item item);
                              
                              /**
                               * Inserts and returns a new empty value (as xml) as the ith "item" element
                               */
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item insertNewItem(int i);
                              
                              /**
                               * Appends and returns a new empty value (as xml) as the last "item" element
                               */
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item addNewItem();
                              
                              /**
                               * Removes the ith "item" element
                               */
                              void removeItem(int i);
                              
                              /**
                               * An XML item(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                               *
                               * This is a complex type.
                               */
                              public interface Item extends org.apache.xmlbeans.XmlObject
                              {
                                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                                  org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Item.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("itemb7d4elemtype");
                                
                                /**
                                 * Gets the "id" element
                                 */
                                java.lang.String getId();
                                
                                /**
                                 * Gets (as xml) the "id" element
                                 */
                                org.apache.xmlbeans.XmlString xgetId();
                                
                                /**
                                 * Sets the "id" element
                                 */
                                void setId(java.lang.String id);
                                
                                /**
                                 * Sets (as xml) the "id" element
                                 */
                                void xsetId(org.apache.xmlbeans.XmlString id);
                                
                                /**
                                 * Gets the "text" element
                                 */
                                java.lang.String getText();
                                
                                /**
                                 * Gets (as xml) the "text" element
                                 */
                                org.apache.xmlbeans.XmlString xgetText();
                                
                                /**
                                 * Sets the "text" element
                                 */
                                void setText(java.lang.String text);
                                
                                /**
                                 * Sets (as xml) the "text" element
                                 */
                                void xsetText(org.apache.xmlbeans.XmlString text);
                                
                                /**
                                 * A factory class with static methods for creating instances
                                 * of this type.
                                 */
                                
                                public static final class Factory
                                {
                                  public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item newInstance() {
                                    return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                                  
                                  public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item newInstance(org.apache.xmlbeans.XmlOptions options) {
                                    return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                                  
                                  private Factory() { } // No instance of this class allowed
                                }
                              }
                              
                              /**
                               * A factory class with static methods for creating instances
                               * of this type.
                               */
                              
                              public static final class Factory
                              {
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails newInstance() {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                                
                                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                                
                                private Factory() { } // No instance of this class allowed
                              }
                            }
                            
                            /**
                             * A factory class with static methods for creating instances
                             * of this type.
                             */
                            
                            public static final class Factory
                            {
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice newInstance() {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                              
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice newInstance(org.apache.xmlbeans.XmlOptions options) {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                              
                              private Factory() { } // No instance of this class allowed
                            }
                          }
                          
                          /**
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * An XML reportText(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public interface ReportText extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ReportText.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("reporttext42b1elemtype");
                          
                          /**
                           * Gets the "text" element
                           */
                          java.lang.String getText();
                          
                          /**
                           * Gets (as xml) the "text" element
                           */
                          org.apache.xmlbeans.XmlString xgetText();
                          
                          /**
                           * Sets the "text" element
                           */
                          void setText(java.lang.String text);
                          
                          /**
                           * Sets (as xml) the "text" element
                           */
                          void xsetText(org.apache.xmlbeans.XmlString text);
                          
                          /**
                           * Gets the "positive" element
                           */
                          boolean getPositive();
                          
                          /**
                           * Gets (as xml) the "positive" element
                           */
                          org.apache.xmlbeans.XmlBoolean xgetPositive();
                          
                          /**
                           * True if has "positive" element
                           */
                          boolean isSetPositive();
                          
                          /**
                           * Sets the "positive" element
                           */
                          void setPositive(boolean positive);
                          
                          /**
                           * Sets (as xml) the "positive" element
                           */
                          void xsetPositive(org.apache.xmlbeans.XmlBoolean positive);
                          
                          /**
                           * Unsets the "positive" element
                           */
                          void unsetPositive();
                          
                          /**
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * An XML action(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$Action.
                         */
                        public interface Action extends org.apache.xmlbeans.XmlString
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Action.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("action0a66elemtype");
                          
                          org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                          void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                          
                          static final Enum END = Enum.forString("End");
                          static final Enum NEXT = Enum.forString("Next");
                          static final Enum CHANGE = Enum.forString("Change");
                          static final Enum RESTART = Enum.forString("Restart");
                          static final Enum EARLY_EXIT = Enum.forString("EarlyExit");
                          static final Enum BACK = Enum.forString("Back");
                          
                          static final int INT_END = Enum.INT_END;
                          static final int INT_NEXT = Enum.INT_NEXT;
                          static final int INT_CHANGE = Enum.INT_CHANGE;
                          static final int INT_RESTART = Enum.INT_RESTART;
                          static final int INT_EARLY_EXIT = Enum.INT_EARLY_EXIT;
                          static final int INT_BACK = Enum.INT_BACK;
                          
                          /**
                           * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$Action.
                           * These enum values can be used as follows:
                           * <pre>
                           * enum.toString(); // returns the string value of the enum
                           * enum.intValue(); // returns an int value, useful for switches
                           * // e.g., case Enum.INT_END
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
                            
                            static final int INT_END = 1;
                            static final int INT_NEXT = 2;
                            static final int INT_CHANGE = 3;
                            static final int INT_RESTART = 4;
                            static final int INT_EARLY_EXIT = 5;
                            static final int INT_BACK = 6;
                            
                            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                                new org.apache.xmlbeans.StringEnumAbstractBase.Table
                            (
                              new Enum[]
                              {
                                new Enum("End", INT_END),
                                new Enum("Next", INT_NEXT),
                                new Enum("Change", INT_CHANGE),
                                new Enum("Restart", INT_RESTART),
                                new Enum("EarlyExit", INT_EARLY_EXIT),
                                new Enum("Back", INT_BACK),
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
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action newValue(java.lang.Object obj) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action) type.newValue( obj ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * An XML systemFlags(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public interface SystemFlags extends org.apache.xmlbeans.XmlObject
                        {
                          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemFlags.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("systemflags0398elemtype");
                          
                          /**
                           * Gets array of all "systemFlag" elements
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum[] getSystemFlagArray();
                          
                          /**
                           * Gets ith "systemFlag" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum getSystemFlagArray(int i);
                          
                          /**
                           * Gets (as xml) array of all "systemFlag" elements
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag[] xgetSystemFlagArray();
                          
                          /**
                           * Gets (as xml) ith "systemFlag" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag xgetSystemFlagArray(int i);
                          
                          /**
                           * Returns number of "systemFlag" element
                           */
                          int sizeOfSystemFlagArray();
                          
                          /**
                           * Sets array of all "systemFlag" element
                           */
                          void setSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum[] systemFlagArray);
                          
                          /**
                           * Sets ith "systemFlag" element
                           */
                          void setSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum systemFlag);
                          
                          /**
                           * Sets (as xml) array of all "systemFlag" element
                           */
                          void xsetSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag[] systemFlagArray);
                          
                          /**
                           * Sets (as xml) ith "systemFlag" element
                           */
                          void xsetSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag systemFlag);
                          
                          /**
                           * Inserts the value as the ith "systemFlag" element
                           */
                          void insertSystemFlag(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum systemFlag);
                          
                          /**
                           * Appends the value as the last "systemFlag" element
                           */
                          void addSystemFlag(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum systemFlag);
                          
                          /**
                           * Inserts and returns a new empty value (as xml) as the ith "systemFlag" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag insertNewSystemFlag(int i);
                          
                          /**
                           * Appends and returns a new empty value (as xml) as the last "systemFlag" element
                           */
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag addNewSystemFlag();
                          
                          /**
                           * Removes the ith "systemFlag" element
                           */
                          void removeSystemFlag(int i);
                          
                          /**
                           * An XML systemFlag(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$SystemFlags$SystemFlag.
                           */
                          public interface SystemFlag extends org.apache.xmlbeans.XmlString
                          {
                            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                              org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(SystemFlag.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("systemflag062felemtype");
                            
                            org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                            void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                            
                            static final Enum TRAUMA = Enum.forString("Trauma");
                            static final Enum NON_TRAUMA = Enum.forString("NonTrauma");
                            static final Enum SCENE_SAFE = Enum.forString("SceneSafe");
                            static final Enum SCENE_UNSAFE = Enum.forString("SceneUnsafe");
                            static final Enum POLICE = Enum.forString("Police");
                            static final Enum FIRE = Enum.forString("Fire");
                            static final Enum CATA_LEVEL_1 = Enum.forString("CATALevel1");
                            static final Enum CATA_LEVEL_2 = Enum.forString("CATALevel2");
                            static final Enum CATA_LEVEL_3 = Enum.forString("CATALevel3");
                            static final Enum CATA_LEVEL_4 = Enum.forString("CATALevel4");
                            static final Enum CATB_LEVEL_1 = Enum.forString("CATBLevel1");
                            static final Enum CATB_LEVEL_2 = Enum.forString("CATBLevel2");
                            static final Enum CATB_LEVEL_3 = Enum.forString("CATBLevel3");
                            static final Enum CATB_LEVEL_4 = Enum.forString("CATBLevel4");
                            static final Enum TRAPPED = Enum.forString("Trapped");
                            
                            static final int INT_TRAUMA = Enum.INT_TRAUMA;
                            static final int INT_NON_TRAUMA = Enum.INT_NON_TRAUMA;
                            static final int INT_SCENE_SAFE = Enum.INT_SCENE_SAFE;
                            static final int INT_SCENE_UNSAFE = Enum.INT_SCENE_UNSAFE;
                            static final int INT_POLICE = Enum.INT_POLICE;
                            static final int INT_FIRE = Enum.INT_FIRE;
                            static final int INT_CATA_LEVEL_1 = Enum.INT_CATA_LEVEL_1;
                            static final int INT_CATA_LEVEL_2 = Enum.INT_CATA_LEVEL_2;
                            static final int INT_CATA_LEVEL_3 = Enum.INT_CATA_LEVEL_3;
                            static final int INT_CATA_LEVEL_4 = Enum.INT_CATA_LEVEL_4;
                            static final int INT_CATB_LEVEL_1 = Enum.INT_CATB_LEVEL_1;
                            static final int INT_CATB_LEVEL_2 = Enum.INT_CATB_LEVEL_2;
                            static final int INT_CATB_LEVEL_3 = Enum.INT_CATB_LEVEL_3;
                            static final int INT_CATB_LEVEL_4 = Enum.INT_CATB_LEVEL_4;
                            static final int INT_TRAPPED = Enum.INT_TRAPPED;
                            
                            /**
                             * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$SystemFlags$SystemFlag.
                             * These enum values can be used as follows:
                             * <pre>
                             * enum.toString(); // returns the string value of the enum
                             * enum.intValue(); // returns an int value, useful for switches
                             * // e.g., case Enum.INT_TRAUMA
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
                              
                              static final int INT_TRAUMA = 1;
                              static final int INT_NON_TRAUMA = 2;
                              static final int INT_SCENE_SAFE = 3;
                              static final int INT_SCENE_UNSAFE = 4;
                              static final int INT_POLICE = 5;
                              static final int INT_FIRE = 6;
                              static final int INT_CATA_LEVEL_1 = 7;
                              static final int INT_CATA_LEVEL_2 = 8;
                              static final int INT_CATA_LEVEL_3 = 9;
                              static final int INT_CATA_LEVEL_4 = 10;
                              static final int INT_CATB_LEVEL_1 = 11;
                              static final int INT_CATB_LEVEL_2 = 12;
                              static final int INT_CATB_LEVEL_3 = 13;
                              static final int INT_CATB_LEVEL_4 = 14;
                              static final int INT_TRAPPED = 15;
                              
                              public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                                  new org.apache.xmlbeans.StringEnumAbstractBase.Table
                              (
                                new Enum[]
                                {
                                  new Enum("Trauma", INT_TRAUMA),
                                  new Enum("NonTrauma", INT_NON_TRAUMA),
                                  new Enum("SceneSafe", INT_SCENE_SAFE),
                                  new Enum("SceneUnsafe", INT_SCENE_UNSAFE),
                                  new Enum("Police", INT_POLICE),
                                  new Enum("Fire", INT_FIRE),
                                  new Enum("CATALevel1", INT_CATA_LEVEL_1),
                                  new Enum("CATALevel2", INT_CATA_LEVEL_2),
                                  new Enum("CATALevel3", INT_CATA_LEVEL_3),
                                  new Enum("CATALevel4", INT_CATA_LEVEL_4),
                                  new Enum("CATBLevel1", INT_CATB_LEVEL_1),
                                  new Enum("CATBLevel2", INT_CATB_LEVEL_2),
                                  new Enum("CATBLevel3", INT_CATB_LEVEL_3),
                                  new Enum("CATBLevel4", INT_CATB_LEVEL_4),
                                  new Enum("Trapped", INT_TRAPPED),
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
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag newValue(java.lang.Object obj) {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag) type.newValue( obj ); }
                              
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag newInstance() {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                              
                              public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag newInstance(org.apache.xmlbeans.XmlOptions options) {
                                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                              
                              private Factory() { } // No instance of this class allowed
                            }
                          }
                          
                          /**
                           * A factory class with static methods for creating instances
                           * of this type.
                           */
                          
                          public static final class Factory
                          {
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags newInstance() {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                            
                            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags newInstance(org.apache.xmlbeans.XmlOptions options) {
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                            
                            private Factory() { } // No instance of this class allowed
                          }
                        }
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * An XML origSite(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public interface OrigSite extends org.apache.xmlbeans.XmlObject
                    {
                      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(OrigSite.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("origsitedcbaelemtype");
                      
                      /**
                       * Gets the "siteId" element
                       */
                      java.lang.String getSiteId();
                      
                      /**
                       * Gets (as xml) the "siteId" element
                       */
                      org.apache.xmlbeans.XmlString xgetSiteId();
                      
                      /**
                       * Sets the "siteId" element
                       */
                      void setSiteId(java.lang.String siteId);
                      
                      /**
                       * Sets (as xml) the "siteId" element
                       */
                      void xsetSiteId(org.apache.xmlbeans.XmlString siteId);
                      
                      /**
                       * Gets the "siteName" element
                       */
                      java.lang.String getSiteName();
                      
                      /**
                       * Gets (as xml) the "siteName" element
                       */
                      org.apache.xmlbeans.XmlString xgetSiteName();
                      
                      /**
                       * Sets the "siteName" element
                       */
                      void setSiteName(java.lang.String siteName);
                      
                      /**
                       * Sets (as xml) the "siteName" element
                       */
                      void xsetSiteName(org.apache.xmlbeans.XmlString siteName);
                      
                      /**
                       * Gets the "caseId" element
                       */
                      java.lang.String getCaseId();
                      
                      /**
                       * Gets (as xml) the "caseId" element
                       */
                      org.apache.xmlbeans.XmlString xgetCaseId();
                      
                      /**
                       * Sets the "caseId" element
                       */
                      void setCaseId(java.lang.String caseId);
                      
                      /**
                       * Sets (as xml) the "caseId" element
                       */
                      void xsetCaseId(org.apache.xmlbeans.XmlString caseId);
                      
                      /**
                       * Gets the "pathwaysContentVersion" element
                       */
                      org.apache.xmlbeans.XmlObject getPathwaysContentVersion();
                      
                      /**
                       * Sets the "pathwaysContentVersion" element
                       */
                      void setPathwaysContentVersion(org.apache.xmlbeans.XmlObject pathwaysContentVersion);
                      
                      /**
                       * Appends and returns a new empty "pathwaysContentVersion" element
                       */
                      org.apache.xmlbeans.XmlObject addNewPathwaysContentVersion();
                      
                      /**
                       * Gets the "software" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software getSoftware();
                      
                      /**
                       * Sets the "software" element
                       */
                      void setSoftware(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software software);
                      
                      /**
                       * Appends and returns a new empty "software" element
                       */
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software addNewSoftware();
                      
                      /**
                       * An XML software(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is a complex type.
                       */
                      public interface Software extends org.apache.xmlbeans.XmlObject
                      {
                        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                          org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Software.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("softwaree13delemtype");
                        
                        /**
                         * Gets the "productName" element
                         */
                        java.lang.String getProductName();
                        
                        /**
                         * Gets (as xml) the "productName" element
                         */
                        org.apache.xmlbeans.XmlString xgetProductName();
                        
                        /**
                         * Sets the "productName" element
                         */
                        void setProductName(java.lang.String productName);
                        
                        /**
                         * Sets (as xml) the "productName" element
                         */
                        void xsetProductName(org.apache.xmlbeans.XmlString productName);
                        
                        /**
                         * Gets the "version" element
                         */
                        java.lang.String getVersion();
                        
                        /**
                         * Gets (as xml) the "version" element
                         */
                        org.apache.xmlbeans.XmlString xgetVersion();
                        
                        /**
                         * Sets the "version" element
                         */
                        void setVersion(java.lang.String version);
                        
                        /**
                         * Sets (as xml) the "version" element
                         */
                        void xsetVersion(org.apache.xmlbeans.XmlString version);
                        
                        /**
                         * A factory class with static methods for creating instances
                         * of this type.
                         */
                        
                        public static final class Factory
                        {
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software newInstance() {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                          
                          public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software newInstance(org.apache.xmlbeans.XmlOptions options) {
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                          
                          private Factory() { } // No instance of this class allowed
                        }
                      }
                      
                      /**
                       * A factory class with static methods for creating instances
                       * of this type.
                       */
                      
                      public static final class Factory
                      {
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite newInstance() {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                        
                        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite newInstance(org.apache.xmlbeans.XmlOptions options) {
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                        
                        private Factory() { } // No instance of this class allowed
                      }
                    }
                    
                    /**
                     * A factory class with static methods for creating instances
                     * of this type.
                     */
                    
                    public static final class Factory
                    {
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML demographics(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public interface Demographics extends org.apache.xmlbeans.XmlObject
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Demographics.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("demographics7732elemtype");
                
                /**
                 * Gets the "gender" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender.Enum getGender();
                
                /**
                 * Gets (as xml) the "gender" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender xgetGender();
                
                /**
                 * Sets the "gender" element
                 */
                void setGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender.Enum gender);
                
                /**
                 * Sets (as xml) the "gender" element
                 */
                void xsetGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender gender);
                
                /**
                 * Gets the "ageGroup" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup.Enum getAgeGroup();
                
                /**
                 * Gets (as xml) the "ageGroup" element
                 */
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup xgetAgeGroup();
                
                /**
                 * Sets the "ageGroup" element
                 */
                void setAgeGroup(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup.Enum ageGroup);
                
                /**
                 * Sets (as xml) the "ageGroup" element
                 */
                void xsetAgeGroup(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup ageGroup);
                
                /**
                 * An XML gender(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$Demographics$Gender.
                 */
                public interface Gender extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Gender.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("genderb135elemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum MALE = Enum.forString("Male");
                    static final Enum FEMALE = Enum.forString("Female");
                    
                    static final int INT_MALE = Enum.INT_MALE;
                    static final int INT_FEMALE = Enum.INT_FEMALE;
                    
                    /**
                     * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$Demographics$Gender.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_MALE
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
                      
                      static final int INT_MALE = 1;
                      static final int INT_FEMALE = 2;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("Male", INT_MALE),
                          new Enum("Female", INT_FEMALE),
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
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * An XML ageGroup(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$Demographics$AgeGroup.
                 */
                public interface AgeGroup extends org.apache.xmlbeans.XmlString
                {
                    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                      org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AgeGroup.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("agegroup3a56elemtype");
                    
                    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
                    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
                    
                    static final Enum ADULT = Enum.forString("Adult");
                    static final Enum CHILD = Enum.forString("Child");
                    static final Enum TODDLER = Enum.forString("Toddler");
                    static final Enum INFANT = Enum.forString("Infant");
                    static final Enum NEONATE = Enum.forString("Neonate");
                    
                    static final int INT_ADULT = Enum.INT_ADULT;
                    static final int INT_CHILD = Enum.INT_CHILD;
                    static final int INT_TODDLER = Enum.INT_TODDLER;
                    static final int INT_INFANT = Enum.INT_INFANT;
                    static final int INT_NEONATE = Enum.INT_NEONATE;
                    
                    /**
                     * Enumeration value class for org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$Demographics$AgeGroup.
                     * These enum values can be used as follows:
                     * <pre>
                     * enum.toString(); // returns the string value of the enum
                     * enum.intValue(); // returns an int value, useful for switches
                     * // e.g., case Enum.INT_ADULT
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
                      
                      static final int INT_ADULT = 1;
                      static final int INT_CHILD = 2;
                      static final int INT_TODDLER = 3;
                      static final int INT_INFANT = 4;
                      static final int INT_NEONATE = 5;
                      
                      public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                          new org.apache.xmlbeans.StringEnumAbstractBase.Table
                      (
                        new Enum[]
                        {
                          new Enum("Adult", INT_ADULT),
                          new Enum("Child", INT_CHILD),
                          new Enum("Toddler", INT_TODDLER),
                          new Enum("Infant", INT_INFANT),
                          new Enum("Neonate", INT_NEONATE),
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
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup newValue(java.lang.Object obj) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup) type.newValue( obj ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup newInstance() {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                      
                      public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup newInstance(org.apache.xmlbeans.XmlOptions options) {
                        return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                      
                      private Factory() { } // No instance of this class allowed
                    }
                }
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * An XML site(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public interface Site extends org.apache.xmlbeans.XmlObject
        {
            public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Site.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("site7739elemtype");
            
            /**
             * Gets the "id" element
             */
            java.lang.String getId();
            
            /**
             * Gets (as xml) the "id" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id xgetId();
            
            /**
             * Sets the "id" element
             */
            void setId(java.lang.String id);
            
            /**
             * Sets (as xml) the "id" element
             */
            void xsetId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id id);
            
            /**
             * Gets the "name" element
             */
            java.lang.String getName();
            
            /**
             * Gets (as xml) the "name" element
             */
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name xgetName();
            
            /**
             * Sets the "name" element
             */
            void setName(java.lang.String name);
            
            /**
             * Sets (as xml) the "name" element
             */
            void xsetName(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name name);
            
            /**
             * An XML id(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Site$Id.
             */
            public interface Id extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Id.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("id74b0elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * An XML name(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Site$Name.
             */
            public interface Name extends org.apache.xmlbeans.XmlString
            {
                public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
                    org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Name.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s3EC5609498368DB214E7504E36D525E2").resolveHandle("name7820elemtype");
                
                /**
                 * A factory class with static methods for creating instances
                 * of this type.
                 */
                
                public static final class Factory
                {
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name newValue(java.lang.Object obj) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name) type.newValue( obj ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name newInstance() {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                    
                    public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name newInstance(org.apache.xmlbeans.XmlOptions options) {
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                    
                    private Factory() { } // No instance of this class allowed
                }
            }
            
            /**
             * A factory class with static methods for creating instances
             * of this type.
             */
            
            public static final class Factory
            {
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site newInstance() {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
                
                public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site newInstance(org.apache.xmlbeans.XmlOptions options) {
                  return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
                
                private Factory() { } // No instance of this class allowed
            }
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase newInstance() {
              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument newInstance() {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
