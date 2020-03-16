/*
 * XML Type:  POCD_MT000002UK01.Reference
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.Reference(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01ReferenceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Reference
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01ReferenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REALMCODE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "realmCode");
    private static final javax.xml.namespace.QName TYPEID$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "typeId");
    private static final javax.xml.namespace.QName TEMPLATEID$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "templateId");
    private static final javax.xml.namespace.QName CONTENTID$6 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "contentId");
    private static final javax.xml.namespace.QName SEPERATABLEIND$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "seperatableInd");
    private static final javax.xml.namespace.QName EXTERNALACT$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalAct");
    private static final javax.xml.namespace.QName EXTERNALOBSERVATION$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalObservation");
    private static final javax.xml.namespace.QName EXTERNALPROCEDURE$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalProcedure");
    private static final javax.xml.namespace.QName EXTERNALDOCUMENT$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "externalDocument");
    private static final javax.xml.namespace.QName NULLFLAVOR$18 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName TYPECODE$20 = 
        new javax.xml.namespace.QName("", "typeCode");
    
    
    /**
     * Gets array of all "realmCode" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.CS[] getRealmCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(REALMCODE$0, targetList);
            uk.nhs.connect.iucds.cda.ucr.CS[] result = new uk.nhs.connect.iucds.cda.ucr.CS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "realmCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS getRealmCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().find_element_user(REALMCODE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "realmCode" element
     */
    public int sizeOfRealmCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALMCODE$0);
        }
    }
    
    /**
     * Sets array of all "realmCode" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRealmCodeArray(uk.nhs.connect.iucds.cda.ucr.CS[] realmCodeArray)
    {
        check_orphaned();
        arraySetterHelper(realmCodeArray, REALMCODE$0);
    }
    
    /**
     * Sets ith "realmCode" element
     */
    public void setRealmCodeArray(int i, uk.nhs.connect.iucds.cda.ucr.CS realmCode)
    {
        generatedSetterHelperImpl(realmCode, REALMCODE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "realmCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS insertNewRealmCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().insert_element_user(REALMCODE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "realmCode" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CS addNewRealmCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CS target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CS)get_store().add_element_user(REALMCODE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "realmCode" element
     */
    public void removeRealmCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALMCODE$0, i);
        }
    }
    
    /**
     * Gets the "typeId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId getTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId)get_store().find_element_user(TYPEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "typeId" element
     */
    public boolean isSetTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPEID$2) != 0;
        }
    }
    
    /**
     * Sets the "typeId" element
     */
    public void setTypeId(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId typeId)
    {
        generatedSetterHelperImpl(typeId, TYPEID$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "typeId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId addNewTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01InfrastructureRootTypeId)get_store().add_element_user(TYPEID$2);
            return target;
        }
    }
    
    /**
     * Unsets the "typeId" element
     */
    public void unsetTypeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPEID$2, 0);
        }
    }
    
    /**
     * Gets array of all "templateId" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.II[] getTemplateIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TEMPLATEID$4, targetList);
            uk.nhs.connect.iucds.cda.ucr.II[] result = new uk.nhs.connect.iucds.cda.ucr.II[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "templateId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II getTemplateIdArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().find_element_user(TEMPLATEID$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "templateId" element
     */
    public int sizeOfTemplateIdArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TEMPLATEID$4);
        }
    }
    
    /**
     * Sets array of all "templateId" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTemplateIdArray(uk.nhs.connect.iucds.cda.ucr.II[] templateIdArray)
    {
        check_orphaned();
        arraySetterHelper(templateIdArray, TEMPLATEID$4);
    }
    
    /**
     * Sets ith "templateId" element
     */
    public void setTemplateIdArray(int i, uk.nhs.connect.iucds.cda.ucr.II templateId)
    {
        generatedSetterHelperImpl(templateId, TEMPLATEID$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "templateId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II insertNewTemplateId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().insert_element_user(TEMPLATEID$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "templateId" element
     */
    public uk.nhs.connect.iucds.cda.ucr.II addNewTemplateId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.II target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.II)get_store().add_element_user(TEMPLATEID$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "templateId" element
     */
    public void removeTemplateId(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TEMPLATEID$4, i);
        }
    }
    
    /**
     * Gets the "contentId" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.TemplateContent getContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.TemplateContent target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.TemplateContent)get_store().find_element_user(CONTENTID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "contentId" element
     */
    public boolean isSetContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENTID$6) != 0;
        }
    }
    
    /**
     * Sets the "contentId" element
     */
    public void setContentId(uk.nhs.connect.npfit.hl7.localisation.TemplateContent contentId)
    {
        generatedSetterHelperImpl(contentId, CONTENTID$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "contentId" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.TemplateContent addNewContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.TemplateContent target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.TemplateContent)get_store().add_element_user(CONTENTID$6);
            return target;
        }
    }
    
    /**
     * Unsets the "contentId" element
     */
    public void unsetContentId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENTID$6, 0);
        }
    }
    
    /**
     * Gets the "seperatableInd" element
     */
    public uk.nhs.connect.iucds.cda.ucr.BL getSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.BL target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.BL)get_store().find_element_user(SEPERATABLEIND$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "seperatableInd" element
     */
    public boolean isSetSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEPERATABLEIND$8) != 0;
        }
    }
    
    /**
     * Sets the "seperatableInd" element
     */
    public void setSeperatableInd(uk.nhs.connect.iucds.cda.ucr.BL seperatableInd)
    {
        generatedSetterHelperImpl(seperatableInd, SEPERATABLEIND$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "seperatableInd" element
     */
    public uk.nhs.connect.iucds.cda.ucr.BL addNewSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.BL target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.BL)get_store().add_element_user(SEPERATABLEIND$8);
            return target;
        }
    }
    
    /**
     * Unsets the "seperatableInd" element
     */
    public void unsetSeperatableInd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEPERATABLEIND$8, 0);
        }
    }
    
    /**
     * Gets the "externalAct" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalAct getExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalAct target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalAct)get_store().find_element_user(EXTERNALACT$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalAct" element
     */
    public boolean isSetExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALACT$10) != 0;
        }
    }
    
    /**
     * Sets the "externalAct" element
     */
    public void setExternalAct(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalAct externalAct)
    {
        generatedSetterHelperImpl(externalAct, EXTERNALACT$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "externalAct" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalAct addNewExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalAct target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalAct)get_store().add_element_user(EXTERNALACT$10);
            return target;
        }
    }
    
    /**
     * Unsets the "externalAct" element
     */
    public void unsetExternalAct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALACT$10, 0);
        }
    }
    
    /**
     * Gets the "externalObservation" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalObservation getExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalObservation target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalObservation)get_store().find_element_user(EXTERNALOBSERVATION$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalObservation" element
     */
    public boolean isSetExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALOBSERVATION$12) != 0;
        }
    }
    
    /**
     * Sets the "externalObservation" element
     */
    public void setExternalObservation(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalObservation externalObservation)
    {
        generatedSetterHelperImpl(externalObservation, EXTERNALOBSERVATION$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "externalObservation" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalObservation addNewExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalObservation target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalObservation)get_store().add_element_user(EXTERNALOBSERVATION$12);
            return target;
        }
    }
    
    /**
     * Unsets the "externalObservation" element
     */
    public void unsetExternalObservation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALOBSERVATION$12, 0);
        }
    }
    
    /**
     * Gets the "externalProcedure" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalProcedure getExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalProcedure target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalProcedure)get_store().find_element_user(EXTERNALPROCEDURE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalProcedure" element
     */
    public boolean isSetExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALPROCEDURE$14) != 0;
        }
    }
    
    /**
     * Sets the "externalProcedure" element
     */
    public void setExternalProcedure(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalProcedure externalProcedure)
    {
        generatedSetterHelperImpl(externalProcedure, EXTERNALPROCEDURE$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "externalProcedure" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalProcedure addNewExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalProcedure target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalProcedure)get_store().add_element_user(EXTERNALPROCEDURE$14);
            return target;
        }
    }
    
    /**
     * Unsets the "externalProcedure" element
     */
    public void unsetExternalProcedure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALPROCEDURE$14, 0);
        }
    }
    
    /**
     * Gets the "externalDocument" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalDocument1 getExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalDocument1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalDocument1)get_store().find_element_user(EXTERNALDOCUMENT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "externalDocument" element
     */
    public boolean isSetExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXTERNALDOCUMENT$16) != 0;
        }
    }
    
    /**
     * Sets the "externalDocument" element
     */
    public void setExternalDocument(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalDocument1 externalDocument)
    {
        generatedSetterHelperImpl(externalDocument, EXTERNALDOCUMENT$16, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "externalDocument" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalDocument1 addNewExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalDocument1 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01ExternalDocument1)get_store().add_element_user(EXTERNALDOCUMENT$16);
            return target;
        }
    }
    
    /**
     * Unsets the "externalDocument" element
     */
    public void unsetExternalDocument()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXTERNALDOCUMENT$16, 0);
        }
    }
    
    /**
     * Gets the "nullFlavor" attribute
     */
    public java.lang.String getNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nullFlavor" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.NullFlavor xgetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$18);
            return target;
        }
    }
    
    /**
     * True if has "nullFlavor" attribute
     */
    public boolean isSetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(NULLFLAVOR$18) != null;
        }
    }
    
    /**
     * Sets the "nullFlavor" attribute
     */
    public void setNullFlavor(java.lang.String nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$18);
            }
            target.setStringValue(nullFlavor);
        }
    }
    
    /**
     * Sets (as xml) the "nullFlavor" attribute
     */
    public void xsetNullFlavor(uk.nhs.connect.iucds.cda.ucr.NullFlavor nullFlavor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.NullFlavor target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$18);
            }
            target.set(nullFlavor);
        }
    }
    
    /**
     * Unsets the "nullFlavor" attribute
     */
    public void unsetNullFlavor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(NULLFLAVOR$18);
        }
    }
    
    /**
     * Gets the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReferenceX.Enum getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$20);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReferenceX.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReference xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReference target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReference)get_store().find_attribute_user(TYPECODE$20);
            return target;
        }
    }
    
    /**
     * Sets the "typeCode" attribute
     */
    public void setTypeCode(uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReferenceX.Enum typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$20);
            }
            target.setEnumValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReference typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReference target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReference)get_store().find_attribute_user(TYPECODE$20);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.XActRelationshipExternalReference)get_store().add_attribute_user(TYPECODE$20);
            }
            target.set(typeCode);
        }
    }
}
