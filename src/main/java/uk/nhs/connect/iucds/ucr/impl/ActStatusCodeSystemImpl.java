/*
 * XML Type:  ActStatus_codeSystem
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ActStatusCodeSystem
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ActStatus_codeSystem(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.Oid
 *     uk.nhs.connect.iucds.ucr.Uuid
 *     uk.nhs.connect.iucds.ucr.Ruid
 */
public class ActStatusCodeSystemImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.ActStatusCodeSystem, uk.nhs.connect.iucds.ucr.Oid, uk.nhs.connect.iucds.ucr.Uuid, uk.nhs.connect.iucds.ucr.Ruid
{
    private static final long serialVersionUID = 1L;
    
    public ActStatusCodeSystemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActStatusCodeSystemImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
