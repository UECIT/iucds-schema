/*
 * XML Type:  EntityClassDocumentReceiving
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.EntityClassDocumentReceiving
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML EntityClassDocumentReceiving(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassDocumentReceivingX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassPersonOrOrgReceivingX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassOrganizationX
 *     uk.nhs.connect.iucds.cda.ucr.State
 */
public class EntityClassDocumentReceivingImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.EntityClassDocumentReceiving, uk.nhs.connect.iucds.cda.ucr.EntityClassDocumentReceivingX, uk.nhs.connect.iucds.cda.ucr.EntityClassPersonOrOrgReceiving
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
