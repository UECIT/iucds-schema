/*
 * An XML document type.
 * Localname: td
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TdDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one td(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class TdDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TdDocument
{
    private static final long serialVersionUID = 1L;
    
    public TdDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TD$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "td");
    
    
    /**
     * Gets the "td" element
     */
    public uk.nhs.connect.npfit.presentationtext.TdDocument.Td getTd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TdDocument.Td target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TdDocument.Td)get_store().find_element_user(TD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "td" element
     */
    public void setTd(uk.nhs.connect.npfit.presentationtext.TdDocument.Td td)
    {
        generatedSetterHelperImpl(td, TD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "td" element
     */
    public uk.nhs.connect.npfit.presentationtext.TdDocument.Td addNewTd()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TdDocument.Td target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TdDocument.Td)get_store().add_element_user(TD$0);
            return target;
        }
    }
    /**
     * An XML td(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class TdImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TdDocument.Td
    {
        private static final long serialVersionUID = 1L;
        
        public TdImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LI$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "li");
        private static final javax.xml.namespace.QName OL$2 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "ol");
        private static final javax.xml.namespace.QName UL$4 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "ul");
        private static final javax.xml.namespace.QName A$6 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "a");
        private static final javax.xml.namespace.QName ID$8 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName ROWSPAN$10 = 
            new javax.xml.namespace.QName("", "rowspan");
        private static final javax.xml.namespace.QName COLSPAN$12 = 
            new javax.xml.namespace.QName("", "colspan");
        private static final javax.xml.namespace.QName ABBR$14 = 
            new javax.xml.namespace.QName("", "abbr");
        private static final javax.xml.namespace.QName HEADERS$16 = 
            new javax.xml.namespace.QName("", "headers");
        
        
        /**
         * Gets array of all "li" elements
         */
        public uk.nhs.connect.npfit.presentationtext.LiDocument.Li[] getLiArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(LI$0, targetList);
                uk.nhs.connect.npfit.presentationtext.LiDocument.Li[] result = new uk.nhs.connect.npfit.presentationtext.LiDocument.Li[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "li" element
         */
        public uk.nhs.connect.npfit.presentationtext.LiDocument.Li getLiArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.LiDocument.Li target = null;
                target = (uk.nhs.connect.npfit.presentationtext.LiDocument.Li)get_store().find_element_user(LI$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "li" element
         */
        public int sizeOfLiArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(LI$0);
            }
        }
        
        /**
         * Sets array of all "li" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setLiArray(uk.nhs.connect.npfit.presentationtext.LiDocument.Li[] liArray)
        {
            check_orphaned();
            arraySetterHelper(liArray, LI$0);
        }
        
        /**
         * Sets ith "li" element
         */
        public void setLiArray(int i, uk.nhs.connect.npfit.presentationtext.LiDocument.Li li)
        {
            generatedSetterHelperImpl(li, LI$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "li" element
         */
        public uk.nhs.connect.npfit.presentationtext.LiDocument.Li insertNewLi(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.LiDocument.Li target = null;
                target = (uk.nhs.connect.npfit.presentationtext.LiDocument.Li)get_store().insert_element_user(LI$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "li" element
         */
        public uk.nhs.connect.npfit.presentationtext.LiDocument.Li addNewLi()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.LiDocument.Li target = null;
                target = (uk.nhs.connect.npfit.presentationtext.LiDocument.Li)get_store().add_element_user(LI$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "li" element
         */
        public void removeLi(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(LI$0, i);
            }
        }
        
        /**
         * Gets array of all "ol" elements
         */
        public uk.nhs.connect.npfit.presentationtext.OlDocument.Ol[] getOlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OL$2, targetList);
                uk.nhs.connect.npfit.presentationtext.OlDocument.Ol[] result = new uk.nhs.connect.npfit.presentationtext.OlDocument.Ol[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ol" element
         */
        public uk.nhs.connect.npfit.presentationtext.OlDocument.Ol getOlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.OlDocument.Ol target = null;
                target = (uk.nhs.connect.npfit.presentationtext.OlDocument.Ol)get_store().find_element_user(OL$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ol" element
         */
        public int sizeOfOlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OL$2);
            }
        }
        
        /**
         * Sets array of all "ol" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setOlArray(uk.nhs.connect.npfit.presentationtext.OlDocument.Ol[] olArray)
        {
            check_orphaned();
            arraySetterHelper(olArray, OL$2);
        }
        
        /**
         * Sets ith "ol" element
         */
        public void setOlArray(int i, uk.nhs.connect.npfit.presentationtext.OlDocument.Ol ol)
        {
            generatedSetterHelperImpl(ol, OL$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ol" element
         */
        public uk.nhs.connect.npfit.presentationtext.OlDocument.Ol insertNewOl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.OlDocument.Ol target = null;
                target = (uk.nhs.connect.npfit.presentationtext.OlDocument.Ol)get_store().insert_element_user(OL$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ol" element
         */
        public uk.nhs.connect.npfit.presentationtext.OlDocument.Ol addNewOl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.OlDocument.Ol target = null;
                target = (uk.nhs.connect.npfit.presentationtext.OlDocument.Ol)get_store().add_element_user(OL$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "ol" element
         */
        public void removeOl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OL$2, i);
            }
        }
        
        /**
         * Gets array of all "ul" elements
         */
        public uk.nhs.connect.npfit.presentationtext.UlDocument.Ul[] getUlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(UL$4, targetList);
                uk.nhs.connect.npfit.presentationtext.UlDocument.Ul[] result = new uk.nhs.connect.npfit.presentationtext.UlDocument.Ul[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "ul" element
         */
        public uk.nhs.connect.npfit.presentationtext.UlDocument.Ul getUlArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.UlDocument.Ul target = null;
                target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().find_element_user(UL$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "ul" element
         */
        public int sizeOfUlArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(UL$4);
            }
        }
        
        /**
         * Sets array of all "ul" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setUlArray(uk.nhs.connect.npfit.presentationtext.UlDocument.Ul[] ulArray)
        {
            check_orphaned();
            arraySetterHelper(ulArray, UL$4);
        }
        
        /**
         * Sets ith "ul" element
         */
        public void setUlArray(int i, uk.nhs.connect.npfit.presentationtext.UlDocument.Ul ul)
        {
            generatedSetterHelperImpl(ul, UL$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "ul" element
         */
        public uk.nhs.connect.npfit.presentationtext.UlDocument.Ul insertNewUl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.UlDocument.Ul target = null;
                target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().insert_element_user(UL$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "ul" element
         */
        public uk.nhs.connect.npfit.presentationtext.UlDocument.Ul addNewUl()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.UlDocument.Ul target = null;
                target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().add_element_user(UL$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "ul" element
         */
        public void removeUl(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(UL$4, i);
            }
        }
        
        /**
         * Gets array of all "a" elements
         */
        public uk.nhs.connect.npfit.presentationtext.ADocument.A[] getAArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(A$6, targetList);
                uk.nhs.connect.npfit.presentationtext.ADocument.A[] result = new uk.nhs.connect.npfit.presentationtext.ADocument.A[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "a" element
         */
        public uk.nhs.connect.npfit.presentationtext.ADocument.A getAArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ADocument.A target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().find_element_user(A$6, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "a" element
         */
        public int sizeOfAArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(A$6);
            }
        }
        
        /**
         * Sets array of all "a" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAArray(uk.nhs.connect.npfit.presentationtext.ADocument.A[] aArray)
        {
            check_orphaned();
            arraySetterHelper(aArray, A$6);
        }
        
        /**
         * Sets ith "a" element
         */
        public void setAArray(int i, uk.nhs.connect.npfit.presentationtext.ADocument.A a)
        {
            generatedSetterHelperImpl(a, A$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "a" element
         */
        public uk.nhs.connect.npfit.presentationtext.ADocument.A insertNewA(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ADocument.A target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().insert_element_user(A$6, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "a" element
         */
        public uk.nhs.connect.npfit.presentationtext.ADocument.A addNewA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ADocument.A target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().add_element_user(A$6);
                return target;
            }
        }
        
        /**
         * Removes the ith "a" element
         */
        public void removeA(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(A$6, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
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
        public org.apache.xmlbeans.XmlString xgetId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
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
                return get_store().find_attribute_user(ID$8) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$8);
                }
                target.setStringValue(id);
            }
        }
        
        /**
         * Sets (as xml) the "id" attribute
         */
        public void xsetId(org.apache.xmlbeans.XmlString id)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ID$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ID$8);
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
                get_store().remove_attribute(ID$8);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSPAN$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSPAN$10);
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
                return get_store().find_attribute_user(ROWSPAN$10) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROWSPAN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROWSPAN$10);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ROWSPAN$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ROWSPAN$10);
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
                get_store().remove_attribute(ROWSPAN$10);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSPAN$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSPAN$12);
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
                return get_store().find_attribute_user(COLSPAN$12) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLSPAN$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLSPAN$12);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(COLSPAN$12);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(COLSPAN$12);
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
                get_store().remove_attribute(COLSPAN$12);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBR$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ABBR$14);
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
                return get_store().find_attribute_user(ABBR$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ABBR$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ABBR$14);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ABBR$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ABBR$14);
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
                get_store().remove_attribute(ABBR$14);
            }
        }
        
        /**
         * Gets the "headers" attribute
         */
        public java.lang.String getHeaders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$16);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "headers" attribute
         */
        public org.apache.xmlbeans.XmlString xgetHeaders()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERS$16);
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
                return get_store().find_attribute_user(HEADERS$16) != null;
            }
        }
        
        /**
         * Sets the "headers" attribute
         */
        public void setHeaders(java.lang.String headers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEADERS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEADERS$16);
                }
                target.setStringValue(headers);
            }
        }
        
        /**
         * Sets (as xml) the "headers" attribute
         */
        public void xsetHeaders(org.apache.xmlbeans.XmlString headers)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(HEADERS$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(HEADERS$16);
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
                get_store().remove_attribute(HEADERS$16);
            }
        }
    }
}
