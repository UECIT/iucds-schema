/*
 * XML Type:  StrucDoc.TitleFootnote
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.StrucDocTitleFootnote
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML StrucDoc.TitleFootnote(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class StrucDocTitleFootnoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.StrucDocTitleFootnote
{
    private static final long serialVersionUID = 1L;
    
    public StrucDocTitleFootnoteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "content");
    private static final javax.xml.namespace.QName SUB$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sub");
    private static final javax.xml.namespace.QName SUP$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sup");
    private static final javax.xml.namespace.QName BR$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "br");
    private static final javax.xml.namespace.QName ID$8 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName LANGUAGE$10 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName STYLECODE$12 = 
        new javax.xml.namespace.QName("", "styleCode");
    
    
    /**
     * Gets array of all "content" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent[] getContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENT$0, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "content" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent getContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent)get_store().find_element_user(CONTENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "content" element
     */
    public int sizeOfContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$0);
        }
    }
    
    /**
     * Sets array of all "content" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setContentArray(uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent[] contentArray)
    {
        check_orphaned();
        arraySetterHelper(contentArray, CONTENT$0);
    }
    
    /**
     * Sets ith "content" element
     */
    public void setContentArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent content)
    {
        generatedSetterHelperImpl(content, CONTENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent insertNewContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent)get_store().insert_element_user(CONTENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocTitleContent)get_store().add_element_user(CONTENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "content" element
     */
    public void removeContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$0, i);
        }
    }
    
    /**
     * Gets array of all "sub" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSub[] getSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUB$2, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocSub[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocSub[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sub" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSub getSubArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocSub target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSub)get_store().find_element_user(SUB$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sub" element
     */
    public int sizeOfSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUB$2);
        }
    }
    
    /**
     * Sets array of all "sub" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubArray(uk.nhs.connect.iucds.cda.ucr.StrucDocSub[] subArray)
    {
        check_orphaned();
        arraySetterHelper(subArray, SUB$2);
    }
    
    /**
     * Sets ith "sub" element
     */
    public void setSubArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocSub sub)
    {
        generatedSetterHelperImpl(sub, SUB$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sub" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSub insertNewSub(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocSub target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSub)get_store().insert_element_user(SUB$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sub" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSub addNewSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocSub target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSub)get_store().add_element_user(SUB$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "sub" element
     */
    public void removeSub(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUB$2, i);
        }
    }
    
    /**
     * Gets array of all "sup" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSup[] getSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUP$4, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocSup[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocSup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sup" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSup getSupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocSup target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSup)get_store().find_element_user(SUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sup" element
     */
    public int sizeOfSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUP$4);
        }
    }
    
    /**
     * Sets array of all "sup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupArray(uk.nhs.connect.iucds.cda.ucr.StrucDocSup[] supArray)
    {
        check_orphaned();
        arraySetterHelper(supArray, SUP$4);
    }
    
    /**
     * Sets ith "sup" element
     */
    public void setSupArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocSup sup)
    {
        generatedSetterHelperImpl(sup, SUP$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sup" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSup insertNewSup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocSup target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSup)get_store().insert_element_user(SUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sup" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSup addNewSup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocSup target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSup)get_store().add_element_user(SUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "sup" element
     */
    public void removeSup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUP$4, i);
        }
    }
    
    /**
     * Gets array of all "br" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocBr[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$6, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocBr[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocBr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "br" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocBr getBrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocBr target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocBr)get_store().find_element_user(BR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "br" element
     */
    public int sizeOfBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BR$6);
        }
    }
    
    /**
     * Sets array of all "br" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBrArray(uk.nhs.connect.iucds.cda.ucr.StrucDocBr[] brArray)
    {
        check_orphaned();
        arraySetterHelper(brArray, BR$6);
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocBr br)
    {
        generatedSetterHelperImpl(br, BR$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocBr insertNewBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocBr target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocBr)get_store().insert_element_user(BR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocBr addNewBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocBr target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocBr)get_store().add_element_user(BR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "br" element
     */
    public void removeBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BR$6, i);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$8) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$8);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$8);
        }
    }
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$10);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$10);
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$10) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$10);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" attribute
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlNMTOKEN language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LANGUAGE$10);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$10);
        }
    }
    
    /**
     * Gets the "styleCode" attribute
     */
    public java.util.List getStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$12);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "styleCode" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKENS xgetStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKENS target = null;
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$12);
            return target;
        }
    }
    
    /**
     * True if has "styleCode" attribute
     */
    public boolean isSetStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLECODE$12) != null;
        }
    }
    
    /**
     * Sets the "styleCode" attribute
     */
    public void setStyleCode(java.util.List styleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLECODE$12);
            }
            target.setListValue(styleCode);
        }
    }
    
    /**
     * Sets (as xml) the "styleCode" attribute
     */
    public void xsetStyleCode(org.apache.xmlbeans.XmlNMTOKENS styleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKENS target = null;
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(STYLECODE$12);
            }
            target.set(styleCode);
        }
    }
    
    /**
     * Unsets the "styleCode" attribute
     */
    public void unsetStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLECODE$12);
        }
    }
}
