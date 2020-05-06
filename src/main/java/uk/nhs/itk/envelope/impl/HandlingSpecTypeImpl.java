/*
 * XML Type:  handlingSpecType
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.envelope.HandlingSpecType
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.envelope.impl;
/**
 * An XML handlingSpecType(@urn:nhs-itk:ns:201005).
 *
 * This is a complex type.
 */
public class HandlingSpecTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.envelope.HandlingSpecType
{
    private static final long serialVersionUID = 1L;
    
    public HandlingSpecTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName KEY$0 = 
        new javax.xml.namespace.QName("", "key");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets the "key" attribute
     */
    public java.lang.String getKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "key" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(KEY$0);
            return target;
        }
    }
    
    /**
     * Sets the "key" attribute
     */
    public void setKey(java.lang.String key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$0);
            }
            target.setStringValue(key);
        }
    }
    
    /**
     * Sets (as xml) the "key" attribute
     */
    public void xsetKey(org.apache.xmlbeans.XmlAnyURI key)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(KEY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(KEY$0);
            }
            target.set(key);
        }
    }
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
            }
            target.set(value);
        }
    }
}
