/*
 * An XML document type.
 * Localname: table
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TableDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one table(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class TableDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TableDocument
{
    private static final long serialVersionUID = 1L;
    
    public TableDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TABLE$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "table");
    
    
    /**
     * Gets the "table" element
     */
    public uk.nhs.connect.npfit.presentationtext.TableDocument.Table getTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TableDocument.Table target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().find_element_user(TABLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "table" element
     */
    public void setTable(uk.nhs.connect.npfit.presentationtext.TableDocument.Table table)
    {
        generatedSetterHelperImpl(table, TABLE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "table" element
     */
    public uk.nhs.connect.npfit.presentationtext.TableDocument.Table addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TableDocument.Table target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().add_element_user(TABLE$0);
            return target;
        }
    }
    /**
     * An XML table(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class TableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TableDocument.Table
    {
        private static final long serialVersionUID = 1L;
        
        public TableImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CAPTION$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "caption");
        private static final javax.xml.namespace.QName THEAD$2 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "thead");
        private static final javax.xml.namespace.QName TFOOT$4 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tfoot");
        private static final javax.xml.namespace.QName TBODY$6 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tbody");
        private static final javax.xml.namespace.QName TR$8 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tr");
        private static final javax.xml.namespace.QName SUMMARY$10 = 
            new javax.xml.namespace.QName("", "summary");
        private static final javax.xml.namespace.QName ID$12 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$14 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets the "caption" element
         */
        public uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption getCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption target = null;
                target = (uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption)get_store().find_element_user(CAPTION$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "caption" element
         */
        public boolean isSetCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CAPTION$0) != 0;
            }
        }
        
        /**
         * Sets the "caption" element
         */
        public void setCaption(uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption caption)
        {
            generatedSetterHelperImpl(caption, CAPTION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "caption" element
         */
        public uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption addNewCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption target = null;
                target = (uk.nhs.connect.npfit.presentationtext.CaptionDocument.Caption)get_store().add_element_user(CAPTION$0);
                return target;
            }
        }
        
        /**
         * Unsets the "caption" element
         */
        public void unsetCaption()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CAPTION$0, 0);
            }
        }
        
        /**
         * Gets the "thead" element
         */
        public uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead getThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead)get_store().find_element_user(THEAD$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "thead" element
         */
        public boolean isSetThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(THEAD$2) != 0;
            }
        }
        
        /**
         * Sets the "thead" element
         */
        public void setThead(uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead thead)
        {
            generatedSetterHelperImpl(thead, THEAD$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "thead" element
         */
        public uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead addNewThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TheadDocument.Thead)get_store().add_element_user(THEAD$2);
                return target;
            }
        }
        
        /**
         * Unsets the "thead" element
         */
        public void unsetThead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(THEAD$2, 0);
            }
        }
        
        /**
         * Gets the "tfoot" element
         */
        public uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot getTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot)get_store().find_element_user(TFOOT$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "tfoot" element
         */
        public boolean isSetTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TFOOT$4) != 0;
            }
        }
        
        /**
         * Sets the "tfoot" element
         */
        public void setTfoot(uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot tfoot)
        {
            generatedSetterHelperImpl(tfoot, TFOOT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "tfoot" element
         */
        public uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot addNewTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot)get_store().add_element_user(TFOOT$4);
                return target;
            }
        }
        
        /**
         * Unsets the "tfoot" element
         */
        public void unsetTfoot()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TFOOT$4, 0);
            }
        }
        
        /**
         * Gets array of all "tbody" elements
         */
        public uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody[] getTbodyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TBODY$6, targetList);
                uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody[] result = new uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tbody" element
         */
        public uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody getTbodyArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody)get_store().find_element_user(TBODY$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tbody" element
         */
        public int sizeOfTbodyArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TBODY$6);
            }
        }
        
        /**
         * Sets array of all "tbody" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTbodyArray(uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody[] tbodyArray)
        {
            check_orphaned();
            arraySetterHelper(tbodyArray, TBODY$6);
        }
        
        /**
         * Sets ith "tbody" element
         */
        public void setTbodyArray(int i, uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody tbody)
        {
            generatedSetterHelperImpl(tbody, TBODY$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tbody" element
         */
        public uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody insertNewTbody(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody)get_store().insert_element_user(TBODY$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tbody" element
         */
        public uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody addNewTbody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody)get_store().add_element_user(TBODY$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "tbody" element
         */
        public void removeTbody(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TBODY$6, i);
            }
        }
        
        /**
         * Gets array of all "tr" elements
         */
        public uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[] getTrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TR$8, targetList);
                uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[] result = new uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "tr" element
         */
        public uk.nhs.connect.npfit.presentationtext.TrDocument.Tr getTrArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TrDocument.Tr target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().find_element_user(TR$8, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "tr" element
         */
        public int sizeOfTrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TR$8);
            }
        }
        
        /**
         * Sets array of all "tr" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTrArray(uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[] trArray)
        {
            check_orphaned();
            arraySetterHelper(trArray, TR$8);
        }
        
        /**
         * Sets ith "tr" element
         */
        public void setTrArray(int i, uk.nhs.connect.npfit.presentationtext.TrDocument.Tr tr)
        {
            generatedSetterHelperImpl(tr, TR$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "tr" element
         */
        public uk.nhs.connect.npfit.presentationtext.TrDocument.Tr insertNewTr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TrDocument.Tr target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().insert_element_user(TR$8, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "tr" element
         */
        public uk.nhs.connect.npfit.presentationtext.TrDocument.Tr addNewTr()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TrDocument.Tr target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().add_element_user(TR$8);
                return target;
            }
        }
        
        /**
         * Removes the ith "tr" element
         */
        public void removeTr(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TR$8, i);
            }
        }
        
        /**
         * Gets the "summary" attribute
         */
        public java.lang.String getSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARY$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "summary" attribute
         */
        public org.apache.xmlbeans.XmlString xgetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUMMARY$10);
                return target;
            }
        }
        
        /**
         * True if has "summary" attribute
         */
        public boolean isSetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(SUMMARY$10) != null;
            }
        }
        
        /**
         * Sets the "summary" attribute
         */
        public void setSummary(java.lang.String summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUMMARY$10);
                }
                target.setStringValue(summary);
            }
        }
        
        /**
         * Sets (as xml) the "summary" attribute
         */
        public void xsetSummary(org.apache.xmlbeans.XmlString summary)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUMMARY$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUMMARY$10);
                }
                target.set(summary);
            }
        }
        
        /**
         * Unsets the "summary" attribute
         */
        public void unsetSummary()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(SUMMARY$10);
            }
        }
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "id" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$12);
                return target;
            }
        }
        
        /**
         * True if has "id" attribute
         */
        public boolean isSetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ID$12) != null;
            }
        }
        
        /**
         * Sets the "id" attribute
         */
        public void setId(java.lang.String id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlNMTOKEN id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ID$12);
                }
                target.set(id);
            }
        }
        
        /**
         * Unsets the "id" attribute
         */
        public void unsetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ID$12);
            }
        }
        
        /**
         * Gets the "class" attribute
         */
        public java.lang.String getClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$14);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "class" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$14);
                return target;
            }
        }
        
        /**
         * True if has "class" attribute
         */
        public boolean isSetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CLASS1$14) != null;
            }
        }
        
        /**
         * Sets the "class" attribute
         */
        public void setClass1(java.lang.String class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$14);
                }
                target.setStringValue(class1);
            }
        }
        
        /**
         * Sets (as xml) the "class" attribute
         */
        public void xsetClass1(org.apache.xmlbeans.XmlNMTOKEN class1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CLASS1$14);
                }
                target.set(class1);
            }
        }
        
        /**
         * Unsets the "class" attribute
         */
        public void unsetClass1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CLASS1$14);
            }
        }
    }
}
