/*
 * XML Type:  POCD_MT000002UK01.AuthoringDevice
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AuthoringDevice
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML POCD_MT000002UK01.AuthoringDevice(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000002UK01AuthoringDeviceImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01AuthoringDevice
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000002UK01AuthoringDeviceImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName CODE$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "code");
    private static final javax.xml.namespace.QName MANUFACTURERMODELNAME$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "manufacturerModelName");
    private static final javax.xml.namespace.QName SOFTWARENAME$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "softwareName");
    private static final javax.xml.namespace.QName ASMAINTAINEDENTITY$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "asMaintainedEntity");
    private static final javax.xml.namespace.QName NULLFLAVOR$16 = 
        new javax.xml.namespace.QName("", "nullFlavor");
    private static final javax.xml.namespace.QName CLASSCODE$18 = 
        new javax.xml.namespace.QName("", "classCode");
    private static final javax.xml.namespace.QName DETERMINERCODE$20 = 
        new javax.xml.namespace.QName("", "determinerCode");
    
    
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
     * Gets the "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().find_element_user(CODE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "code" element
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CODE$8) != 0;
        }
    }
    
    /**
     * Sets the "code" element
     */
    public void setCode(uk.nhs.connect.iucds.cda.ucr.CE code)
    {
        generatedSetterHelperImpl(code, CODE$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "code" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CE addNewCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CE target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CE)get_store().add_element_user(CODE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "code" element
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CODE$8, 0);
        }
    }
    
    /**
     * Gets the "manufacturerModelName" element
     */
    public uk.nhs.connect.iucds.cda.ucr.SC getManufacturerModelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.SC target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.SC)get_store().find_element_user(MANUFACTURERMODELNAME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "manufacturerModelName" element
     */
    public boolean isSetManufacturerModelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MANUFACTURERMODELNAME$10) != 0;
        }
    }
    
    /**
     * Sets the "manufacturerModelName" element
     */
    public void setManufacturerModelName(uk.nhs.connect.iucds.cda.ucr.SC manufacturerModelName)
    {
        generatedSetterHelperImpl(manufacturerModelName, MANUFACTURERMODELNAME$10, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "manufacturerModelName" element
     */
    public uk.nhs.connect.iucds.cda.ucr.SC addNewManufacturerModelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.SC target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.SC)get_store().add_element_user(MANUFACTURERMODELNAME$10);
            return target;
        }
    }
    
    /**
     * Unsets the "manufacturerModelName" element
     */
    public void unsetManufacturerModelName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MANUFACTURERMODELNAME$10, 0);
        }
    }
    
    /**
     * Gets the "softwareName" element
     */
    public uk.nhs.connect.iucds.cda.ucr.SC getSoftwareName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.SC target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.SC)get_store().find_element_user(SOFTWARENAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "softwareName" element
     */
    public boolean isSetSoftwareName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTWARENAME$12) != 0;
        }
    }
    
    /**
     * Sets the "softwareName" element
     */
    public void setSoftwareName(uk.nhs.connect.iucds.cda.ucr.SC softwareName)
    {
        generatedSetterHelperImpl(softwareName, SOFTWARENAME$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "softwareName" element
     */
    public uk.nhs.connect.iucds.cda.ucr.SC addNewSoftwareName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.SC target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.SC)get_store().add_element_user(SOFTWARENAME$12);
            return target;
        }
    }
    
    /**
     * Unsets the "softwareName" element
     */
    public void unsetSoftwareName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTWARENAME$12, 0);
        }
    }
    
    /**
     * Gets array of all "asMaintainedEntity" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity[] getAsMaintainedEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ASMAINTAINEDENTITY$14, targetList);
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity[] result = new uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "asMaintainedEntity" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity getAsMaintainedEntityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity)get_store().find_element_user(ASMAINTAINEDENTITY$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "asMaintainedEntity" element
     */
    public int sizeOfAsMaintainedEntityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ASMAINTAINEDENTITY$14);
        }
    }
    
    /**
     * Sets array of all "asMaintainedEntity" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAsMaintainedEntityArray(uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity[] asMaintainedEntityArray)
    {
        check_orphaned();
        arraySetterHelper(asMaintainedEntityArray, ASMAINTAINEDENTITY$14);
    }
    
    /**
     * Sets ith "asMaintainedEntity" element
     */
    public void setAsMaintainedEntityArray(int i, uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity asMaintainedEntity)
    {
        generatedSetterHelperImpl(asMaintainedEntity, ASMAINTAINEDENTITY$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "asMaintainedEntity" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity insertNewAsMaintainedEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity)get_store().insert_element_user(ASMAINTAINEDENTITY$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "asMaintainedEntity" element
     */
    public uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity addNewAsMaintainedEntity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.POCDMT000002UK01MaintainedEntity)get_store().add_element_user(ASMAINTAINEDENTITY$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "asMaintainedEntity" element
     */
    public void removeAsMaintainedEntity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ASMAINTAINEDENTITY$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
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
            return get_store().find_attribute_user(NULLFLAVOR$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(NULLFLAVOR$16);
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
            target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().find_attribute_user(NULLFLAVOR$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.NullFlavor)get_store().add_attribute_user(NULLFLAVOR$16);
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
            get_store().remove_attribute(NULLFLAVOR$16);
        }
    }
    
    /**
     * Gets the "classCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.EntityClassDeviceX.Enum getClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CLASSCODE$18);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.EntityClassDeviceX.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "classCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.EntityClassDevice xgetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityClassDevice target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityClassDevice)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityClassDevice)get_default_attribute_value(CLASSCODE$18);
            }
            return target;
        }
    }
    
    /**
     * True if has "classCode" attribute
     */
    public boolean isSetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CLASSCODE$18) != null;
        }
    }
    
    /**
     * Sets the "classCode" attribute
     */
    public void setClassCode(uk.nhs.connect.iucds.cda.ucr.EntityClassDeviceX.Enum classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASSCODE$18);
            }
            target.setEnumValue(classCode);
        }
    }
    
    /**
     * Sets (as xml) the "classCode" attribute
     */
    public void xsetClassCode(uk.nhs.connect.iucds.cda.ucr.EntityClassDevice classCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityClassDevice target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityClassDevice)get_store().find_attribute_user(CLASSCODE$18);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityClassDevice)get_store().add_attribute_user(CLASSCODE$18);
            }
            target.set(classCode);
        }
    }
    
    /**
     * Unsets the "classCode" attribute
     */
    public void unsetClassCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CLASSCODE$18);
        }
    }
    
    /**
     * Gets the "determinerCode" attribute
     */
    public java.lang.String getDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINERCODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(DETERMINERCODE$20);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "determinerCode" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.EntityDeterminer xgetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityDeterminer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_store().find_attribute_user(DETERMINERCODE$20);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_default_attribute_value(DETERMINERCODE$20);
            }
            return target;
        }
    }
    
    /**
     * True if has "determinerCode" attribute
     */
    public boolean isSetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DETERMINERCODE$20) != null;
        }
    }
    
    /**
     * Sets the "determinerCode" attribute
     */
    public void setDeterminerCode(java.lang.String determinerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DETERMINERCODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DETERMINERCODE$20);
            }
            target.setStringValue(determinerCode);
        }
    }
    
    /**
     * Sets (as xml) the "determinerCode" attribute
     */
    public void xsetDeterminerCode(uk.nhs.connect.iucds.cda.ucr.EntityDeterminer determinerCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.EntityDeterminer target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_store().find_attribute_user(DETERMINERCODE$20);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.EntityDeterminer)get_store().add_attribute_user(DETERMINERCODE$20);
            }
            target.set(determinerCode);
        }
    }
    
    /**
     * Unsets the "determinerCode" attribute
     */
    public void unsetDeterminerCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DETERMINERCODE$20);
        }
    }
}
