/*
 * XML Type:  StrucDoc.Td
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.StrucDocTd
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML StrucDoc.Td(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class StrucDocTdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.StrucDocTd
{
    private static final long serialVersionUID = 1L;
    
    public StrucDocTdImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "content");
    private static final javax.xml.namespace.QName LINKHTML$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "linkHtml");
    private static final javax.xml.namespace.QName SUB$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sub");
    private static final javax.xml.namespace.QName SUP$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sup");
    private static final javax.xml.namespace.QName BR$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "br");
    private static final javax.xml.namespace.QName FOOTNOTE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "footnote");
    private static final javax.xml.namespace.QName FOOTNOTEREF$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "footnoteRef");
    private static final javax.xml.namespace.QName RENDERMULTIMEDIA$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "renderMultiMedia");
    private static final javax.xml.namespace.QName PARAGRAPH$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "paragraph");
    private static final javax.xml.namespace.QName LIST$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "list");
    private static final javax.xml.namespace.QName ID$20 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName LANGUAGE$22 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName STYLECODE$24 = 
        new javax.xml.namespace.QName("", "styleCode");
    private static final javax.xml.namespace.QName ABBR$26 = 
        new javax.xml.namespace.QName("", "abbr");
    private static final javax.xml.namespace.QName AXIS$28 = 
        new javax.xml.namespace.QName("", "axis");
    private static final javax.xml.namespace.QName HEADERS$30 = 
        new javax.xml.namespace.QName("", "headers");
    private static final javax.xml.namespace.QName SCOPE$32 = 
        new javax.xml.namespace.QName("", "scope");
    private static final javax.xml.namespace.QName ROWSPAN$34 = 
        new javax.xml.namespace.QName("", "rowspan");
    private static final javax.xml.namespace.QName COLSPAN$36 = 
        new javax.xml.namespace.QName("", "colspan");
    private static final javax.xml.namespace.QName ALIGN$38 = 
        new javax.xml.namespace.QName("", "align");
    private static final javax.xml.namespace.QName CHAR$40 = 
        new javax.xml.namespace.QName("", "char");
    private static final javax.xml.namespace.QName CHAROFF$42 = 
        new javax.xml.namespace.QName("", "charoff");
    private static final javax.xml.namespace.QName VALIGN$44 = 
        new javax.xml.namespace.QName("", "valign");
    
    
    /**
     * Gets array of all "content" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocContent[] getContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENT$0, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocContent[] result = new uk.nhs.connect.iucds.ucr.StrucDocContent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "content" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocContent getContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocContent target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocContent)get_store().find_element_user(CONTENT$0, i);
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
    public void setContentArray(uk.nhs.connect.iucds.ucr.StrucDocContent[] contentArray)
    {
        check_orphaned();
        arraySetterHelper(contentArray, CONTENT$0);
    }
    
    /**
     * Sets ith "content" element
     */
    public void setContentArray(int i, uk.nhs.connect.iucds.ucr.StrucDocContent content)
    {
        generatedSetterHelperImpl(content, CONTENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocContent insertNewContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocContent target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocContent)get_store().insert_element_user(CONTENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocContent addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocContent target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocContent)get_store().add_element_user(CONTENT$0);
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
     * Gets array of all "linkHtml" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocLinkHtml[] getLinkHtmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKHTML$2, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocLinkHtml[] result = new uk.nhs.connect.iucds.ucr.StrucDocLinkHtml[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "linkHtml" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocLinkHtml getLinkHtmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocLinkHtml target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocLinkHtml)get_store().find_element_user(LINKHTML$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "linkHtml" element
     */
    public int sizeOfLinkHtmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKHTML$2);
        }
    }
    
    /**
     * Sets array of all "linkHtml" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setLinkHtmlArray(uk.nhs.connect.iucds.ucr.StrucDocLinkHtml[] linkHtmlArray)
    {
        check_orphaned();
        arraySetterHelper(linkHtmlArray, LINKHTML$2);
    }
    
    /**
     * Sets ith "linkHtml" element
     */
    public void setLinkHtmlArray(int i, uk.nhs.connect.iucds.ucr.StrucDocLinkHtml linkHtml)
    {
        generatedSetterHelperImpl(linkHtml, LINKHTML$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkHtml" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocLinkHtml insertNewLinkHtml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocLinkHtml target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocLinkHtml)get_store().insert_element_user(LINKHTML$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkHtml" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocLinkHtml addNewLinkHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocLinkHtml target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocLinkHtml)get_store().add_element_user(LINKHTML$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "linkHtml" element
     */
    public void removeLinkHtml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKHTML$2, i);
        }
    }
    
    /**
     * Gets array of all "sub" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSub[] getSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUB$4, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocSub[] result = new uk.nhs.connect.iucds.ucr.StrucDocSub[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sub" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSub getSubArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocSub target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocSub)get_store().find_element_user(SUB$4, i);
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
            return get_store().count_elements(SUB$4);
        }
    }
    
    /**
     * Sets array of all "sub" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSubArray(uk.nhs.connect.iucds.ucr.StrucDocSub[] subArray)
    {
        check_orphaned();
        arraySetterHelper(subArray, SUB$4);
    }
    
    /**
     * Sets ith "sub" element
     */
    public void setSubArray(int i, uk.nhs.connect.iucds.ucr.StrucDocSub sub)
    {
        generatedSetterHelperImpl(sub, SUB$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sub" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSub insertNewSub(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocSub target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocSub)get_store().insert_element_user(SUB$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sub" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSub addNewSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocSub target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocSub)get_store().add_element_user(SUB$4);
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
            get_store().remove_element(SUB$4, i);
        }
    }
    
    /**
     * Gets array of all "sup" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSup[] getSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUP$6, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocSup[] result = new uk.nhs.connect.iucds.ucr.StrucDocSup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sup" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSup getSupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocSup target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocSup)get_store().find_element_user(SUP$6, i);
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
            return get_store().count_elements(SUP$6);
        }
    }
    
    /**
     * Sets array of all "sup" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setSupArray(uk.nhs.connect.iucds.ucr.StrucDocSup[] supArray)
    {
        check_orphaned();
        arraySetterHelper(supArray, SUP$6);
    }
    
    /**
     * Sets ith "sup" element
     */
    public void setSupArray(int i, uk.nhs.connect.iucds.ucr.StrucDocSup sup)
    {
        generatedSetterHelperImpl(sup, SUP$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sup" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSup insertNewSup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocSup target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocSup)get_store().insert_element_user(SUP$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sup" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocSup addNewSup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocSup target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocSup)get_store().add_element_user(SUP$6);
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
            get_store().remove_element(SUP$6, i);
        }
    }
    
    /**
     * Gets array of all "br" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocBr[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$8, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocBr[] result = new uk.nhs.connect.iucds.ucr.StrucDocBr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "br" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocBr getBrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocBr target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocBr)get_store().find_element_user(BR$8, i);
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
            return get_store().count_elements(BR$8);
        }
    }
    
    /**
     * Sets array of all "br" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBrArray(uk.nhs.connect.iucds.ucr.StrucDocBr[] brArray)
    {
        check_orphaned();
        arraySetterHelper(brArray, BR$8);
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, uk.nhs.connect.iucds.ucr.StrucDocBr br)
    {
        generatedSetterHelperImpl(br, BR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocBr insertNewBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocBr target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocBr)get_store().insert_element_user(BR$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocBr addNewBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocBr target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocBr)get_store().add_element_user(BR$8);
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
            get_store().remove_element(BR$8, i);
        }
    }
    
    /**
     * Gets array of all "footnote" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnote[] getFootnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTNOTE$10, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocFootnote[] result = new uk.nhs.connect.iucds.ucr.StrucDocFootnote[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footnote" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnote getFootnoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocFootnote target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocFootnote)get_store().find_element_user(FOOTNOTE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footnote" element
     */
    public int sizeOfFootnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTE$10);
        }
    }
    
    /**
     * Sets array of all "footnote" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFootnoteArray(uk.nhs.connect.iucds.ucr.StrucDocFootnote[] footnoteArray)
    {
        check_orphaned();
        arraySetterHelper(footnoteArray, FOOTNOTE$10);
    }
    
    /**
     * Sets ith "footnote" element
     */
    public void setFootnoteArray(int i, uk.nhs.connect.iucds.ucr.StrucDocFootnote footnote)
    {
        generatedSetterHelperImpl(footnote, FOOTNOTE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnote insertNewFootnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocFootnote target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocFootnote)get_store().insert_element_user(FOOTNOTE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnote addNewFootnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocFootnote target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocFootnote)get_store().add_element_user(FOOTNOTE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "footnote" element
     */
    public void removeFootnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTE$10, i);
        }
    }
    
    /**
     * Gets array of all "footnoteRef" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef[] getFootnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTNOTEREF$12, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef[] result = new uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footnoteRef" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef getFootnoteRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef)get_store().find_element_user(FOOTNOTEREF$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footnoteRef" element
     */
    public int sizeOfFootnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTEREF$12);
        }
    }
    
    /**
     * Sets array of all "footnoteRef" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setFootnoteRefArray(uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef[] footnoteRefArray)
    {
        check_orphaned();
        arraySetterHelper(footnoteRefArray, FOOTNOTEREF$12);
    }
    
    /**
     * Sets ith "footnoteRef" element
     */
    public void setFootnoteRefArray(int i, uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef footnoteRef)
    {
        generatedSetterHelperImpl(footnoteRef, FOOTNOTEREF$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnoteRef" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef insertNewFootnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef)get_store().insert_element_user(FOOTNOTEREF$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnoteRef" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef addNewFootnoteRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocFootnoteRef)get_store().add_element_user(FOOTNOTEREF$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "footnoteRef" element
     */
    public void removeFootnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTEREF$12, i);
        }
    }
    
    /**
     * Gets array of all "renderMultiMedia" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia[] getRenderMultiMediaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERMULTIMEDIA$14, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia[] result = new uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "renderMultiMedia" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia getRenderMultiMediaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia)get_store().find_element_user(RENDERMULTIMEDIA$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "renderMultiMedia" element
     */
    public int sizeOfRenderMultiMediaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERMULTIMEDIA$14);
        }
    }
    
    /**
     * Sets array of all "renderMultiMedia" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRenderMultiMediaArray(uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia[] renderMultiMediaArray)
    {
        check_orphaned();
        arraySetterHelper(renderMultiMediaArray, RENDERMULTIMEDIA$14);
    }
    
    /**
     * Sets ith "renderMultiMedia" element
     */
    public void setRenderMultiMediaArray(int i, uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia renderMultiMedia)
    {
        generatedSetterHelperImpl(renderMultiMedia, RENDERMULTIMEDIA$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "renderMultiMedia" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia insertNewRenderMultiMedia(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia)get_store().insert_element_user(RENDERMULTIMEDIA$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "renderMultiMedia" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia addNewRenderMultiMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocRenderMultiMedia)get_store().add_element_user(RENDERMULTIMEDIA$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "renderMultiMedia" element
     */
    public void removeRenderMultiMedia(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERMULTIMEDIA$14, i);
        }
    }
    
    /**
     * Gets array of all "paragraph" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocParagraph[] getParagraphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAGRAPH$16, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocParagraph[] result = new uk.nhs.connect.iucds.ucr.StrucDocParagraph[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "paragraph" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocParagraph getParagraphArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocParagraph target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocParagraph)get_store().find_element_user(PARAGRAPH$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "paragraph" element
     */
    public int sizeOfParagraphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARAGRAPH$16);
        }
    }
    
    /**
     * Sets array of all "paragraph" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParagraphArray(uk.nhs.connect.iucds.ucr.StrucDocParagraph[] paragraphArray)
    {
        check_orphaned();
        arraySetterHelper(paragraphArray, PARAGRAPH$16);
    }
    
    /**
     * Sets ith "paragraph" element
     */
    public void setParagraphArray(int i, uk.nhs.connect.iucds.ucr.StrucDocParagraph paragraph)
    {
        generatedSetterHelperImpl(paragraph, PARAGRAPH$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "paragraph" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocParagraph insertNewParagraph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocParagraph target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocParagraph)get_store().insert_element_user(PARAGRAPH$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "paragraph" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocParagraph addNewParagraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocParagraph target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocParagraph)get_store().add_element_user(PARAGRAPH$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "paragraph" element
     */
    public void removeParagraph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARAGRAPH$16, i);
        }
    }
    
    /**
     * Gets array of all "list" elements
     */
    public uk.nhs.connect.iucds.ucr.StrucDocList[] getListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LIST$18, targetList);
            uk.nhs.connect.iucds.ucr.StrucDocList[] result = new uk.nhs.connect.iucds.ucr.StrucDocList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "list" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocList getListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocList target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocList)get_store().find_element_user(LIST$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "list" element
     */
    public int sizeOfListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$18);
        }
    }
    
    /**
     * Sets array of all "list" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setListArray(uk.nhs.connect.iucds.ucr.StrucDocList[] listArray)
    {
        check_orphaned();
        arraySetterHelper(listArray, LIST$18);
    }
    
    /**
     * Sets ith "list" element
     */
    public void setListArray(int i, uk.nhs.connect.iucds.ucr.StrucDocList list)
    {
        generatedSetterHelperImpl(list, LIST$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "list" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocList insertNewList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocList target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocList)get_store().insert_element_user(LIST$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "list" element
     */
    public uk.nhs.connect.iucds.ucr.StrucDocList addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocList target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocList)get_store().add_element_user(LIST$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "list" element
     */
    public void removeList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$18, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
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
            return get_store().find_attribute_user(ID$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$20);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$20);
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
            get_store().remove_attribute(ID$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$22);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$22);
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
            return get_store().find_attribute_user(LANGUAGE$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$22);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LANGUAGE$22);
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
            get_store().remove_attribute(LANGUAGE$22);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$24);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$24);
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
            return get_store().find_attribute_user(STYLECODE$24) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLECODE$24);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(STYLECODE$24);
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
            get_store().remove_attribute(STYLECODE$24);
        }
    }
    
    /**
     * Gets the "abbr" attribute
     */
    public java.lang.String getAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBR$26);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "abbr" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ABBR$26);
            return target;
        }
    }
    
    /**
     * True if has "abbr" attribute
     */
    public boolean isSetAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ABBR$26) != null;
        }
    }
    
    /**
     * Sets the "abbr" attribute
     */
    public void setAbbr(java.lang.String abbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBR$26);
            }
            target.setStringValue(abbr);
        }
    }
    
    /**
     * Sets (as xml) the "abbr" attribute
     */
    public void xsetAbbr(org.apache.xmlbeans.XmlString abbr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ABBR$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ABBR$26);
            }
            target.set(abbr);
        }
    }
    
    /**
     * Unsets the "abbr" attribute
     */
    public void unsetAbbr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ABBR$26);
        }
    }
    
    /**
     * Gets the "axis" attribute
     */
    public java.lang.String getAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "axis" attribute
     */
    public org.apache.xmlbeans.XmlString xgetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AXIS$28);
            return target;
        }
    }
    
    /**
     * True if has "axis" attribute
     */
    public boolean isSetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(AXIS$28) != null;
        }
    }
    
    /**
     * Sets the "axis" attribute
     */
    public void setAxis(java.lang.String axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(AXIS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(AXIS$28);
            }
            target.setStringValue(axis);
        }
    }
    
    /**
     * Sets (as xml) the "axis" attribute
     */
    public void xsetAxis(org.apache.xmlbeans.XmlString axis)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(AXIS$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(AXIS$28);
            }
            target.set(axis);
        }
    }
    
    /**
     * Unsets the "axis" attribute
     */
    public void unsetAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(AXIS$28);
        }
    }
    
    /**
     * Gets the "headers" attribute
     */
    public java.util.List getHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$30);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "headers" attribute
     */
    public org.apache.xmlbeans.XmlIDREFS xgetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(HEADERS$30);
            return target;
        }
    }
    
    /**
     * True if has "headers" attribute
     */
    public boolean isSetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEADERS$30) != null;
        }
    }
    
    /**
     * Sets the "headers" attribute
     */
    public void setHeaders(java.util.List headers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERS$30);
            }
            target.setListValue(headers);
        }
    }
    
    /**
     * Sets (as xml) the "headers" attribute
     */
    public void xsetHeaders(org.apache.xmlbeans.XmlIDREFS headers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlIDREFS target = null;
            target = (org.apache.xmlbeans.XmlIDREFS)get_store().find_attribute_user(HEADERS$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlIDREFS)get_store().add_attribute_user(HEADERS$30);
            }
            target.set(headers);
        }
    }
    
    /**
     * Unsets the "headers" attribute
     */
    public void unsetHeaders()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEADERS$30);
        }
    }
    
    /**
     * Gets the "scope" attribute
     */
    public uk.nhs.connect.iucds.ucr.StrucDocTd.Scope.Enum getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$32);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.StrucDocTd.Scope.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" attribute
     */
    public uk.nhs.connect.iucds.ucr.StrucDocTd.Scope xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocTd.Scope target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Scope)get_store().find_attribute_user(SCOPE$32);
            return target;
        }
    }
    
    /**
     * True if has "scope" attribute
     */
    public boolean isSetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SCOPE$32) != null;
        }
    }
    
    /**
     * Sets the "scope" attribute
     */
    public void setScope(uk.nhs.connect.iucds.ucr.StrucDocTd.Scope.Enum scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SCOPE$32);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SCOPE$32);
            }
            target.setEnumValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" attribute
     */
    public void xsetScope(uk.nhs.connect.iucds.ucr.StrucDocTd.Scope scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocTd.Scope target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Scope)get_store().find_attribute_user(SCOPE$32);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Scope)get_store().add_attribute_user(SCOPE$32);
            }
            target.set(scope);
        }
    }
    
    /**
     * Unsets the "scope" attribute
     */
    public void unsetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SCOPE$32);
        }
    }
    
    /**
     * Gets the "rowspan" attribute
     */
    public java.lang.String getRowspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSPAN$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ROWSPAN$34);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rowspan" attribute
     */
    public org.apache.xmlbeans.XmlString xgetRowspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSPAN$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ROWSPAN$34);
            }
            return target;
        }
    }
    
    /**
     * True if has "rowspan" attribute
     */
    public boolean isSetRowspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROWSPAN$34) != null;
        }
    }
    
    /**
     * Sets the "rowspan" attribute
     */
    public void setRowspan(java.lang.String rowspan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSPAN$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWSPAN$34);
            }
            target.setStringValue(rowspan);
        }
    }
    
    /**
     * Sets (as xml) the "rowspan" attribute
     */
    public void xsetRowspan(org.apache.xmlbeans.XmlString rowspan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSPAN$34);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROWSPAN$34);
            }
            target.set(rowspan);
        }
    }
    
    /**
     * Unsets the "rowspan" attribute
     */
    public void unsetRowspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROWSPAN$34);
        }
    }
    
    /**
     * Gets the "colspan" attribute
     */
    public java.lang.String getColspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSPAN$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLSPAN$36);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "colspan" attribute
     */
    public org.apache.xmlbeans.XmlString xgetColspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSPAN$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(COLSPAN$36);
            }
            return target;
        }
    }
    
    /**
     * True if has "colspan" attribute
     */
    public boolean isSetColspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLSPAN$36) != null;
        }
    }
    
    /**
     * Sets the "colspan" attribute
     */
    public void setColspan(java.lang.String colspan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSPAN$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLSPAN$36);
            }
            target.setStringValue(colspan);
        }
    }
    
    /**
     * Sets (as xml) the "colspan" attribute
     */
    public void xsetColspan(org.apache.xmlbeans.XmlString colspan)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSPAN$36);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLSPAN$36);
            }
            target.set(colspan);
        }
    }
    
    /**
     * Unsets the "colspan" attribute
     */
    public void unsetColspan()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLSPAN$36);
        }
    }
    
    /**
     * Gets the "align" attribute
     */
    public uk.nhs.connect.iucds.ucr.StrucDocTd.Align.Enum getAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGN$38);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.StrucDocTd.Align.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "align" attribute
     */
    public uk.nhs.connect.iucds.ucr.StrucDocTd.Align xgetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocTd.Align target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Align)get_store().find_attribute_user(ALIGN$38);
            return target;
        }
    }
    
    /**
     * True if has "align" attribute
     */
    public boolean isSetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIGN$38) != null;
        }
    }
    
    /**
     * Sets the "align" attribute
     */
    public void setAlign(uk.nhs.connect.iucds.ucr.StrucDocTd.Align.Enum align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGN$38);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGN$38);
            }
            target.setEnumValue(align);
        }
    }
    
    /**
     * Sets (as xml) the "align" attribute
     */
    public void xsetAlign(uk.nhs.connect.iucds.ucr.StrucDocTd.Align align)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocTd.Align target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Align)get_store().find_attribute_user(ALIGN$38);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Align)get_store().add_attribute_user(ALIGN$38);
            }
            target.set(align);
        }
    }
    
    /**
     * Unsets the "align" attribute
     */
    public void unsetAlign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIGN$38);
        }
    }
    
    /**
     * Gets the "char" attribute
     */
    public java.lang.String getChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$40);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "char" attribute
     */
    public org.apache.xmlbeans.XmlString xgetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAR$40);
            return target;
        }
    }
    
    /**
     * True if has "char" attribute
     */
    public boolean isSetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAR$40) != null;
        }
    }
    
    /**
     * Sets the "char" attribute
     */
    public void setChar(java.lang.String xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAR$40);
            }
            target.setStringValue(xchar);
        }
    }
    
    /**
     * Sets (as xml) the "char" attribute
     */
    public void xsetChar(org.apache.xmlbeans.XmlString xchar)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAR$40);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHAR$40);
            }
            target.set(xchar);
        }
    }
    
    /**
     * Unsets the "char" attribute
     */
    public void unsetChar()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAR$40);
        }
    }
    
    /**
     * Gets the "charoff" attribute
     */
    public java.lang.String getCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAROFF$42);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "charoff" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAROFF$42);
            return target;
        }
    }
    
    /**
     * True if has "charoff" attribute
     */
    public boolean isSetCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CHAROFF$42) != null;
        }
    }
    
    /**
     * Sets the "charoff" attribute
     */
    public void setCharoff(java.lang.String charoff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CHAROFF$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CHAROFF$42);
            }
            target.setStringValue(charoff);
        }
    }
    
    /**
     * Sets (as xml) the "charoff" attribute
     */
    public void xsetCharoff(org.apache.xmlbeans.XmlString charoff)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CHAROFF$42);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CHAROFF$42);
            }
            target.set(charoff);
        }
    }
    
    /**
     * Unsets the "charoff" attribute
     */
    public void unsetCharoff()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CHAROFF$42);
        }
    }
    
    /**
     * Gets the "valign" attribute
     */
    public uk.nhs.connect.iucds.ucr.StrucDocTd.Valign.Enum getValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$44);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.ucr.StrucDocTd.Valign.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "valign" attribute
     */
    public uk.nhs.connect.iucds.ucr.StrucDocTd.Valign xgetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocTd.Valign target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Valign)get_store().find_attribute_user(VALIGN$44);
            return target;
        }
    }
    
    /**
     * True if has "valign" attribute
     */
    public boolean isSetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALIGN$44) != null;
        }
    }
    
    /**
     * Sets the "valign" attribute
     */
    public void setValign(uk.nhs.connect.iucds.ucr.StrucDocTd.Valign.Enum valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALIGN$44);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALIGN$44);
            }
            target.setEnumValue(valign);
        }
    }
    
    /**
     * Sets (as xml) the "valign" attribute
     */
    public void xsetValign(uk.nhs.connect.iucds.ucr.StrucDocTd.Valign valign)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.StrucDocTd.Valign target = null;
            target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Valign)get_store().find_attribute_user(VALIGN$44);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.ucr.StrucDocTd.Valign)get_store().add_attribute_user(VALIGN$44);
            }
            target.set(valign);
        }
    }
    
    /**
     * Unsets the "valign" attribute
     */
    public void unsetValign()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALIGN$44);
        }
    }
    /**
     * An XML scope(@).
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.StrucDocTd$Scope.
     */
    public static class ScopeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.StrucDocTd.Scope
    {
        private static final long serialVersionUID = 1L;
        
        public ScopeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ScopeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML align(@).
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.StrucDocTd$Align.
     */
    public static class AlignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.StrucDocTd.Align
    {
        private static final long serialVersionUID = 1L;
        
        public AlignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected AlignImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML valign(@).
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.StrucDocTd$Valign.
     */
    public static class ValignImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.StrucDocTd.Valign
    {
        private static final long serialVersionUID = 1L;
        
        public ValignImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ValignImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}