/*
 * XML Type:  CR
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CR
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML CR(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CRImpl extends uk.nhs.connect.iucds.cda.ucr.impl.CDImpl implements uk.nhs.connect.iucds.cda.ucr.CR
{
    private static final long serialVersionUID = 1L;
    
    public CRImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "name");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "value");
    private static final javax.xml.namespace.QName INVERTED$4 = 
        new javax.xml.namespace.QName("", "inverted");
    
    
    /**
     * Gets the "name" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CV getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CV)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(uk.nhs.connect.iucds.cda.ucr.CV name)
    {
        generatedSetterHelperImpl(name, NAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CV addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CV target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CV)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CD getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CD target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CD)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(uk.nhs.connect.iucds.cda.ucr.CD value)
    {
        generatedSetterHelperImpl(value, VALUE$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public uk.nhs.connect.iucds.cda.ucr.CD addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CD target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CD)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$2, 0);
        }
    }
    
    /**
     * Gets the "inverted" attribute
     */
    public boolean getInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INVERTED$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "inverted" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Bl2 xgetInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_default_attribute_value(INVERTED$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "inverted" attribute
     */
    public boolean isSetInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INVERTED$4) != null;
        }
    }
    
    /**
     * Sets the "inverted" attribute
     */
    public void setInverted(boolean inverted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVERTED$4);
            }
            target.setBooleanValue(inverted);
        }
    }
    
    /**
     * Sets (as xml) the "inverted" attribute
     */
    public void xsetInverted(uk.nhs.connect.iucds.cda.ucr.Bl2 inverted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bl2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bl2)get_store().add_attribute_user(INVERTED$4);
            }
            target.set(inverted);
        }
    }
    
    /**
     * Unsets the "inverted" attribute
     */
    public void unsetInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INVERTED$4);
        }
    }
}
