/*
 * XML Type:  CE.NPfIT.Codedplain
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CENPfITCodedplain
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML CE.NPfIT.Codedplain(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CENPfITCodedplainImpl extends uk.nhs.connect.iucds.cda.ucr.impl.CEImpl implements uk.nhs.connect.iucds.cda.ucr.CENPfITCodedplain
{
    private static final long serialVersionUID = 1L;
    
    public CENPfITCodedplainImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("", "code");
    private static final javax.xml.namespace.QName CODESYSTEM$2 = 
        new javax.xml.namespace.QName("", "codeSystem");
    private static final javax.xml.namespace.QName DISPLAYNAME$4 = 
        new javax.xml.namespace.QName("", "displayName");
    
    
    /**
     * Gets the "code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
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
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(CODE$0);
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
            return get_store().find_attribute_user(CODE$0) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$0);
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
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().add_attribute_user(CODE$0);
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
            get_store().remove_attribute(CODE$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$2);
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
            target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$2);
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
            return get_store().find_attribute_user(CODESYSTEM$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$2);
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
            target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().find_attribute_user(CODESYSTEM$2);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Uid)get_store().add_attribute_user(CODESYSTEM$2);
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
            get_store().remove_attribute(CODESYSTEM$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$4);
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
            target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$4);
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
            return get_store().find_attribute_user(DISPLAYNAME$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$4);
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
            target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().find_attribute_user(DISPLAYNAME$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.St2)get_store().add_attribute_user(DISPLAYNAME$4);
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
            get_store().remove_attribute(DISPLAYNAME$4);
        }
    }
}
