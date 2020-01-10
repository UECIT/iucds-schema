/*
 * An XML document type.
 * Localname: a
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.ADocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one a(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class ADocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.ADocument
{
    private static final long serialVersionUID = 1L;
    
    public ADocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName A$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "a");
    
    
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
     * An XML a(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class AImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.ADocument.A
    {
        private static final long serialVersionUID = 1L;
        
        public AImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ID$0 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName HREF$2 = 
            new javax.xml.namespace.QName("", "href");
        private static final javax.xml.namespace.QName IIREF$4 = 
            new javax.xml.namespace.QName("", "iiref");
        private static final javax.xml.namespace.QName CLASS1$6 = 
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
         * Gets the "href" attribute
         */
        public java.lang.String getHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "href" attribute
         */
        public uk.nhs.connect.npfit.presentationtext.LocalURI xgetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.LocalURI target = null;
                target = (uk.nhs.connect.npfit.presentationtext.LocalURI)get_store().find_attribute_user(HREF$2);
                return target;
            }
        }
        
        /**
         * True if has "href" attribute
         */
        public boolean isSetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(HREF$2) != null;
            }
        }
        
        /**
         * Sets the "href" attribute
         */
        public void setHref(java.lang.String href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HREF$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HREF$2);
                }
                target.setStringValue(href);
            }
        }
        
        /**
         * Sets (as xml) the "href" attribute
         */
        public void xsetHref(uk.nhs.connect.npfit.presentationtext.LocalURI href)
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.LocalURI target = null;
                target = (uk.nhs.connect.npfit.presentationtext.LocalURI)get_store().find_attribute_user(HREF$2);
                if (target == null)
                {
                    target = (uk.nhs.connect.npfit.presentationtext.LocalURI)get_store().add_attribute_user(HREF$2);
                }
                target.set(href);
            }
        }
        
        /**
         * Unsets the "href" attribute
         */
        public void unsetHref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(HREF$2);
            }
        }
        
        /**
         * Gets the "iiref" attribute
         */
        public java.lang.String getIiref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IIREF$4);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "iiref" attribute
         */
        public org.apache.xmlbeans.XmlNMTOKEN xgetIiref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(IIREF$4);
                return target;
            }
        }
        
        /**
         * True if has "iiref" attribute
         */
        public boolean isSetIiref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(IIREF$4) != null;
            }
        }
        
        /**
         * Sets the "iiref" attribute
         */
        public void setIiref(java.lang.String iiref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(IIREF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(IIREF$4);
                }
                target.setStringValue(iiref);
            }
        }
        
        /**
         * Sets (as xml) the "iiref" attribute
         */
        public void xsetIiref(org.apache.xmlbeans.XmlNMTOKEN iiref)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlNMTOKEN target = null;
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(IIREF$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(IIREF$4);
                }
                target.set(iiref);
            }
        }
        
        /**
         * Unsets the "iiref" attribute
         */
        public void unsetIiref()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(IIREF$4);
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
