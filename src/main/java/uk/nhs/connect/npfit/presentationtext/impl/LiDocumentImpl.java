/*
 * An XML document type.
 * Localname: li
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.LiDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one li(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class LiDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.LiDocument
{
    private static final long serialVersionUID = 1L;
    
    public LiDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LI$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "li");
    
    
    /**
     * Gets the "li" element
     */
    public uk.nhs.connect.npfit.presentationtext.LiDocument.Li getLi()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.LiDocument.Li target = null;
            target = (uk.nhs.connect.npfit.presentationtext.LiDocument.Li)get_store().find_element_user(LI$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "li" element
     */
    public void setLi(uk.nhs.connect.npfit.presentationtext.LiDocument.Li li)
    {
        generatedSetterHelperImpl(li, LI$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "li" element
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
     * An XML li(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class LiImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.LiDocument.Li
    {
        private static final long serialVersionUID = 1L;
        
        public LiImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName A$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "a");
        private static final javax.xml.namespace.QName ID$2 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$4 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets the "a" element
         */
        public uk.nhs.connect.npfit.presentationtext.ADocument.A getA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ADocument.A target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().find_element_user(A$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "a" element
         */
        public boolean isSetA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(A$0) != 0;
            }
        }
        
        /**
         * Sets the "a" element
         */
        public void setA(uk.nhs.connect.npfit.presentationtext.ADocument.A a)
        {
            generatedSetterHelperImpl(a, A$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "a" element
         */
        public uk.nhs.connect.npfit.presentationtext.ADocument.A addNewA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.ADocument.A target = null;
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().add_element_user(A$0);
                return target;
            }
        }
        
        /**
         * Unsets the "a" element
         */
        public void unsetA()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(A$0, 0);
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
