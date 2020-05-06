/*
 * XML Type:  CV.NPfIT.CodedOriginaltext
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CVNPfITCodedOriginaltext
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML CV.NPfIT.CodedOriginaltext(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CVNPfITCodedOriginaltextImpl extends uk.nhs.connect.iucds.cda.ucr.impl.CVImpl implements uk.nhs.connect.iucds.cda.ucr.CVNPfITCodedOriginaltext
{
    private static final long serialVersionUID = 1L;
    
    public CVNPfITCodedOriginaltextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINALTEXT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "originalText");
    private static final javax.xml.namespace.QName CODE$2 = 
        new javax.xml.namespace.QName("", "code");
    private static final javax.xml.namespace.QName CODESYSTEM$4 = 
        new javax.xml.namespace.QName("", "codeSystem");
    private static final javax.xml.namespace.QName DISPLAYNAME$6 = 
        new javax.xml.namespace.QName("", "displayName");
    
    
    /**
     * Gets the "originalText" element
     */
    public uk.nhs.connect.iucds.cda.ucr.ED getOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ED target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ED)get_store().find_element_user(ORIGINALTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originalText" element
     */
    public boolean isSetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "originalText" element
     */
    public void setOriginalText(uk.nhs.connect.iucds.cda.ucr.ED originalText)
    {
        generatedSetterHelperImpl(originalText, ORIGINALTEXT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "originalText" element
     */
    public uk.nhs.connect.iucds.cda.ucr.ED addNewOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.ED target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.ED)get_store().add_element_user(ORIGINALTEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "originalText" element
     */
    public void unsetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALTEXT$0, 0);
        }
    }
    
    /**
     * Gets the "code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Cs2 xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(CODE$2);
            return target;
        }
    }
    
    /**
     * True if has "code" attribute
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODE$2) != null;
        }
    }
    
    /**
     * Sets the "code" attribute
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$2);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" attribute
     */
    public void xsetCode(uk.nhs.connect.iucds.cda.ucr.Cs2 code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(CODE$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().add_attribute_user(CODE$2);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "code" attribute
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODE$2);
        }
    }
    
    /**
     * Gets the "codeSystem" attribute
     */
    public java.lang.String getCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$4);
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
    public uk.nhs.connect.iucds.cda.ucr.Uid xgetCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Uid target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$4);
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
            return get_store().find_attribute_user(CODESYSTEM$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$4);
            }
            target.setStringValue(codeSystem);
        }
    }
    
    /**
     * Sets (as xml) the "codeSystem" attribute
     */
    public void xsetCodeSystem(uk.nhs.connect.iucds.cda.ucr.Uid codeSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Uid target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().add_attribute_user(CODESYSTEM$4);
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
            get_store().remove_attribute(CODESYSTEM$4);
        }
    }
    
    /**
     * Gets the "displayName" attribute
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.St2 xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$6);
            return target;
        }
    }
    
    /**
     * True if has "displayName" attribute
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYNAME$6) != null;
        }
    }
    
    /**
     * Sets the "displayName" attribute
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$6);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    public void xsetDisplayName(uk.nhs.connect.iucds.cda.ucr.St2 displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.St2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().add_attribute_user(DISPLAYNAME$6);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Unsets the "displayName" attribute
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYNAME$6);
        }
    }
}
