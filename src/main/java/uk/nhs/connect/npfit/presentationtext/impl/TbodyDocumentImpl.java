/*
 * An XML document type.
 * Localname: tbody
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TbodyDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one tbody(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class TbodyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TbodyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TbodyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TBODY$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tbody");
    
    
    /**
     * Gets the "tbody" element
     */
    public uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody getTbody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody)get_store().find_element_user(TBODY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tbody" element
     */
    public void setTbody(uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody tbody)
    {
        generatedSetterHelperImpl(tbody, TBODY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "tbody" element
     */
    public uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody addNewTbody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody)get_store().add_element_user(TBODY$0);
            return target;
        }
    }
    /**
     * An XML tbody(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class TbodyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TbodyDocument.Tbody
    {
        private static final long serialVersionUID = 1L;
        
        public TbodyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TR$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tr");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$4 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets array of all "tr" elements
         */
        public uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[] getTrArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TR$0, targetList);
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
                target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().find_element_user(TR$0, i);
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
                return get_store().count_elements(TR$0);
            }
        }
        
        /**
         * Sets array of all "tr" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTrArray(uk.nhs.connect.npfit.presentationtext.TrDocument.Tr[] trArray)
        {
            check_orphaned();
            arraySetterHelper(trArray, TR$0);
        }
        
        /**
         * Sets ith "tr" element
         */
        public void setTrArray(int i, uk.nhs.connect.npfit.presentationtext.TrDocument.Tr tr)
        {
            generatedSetterHelperImpl(tr, TR$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().insert_element_user(TR$0, i);
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
                target = (uk.nhs.connect.npfit.presentationtext.TrDocument.Tr)get_store().add_element_user(TR$0);
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
                get_store().remove_element(TR$0, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$2);
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
                return get_store().find_attribute_user(ID$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ID$2);
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
                get_store().remove_attribute(ID$2);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$4);
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
                return get_store().find_attribute_user(CLASS1$4) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$4);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CLASS1$4);
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
                get_store().remove_attribute(CLASS1$4);
            }
        }
    }
}
