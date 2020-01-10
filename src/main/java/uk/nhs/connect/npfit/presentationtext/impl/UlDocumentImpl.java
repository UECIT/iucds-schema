/*
 * An XML document type.
 * Localname: ul
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.UlDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one ul(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class UlDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.UlDocument
{
    private static final long serialVersionUID = 1L;
    
    public UlDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UL$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "ul");
    
    
    /**
     * Gets the "ul" element
     */
    public uk.nhs.connect.npfit.presentationtext.UlDocument.Ul getUl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.UlDocument.Ul target = null;
            target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().find_element_user(UL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ul" element
     */
    public void setUl(uk.nhs.connect.npfit.presentationtext.UlDocument.Ul ul)
    {
        generatedSetterHelperImpl(ul, UL$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ul" element
     */
    public uk.nhs.connect.npfit.presentationtext.UlDocument.Ul addNewUl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.UlDocument.Ul target = null;
            target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().add_element_user(UL$0);
            return target;
        }
    }
    /**
     * An XML ul(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class UlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.UlDocument.Ul
    {
        private static final long serialVersionUID = 1L;
        
        public UlImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName LI$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "li");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$4 = 
            new javax.xml.namespace.QName("", "class");
        
        
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
