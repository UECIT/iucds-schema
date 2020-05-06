/*
 * XML Type:  uid
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.Uid
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML uid(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.Oid
 *     uk.nhs.connect.iucds.cda.ucr.Uuid
 *     uk.nhs.connect.iucds.cda.ucr.Ruid
 */
public class UidImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.Uid, uk.nhs.connect.iucds.cda.ucr.Oid, uk.nhs.connect.iucds.cda.ucr.Uuid, uk.nhs.connect.iucds.cda.ucr.Ruid
{
    private static final long serialVersionUID = 1L;
    
    public UidImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected UidImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
