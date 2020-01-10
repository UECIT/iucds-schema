/*
 * XML Type:  RoleClassPassive
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.RoleClassPassive
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML RoleClassPassive(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.RoleClassPassiveX
 *     uk.nhs.connect.iucds.ucr.RoleClassDistributedMaterialX
 *     uk.nhs.connect.iucds.ucr.RoleClassManufacturedProductX
 *     uk.nhs.connect.iucds.ucr.RoleClassServiceDeliveryLocationX
 */
public class RoleClassPassiveImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.RoleClassPassive, uk.nhs.connect.iucds.ucr.RoleClassPassiveX, uk.nhs.connect.iucds.ucr.RoleClassDistributedMaterial, uk.nhs.connect.iucds.ucr.RoleClassManufacturedProduct, uk.nhs.connect.iucds.ucr.RoleClassServiceDeliveryLocation
{
    private static final long serialVersionUID = 1L;
    
    public RoleClassPassiveImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleClassPassiveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
