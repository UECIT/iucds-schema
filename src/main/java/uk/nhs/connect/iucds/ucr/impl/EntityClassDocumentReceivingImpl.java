/*
 * XML Type:  EntityClassDocumentReceiving
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EntityClassDocumentReceiving
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML EntityClassDocumentReceiving(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.EntityClassDocumentReceivingX
 *     uk.nhs.connect.iucds.ucr.EntityClassPersonOrOrgReceivingX
 *     uk.nhs.connect.iucds.ucr.EntityClassOrganizationX
 *     uk.nhs.connect.iucds.ucr.State
 */
public class EntityClassDocumentReceivingImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.EntityClassDocumentReceiving, uk.nhs.connect.iucds.ucr.EntityClassDocumentReceivingX, uk.nhs.connect.iucds.ucr.EntityClassPersonOrOrgReceiving
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassDocumentReceivingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassDocumentReceivingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
