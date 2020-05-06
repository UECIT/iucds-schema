/*
 * XML Type:  Cda.NPfIT.ED
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CdaNPfITED
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML Cda.NPfIT.ED(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CdaNPfITEDImpl extends uk.nhs.connect.iucds.cda.ucr.impl.BINImpl implements uk.nhs.connect.iucds.cda.ucr.CdaNPfITED
{
    private static final long serialVersionUID = 1L;
    
    public CdaNPfITEDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "reference");
    private static final javax.xml.namespace.QName THUMBNAIL$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "thumbnail");
    private static final javax.xml.namespace.QName MEDIATYPE$4 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName LANGUAGE$6 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName COMPRESSION$8 = 
        new javax.xml.namespace.QName("", "compression");
    private static final javax.xml.namespace.QName INTEGRITYCHECK$10 = 
        new javax.xml.namespace.QName("", "integrityCheck");
    private static final javax.xml.namespace.QName INTEGRITYCHECKALGORITHM$12 = 
        new javax.xml.namespace.QName("", "integrityCheckAlgorithm");
    
    
    /**
     * Gets the "reference" element
     */
    public uk.nhs.connect.iucds.cda.ucr.AnyNPfITUrl getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.AnyNPfITUrl target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.AnyNPfITUrl)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reference" element
     */
    public boolean isSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$0) != 0;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(uk.nhs.connect.iucds.cda.ucr.AnyNPfITUrl reference)
    {
        generatedSetterHelperImpl(reference, REFERENCE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "reference" element
     */
    public uk.nhs.connect.iucds.cda.ucr.AnyNPfITUrl addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.AnyNPfITUrl target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.AnyNPfITUrl)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "reference" element
     */
    public void unsetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$0, 0);
        }
    }
    
    /**
     * Gets the "thumbnail" element
     */
    public uk.nhs.connect.iucds.cda.ucr.Thumbnail getThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Thumbnail target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Thumbnail)get_store().find_element_user(THUMBNAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "thumbnail" element
     */
    public boolean isSetThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THUMBNAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "thumbnail" element
     */
    public void setThumbnail(uk.nhs.connect.iucds.cda.ucr.Thumbnail thumbnail)
    {
        generatedSetterHelperImpl(thumbnail, THUMBNAIL$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "thumbnail" element
     */
    public uk.nhs.connect.iucds.cda.ucr.Thumbnail addNewThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Thumbnail target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Thumbnail)get_store().add_element_user(THUMBNAIL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "thumbnail" element
     */
    public void unsetThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THUMBNAIL$2, 0);
        }
    }
    
    /**
     * Gets the "mediaType" attribute
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MEDIATYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Cs2 xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_default_attribute_value(MEDIATYPE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "mediaType" attribute
     */
    public boolean isSetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEDIATYPE$4) != null;
        }
    }
    
    /**
     * Sets the "mediaType" attribute
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$4);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" attribute
     */
    public void xsetMediaType(uk.nhs.connect.iucds.cda.ucr.Cs2 mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().add_attribute_user(MEDIATYPE$4);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Unsets the "mediaType" attribute
     */
    public void unsetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEDIATYPE$4);
        }
    }
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Cs2 xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(LANGUAGE$6);
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$6) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$6);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" attribute
     */
    public void xsetLanguage(uk.nhs.connect.iucds.cda.ucr.Cs2 language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Cs2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Cs2)get_store().add_attribute_user(LANGUAGE$6);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$6);
        }
    }
    
    /**
     * Gets the "compression" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm.Enum getCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$8);
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "compression" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm xgetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm)get_store().find_attribute_user(COMPRESSION$8);
            return target;
        }
    }
    
    /**
     * True if has "compression" attribute
     */
    public boolean isSetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPRESSION$8) != null;
        }
    }
    
    /**
     * Sets the "compression" attribute
     */
    public void setCompression(uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm.Enum compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPRESSION$8);
            }
            target.setEnumValue(compression);
        }
    }
    
    /**
     * Sets (as xml) the "compression" attribute
     */
    public void xsetCompression(uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm)get_store().find_attribute_user(COMPRESSION$8);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsCompressionAlgorithm)get_store().add_attribute_user(COMPRESSION$8);
            }
            target.set(compression);
        }
    }
    
    /**
     * Unsets the "compression" attribute
     */
    public void unsetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPRESSION$8);
        }
    }
    
    /**
     * Gets the "integrityCheck" attribute
     */
    public byte[] getIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECK$10);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "integrityCheck" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.Bin2 xgetIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bin2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bin2)get_store().find_attribute_user(INTEGRITYCHECK$10);
            return target;
        }
    }
    
    /**
     * True if has "integrityCheck" attribute
     */
    public boolean isSetIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTEGRITYCHECK$10) != null;
        }
    }
    
    /**
     * Sets the "integrityCheck" attribute
     */
    public void setIntegrityCheck(byte[] integrityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECK$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTEGRITYCHECK$10);
            }
            target.setByteArrayValue(integrityCheck);
        }
    }
    
    /**
     * Sets (as xml) the "integrityCheck" attribute
     */
    public void xsetIntegrityCheck(uk.nhs.connect.iucds.cda.ucr.Bin2 integrityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.Bin2 target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.Bin2)get_store().find_attribute_user(INTEGRITYCHECK$10);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.Bin2)get_store().add_attribute_user(INTEGRITYCHECK$10);
            }
            target.set(integrityCheck);
        }
    }
    
    /**
     * Unsets the "integrityCheck" attribute
     */
    public void unsetIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTEGRITYCHECK$10);
        }
    }
    
    /**
     * Gets the "integrityCheckAlgorithm" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm.Enum getIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTEGRITYCHECKALGORITHM$12);
            }
            if (target == null)
            {
                return null;
            }
            return (uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "integrityCheckAlgorithm" attribute
     */
    public uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm xgetIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm)get_default_attribute_value(INTEGRITYCHECKALGORITHM$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "integrityCheckAlgorithm" attribute
     */
    public boolean isSetIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12) != null;
        }
    }
    
    /**
     * Sets the "integrityCheckAlgorithm" attribute
     */
    public void setIntegrityCheckAlgorithm(uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm.Enum integrityCheckAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTEGRITYCHECKALGORITHM$12);
            }
            target.setEnumValue(integrityCheckAlgorithm);
        }
    }
    
    /**
     * Sets (as xml) the "integrityCheckAlgorithm" attribute
     */
    public void xsetIntegrityCheckAlgorithm(uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm integrityCheckAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm target = null;
            target = (uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (uk.nhs.connect.iucds.cda.ucr.CsIntegrityCheckAlgorithm)get_store().add_attribute_user(INTEGRITYCHECKALGORITHM$12);
            }
            target.set(integrityCheckAlgorithm);
        }
    }
    
    /**
     * Unsets the "integrityCheckAlgorithm" attribute
     */
    public void unsetIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTEGRITYCHECKALGORITHM$12);
        }
    }
}
