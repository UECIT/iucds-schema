/*
 * XML Type:  POCD_MT000002UK01.Informant12
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.Informant12(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01Informant12Impl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01Informant12
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01Informant12Impl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName ASSIGNEDENTITY$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "assignedEntity");
    private static final javax.xml.namespace.QName RELATEDENTITY$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "relatedEntity");
    private static final javax.xml.namespace.QName NULLFLAVOR$12 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName TYPECODE$14 = 
        new javax.xml.namespace.QName("", "typeCode");
    private static final javax.xml.namespace.QName CONTEXTCONTROLCODE$16 = 
        new javax.xml.namespace.QName("", "contextControlCode");
    
    
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
     * Gets the "assignedEntity" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity getAssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity)get_store().find_element_user(ASSIGNEDENTITY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "assignedEntity" element
     */
    public boolean isSetAssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASSIGNEDENTITY$8) != 0;
        }
    }
    
    /**
     * Sets the "assignedEntity" element
     */
    public void setAssignedEntity(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity assignedEntity)
    {
        generatedSetterHelperImpl(assignedEntity, ASSIGNEDENTITY$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "assignedEntity" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity addNewAssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AssignedEntity)get_store().add_element_user(ASSIGNEDENTITY$8);
            return target;
        }
    }
    
    /**
     * Unsets the "assignedEntity" element
     */
    public void unsetAssignedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASSIGNEDENTITY$8, 0);
        }
    }
    
    /**
     * Gets the "relatedEntity" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedEntity getRelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedEntity target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedEntity)get_store().find_element_user(RELATEDENTITY$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "relatedEntity" element
     */
    public boolean isSetRelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATEDENTITY$10) != 0;
        }
    }
    
    /**
     * Sets the "relatedEntity" element
     */
    public void setRelatedEntity(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedEntity relatedEntity)
    {
        generatedSetterHelperImpl(relatedEntity, RELATEDENTITY$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "relatedEntity" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedEntity addNewRelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedEntity target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01RelatedEntity)get_store().add_element_user(RELATEDENTITY$10);
            return target;
        }
    }
    
    /**
     * Unsets the "relatedEntity" element
     */
    public void unsetRelatedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATEDENTITY$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$12);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$12);
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
            return get_store().find_attribute_user(NULLFLAVOR$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$12);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$12);
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
            get_store().remove_attribute(NULLFLAVOR$12);
        }
    }
    
    /**
     * Gets the "typeCode" attribute
     */
    public java.lang.String getTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPECODE$14);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "typeCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.ParticipationType xgetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ParticipationType target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ParticipationType)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ParticipationType)get_default_attribute_value(TYPECODE$14);
            }
            return target;
        }
    }
    
    /**
     * True if has "typeCode" attribute
     */
    public boolean isSetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPECODE$14) != null;
        }
    }
    
    /**
     * Sets the "typeCode" attribute
     */
    public void setTypeCode(java.lang.String typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPECODE$14);
            }
            target.setStringValue(typeCode);
        }
    }
    
    /**
     * Sets (as xml) the "typeCode" attribute
     */
    public void xsetTypeCode(uk.nhs.connect.iucds.cda.ucr.ParticipationType typeCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ParticipationType target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ParticipationType)get_store().find_attribute_user(TYPECODE$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ParticipationType)get_store().add_attribute_user(TYPECODE$14);
            }
            target.set(typeCode);
        }
    }
    
    /**
     * Unsets the "typeCode" attribute
     */
    public void unsetTypeCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPECODE$14);
        }
    }
    
    /**
     * Gets the "contextControlCode" attribute
     */
    public java.lang.String getContextControlCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CONTEXTCONTROLCODE$16);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "contextControlCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.ContextControl xgetContextControlCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ContextControl target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ContextControl)get_default_attribute_value(CONTEXTCONTROLCODE$16);
            }
            return target;
        }
    }
    
    /**
     * True if has "contextControlCode" attribute
     */
    public boolean isSetContextControlCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CONTEXTCONTROLCODE$16) != null;
        }
    }
    
    /**
     * Sets the "contextControlCode" attribute
     */
    public void setContextControlCode(java.lang.String contextControlCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CONTEXTCONTROLCODE$16);
            }
            target.setStringValue(contextControlCode);
        }
    }
    
    /**
     * Sets (as xml) the "contextControlCode" attribute
     */
    public void xsetContextControlCode(uk.nhs.connect.iucds.cda.ucr.ContextControl contextControlCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ContextControl target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ContextControl)get_store().find_attribute_user(CONTEXTCONTROLCODE$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.ContextControl)get_store().add_attribute_user(CONTEXTCONTROLCODE$16);
            }
            target.set(contextControlCode);
        }
    }
    
    /**
     * Unsets the "contextControlCode" attribute
     */
    public void unsetContextControlCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CONTEXTCONTROLCODE$16);
        }
    }
}
