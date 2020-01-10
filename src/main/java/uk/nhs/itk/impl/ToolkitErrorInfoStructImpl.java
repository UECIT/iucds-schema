/*
 * XML Type:  ToolkitErrorInfoStruct
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.ToolkitErrorInfoStruct
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.impl;
/**
 * An XML ToolkitErrorInfoStruct(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class ToolkitErrorInfoStructImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.ToolkitErrorInfoStruct
{
    private static final long serialVersionUID = 1L;
    
    public ToolkitErrorInfoStructImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ERRORID$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "ErrorID");
    private static final javax.xml.namespace.QName ERRORCODE$2 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "ErrorCode");
    private static final javax.xml.namespace.QName ERRORTEXT$4 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "ErrorText");
    private static final javax.xml.namespace.QName ERRORDIAGNOSTICTEXT$6 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "ErrorDiagnosticText");
    
    
    /**
     * Gets the "ErrorID" element
     */
    public java.lang.String getErrorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorID" element
     */
    public org.apache.xmlbeans.XmlAnyURI xgetErrorID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ERRORID$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ErrorID" element
     */
    public void setErrorID(java.lang.String errorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORID$0);
            }
            target.setStringValue(errorID);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorID" element
     */
    public void xsetErrorID(org.apache.xmlbeans.XmlAnyURI errorID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_element_user(ERRORID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_element_user(ERRORID$0);
            }
            target.set(errorID);
        }
    }
    
    /**
     * Gets the "ErrorCode" element
     */
    public uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode getErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode target = null;
            target = (uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode)get_store().find_element_user(ERRORCODE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ErrorCode" element
     */
    public void setErrorCode(uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode errorCode)
    {
        generatedSetterHelperImpl(errorCode, ERRORCODE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ErrorCode" element
     */
    public uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode addNewErrorCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode target = null;
            target = (uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode)get_store().add_element_user(ERRORCODE$2);
            return target;
        }
    }
    
    /**
     * Gets the "ErrorText" element
     */
    public java.lang.String getErrorText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORTEXT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorText" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORTEXT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ErrorText" element
     */
    public void setErrorText(java.lang.String errorText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORTEXT$4);
            }
            target.setStringValue(errorText);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorText" element
     */
    public void xsetErrorText(org.apache.xmlbeans.XmlString errorText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORTEXT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORTEXT$4);
            }
            target.set(errorText);
        }
    }
    
    /**
     * Gets the "ErrorDiagnosticText" element
     */
    public java.lang.String getErrorDiagnosticText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDIAGNOSTICTEXT$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ErrorDiagnosticText" element
     */
    public org.apache.xmlbeans.XmlString xgetErrorDiagnosticText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDIAGNOSTICTEXT$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ErrorDiagnosticText" element
     */
    public boolean isSetErrorDiagnosticText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ERRORDIAGNOSTICTEXT$6) != 0;
        }
    }
    
    /**
     * Sets the "ErrorDiagnosticText" element
     */
    public void setErrorDiagnosticText(java.lang.String errorDiagnosticText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ERRORDIAGNOSTICTEXT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ERRORDIAGNOSTICTEXT$6);
            }
            target.setStringValue(errorDiagnosticText);
        }
    }
    
    /**
     * Sets (as xml) the "ErrorDiagnosticText" element
     */
    public void xsetErrorDiagnosticText(org.apache.xmlbeans.XmlString errorDiagnosticText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ERRORDIAGNOSTICTEXT$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ERRORDIAGNOSTICTEXT$6);
            }
            target.set(errorDiagnosticText);
        }
    }
    
    /**
     * Unsets the "ErrorDiagnosticText" element
     */
    public void unsetErrorDiagnosticText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ERRORDIAGNOSTICTEXT$6, 0);
        }
    }
    /**
     * An XML ErrorCode(@urn:nhs-itk:ns:201005).
     *
     * This is an atomic type that is a restriction of uk.nhs.itk.ToolkitErrorInfoStruct$ErrorCode.
     */
    public static class ErrorCodeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements uk.nhs.itk.ToolkitErrorInfoStruct.ErrorCode
    {
        private static final long serialVersionUID = 1L;
        
        public ErrorCodeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, true);
        }
        
        protected ErrorCodeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
        
        private static final javax.xml.namespace.QName CODESYSTEM$0 = 
            new javax.xml.namespace.QName("", "codeSystem");
        
        
        /**
         * Gets the "codeSystem" attribute
         */
        public java.lang.String getCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODESYSTEM$0);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "codeSystem" attribute
         */
        public org.apache.xmlbeans.XmlString xgetCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODESYSTEM$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(CODESYSTEM$0);
                }
                return target;
            }
        }
        
        /**
         * True if has "codeSystem" attribute
         */
        public boolean isSetCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(CODESYSTEM$0) != null;
            }
        }
        
        /**
         * Sets the "codeSystem" attribute
         */
        public void setCodeSystem(java.lang.String codeSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$0);
                }
                target.setStringValue(codeSystem);
            }
        }
        
        /**
         * Sets (as xml) the "codeSystem" attribute
         */
        public void xsetCodeSystem(org.apache.xmlbeans.XmlString codeSystem)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CODESYSTEM$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CODESYSTEM$0);
                }
                target.set(codeSystem);
            }
        }
        
        /**
         * Unsets the "codeSystem" attribute
         */
        public void unsetCodeSystem()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(CODESYSTEM$0);
            }
        }
    }
}
