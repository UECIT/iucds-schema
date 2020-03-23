/*
 * An XML document type.
 * Localname: PathwaysCase
 * Namespace: http://nhspathways.org/webservices/pathways/pathwaysCase
 * Java type: org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument
 *
 * Automatically generated - do not modify.
 */
package org.nhspathways.webservices.pathways.pathwayscase.impl;
/**
 * A document containing one PathwaysCase(@http://nhspathways.org/webservices/pathways/pathwaysCase) element.
 *
 * This is a complex type.
 */
public class PathwaysCaseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument
{
    private static final long serialVersionUID = 1L;
    
    public PathwaysCaseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATHWAYSCASE$0 = 
        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "PathwaysCase");
    
    
    /**
     * Gets the "PathwaysCase" element
     */
    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase getPathwaysCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase target = null;
            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase)get_store().find_element_user(PATHWAYSCASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PathwaysCase" element
     */
    public void setPathwaysCase(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase pathwaysCase)
    {
        generatedSetterHelperImpl(pathwaysCase, PATHWAYSCASE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "PathwaysCase" element
     */
    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase addNewPathwaysCase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase target = null;
            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase)get_store().add_element_user(PATHWAYSCASE$0);
            return target;
        }
    }
    /**
     * An XML PathwaysCase(@http://nhspathways.org/webservices/pathways/pathwaysCase).
     *
     * This is a complex type.
     */
    public static class PathwaysCaseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase
    {
        private static final long serialVersionUID = 1L;
        
        public PathwaysCaseImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName DISPOSITIONOVERRIDECODE$0 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "dispositionOverrideCode");
        private static final javax.xml.namespace.QName APPOINTMENT$2 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "appointment");
        private static final javax.xml.namespace.QName SERVICEDESTINATION$4 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "serviceDestination");
        private static final javax.xml.namespace.QName MESSAGESTATUS$6 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "messageStatus");
        private static final javax.xml.namespace.QName CASERECEIVESTART$8 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "caseReceiveStart");
        private static final javax.xml.namespace.QName CASERECEIVEEND$10 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "caseReceiveEnd");
        private static final javax.xml.namespace.QName OUTCOME$12 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "outcome");
        private static final javax.xml.namespace.QName CASEDETAILS$14 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "caseDetails");
        private static final javax.xml.namespace.QName PATIENT$16 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "patient");
        private static final javax.xml.namespace.QName RETURNPHONE$18 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "returnPhone");
        private static final javax.xml.namespace.QName BILLINGADDRESS$20 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "billingAddress");
        private static final javax.xml.namespace.QName PATHWAYDETAILS$22 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "pathwayDetails");
        private static final javax.xml.namespace.QName SITE$24 = 
            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "site");
        
        
        /**
         * Gets the "dispositionOverrideCode" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode getDispositionOverrideCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode)get_store().find_element_user(DISPOSITIONOVERRIDECODE$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "dispositionOverrideCode" element
         */
        public boolean isSetDispositionOverrideCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(DISPOSITIONOVERRIDECODE$0) != 0;
            }
        }
        
        /**
         * Sets the "dispositionOverrideCode" element
         */
        public void setDispositionOverrideCode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode dispositionOverrideCode)
        {
            generatedSetterHelperImpl(dispositionOverrideCode, DISPOSITIONOVERRIDECODE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "dispositionOverrideCode" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode addNewDispositionOverrideCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode)get_store().add_element_user(DISPOSITIONOVERRIDECODE$0);
                return target;
            }
        }
        
        /**
         * Unsets the "dispositionOverrideCode" element
         */
        public void unsetDispositionOverrideCode()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(DISPOSITIONOVERRIDECODE$0, 0);
            }
        }
        
        /**
         * Gets the "appointment" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment getAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment)get_store().find_element_user(APPOINTMENT$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "appointment" element
         */
        public boolean isSetAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(APPOINTMENT$2) != 0;
            }
        }
        
        /**
         * Sets the "appointment" element
         */
        public void setAppointment(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment appointment)
        {
            generatedSetterHelperImpl(appointment, APPOINTMENT$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "appointment" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment addNewAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment)get_store().add_element_user(APPOINTMENT$2);
                return target;
            }
        }
        
        /**
         * Unsets the "appointment" element
         */
        public void unsetAppointment()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(APPOINTMENT$2, 0);
            }
        }
        
        /**
         * Gets the "serviceDestination" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination getServiceDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination)get_store().find_element_user(SERVICEDESTINATION$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "serviceDestination" element
         */
        public void setServiceDestination(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination serviceDestination)
        {
            generatedSetterHelperImpl(serviceDestination, SERVICEDESTINATION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "serviceDestination" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination addNewServiceDestination()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination)get_store().add_element_user(SERVICEDESTINATION$4);
                return target;
            }
        }
        
        /**
         * Gets the "messageStatus" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus.Enum getMessageStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGESTATUS$6, 0);
                if (target == null)
                {
                    return null;
                }
                return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus.Enum)target.getEnumValue();
            }
        }
        
        /**
         * Gets (as xml) the "messageStatus" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus xgetMessageStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus)get_store().find_element_user(MESSAGESTATUS$6, 0);
                return target;
            }
        }
        
        /**
         * Sets the "messageStatus" element
         */
        public void setMessageStatus(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus.Enum messageStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGESTATUS$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGESTATUS$6);
                }
                target.setEnumValue(messageStatus);
            }
        }
        
        /**
         * Sets (as xml) the "messageStatus" element
         */
        public void xsetMessageStatus(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus messageStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus)get_store().find_element_user(MESSAGESTATUS$6, 0);
                if (target == null)
                {
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus)get_store().add_element_user(MESSAGESTATUS$6);
                }
                target.set(messageStatus);
            }
        }
        
        /**
         * Gets the "caseReceiveStart" element
         */
        public java.util.Calendar getCaseReceiveStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASERECEIVESTART$8, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "caseReceiveStart" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCaseReceiveStart()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CASERECEIVESTART$8, 0);
                return target;
            }
        }
        
        /**
         * Sets the "caseReceiveStart" element
         */
        public void setCaseReceiveStart(java.util.Calendar caseReceiveStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASERECEIVESTART$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASERECEIVESTART$8);
                }
                target.setCalendarValue(caseReceiveStart);
            }
        }
        
        /**
         * Sets (as xml) the "caseReceiveStart" element
         */
        public void xsetCaseReceiveStart(org.apache.xmlbeans.XmlDateTime caseReceiveStart)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CASERECEIVESTART$8, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CASERECEIVESTART$8);
                }
                target.set(caseReceiveStart);
            }
        }
        
        /**
         * Gets the "caseReceiveEnd" element
         */
        public java.util.Calendar getCaseReceiveEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASERECEIVEEND$10, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getCalendarValue();
            }
        }
        
        /**
         * Gets (as xml) the "caseReceiveEnd" element
         */
        public org.apache.xmlbeans.XmlDateTime xgetCaseReceiveEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CASERECEIVEEND$10, 0);
                return target;
            }
        }
        
        /**
         * True if has "caseReceiveEnd" element
         */
        public boolean isSetCaseReceiveEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CASERECEIVEEND$10) != 0;
            }
        }
        
        /**
         * Sets the "caseReceiveEnd" element
         */
        public void setCaseReceiveEnd(java.util.Calendar caseReceiveEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASERECEIVEEND$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASERECEIVEEND$10);
                }
                target.setCalendarValue(caseReceiveEnd);
            }
        }
        
        /**
         * Sets (as xml) the "caseReceiveEnd" element
         */
        public void xsetCaseReceiveEnd(org.apache.xmlbeans.XmlDateTime caseReceiveEnd)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDateTime target = null;
                target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(CASERECEIVEEND$10, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(CASERECEIVEEND$10);
                }
                target.set(caseReceiveEnd);
            }
        }
        
        /**
         * Unsets the "caseReceiveEnd" element
         */
        public void unsetCaseReceiveEnd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CASERECEIVEEND$10, 0);
            }
        }
        
        /**
         * Gets the "outcome" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome getOutcome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome)get_store().find_element_user(OUTCOME$12, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "outcome" element
         */
        public boolean isSetOutcome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OUTCOME$12) != 0;
            }
        }
        
        /**
         * Sets the "outcome" element
         */
        public void setOutcome(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome outcome)
        {
            generatedSetterHelperImpl(outcome, OUTCOME$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "outcome" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome addNewOutcome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome)get_store().add_element_user(OUTCOME$12);
                return target;
            }
        }
        
        /**
         * Unsets the "outcome" element
         */
        public void unsetOutcome()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OUTCOME$12, 0);
            }
        }
        
        /**
         * Gets the "caseDetails" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails getCaseDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails)get_store().find_element_user(CASEDETAILS$14, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "caseDetails" element
         */
        public void setCaseDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails caseDetails)
        {
            generatedSetterHelperImpl(caseDetails, CASEDETAILS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "caseDetails" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails addNewCaseDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails)get_store().add_element_user(CASEDETAILS$14);
                return target;
            }
        }
        
        /**
         * Gets the "patient" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient getPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient)get_store().find_element_user(PATIENT$16, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "patient" element
         */
        public boolean isSetPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATIENT$16) != 0;
            }
        }
        
        /**
         * Sets the "patient" element
         */
        public void setPatient(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient patient)
        {
            generatedSetterHelperImpl(patient, PATIENT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "patient" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient addNewPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient)get_store().add_element_user(PATIENT$16);
                return target;
            }
        }
        
        /**
         * Unsets the "patient" element
         */
        public void unsetPatient()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATIENT$16, 0);
            }
        }
        
        /**
         * Gets the "returnPhone" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone getReturnPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone)get_store().find_element_user(RETURNPHONE$18, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "returnPhone" element
         */
        public void setReturnPhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone returnPhone)
        {
            generatedSetterHelperImpl(returnPhone, RETURNPHONE$18, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "returnPhone" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone addNewReturnPhone()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone)get_store().add_element_user(RETURNPHONE$18);
                return target;
            }
        }
        
        /**
         * Gets the "billingAddress" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress getBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress)get_store().find_element_user(BILLINGADDRESS$20, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "billingAddress" element
         */
        public boolean isSetBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BILLINGADDRESS$20) != 0;
            }
        }
        
        /**
         * Sets the "billingAddress" element
         */
        public void setBillingAddress(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress billingAddress)
        {
            generatedSetterHelperImpl(billingAddress, BILLINGADDRESS$20, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "billingAddress" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress addNewBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress)get_store().add_element_user(BILLINGADDRESS$20);
                return target;
            }
        }
        
        /**
         * Unsets the "billingAddress" element
         */
        public void unsetBillingAddress()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BILLINGADDRESS$20, 0);
            }
        }
        
        /**
         * Gets the "pathwayDetails" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails getPathwayDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails)get_store().find_element_user(PATHWAYDETAILS$22, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "pathwayDetails" element
         */
        public boolean isSetPathwayDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(PATHWAYDETAILS$22) != 0;
            }
        }
        
        /**
         * Sets the "pathwayDetails" element
         */
        public void setPathwayDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails pathwayDetails)
        {
            generatedSetterHelperImpl(pathwayDetails, PATHWAYDETAILS$22, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "pathwayDetails" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails addNewPathwayDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails)get_store().add_element_user(PATHWAYDETAILS$22);
                return target;
            }
        }
        
        /**
         * Unsets the "pathwayDetails" element
         */
        public void unsetPathwayDetails()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(PATHWAYDETAILS$22, 0);
            }
        }
        
        /**
         * Gets the "site" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site getSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site)get_store().find_element_user(SITE$24, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "site" element
         */
        public void setSite(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site site)
        {
            generatedSetterHelperImpl(site, SITE$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "site" element
         */
        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site addNewSite()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site target = null;
                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site)get_store().add_element_user(SITE$24);
                return target;
            }
        }
        /**
         * An XML dispositionOverrideCode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class DispositionOverrideCodeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.DispositionOverrideCode
        {
            private static final long serialVersionUID = 1L;
            
            public DispositionOverrideCodeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CODE$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "code");
            private static final javax.xml.namespace.QName REASON$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "reason");
            
            
            /**
             * Gets the "code" element
             */
            public java.lang.String getCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "code" element
             */
            public org.apache.xmlbeans.XmlString xgetCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "code" element
             */
            public void setCode(java.lang.String code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$0);
                    }
                    target.setStringValue(code);
                }
            }
            
            /**
             * Sets (as xml) the "code" element
             */
            public void xsetCode(org.apache.xmlbeans.XmlString code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$0);
                    }
                    target.set(code);
                }
            }
            
            /**
             * Gets the "reason" element
             */
            public java.lang.String getReason()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "reason" element
             */
            public org.apache.xmlbeans.XmlString xgetReason()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "reason" element
             */
            public boolean isSetReason()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REASON$2) != 0;
                }
            }
            
            /**
             * Sets the "reason" element
             */
            public void setReason(java.lang.String reason)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REASON$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REASON$2);
                    }
                    target.setStringValue(reason);
                }
            }
            
            /**
             * Sets (as xml) the "reason" element
             */
            public void xsetReason(org.apache.xmlbeans.XmlString reason)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REASON$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REASON$2);
                    }
                    target.set(reason);
                }
            }
            
            /**
             * Unsets the "reason" element
             */
            public void unsetReason()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REASON$2, 0);
                }
            }
        }
        /**
         * An XML appointment(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class AppointmentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Appointment
        {
            private static final long serialVersionUID = 1L;
            
            public AppointmentImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName APPOINTMENTREF$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "appointmentRef");
            private static final javax.xml.namespace.QName ATTRIBUTABLEDELAY$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "attributableDelay");
            
            
            /**
             * Gets the "appointmentRef" element
             */
            public java.lang.String getAppointmentRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPOINTMENTREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "appointmentRef" element
             */
            public org.apache.xmlbeans.XmlString xgetAppointmentRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPOINTMENTREF$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "appointmentRef" element
             */
            public void setAppointmentRef(java.lang.String appointmentRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APPOINTMENTREF$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APPOINTMENTREF$0);
                    }
                    target.setStringValue(appointmentRef);
                }
            }
            
            /**
             * Sets (as xml) the "appointmentRef" element
             */
            public void xsetAppointmentRef(org.apache.xmlbeans.XmlString appointmentRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APPOINTMENTREF$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APPOINTMENTREF$0);
                    }
                    target.set(appointmentRef);
                }
            }
            
            /**
             * Gets the "attributableDelay" element
             */
            public boolean getAttributableDelay()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTABLEDELAY$2, 0);
                    if (target == null)
                    {
                      return false;
                    }
                    return target.getBooleanValue();
                }
            }
            
            /**
             * Gets (as xml) the "attributableDelay" element
             */
            public org.apache.xmlbeans.XmlBoolean xgetAttributableDelay()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ATTRIBUTABLEDELAY$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "attributableDelay" element
             */
            public boolean isSetAttributableDelay()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ATTRIBUTABLEDELAY$2) != 0;
                }
            }
            
            /**
             * Sets the "attributableDelay" element
             */
            public void setAttributableDelay(boolean attributableDelay)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ATTRIBUTABLEDELAY$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ATTRIBUTABLEDELAY$2);
                    }
                    target.setBooleanValue(attributableDelay);
                }
            }
            
            /**
             * Sets (as xml) the "attributableDelay" element
             */
            public void xsetAttributableDelay(org.apache.xmlbeans.XmlBoolean attributableDelay)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlBoolean target = null;
                    target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ATTRIBUTABLEDELAY$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ATTRIBUTABLEDELAY$2);
                    }
                    target.set(attributableDelay);
                }
            }
            
            /**
             * Unsets the "attributableDelay" element
             */
            public void unsetAttributableDelay()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ATTRIBUTABLEDELAY$2, 0);
                }
            }
        }
        /**
         * An XML serviceDestination(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class ServiceDestinationImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ServiceDestination
        {
            private static final long serialVersionUID = 1L;
            
            public ServiceDestinationImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName NAME$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
            private static final javax.xml.namespace.QName CODE$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "code");
            
            
            /**
             * Gets the "name" element
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" element
             */
            public org.apache.xmlbeans.XmlString xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "name" element
             */
            public boolean isSetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NAME$0) != 0;
                }
            }
            
            /**
             * Sets the "name" element
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" element
             */
            public void xsetName(org.apache.xmlbeans.XmlString name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                    }
                    target.set(name);
                }
            }
            
            /**
             * Unsets the "name" element
             */
            public void unsetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NAME$0, 0);
                }
            }
            
            /**
             * Gets the "code" element
             */
            public java.lang.String getCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "code" element
             */
            public org.apache.xmlbeans.XmlString xgetCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "code" element
             */
            public void setCode(java.lang.String code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
                    }
                    target.setStringValue(code);
                }
            }
            
            /**
             * Sets (as xml) the "code" element
             */
            public void xsetCode(org.apache.xmlbeans.XmlString code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$2);
                    }
                    target.set(code);
                }
            }
        }
        /**
         * An XML messageStatus(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$MessageStatus.
         */
        public static class MessageStatusImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.MessageStatus
        {
            private static final long serialVersionUID = 1L;
            
            public MessageStatusImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType, false);
            }
            
            protected MessageStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
            {
                super(sType, b);
            }
        }
        /**
         * An XML outcome(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class OutcomeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome
        {
            private static final long serialVersionUID = 1L;
            
            public OutcomeImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName TITLE$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "title");
            private static final javax.xml.namespace.QName CODE$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "code");
            
            
            /**
             * Gets the "title" element
             */
            public java.lang.String getTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "title" element
             */
            public org.apache.xmlbeans.XmlString xgetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "title" element
             */
            public boolean isSetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(TITLE$0) != 0;
                }
            }
            
            /**
             * Sets the "title" element
             */
            public void setTitle(java.lang.String title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
                    }
                    target.setStringValue(title);
                }
            }
            
            /**
             * Sets (as xml) the "title" element
             */
            public void xsetTitle(org.apache.xmlbeans.XmlString title)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
                    }
                    target.set(title);
                }
            }
            
            /**
             * Unsets the "title" element
             */
            public void unsetTitle()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(TITLE$0, 0);
                }
            }
            
            /**
             * Gets the "code" element
             */
            public java.lang.String getCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "code" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code xgetCode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code)get_store().find_element_user(CODE$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "code" element
             */
            public void setCode(java.lang.String code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
                    }
                    target.setStringValue(code);
                }
            }
            
            /**
             * Sets (as xml) the "code" element
             */
            public void xsetCode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code code)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code)get_store().find_element_user(CODE$2, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code)get_store().add_element_user(CODE$2);
                    }
                    target.set(code);
                }
            }
            /**
             * An XML code(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Outcome$Code.
             */
            public static class CodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Outcome.Code
            {
                private static final long serialVersionUID = 1L;
                
                public CodeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected CodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML caseDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class CaseDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails
        {
            private static final long serialVersionUID = 1L;
            
            public CaseDetailsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName CASEREF$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "caseRef");
            private static final javax.xml.namespace.QName CASEID$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "caseId");
            private static final javax.xml.namespace.QName ADDRESS$4 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "address");
            private static final javax.xml.namespace.QName CONDITION$6 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "condition");
            private static final javax.xml.namespace.QName CONTACTDETAILS$8 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "contactDetails");
            
            
            /**
             * Gets the "caseRef" element
             */
            public java.lang.String getCaseRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEREF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "caseRef" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef xgetCaseRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef)get_store().find_element_user(CASEREF$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "caseRef" element
             */
            public void setCaseRef(java.lang.String caseRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEREF$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEREF$0);
                    }
                    target.setStringValue(caseRef);
                }
            }
            
            /**
             * Sets (as xml) the "caseRef" element
             */
            public void xsetCaseRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef caseRef)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef)get_store().find_element_user(CASEREF$0, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef)get_store().add_element_user(CASEREF$0);
                    }
                    target.set(caseRef);
                }
            }
            
            /**
             * Gets the "caseId" element
             */
            public java.lang.String getCaseId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEID$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "caseId" element
             */
            public org.apache.xmlbeans.XmlString xgetCaseId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEID$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "caseId" element
             */
            public boolean isSetCaseId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(CASEID$2) != 0;
                }
            }
            
            /**
             * Sets the "caseId" element
             */
            public void setCaseId(java.lang.String caseId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEID$2);
                    }
                    target.setStringValue(caseId);
                }
            }
            
            /**
             * Sets (as xml) the "caseId" element
             */
            public void xsetCaseId(org.apache.xmlbeans.XmlString caseId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEID$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEID$2);
                    }
                    target.set(caseId);
                }
            }
            
            /**
             * Unsets the "caseId" element
             */
            public void unsetCaseId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(CASEID$2, 0);
                }
            }
            
            /**
             * Gets the "address" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address getAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address)get_store().find_element_user(ADDRESS$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "address" element
             */
            public boolean isSetAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ADDRESS$4) != 0;
                }
            }
            
            /**
             * Sets the "address" element
             */
            public void setAddress(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address address)
            {
                generatedSetterHelperImpl(address, ADDRESS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "address" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address addNewAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address)get_store().add_element_user(ADDRESS$4);
                    return target;
                }
            }
            
            /**
             * Unsets the "address" element
             */
            public void unsetAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ADDRESS$4, 0);
                }
            }
            
            /**
             * Gets the "condition" element
             */
            public java.lang.String getCondition()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITION$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "condition" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition xgetCondition()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition)get_store().find_element_user(CONDITION$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "condition" element
             */
            public void setCondition(java.lang.String condition)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONDITION$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONDITION$6);
                    }
                    target.setStringValue(condition);
                }
            }
            
            /**
             * Sets (as xml) the "condition" element
             */
            public void xsetCondition(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition condition)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition)get_store().find_element_user(CONDITION$6, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition)get_store().add_element_user(CONDITION$6);
                    }
                    target.set(condition);
                }
            }
            
            /**
             * Gets the "contactDetails" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails getContactDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails)get_store().find_element_user(CONTACTDETAILS$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "contactDetails" element
             */
            public void setContactDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails contactDetails)
            {
                generatedSetterHelperImpl(contactDetails, CONTACTDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "contactDetails" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails addNewContactDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails)get_store().add_element_user(CONTACTDETAILS$8);
                    return target;
                }
            }
            /**
             * An XML caseRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$CaseRef.
             */
            public static class CaseRefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.CaseRef
            {
                private static final long serialVersionUID = 1L;
                
                public CaseRefImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected CaseRefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML address(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address
            {
                private static final long serialVersionUID = 1L;
                
                public AddressImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName BUILDING$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "building");
                private static final javax.xml.namespace.QName STREET$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "street");
                private static final javax.xml.namespace.QName LOCALITY$4 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "locality");
                private static final javax.xml.namespace.QName TOWN$6 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "town");
                private static final javax.xml.namespace.QName COUNTY$8 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "county");
                private static final javax.xml.namespace.QName POSTCODE$10 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "postcode");
                private static final javax.xml.namespace.QName MAPREF$12 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "mapRef");
                private static final javax.xml.namespace.QName COUNTRY$14 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "country");
                private static final javax.xml.namespace.QName DIRECTIONS$16 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "directions");
                
                
                /**
                 * Gets the "building" element
                 */
                public java.lang.String getBuilding()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDING$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "building" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building xgetBuilding()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building)get_store().find_element_user(BUILDING$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "building" element
                 */
                public void setBuilding(java.lang.String building)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDING$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILDING$0);
                      }
                      target.setStringValue(building);
                    }
                }
                
                /**
                 * Sets (as xml) the "building" element
                 */
                public void xsetBuilding(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building building)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building)get_store().find_element_user(BUILDING$0, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building)get_store().add_element_user(BUILDING$0);
                      }
                      target.set(building);
                    }
                }
                
                /**
                 * Gets the "street" element
                 */
                public java.lang.String getStreet()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "street" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street xgetStreet()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street)get_store().find_element_user(STREET$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "street" element
                 */
                public void setStreet(java.lang.String street)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$2);
                      }
                      target.setStringValue(street);
                    }
                }
                
                /**
                 * Sets (as xml) the "street" element
                 */
                public void xsetStreet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street street)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street)get_store().find_element_user(STREET$2, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street)get_store().add_element_user(STREET$2);
                      }
                      target.set(street);
                    }
                }
                
                /**
                 * Gets the "locality" element
                 */
                public java.lang.String getLocality()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "locality" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality xgetLocality()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality)get_store().find_element_user(LOCALITY$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "locality" element
                 */
                public void setLocality(java.lang.String locality)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$4);
                      }
                      target.setStringValue(locality);
                    }
                }
                
                /**
                 * Sets (as xml) the "locality" element
                 */
                public void xsetLocality(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality locality)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality)get_store().find_element_user(LOCALITY$4, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality)get_store().add_element_user(LOCALITY$4);
                      }
                      target.set(locality);
                    }
                }
                
                /**
                 * Gets the "town" element
                 */
                public java.lang.String getTown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOWN$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "town" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town xgetTown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town)get_store().find_element_user(TOWN$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "town" element
                 */
                public void setTown(java.lang.String town)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOWN$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOWN$6);
                      }
                      target.setStringValue(town);
                    }
                }
                
                /**
                 * Sets (as xml) the "town" element
                 */
                public void xsetTown(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town town)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town)get_store().find_element_user(TOWN$6, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town)get_store().add_element_user(TOWN$6);
                      }
                      target.set(town);
                    }
                }
                
                /**
                 * Gets the "county" element
                 */
                public java.lang.String getCounty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "county" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County xgetCounty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County)get_store().find_element_user(COUNTY$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "county" element
                 */
                public void setCounty(java.lang.String county)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTY$8);
                      }
                      target.setStringValue(county);
                    }
                }
                
                /**
                 * Sets (as xml) the "county" element
                 */
                public void xsetCounty(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County county)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County)get_store().find_element_user(COUNTY$8, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County)get_store().add_element_user(COUNTY$8);
                      }
                      target.set(county);
                    }
                }
                
                /**
                 * Gets the "postcode" element
                 */
                public java.lang.String getPostcode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "postcode" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode xgetPostcode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode)get_store().find_element_user(POSTCODE$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "postcode" element
                 */
                public void setPostcode(java.lang.String postcode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$10);
                      }
                      target.setStringValue(postcode);
                    }
                }
                
                /**
                 * Sets (as xml) the "postcode" element
                 */
                public void xsetPostcode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode postcode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode)get_store().find_element_user(POSTCODE$10, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode)get_store().add_element_user(POSTCODE$10);
                      }
                      target.set(postcode);
                    }
                }
                
                /**
                 * Gets the "mapRef" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef getMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef)get_store().find_element_user(MAPREF$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "mapRef" element
                 */
                public boolean isSetMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MAPREF$12) != 0;
                    }
                }
                
                /**
                 * Sets the "mapRef" element
                 */
                public void setMapRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef mapRef)
                {
                    generatedSetterHelperImpl(mapRef, MAPREF$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "mapRef" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef addNewMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef)get_store().add_element_user(MAPREF$12);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "mapRef" element
                 */
                public void unsetMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MAPREF$12, 0);
                    }
                }
                
                /**
                 * Gets the "country" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country getCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country)get_store().find_element_user(COUNTRY$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "country" element
                 */
                public boolean isSetCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(COUNTRY$14) != 0;
                    }
                }
                
                /**
                 * Sets the "country" element
                 */
                public void setCountry(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country country)
                {
                    generatedSetterHelperImpl(country, COUNTRY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "country" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country addNewCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country)get_store().add_element_user(COUNTRY$14);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "country" element
                 */
                public void unsetCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(COUNTRY$14, 0);
                    }
                }
                
                /**
                 * Gets the "directions" element
                 */
                public java.lang.String getDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTIONS$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "directions" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions xgetDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions)get_store().find_element_user(DIRECTIONS$16, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "directions" element
                 */
                public boolean isSetDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIRECTIONS$16) != 0;
                    }
                }
                
                /**
                 * Sets the "directions" element
                 */
                public void setDirections(java.lang.String directions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTIONS$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTIONS$16);
                      }
                      target.setStringValue(directions);
                    }
                }
                
                /**
                 * Sets (as xml) the "directions" element
                 */
                public void xsetDirections(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions directions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions)get_store().find_element_user(DIRECTIONS$16, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions)get_store().add_element_user(DIRECTIONS$16);
                      }
                      target.set(directions);
                    }
                }
                
                /**
                 * Unsets the "directions" element
                 */
                public void unsetDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIRECTIONS$16, 0);
                    }
                }
                /**
                 * An XML building(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Building.
                 */
                public static class BuildingImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Building
                {
                    private static final long serialVersionUID = 1L;
                    
                    public BuildingImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected BuildingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML street(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Street.
                 */
                public static class StreetImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Street
                {
                    private static final long serialVersionUID = 1L;
                    
                    public StreetImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected StreetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML locality(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Locality.
                 */
                public static class LocalityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Locality
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LocalityImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected LocalityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML town(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Town.
                 */
                public static class TownImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Town
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TownImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TownImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML county(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$County.
                 */
                public static class CountyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.County
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CountyImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CountyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML postcode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Postcode.
                 */
                public static class PostcodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Postcode
                {
                    private static final long serialVersionUID = 1L;
                    
                    public PostcodeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected PostcodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML mapRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class MapRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.MapRef
                {
                    private static final long serialVersionUID = 1L;
                    
                    public MapRefImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName LONGITUDE$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "longitude");
                    private static final javax.xml.namespace.QName LATITUDE$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "latitude");
                    
                    
                    /**
                     * Gets the "longitude" element
                     */
                    public org.apache.xmlbeans.XmlObject getLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LONGITUDE$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "longitude" element
                     */
                    public boolean isSetLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(LONGITUDE$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "longitude" element
                     */
                    public void setLongitude(org.apache.xmlbeans.XmlObject longitude)
                    {
                      generatedSetterHelperImpl(longitude, LONGITUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "longitude" element
                     */
                    public org.apache.xmlbeans.XmlObject addNewLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LONGITUDE$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "longitude" element
                     */
                    public void unsetLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(LONGITUDE$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "latitude" element
                     */
                    public org.apache.xmlbeans.XmlObject getLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LATITUDE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "latitude" element
                     */
                    public boolean isSetLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(LATITUDE$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "latitude" element
                     */
                    public void setLatitude(org.apache.xmlbeans.XmlObject latitude)
                    {
                      generatedSetterHelperImpl(latitude, LATITUDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "latitude" element
                     */
                    public org.apache.xmlbeans.XmlObject addNewLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LATITUDE$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "latitude" element
                     */
                    public void unsetLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(LATITUDE$2, 0);
                      }
                    }
                }
                /**
                 * An XML country(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class CountryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CountryImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NAME$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
                    private static final javax.xml.namespace.QName ISOALPHA2$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "isoAlpha2");
                    
                    
                    /**
                     * Gets the "name" element
                     */
                    public java.lang.String getName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    public org.apache.xmlbeans.XmlString xgetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "name" element
                     */
                    public void setName(java.lang.String name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                        }
                        target.setStringValue(name);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    public void xsetName(org.apache.xmlbeans.XmlString name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                        }
                        target.set(name);
                      }
                    }
                    
                    /**
                     * Gets the "isoAlpha2" element
                     */
                    public java.lang.String getIsoAlpha2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOALPHA2$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "isoAlpha2" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 xgetIsoAlpha2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2)get_store().find_element_user(ISOALPHA2$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "isoAlpha2" element
                     */
                    public void setIsoAlpha2(java.lang.String isoAlpha2)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOALPHA2$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOALPHA2$2);
                        }
                        target.setStringValue(isoAlpha2);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "isoAlpha2" element
                     */
                    public void xsetIsoAlpha2(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 isoAlpha2)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2 target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2)get_store().find_element_user(ISOALPHA2$2, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2)get_store().add_element_user(ISOALPHA2$2);
                        }
                        target.set(isoAlpha2);
                      }
                    }
                    /**
                     * An XML isoAlpha2(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Country$IsoAlpha2.
                     */
                    public static class IsoAlpha2Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Country.IsoAlpha2
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public IsoAlpha2Impl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected IsoAlpha2Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
                /**
                 * An XML directions(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Address$Directions.
                 */
                public static class DirectionsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Address.Directions
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DirectionsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DirectionsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML condition(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$Condition.
             */
            public static class ConditionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.Condition
            {
                private static final long serialVersionUID = 1L;
                
                public ConditionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ConditionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML contactDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class ContactDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails
            {
                private static final long serialVersionUID = 1L;
                
                public ContactDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName CALLER$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "caller");
                private static final javax.xml.namespace.QName PATIENTPHONE$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "patientPhone");
                
                
                /**
                 * Gets array of all "caller" elements
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller[] getCallerArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(CALLER$0, targetList);
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "caller" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller getCallerArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller)get_store().find_element_user(CALLER$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "caller" element
                 */
                public int sizeOfCallerArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(CALLER$0);
                    }
                }
                
                /**
                 * Sets array of all "caller" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setCallerArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller[] callerArray)
                {
                    check_orphaned();
                    arraySetterHelper(callerArray, CALLER$0);
                }
                
                /**
                 * Sets ith "caller" element
                 */
                public void setCallerArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller caller)
                {
                    generatedSetterHelperImpl(caller, CALLER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "caller" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller insertNewCaller(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller)get_store().insert_element_user(CALLER$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "caller" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller addNewCaller()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller)get_store().add_element_user(CALLER$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "caller" element
                 */
                public void removeCaller(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(CALLER$0, i);
                    }
                }
                
                /**
                 * Gets array of all "patientPhone" elements
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone[] getPatientPhoneArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PATIENTPHONE$2, targetList);
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "patientPhone" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone getPatientPhoneArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone)get_store().find_element_user(PATIENTPHONE$2, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "patientPhone" element
                 */
                public int sizeOfPatientPhoneArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PATIENTPHONE$2);
                    }
                }
                
                /**
                 * Sets array of all "patientPhone" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setPatientPhoneArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone[] patientPhoneArray)
                {
                    check_orphaned();
                    arraySetterHelper(patientPhoneArray, PATIENTPHONE$2);
                }
                
                /**
                 * Sets ith "patientPhone" element
                 */
                public void setPatientPhoneArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone patientPhone)
                {
                    generatedSetterHelperImpl(patientPhone, PATIENTPHONE$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "patientPhone" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone insertNewPatientPhone(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone)get_store().insert_element_user(PATIENTPHONE$2, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "patientPhone" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone addNewPatientPhone()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone)get_store().add_element_user(PATIENTPHONE$2);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "patientPhone" element
                 */
                public void removePatientPhone(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PATIENTPHONE$2, i);
                    }
                }
                /**
                 * An XML caller(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class CallerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CallerImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NAME$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
                    private static final javax.xml.namespace.QName PHONE$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "phone");
                    
                    
                    /**
                     * Gets the "name" element
                     */
                    public java.lang.String getName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name xgetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name)get_store().find_element_user(NAME$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "name" element
                     */
                    public boolean isSetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(NAME$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "name" element
                     */
                    public void setName(java.lang.String name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                        }
                        target.setStringValue(name);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    public void xsetName(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name)get_store().add_element_user(NAME$0);
                        }
                        target.set(name);
                      }
                    }
                    
                    /**
                     * Unsets the "name" element
                     */
                    public void unsetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(NAME$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "phone" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone getPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone)get_store().find_element_user(PHONE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "phone" element
                     */
                    public boolean isSetPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PHONE$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "phone" element
                     */
                    public void setPhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone phone)
                    {
                      generatedSetterHelperImpl(phone, PHONE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "phone" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone addNewPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone)get_store().add_element_user(PHONE$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "phone" element
                     */
                    public void unsetPhone()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PHONE$2, 0);
                      }
                    }
                    /**
                     * An XML name(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Name.
                     */
                    public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Name
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NameImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML phone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class PhoneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public PhoneImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName PREFIX$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "prefix");
                      private static final javax.xml.namespace.QName NUMBER$2 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "number");
                      private static final javax.xml.namespace.QName EXTENSION$4 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "extension");
                      
                      
                      /**
                       * Gets the "prefix" element
                       */
                      public java.lang.String getPrefix()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "prefix" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix xgetPrefix()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "prefix" element
                       */
                      public boolean isSetPrefix()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(PREFIX$0) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "prefix" element
                       */
                      public void setPrefix(java.lang.String prefix)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
                          }
                          target.setStringValue(prefix);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "prefix" element
                       */
                      public void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix prefix)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                          if (target == null)
                          {
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix)get_store().add_element_user(PREFIX$0);
                          }
                          target.set(prefix);
                        }
                      }
                      
                      /**
                       * Unsets the "prefix" element
                       */
                      public void unsetPrefix()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(PREFIX$0, 0);
                        }
                      }
                      
                      /**
                       * Gets the "number" element
                       */
                      public java.lang.String getNumber()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "number" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number xgetNumber()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number)get_store().find_element_user(NUMBER$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "number" element
                       */
                      public void setNumber(java.lang.String number)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
                          }
                          target.setStringValue(number);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "number" element
                       */
                      public void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number number)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number)get_store().find_element_user(NUMBER$2, 0);
                          if (target == null)
                          {
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number)get_store().add_element_user(NUMBER$2);
                          }
                          target.set(number);
                        }
                      }
                      
                      /**
                       * Gets the "extension" element
                       */
                      public java.lang.String getExtension()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "extension" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension xgetExtension()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "extension" element
                       */
                      public boolean isSetExtension()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(EXTENSION$4) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "extension" element
                       */
                      public void setExtension(java.lang.String extension)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENSION$4);
                          }
                          target.setStringValue(extension);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "extension" element
                       */
                      public void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension extension)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                          if (target == null)
                          {
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension)get_store().add_element_user(EXTENSION$4);
                          }
                          target.set(extension);
                        }
                      }
                      
                      /**
                       * Unsets the "extension" element
                       */
                      public void unsetExtension()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(EXTENSION$4, 0);
                        }
                      }
                      /**
                       * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Phone$Prefix.
                       */
                      public static class PrefixImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Prefix
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public PrefixImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected PrefixImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                      /**
                       * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Phone$Number.
                       */
                      public static class NumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Number
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public NumberImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected NumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                      /**
                       * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$Caller$Phone$Extension.
                       */
                      public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.Caller.Phone.Extension
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected ExtensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                }
                /**
                 * An XML patientPhone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class PatientPhoneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone
                {
                    private static final long serialVersionUID = 1L;
                    
                    public PatientPhoneImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName PREFIX$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "prefix");
                    private static final javax.xml.namespace.QName NUMBER$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "number");
                    private static final javax.xml.namespace.QName EXTENSION$4 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "extension");
                    
                    
                    /**
                     * Gets the "prefix" element
                     */
                    public java.lang.String getPrefix()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "prefix" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix xgetPrefix()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "prefix" element
                     */
                    public boolean isSetPrefix()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(PREFIX$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "prefix" element
                     */
                    public void setPrefix(java.lang.String prefix)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
                        }
                        target.setStringValue(prefix);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "prefix" element
                     */
                    public void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix prefix)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix)get_store().add_element_user(PREFIX$0);
                        }
                        target.set(prefix);
                      }
                    }
                    
                    /**
                     * Unsets the "prefix" element
                     */
                    public void unsetPrefix()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(PREFIX$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "number" element
                     */
                    public java.lang.String getNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "number" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number xgetNumber()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number)get_store().find_element_user(NUMBER$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "number" element
                     */
                    public void setNumber(java.lang.String number)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
                        }
                        target.setStringValue(number);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "number" element
                     */
                    public void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number number)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number)get_store().find_element_user(NUMBER$2, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number)get_store().add_element_user(NUMBER$2);
                        }
                        target.set(number);
                      }
                    }
                    
                    /**
                     * Gets the "extension" element
                     */
                    public java.lang.String getExtension()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "extension" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension xgetExtension()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "extension" element
                     */
                    public boolean isSetExtension()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(EXTENSION$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "extension" element
                     */
                    public void setExtension(java.lang.String extension)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENSION$4);
                        }
                        target.setStringValue(extension);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "extension" element
                     */
                    public void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension extension)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension)get_store().add_element_user(EXTENSION$4);
                        }
                        target.set(extension);
                      }
                    }
                    
                    /**
                     * Unsets the "extension" element
                     */
                    public void unsetExtension()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(EXTENSION$4, 0);
                      }
                    }
                    /**
                     * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$PatientPhone$Prefix.
                     */
                    public static class PrefixImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Prefix
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public PrefixImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected PrefixImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$PatientPhone$Number.
                     */
                    public static class NumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Number
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public NumberImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected NumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                    /**
                     * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$CaseDetails$ContactDetails$PatientPhone$Extension.
                     */
                    public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.CaseDetails.ContactDetails.PatientPhone.Extension
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected ExtensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
            }
        }
        /**
         * An XML patient(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class PatientImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient
        {
            private static final long serialVersionUID = 1L;
            
            public PatientImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName REF$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "ref");
            private static final javax.xml.namespace.QName FORENAME$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "forename");
            private static final javax.xml.namespace.QName SURNAME$4 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "surname");
            private static final javax.xml.namespace.QName ADDRESS$6 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "address");
            private static final javax.xml.namespace.QName PHONE$8 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "phone");
            private static final javax.xml.namespace.QName GENDER$10 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "gender");
            private static final javax.xml.namespace.QName NATIONALNUMBER$12 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "nationalNumber");
            private static final javax.xml.namespace.QName PROVIDERDETAILS$14 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "providerDetails");
            private static final javax.xml.namespace.QName DATEOFBIRTH$16 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "dateOfBirth");
            private static final javax.xml.namespace.QName MOBILEPHONE$18 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "mobilePhone");
            
            
            /**
             * Gets the "ref" element
             */
            public java.lang.String getRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "ref" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref xgetRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref)get_store().find_element_user(REF$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "ref" element
             */
            public boolean isSetRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(REF$0) != 0;
                }
            }
            
            /**
             * Sets the "ref" element
             */
            public void setRef(java.lang.String ref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REF$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REF$0);
                    }
                    target.setStringValue(ref);
                }
            }
            
            /**
             * Sets (as xml) the "ref" element
             */
            public void xsetRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref ref)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref)get_store().find_element_user(REF$0, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref)get_store().add_element_user(REF$0);
                    }
                    target.set(ref);
                }
            }
            
            /**
             * Unsets the "ref" element
             */
            public void unsetRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(REF$0, 0);
                }
            }
            
            /**
             * Gets the "forename" element
             */
            public java.lang.String getForename()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORENAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "forename" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename xgetForename()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename)get_store().find_element_user(FORENAME$2, 0);
                    return target;
                }
            }
            
            /**
             * True if has "forename" element
             */
            public boolean isSetForename()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(FORENAME$2) != 0;
                }
            }
            
            /**
             * Sets the "forename" element
             */
            public void setForename(java.lang.String forename)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORENAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORENAME$2);
                    }
                    target.setStringValue(forename);
                }
            }
            
            /**
             * Sets (as xml) the "forename" element
             */
            public void xsetForename(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename forename)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename)get_store().find_element_user(FORENAME$2, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename)get_store().add_element_user(FORENAME$2);
                    }
                    target.set(forename);
                }
            }
            
            /**
             * Unsets the "forename" element
             */
            public void unsetForename()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(FORENAME$2, 0);
                }
            }
            
            /**
             * Gets the "surname" element
             */
            public java.lang.String getSurname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "surname" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname xgetSurname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname)get_store().find_element_user(SURNAME$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "surname" element
             */
            public boolean isSetSurname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(SURNAME$4) != 0;
                }
            }
            
            /**
             * Sets the "surname" element
             */
            public void setSurname(java.lang.String surname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SURNAME$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SURNAME$4);
                    }
                    target.setStringValue(surname);
                }
            }
            
            /**
             * Sets (as xml) the "surname" element
             */
            public void xsetSurname(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname surname)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname)get_store().find_element_user(SURNAME$4, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname)get_store().add_element_user(SURNAME$4);
                    }
                    target.set(surname);
                }
            }
            
            /**
             * Unsets the "surname" element
             */
            public void unsetSurname()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(SURNAME$4, 0);
                }
            }
            
            /**
             * Gets the "address" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address getAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address)get_store().find_element_user(ADDRESS$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "address" element
             */
            public boolean isSetAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(ADDRESS$6) != 0;
                }
            }
            
            /**
             * Sets the "address" element
             */
            public void setAddress(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address address)
            {
                generatedSetterHelperImpl(address, ADDRESS$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "address" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address addNewAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address)get_store().add_element_user(ADDRESS$6);
                    return target;
                }
            }
            
            /**
             * Unsets the "address" element
             */
            public void unsetAddress()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(ADDRESS$6, 0);
                }
            }
            
            /**
             * Gets the "phone" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone getPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone)get_store().find_element_user(PHONE$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "phone" element
             */
            public boolean isSetPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PHONE$8) != 0;
                }
            }
            
            /**
             * Sets the "phone" element
             */
            public void setPhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone phone)
            {
                generatedSetterHelperImpl(phone, PHONE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "phone" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone addNewPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone)get_store().add_element_user(PHONE$8);
                    return target;
                }
            }
            
            /**
             * Unsets the "phone" element
             */
            public void unsetPhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PHONE$8, 0);
                }
            }
            
            /**
             * Gets the "gender" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender.Enum getGender()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDER$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender.Enum)target.getEnumValue();
                }
            }
            
            /**
             * Gets (as xml) the "gender" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender xgetGender()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender)get_store().find_element_user(GENDER$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "gender" element
             */
            public void setGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender.Enum gender)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDER$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENDER$10);
                    }
                    target.setEnumValue(gender);
                }
            }
            
            /**
             * Sets (as xml) the "gender" element
             */
            public void xsetGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender gender)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender)get_store().find_element_user(GENDER$10, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender)get_store().add_element_user(GENDER$10);
                    }
                    target.set(gender);
                }
            }
            
            /**
             * Gets the "nationalNumber" element
             */
            public java.lang.String getNationalNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALNUMBER$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "nationalNumber" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber xgetNationalNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber)get_store().find_element_user(NATIONALNUMBER$12, 0);
                    return target;
                }
            }
            
            /**
             * True if has "nationalNumber" element
             */
            public boolean isSetNationalNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(NATIONALNUMBER$12) != 0;
                }
            }
            
            /**
             * Sets the "nationalNumber" element
             */
            public void setNationalNumber(java.lang.String nationalNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NATIONALNUMBER$12, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NATIONALNUMBER$12);
                    }
                    target.setStringValue(nationalNumber);
                }
            }
            
            /**
             * Sets (as xml) the "nationalNumber" element
             */
            public void xsetNationalNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber nationalNumber)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber)get_store().find_element_user(NATIONALNUMBER$12, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber)get_store().add_element_user(NATIONALNUMBER$12);
                    }
                    target.set(nationalNumber);
                }
            }
            
            /**
             * Unsets the "nationalNumber" element
             */
            public void unsetNationalNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(NATIONALNUMBER$12, 0);
                }
            }
            
            /**
             * Gets the "providerDetails" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails getProviderDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails)get_store().find_element_user(PROVIDERDETAILS$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "providerDetails" element
             */
            public boolean isSetProviderDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PROVIDERDETAILS$14) != 0;
                }
            }
            
            /**
             * Sets the "providerDetails" element
             */
            public void setProviderDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails providerDetails)
            {
                generatedSetterHelperImpl(providerDetails, PROVIDERDETAILS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "providerDetails" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails addNewProviderDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails)get_store().add_element_user(PROVIDERDETAILS$14);
                    return target;
                }
            }
            
            /**
             * Unsets the "providerDetails" element
             */
            public void unsetProviderDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PROVIDERDETAILS$14, 0);
                }
            }
            
            /**
             * Gets the "dateOfBirth" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth getDateOfBirth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth)get_store().find_element_user(DATEOFBIRTH$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "dateOfBirth" element
             */
            public boolean isSetDateOfBirth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DATEOFBIRTH$16) != 0;
                }
            }
            
            /**
             * Sets the "dateOfBirth" element
             */
            public void setDateOfBirth(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth dateOfBirth)
            {
                generatedSetterHelperImpl(dateOfBirth, DATEOFBIRTH$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "dateOfBirth" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth addNewDateOfBirth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth)get_store().add_element_user(DATEOFBIRTH$16);
                    return target;
                }
            }
            
            /**
             * Unsets the "dateOfBirth" element
             */
            public void unsetDateOfBirth()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DATEOFBIRTH$16, 0);
                }
            }
            
            /**
             * Gets the "mobilePhone" element
             */
            public java.lang.String getMobilePhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$18, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "mobilePhone" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone xgetMobilePhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone)get_store().find_element_user(MOBILEPHONE$18, 0);
                    return target;
                }
            }
            
            /**
             * True if has "mobilePhone" element
             */
            public boolean isSetMobilePhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MOBILEPHONE$18) != 0;
                }
            }
            
            /**
             * Sets the "mobilePhone" element
             */
            public void setMobilePhone(java.lang.String mobilePhone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MOBILEPHONE$18, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MOBILEPHONE$18);
                    }
                    target.setStringValue(mobilePhone);
                }
            }
            
            /**
             * Sets (as xml) the "mobilePhone" element
             */
            public void xsetMobilePhone(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone mobilePhone)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone)get_store().find_element_user(MOBILEPHONE$18, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone)get_store().add_element_user(MOBILEPHONE$18);
                    }
                    target.set(mobilePhone);
                }
            }
            
            /**
             * Unsets the "mobilePhone" element
             */
            public void unsetMobilePhone()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MOBILEPHONE$18, 0);
                }
            }
            /**
             * An XML ref(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Ref.
             */
            public static class RefImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Ref
            {
                private static final long serialVersionUID = 1L;
                
                public RefImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected RefImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML forename(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Forename.
             */
            public static class ForenameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Forename
            {
                private static final long serialVersionUID = 1L;
                
                public ForenameImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ForenameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML surname(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Surname.
             */
            public static class SurnameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Surname
            {
                private static final long serialVersionUID = 1L;
                
                public SurnameImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected SurnameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML address(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address
            {
                private static final long serialVersionUID = 1L;
                
                public AddressImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName BUILDING$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "building");
                private static final javax.xml.namespace.QName STREET$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "street");
                private static final javax.xml.namespace.QName LOCALITY$4 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "locality");
                private static final javax.xml.namespace.QName TOWN$6 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "town");
                private static final javax.xml.namespace.QName COUNTY$8 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "county");
                private static final javax.xml.namespace.QName POSTCODE$10 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "postcode");
                private static final javax.xml.namespace.QName MAPREF$12 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "mapRef");
                private static final javax.xml.namespace.QName COUNTRY$14 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "country");
                private static final javax.xml.namespace.QName DIRECTIONS$16 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "directions");
                
                
                /**
                 * Gets the "building" element
                 */
                public java.lang.String getBuilding()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDING$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "building" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building xgetBuilding()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building)get_store().find_element_user(BUILDING$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "building" element
                 */
                public void setBuilding(java.lang.String building)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDING$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILDING$0);
                      }
                      target.setStringValue(building);
                    }
                }
                
                /**
                 * Sets (as xml) the "building" element
                 */
                public void xsetBuilding(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building building)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building)get_store().find_element_user(BUILDING$0, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building)get_store().add_element_user(BUILDING$0);
                      }
                      target.set(building);
                    }
                }
                
                /**
                 * Gets the "street" element
                 */
                public java.lang.String getStreet()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "street" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street xgetStreet()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street)get_store().find_element_user(STREET$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "street" element
                 */
                public void setStreet(java.lang.String street)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$2);
                      }
                      target.setStringValue(street);
                    }
                }
                
                /**
                 * Sets (as xml) the "street" element
                 */
                public void xsetStreet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street street)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street)get_store().find_element_user(STREET$2, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street)get_store().add_element_user(STREET$2);
                      }
                      target.set(street);
                    }
                }
                
                /**
                 * Gets the "locality" element
                 */
                public java.lang.String getLocality()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "locality" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality xgetLocality()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality)get_store().find_element_user(LOCALITY$4, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "locality" element
                 */
                public void setLocality(java.lang.String locality)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$4);
                      }
                      target.setStringValue(locality);
                    }
                }
                
                /**
                 * Sets (as xml) the "locality" element
                 */
                public void xsetLocality(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality locality)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality)get_store().find_element_user(LOCALITY$4, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality)get_store().add_element_user(LOCALITY$4);
                      }
                      target.set(locality);
                    }
                }
                
                /**
                 * Gets the "town" element
                 */
                public java.lang.String getTown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOWN$6, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "town" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town xgetTown()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town)get_store().find_element_user(TOWN$6, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "town" element
                 */
                public void setTown(java.lang.String town)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOWN$6, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOWN$6);
                      }
                      target.setStringValue(town);
                    }
                }
                
                /**
                 * Sets (as xml) the "town" element
                 */
                public void xsetTown(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town town)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town)get_store().find_element_user(TOWN$6, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town)get_store().add_element_user(TOWN$6);
                      }
                      target.set(town);
                    }
                }
                
                /**
                 * Gets the "county" element
                 */
                public java.lang.String getCounty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$8, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "county" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County xgetCounty()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County)get_store().find_element_user(COUNTY$8, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "county" element
                 */
                public void setCounty(java.lang.String county)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$8, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTY$8);
                      }
                      target.setStringValue(county);
                    }
                }
                
                /**
                 * Sets (as xml) the "county" element
                 */
                public void xsetCounty(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County county)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County)get_store().find_element_user(COUNTY$8, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County)get_store().add_element_user(COUNTY$8);
                      }
                      target.set(county);
                    }
                }
                
                /**
                 * Gets the "postcode" element
                 */
                public java.lang.String getPostcode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$10, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "postcode" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode xgetPostcode()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode)get_store().find_element_user(POSTCODE$10, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "postcode" element
                 */
                public void setPostcode(java.lang.String postcode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$10, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$10);
                      }
                      target.setStringValue(postcode);
                    }
                }
                
                /**
                 * Sets (as xml) the "postcode" element
                 */
                public void xsetPostcode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode postcode)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode)get_store().find_element_user(POSTCODE$10, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode)get_store().add_element_user(POSTCODE$10);
                      }
                      target.set(postcode);
                    }
                }
                
                /**
                 * Gets the "mapRef" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef getMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef)get_store().find_element_user(MAPREF$12, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "mapRef" element
                 */
                public boolean isSetMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(MAPREF$12) != 0;
                    }
                }
                
                /**
                 * Sets the "mapRef" element
                 */
                public void setMapRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef mapRef)
                {
                    generatedSetterHelperImpl(mapRef, MAPREF$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "mapRef" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef addNewMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef)get_store().add_element_user(MAPREF$12);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "mapRef" element
                 */
                public void unsetMapRef()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(MAPREF$12, 0);
                    }
                }
                
                /**
                 * Gets the "country" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country getCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country)get_store().find_element_user(COUNTRY$14, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "country" element
                 */
                public boolean isSetCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(COUNTRY$14) != 0;
                    }
                }
                
                /**
                 * Sets the "country" element
                 */
                public void setCountry(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country country)
                {
                    generatedSetterHelperImpl(country, COUNTRY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "country" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country addNewCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country)get_store().add_element_user(COUNTRY$14);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "country" element
                 */
                public void unsetCountry()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(COUNTRY$14, 0);
                    }
                }
                
                /**
                 * Gets the "directions" element
                 */
                public java.lang.String getDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTIONS$16, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "directions" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions xgetDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions)get_store().find_element_user(DIRECTIONS$16, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "directions" element
                 */
                public boolean isSetDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DIRECTIONS$16) != 0;
                    }
                }
                
                /**
                 * Sets the "directions" element
                 */
                public void setDirections(java.lang.String directions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTIONS$16, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTIONS$16);
                      }
                      target.setStringValue(directions);
                    }
                }
                
                /**
                 * Sets (as xml) the "directions" element
                 */
                public void xsetDirections(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions directions)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions)get_store().find_element_user(DIRECTIONS$16, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions)get_store().add_element_user(DIRECTIONS$16);
                      }
                      target.set(directions);
                    }
                }
                
                /**
                 * Unsets the "directions" element
                 */
                public void unsetDirections()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DIRECTIONS$16, 0);
                    }
                }
                /**
                 * An XML building(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Building.
                 */
                public static class BuildingImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Building
                {
                    private static final long serialVersionUID = 1L;
                    
                    public BuildingImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected BuildingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML street(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Street.
                 */
                public static class StreetImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Street
                {
                    private static final long serialVersionUID = 1L;
                    
                    public StreetImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected StreetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML locality(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Locality.
                 */
                public static class LocalityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Locality
                {
                    private static final long serialVersionUID = 1L;
                    
                    public LocalityImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected LocalityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML town(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Town.
                 */
                public static class TownImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Town
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TownImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TownImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML county(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$County.
                 */
                public static class CountyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.County
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CountyImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected CountyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML postcode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Postcode.
                 */
                public static class PostcodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Postcode
                {
                    private static final long serialVersionUID = 1L;
                    
                    public PostcodeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected PostcodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML mapRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class MapRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.MapRef
                {
                    private static final long serialVersionUID = 1L;
                    
                    public MapRefImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName LONGITUDE$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "longitude");
                    private static final javax.xml.namespace.QName LATITUDE$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "latitude");
                    
                    
                    /**
                     * Gets the "longitude" element
                     */
                    public org.apache.xmlbeans.XmlObject getLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LONGITUDE$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "longitude" element
                     */
                    public boolean isSetLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(LONGITUDE$0) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "longitude" element
                     */
                    public void setLongitude(org.apache.xmlbeans.XmlObject longitude)
                    {
                      generatedSetterHelperImpl(longitude, LONGITUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "longitude" element
                     */
                    public org.apache.xmlbeans.XmlObject addNewLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LONGITUDE$0);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "longitude" element
                     */
                    public void unsetLongitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(LONGITUDE$0, 0);
                      }
                    }
                    
                    /**
                     * Gets the "latitude" element
                     */
                    public org.apache.xmlbeans.XmlObject getLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LATITUDE$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "latitude" element
                     */
                    public boolean isSetLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(LATITUDE$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "latitude" element
                     */
                    public void setLatitude(org.apache.xmlbeans.XmlObject latitude)
                    {
                      generatedSetterHelperImpl(latitude, LATITUDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "latitude" element
                     */
                    public org.apache.xmlbeans.XmlObject addNewLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlObject target = null;
                        target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LATITUDE$2);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "latitude" element
                     */
                    public void unsetLatitude()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(LATITUDE$2, 0);
                      }
                    }
                }
                /**
                 * An XML country(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class CountryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country
                {
                    private static final long serialVersionUID = 1L;
                    
                    public CountryImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NAME$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
                    private static final javax.xml.namespace.QName ISOALPHA2$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "isoAlpha2");
                    
                    
                    /**
                     * Gets the "name" element
                     */
                    public java.lang.String getName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    public org.apache.xmlbeans.XmlString xgetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "name" element
                     */
                    public void setName(java.lang.String name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                        }
                        target.setStringValue(name);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    public void xsetName(org.apache.xmlbeans.XmlString name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                        }
                        target.set(name);
                      }
                    }
                    
                    /**
                     * Gets the "isoAlpha2" element
                     */
                    public java.lang.String getIsoAlpha2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOALPHA2$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "isoAlpha2" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 xgetIsoAlpha2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2)get_store().find_element_user(ISOALPHA2$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "isoAlpha2" element
                     */
                    public boolean isSetIsoAlpha2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(ISOALPHA2$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "isoAlpha2" element
                     */
                    public void setIsoAlpha2(java.lang.String isoAlpha2)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOALPHA2$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOALPHA2$2);
                        }
                        target.setStringValue(isoAlpha2);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "isoAlpha2" element
                     */
                    public void xsetIsoAlpha2(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 isoAlpha2)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2 target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2)get_store().find_element_user(ISOALPHA2$2, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2)get_store().add_element_user(ISOALPHA2$2);
                        }
                        target.set(isoAlpha2);
                      }
                    }
                    
                    /**
                     * Unsets the "isoAlpha2" element
                     */
                    public void unsetIsoAlpha2()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(ISOALPHA2$2, 0);
                      }
                    }
                    /**
                     * An XML isoAlpha2(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Country$IsoAlpha2.
                     */
                    public static class IsoAlpha2Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Country.IsoAlpha2
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public IsoAlpha2Impl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected IsoAlpha2Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
                /**
                 * An XML directions(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Address$Directions.
                 */
                public static class DirectionsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Address.Directions
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DirectionsImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected DirectionsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML phone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class PhoneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone
            {
                private static final long serialVersionUID = 1L;
                
                public PhoneImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PREFIX$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "prefix");
                private static final javax.xml.namespace.QName NUMBER$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "number");
                private static final javax.xml.namespace.QName EXTENSION$4 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "extension");
                
                
                /**
                 * Gets the "prefix" element
                 */
                public java.lang.String getPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "prefix" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix xgetPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "prefix" element
                 */
                public boolean isSetPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PREFIX$0) != 0;
                    }
                }
                
                /**
                 * Sets the "prefix" element
                 */
                public void setPrefix(java.lang.String prefix)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
                      }
                      target.setStringValue(prefix);
                    }
                }
                
                /**
                 * Sets (as xml) the "prefix" element
                 */
                public void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix prefix)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix)get_store().add_element_user(PREFIX$0);
                      }
                      target.set(prefix);
                    }
                }
                
                /**
                 * Unsets the "prefix" element
                 */
                public void unsetPrefix()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PREFIX$0, 0);
                    }
                }
                
                /**
                 * Gets the "number" element
                 */
                public java.lang.String getNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "number" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number xgetNumber()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number)get_store().find_element_user(NUMBER$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "number" element
                 */
                public void setNumber(java.lang.String number)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
                      }
                      target.setStringValue(number);
                    }
                }
                
                /**
                 * Sets (as xml) the "number" element
                 */
                public void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number number)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number)get_store().find_element_user(NUMBER$2, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number)get_store().add_element_user(NUMBER$2);
                      }
                      target.set(number);
                    }
                }
                
                /**
                 * Gets the "extension" element
                 */
                public java.lang.String getExtension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "extension" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension xgetExtension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                      return target;
                    }
                }
                
                /**
                 * True if has "extension" element
                 */
                public boolean isSetExtension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(EXTENSION$4) != 0;
                    }
                }
                
                /**
                 * Sets the "extension" element
                 */
                public void setExtension(java.lang.String extension)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENSION$4);
                      }
                      target.setStringValue(extension);
                    }
                }
                
                /**
                 * Sets (as xml) the "extension" element
                 */
                public void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension extension)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension)get_store().add_element_user(EXTENSION$4);
                      }
                      target.set(extension);
                    }
                }
                
                /**
                 * Unsets the "extension" element
                 */
                public void unsetExtension()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(EXTENSION$4, 0);
                    }
                }
                /**
                 * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Phone$Prefix.
                 */
                public static class PrefixImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Prefix
                {
                    private static final long serialVersionUID = 1L;
                    
                    public PrefixImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected PrefixImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Phone$Number.
                 */
                public static class NumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Number
                {
                    private static final long serialVersionUID = 1L;
                    
                    public NumberImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected NumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Phone$Extension.
                 */
                public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Phone.Extension
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected ExtensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML gender(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$Gender.
             */
            public static class GenderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.Gender
            {
                private static final long serialVersionUID = 1L;
                
                public GenderImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected GenderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML nationalNumber(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$NationalNumber.
             */
            public static class NationalNumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.NationalNumber
            {
                private static final long serialVersionUID = 1L;
                
                public NationalNumberImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NationalNumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML providerDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class ProviderDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails
            {
                private static final long serialVersionUID = 1L;
                
                public ProviderDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PROVIDER$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "provider");
                private static final javax.xml.namespace.QName PROVIDERGROUP$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "providerGroup");
                private static final javax.xml.namespace.QName TYPE$4 = 
                    new javax.xml.namespace.QName("", "type");
                
                
                /**
                 * Gets the "provider" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider getProvider()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider)get_store().find_element_user(PROVIDER$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "provider" element
                 */
                public boolean isSetProvider()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PROVIDER$0) != 0;
                    }
                }
                
                /**
                 * Sets the "provider" element
                 */
                public void setProvider(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider provider)
                {
                    generatedSetterHelperImpl(provider, PROVIDER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "provider" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider addNewProvider()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider)get_store().add_element_user(PROVIDER$0);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "provider" element
                 */
                public void unsetProvider()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PROVIDER$0, 0);
                    }
                }
                
                /**
                 * Gets the "providerGroup" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup getProviderGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup)get_store().find_element_user(PROVIDERGROUP$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * Sets the "providerGroup" element
                 */
                public void setProviderGroup(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup providerGroup)
                {
                    generatedSetterHelperImpl(providerGroup, PROVIDERGROUP$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "providerGroup" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup addNewProviderGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup)get_store().add_element_user(PROVIDERGROUP$2);
                      return target;
                    }
                }
                
                /**
                 * Gets the "type" attribute
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type.Enum getType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                      if (target == null)
                      {
                        return null;
                      }
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "type" attribute
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type xgetType()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type)get_store().find_attribute_user(TYPE$4);
                      return target;
                    }
                }
                
                /**
                 * Sets the "type" attribute
                 */
                public void setType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type.Enum type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$4);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$4);
                      }
                      target.setEnumValue(type);
                    }
                }
                
                /**
                 * Sets (as xml) the "type" attribute
                 */
                public void xsetType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type type)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type)get_store().find_attribute_user(TYPE$4);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type)get_store().add_attribute_user(TYPE$4);
                      }
                      target.set(type);
                    }
                }
                /**
                 * An XML provider(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class ProviderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ProviderImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NAME$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
                    private static final javax.xml.namespace.QName ID$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
                    
                    
                    /**
                     * Gets the "name" element
                     */
                    public java.lang.String getName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    public org.apache.xmlbeans.XmlString xgetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "name" element
                     */
                    public void setName(java.lang.String name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                        }
                        target.setStringValue(name);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    public void xsetName(org.apache.xmlbeans.XmlString name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                        }
                        target.set(name);
                      }
                    }
                    
                    /**
                     * Gets the "id" element
                     */
                    public java.lang.String getId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "id" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id xgetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id)get_store().find_element_user(ID$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "id" element
                     */
                    public void setId(java.lang.String id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
                        }
                        target.setStringValue(id);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "id" element
                     */
                    public void xsetId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id)get_store().find_element_user(ID$2, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id)get_store().add_element_user(ID$2);
                        }
                        target.set(id);
                      }
                    }
                    /**
                     * An XML id(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$ProviderDetails$Provider$Id.
                     */
                    public static class IdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Provider.Id
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public IdImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected IdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
                /**
                 * An XML providerGroup(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class ProviderGroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup
                {
                    private static final long serialVersionUID = 1L;
                    
                    public ProviderGroupImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName NAME$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
                    private static final javax.xml.namespace.QName ID$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
                    
                    
                    /**
                     * Gets the "name" element
                     */
                    public java.lang.String getName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "name" element
                     */
                    public org.apache.xmlbeans.XmlString xgetName()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "name" element
                     */
                    public void setName(java.lang.String name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                        }
                        target.setStringValue(name);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "name" element
                     */
                    public void xsetName(org.apache.xmlbeans.XmlString name)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlString target = null;
                        target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                        }
                        target.set(name);
                      }
                    }
                    
                    /**
                     * Gets the "id" element
                     */
                    public java.lang.String getId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getStringValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "id" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id xgetId()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id)get_store().find_element_user(ID$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "id" element
                     */
                    public void setId(java.lang.String id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
                        }
                        target.setStringValue(id);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "id" element
                     */
                    public void xsetId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id id)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id)get_store().find_element_user(ID$2, 0);
                        if (target == null)
                        {
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id)get_store().add_element_user(ID$2);
                        }
                        target.set(id);
                      }
                    }
                    /**
                     * An XML id(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$ProviderDetails$ProviderGroup$Id.
                     */
                    public static class IdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.ProviderGroup.Id
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public IdImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType, false);
                      }
                      
                      protected IdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                      {
                        super(sType, b);
                      }
                    }
                }
                /**
                 * An XML type(@).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$ProviderDetails$Type.
                 */
                public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.ProviderDetails.Type
                {
                    private static final long serialVersionUID = 1L;
                    
                    public TypeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML dateOfBirth(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class DateOfBirthImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth
            {
                private static final long serialVersionUID = 1L;
                
                public DateOfBirthImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName DOB$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "dob");
                private static final javax.xml.namespace.QName AGE$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "age");
                
                
                /**
                 * Gets the "dob" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob getDob()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob)get_store().find_element_user(DOB$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "dob" element
                 */
                public boolean isSetDob()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(DOB$0) != 0;
                    }
                }
                
                /**
                 * Sets the "dob" element
                 */
                public void setDob(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob dob)
                {
                    generatedSetterHelperImpl(dob, DOB$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "dob" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob addNewDob()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob)get_store().add_element_user(DOB$0);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "dob" element
                 */
                public void unsetDob()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(DOB$0, 0);
                    }
                }
                
                /**
                 * Gets the "age" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age getAge()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age)get_store().find_element_user(AGE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "age" element
                 */
                public boolean isSetAge()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(AGE$2) != 0;
                    }
                }
                
                /**
                 * Sets the "age" element
                 */
                public void setAge(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age age)
                {
                    generatedSetterHelperImpl(age, AGE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "age" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age addNewAge()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age)get_store().add_element_user(AGE$2);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "age" element
                 */
                public void unsetAge()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(AGE$2, 0);
                    }
                }
                /**
                 * An XML dob(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$DateOfBirth$Dob.
                 */
                public static class DobImpl extends org.apache.xmlbeans.impl.values.JavaGDateHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Dob
                {
                    private static final long serialVersionUID = 1L;
                    
                    public DobImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, true);
                    }
                    
                    protected DobImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                    
                    
                }
                /**
                 * An XML age(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class AgeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.DateOfBirth.Age
                {
                    private static final long serialVersionUID = 1L;
                    
                    public AgeImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName YEARS$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "years");
                    private static final javax.xml.namespace.QName MONTHS$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "months");
                    private static final javax.xml.namespace.QName DAYS$4 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "days");
                    
                    
                    /**
                     * Gets the "years" element
                     */
                    public int getYears()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARS$0, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "years" element
                     */
                    public org.apache.xmlbeans.XmlInt xgetYears()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(YEARS$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "years" element
                     */
                    public void setYears(int years)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARS$0);
                        }
                        target.setIntValue(years);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "years" element
                     */
                    public void xsetYears(org.apache.xmlbeans.XmlInt years)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(YEARS$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(YEARS$0);
                        }
                        target.set(years);
                      }
                    }
                    
                    /**
                     * Gets the "months" element
                     */
                    public int getMonths()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHS$2, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "months" element
                     */
                    public org.apache.xmlbeans.XmlInt xgetMonths()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONTHS$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "months" element
                     */
                    public boolean isSetMonths()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(MONTHS$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "months" element
                     */
                    public void setMonths(int months)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTHS$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTHS$2);
                        }
                        target.setIntValue(months);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "months" element
                     */
                    public void xsetMonths(org.apache.xmlbeans.XmlInt months)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MONTHS$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MONTHS$2);
                        }
                        target.set(months);
                      }
                    }
                    
                    /**
                     * Unsets the "months" element
                     */
                    public void unsetMonths()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(MONTHS$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "days" element
                     */
                    public int getDays()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYS$4, 0);
                        if (target == null)
                        {
                          return 0;
                        }
                        return target.getIntValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "days" element
                     */
                    public org.apache.xmlbeans.XmlInt xgetDays()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DAYS$4, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "days" element
                     */
                    public boolean isSetDays()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(DAYS$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "days" element
                     */
                    public void setDays(int days)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DAYS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DAYS$4);
                        }
                        target.setIntValue(days);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "days" element
                     */
                    public void xsetDays(org.apache.xmlbeans.XmlInt days)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlInt target = null;
                        target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DAYS$4, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DAYS$4);
                        }
                        target.set(days);
                      }
                    }
                    
                    /**
                     * Unsets the "days" element
                     */
                    public void unsetDays()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(DAYS$4, 0);
                      }
                    }
                }
            }
            /**
             * An XML mobilePhone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Patient$MobilePhone.
             */
            public static class MobilePhoneImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Patient.MobilePhone
            {
                private static final long serialVersionUID = 1L;
                
                public MobilePhoneImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected MobilePhoneImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML returnPhone(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class ReturnPhoneImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone
        {
            private static final long serialVersionUID = 1L;
            
            public ReturnPhoneImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PREFIX$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "prefix");
            private static final javax.xml.namespace.QName NUMBER$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "number");
            private static final javax.xml.namespace.QName EXTENSION$4 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "extension");
            
            
            /**
             * Gets the "prefix" element
             */
            public java.lang.String getPrefix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "prefix" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix xgetPrefix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                    return target;
                }
            }
            
            /**
             * True if has "prefix" element
             */
            public boolean isSetPrefix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(PREFIX$0) != 0;
                }
            }
            
            /**
             * Sets the "prefix" element
             */
            public void setPrefix(java.lang.String prefix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFIX$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFIX$0);
                    }
                    target.setStringValue(prefix);
                }
            }
            
            /**
             * Sets (as xml) the "prefix" element
             */
            public void xsetPrefix(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix prefix)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix)get_store().find_element_user(PREFIX$0, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix)get_store().add_element_user(PREFIX$0);
                    }
                    target.set(prefix);
                }
            }
            
            /**
             * Unsets the "prefix" element
             */
            public void unsetPrefix()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(PREFIX$0, 0);
                }
            }
            
            /**
             * Gets the "number" element
             */
            public java.lang.String getNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "number" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number xgetNumber()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number)get_store().find_element_user(NUMBER$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "number" element
             */
            public void setNumber(java.lang.String number)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$2);
                    }
                    target.setStringValue(number);
                }
            }
            
            /**
             * Sets (as xml) the "number" element
             */
            public void xsetNumber(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number number)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number)get_store().find_element_user(NUMBER$2, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number)get_store().add_element_user(NUMBER$2);
                    }
                    target.set(number);
                }
            }
            
            /**
             * Gets the "extension" element
             */
            public java.lang.String getExtension()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "extension" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension xgetExtension()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                    return target;
                }
            }
            
            /**
             * True if has "extension" element
             */
            public boolean isSetExtension()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(EXTENSION$4) != 0;
                }
            }
            
            /**
             * Sets the "extension" element
             */
            public void setExtension(java.lang.String extension)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXTENSION$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXTENSION$4);
                    }
                    target.setStringValue(extension);
                }
            }
            
            /**
             * Sets (as xml) the "extension" element
             */
            public void xsetExtension(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension extension)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension)get_store().find_element_user(EXTENSION$4, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension)get_store().add_element_user(EXTENSION$4);
                    }
                    target.set(extension);
                }
            }
            
            /**
             * Unsets the "extension" element
             */
            public void unsetExtension()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(EXTENSION$4, 0);
                }
            }
            /**
             * An XML prefix(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$ReturnPhone$Prefix.
             */
            public static class PrefixImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Prefix
            {
                private static final long serialVersionUID = 1L;
                
                public PrefixImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected PrefixImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML number(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$ReturnPhone$Number.
             */
            public static class NumberImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Number
            {
                private static final long serialVersionUID = 1L;
                
                public NumberImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NumberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML extension(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$ReturnPhone$Extension.
             */
            public static class ExtensionImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.ReturnPhone.Extension
            {
                private static final long serialVersionUID = 1L;
                
                public ExtensionImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected ExtensionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML billingAddress(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class BillingAddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress
        {
            private static final long serialVersionUID = 1L;
            
            public BillingAddressImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName BUILDING$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "building");
            private static final javax.xml.namespace.QName STREET$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "street");
            private static final javax.xml.namespace.QName LOCALITY$4 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "locality");
            private static final javax.xml.namespace.QName TOWN$6 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "town");
            private static final javax.xml.namespace.QName COUNTY$8 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "county");
            private static final javax.xml.namespace.QName POSTCODE$10 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "postcode");
            private static final javax.xml.namespace.QName MAPREF$12 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "mapRef");
            private static final javax.xml.namespace.QName COUNTRY$14 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "country");
            private static final javax.xml.namespace.QName DIRECTIONS$16 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "directions");
            
            
            /**
             * Gets the "building" element
             */
            public java.lang.String getBuilding()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDING$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "building" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building xgetBuilding()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building)get_store().find_element_user(BUILDING$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "building" element
             */
            public void setBuilding(java.lang.String building)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUILDING$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUILDING$0);
                    }
                    target.setStringValue(building);
                }
            }
            
            /**
             * Sets (as xml) the "building" element
             */
            public void xsetBuilding(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building building)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building)get_store().find_element_user(BUILDING$0, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building)get_store().add_element_user(BUILDING$0);
                    }
                    target.set(building);
                }
            }
            
            /**
             * Gets the "street" element
             */
            public java.lang.String getStreet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "street" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street xgetStreet()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street)get_store().find_element_user(STREET$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "street" element
             */
            public void setStreet(java.lang.String street)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STREET$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STREET$2);
                    }
                    target.setStringValue(street);
                }
            }
            
            /**
             * Sets (as xml) the "street" element
             */
            public void xsetStreet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street street)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street)get_store().find_element_user(STREET$2, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street)get_store().add_element_user(STREET$2);
                    }
                    target.set(street);
                }
            }
            
            /**
             * Gets the "locality" element
             */
            public java.lang.String getLocality()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "locality" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality xgetLocality()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality)get_store().find_element_user(LOCALITY$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "locality" element
             */
            public void setLocality(java.lang.String locality)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOCALITY$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOCALITY$4);
                    }
                    target.setStringValue(locality);
                }
            }
            
            /**
             * Sets (as xml) the "locality" element
             */
            public void xsetLocality(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality locality)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality)get_store().find_element_user(LOCALITY$4, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality)get_store().add_element_user(LOCALITY$4);
                    }
                    target.set(locality);
                }
            }
            
            /**
             * Gets the "town" element
             */
            public java.lang.String getTown()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOWN$6, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "town" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town xgetTown()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town)get_store().find_element_user(TOWN$6, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "town" element
             */
            public void setTown(java.lang.String town)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOWN$6, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOWN$6);
                    }
                    target.setStringValue(town);
                }
            }
            
            /**
             * Sets (as xml) the "town" element
             */
            public void xsetTown(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town town)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town)get_store().find_element_user(TOWN$6, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town)get_store().add_element_user(TOWN$6);
                    }
                    target.set(town);
                }
            }
            
            /**
             * Gets the "county" element
             */
            public java.lang.String getCounty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$8, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "county" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County xgetCounty()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County)get_store().find_element_user(COUNTY$8, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "county" element
             */
            public void setCounty(java.lang.String county)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTY$8, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTY$8);
                    }
                    target.setStringValue(county);
                }
            }
            
            /**
             * Sets (as xml) the "county" element
             */
            public void xsetCounty(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County county)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County)get_store().find_element_user(COUNTY$8, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County)get_store().add_element_user(COUNTY$8);
                    }
                    target.set(county);
                }
            }
            
            /**
             * Gets the "postcode" element
             */
            public java.lang.String getPostcode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$10, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "postcode" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode xgetPostcode()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode)get_store().find_element_user(POSTCODE$10, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "postcode" element
             */
            public void setPostcode(java.lang.String postcode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSTCODE$10, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSTCODE$10);
                    }
                    target.setStringValue(postcode);
                }
            }
            
            /**
             * Sets (as xml) the "postcode" element
             */
            public void xsetPostcode(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode postcode)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode)get_store().find_element_user(POSTCODE$10, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode)get_store().add_element_user(POSTCODE$10);
                    }
                    target.set(postcode);
                }
            }
            
            /**
             * Gets the "mapRef" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef getMapRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef)get_store().find_element_user(MAPREF$12, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "mapRef" element
             */
            public boolean isSetMapRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(MAPREF$12) != 0;
                }
            }
            
            /**
             * Sets the "mapRef" element
             */
            public void setMapRef(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef mapRef)
            {
                generatedSetterHelperImpl(mapRef, MAPREF$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "mapRef" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef addNewMapRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef)get_store().add_element_user(MAPREF$12);
                    return target;
                }
            }
            
            /**
             * Unsets the "mapRef" element
             */
            public void unsetMapRef()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(MAPREF$12, 0);
                }
            }
            
            /**
             * Gets the "country" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country getCountry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country)get_store().find_element_user(COUNTRY$14, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * True if has "country" element
             */
            public boolean isSetCountry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(COUNTRY$14) != 0;
                }
            }
            
            /**
             * Sets the "country" element
             */
            public void setCountry(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country country)
            {
                generatedSetterHelperImpl(country, COUNTRY$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "country" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country addNewCountry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country)get_store().add_element_user(COUNTRY$14);
                    return target;
                }
            }
            
            /**
             * Unsets the "country" element
             */
            public void unsetCountry()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(COUNTRY$14, 0);
                }
            }
            
            /**
             * Gets the "directions" element
             */
            public java.lang.String getDirections()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTIONS$16, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "directions" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions xgetDirections()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions)get_store().find_element_user(DIRECTIONS$16, 0);
                    return target;
                }
            }
            
            /**
             * True if has "directions" element
             */
            public boolean isSetDirections()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(DIRECTIONS$16) != 0;
                }
            }
            
            /**
             * Sets the "directions" element
             */
            public void setDirections(java.lang.String directions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIRECTIONS$16, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIRECTIONS$16);
                    }
                    target.setStringValue(directions);
                }
            }
            
            /**
             * Sets (as xml) the "directions" element
             */
            public void xsetDirections(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions directions)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions)get_store().find_element_user(DIRECTIONS$16, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions)get_store().add_element_user(DIRECTIONS$16);
                    }
                    target.set(directions);
                }
            }
            
            /**
             * Unsets the "directions" element
             */
            public void unsetDirections()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(DIRECTIONS$16, 0);
                }
            }
            /**
             * An XML building(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Building.
             */
            public static class BuildingImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Building
            {
                private static final long serialVersionUID = 1L;
                
                public BuildingImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected BuildingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML street(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Street.
             */
            public static class StreetImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Street
            {
                private static final long serialVersionUID = 1L;
                
                public StreetImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected StreetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML locality(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Locality.
             */
            public static class LocalityImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Locality
            {
                private static final long serialVersionUID = 1L;
                
                public LocalityImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected LocalityImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML town(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Town.
             */
            public static class TownImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Town
            {
                private static final long serialVersionUID = 1L;
                
                public TownImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected TownImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML county(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$County.
             */
            public static class CountyImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.County
            {
                private static final long serialVersionUID = 1L;
                
                public CountyImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected CountyImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML postcode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Postcode.
             */
            public static class PostcodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Postcode
            {
                private static final long serialVersionUID = 1L;
                
                public PostcodeImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected PostcodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML mapRef(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class MapRefImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.MapRef
            {
                private static final long serialVersionUID = 1L;
                
                public MapRefImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName LONGITUDE$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "longitude");
                private static final javax.xml.namespace.QName LATITUDE$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "latitude");
                
                
                /**
                 * Gets the "longitude" element
                 */
                public org.apache.xmlbeans.XmlObject getLongitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlObject target = null;
                      target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LONGITUDE$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "longitude" element
                 */
                public boolean isSetLongitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(LONGITUDE$0) != 0;
                    }
                }
                
                /**
                 * Sets the "longitude" element
                 */
                public void setLongitude(org.apache.xmlbeans.XmlObject longitude)
                {
                    generatedSetterHelperImpl(longitude, LONGITUDE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "longitude" element
                 */
                public org.apache.xmlbeans.XmlObject addNewLongitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlObject target = null;
                      target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LONGITUDE$0);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "longitude" element
                 */
                public void unsetLongitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(LONGITUDE$0, 0);
                    }
                }
                
                /**
                 * Gets the "latitude" element
                 */
                public org.apache.xmlbeans.XmlObject getLatitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlObject target = null;
                      target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(LATITUDE$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target;
                    }
                }
                
                /**
                 * True if has "latitude" element
                 */
                public boolean isSetLatitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(LATITUDE$2) != 0;
                    }
                }
                
                /**
                 * Sets the "latitude" element
                 */
                public void setLatitude(org.apache.xmlbeans.XmlObject latitude)
                {
                    generatedSetterHelperImpl(latitude, LATITUDE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                }
                
                /**
                 * Appends and returns a new empty "latitude" element
                 */
                public org.apache.xmlbeans.XmlObject addNewLatitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlObject target = null;
                      target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(LATITUDE$2);
                      return target;
                    }
                }
                
                /**
                 * Unsets the "latitude" element
                 */
                public void unsetLatitude()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(LATITUDE$2, 0);
                    }
                }
            }
            /**
             * An XML country(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class CountryImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country
            {
                private static final long serialVersionUID = 1L;
                
                public CountryImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName NAME$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
                private static final javax.xml.namespace.QName ISOALPHA2$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "isoAlpha2");
                
                
                /**
                 * Gets the "name" element
                 */
                public java.lang.String getName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "name" element
                 */
                public org.apache.xmlbeans.XmlString xgetName()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "name" element
                 */
                public void setName(java.lang.String name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
                      }
                      target.setStringValue(name);
                    }
                }
                
                /**
                 * Sets (as xml) the "name" element
                 */
                public void xsetName(org.apache.xmlbeans.XmlString name)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.XmlString target = null;
                      target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
                      }
                      target.set(name);
                    }
                }
                
                /**
                 * Gets the "isoAlpha2" element
                 */
                public java.lang.String getIsoAlpha2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOALPHA2$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return target.getStringValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "isoAlpha2" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 xgetIsoAlpha2()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2)get_store().find_element_user(ISOALPHA2$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "isoAlpha2" element
                 */
                public void setIsoAlpha2(java.lang.String isoAlpha2)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISOALPHA2$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISOALPHA2$2);
                      }
                      target.setStringValue(isoAlpha2);
                    }
                }
                
                /**
                 * Sets (as xml) the "isoAlpha2" element
                 */
                public void xsetIsoAlpha2(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 isoAlpha2)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2 target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2)get_store().find_element_user(ISOALPHA2$2, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2)get_store().add_element_user(ISOALPHA2$2);
                      }
                      target.set(isoAlpha2);
                    }
                }
                /**
                 * An XML isoAlpha2(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Country$IsoAlpha2.
                 */
                public static class IsoAlpha2Impl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Country.IsoAlpha2
                {
                    private static final long serialVersionUID = 1L;
                    
                    public IsoAlpha2Impl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected IsoAlpha2Impl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
            /**
             * An XML directions(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$BillingAddress$Directions.
             */
            public static class DirectionsImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.BillingAddress.Directions
            {
                private static final long serialVersionUID = 1L;
                
                public DirectionsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected DirectionsImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
        /**
         * An XML pathwayDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class PathwayDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails
        {
            private static final long serialVersionUID = 1L;
            
            public PathwayDetailsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName PATHWAYTRIAGEDETAILS$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "pathwayTriageDetails");
            private static final javax.xml.namespace.QName DEMOGRAPHICS$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "demographics");
            private static final javax.xml.namespace.QName SHAREDCASEID$4 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "sharedCaseId");
            
            
            /**
             * Gets the "pathwayTriageDetails" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails getPathwayTriageDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails)get_store().find_element_user(PATHWAYTRIAGEDETAILS$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "pathwayTriageDetails" element
             */
            public void setPathwayTriageDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails pathwayTriageDetails)
            {
                generatedSetterHelperImpl(pathwayTriageDetails, PATHWAYTRIAGEDETAILS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "pathwayTriageDetails" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails addNewPathwayTriageDetails()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails)get_store().add_element_user(PATHWAYTRIAGEDETAILS$0);
                    return target;
                }
            }
            
            /**
             * Gets the "demographics" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics getDemographics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics)get_store().find_element_user(DEMOGRAPHICS$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target;
                }
            }
            
            /**
             * Sets the "demographics" element
             */
            public void setDemographics(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics demographics)
            {
                generatedSetterHelperImpl(demographics, DEMOGRAPHICS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
            }
            
            /**
             * Appends and returns a new empty "demographics" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics addNewDemographics()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics)get_store().add_element_user(DEMOGRAPHICS$2);
                    return target;
                }
            }
            
            /**
             * Gets the "sharedCaseId" element
             */
            public java.lang.String getSharedCaseId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCASEID$4, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "sharedCaseId" element
             */
            public org.apache.xmlbeans.XmlString xgetSharedCaseId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCASEID$4, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "sharedCaseId" element
             */
            public void setSharedCaseId(java.lang.String sharedCaseId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SHAREDCASEID$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SHAREDCASEID$4);
                    }
                    target.setStringValue(sharedCaseId);
                }
            }
            
            /**
             * Sets (as xml) the "sharedCaseId" element
             */
            public void xsetSharedCaseId(org.apache.xmlbeans.XmlString sharedCaseId)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.XmlString target = null;
                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SHAREDCASEID$4, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SHAREDCASEID$4);
                    }
                    target.set(sharedCaseId);
                }
            }
            /**
             * An XML pathwayTriageDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class PathwayTriageDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails
            {
                private static final long serialVersionUID = 1L;
                
                public PathwayTriageDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName PATHWAYTRIAGE$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "pathwayTriage");
                
                
                /**
                 * Gets array of all "pathwayTriage" elements
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage[] getPathwayTriageArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      java.util.List targetList = new java.util.ArrayList();
                      get_store().find_all_element_users(PATHWAYTRIAGE$0, targetList);
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage[targetList.size()];
                      targetList.toArray(result);
                      return result;
                    }
                }
                
                /**
                 * Gets ith "pathwayTriage" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage getPathwayTriageArray(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage)get_store().find_element_user(PATHWAYTRIAGE$0, i);
                      if (target == null)
                      {
                        throw new IndexOutOfBoundsException();
                      }
                      return target;
                    }
                }
                
                /**
                 * Returns number of "pathwayTriage" element
                 */
                public int sizeOfPathwayTriageArray()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      return get_store().count_elements(PATHWAYTRIAGE$0);
                    }
                }
                
                /**
                 * Sets array of all "pathwayTriage" element  WARNING: This method is not atomicaly synchronized.
                 */
                public void setPathwayTriageArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage[] pathwayTriageArray)
                {
                    check_orphaned();
                    arraySetterHelper(pathwayTriageArray, PATHWAYTRIAGE$0);
                }
                
                /**
                 * Sets ith "pathwayTriage" element
                 */
                public void setPathwayTriageArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage pathwayTriage)
                {
                    generatedSetterHelperImpl(pathwayTriage, PATHWAYTRIAGE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                }
                
                /**
                 * Inserts and returns a new empty value (as xml) as the ith "pathwayTriage" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage insertNewPathwayTriage(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage)get_store().insert_element_user(PATHWAYTRIAGE$0, i);
                      return target;
                    }
                }
                
                /**
                 * Appends and returns a new empty value (as xml) as the last "pathwayTriage" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage addNewPathwayTriage()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage)get_store().add_element_user(PATHWAYTRIAGE$0);
                      return target;
                    }
                }
                
                /**
                 * Removes the ith "pathwayTriage" element
                 */
                public void removePathwayTriage(int i)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      get_store().remove_element(PATHWAYTRIAGE$0, i);
                    }
                }
                /**
                 * An XML pathwayTriage(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is a complex type.
                 */
                public static class PathwayTriageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage
                {
                    private static final long serialVersionUID = 1L;
                    
                    public PathwayTriageImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType);
                    }
                    
                    private static final javax.xml.namespace.QName START$0 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "start");
                    private static final javax.xml.namespace.QName FINISH$2 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "finish");
                    private static final javax.xml.namespace.QName TRIAGEDISPOSITION$4 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "triageDisposition");
                    private static final javax.xml.namespace.QName FINALDISPOSITION$6 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "finalDisposition");
                    private static final javax.xml.namespace.QName TRANSFERCODEDETAILS$8 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "transferCodeDetails");
                    private static final javax.xml.namespace.QName SYSTEMFLAGS$10 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "systemFlags");
                    private static final javax.xml.namespace.QName USER$12 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "user");
                    private static final javax.xml.namespace.QName TRIAGELINEDETAILS$14 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "triageLineDetails");
                    private static final javax.xml.namespace.QName ORIGSITE$16 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "origSite");
                    private static final javax.xml.namespace.QName CALLERISPATIENT$18 = 
                      new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "callerIsPatient");
                    
                    
                    /**
                     * Gets the "start" element
                     */
                    public java.util.Calendar getStart()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "start" element
                     */
                    public org.apache.xmlbeans.XmlDateTime xgetStart()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$0, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "start" element
                     */
                    public void setStart(java.util.Calendar start)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$0);
                        }
                        target.setCalendarValue(start);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "start" element
                     */
                    public void xsetStart(org.apache.xmlbeans.XmlDateTime start)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$0, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(START$0);
                        }
                        target.set(start);
                      }
                    }
                    
                    /**
                     * Gets the "finish" element
                     */
                    public java.util.Calendar getFinish()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$2, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target.getCalendarValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "finish" element
                     */
                    public org.apache.xmlbeans.XmlDateTime xgetFinish()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FINISH$2, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "finish" element
                     */
                    public boolean isSetFinish()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(FINISH$2) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "finish" element
                     */
                    public void setFinish(java.util.Calendar finish)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINISH$2);
                        }
                        target.setCalendarValue(finish);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "finish" element
                     */
                    public void xsetFinish(org.apache.xmlbeans.XmlDateTime finish)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlDateTime target = null;
                        target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FINISH$2, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FINISH$2);
                        }
                        target.set(finish);
                      }
                    }
                    
                    /**
                     * Unsets the "finish" element
                     */
                    public void unsetFinish()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(FINISH$2, 0);
                      }
                    }
                    
                    /**
                     * Gets the "triageDisposition" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition getTriageDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition)get_store().find_element_user(TRIAGEDISPOSITION$4, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "triageDisposition" element
                     */
                    public boolean isSetTriageDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TRIAGEDISPOSITION$4) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "triageDisposition" element
                     */
                    public void setTriageDisposition(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition triageDisposition)
                    {
                      generatedSetterHelperImpl(triageDisposition, TRIAGEDISPOSITION$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "triageDisposition" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition addNewTriageDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition)get_store().add_element_user(TRIAGEDISPOSITION$4);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "triageDisposition" element
                     */
                    public void unsetTriageDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TRIAGEDISPOSITION$4, 0);
                      }
                    }
                    
                    /**
                     * Gets the "finalDisposition" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition getFinalDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition)get_store().find_element_user(FINALDISPOSITION$6, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "finalDisposition" element
                     */
                    public boolean isSetFinalDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(FINALDISPOSITION$6) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "finalDisposition" element
                     */
                    public void setFinalDisposition(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition finalDisposition)
                    {
                      generatedSetterHelperImpl(finalDisposition, FINALDISPOSITION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "finalDisposition" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition addNewFinalDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition)get_store().add_element_user(FINALDISPOSITION$6);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "finalDisposition" element
                     */
                    public void unsetFinalDisposition()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(FINALDISPOSITION$6, 0);
                      }
                    }
                    
                    /**
                     * Gets the "transferCodeDetails" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails getTransferCodeDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails)get_store().find_element_user(TRANSFERCODEDETAILS$8, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "transferCodeDetails" element
                     */
                    public boolean isSetTransferCodeDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TRANSFERCODEDETAILS$8) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "transferCodeDetails" element
                     */
                    public void setTransferCodeDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails transferCodeDetails)
                    {
                      generatedSetterHelperImpl(transferCodeDetails, TRANSFERCODEDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "transferCodeDetails" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails addNewTransferCodeDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails)get_store().add_element_user(TRANSFERCODEDETAILS$8);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "transferCodeDetails" element
                     */
                    public void unsetTransferCodeDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TRANSFERCODEDETAILS$8, 0);
                      }
                    }
                    
                    /**
                     * Gets the "systemFlags" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags getSystemFlags()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags)get_store().find_element_user(SYSTEMFLAGS$10, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "systemFlags" element
                     */
                    public boolean isSetSystemFlags()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(SYSTEMFLAGS$10) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "systemFlags" element
                     */
                    public void setSystemFlags(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags systemFlags)
                    {
                      generatedSetterHelperImpl(systemFlags, SYSTEMFLAGS$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "systemFlags" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags addNewSystemFlags()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags)get_store().add_element_user(SYSTEMFLAGS$10);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "systemFlags" element
                     */
                    public void unsetSystemFlags()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(SYSTEMFLAGS$10, 0);
                      }
                    }
                    
                    /**
                     * Gets the "user" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User getUser()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User)get_store().find_element_user(USER$12, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "user" element
                     */
                    public void setUser(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User user)
                    {
                      generatedSetterHelperImpl(user, USER$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "user" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User addNewUser()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User)get_store().add_element_user(USER$12);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "triageLineDetails" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails getTriageLineDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails)get_store().find_element_user(TRIAGELINEDETAILS$14, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * True if has "triageLineDetails" element
                     */
                    public boolean isSetTriageLineDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        return get_store().count_elements(TRIAGELINEDETAILS$14) != 0;
                      }
                    }
                    
                    /**
                     * Sets the "triageLineDetails" element
                     */
                    public void setTriageLineDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails triageLineDetails)
                    {
                      generatedSetterHelperImpl(triageLineDetails, TRIAGELINEDETAILS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "triageLineDetails" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails addNewTriageLineDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails)get_store().add_element_user(TRIAGELINEDETAILS$14);
                        return target;
                      }
                    }
                    
                    /**
                     * Unsets the "triageLineDetails" element
                     */
                    public void unsetTriageLineDetails()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        get_store().remove_element(TRIAGELINEDETAILS$14, 0);
                      }
                    }
                    
                    /**
                     * Gets the "origSite" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite getOrigSite()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite)get_store().find_element_user(ORIGSITE$16, 0);
                        if (target == null)
                        {
                          return null;
                        }
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "origSite" element
                     */
                    public void setOrigSite(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite origSite)
                    {
                      generatedSetterHelperImpl(origSite, ORIGSITE$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                    }
                    
                    /**
                     * Appends and returns a new empty "origSite" element
                     */
                    public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite addNewOrigSite()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite target = null;
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite)get_store().add_element_user(ORIGSITE$16);
                        return target;
                      }
                    }
                    
                    /**
                     * Gets the "callerIsPatient" element
                     */
                    public boolean getCallerIsPatient()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLERISPATIENT$18, 0);
                        if (target == null)
                        {
                          return false;
                        }
                        return target.getBooleanValue();
                      }
                    }
                    
                    /**
                     * Gets (as xml) the "callerIsPatient" element
                     */
                    public org.apache.xmlbeans.XmlBoolean xgetCallerIsPatient()
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlBoolean target = null;
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CALLERISPATIENT$18, 0);
                        return target;
                      }
                    }
                    
                    /**
                     * Sets the "callerIsPatient" element
                     */
                    public void setCallerIsPatient(boolean callerIsPatient)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.SimpleValue target = null;
                        target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLERISPATIENT$18, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLERISPATIENT$18);
                        }
                        target.setBooleanValue(callerIsPatient);
                      }
                    }
                    
                    /**
                     * Sets (as xml) the "callerIsPatient" element
                     */
                    public void xsetCallerIsPatient(org.apache.xmlbeans.XmlBoolean callerIsPatient)
                    {
                      synchronized (monitor())
                      {
                        check_orphaned();
                        org.apache.xmlbeans.XmlBoolean target = null;
                        target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(CALLERISPATIENT$18, 0);
                        if (target == null)
                        {
                          target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(CALLERISPATIENT$18);
                        }
                        target.set(callerIsPatient);
                      }
                    }
                    /**
                     * An XML triageDisposition(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class TriageDispositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageDisposition
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TriageDispositionImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName INITIALDISPCODE$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "initialDispCode");
                      private static final javax.xml.namespace.QName INITIALDISPTEXT$2 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "initialDispText");
                      private static final javax.xml.namespace.QName TIMEREACHED$4 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "timeReached");
                      
                      
                      /**
                       * Gets the "initialDispCode" element
                       */
                      public java.lang.String getInitialDispCode()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALDISPCODE$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "initialDispCode" element
                       */
                      public org.apache.xmlbeans.XmlString xgetInitialDispCode()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALDISPCODE$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "initialDispCode" element
                       */
                      public void setInitialDispCode(java.lang.String initialDispCode)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALDISPCODE$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALDISPCODE$0);
                          }
                          target.setStringValue(initialDispCode);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "initialDispCode" element
                       */
                      public void xsetInitialDispCode(org.apache.xmlbeans.XmlString initialDispCode)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALDISPCODE$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INITIALDISPCODE$0);
                          }
                          target.set(initialDispCode);
                        }
                      }
                      
                      /**
                       * Gets the "initialDispText" element
                       */
                      public java.lang.String getInitialDispText()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALDISPTEXT$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "initialDispText" element
                       */
                      public org.apache.xmlbeans.XmlString xgetInitialDispText()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALDISPTEXT$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "initialDispText" element
                       */
                      public void setInitialDispText(java.lang.String initialDispText)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INITIALDISPTEXT$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INITIALDISPTEXT$2);
                          }
                          target.setStringValue(initialDispText);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "initialDispText" element
                       */
                      public void xsetInitialDispText(org.apache.xmlbeans.XmlString initialDispText)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(INITIALDISPTEXT$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(INITIALDISPTEXT$2);
                          }
                          target.set(initialDispText);
                        }
                      }
                      
                      /**
                       * Gets the "timeReached" element
                       */
                      public java.util.Calendar getTimeReached()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEREACHED$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getCalendarValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "timeReached" element
                       */
                      public org.apache.xmlbeans.XmlDateTime xgetTimeReached()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDateTime target = null;
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMEREACHED$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "timeReached" element
                       */
                      public void setTimeReached(java.util.Calendar timeReached)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TIMEREACHED$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TIMEREACHED$4);
                          }
                          target.setCalendarValue(timeReached);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "timeReached" element
                       */
                      public void xsetTimeReached(org.apache.xmlbeans.XmlDateTime timeReached)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlDateTime target = null;
                          target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(TIMEREACHED$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(TIMEREACHED$4);
                          }
                          target.set(timeReached);
                        }
                      }
                    }
                    /**
                     * An XML finalDisposition(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class FinalDispositionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public FinalDispositionImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName FINALDISPCODE$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "finalDispCode");
                      private static final javax.xml.namespace.QName FINALDISPTEXT$2 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "finalDisptext");
                      private static final javax.xml.namespace.QName OVERRIDE$4 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "override");
                      
                      
                      /**
                       * Gets the "finalDispCode" element
                       */
                      public java.lang.String getFinalDispCode()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALDISPCODE$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "finalDispCode" element
                       */
                      public org.apache.xmlbeans.XmlString xgetFinalDispCode()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALDISPCODE$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "finalDispCode" element
                       */
                      public void setFinalDispCode(java.lang.String finalDispCode)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALDISPCODE$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINALDISPCODE$0);
                          }
                          target.setStringValue(finalDispCode);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "finalDispCode" element
                       */
                      public void xsetFinalDispCode(org.apache.xmlbeans.XmlString finalDispCode)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALDISPCODE$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINALDISPCODE$0);
                          }
                          target.set(finalDispCode);
                        }
                      }
                      
                      /**
                       * Gets the "finalDisptext" element
                       */
                      public java.lang.String getFinalDisptext()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALDISPTEXT$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "finalDisptext" element
                       */
                      public org.apache.xmlbeans.XmlString xgetFinalDisptext()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALDISPTEXT$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "finalDisptext" element
                       */
                      public void setFinalDisptext(java.lang.String finalDisptext)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINALDISPTEXT$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINALDISPTEXT$2);
                          }
                          target.setStringValue(finalDisptext);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "finalDisptext" element
                       */
                      public void xsetFinalDisptext(org.apache.xmlbeans.XmlString finalDisptext)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FINALDISPTEXT$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FINALDISPTEXT$2);
                          }
                          target.set(finalDisptext);
                        }
                      }
                      
                      /**
                       * Gets the "override" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override.Enum getOverride()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDE$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override.Enum)target.getEnumValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "override" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override xgetOverride()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override)get_store().find_element_user(OVERRIDE$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * True if has "override" element
                       */
                      public boolean isSetOverride()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(OVERRIDE$4) != 0;
                        }
                      }
                      
                      /**
                       * Sets the "override" element
                       */
                      public void setOverride(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override.Enum override)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERRIDE$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERRIDE$4);
                          }
                          target.setEnumValue(override);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "override" element
                       */
                      public void xsetOverride(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override override)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override)get_store().find_element_user(OVERRIDE$4, 0);
                          if (target == null)
                          {
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override)get_store().add_element_user(OVERRIDE$4);
                          }
                          target.set(override);
                        }
                      }
                      
                      /**
                       * Unsets the "override" element
                       */
                      public void unsetOverride()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(OVERRIDE$4, 0);
                        }
                      }
                      /**
                       * An XML override(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$FinalDisposition$Override.
                       */
                      public static class OverrideImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.FinalDisposition.Override
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public OverrideImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected OverrideImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                    /**
                     * An XML transferCodeDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class TransferCodeDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TransferCodeDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName TRANSFERCODE$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "transferCode");
                      
                      
                      /**
                       * Gets array of all "transferCode" elements
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode[] getTransferCodeArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          java.util.List targetList = new java.util.ArrayList();
                          get_store().find_all_element_users(TRANSFERCODE$0, targetList);
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode[targetList.size()];
                          targetList.toArray(result);
                          return result;
                        }
                      }
                      
                      /**
                       * Gets ith "transferCode" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode getTransferCodeArray(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode)get_store().find_element_user(TRANSFERCODE$0, i);
                          if (target == null)
                          {
                            throw new IndexOutOfBoundsException();
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Returns number of "transferCode" element
                       */
                      public int sizeOfTransferCodeArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TRANSFERCODE$0);
                        }
                      }
                      
                      /**
                       * Sets array of all "transferCode" element  WARNING: This method is not atomicaly synchronized.
                       */
                      public void setTransferCodeArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode[] transferCodeArray)
                      {
                        check_orphaned();
                        arraySetterHelper(transferCodeArray, TRANSFERCODE$0);
                      }
                      
                      /**
                       * Sets ith "transferCode" element
                       */
                      public void setTransferCodeArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode transferCode)
                      {
                        generatedSetterHelperImpl(transferCode, TRANSFERCODE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                      }
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "transferCode" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode insertNewTransferCode(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode)get_store().insert_element_user(TRANSFERCODE$0, i);
                          return target;
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "transferCode" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode addNewTransferCode()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode)get_store().add_element_user(TRANSFERCODE$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Removes the ith "transferCode" element
                       */
                      public void removeTransferCode(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TRANSFERCODE$0, i);
                        }
                      }
                      /**
                       * An XML transferCode(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TransferCodeDetails$TransferCode.
                       */
                      public static class TransferCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public TransferCodeImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, true);
                        }
                        
                        protected TransferCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                        
                        private static final javax.xml.namespace.QName TYPE$0 = 
                          new javax.xml.namespace.QName("", "type");
                        
                        
                        /**
                         * Gets the "type" attribute
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type.Enum getType()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                            if (target == null)
                            {
                              return null;
                            }
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type.Enum)target.getEnumValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "type" attribute
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type xgetType()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type)get_store().find_attribute_user(TYPE$0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "type" attribute
                         */
                        public void setType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type.Enum type)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
                            }
                            target.setEnumValue(type);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "type" attribute
                         */
                        public void xsetType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type type)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type)get_store().find_attribute_user(TYPE$0);
                            if (target == null)
                            {
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type)get_store().add_attribute_user(TYPE$0);
                            }
                            target.set(type);
                          }
                        }
                        /**
                         * An XML type(@).
                         *
                         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TransferCodeDetails$TransferCode$Type.
                         */
                        public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TransferCodeDetails.TransferCode.Type
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public TypeImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType, false);
                          }
                          
                          protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                          {
                            super(sType, b);
                          }
                        }
                      }
                    }
                    /**
                     * An XML systemFlags(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class SystemFlagsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public SystemFlagsImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName SYSTEMFLAG$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "systemFlag");
                      
                      
                      /**
                       * Gets array of all "systemFlag" elements
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum[] getSystemFlagArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          java.util.List targetList = new java.util.ArrayList();
                          get_store().find_all_element_users(SYSTEMFLAG$0, targetList);
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum[targetList.size()];
                          for (int i = 0, len = targetList.size() ; i < len ; i++)
                              result[i] = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                          return result;
                        }
                      }
                      
                      /**
                       * Gets ith "systemFlag" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum getSystemFlagArray(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMFLAG$0, i);
                          if (target == null)
                          {
                            throw new IndexOutOfBoundsException();
                          }
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum)target.getEnumValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) array of all "systemFlag" elements
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag[] xgetSystemFlagArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          java.util.List targetList = new java.util.ArrayList();
                          get_store().find_all_element_users(SYSTEMFLAG$0, targetList);
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag[targetList.size()];
                          targetList.toArray(result);
                          return result;
                        }
                      }
                      
                      /**
                       * Gets (as xml) ith "systemFlag" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag xgetSystemFlagArray(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag)get_store().find_element_user(SYSTEMFLAG$0, i);
                          if (target == null)
                          {
                            throw new IndexOutOfBoundsException();
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Returns number of "systemFlag" element
                       */
                      public int sizeOfSystemFlagArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(SYSTEMFLAG$0);
                        }
                      }
                      
                      /**
                       * Sets array of all "systemFlag" element
                       */
                      public void setSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum[] systemFlagArray)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          arraySetterHelper(systemFlagArray, SYSTEMFLAG$0);
                        }
                      }
                      
                      /**
                       * Sets ith "systemFlag" element
                       */
                      public void setSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum systemFlag)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMFLAG$0, i);
                          if (target == null)
                          {
                            throw new IndexOutOfBoundsException();
                          }
                          target.setEnumValue(systemFlag);
                        }
                      }
                      
                      /**
                       * Sets (as xml) array of all "systemFlag" element
                       */
                      public void xsetSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag[]systemFlagArray)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          arraySetterHelper(systemFlagArray, SYSTEMFLAG$0);
                        }
                      }
                      
                      /**
                       * Sets (as xml) ith "systemFlag" element
                       */
                      public void xsetSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag systemFlag)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag)get_store().find_element_user(SYSTEMFLAG$0, i);
                          if (target == null)
                          {
                            throw new IndexOutOfBoundsException();
                          }
                          target.set(systemFlag);
                        }
                      }
                      
                      /**
                       * Inserts the value as the ith "systemFlag" element
                       */
                      public void insertSystemFlag(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum systemFlag)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = 
                            (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SYSTEMFLAG$0, i);
                          target.setEnumValue(systemFlag);
                        }
                      }
                      
                      /**
                       * Appends the value as the last "systemFlag" element
                       */
                      public void addSystemFlag(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag.Enum systemFlag)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMFLAG$0);
                          target.setEnumValue(systemFlag);
                        }
                      }
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "systemFlag" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag insertNewSystemFlag(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag)get_store().insert_element_user(SYSTEMFLAG$0, i);
                          return target;
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "systemFlag" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag addNewSystemFlag()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag)get_store().add_element_user(SYSTEMFLAG$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Removes the ith "systemFlag" element
                       */
                      public void removeSystemFlag(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(SYSTEMFLAG$0, i);
                        }
                      }
                      /**
                       * An XML systemFlag(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$SystemFlags$SystemFlag.
                       */
                      public static class SystemFlagImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.SystemFlags.SystemFlag
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public SystemFlagImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected SystemFlagImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                    /**
                     * An XML user(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class UserImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public UserImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName ID$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
                      private static final javax.xml.namespace.QName NAME$2 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
                      private static final javax.xml.namespace.QName SKILLSET$4 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "skillSet");
                      
                      
                      /**
                       * Gets the "id" element
                       */
                      public java.lang.String getId()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "id" element
                       */
                      public org.apache.xmlbeans.XmlString xgetId()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "id" element
                       */
                      public void setId(java.lang.String id)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                          }
                          target.setStringValue(id);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "id" element
                       */
                      public void xsetId(org.apache.xmlbeans.XmlString id)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                          }
                          target.set(id);
                        }
                      }
                      
                      /**
                       * Gets the "name" element
                       */
                      public java.lang.String getName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "name" element
                       */
                      public org.apache.xmlbeans.XmlString xgetName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "name" element
                       */
                      public void setName(java.lang.String name)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                          }
                          target.setStringValue(name);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "name" element
                       */
                      public void xsetName(org.apache.xmlbeans.XmlString name)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
                          }
                          target.set(name);
                        }
                      }
                      
                      /**
                       * Gets the "skillSet" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet.Enum getSkillSet()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILLSET$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet.Enum)target.getEnumValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "skillSet" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet xgetSkillSet()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet)get_store().find_element_user(SKILLSET$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "skillSet" element
                       */
                      public void setSkillSet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet.Enum skillSet)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SKILLSET$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SKILLSET$4);
                          }
                          target.setEnumValue(skillSet);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "skillSet" element
                       */
                      public void xsetSkillSet(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet skillSet)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet)get_store().find_element_user(SKILLSET$4, 0);
                          if (target == null)
                          {
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet)get_store().add_element_user(SKILLSET$4);
                          }
                          target.set(skillSet);
                        }
                      }
                      /**
                       * An XML skillSet(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$User$SkillSet.
                       */
                      public static class SkillSetImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.User.SkillSet
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public SkillSetImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType, false);
                        }
                        
                        protected SkillSetImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                        {
                          super(sType, b);
                        }
                      }
                    }
                    /**
                     * An XML triageLineDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class TriageLineDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public TriageLineDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName TRIAGELINE$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "triageLine");
                      
                      
                      /**
                       * Gets array of all "triageLine" elements
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine[] getTriageLineArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          java.util.List targetList = new java.util.ArrayList();
                          get_store().find_all_element_users(TRIAGELINE$0, targetList);
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine[targetList.size()];
                          targetList.toArray(result);
                          return result;
                        }
                      }
                      
                      /**
                       * Gets ith "triageLine" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine getTriageLineArray(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine)get_store().find_element_user(TRIAGELINE$0, i);
                          if (target == null)
                          {
                            throw new IndexOutOfBoundsException();
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Returns number of "triageLine" element
                       */
                      public int sizeOfTriageLineArray()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          return get_store().count_elements(TRIAGELINE$0);
                        }
                      }
                      
                      /**
                       * Sets array of all "triageLine" element  WARNING: This method is not atomicaly synchronized.
                       */
                      public void setTriageLineArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine[] triageLineArray)
                      {
                        check_orphaned();
                        arraySetterHelper(triageLineArray, TRIAGELINE$0);
                      }
                      
                      /**
                       * Sets ith "triageLine" element
                       */
                      public void setTriageLineArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine triageLine)
                      {
                        generatedSetterHelperImpl(triageLine, TRIAGELINE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                      }
                      
                      /**
                       * Inserts and returns a new empty value (as xml) as the ith "triageLine" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine insertNewTriageLine(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine)get_store().insert_element_user(TRIAGELINE$0, i);
                          return target;
                        }
                      }
                      
                      /**
                       * Appends and returns a new empty value (as xml) as the last "triageLine" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine addNewTriageLine()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine)get_store().add_element_user(TRIAGELINE$0);
                          return target;
                        }
                      }
                      
                      /**
                       * Removes the ith "triageLine" element
                       */
                      public void removeTriageLine(int i)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          get_store().remove_element(TRIAGELINE$0, i);
                        }
                      }
                      /**
                       * An XML triageLine(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is a complex type.
                       */
                      public static class TriageLineImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public TriageLineImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName START$0 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "start");
                        private static final javax.xml.namespace.QName FINISH$2 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "finish");
                        private static final javax.xml.namespace.QName QUESTIONTYPE$4 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "questionType");
                        private static final javax.xml.namespace.QName QUESTION$6 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "question");
                        private static final javax.xml.namespace.QName CAREADVICEKEYWORDDETAILS$8 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "careAdviceKeywordDetails");
                        private static final javax.xml.namespace.QName DISPOSITIONINSTRUCTION$10 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "dispositionInstruction");
                        private static final javax.xml.namespace.QName CAREADVICEDETAILS$12 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "careAdviceDetails");
                        private static final javax.xml.namespace.QName CLINICALAREA$14 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "clinicalArea");
                        private static final javax.xml.namespace.QName REPORTTEXT$16 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "reportText");
                        private static final javax.xml.namespace.QName USERCOMMENT$18 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "userComment");
                        private static final javax.xml.namespace.QName ACTION$20 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "action");
                        private static final javax.xml.namespace.QName INCLUDEINREPORT$22 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "includeInReport");
                        private static final javax.xml.namespace.QName SYSTEMFLAGS$24 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "systemFlags");
                        
                        
                        /**
                         * Gets the "start" element
                         */
                        public java.util.Calendar getStart()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getCalendarValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "start" element
                         */
                        public org.apache.xmlbeans.XmlDateTime xgetStart()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlDateTime target = null;
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$0, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "start" element
                         */
                        public void setStart(java.util.Calendar start)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(START$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(START$0);
                            }
                            target.setCalendarValue(start);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "start" element
                         */
                        public void xsetStart(org.apache.xmlbeans.XmlDateTime start)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlDateTime target = null;
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(START$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(START$0);
                            }
                            target.set(start);
                          }
                        }
                        
                        /**
                         * Gets the "finish" element
                         */
                        public java.util.Calendar getFinish()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$2, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getCalendarValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "finish" element
                         */
                        public org.apache.xmlbeans.XmlDateTime xgetFinish()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlDateTime target = null;
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FINISH$2, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "finish" element
                         */
                        public void setFinish(java.util.Calendar finish)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FINISH$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FINISH$2);
                            }
                            target.setCalendarValue(finish);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "finish" element
                         */
                        public void xsetFinish(org.apache.xmlbeans.XmlDateTime finish)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlDateTime target = null;
                            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FINISH$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FINISH$2);
                            }
                            target.set(finish);
                          }
                        }
                        
                        /**
                         * Gets the "questionType" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType.Enum getQuestionType()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONTYPE$4, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType.Enum)target.getEnumValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "questionType" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType xgetQuestionType()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType)get_store().find_element_user(QUESTIONTYPE$4, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "questionType" element
                         */
                        public void setQuestionType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType.Enum questionType)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONTYPE$4, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTIONTYPE$4);
                            }
                            target.setEnumValue(questionType);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "questionType" element
                         */
                        public void xsetQuestionType(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType questionType)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType)get_store().find_element_user(QUESTIONTYPE$4, 0);
                            if (target == null)
                            {
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType)get_store().add_element_user(QUESTIONTYPE$4);
                            }
                            target.set(questionType);
                          }
                        }
                        
                        /**
                         * Gets the "question" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question getQuestion()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question)get_store().find_element_user(QUESTION$6, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target;
                          }
                        }
                        
                        /**
                         * True if has "question" element
                         */
                        public boolean isSetQuestion()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            return get_store().count_elements(QUESTION$6) != 0;
                          }
                        }
                        
                        /**
                         * Sets the "question" element
                         */
                        public void setQuestion(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question question)
                        {
                          generatedSetterHelperImpl(question, QUESTION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                        }
                        
                        /**
                         * Appends and returns a new empty "question" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question addNewQuestion()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question)get_store().add_element_user(QUESTION$6);
                            return target;
                          }
                        }
                        
                        /**
                         * Unsets the "question" element
                         */
                        public void unsetQuestion()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            get_store().remove_element(QUESTION$6, 0);
                          }
                        }
                        
                        /**
                         * Gets the "careAdviceKeywordDetails" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails getCareAdviceKeywordDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails)get_store().find_element_user(CAREADVICEKEYWORDDETAILS$8, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target;
                          }
                        }
                        
                        /**
                         * True if has "careAdviceKeywordDetails" element
                         */
                        public boolean isSetCareAdviceKeywordDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            return get_store().count_elements(CAREADVICEKEYWORDDETAILS$8) != 0;
                          }
                        }
                        
                        /**
                         * Sets the "careAdviceKeywordDetails" element
                         */
                        public void setCareAdviceKeywordDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails careAdviceKeywordDetails)
                        {
                          generatedSetterHelperImpl(careAdviceKeywordDetails, CAREADVICEKEYWORDDETAILS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                        }
                        
                        /**
                         * Appends and returns a new empty "careAdviceKeywordDetails" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails addNewCareAdviceKeywordDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails)get_store().add_element_user(CAREADVICEKEYWORDDETAILS$8);
                            return target;
                          }
                        }
                        
                        /**
                         * Unsets the "careAdviceKeywordDetails" element
                         */
                        public void unsetCareAdviceKeywordDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            get_store().remove_element(CAREADVICEKEYWORDDETAILS$8, 0);
                          }
                        }
                        
                        /**
                         * Gets the "dispositionInstruction" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction getDispositionInstruction()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction)get_store().find_element_user(DISPOSITIONINSTRUCTION$10, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target;
                          }
                        }
                        
                        /**
                         * True if has "dispositionInstruction" element
                         */
                        public boolean isSetDispositionInstruction()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            return get_store().count_elements(DISPOSITIONINSTRUCTION$10) != 0;
                          }
                        }
                        
                        /**
                         * Sets the "dispositionInstruction" element
                         */
                        public void setDispositionInstruction(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction dispositionInstruction)
                        {
                          generatedSetterHelperImpl(dispositionInstruction, DISPOSITIONINSTRUCTION$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                        }
                        
                        /**
                         * Appends and returns a new empty "dispositionInstruction" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction addNewDispositionInstruction()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction)get_store().add_element_user(DISPOSITIONINSTRUCTION$10);
                            return target;
                          }
                        }
                        
                        /**
                         * Unsets the "dispositionInstruction" element
                         */
                        public void unsetDispositionInstruction()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            get_store().remove_element(DISPOSITIONINSTRUCTION$10, 0);
                          }
                        }
                        
                        /**
                         * Gets the "careAdviceDetails" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails getCareAdviceDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails)get_store().find_element_user(CAREADVICEDETAILS$12, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target;
                          }
                        }
                        
                        /**
                         * True if has "careAdviceDetails" element
                         */
                        public boolean isSetCareAdviceDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            return get_store().count_elements(CAREADVICEDETAILS$12) != 0;
                          }
                        }
                        
                        /**
                         * Sets the "careAdviceDetails" element
                         */
                        public void setCareAdviceDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails careAdviceDetails)
                        {
                          generatedSetterHelperImpl(careAdviceDetails, CAREADVICEDETAILS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                        }
                        
                        /**
                         * Appends and returns a new empty "careAdviceDetails" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails addNewCareAdviceDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails)get_store().add_element_user(CAREADVICEDETAILS$12);
                            return target;
                          }
                        }
                        
                        /**
                         * Unsets the "careAdviceDetails" element
                         */
                        public void unsetCareAdviceDetails()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            get_store().remove_element(CAREADVICEDETAILS$12, 0);
                          }
                        }
                        
                        /**
                         * Gets the "clinicalArea" element
                         */
                        public java.lang.String getClinicalArea()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALAREA$14, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getStringValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "clinicalArea" element
                         */
                        public org.apache.xmlbeans.XmlString xgetClinicalArea()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLINICALAREA$14, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * True if has "clinicalArea" element
                         */
                        public boolean isSetClinicalArea()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            return get_store().count_elements(CLINICALAREA$14) != 0;
                          }
                        }
                        
                        /**
                         * Sets the "clinicalArea" element
                         */
                        public void setClinicalArea(java.lang.String clinicalArea)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLINICALAREA$14, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLINICALAREA$14);
                            }
                            target.setStringValue(clinicalArea);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "clinicalArea" element
                         */
                        public void xsetClinicalArea(org.apache.xmlbeans.XmlString clinicalArea)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLINICALAREA$14, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLINICALAREA$14);
                            }
                            target.set(clinicalArea);
                          }
                        }
                        
                        /**
                         * Unsets the "clinicalArea" element
                         */
                        public void unsetClinicalArea()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            get_store().remove_element(CLINICALAREA$14, 0);
                          }
                        }
                        
                        /**
                         * Gets the "reportText" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText getReportText()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText)get_store().find_element_user(REPORTTEXT$16, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "reportText" element
                         */
                        public void setReportText(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText reportText)
                        {
                          generatedSetterHelperImpl(reportText, REPORTTEXT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                        }
                        
                        /**
                         * Appends and returns a new empty "reportText" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText addNewReportText()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText)get_store().add_element_user(REPORTTEXT$16);
                            return target;
                          }
                        }
                        
                        /**
                         * Gets the "userComment" element
                         */
                        public java.lang.String getUserComment()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERCOMMENT$18, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getStringValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "userComment" element
                         */
                        public org.apache.xmlbeans.XmlString xgetUserComment()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERCOMMENT$18, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * True if has "userComment" element
                         */
                        public boolean isSetUserComment()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            return get_store().count_elements(USERCOMMENT$18) != 0;
                          }
                        }
                        
                        /**
                         * Sets the "userComment" element
                         */
                        public void setUserComment(java.lang.String userComment)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERCOMMENT$18, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERCOMMENT$18);
                            }
                            target.setStringValue(userComment);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "userComment" element
                         */
                        public void xsetUserComment(org.apache.xmlbeans.XmlString userComment)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(USERCOMMENT$18, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(USERCOMMENT$18);
                            }
                            target.set(userComment);
                          }
                        }
                        
                        /**
                         * Unsets the "userComment" element
                         */
                        public void unsetUserComment()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            get_store().remove_element(USERCOMMENT$18, 0);
                          }
                        }
                        
                        /**
                         * Gets the "action" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action.Enum getAction()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$20, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action.Enum)target.getEnumValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "action" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action xgetAction()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action)get_store().find_element_user(ACTION$20, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "action" element
                         */
                        public void setAction(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action.Enum action)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$20, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$20);
                            }
                            target.setEnumValue(action);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "action" element
                         */
                        public void xsetAction(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action action)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action)get_store().find_element_user(ACTION$20, 0);
                            if (target == null)
                            {
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action)get_store().add_element_user(ACTION$20);
                            }
                            target.set(action);
                          }
                        }
                        
                        /**
                         * Gets the "includeInReport" element
                         */
                        public boolean getIncludeInReport()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEINREPORT$22, 0);
                            if (target == null)
                            {
                              return false;
                            }
                            return target.getBooleanValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "includeInReport" element
                         */
                        public org.apache.xmlbeans.XmlBoolean xgetIncludeInReport()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBoolean target = null;
                            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEINREPORT$22, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "includeInReport" element
                         */
                        public void setIncludeInReport(boolean includeInReport)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INCLUDEINREPORT$22, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INCLUDEINREPORT$22);
                            }
                            target.setBooleanValue(includeInReport);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "includeInReport" element
                         */
                        public void xsetIncludeInReport(org.apache.xmlbeans.XmlBoolean includeInReport)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlBoolean target = null;
                            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(INCLUDEINREPORT$22, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(INCLUDEINREPORT$22);
                            }
                            target.set(includeInReport);
                          }
                        }
                        
                        /**
                         * Gets the "systemFlags" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags getSystemFlags()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags)get_store().find_element_user(SYSTEMFLAGS$24, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target;
                          }
                        }
                        
                        /**
                         * True if has "systemFlags" element
                         */
                        public boolean isSetSystemFlags()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            return get_store().count_elements(SYSTEMFLAGS$24) != 0;
                          }
                        }
                        
                        /**
                         * Sets the "systemFlags" element
                         */
                        public void setSystemFlags(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags systemFlags)
                        {
                          generatedSetterHelperImpl(systemFlags, SYSTEMFLAGS$24, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                        }
                        
                        /**
                         * Appends and returns a new empty "systemFlags" element
                         */
                        public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags addNewSystemFlags()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags target = null;
                            target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags)get_store().add_element_user(SYSTEMFLAGS$24);
                            return target;
                          }
                        }
                        
                        /**
                         * Unsets the "systemFlags" element
                         */
                        public void unsetSystemFlags()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            get_store().remove_element(SYSTEMFLAGS$24, 0);
                          }
                        }
                        /**
                         * An XML questionType(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$QuestionType.
                         */
                        public static class QuestionTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.QuestionType
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public QuestionTypeImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType, false);
                          }
                          
                          protected QuestionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                          {
                            super(sType, b);
                          }
                        }
                        /**
                         * An XML question(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public static class QuestionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public QuestionImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName TRIAGELOGICID$0 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "triageLogicId");
                          private static final javax.xml.namespace.QName QUESTIONID$2 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "questionId");
                          private static final javax.xml.namespace.QName QUESTIONTEXT$4 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "questionText");
                          private static final javax.xml.namespace.QName QUESTIONRATIONALE$6 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "questionRationale");
                          private static final javax.xml.namespace.QName ANSWERS$8 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "answers");
                          private static final javax.xml.namespace.QName DISPOSITIONRATIONALE$10 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "dispositionRationale");
                          
                          
                          /**
                           * Gets the "triageLogicId" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId getTriageLogicId()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId)get_store().find_element_user(TRIAGELOGICID$0, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target;
                            }
                          }
                          
                          /**
                           * Sets the "triageLogicId" element
                           */
                          public void setTriageLogicId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId triageLogicId)
                          {
                            generatedSetterHelperImpl(triageLogicId, TRIAGELOGICID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                          }
                          
                          /**
                           * Appends and returns a new empty "triageLogicId" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId addNewTriageLogicId()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId)get_store().add_element_user(TRIAGELOGICID$0);
                              return target;
                            }
                          }
                          
                          /**
                           * Gets the "questionId" element
                           */
                          public java.lang.String getQuestionId()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONID$2, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target.getStringValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) the "questionId" element
                           */
                          public org.apache.xmlbeans.XmlString xgetQuestionId()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONID$2, 0);
                              return target;
                            }
                          }
                          
                          /**
                           * Sets the "questionId" element
                           */
                          public void setQuestionId(java.lang.String questionId)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONID$2, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTIONID$2);
                              }
                              target.setStringValue(questionId);
                            }
                          }
                          
                          /**
                           * Sets (as xml) the "questionId" element
                           */
                          public void xsetQuestionId(org.apache.xmlbeans.XmlString questionId)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONID$2, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUESTIONID$2);
                              }
                              target.set(questionId);
                            }
                          }
                          
                          /**
                           * Gets the "questionText" element
                           */
                          public java.lang.String getQuestionText()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONTEXT$4, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target.getStringValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) the "questionText" element
                           */
                          public org.apache.xmlbeans.XmlString xgetQuestionText()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONTEXT$4, 0);
                              return target;
                            }
                          }
                          
                          /**
                           * Sets the "questionText" element
                           */
                          public void setQuestionText(java.lang.String questionText)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONTEXT$4, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTIONTEXT$4);
                              }
                              target.setStringValue(questionText);
                            }
                          }
                          
                          /**
                           * Sets (as xml) the "questionText" element
                           */
                          public void xsetQuestionText(org.apache.xmlbeans.XmlString questionText)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONTEXT$4, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUESTIONTEXT$4);
                              }
                              target.set(questionText);
                            }
                          }
                          
                          /**
                           * Gets the "questionRationale" element
                           */
                          public java.lang.String getQuestionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONRATIONALE$6, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target.getStringValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) the "questionRationale" element
                           */
                          public org.apache.xmlbeans.XmlString xgetQuestionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONRATIONALE$6, 0);
                              return target;
                            }
                          }
                          
                          /**
                           * True if has "questionRationale" element
                           */
                          public boolean isSetQuestionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              return get_store().count_elements(QUESTIONRATIONALE$6) != 0;
                            }
                          }
                          
                          /**
                           * Sets the "questionRationale" element
                           */
                          public void setQuestionRationale(java.lang.String questionRationale)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUESTIONRATIONALE$6, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUESTIONRATIONALE$6);
                              }
                              target.setStringValue(questionRationale);
                            }
                          }
                          
                          /**
                           * Sets (as xml) the "questionRationale" element
                           */
                          public void xsetQuestionRationale(org.apache.xmlbeans.XmlString questionRationale)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(QUESTIONRATIONALE$6, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(QUESTIONRATIONALE$6);
                              }
                              target.set(questionRationale);
                            }
                          }
                          
                          /**
                           * Unsets the "questionRationale" element
                           */
                          public void unsetQuestionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              get_store().remove_element(QUESTIONRATIONALE$6, 0);
                            }
                          }
                          
                          /**
                           * Gets the "answers" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers getAnswers()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers)get_store().find_element_user(ANSWERS$8, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target;
                            }
                          }
                          
                          /**
                           * Sets the "answers" element
                           */
                          public void setAnswers(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers answers)
                          {
                            generatedSetterHelperImpl(answers, ANSWERS$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                          }
                          
                          /**
                           * Appends and returns a new empty "answers" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers addNewAnswers()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers)get_store().add_element_user(ANSWERS$8);
                              return target;
                            }
                          }
                          
                          /**
                           * Gets the "dispositionRationale" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale getDispositionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale)get_store().find_element_user(DISPOSITIONRATIONALE$10, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target;
                            }
                          }
                          
                          /**
                           * True if has "dispositionRationale" element
                           */
                          public boolean isSetDispositionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              return get_store().count_elements(DISPOSITIONRATIONALE$10) != 0;
                            }
                          }
                          
                          /**
                           * Sets the "dispositionRationale" element
                           */
                          public void setDispositionRationale(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale dispositionRationale)
                          {
                            generatedSetterHelperImpl(dispositionRationale, DISPOSITIONRATIONALE$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                          }
                          
                          /**
                           * Appends and returns a new empty "dispositionRationale" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale addNewDispositionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale)get_store().add_element_user(DISPOSITIONRATIONALE$10);
                              return target;
                            }
                          }
                          
                          /**
                           * Unsets the "dispositionRationale" element
                           */
                          public void unsetDispositionRationale()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              get_store().remove_element(DISPOSITIONRATIONALE$10, 0);
                            }
                          }
                          /**
                           * An XML triageLogicId(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public static class TriageLogicIdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId
                          {
                            private static final long serialVersionUID = 1L;
                            
                            public TriageLogicIdImpl(org.apache.xmlbeans.SchemaType sType)
                            {
                              super(sType);
                            }
                            
                            private static final javax.xml.namespace.QName PATHWAYVERSION$0 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "pathwayVersion");
                            private static final javax.xml.namespace.QName PATHWAYID$2 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "pathwayId");
                            private static final javax.xml.namespace.QName PATHWAYORDERNO$4 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "pathwayOrderNo");
                            
                            
                            /**
                             * Gets the "pathwayVersion" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion getPathwayVersion()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion)get_store().find_element_user(PATHWAYVERSION$0, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "pathwayVersion" element
                             */
                            public void setPathwayVersion(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion pathwayVersion)
                            {
                              generatedSetterHelperImpl(pathwayVersion, PATHWAYVERSION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                            }
                            
                            /**
                             * Appends and returns a new empty "pathwayVersion" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion addNewPathwayVersion()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion)get_store().add_element_user(PATHWAYVERSION$0);
                                return target;
                              }
                            }
                            
                            /**
                             * Gets the "pathwayId" element
                             */
                            public java.lang.String getPathwayId()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATHWAYID$2, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target.getStringValue();
                              }
                            }
                            
                            /**
                             * Gets (as xml) the "pathwayId" element
                             */
                            public org.apache.xmlbeans.XmlString xgetPathwayId()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATHWAYID$2, 0);
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "pathwayId" element
                             */
                            public void setPathwayId(java.lang.String pathwayId)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATHWAYID$2, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATHWAYID$2);
                                }
                                target.setStringValue(pathwayId);
                              }
                            }
                            
                            /**
                             * Sets (as xml) the "pathwayId" element
                             */
                            public void xsetPathwayId(org.apache.xmlbeans.XmlString pathwayId)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATHWAYID$2, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATHWAYID$2);
                                }
                                target.set(pathwayId);
                              }
                            }
                            
                            /**
                             * Gets the "pathwayOrderNo" element
                             */
                            public java.lang.String getPathwayOrderNo()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATHWAYORDERNO$4, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target.getStringValue();
                              }
                            }
                            
                            /**
                             * Gets (as xml) the "pathwayOrderNo" element
                             */
                            public org.apache.xmlbeans.XmlString xgetPathwayOrderNo()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATHWAYORDERNO$4, 0);
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "pathwayOrderNo" element
                             */
                            public void setPathwayOrderNo(java.lang.String pathwayOrderNo)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PATHWAYORDERNO$4, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PATHWAYORDERNO$4);
                                }
                                target.setStringValue(pathwayOrderNo);
                              }
                            }
                            
                            /**
                             * Sets (as xml) the "pathwayOrderNo" element
                             */
                            public void xsetPathwayOrderNo(org.apache.xmlbeans.XmlString pathwayOrderNo)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PATHWAYORDERNO$4, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PATHWAYORDERNO$4);
                                }
                                target.set(pathwayOrderNo);
                              }
                            }
                            /**
                             * An XML pathwayVersion(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public static class PathwayVersionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.TriageLogicId.PathwayVersion
                            {
                              private static final long serialVersionUID = 1L;
                              
                              public PathwayVersionImpl(org.apache.xmlbeans.SchemaType sType)
                              {
                                super(sType);
                              }
                              
                              private static final javax.xml.namespace.QName MAJOR$0 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "major");
                              private static final javax.xml.namespace.QName MINOR$2 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "minor");
                              private static final javax.xml.namespace.QName SUBREVISION$4 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "subRevision");
                              
                              
                              /**
                               * Gets the "major" element
                               */
                              public int getMajor()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAJOR$0, 0);
                                  if (target == null)
                                  {
                                    return 0;
                                  }
                                  return target.getIntValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "major" element
                               */
                              public org.apache.xmlbeans.XmlInt xgetMajor()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlInt target = null;
                                  target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAJOR$0, 0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "major" element
                               */
                              public void setMajor(int major)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MAJOR$0, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MAJOR$0);
                                  }
                                  target.setIntValue(major);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "major" element
                               */
                              public void xsetMajor(org.apache.xmlbeans.XmlInt major)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlInt target = null;
                                  target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MAJOR$0, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MAJOR$0);
                                  }
                                  target.set(major);
                                }
                              }
                              
                              /**
                               * Gets the "minor" element
                               */
                              public int getMinor()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINOR$2, 0);
                                  if (target == null)
                                  {
                                    return 0;
                                  }
                                  return target.getIntValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "minor" element
                               */
                              public org.apache.xmlbeans.XmlInt xgetMinor()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlInt target = null;
                                  target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINOR$2, 0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "minor" element
                               */
                              public void setMinor(int minor)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MINOR$2, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MINOR$2);
                                  }
                                  target.setIntValue(minor);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "minor" element
                               */
                              public void xsetMinor(org.apache.xmlbeans.XmlInt minor)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlInt target = null;
                                  target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MINOR$2, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MINOR$2);
                                  }
                                  target.set(minor);
                                }
                              }
                              
                              /**
                               * Gets the "subRevision" element
                               */
                              public int getSubRevision()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBREVISION$4, 0);
                                  if (target == null)
                                  {
                                    return 0;
                                  }
                                  return target.getIntValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "subRevision" element
                               */
                              public org.apache.xmlbeans.XmlInt xgetSubRevision()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlInt target = null;
                                  target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBREVISION$4, 0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "subRevision" element
                               */
                              public void setSubRevision(int subRevision)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBREVISION$4, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBREVISION$4);
                                  }
                                  target.setIntValue(subRevision);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "subRevision" element
                               */
                              public void xsetSubRevision(org.apache.xmlbeans.XmlInt subRevision)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlInt target = null;
                                  target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SUBREVISION$4, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SUBREVISION$4);
                                  }
                                  target.set(subRevision);
                                }
                              }
                            }
                          }
                          /**
                           * An XML answers(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public static class AnswersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers
                          {
                            private static final long serialVersionUID = 1L;
                            
                            public AnswersImpl(org.apache.xmlbeans.SchemaType sType)
                            {
                              super(sType);
                            }
                            
                            private static final javax.xml.namespace.QName ANSWER$0 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "answer");
                            
                            
                            /**
                             * Gets array of all "answer" elements
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer[] getAnswerArray()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                java.util.List targetList = new java.util.ArrayList();
                                get_store().find_all_element_users(ANSWER$0, targetList);
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer[targetList.size()];
                                targetList.toArray(result);
                                return result;
                              }
                            }
                            
                            /**
                             * Gets ith "answer" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer getAnswerArray(int i)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer)get_store().find_element_user(ANSWER$0, i);
                                if (target == null)
                                {
                                  throw new IndexOutOfBoundsException();
                                }
                                return target;
                              }
                            }
                            
                            /**
                             * Returns number of "answer" element
                             */
                            public int sizeOfAnswerArray()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                return get_store().count_elements(ANSWER$0);
                              }
                            }
                            
                            /**
                             * Sets array of all "answer" element  WARNING: This method is not atomicaly synchronized.
                             */
                            public void setAnswerArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer[] answerArray)
                            {
                              check_orphaned();
                              arraySetterHelper(answerArray, ANSWER$0);
                            }
                            
                            /**
                             * Sets ith "answer" element
                             */
                            public void setAnswerArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer answer)
                            {
                              generatedSetterHelperImpl(answer, ANSWER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                            }
                            
                            /**
                             * Inserts and returns a new empty value (as xml) as the ith "answer" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer insertNewAnswer(int i)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer)get_store().insert_element_user(ANSWER$0, i);
                                return target;
                              }
                            }
                            
                            /**
                             * Appends and returns a new empty value (as xml) as the last "answer" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer addNewAnswer()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer)get_store().add_element_user(ANSWER$0);
                                return target;
                              }
                            }
                            
                            /**
                             * Removes the ith "answer" element
                             */
                            public void removeAnswer(int i)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                get_store().remove_element(ANSWER$0, i);
                              }
                            }
                            /**
                             * An XML answer(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public static class AnswerImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.Answers.Answer
                            {
                              private static final long serialVersionUID = 1L;
                              
                              public AnswerImpl(org.apache.xmlbeans.SchemaType sType)
                              {
                                super(sType);
                              }
                              
                              private static final javax.xml.namespace.QName TEXT$0 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "text");
                              private static final javax.xml.namespace.QName RATIONALE$2 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "rationale");
                              private static final javax.xml.namespace.QName SELECTED$4 = 
                                new javax.xml.namespace.QName("", "selected");
                              
                              
                              /**
                               * Gets the "text" element
                               */
                              public java.lang.String getText()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
                                  if (target == null)
                                  {
                                    return null;
                                  }
                                  return target.getStringValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "text" element
                               */
                              public org.apache.xmlbeans.XmlString xgetText()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "text" element
                               */
                              public void setText(java.lang.String text)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$0);
                                  }
                                  target.setStringValue(text);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "text" element
                               */
                              public void xsetText(org.apache.xmlbeans.XmlString text)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$0);
                                  }
                                  target.set(text);
                                }
                              }
                              
                              /**
                               * Gets the "rationale" element
                               */
                              public java.lang.String getRationale()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATIONALE$2, 0);
                                  if (target == null)
                                  {
                                    return null;
                                  }
                                  return target.getStringValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "rationale" element
                               */
                              public org.apache.xmlbeans.XmlString xgetRationale()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RATIONALE$2, 0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "rationale" element
                               */
                              public void setRationale(java.lang.String rationale)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RATIONALE$2, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RATIONALE$2);
                                  }
                                  target.setStringValue(rationale);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "rationale" element
                               */
                              public void xsetRationale(org.apache.xmlbeans.XmlString rationale)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RATIONALE$2, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RATIONALE$2);
                                  }
                                  target.set(rationale);
                                }
                              }
                              
                              /**
                               * Gets the "selected" attribute
                               */
                              public boolean getSelected()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTED$4);
                                  if (target == null)
                                  {
                                    return false;
                                  }
                                  return target.getBooleanValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "selected" attribute
                               */
                              public org.apache.xmlbeans.XmlBoolean xgetSelected()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlBoolean target = null;
                                  target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTED$4);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "selected" attribute
                               */
                              public void setSelected(boolean selected)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SELECTED$4);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SELECTED$4);
                                  }
                                  target.setBooleanValue(selected);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "selected" attribute
                               */
                              public void xsetSelected(org.apache.xmlbeans.XmlBoolean selected)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlBoolean target = null;
                                  target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(SELECTED$4);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(SELECTED$4);
                                  }
                                  target.set(selected);
                                }
                              }
                            }
                          }
                          /**
                           * An XML dispositionRationale(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public static class DispositionRationaleImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Question.DispositionRationale
                          {
                            private static final long serialVersionUID = 1L;
                            
                            public DispositionRationaleImpl(org.apache.xmlbeans.SchemaType sType)
                            {
                              super(sType);
                            }
                            
                            private static final javax.xml.namespace.QName TERM$0 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "term");
                            private static final javax.xml.namespace.QName CODE$2 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "code");
                            
                            
                            /**
                             * Gets the "term" element
                             */
                            public java.lang.String getTerm()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$0, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target.getStringValue();
                              }
                            }
                            
                            /**
                             * Gets (as xml) the "term" element
                             */
                            public org.apache.xmlbeans.XmlString xgetTerm()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$0, 0);
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "term" element
                             */
                            public void setTerm(java.lang.String term)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TERM$0, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TERM$0);
                                }
                                target.setStringValue(term);
                              }
                            }
                            
                            /**
                             * Sets (as xml) the "term" element
                             */
                            public void xsetTerm(org.apache.xmlbeans.XmlString term)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TERM$0, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TERM$0);
                                }
                                target.set(term);
                              }
                            }
                            
                            /**
                             * Gets the "code" element
                             */
                            public java.lang.String getCode()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target.getStringValue();
                              }
                            }
                            
                            /**
                             * Gets (as xml) the "code" element
                             */
                            public org.apache.xmlbeans.XmlString xgetCode()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "code" element
                             */
                            public void setCode(java.lang.String code)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CODE$2, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CODE$2);
                                }
                                target.setStringValue(code);
                              }
                            }
                            
                            /**
                             * Sets (as xml) the "code" element
                             */
                            public void xsetCode(org.apache.xmlbeans.XmlString code)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CODE$2, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CODE$2);
                                }
                                target.set(code);
                              }
                            }
                          }
                        }
                        /**
                         * An XML careAdviceKeywordDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public static class CareAdviceKeywordDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceKeywordDetails
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public CareAdviceKeywordDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName CAREADVICEKEYWORD$0 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "careAdviceKeyword");
                          
                          
                          /**
                           * Gets array of all "careAdviceKeyword" elements
                           */
                          public java.lang.String[] getCareAdviceKeywordArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              java.util.List targetList = new java.util.ArrayList();
                              get_store().find_all_element_users(CAREADVICEKEYWORD$0, targetList);
                              java.lang.String[] result = new java.lang.String[targetList.size()];
                              for (int i = 0, len = targetList.size() ; i < len ; i++)
                                  result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
                              return result;
                            }
                          }
                          
                          /**
                           * Gets ith "careAdviceKeyword" element
                           */
                          public java.lang.String getCareAdviceKeywordArray(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREADVICEKEYWORD$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              return target.getStringValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) array of all "careAdviceKeyword" elements
                           */
                          public org.apache.xmlbeans.XmlString[] xgetCareAdviceKeywordArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              java.util.List targetList = new java.util.ArrayList();
                              get_store().find_all_element_users(CAREADVICEKEYWORD$0, targetList);
                              org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
                              targetList.toArray(result);
                              return result;
                            }
                          }
                          
                          /**
                           * Gets (as xml) ith "careAdviceKeyword" element
                           */
                          public org.apache.xmlbeans.XmlString xgetCareAdviceKeywordArray(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAREADVICEKEYWORD$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              return target;
                            }
                          }
                          
                          /**
                           * Returns number of "careAdviceKeyword" element
                           */
                          public int sizeOfCareAdviceKeywordArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              return get_store().count_elements(CAREADVICEKEYWORD$0);
                            }
                          }
                          
                          /**
                           * Sets array of all "careAdviceKeyword" element
                           */
                          public void setCareAdviceKeywordArray(java.lang.String[] careAdviceKeywordArray)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              arraySetterHelper(careAdviceKeywordArray, CAREADVICEKEYWORD$0);
                            }
                          }
                          
                          /**
                           * Sets ith "careAdviceKeyword" element
                           */
                          public void setCareAdviceKeywordArray(int i, java.lang.String careAdviceKeyword)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CAREADVICEKEYWORD$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              target.setStringValue(careAdviceKeyword);
                            }
                          }
                          
                          /**
                           * Sets (as xml) array of all "careAdviceKeyword" element
                           */
                          public void xsetCareAdviceKeywordArray(org.apache.xmlbeans.XmlString[]careAdviceKeywordArray)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              arraySetterHelper(careAdviceKeywordArray, CAREADVICEKEYWORD$0);
                            }
                          }
                          
                          /**
                           * Sets (as xml) ith "careAdviceKeyword" element
                           */
                          public void xsetCareAdviceKeywordArray(int i, org.apache.xmlbeans.XmlString careAdviceKeyword)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CAREADVICEKEYWORD$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              target.set(careAdviceKeyword);
                            }
                          }
                          
                          /**
                           * Inserts the value as the ith "careAdviceKeyword" element
                           */
                          public void insertCareAdviceKeyword(int i, java.lang.String careAdviceKeyword)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = 
                                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CAREADVICEKEYWORD$0, i);
                              target.setStringValue(careAdviceKeyword);
                            }
                          }
                          
                          /**
                           * Appends the value as the last "careAdviceKeyword" element
                           */
                          public void addCareAdviceKeyword(java.lang.String careAdviceKeyword)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CAREADVICEKEYWORD$0);
                              target.setStringValue(careAdviceKeyword);
                            }
                          }
                          
                          /**
                           * Inserts and returns a new empty value (as xml) as the ith "careAdviceKeyword" element
                           */
                          public org.apache.xmlbeans.XmlString insertNewCareAdviceKeyword(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CAREADVICEKEYWORD$0, i);
                              return target;
                            }
                          }
                          
                          /**
                           * Appends and returns a new empty value (as xml) as the last "careAdviceKeyword" element
                           */
                          public org.apache.xmlbeans.XmlString addNewCareAdviceKeyword()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CAREADVICEKEYWORD$0);
                              return target;
                            }
                          }
                          
                          /**
                           * Removes the ith "careAdviceKeyword" element
                           */
                          public void removeCareAdviceKeyword(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              get_store().remove_element(CAREADVICEKEYWORD$0, i);
                            }
                          }
                        }
                        /**
                         * An XML dispositionInstruction(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public static class DispositionInstructionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public DispositionInstructionImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName ID$0 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
                          private static final javax.xml.namespace.QName ITEMDETAILS$2 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "itemDetails");
                          
                          
                          /**
                           * Gets the "id" element
                           */
                          public java.lang.String getId()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target.getStringValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) the "id" element
                           */
                          public org.apache.xmlbeans.XmlString xgetId()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                              return target;
                            }
                          }
                          
                          /**
                           * Sets the "id" element
                           */
                          public void setId(java.lang.String id)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                              }
                              target.setStringValue(id);
                            }
                          }
                          
                          /**
                           * Sets (as xml) the "id" element
                           */
                          public void xsetId(org.apache.xmlbeans.XmlString id)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                              }
                              target.set(id);
                            }
                          }
                          
                          /**
                           * Gets the "itemDetails" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails getItemDetails()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails)get_store().find_element_user(ITEMDETAILS$2, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target;
                            }
                          }
                          
                          /**
                           * Sets the "itemDetails" element
                           */
                          public void setItemDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails itemDetails)
                          {
                            generatedSetterHelperImpl(itemDetails, ITEMDETAILS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                          }
                          
                          /**
                           * Appends and returns a new empty "itemDetails" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails addNewItemDetails()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails)get_store().add_element_user(ITEMDETAILS$2);
                              return target;
                            }
                          }
                          /**
                           * An XML itemDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public static class ItemDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails
                          {
                            private static final long serialVersionUID = 1L;
                            
                            public ItemDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                            {
                              super(sType);
                            }
                            
                            private static final javax.xml.namespace.QName ITEM$0 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "item");
                            
                            
                            /**
                             * Gets array of all "item" elements
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item[] getItemArray()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                java.util.List targetList = new java.util.ArrayList();
                                get_store().find_all_element_users(ITEM$0, targetList);
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item[targetList.size()];
                                targetList.toArray(result);
                                return result;
                              }
                            }
                            
                            /**
                             * Gets ith "item" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item getItemArray(int i)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item)get_store().find_element_user(ITEM$0, i);
                                if (target == null)
                                {
                                  throw new IndexOutOfBoundsException();
                                }
                                return target;
                              }
                            }
                            
                            /**
                             * Returns number of "item" element
                             */
                            public int sizeOfItemArray()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                return get_store().count_elements(ITEM$0);
                              }
                            }
                            
                            /**
                             * Sets array of all "item" element  WARNING: This method is not atomicaly synchronized.
                             */
                            public void setItemArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item[] itemArray)
                            {
                              check_orphaned();
                              arraySetterHelper(itemArray, ITEM$0);
                            }
                            
                            /**
                             * Sets ith "item" element
                             */
                            public void setItemArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item item)
                            {
                              generatedSetterHelperImpl(item, ITEM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                            }
                            
                            /**
                             * Inserts and returns a new empty value (as xml) as the ith "item" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item insertNewItem(int i)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item)get_store().insert_element_user(ITEM$0, i);
                                return target;
                              }
                            }
                            
                            /**
                             * Appends and returns a new empty value (as xml) as the last "item" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item addNewItem()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item)get_store().add_element_user(ITEM$0);
                                return target;
                              }
                            }
                            
                            /**
                             * Removes the ith "item" element
                             */
                            public void removeItem(int i)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                get_store().remove_element(ITEM$0, i);
                              }
                            }
                            /**
                             * An XML item(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.DispositionInstruction.ItemDetails.Item
                            {
                              private static final long serialVersionUID = 1L;
                              
                              public ItemImpl(org.apache.xmlbeans.SchemaType sType)
                              {
                                super(sType);
                              }
                              
                              private static final javax.xml.namespace.QName ID$0 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
                              private static final javax.xml.namespace.QName TEXT$2 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "text");
                              
                              
                              /**
                               * Gets the "id" element
                               */
                              public java.lang.String getId()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                                  if (target == null)
                                  {
                                    return null;
                                  }
                                  return target.getStringValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "id" element
                               */
                              public org.apache.xmlbeans.XmlString xgetId()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "id" element
                               */
                              public void setId(java.lang.String id)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                                  }
                                  target.setStringValue(id);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "id" element
                               */
                              public void xsetId(org.apache.xmlbeans.XmlString id)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                                  }
                                  target.set(id);
                                }
                              }
                              
                              /**
                               * Gets the "text" element
                               */
                              public java.lang.String getText()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
                                  if (target == null)
                                  {
                                    return null;
                                  }
                                  return target.getStringValue();
                                }
                              }
                              
                              /**
                               * Gets (as xml) the "text" element
                               */
                              public org.apache.xmlbeans.XmlString xgetText()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$2, 0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Sets the "text" element
                               */
                              public void setText(java.lang.String text)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.SimpleValue target = null;
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$2);
                                  }
                                  target.setStringValue(text);
                                }
                              }
                              
                              /**
                               * Sets (as xml) the "text" element
                               */
                              public void xsetText(org.apache.xmlbeans.XmlString text)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.apache.xmlbeans.XmlString target = null;
                                  target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$2, 0);
                                  if (target == null)
                                  {
                                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$2);
                                  }
                                  target.set(text);
                                }
                              }
                            }
                          }
                        }
                        /**
                         * An XML careAdviceDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public static class CareAdviceDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public CareAdviceDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName CAREADVICE$0 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "careAdvice");
                          
                          
                          /**
                           * Gets array of all "careAdvice" elements
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice[] getCareAdviceArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              java.util.List targetList = new java.util.ArrayList();
                              get_store().find_all_element_users(CAREADVICE$0, targetList);
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice[targetList.size()];
                              targetList.toArray(result);
                              return result;
                            }
                          }
                          
                          /**
                           * Gets ith "careAdvice" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice getCareAdviceArray(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice)get_store().find_element_user(CAREADVICE$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              return target;
                            }
                          }
                          
                          /**
                           * Returns number of "careAdvice" element
                           */
                          public int sizeOfCareAdviceArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              return get_store().count_elements(CAREADVICE$0);
                            }
                          }
                          
                          /**
                           * Sets array of all "careAdvice" element  WARNING: This method is not atomicaly synchronized.
                           */
                          public void setCareAdviceArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice[] careAdviceArray)
                          {
                            check_orphaned();
                            arraySetterHelper(careAdviceArray, CAREADVICE$0);
                          }
                          
                          /**
                           * Sets ith "careAdvice" element
                           */
                          public void setCareAdviceArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice careAdvice)
                          {
                            generatedSetterHelperImpl(careAdvice, CAREADVICE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                          }
                          
                          /**
                           * Inserts and returns a new empty value (as xml) as the ith "careAdvice" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice insertNewCareAdvice(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice)get_store().insert_element_user(CAREADVICE$0, i);
                              return target;
                            }
                          }
                          
                          /**
                           * Appends and returns a new empty value (as xml) as the last "careAdvice" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice addNewCareAdvice()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice)get_store().add_element_user(CAREADVICE$0);
                              return target;
                            }
                          }
                          
                          /**
                           * Removes the ith "careAdvice" element
                           */
                          public void removeCareAdvice(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              get_store().remove_element(CAREADVICE$0, i);
                            }
                          }
                          /**
                           * An XML careAdvice(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is a complex type.
                           */
                          public static class CareAdviceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice
                          {
                            private static final long serialVersionUID = 1L;
                            
                            public CareAdviceImpl(org.apache.xmlbeans.SchemaType sType)
                            {
                              super(sType);
                            }
                            
                            private static final javax.xml.namespace.QName ID$0 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
                            private static final javax.xml.namespace.QName TOPIC$2 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "topic");
                            private static final javax.xml.namespace.QName ITEMDETAILS$4 = 
                              new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "itemDetails");
                            
                            
                            /**
                             * Gets the "id" element
                             */
                            public java.lang.String getId()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target.getStringValue();
                              }
                            }
                            
                            /**
                             * Gets (as xml) the "id" element
                             */
                            public org.apache.xmlbeans.XmlString xgetId()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "id" element
                             */
                            public void setId(java.lang.String id)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                                }
                                target.setStringValue(id);
                              }
                            }
                            
                            /**
                             * Sets (as xml) the "id" element
                             */
                            public void xsetId(org.apache.xmlbeans.XmlString id)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                                }
                                target.set(id);
                              }
                            }
                            
                            /**
                             * Gets the "topic" element
                             */
                            public java.lang.String getTopic()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPIC$2, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target.getStringValue();
                              }
                            }
                            
                            /**
                             * Gets (as xml) the "topic" element
                             */
                            public org.apache.xmlbeans.XmlString xgetTopic()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPIC$2, 0);
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "topic" element
                             */
                            public void setTopic(java.lang.String topic)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.SimpleValue target = null;
                                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOPIC$2, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOPIC$2);
                                }
                                target.setStringValue(topic);
                              }
                            }
                            
                            /**
                             * Sets (as xml) the "topic" element
                             */
                            public void xsetTopic(org.apache.xmlbeans.XmlString topic)
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.apache.xmlbeans.XmlString target = null;
                                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TOPIC$2, 0);
                                if (target == null)
                                {
                                  target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TOPIC$2);
                                }
                                target.set(topic);
                              }
                            }
                            
                            /**
                             * Gets the "itemDetails" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails getItemDetails()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails)get_store().find_element_user(ITEMDETAILS$4, 0);
                                if (target == null)
                                {
                                  return null;
                                }
                                return target;
                              }
                            }
                            
                            /**
                             * Sets the "itemDetails" element
                             */
                            public void setItemDetails(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails itemDetails)
                            {
                              generatedSetterHelperImpl(itemDetails, ITEMDETAILS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                            }
                            
                            /**
                             * Appends and returns a new empty "itemDetails" element
                             */
                            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails addNewItemDetails()
                            {
                              synchronized (monitor())
                              {
                                check_orphaned();
                                org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails target = null;
                                target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails)get_store().add_element_user(ITEMDETAILS$4);
                                return target;
                              }
                            }
                            /**
                             * An XML itemDetails(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                             *
                             * This is a complex type.
                             */
                            public static class ItemDetailsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails
                            {
                              private static final long serialVersionUID = 1L;
                              
                              public ItemDetailsImpl(org.apache.xmlbeans.SchemaType sType)
                              {
                                super(sType);
                              }
                              
                              private static final javax.xml.namespace.QName ITEM$0 = 
                                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "item");
                              
                              
                              /**
                               * Gets array of all "item" elements
                               */
                              public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item[] getItemArray()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  java.util.List targetList = new java.util.ArrayList();
                                  get_store().find_all_element_users(ITEM$0, targetList);
                                  org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item[targetList.size()];
                                  targetList.toArray(result);
                                  return result;
                                }
                              }
                              
                              /**
                               * Gets ith "item" element
                               */
                              public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item getItemArray(int i)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item target = null;
                                  target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item)get_store().find_element_user(ITEM$0, i);
                                  if (target == null)
                                  {
                                    throw new IndexOutOfBoundsException();
                                  }
                                  return target;
                                }
                              }
                              
                              /**
                               * Returns number of "item" element
                               */
                              public int sizeOfItemArray()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  return get_store().count_elements(ITEM$0);
                                }
                              }
                              
                              /**
                               * Sets array of all "item" element  WARNING: This method is not atomicaly synchronized.
                               */
                              public void setItemArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item[] itemArray)
                              {
                                check_orphaned();
                                arraySetterHelper(itemArray, ITEM$0);
                              }
                              
                              /**
                               * Sets ith "item" element
                               */
                              public void setItemArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item item)
                              {
                                generatedSetterHelperImpl(item, ITEM$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
                              }
                              
                              /**
                               * Inserts and returns a new empty value (as xml) as the ith "item" element
                               */
                              public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item insertNewItem(int i)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item target = null;
                                  target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item)get_store().insert_element_user(ITEM$0, i);
                                  return target;
                                }
                              }
                              
                              /**
                               * Appends and returns a new empty value (as xml) as the last "item" element
                               */
                              public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item addNewItem()
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item target = null;
                                  target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item)get_store().add_element_user(ITEM$0);
                                  return target;
                                }
                              }
                              
                              /**
                               * Removes the ith "item" element
                               */
                              public void removeItem(int i)
                              {
                                synchronized (monitor())
                                {
                                  check_orphaned();
                                  get_store().remove_element(ITEM$0, i);
                                }
                              }
                              /**
                               * An XML item(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                               *
                               * This is a complex type.
                               */
                              public static class ItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.CareAdviceDetails.CareAdvice.ItemDetails.Item
                              {
                                private static final long serialVersionUID = 1L;
                                
                                public ItemImpl(org.apache.xmlbeans.SchemaType sType)
                                {
                                  super(sType);
                                }
                                
                                private static final javax.xml.namespace.QName ID$0 = 
                                  new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
                                private static final javax.xml.namespace.QName TEXT$2 = 
                                  new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "text");
                                
                                
                                /**
                                 * Gets the "id" element
                                 */
                                public java.lang.String getId()
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.SimpleValue target = null;
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                                    if (target == null)
                                    {
                                      return null;
                                    }
                                    return target.getStringValue();
                                  }
                                }
                                
                                /**
                                 * Gets (as xml) the "id" element
                                 */
                                public org.apache.xmlbeans.XmlString xgetId()
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.XmlString target = null;
                                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                                    return target;
                                  }
                                }
                                
                                /**
                                 * Sets the "id" element
                                 */
                                public void setId(java.lang.String id)
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.SimpleValue target = null;
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                                    if (target == null)
                                    {
                                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                                    }
                                    target.setStringValue(id);
                                  }
                                }
                                
                                /**
                                 * Sets (as xml) the "id" element
                                 */
                                public void xsetId(org.apache.xmlbeans.XmlString id)
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.XmlString target = null;
                                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$0, 0);
                                    if (target == null)
                                    {
                                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$0);
                                    }
                                    target.set(id);
                                  }
                                }
                                
                                /**
                                 * Gets the "text" element
                                 */
                                public java.lang.String getText()
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.SimpleValue target = null;
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
                                    if (target == null)
                                    {
                                      return null;
                                    }
                                    return target.getStringValue();
                                  }
                                }
                                
                                /**
                                 * Gets (as xml) the "text" element
                                 */
                                public org.apache.xmlbeans.XmlString xgetText()
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.XmlString target = null;
                                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$2, 0);
                                    return target;
                                  }
                                }
                                
                                /**
                                 * Sets the "text" element
                                 */
                                public void setText(java.lang.String text)
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.SimpleValue target = null;
                                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$2, 0);
                                    if (target == null)
                                    {
                                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$2);
                                    }
                                    target.setStringValue(text);
                                  }
                                }
                                
                                /**
                                 * Sets (as xml) the "text" element
                                 */
                                public void xsetText(org.apache.xmlbeans.XmlString text)
                                {
                                  synchronized (monitor())
                                  {
                                    check_orphaned();
                                    org.apache.xmlbeans.XmlString target = null;
                                    target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$2, 0);
                                    if (target == null)
                                    {
                                      target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$2);
                                    }
                                    target.set(text);
                                  }
                                }
                              }
                            }
                          }
                        }
                        /**
                         * An XML reportText(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public static class ReportTextImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.ReportText
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public ReportTextImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName TEXT$0 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "text");
                          private static final javax.xml.namespace.QName POSITIVE$2 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "positive");
                          
                          
                          /**
                           * Gets the "text" element
                           */
                          public java.lang.String getText()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
                              if (target == null)
                              {
                                return null;
                              }
                              return target.getStringValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) the "text" element
                           */
                          public org.apache.xmlbeans.XmlString xgetText()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
                              return target;
                            }
                          }
                          
                          /**
                           * Sets the "text" element
                           */
                          public void setText(java.lang.String text)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TEXT$0, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TEXT$0);
                              }
                              target.setStringValue(text);
                            }
                          }
                          
                          /**
                           * Sets (as xml) the "text" element
                           */
                          public void xsetText(org.apache.xmlbeans.XmlString text)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlString target = null;
                              target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TEXT$0, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TEXT$0);
                              }
                              target.set(text);
                            }
                          }
                          
                          /**
                           * Gets the "positive" element
                           */
                          public boolean getPositive()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITIVE$2, 0);
                              if (target == null)
                              {
                                return false;
                              }
                              return target.getBooleanValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) the "positive" element
                           */
                          public org.apache.xmlbeans.XmlBoolean xgetPositive()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlBoolean target = null;
                              target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSITIVE$2, 0);
                              return target;
                            }
                          }
                          
                          /**
                           * True if has "positive" element
                           */
                          public boolean isSetPositive()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              return get_store().count_elements(POSITIVE$2) != 0;
                            }
                          }
                          
                          /**
                           * Sets the "positive" element
                           */
                          public void setPositive(boolean positive)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(POSITIVE$2, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(POSITIVE$2);
                              }
                              target.setBooleanValue(positive);
                            }
                          }
                          
                          /**
                           * Sets (as xml) the "positive" element
                           */
                          public void xsetPositive(org.apache.xmlbeans.XmlBoolean positive)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.XmlBoolean target = null;
                              target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(POSITIVE$2, 0);
                              if (target == null)
                              {
                                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(POSITIVE$2);
                              }
                              target.set(positive);
                            }
                          }
                          
                          /**
                           * Unsets the "positive" element
                           */
                          public void unsetPositive()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              get_store().remove_element(POSITIVE$2, 0);
                            }
                          }
                        }
                        /**
                         * An XML action(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$Action.
                         */
                        public static class ActionImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.Action
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public ActionImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType, false);
                          }
                          
                          protected ActionImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                          {
                            super(sType, b);
                          }
                        }
                        /**
                         * An XML systemFlags(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                         *
                         * This is a complex type.
                         */
                        public static class SystemFlagsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags
                        {
                          private static final long serialVersionUID = 1L;
                          
                          public SystemFlagsImpl(org.apache.xmlbeans.SchemaType sType)
                          {
                            super(sType);
                          }
                          
                          private static final javax.xml.namespace.QName SYSTEMFLAG$0 = 
                            new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "systemFlag");
                          
                          
                          /**
                           * Gets array of all "systemFlag" elements
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum[] getSystemFlagArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              java.util.List targetList = new java.util.ArrayList();
                              get_store().find_all_element_users(SYSTEMFLAG$0, targetList);
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum[targetList.size()];
                              for (int i = 0, len = targetList.size() ; i < len ; i++)
                                  result[i] = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum)((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getEnumValue();
                              return result;
                            }
                          }
                          
                          /**
                           * Gets ith "systemFlag" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum getSystemFlagArray(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMFLAG$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum)target.getEnumValue();
                            }
                          }
                          
                          /**
                           * Gets (as xml) array of all "systemFlag" elements
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag[] xgetSystemFlagArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              java.util.List targetList = new java.util.ArrayList();
                              get_store().find_all_element_users(SYSTEMFLAG$0, targetList);
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag[] result = new org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag[targetList.size()];
                              targetList.toArray(result);
                              return result;
                            }
                          }
                          
                          /**
                           * Gets (as xml) ith "systemFlag" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag xgetSystemFlagArray(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag)get_store().find_element_user(SYSTEMFLAG$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              return target;
                            }
                          }
                          
                          /**
                           * Returns number of "systemFlag" element
                           */
                          public int sizeOfSystemFlagArray()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              return get_store().count_elements(SYSTEMFLAG$0);
                            }
                          }
                          
                          /**
                           * Sets array of all "systemFlag" element
                           */
                          public void setSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum[] systemFlagArray)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              arraySetterHelper(systemFlagArray, SYSTEMFLAG$0);
                            }
                          }
                          
                          /**
                           * Sets ith "systemFlag" element
                           */
                          public void setSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum systemFlag)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYSTEMFLAG$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              target.setEnumValue(systemFlag);
                            }
                          }
                          
                          /**
                           * Sets (as xml) array of all "systemFlag" element
                           */
                          public void xsetSystemFlagArray(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag[]systemFlagArray)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              arraySetterHelper(systemFlagArray, SYSTEMFLAG$0);
                            }
                          }
                          
                          /**
                           * Sets (as xml) ith "systemFlag" element
                           */
                          public void xsetSystemFlagArray(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag systemFlag)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag)get_store().find_element_user(SYSTEMFLAG$0, i);
                              if (target == null)
                              {
                                throw new IndexOutOfBoundsException();
                              }
                              target.set(systemFlag);
                            }
                          }
                          
                          /**
                           * Inserts the value as the ith "systemFlag" element
                           */
                          public void insertSystemFlag(int i, org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum systemFlag)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = 
                                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(SYSTEMFLAG$0, i);
                              target.setEnumValue(systemFlag);
                            }
                          }
                          
                          /**
                           * Appends the value as the last "systemFlag" element
                           */
                          public void addSystemFlag(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag.Enum systemFlag)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.apache.xmlbeans.SimpleValue target = null;
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYSTEMFLAG$0);
                              target.setEnumValue(systemFlag);
                            }
                          }
                          
                          /**
                           * Inserts and returns a new empty value (as xml) as the ith "systemFlag" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag insertNewSystemFlag(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag)get_store().insert_element_user(SYSTEMFLAG$0, i);
                              return target;
                            }
                          }
                          
                          /**
                           * Appends and returns a new empty value (as xml) as the last "systemFlag" element
                           */
                          public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag addNewSystemFlag()
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag target = null;
                              target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag)get_store().add_element_user(SYSTEMFLAG$0);
                              return target;
                            }
                          }
                          
                          /**
                           * Removes the ith "systemFlag" element
                           */
                          public void removeSystemFlag(int i)
                          {
                            synchronized (monitor())
                            {
                              check_orphaned();
                              get_store().remove_element(SYSTEMFLAG$0, i);
                            }
                          }
                          /**
                           * An XML systemFlag(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                           *
                           * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$PathwayTriageDetails$PathwayTriage$TriageLineDetails$TriageLine$SystemFlags$SystemFlag.
                           */
                          public static class SystemFlagImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.TriageLineDetails.TriageLine.SystemFlags.SystemFlag
                          {
                            private static final long serialVersionUID = 1L;
                            
                            public SystemFlagImpl(org.apache.xmlbeans.SchemaType sType)
                            {
                              super(sType, false);
                            }
                            
                            protected SystemFlagImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                            {
                              super(sType, b);
                            }
                          }
                        }
                      }
                    }
                    /**
                     * An XML origSite(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                     *
                     * This is a complex type.
                     */
                    public static class OrigSiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite
                    {
                      private static final long serialVersionUID = 1L;
                      
                      public OrigSiteImpl(org.apache.xmlbeans.SchemaType sType)
                      {
                        super(sType);
                      }
                      
                      private static final javax.xml.namespace.QName SITEID$0 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "siteId");
                      private static final javax.xml.namespace.QName SITENAME$2 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "siteName");
                      private static final javax.xml.namespace.QName CASEID$4 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "caseId");
                      private static final javax.xml.namespace.QName PATHWAYSCONTENTVERSION$6 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "pathwaysContentVersion");
                      private static final javax.xml.namespace.QName SOFTWARE$8 = 
                        new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "software");
                      
                      
                      /**
                       * Gets the "siteId" element
                       */
                      public java.lang.String getSiteId()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$0, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "siteId" element
                       */
                      public org.apache.xmlbeans.XmlString xgetSiteId()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$0, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "siteId" element
                       */
                      public void setSiteId(java.lang.String siteId)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITEID$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITEID$0);
                          }
                          target.setStringValue(siteId);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "siteId" element
                       */
                      public void xsetSiteId(org.apache.xmlbeans.XmlString siteId)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITEID$0, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITEID$0);
                          }
                          target.set(siteId);
                        }
                      }
                      
                      /**
                       * Gets the "siteName" element
                       */
                      public java.lang.String getSiteName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITENAME$2, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "siteName" element
                       */
                      public org.apache.xmlbeans.XmlString xgetSiteName()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$2, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "siteName" element
                       */
                      public void setSiteName(java.lang.String siteName)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SITENAME$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SITENAME$2);
                          }
                          target.setStringValue(siteName);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "siteName" element
                       */
                      public void xsetSiteName(org.apache.xmlbeans.XmlString siteName)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SITENAME$2, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SITENAME$2);
                          }
                          target.set(siteName);
                        }
                      }
                      
                      /**
                       * Gets the "caseId" element
                       */
                      public java.lang.String getCaseId()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEID$4, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target.getStringValue();
                        }
                      }
                      
                      /**
                       * Gets (as xml) the "caseId" element
                       */
                      public org.apache.xmlbeans.XmlString xgetCaseId()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEID$4, 0);
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "caseId" element
                       */
                      public void setCaseId(java.lang.String caseId)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.SimpleValue target = null;
                          target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CASEID$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CASEID$4);
                          }
                          target.setStringValue(caseId);
                        }
                      }
                      
                      /**
                       * Sets (as xml) the "caseId" element
                       */
                      public void xsetCaseId(org.apache.xmlbeans.XmlString caseId)
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlString target = null;
                          target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CASEID$4, 0);
                          if (target == null)
                          {
                            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CASEID$4);
                          }
                          target.set(caseId);
                        }
                      }
                      
                      /**
                       * Gets the "pathwaysContentVersion" element
                       */
                      public org.apache.xmlbeans.XmlObject getPathwaysContentVersion()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlObject target = null;
                          target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(PATHWAYSCONTENTVERSION$6, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "pathwaysContentVersion" element
                       */
                      public void setPathwaysContentVersion(org.apache.xmlbeans.XmlObject pathwaysContentVersion)
                      {
                        generatedSetterHelperImpl(pathwaysContentVersion, PATHWAYSCONTENTVERSION$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                      }
                      
                      /**
                       * Appends and returns a new empty "pathwaysContentVersion" element
                       */
                      public org.apache.xmlbeans.XmlObject addNewPathwaysContentVersion()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.apache.xmlbeans.XmlObject target = null;
                          target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(PATHWAYSCONTENTVERSION$6);
                          return target;
                        }
                      }
                      
                      /**
                       * Gets the "software" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software getSoftware()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software)get_store().find_element_user(SOFTWARE$8, 0);
                          if (target == null)
                          {
                            return null;
                          }
                          return target;
                        }
                      }
                      
                      /**
                       * Sets the "software" element
                       */
                      public void setSoftware(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software software)
                      {
                        generatedSetterHelperImpl(software, SOFTWARE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
                      }
                      
                      /**
                       * Appends and returns a new empty "software" element
                       */
                      public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software addNewSoftware()
                      {
                        synchronized (monitor())
                        {
                          check_orphaned();
                          org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software target = null;
                          target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software)get_store().add_element_user(SOFTWARE$8);
                          return target;
                        }
                      }
                      /**
                       * An XML software(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                       *
                       * This is a complex type.
                       */
                      public static class SoftwareImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.PathwayTriageDetails.PathwayTriage.OrigSite.Software
                      {
                        private static final long serialVersionUID = 1L;
                        
                        public SoftwareImpl(org.apache.xmlbeans.SchemaType sType)
                        {
                          super(sType);
                        }
                        
                        private static final javax.xml.namespace.QName PRODUCTNAME$0 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "productName");
                        private static final javax.xml.namespace.QName VERSION$2 = 
                          new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "version");
                        
                        
                        /**
                         * Gets the "productName" element
                         */
                        public java.lang.String getProductName()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$0, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getStringValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "productName" element
                         */
                        public org.apache.xmlbeans.XmlString xgetProductName()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$0, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "productName" element
                         */
                        public void setProductName(java.lang.String productName)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRODUCTNAME$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRODUCTNAME$0);
                            }
                            target.setStringValue(productName);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "productName" element
                         */
                        public void xsetProductName(org.apache.xmlbeans.XmlString productName)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRODUCTNAME$0, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRODUCTNAME$0);
                            }
                            target.set(productName);
                          }
                        }
                        
                        /**
                         * Gets the "version" element
                         */
                        public java.lang.String getVersion()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
                            if (target == null)
                            {
                              return null;
                            }
                            return target.getStringValue();
                          }
                        }
                        
                        /**
                         * Gets (as xml) the "version" element
                         */
                        public org.apache.xmlbeans.XmlString xgetVersion()
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
                            return target;
                          }
                        }
                        
                        /**
                         * Sets the "version" element
                         */
                        public void setVersion(java.lang.String version)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.SimpleValue target = null;
                            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VERSION$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VERSION$2);
                            }
                            target.setStringValue(version);
                          }
                        }
                        
                        /**
                         * Sets (as xml) the "version" element
                         */
                        public void xsetVersion(org.apache.xmlbeans.XmlString version)
                        {
                          synchronized (monitor())
                          {
                            check_orphaned();
                            org.apache.xmlbeans.XmlString target = null;
                            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VERSION$2, 0);
                            if (target == null)
                            {
                              target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VERSION$2);
                            }
                            target.set(version);
                          }
                        }
                      }
                    }
                }
            }
            /**
             * An XML demographics(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is a complex type.
             */
            public static class DemographicsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics
            {
                private static final long serialVersionUID = 1L;
                
                public DemographicsImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType);
                }
                
                private static final javax.xml.namespace.QName GENDER$0 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "gender");
                private static final javax.xml.namespace.QName AGEGROUP$2 = 
                    new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "ageGroup");
                
                
                /**
                 * Gets the "gender" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender.Enum getGender()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDER$0, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "gender" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender xgetGender()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender)get_store().find_element_user(GENDER$0, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "gender" element
                 */
                public void setGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender.Enum gender)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(GENDER$0, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(GENDER$0);
                      }
                      target.setEnumValue(gender);
                    }
                }
                
                /**
                 * Sets (as xml) the "gender" element
                 */
                public void xsetGender(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender gender)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender)get_store().find_element_user(GENDER$0, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender)get_store().add_element_user(GENDER$0);
                      }
                      target.set(gender);
                    }
                }
                
                /**
                 * Gets the "ageGroup" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup.Enum getAgeGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEGROUP$2, 0);
                      if (target == null)
                      {
                        return null;
                      }
                      return (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup.Enum)target.getEnumValue();
                    }
                }
                
                /**
                 * Gets (as xml) the "ageGroup" element
                 */
                public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup xgetAgeGroup()
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup)get_store().find_element_user(AGEGROUP$2, 0);
                      return target;
                    }
                }
                
                /**
                 * Sets the "ageGroup" element
                 */
                public void setAgeGroup(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup.Enum ageGroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.apache.xmlbeans.SimpleValue target = null;
                      target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AGEGROUP$2, 0);
                      if (target == null)
                      {
                        target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AGEGROUP$2);
                      }
                      target.setEnumValue(ageGroup);
                    }
                }
                
                /**
                 * Sets (as xml) the "ageGroup" element
                 */
                public void xsetAgeGroup(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup ageGroup)
                {
                    synchronized (monitor())
                    {
                      check_orphaned();
                      org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup target = null;
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup)get_store().find_element_user(AGEGROUP$2, 0);
                      if (target == null)
                      {
                        target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup)get_store().add_element_user(AGEGROUP$2);
                      }
                      target.set(ageGroup);
                    }
                }
                /**
                 * An XML gender(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$Demographics$Gender.
                 */
                public static class GenderImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.Gender
                {
                    private static final long serialVersionUID = 1L;
                    
                    public GenderImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected GenderImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
                /**
                 * An XML ageGroup(@http://nhspathways.org/webservices/pathways/pathwaysCase).
                 *
                 * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$PathwayDetails$Demographics$AgeGroup.
                 */
                public static class AgeGroupImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.PathwayDetails.Demographics.AgeGroup
                {
                    private static final long serialVersionUID = 1L;
                    
                    public AgeGroupImpl(org.apache.xmlbeans.SchemaType sType)
                    {
                      super(sType, false);
                    }
                    
                    protected AgeGroupImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                    {
                      super(sType, b);
                    }
                }
            }
        }
        /**
         * An XML site(@http://nhspathways.org/webservices/pathways/pathwaysCase).
         *
         * This is a complex type.
         */
        public static class SiteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site
        {
            private static final long serialVersionUID = 1L;
            
            public SiteImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName ID$0 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "id");
            private static final javax.xml.namespace.QName NAME$2 = 
                new javax.xml.namespace.QName("http://nhspathways.org/webservices/pathways/pathwaysCase", "name");
            
            
            /**
             * Gets the "id" element
             */
            public java.lang.String getId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "id" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id xgetId()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id)get_store().find_element_user(ID$0, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "id" element
             */
            public void setId(java.lang.String id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$0, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$0);
                    }
                    target.setStringValue(id);
                }
            }
            
            /**
             * Sets (as xml) the "id" element
             */
            public void xsetId(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id id)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id)get_store().find_element_user(ID$0, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id)get_store().add_element_user(ID$0);
                    }
                    target.set(id);
                }
            }
            
            /**
             * Gets the "name" element
             */
            public java.lang.String getName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                    if (target == null)
                    {
                      return null;
                    }
                    return target.getStringValue();
                }
            }
            
            /**
             * Gets (as xml) the "name" element
             */
            public org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name xgetName()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name)get_store().find_element_user(NAME$2, 0);
                    return target;
                }
            }
            
            /**
             * Sets the "name" element
             */
            public void setName(java.lang.String name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.apache.xmlbeans.SimpleValue target = null;
                    target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
                    if (target == null)
                    {
                      target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
                    }
                    target.setStringValue(name);
                }
            }
            
            /**
             * Sets (as xml) the "name" element
             */
            public void xsetName(org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name name)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name target = null;
                    target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name)get_store().find_element_user(NAME$2, 0);
                    if (target == null)
                    {
                      target = (org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name)get_store().add_element_user(NAME$2);
                    }
                    target.set(name);
                }
            }
            /**
             * An XML id(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Site$Id.
             */
            public static class IdImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Id
            {
                private static final long serialVersionUID = 1L;
                
                public IdImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected IdImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
            /**
             * An XML name(@http://nhspathways.org/webservices/pathways/pathwaysCase).
             *
             * This is an atomic type that is a restriction of org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument$PathwaysCase$Site$Name.
             */
            public static class NameImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements org.nhspathways.webservices.pathways.pathwayscase.PathwaysCaseDocument.PathwaysCase.Site.Name
            {
                private static final long serialVersionUID = 1L;
                
                public NameImpl(org.apache.xmlbeans.SchemaType sType)
                {
                    super(sType, false);
                }
                
                protected NameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
                {
                    super(sType, b);
                }
            }
        }
    }
}
