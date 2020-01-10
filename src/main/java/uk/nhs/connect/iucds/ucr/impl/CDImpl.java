/*
 * XML Type:  CD
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.CD
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML CD(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CDImpl extends uk.nhs.connect.iucds.ucr.impl.ANYImpl implements uk.nhs.connect.iucds.ucr.CD
{
    private static final long serialVersionUID = 1L;
    
    public CDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINALTEXT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "originalText");
    private static final javax.xml.namespace.QName QUALIFIER$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "qualifier");
    private static final javax.xml.namespace.QName GROUP$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "group");
    private static final javax.xml.namespace.QName TRANSLATION$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "translation");
    private static final javax.xml.namespace.QName CODE$8 = 
        new javax.xml.namespace.QName("", "code");
    private static final javax.xml.namespace.QName CODESYSTEM$10 = 
        new javax.xml.namespace.QName("", "codeSystem");
    private static final javax.xml.namespace.QName CODESYSTEMNAME$12 = 
        new javax.xml.namespace.QName("", "codeSystemName");
    private static final javax.xml.namespace.QName CODESYSTEMVERSION$14 = 
        new javax.xml.namespace.QName("", "codeSystemVersion");
    private static final javax.xml.namespace.QName DISPLAYNAME$16 = 
        new javax.xml.namespace.QName("", "displayName");
    
    
    /**
     * Gets the "originalText" element
     */
    public uk.nhs.connect.iucds.ucr.ED getOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ED target = null;
            target = (uk.nhs.connect.iucds.ucr.ED)get_store().find_element_user(ORIGINALTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originalText" element
     */
    public boolean isSetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "originalText" element
     */
    public void setOriginalText(uk.nhs.connect.iucds.ucr.ED originalText)
    {
        generatedSetterHelperImpl(originalText, ORIGINALTEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "originalText" element
     */
    public uk.nhs.connect.iucds.ucr.ED addNewOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.ED target = null;
            target = (uk.nhs.connect.iucds.ucr.ED)get_store().add_element_user(ORIGINALTEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "originalText" element
     */
    public void unsetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALTEXT$0, 0);
        }
    }
    
    /**
     * Gets array of all "qualifier" elements
     */
    public uk.nhs.connect.iucds.ucr.CR[] getQualifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUALIFIER$2, targetList);
            uk.nhs.connect.iucds.ucr.CR[] result = new uk.nhs.connect.iucds.ucr.CR[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "qualifier" element
     */
    public uk.nhs.connect.iucds.ucr.CR getQualifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CR target = null;
            target = (uk.nhs.connect.iucds.ucr.CR)get_store().find_element_user(QUALIFIER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "qualifier" element
     */
    public int sizeOfQualifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUALIFIER$2);
        }
    }
    
    /**
     * Sets array of all "qualifier" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setQualifierArray(uk.nhs.connect.iucds.ucr.CR[] qualifierArray)
    {
        check_orphaned();
        arraySetterHelper(qualifierArray, QUALIFIER$2);
    }
    
    /**
     * Sets ith "qualifier" element
     */
    public void setQualifierArray(int i, uk.nhs.connect.iucds.ucr.CR qualifier)
    {
        generatedSetterHelperImpl(qualifier, QUALIFIER$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
     */
    public uk.nhs.connect.iucds.ucr.CR insertNewQualifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CR target = null;
            target = (uk.nhs.connect.iucds.ucr.CR)get_store().insert_element_user(QUALIFIER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qualifier" element
     */
    public uk.nhs.connect.iucds.ucr.CR addNewQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CR target = null;
            target = (uk.nhs.connect.iucds.ucr.CR)get_store().add_element_user(QUALIFIER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "qualifier" element
     */
    public void removeQualifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUALIFIER$2, i);
        }
    }
    
    /**
     * Gets array of all "group" elements
     */
    public uk.nhs.connect.iucds.ucr.CD.Group[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GROUP$4, targetList);
            uk.nhs.connect.iucds.ucr.CD.Group[] result = new uk.nhs.connect.iucds.ucr.CD.Group[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "group" element
     */
    public uk.nhs.connect.iucds.ucr.CD.Group getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CD.Group target = null;
            target = (uk.nhs.connect.iucds.ucr.CD.Group)get_store().find_element_user(GROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$4);
        }
    }
    
    /**
     * Sets array of all "group" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGroupArray(uk.nhs.connect.iucds.ucr.CD.Group[] groupArray)
    {
        check_orphaned();
        arraySetterHelper(groupArray, GROUP$4);
    }
    
    /**
     * Sets ith "group" element
     */
    public void setGroupArray(int i, uk.nhs.connect.iucds.ucr.CD.Group group)
    {
        generatedSetterHelperImpl(group, GROUP$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "group" element
     */
    public uk.nhs.connect.iucds.ucr.CD.Group insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CD.Group target = null;
            target = (uk.nhs.connect.iucds.ucr.CD.Group)get_store().insert_element_user(GROUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "group" element
     */
    public uk.nhs.connect.iucds.ucr.CD.Group addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CD.Group target = null;
            target = (uk.nhs.connect.iucds.ucr.CD.Group)get_store().add_element_user(GROUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$4, i);
        }
    }
    
    /**
     * Gets array of all "translation" elements
     */
    public uk.nhs.connect.iucds.ucr.CD[] getTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSLATION$6, targetList);
            uk.nhs.connect.iucds.ucr.CD[] result = new uk.nhs.connect.iucds.ucr.CD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "translation" element
     */
    public uk.nhs.connect.iucds.ucr.CD getTranslationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CD target = null;
            target = (uk.nhs.connect.iucds.ucr.CD)get_store().find_element_user(TRANSLATION$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "translation" element
     */
    public int sizeOfTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSLATION$6);
        }
    }
    
    /**
     * Sets array of all "translation" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTranslationArray(uk.nhs.connect.iucds.ucr.CD[] translationArray)
    {
        check_orphaned();
        arraySetterHelper(translationArray, TRANSLATION$6);
    }
    
    /**
     * Sets ith "translation" element
     */
    public void setTranslationArray(int i, uk.nhs.connect.iucds.ucr.CD translation)
    {
        generatedSetterHelperImpl(translation, TRANSLATION$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "translation" element
     */
    public uk.nhs.connect.iucds.ucr.CD insertNewTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CD target = null;
            target = (uk.nhs.connect.iucds.ucr.CD)get_store().insert_element_user(TRANSLATION$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "translation" element
     */
    public uk.nhs.connect.iucds.ucr.CD addNewTranslation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.CD target = null;
            target = (uk.nhs.connect.iucds.ucr.CD)get_store().add_element_user(TRANSLATION$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "translation" element
     */
    public void removeTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSLATION$6, i);
        }
    }
    
    /**
     * Gets the "code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" attribute
     */
    public uk.nhs.connect.iucds.ucr.Cs2 xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CODE$8);
            return target;
        }
    }
    
    /**
     * True if has "code" attribute
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODE$8) != null;
        }
    }
    
    /**
     * Sets the "code" attribute
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$8);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" attribute
     */
    public void xsetCode(uk.nhs.connect.iucds.ucr.Cs2 code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().find_attribute_user(CODE$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Cs2)get_store().add_attribute_user(CODE$8);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "code" attribute
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODE$8);
        }
    }
    
    /**
     * Gets the "codeSystem" attribute
     */
    public java.lang.String getCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSystem" attribute
     */
    public uk.nhs.connect.iucds.ucr.Uid xgetCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Uid target = null;
            target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$10);
            return target;
        }
    }
    
    /**
     * True if has "codeSystem" attribute
     */
    public boolean isSetCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESYSTEM$10) != null;
        }
    }
    
    /**
     * Sets the "codeSystem" attribute
     */
    public void setCodeSystem(java.lang.String codeSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$10);
            }
            target.setStringValue(codeSystem);
        }
    }
    
    /**
     * Sets (as xml) the "codeSystem" attribute
     */
    public void xsetCodeSystem(uk.nhs.connect.iucds.ucr.Uid codeSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.Uid target = null;
            target = (uk.nhs.connect.iucds.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$10);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.Uid)get_store().add_attribute_user(CODESYSTEM$10);
            }
            target.set(codeSystem);
        }
    }
    
    /**
     * Unsets the "codeSystem" attribute
     */
    public void unsetCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESYSTEM$10);
        }
    }
    
    /**
     * Gets the "codeSystemName" attribute
     */
    public java.lang.String getCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$12);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSystemName" attribute
     */
    public uk.nhs.connect.iucds.ucr.St2 xgetCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(CODESYSTEMNAME$12);
            return target;
        }
    }
    
    /**
     * True if has "codeSystemName" attribute
     */
    public boolean isSetCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESYSTEMNAME$12) != null;
        }
    }
    
    /**
     * Sets the "codeSystemName" attribute
     */
    public void setCodeSystemName(java.lang.String codeSystemName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEMNAME$12);
            }
            target.setStringValue(codeSystemName);
        }
    }
    
    /**
     * Sets (as xml) the "codeSystemName" attribute
     */
    public void xsetCodeSystemName(uk.nhs.connect.iucds.ucr.St2 codeSystemName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(CODESYSTEMNAME$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().add_attribute_user(CODESYSTEMNAME$12);
            }
            target.set(codeSystemName);
        }
    }
    
    /**
     * Unsets the "codeSystemName" attribute
     */
    public void unsetCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESYSTEMNAME$12);
        }
    }
    
    /**
     * Gets the "codeSystemVersion" attribute
     */
    public java.lang.String getCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMVERSION$14);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSystemVersion" attribute
     */
    public uk.nhs.connect.iucds.ucr.St2 xgetCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(CODESYSTEMVERSION$14);
            return target;
        }
    }
    
    /**
     * True if has "codeSystemVersion" attribute
     */
    public boolean isSetCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESYSTEMVERSION$14) != null;
        }
    }
    
    /**
     * Sets the "codeSystemVersion" attribute
     */
    public void setCodeSystemVersion(java.lang.String codeSystemVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMVERSION$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEMVERSION$14);
            }
            target.setStringValue(codeSystemVersion);
        }
    }
    
    /**
     * Sets (as xml) the "codeSystemVersion" attribute
     */
    public void xsetCodeSystemVersion(uk.nhs.connect.iucds.ucr.St2 codeSystemVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(CODESYSTEMVERSION$14);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().add_attribute_user(CODESYSTEMVERSION$14);
            }
            target.set(codeSystemVersion);
        }
    }
    
    /**
     * Unsets the "codeSystemVersion" attribute
     */
    public void unsetCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESYSTEMVERSION$14);
        }
    }
    
    /**
     * Gets the "displayName" attribute
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$16);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    public uk.nhs.connect.iucds.ucr.St2 xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$16);
            return target;
        }
    }
    
    /**
     * True if has "displayName" attribute
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYNAME$16) != null;
        }
    }
    
    /**
     * Sets the "displayName" attribute
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$16);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    public void xsetDisplayName(uk.nhs.connect.iucds.ucr.St2 displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$16);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.St2)get_store().add_attribute_user(DISPLAYNAME$16);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Unsets the "displayName" attribute
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYNAME$16);
        }
    }
    /**
     * An XML group(@urn:hl7-org:v3).
     *
     * This is a complex type.
     */
    public static class GroupImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.CD.Group
    {
        private static final long serialVersionUID = 1L;
        
        public GroupImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName QUALIFIER$0 = 
            new javax.xml.namespace.QName("urn:hl7-org:v3", "qualifier");
        
        
        /**
         * Gets array of all "qualifier" elements
         */
        public uk.nhs.connect.iucds.ucr.CR[] getQualifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(QUALIFIER$0, targetList);
                uk.nhs.connect.iucds.ucr.CR[] result = new uk.nhs.connect.iucds.ucr.CR[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "qualifier" element
         */
        public uk.nhs.connect.iucds.ucr.CR getQualifierArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CR target = null;
                target = (uk.nhs.connect.iucds.ucr.CR)get_store().find_element_user(QUALIFIER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "qualifier" element
         */
        public int sizeOfQualifierArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(QUALIFIER$0);
            }
        }
        
        /**
         * Sets array of all "qualifier" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setQualifierArray(uk.nhs.connect.iucds.ucr.CR[] qualifierArray)
        {
            check_orphaned();
            arraySetterHelper(qualifierArray, QUALIFIER$0);
        }
        
        /**
         * Sets ith "qualifier" element
         */
        public void setQualifierArray(int i, uk.nhs.connect.iucds.ucr.CR qualifier)
        {
            generatedSetterHelperImpl(qualifier, QUALIFIER$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
         */
        public uk.nhs.connect.iucds.ucr.CR insertNewQualifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CR target = null;
                target = (uk.nhs.connect.iucds.ucr.CR)get_store().insert_element_user(QUALIFIER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "qualifier" element
         */
        public uk.nhs.connect.iucds.ucr.CR addNewQualifier()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.iucds.ucr.CR target = null;
                target = (uk.nhs.connect.iucds.ucr.CR)get_store().add_element_user(QUALIFIER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "qualifier" element
         */
        public void removeQualifier(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(QUALIFIER$0, i);
            }
        }
    }
}
