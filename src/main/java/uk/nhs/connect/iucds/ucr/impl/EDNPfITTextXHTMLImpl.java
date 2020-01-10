/*
 * XML Type:  ED.NPfIT.Text.XHTML
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ED.NPfIT.Text.XHTML(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class EDNPfITTextXHTMLImpl extends uk.nhs.connect.iucds.ucr.impl.EDImpl implements uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML
{
    private static final long serialVersionUID = 1L;
    
    public EDNPfITTextXHTMLImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HTML$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "html");
    
    
    /**
     * Gets the "html" element
     */
    public uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html getHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html target = null;
            target = (uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html)get_store().find_element_user(HTML$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "html" element
     */
    public boolean isSetHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HTML$0) != 0;
        }
    }
    
    /**
     * Sets the "html" element
     */
    public void setHtml(uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html html)
    {
        generatedSetterHelperImpl(html, HTML$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "html" element
     */
    public uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html addNewHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html target = null;
            target = (uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html)get_store().add_element_user(HTML$0);
            return target;
        }
    }
    
    /**
     * Unsets the "html" element
     */
    public void unsetHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HTML$0, 0);
        }
    }
    /**
     * An XML html(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class HtmlImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.iucds.ucr.EDNPfITTextXHTML.Html
    {
        private static final long serialVersionUID = 1L;
        
        public HtmlImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName HEAD$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "head");
        private static final javax.xml.namespace.QName BODY$2 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "body");
        
        
        /**
         * Gets the "head" element
         */
        public uk.nhs.connect.npfit.presentationtext.HeadType getHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.HeadType target = null;
                target = (uk.nhs.connect.npfit.presentationtext.HeadType)get_store().find_element_user(HEAD$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "head" element
         */
        public boolean isSetHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(HEAD$0) != 0;
            }
        }
        
        /**
         * Sets the "head" element
         */
        public void setHead(uk.nhs.connect.npfit.presentationtext.HeadType head)
        {
            generatedSetterHelperImpl(head, HEAD$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "head" element
         */
        public uk.nhs.connect.npfit.presentationtext.HeadType addNewHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.HeadType target = null;
                target = (uk.nhs.connect.npfit.presentationtext.HeadType)get_store().add_element_user(HEAD$0);
                return target;
            }
        }
        
        /**
         * Unsets the "head" element
         */
        public void unsetHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(HEAD$0, 0);
            }
        }
        
        /**
         * Gets the "body" element
         */
        public uk.nhs.connect.npfit.presentationtext.BodyType getBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.BodyType target = null;
                target = (uk.nhs.connect.npfit.presentationtext.BodyType)get_store().find_element_user(BODY$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "body" element
         */
        public boolean isSetBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(BODY$2) != 0;
            }
        }
        
        /**
         * Sets the "body" element
         */
        public void setBody(uk.nhs.connect.npfit.presentationtext.BodyType body)
        {
            generatedSetterHelperImpl(body, BODY$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
        }
        
        /**
         * Appends and returns a new empty "body" element
         */
        public uk.nhs.connect.npfit.presentationtext.BodyType addNewBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                uk.nhs.connect.npfit.presentationtext.BodyType target = null;
                target = (uk.nhs.connect.npfit.presentationtext.BodyType)get_store().add_element_user(BODY$2);
                return target;
            }
        }
        
        /**
         * Unsets the "body" element
         */
        public void unsetBody()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(BODY$2, 0);
            }
        }
    }
}
