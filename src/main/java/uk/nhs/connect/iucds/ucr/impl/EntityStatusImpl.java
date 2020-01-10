/*
 * XML Type:  EntityStatus
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EntityStatus
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML EntityStatus(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.EntityStatusX
 *     uk.nhs.connect.iucds.ucr.EntityStatusNormalX
 */
public class EntityStatusImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.EntityStatus, uk.nhs.connect.iucds.ucr.EntityStatusX, uk.nhs.connect.iucds.ucr.EntityStatusNormal
{
    private static final long serialVersionUID = 1L;
    
    public EntityStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
