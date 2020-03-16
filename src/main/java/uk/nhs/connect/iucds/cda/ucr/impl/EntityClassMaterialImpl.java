/*
 * XML Type:  EntityClassMaterial
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.EntityClassMaterial
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML EntityClassMaterial(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassMaterialX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassManufacturedMaterialX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassContainerX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassDeviceX
 */
public class EntityClassMaterialImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.EntityClassMaterial, uk.nhs.connect.iucds.cda.ucr.EntityClassMaterialX, uk.nhs.connect.iucds.cda.ucr.EntityClassManufacturedMaterial
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
