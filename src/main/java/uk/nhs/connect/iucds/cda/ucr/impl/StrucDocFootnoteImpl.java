/*
 * XML Type:  StrucDoc.Footnote
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML StrucDoc.Footnote(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class StrucDocFootnoteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.cda.ucr.StrucDocFootnote
{
    private static final long serialVersionUID = 1L;
    
    public StrucDocFootnoteImpl(org.apache.xmlbeans.SchemaType sType)
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
    private static final javax.xml.namespace.QName RENDERMULTIMEDIA$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "renderMultiMedia");
    private static final javax.xml.namespace.QName PARAGRAPH$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "paragraph");
    private static final javax.xml.namespace.QName LIST$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "list");
    private static final javax.xml.namespace.QName TABLE$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "table");
    private static final javax.xml.namespace.QName ID$18 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName LANGUAGE$20 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName STYLECODE$22 = 
        new javax.xml.namespace.QName("", "styleCode");
    
    
    /**
     * Gets array of all "content" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocContent[] getContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENT$0, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocContent[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocContent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "content" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocContent getContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocContent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocContent)get_store().find_element_user(CONTENT$0, i);
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
    public void setContentArray(uk.nhs.connect.iucds.cda.ucr.StrucDocContent[] contentArray)
    {
        check_orphaned();
        arraySetterHelper(contentArray, CONTENT$0);
    }
    
    /**
     * Sets ith "content" element
     */
    public void setContentArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocContent content)
    {
        generatedSetterHelperImpl(content, CONTENT$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocContent insertNewContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocContent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocContent)get_store().insert_element_user(CONTENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocContent addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocContent target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocContent)get_store().add_element_user(CONTENT$0);
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
    public uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml[] getLinkHtmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKHTML$2, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "linkHtml" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml getLinkHtmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml)get_store().find_element_user(LINKHTML$2, i);
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
    public void setLinkHtmlArray(uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml[] linkHtmlArray)
    {
        check_orphaned();
        arraySetterHelper(linkHtmlArray, LINKHTML$2);
    }
    
    /**
     * Sets ith "linkHtml" element
     */
    public void setLinkHtmlArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml linkHtml)
    {
        generatedSetterHelperImpl(linkHtml, LINKHTML$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkHtml" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml insertNewLinkHtml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml)get_store().insert_element_user(LINKHTML$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkHtml" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml addNewLinkHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocLinkHtml)get_store().add_element_user(LINKHTML$2);
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
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSub[] getSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUB$4, targetList);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSub)get_store().find_element_user(SUB$4, i);
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
    public void setSubArray(uk.nhs.connect.iucds.cda.ucr.StrucDocSub[] subArray)
    {
        check_orphaned();
        arraySetterHelper(subArray, SUB$4);
    }
    
    /**
     * Sets ith "sub" element
     */
    public void setSubArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocSub sub)
    {
        generatedSetterHelperImpl(sub, SUB$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSub)get_store().insert_element_user(SUB$4, i);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSub)get_store().add_element_user(SUB$4);
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
    public uk.nhs.connect.iucds.cda.ucr.StrucDocSup[] getSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUP$6, targetList);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSup)get_store().find_element_user(SUP$6, i);
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
    public void setSupArray(uk.nhs.connect.iucds.cda.ucr.StrucDocSup[] supArray)
    {
        check_orphaned();
        arraySetterHelper(supArray, SUP$6);
    }
    
    /**
     * Sets ith "sup" element
     */
    public void setSupArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocSup sup)
    {
        generatedSetterHelperImpl(sup, SUP$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSup)get_store().insert_element_user(SUP$6, i);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocSup)get_store().add_element_user(SUP$6);
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
    public uk.nhs.connect.iucds.cda.ucr.StrucDocBr[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$8, targetList);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocBr)get_store().find_element_user(BR$8, i);
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
    public void setBrArray(uk.nhs.connect.iucds.cda.ucr.StrucDocBr[] brArray)
    {
        check_orphaned();
        arraySetterHelper(brArray, BR$8);
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocBr br)
    {
        generatedSetterHelperImpl(br, BR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocBr)get_store().insert_element_user(BR$8, i);
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
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocBr)get_store().add_element_user(BR$8);
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
     * Gets array of all "renderMultiMedia" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia[] getRenderMultiMediaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERMULTIMEDIA$10, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "renderMultiMedia" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia getRenderMultiMediaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia)get_store().find_element_user(RENDERMULTIMEDIA$10, i);
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
            return get_store().count_elements(RENDERMULTIMEDIA$10);
        }
    }
    
    /**
     * Sets array of all "renderMultiMedia" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRenderMultiMediaArray(uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia[] renderMultiMediaArray)
    {
        check_orphaned();
        arraySetterHelper(renderMultiMediaArray, RENDERMULTIMEDIA$10);
    }
    
    /**
     * Sets ith "renderMultiMedia" element
     */
    public void setRenderMultiMediaArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia renderMultiMedia)
    {
        generatedSetterHelperImpl(renderMultiMedia, RENDERMULTIMEDIA$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "renderMultiMedia" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia insertNewRenderMultiMedia(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia)get_store().insert_element_user(RENDERMULTIMEDIA$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "renderMultiMedia" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia addNewRenderMultiMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocRenderMultiMedia)get_store().add_element_user(RENDERMULTIMEDIA$10);
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
            get_store().remove_element(RENDERMULTIMEDIA$10, i);
        }
    }
    
    /**
     * Gets array of all "paragraph" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph[] getParagraphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARAGRAPH$12, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "paragraph" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph getParagraphArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph)get_store().find_element_user(PARAGRAPH$12, i);
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
            return get_store().count_elements(PARAGRAPH$12);
        }
    }
    
    /**
     * Sets array of all "paragraph" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setParagraphArray(uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph[] paragraphArray)
    {
        check_orphaned();
        arraySetterHelper(paragraphArray, PARAGRAPH$12);
    }
    
    /**
     * Sets ith "paragraph" element
     */
    public void setParagraphArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph paragraph)
    {
        generatedSetterHelperImpl(paragraph, PARAGRAPH$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "paragraph" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph insertNewParagraph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph)get_store().insert_element_user(PARAGRAPH$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "paragraph" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph addNewParagraph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocParagraph)get_store().add_element_user(PARAGRAPH$12);
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
            get_store().remove_element(PARAGRAPH$12, i);
        }
    }
    
    /**
     * Gets array of all "list" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocList[] getListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LIST$14, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocList[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "list" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocList getListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocList target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocList)get_store().find_element_user(LIST$14, i);
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
            return get_store().count_elements(LIST$14);
        }
    }
    
    /**
     * Sets array of all "list" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setListArray(uk.nhs.connect.iucds.cda.ucr.StrucDocList[] listArray)
    {
        check_orphaned();
        arraySetterHelper(listArray, LIST$14);
    }
    
    /**
     * Sets ith "list" element
     */
    public void setListArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocList list)
    {
        generatedSetterHelperImpl(list, LIST$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "list" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocList insertNewList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocList target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocList)get_store().insert_element_user(LIST$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "list" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocList addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocList target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocList)get_store().add_element_user(LIST$14);
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
            get_store().remove_element(LIST$14, i);
        }
    }
    
    /**
     * Gets array of all "table" elements
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTable[] getTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLE$16, targetList);
            uk.nhs.connect.iucds.cda.ucr.StrucDocTable[] result = new uk.nhs.connect.iucds.cda.ucr.StrucDocTable[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "table" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTable getTableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocTable target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocTable)get_store().find_element_user(TABLE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "table" element
     */
    public int sizeOfTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLE$16);
        }
    }
    
    /**
     * Sets array of all "table" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTableArray(uk.nhs.connect.iucds.cda.ucr.StrucDocTable[] tableArray)
    {
        check_orphaned();
        arraySetterHelper(tableArray, TABLE$16);
    }
    
    /**
     * Sets ith "table" element
     */
    public void setTableArray(int i, uk.nhs.connect.iucds.cda.ucr.StrucDocTable table)
    {
        generatedSetterHelperImpl(table, TABLE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "table" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTable insertNewTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocTable target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocTable)get_store().insert_element_user(TABLE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "table" element
     */
    public uk.nhs.connect.iucds.cda.ucr.StrucDocTable addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.StrucDocTable target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.StrucDocTable)get_store().add_element_user(TABLE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "table" element
     */
    public void removeTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLE$16, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
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
            return get_store().find_attribute_user(ID$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$18);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$18);
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
            get_store().remove_attribute(ID$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$20);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$20);
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
            return get_store().find_attribute_user(LANGUAGE$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$20);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LANGUAGE$20);
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
            get_store().remove_attribute(LANGUAGE$20);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$22);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$22);
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
            return get_store().find_attribute_user(STYLECODE$22) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLECODE$22);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(STYLECODE$22);
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
            get_store().remove_attribute(STYLECODE$22);
        }
    }
}
