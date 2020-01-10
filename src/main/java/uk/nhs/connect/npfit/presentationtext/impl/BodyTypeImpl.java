/*
 * XML Type:  bodyType
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.BodyType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * An XML bodyType(@xhtml:NPfIT:PresentationText).
 *
 * This is a complex type.
 */
public class BodyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.BodyType
{
    private static final long serialVersionUID = 1L;
    
    public BodyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName H2$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "h2");
    private static final javax.xml.namespace.QName H3$2 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "h3");
    private static final javax.xml.namespace.QName H4$4 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "h4");
    private static final javax.xml.namespace.QName H5$6 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "h5");
    private static final javax.xml.namespace.QName H6$8 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "h6");
    private static final javax.xml.namespace.QName P$10 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "p");
    private static final javax.xml.namespace.QName OL$12 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "ol");
    private static final javax.xml.namespace.QName UL$14 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "ul");
    private static final javax.xml.namespace.QName TABLE$16 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "table");
    private static final javax.xml.namespace.QName A$18 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "a");
    private static final javax.xml.namespace.QName PRE$20 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "pre");
    private static final javax.xml.namespace.QName BR$22 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "br");
    
    
    /**
     * Gets array of all "h2" elements
     */
    public uk.nhs.connect.npfit.presentationtext.H2Document.H2[] getH2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(H2$0, targetList);
            uk.nhs.connect.npfit.presentationtext.H2Document.H2[] result = new uk.nhs.connect.npfit.presentationtext.H2Document.H2[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "h2" element
     */
    public uk.nhs.connect.npfit.presentationtext.H2Document.H2 getH2Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H2Document.H2 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H2Document.H2)get_store().find_element_user(H2$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "h2" element
     */
    public int sizeOfH2Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(H2$0);
        }
    }
    
    /**
     * Sets array of all "h2" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setH2Array(uk.nhs.connect.npfit.presentationtext.H2Document.H2[] h2Array)
    {
        check_orphaned();
        arraySetterHelper(h2Array, H2$0);
    }
    
    /**
     * Sets ith "h2" element
     */
    public void setH2Array(int i, uk.nhs.connect.npfit.presentationtext.H2Document.H2 h2)
    {
        generatedSetterHelperImpl(h2, H2$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "h2" element
     */
    public uk.nhs.connect.npfit.presentationtext.H2Document.H2 insertNewH2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H2Document.H2 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H2Document.H2)get_store().insert_element_user(H2$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "h2" element
     */
    public uk.nhs.connect.npfit.presentationtext.H2Document.H2 addNewH2()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H2Document.H2 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H2Document.H2)get_store().add_element_user(H2$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "h2" element
     */
    public void removeH2(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(H2$0, i);
        }
    }
    
    /**
     * Gets array of all "h3" elements
     */
    public uk.nhs.connect.npfit.presentationtext.H3Document.H3[] getH3Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(H3$2, targetList);
            uk.nhs.connect.npfit.presentationtext.H3Document.H3[] result = new uk.nhs.connect.npfit.presentationtext.H3Document.H3[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "h3" element
     */
    public uk.nhs.connect.npfit.presentationtext.H3Document.H3 getH3Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H3Document.H3 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H3Document.H3)get_store().find_element_user(H3$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "h3" element
     */
    public int sizeOfH3Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(H3$2);
        }
    }
    
    /**
     * Sets array of all "h3" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setH3Array(uk.nhs.connect.npfit.presentationtext.H3Document.H3[] h3Array)
    {
        check_orphaned();
        arraySetterHelper(h3Array, H3$2);
    }
    
    /**
     * Sets ith "h3" element
     */
    public void setH3Array(int i, uk.nhs.connect.npfit.presentationtext.H3Document.H3 h3)
    {
        generatedSetterHelperImpl(h3, H3$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "h3" element
     */
    public uk.nhs.connect.npfit.presentationtext.H3Document.H3 insertNewH3(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H3Document.H3 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H3Document.H3)get_store().insert_element_user(H3$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "h3" element
     */
    public uk.nhs.connect.npfit.presentationtext.H3Document.H3 addNewH3()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H3Document.H3 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H3Document.H3)get_store().add_element_user(H3$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "h3" element
     */
    public void removeH3(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(H3$2, i);
        }
    }
    
    /**
     * Gets array of all "h4" elements
     */
    public uk.nhs.connect.npfit.presentationtext.H4Document.H4[] getH4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(H4$4, targetList);
            uk.nhs.connect.npfit.presentationtext.H4Document.H4[] result = new uk.nhs.connect.npfit.presentationtext.H4Document.H4[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "h4" element
     */
    public uk.nhs.connect.npfit.presentationtext.H4Document.H4 getH4Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H4Document.H4 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H4Document.H4)get_store().find_element_user(H4$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "h4" element
     */
    public int sizeOfH4Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(H4$4);
        }
    }
    
    /**
     * Sets array of all "h4" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setH4Array(uk.nhs.connect.npfit.presentationtext.H4Document.H4[] h4Array)
    {
        check_orphaned();
        arraySetterHelper(h4Array, H4$4);
    }
    
    /**
     * Sets ith "h4" element
     */
    public void setH4Array(int i, uk.nhs.connect.npfit.presentationtext.H4Document.H4 h4)
    {
        generatedSetterHelperImpl(h4, H4$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "h4" element
     */
    public uk.nhs.connect.npfit.presentationtext.H4Document.H4 insertNewH4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H4Document.H4 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H4Document.H4)get_store().insert_element_user(H4$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "h4" element
     */
    public uk.nhs.connect.npfit.presentationtext.H4Document.H4 addNewH4()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H4Document.H4 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H4Document.H4)get_store().add_element_user(H4$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "h4" element
     */
    public void removeH4(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(H4$4, i);
        }
    }
    
    /**
     * Gets array of all "h5" elements
     */
    public uk.nhs.connect.npfit.presentationtext.H5Document.H5[] getH5Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(H5$6, targetList);
            uk.nhs.connect.npfit.presentationtext.H5Document.H5[] result = new uk.nhs.connect.npfit.presentationtext.H5Document.H5[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "h5" element
     */
    public uk.nhs.connect.npfit.presentationtext.H5Document.H5 getH5Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H5Document.H5 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H5Document.H5)get_store().find_element_user(H5$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "h5" element
     */
    public int sizeOfH5Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(H5$6);
        }
    }
    
    /**
     * Sets array of all "h5" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setH5Array(uk.nhs.connect.npfit.presentationtext.H5Document.H5[] h5Array)
    {
        check_orphaned();
        arraySetterHelper(h5Array, H5$6);
    }
    
    /**
     * Sets ith "h5" element
     */
    public void setH5Array(int i, uk.nhs.connect.npfit.presentationtext.H5Document.H5 h5)
    {
        generatedSetterHelperImpl(h5, H5$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "h5" element
     */
    public uk.nhs.connect.npfit.presentationtext.H5Document.H5 insertNewH5(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H5Document.H5 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H5Document.H5)get_store().insert_element_user(H5$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "h5" element
     */
    public uk.nhs.connect.npfit.presentationtext.H5Document.H5 addNewH5()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H5Document.H5 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H5Document.H5)get_store().add_element_user(H5$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "h5" element
     */
    public void removeH5(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(H5$6, i);
        }
    }
    
    /**
     * Gets array of all "h6" elements
     */
    public uk.nhs.connect.npfit.presentationtext.H6Document.H6[] getH6Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(H6$8, targetList);
            uk.nhs.connect.npfit.presentationtext.H6Document.H6[] result = new uk.nhs.connect.npfit.presentationtext.H6Document.H6[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "h6" element
     */
    public uk.nhs.connect.npfit.presentationtext.H6Document.H6 getH6Array(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H6Document.H6 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H6Document.H6)get_store().find_element_user(H6$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "h6" element
     */
    public int sizeOfH6Array()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(H6$8);
        }
    }
    
    /**
     * Sets array of all "h6" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setH6Array(uk.nhs.connect.npfit.presentationtext.H6Document.H6[] h6Array)
    {
        check_orphaned();
        arraySetterHelper(h6Array, H6$8);
    }
    
    /**
     * Sets ith "h6" element
     */
    public void setH6Array(int i, uk.nhs.connect.npfit.presentationtext.H6Document.H6 h6)
    {
        generatedSetterHelperImpl(h6, H6$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "h6" element
     */
    public uk.nhs.connect.npfit.presentationtext.H6Document.H6 insertNewH6(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H6Document.H6 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H6Document.H6)get_store().insert_element_user(H6$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "h6" element
     */
    public uk.nhs.connect.npfit.presentationtext.H6Document.H6 addNewH6()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.H6Document.H6 target = null;
            target = (uk.nhs.connect.npfit.presentationtext.H6Document.H6)get_store().add_element_user(H6$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "h6" element
     */
    public void removeH6(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(H6$8, i);
        }
    }
    
    /**
     * Gets array of all "p" elements
     */
    public uk.nhs.connect.npfit.presentationtext.PDocument.P[] getPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(P$10, targetList);
            uk.nhs.connect.npfit.presentationtext.PDocument.P[] result = new uk.nhs.connect.npfit.presentationtext.PDocument.P[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "p" element
     */
    public uk.nhs.connect.npfit.presentationtext.PDocument.P getPArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PDocument.P target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().find_element_user(P$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "p" element
     */
    public int sizeOfPArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(P$10);
        }
    }
    
    /**
     * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPArray(uk.nhs.connect.npfit.presentationtext.PDocument.P[] pArray)
    {
        check_orphaned();
        arraySetterHelper(pArray, P$10);
    }
    
    /**
     * Sets ith "p" element
     */
    public void setPArray(int i, uk.nhs.connect.npfit.presentationtext.PDocument.P p)
    {
        generatedSetterHelperImpl(p, P$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "p" element
     */
    public uk.nhs.connect.npfit.presentationtext.PDocument.P insertNewP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PDocument.P target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().insert_element_user(P$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "p" element
     */
    public uk.nhs.connect.npfit.presentationtext.PDocument.P addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PDocument.P target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().add_element_user(P$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "p" element
     */
    public void removeP(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(P$10, i);
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
            get_store().find_all_element_users(OL$12, targetList);
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
            target = (uk.nhs.connect.npfit.presentationtext.OlDocument.Ol)get_store().find_element_user(OL$12, i);
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
            return get_store().count_elements(OL$12);
        }
    }
    
    /**
     * Sets array of all "ol" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setOlArray(uk.nhs.connect.npfit.presentationtext.OlDocument.Ol[] olArray)
    {
        check_orphaned();
        arraySetterHelper(olArray, OL$12);
    }
    
    /**
     * Sets ith "ol" element
     */
    public void setOlArray(int i, uk.nhs.connect.npfit.presentationtext.OlDocument.Ol ol)
    {
        generatedSetterHelperImpl(ol, OL$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.npfit.presentationtext.OlDocument.Ol)get_store().insert_element_user(OL$12, i);
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
            target = (uk.nhs.connect.npfit.presentationtext.OlDocument.Ol)get_store().add_element_user(OL$12);
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
            get_store().remove_element(OL$12, i);
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
            get_store().find_all_element_users(UL$14, targetList);
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
            target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().find_element_user(UL$14, i);
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
            return get_store().count_elements(UL$14);
        }
    }
    
    /**
     * Sets array of all "ul" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setUlArray(uk.nhs.connect.npfit.presentationtext.UlDocument.Ul[] ulArray)
    {
        check_orphaned();
        arraySetterHelper(ulArray, UL$14);
    }
    
    /**
     * Sets ith "ul" element
     */
    public void setUlArray(int i, uk.nhs.connect.npfit.presentationtext.UlDocument.Ul ul)
    {
        generatedSetterHelperImpl(ul, UL$14, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().insert_element_user(UL$14, i);
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
            target = (uk.nhs.connect.npfit.presentationtext.UlDocument.Ul)get_store().add_element_user(UL$14);
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
            get_store().remove_element(UL$14, i);
        }
    }
    
    /**
     * Gets array of all "table" elements
     */
    public uk.nhs.connect.npfit.presentationtext.TableDocument.Table[] getTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TABLE$16, targetList);
            uk.nhs.connect.npfit.presentationtext.TableDocument.Table[] result = new uk.nhs.connect.npfit.presentationtext.TableDocument.Table[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "table" element
     */
    public uk.nhs.connect.npfit.presentationtext.TableDocument.Table getTableArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TableDocument.Table target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().find_element_user(TABLE$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "table" element
     */
    public int sizeOfTableArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TABLE$16);
        }
    }
    
    /**
     * Sets array of all "table" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setTableArray(uk.nhs.connect.npfit.presentationtext.TableDocument.Table[] tableArray)
    {
        check_orphaned();
        arraySetterHelper(tableArray, TABLE$16);
    }
    
    /**
     * Sets ith "table" element
     */
    public void setTableArray(int i, uk.nhs.connect.npfit.presentationtext.TableDocument.Table table)
    {
        generatedSetterHelperImpl(table, TABLE$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "table" element
     */
    public uk.nhs.connect.npfit.presentationtext.TableDocument.Table insertNewTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TableDocument.Table target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().insert_element_user(TABLE$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "table" element
     */
    public uk.nhs.connect.npfit.presentationtext.TableDocument.Table addNewTable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.TableDocument.Table target = null;
            target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().add_element_user(TABLE$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "table" element
     */
    public void removeTable(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TABLE$16, i);
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
            get_store().find_all_element_users(A$18, targetList);
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
            target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().find_element_user(A$18, i);
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
            return get_store().count_elements(A$18);
        }
    }
    
    /**
     * Sets array of all "a" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAArray(uk.nhs.connect.npfit.presentationtext.ADocument.A[] aArray)
    {
        check_orphaned();
        arraySetterHelper(aArray, A$18);
    }
    
    /**
     * Sets ith "a" element
     */
    public void setAArray(int i, uk.nhs.connect.npfit.presentationtext.ADocument.A a)
    {
        generatedSetterHelperImpl(a, A$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
            target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().insert_element_user(A$18, i);
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
            target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().add_element_user(A$18);
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
            get_store().remove_element(A$18, i);
        }
    }
    
    /**
     * Gets array of all "pre" elements
     */
    public uk.nhs.connect.npfit.presentationtext.PreDocument.Pre[] getPreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRE$20, targetList);
            uk.nhs.connect.npfit.presentationtext.PreDocument.Pre[] result = new uk.nhs.connect.npfit.presentationtext.PreDocument.Pre[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "pre" element
     */
    public uk.nhs.connect.npfit.presentationtext.PreDocument.Pre getPreArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PreDocument.Pre target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().find_element_user(PRE$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "pre" element
     */
    public int sizeOfPreArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRE$20);
        }
    }
    
    /**
     * Sets array of all "pre" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPreArray(uk.nhs.connect.npfit.presentationtext.PreDocument.Pre[] preArray)
    {
        check_orphaned();
        arraySetterHelper(preArray, PRE$20);
    }
    
    /**
     * Sets ith "pre" element
     */
    public void setPreArray(int i, uk.nhs.connect.npfit.presentationtext.PreDocument.Pre pre)
    {
        generatedSetterHelperImpl(pre, PRE$20, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "pre" element
     */
    public uk.nhs.connect.npfit.presentationtext.PreDocument.Pre insertNewPre(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PreDocument.Pre target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().insert_element_user(PRE$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "pre" element
     */
    public uk.nhs.connect.npfit.presentationtext.PreDocument.Pre addNewPre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PreDocument.Pre target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().add_element_user(PRE$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "pre" element
     */
    public void removePre(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRE$20, i);
        }
    }
    
    /**
     * Gets array of all "br" elements
     */
    public uk.nhs.connect.npfit.presentationtext.BrType[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$22, targetList);
            uk.nhs.connect.npfit.presentationtext.BrType[] result = new uk.nhs.connect.npfit.presentationtext.BrType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "br" element
     */
    public uk.nhs.connect.npfit.presentationtext.BrType getBrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.BrType target = null;
            target = (uk.nhs.connect.npfit.presentationtext.BrType)get_store().find_element_user(BR$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "br" element
     */
    public int sizeOfBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BR$22);
        }
    }
    
    /**
     * Sets array of all "br" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setBrArray(uk.nhs.connect.npfit.presentationtext.BrType[] brArray)
    {
        check_orphaned();
        arraySetterHelper(brArray, BR$22);
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, uk.nhs.connect.npfit.presentationtext.BrType br)
    {
        generatedSetterHelperImpl(br, BR$22, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    public uk.nhs.connect.npfit.presentationtext.BrType insertNewBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.BrType target = null;
            target = (uk.nhs.connect.npfit.presentationtext.BrType)get_store().insert_element_user(BR$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    public uk.nhs.connect.npfit.presentationtext.BrType addNewBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.BrType target = null;
            target = (uk.nhs.connect.npfit.presentationtext.BrType)get_store().add_element_user(BR$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "br" element
     */
    public void removeBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BR$22, i);
        }
    }
}
