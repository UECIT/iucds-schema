/*
 * XML Type:  ParticipationTargetDirect
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ParticipationTargetDirect
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML ParticipationTargetDirect(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.ParticipationTargetDirectX
 *     uk.nhs.connect.iucds.cda.ucr.ParticipationConsumableX
 *     uk.nhs.connect.iucds.cda.ucr.ParticipationTargetDeviceX
 */
public class ParticipationTargetDirectImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.ParticipationTargetDirect, uk.nhs.connect.iucds.cda.ucr.ParticipationTargetDirectX, uk.nhs.connect.iucds.cda.ucr.ParticipationConsumable, uk.nhs.connect.iucds.cda.ucr.ParticipationTargetDevice
{
    private static final long serialVersionUID = 1L;
    
    public ParticipationTargetDirectImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ParticipationTargetDirectImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
