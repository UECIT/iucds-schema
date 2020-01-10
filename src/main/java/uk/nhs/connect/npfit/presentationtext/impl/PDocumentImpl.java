/*
 * An XML document type.
 * Localname: p
 * Namespace: xhtml:NPfIT:PresentationText
 * Java type: uk.nhs.connect.npfit.presentationtext.PDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.presentationtext.impl;
/**
 * A document containing one p(@xhtml:NPfIT:PresentationText) element.
 *
 * This is a complex type.
 */
public class PDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.PDocument
{
    private static final long serialVersionUID = 1L;
    
    public PDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName P$0 = 
        new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "p");
    
    
    /**
     * Gets the "p" element
     */
    public uk.nhs.connect.npfit.presentationtext.PDocument.P getP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PDocument.P target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().find_element_user(P$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "p" element
     */
    public void setP(uk.nhs.connect.npfit.presentationtext.PDocument.P p)
    {
        generatedSetterHelperImpl(p, P$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "p" element
     */
    public uk.nhs.connect.npfit.presentationtext.PDocument.P addNewP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.presentationtext.PDocument.P target = null;
            target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().add_element_user(P$0);
            return target;
        }
    }
    /**
     * An XML p(@xhtml:NPfIT:PresentationText).
     *
     * This is a complex type.
     */
    public static class PImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.presentationtext.PDocument.P
    {
        private static final long serialVersionUID = 1L;
        
        public PImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName P$0 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "p");
        private static final javax.xml.namespace.QName OL$2 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "ol");
        private static final javax.xml.namespace.QName UL$4 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "ul");
        private static final javax.xml.namespace.QName TABLE$6 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "table");
        private static final javax.xml.namespace.QName A$8 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "a");
        private static final javax.xml.namespace.QName PRE$10 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "pre");
        private static final javax.xml.namespace.QName BR$12 = 
            new javax.xml.namespace.QName("xhtml:NPfIT:PresentationText", "br");
        private static final javax.xml.namespace.QName ID$14 = 
            new javax.xml.namespace.QName("", "id");
        private static final javax.xml.namespace.QName CLASS1$16 = 
            new javax.xml.namespace.QName("", "class");
        
        
        /**
         * Gets array of all "p" elements
         */
        public uk.nhs.connect.npfit.presentationtext.PDocument.P[] getPArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(P$0, targetList);
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
                target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().find_element_user(P$0, i);
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
                return get_store().count_elements(P$0);
            }
        }
        
        /**
         * Sets array of all "p" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPArray(uk.nhs.connect.npfit.presentationtext.PDocument.P[] pArray)
        {
            check_orphaned();
            arraySetterHelper(pArray, P$0);
        }
        
        /**
         * Sets ith "p" element
         */
        public void setPArray(int i, uk.nhs.connect.npfit.presentationtext.PDocument.P p)
        {
            generatedSetterHelperImpl(p, P$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().insert_element_user(P$0, i);
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
                target = (uk.nhs.connect.npfit.presentationtext.PDocument.P)get_store().add_element_user(P$0);
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
                get_store().remove_element(P$0, i);
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
         * Gets array of all "table" elements
         */
        public uk.nhs.connect.npfit.presentationtext.TableDocument.Table[] getTableArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TABLE$6, targetList);
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
                target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().find_element_user(TABLE$6, i);
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
                return get_store().count_elements(TABLE$6);
            }
        }
        
        /**
         * Sets array of all "table" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setTableArray(uk.nhs.connect.npfit.presentationtext.TableDocument.Table[] tableArray)
        {
            check_orphaned();
            arraySetterHelper(tableArray, TABLE$6);
        }
        
        /**
         * Sets ith "table" element
         */
        public void setTableArray(int i, uk.nhs.connect.npfit.presentationtext.TableDocument.Table table)
        {
            generatedSetterHelperImpl(table, TABLE$6, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().insert_element_user(TABLE$6, i);
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
                target = (uk.nhs.connect.npfit.presentationtext.TableDocument.Table)get_store().add_element_user(TABLE$6);
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
                get_store().remove_element(TABLE$6, i);
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
                get_store().find_all_element_users(A$8, targetList);
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
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().find_element_user(A$8, i);
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
                return get_store().count_elements(A$8);
            }
        }
        
        /**
         * Sets array of all "a" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setAArray(uk.nhs.connect.npfit.presentationtext.ADocument.A[] aArray)
        {
            check_orphaned();
            arraySetterHelper(aArray, A$8);
        }
        
        /**
         * Sets ith "a" element
         */
        public void setAArray(int i, uk.nhs.connect.npfit.presentationtext.ADocument.A a)
        {
            generatedSetterHelperImpl(a, A$8, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().insert_element_user(A$8, i);
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
                target = (uk.nhs.connect.npfit.presentationtext.ADocument.A)get_store().add_element_user(A$8);
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
                get_store().remove_element(A$8, i);
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
                get_store().find_all_element_users(PRE$10, targetList);
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
                target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().find_element_user(PRE$10, i);
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
                return get_store().count_elements(PRE$10);
            }
        }
        
        /**
         * Sets array of all "pre" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setPreArray(uk.nhs.connect.npfit.presentationtext.PreDocument.Pre[] preArray)
        {
            check_orphaned();
            arraySetterHelper(preArray, PRE$10);
        }
        
        /**
         * Sets ith "pre" element
         */
        public void setPreArray(int i, uk.nhs.connect.npfit.presentationtext.PreDocument.Pre pre)
        {
            generatedSetterHelperImpl(pre, PRE$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().insert_element_user(PRE$10, i);
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
                target = (uk.nhs.connect.npfit.presentationtext.PreDocument.Pre)get_store().add_element_user(PRE$10);
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
                get_store().remove_element(PRE$10, i);
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
                get_store().find_all_element_users(BR$12, targetList);
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
                target = (uk.nhs.connect.npfit.presentationtext.BrType)get_store().find_element_user(BR$12, i);
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
                return get_store().count_elements(BR$12);
            }
        }
        
        /**
         * Sets array of all "br" element  WARNING: This method is not atomicaly synchronized.
         */
        public void setBrArray(uk.nhs.connect.npfit.presentationtext.BrType[] brArray)
        {
            check_orphaned();
            arraySetterHelper(brArray, BR$12);
        }
        
        /**
         * Sets ith "br" element
         */
        public void setBrArray(int i, uk.nhs.connect.npfit.presentationtext.BrType br)
        {
            generatedSetterHelperImpl(br, BR$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
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
                target = (uk.nhs.connect.npfit.presentationtext.BrType)get_store().insert_element_user(BR$12, i);
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
                target = (uk.nhs.connect.npfit.presentationtext.BrType)get_store().add_element_user(BR$12);
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
                get_store().remove_element(BR$12, i);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$14);
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
                return get_store().find_attribute_user(ID$14) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$14);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(ID$14);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(ID$14);
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
                get_store().remove_attribute(ID$14);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$16);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$16);
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
                return get_store().find_attribute_user(CLASS1$16) != null;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CLASS1$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CLASS1$16);
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
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(CLASS1$16);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(CLASS1$16);
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
                get_store().remove_attribute(CLASS1$16);
            }
        }
    }
}
