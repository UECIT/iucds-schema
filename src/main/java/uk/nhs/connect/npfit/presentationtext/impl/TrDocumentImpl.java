/*
 * An XML document type.
 * Localname: tr
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TrDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one tr(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class TrDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TrDocument
{
    private static final long serialVersionUID = 1L;
    
    public TrDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TR$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tr");
    
    
    /**
     * Gets the "tr" element
     */
    public uk.nhs.connect.npfit.presentationtext.TrDocument.Tr getTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TrDocument.Tr target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().find_element_user(TR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tr" element
     */
    public void setTr(uk.nhs.connect.npfit.presentationtext.TrDocument.Tr tr)
    {
        generatedSetterHelperImpl(tr, TR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "tr" element
     */
    public uk.nhs.connect.npfit.presentationtext.TrDocument.Tr addNewTr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TrDocument.Tr target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().add_element_user(TR$0);
            return target;
        }
    }
    /**
     * An XML tr(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class TrImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TrDocument.Tr
    {
        private static final long serialVersionUID = 1L;
        
        public TrImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TH$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "th");
        private static final javax.xml.namespace.QName TD$2 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "td");
        private static final javax.xml.namespace.QName ID$4 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$6 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets array of all "th" elements
         */
        public uk.nhs.connect.npfit.presentationtext.ThDocument.Th[] getThArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TH$0, targetList);
                uk.nhs.connect.npfit.presentationtext.ThDocument.Th[] result = new uk.nhs.connect.npfit.presentationtext.ThDocument.Th[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "th" element
         */
        public uk.nhs.connect.npfit.presentationtext.ThDocument.Th getThArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ThDocument.Th target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ThDocument.Th)get_store().find_element_user(TH$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "th" element
         */
        public int sizeOfThArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TH$0);
            }
        }
        
        /**
         * Sets array of all "th" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setThArray(uk.nhs.connect.npfit.presentationtext.ThDocument.Th[] thArray)
        {
            check_orphaned();
            arraySetterHelper(thArray, TH$0);
        }
        
        /**
         * Sets ith "th" element
         */
        public void setThArray(int i, uk.nhs.connect.npfit.presentationtext.ThDocument.Th th)
        {
            generatedSetterHelperImpl(th, TH$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "th" element
         */
        public uk.nhs.connect.npfit.presentationtext.ThDocument.Th insertNewTh(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ThDocument.Th target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ThDocument.Th)get_store().insert_element_user(TH$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "th" element
         */
        public uk.nhs.connect.npfit.presentationtext.ThDocument.Th addNewTh()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ThDocument.Th target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ThDocument.Th)get_store().add_element_user(TH$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "th" element
         */
        public void removeTh(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TH$0, i);
            }
        }
        
        /**
         * Gets array of all "td" elements
         */
        public uk.nhs.connect.npfit.presentationtext.TdDocument.Td[] getTdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TD$2, targetList);
                uk.nhs.connect.npfit.presentationtext.TdDocument.Td[] result = new uk.nhs.connect.npfit.presentationtext.TdDocument.Td[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "td" element
         */
        public uk.nhs.connect.npfit.presentationtext.TdDocument.Td getTdArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TdDocument.Td target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TdDocument.Td)get_store().find_element_user(TD$2, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "td" element
         */
        public int sizeOfTdArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TD$2);
            }
        }
        
        /**
         * Sets array of all "td" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTdArray(uk.nhs.connect.npfit.presentationtext.TdDocument.Td[] tdArray)
        {
            check_orphaned();
            arraySetterHelper(tdArray, TD$2);
        }
        
        /**
         * Sets ith "td" element
         */
        public void setTdArray(int i, uk.nhs.connect.npfit.presentationtext.TdDocument.Td td)
        {
            generatedSetterHelperImpl(td, TD$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "td" element
         */
        public uk.nhs.connect.npfit.presentationtext.TdDocument.Td insertNewTd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TdDocument.Td target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TdDocument.Td)get_store().insert_element_user(TD$2, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "td" element
         */
        public uk.nhs.connect.npfit.presentationtext.TdDocument.Td addNewTd()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.TdDocument.Td target = null;
                target = (uk.nhs.connect.npfit.presentationtext.TdDocument.Td)get_store().add_element_user(TD$2);
                return target;
            }
        }
        
        /**
         * Removes the ith "td" element
         */
        public void removeTd(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TD$2, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$4);
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
                return get_store().find_attribute_user(ID$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ID$4);
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
                get_store().remove_attribute(ID$4);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$6);
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
                return get_store().find_attribute_user(CLASS1$6) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$6);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CLASS1$6);
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
                get_store().remove_attribute(CLASS1$6);
            }
        }
    }
}
