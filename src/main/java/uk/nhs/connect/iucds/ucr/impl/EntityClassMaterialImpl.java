/*
 * XML Type:  EntityClassMaterial
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EntityClassMaterial
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML EntityClassMaterial(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.EntityClassMaterialX
 *     uk.nhs.connect.iucds.ucr.EntityClassManufacturedMaterialX
 *     uk.nhs.connect.iucds.ucr.EntityClassContainerX
 *     uk.nhs.connect.iucds.ucr.EntityClassDeviceX
 */
public class EntityClassMaterialImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.EntityClassMaterial, uk.nhs.connect.iucds.ucr.EntityClassMaterialX, uk.nhs.connect.iucds.ucr.EntityClassManufacturedMaterial
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassMaterialImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassMaterialImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
