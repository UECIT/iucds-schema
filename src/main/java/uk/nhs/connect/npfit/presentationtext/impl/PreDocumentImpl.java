/*
 * An XML document type.
 * Localname: pre
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.PreDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one pre(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class PreDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.PreDocument
{
    private static final long serialVersionUID = 1L;
    
    public PreDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRE$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "pre");
    
    
    /**
     * Gets the "pre" element
     */
    public uk.nhs.connect.npfit.presentationtext.PreDocument.Pre getPre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PreDocument.Pre target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().find_element_user(PRE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "pre" element
     */
    public void setPre(uk.nhs.connect.npfit.presentationtext.PreDocument.Pre pre)
    {
        generatedSetterHelperImpl(pre, PRE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "pre" element
     */
    public uk.nhs.connect.npfit.presentationtext.PreDocument.Pre addNewPre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PreDocument.Pre target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().add_element_user(PRE$0);
            return target;
        }
    }
    /**
     * An XML pre(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class PreImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.PreDocument.Pre
    {
        private static final long serialVersionUID = 1L;
        
        public PreImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$2 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets the "id" attribute
         */
        public java.lang.String getId()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$0);
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
                return get_store().find_attribute_user(ID$0) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$0);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ID$0);
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
                get_store().remove_attribute(ID$0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$2);
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
                return get_store().find_attribute_user(CLASS1$2) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$2);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CLASS1$2);
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
                get_store().remove_attribute(CLASS1$2);
            }
        }
    }
}
