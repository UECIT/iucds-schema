/*
 * XML Type:  NullFlavor
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.NullFlavor
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML NullFlavor(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.Other
 *     uk.nhs.connect.iucds.ucr.AskedButUnknown
 *     uk.nhs.connect.iucds.ucr.Unknown$Member
 *     uk.nhs.connect.iucds.ucr.NoInformation$Member
 */
public class NullFlavorImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.NullFlavor, uk.nhs.connect.iucds.ucr.NoInformation
{
    private static final long serialVersionUID = 1L;
    
    public NullFlavorImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected NullFlavorImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
