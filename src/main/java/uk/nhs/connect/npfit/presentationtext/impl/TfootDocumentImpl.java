/*
 * An XML document type.
 * Localname: tfoot
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.TfootDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one tfoot(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class TfootDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TfootDocument
{
    private static final long serialVersionUID = 1L;
    
    public TfootDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TFOOT$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tfoot");
    
    
    /**
     * Gets the "tfoot" element
     */
    public uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot getTfoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot)get_store().find_element_user(TFOOT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "tfoot" element
     */
    public void setTfoot(uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot tfoot)
    {
        generatedSetterHelperImpl(tfoot, TFOOT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot)get_store().add_element_user(TFOOT$0);
            return target;
        }
    }
    /**
     * An XML tfoot(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class TfootImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.TfootDocument.Tfoot
    {
        private static final long serialVersionUID = 1L;
        
        public TfootImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TR$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "tr");
        
        
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
    }
}
