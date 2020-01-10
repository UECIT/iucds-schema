/*
 * XML Type:  EntityClass
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.EntityClass
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML EntityClass(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.EntityClassX
 *     uk.nhs.connect.iucds.ucr.EntityClassRootX
 *     uk.nhs.connect.iucds.ucr.EntityClassMaterialX
 *     uk.nhs.connect.iucds.ucr.EntityClassManufacturedMaterialX
 *     uk.nhs.connect.iucds.ucr.EntityClassContainerX
 *     uk.nhs.connect.iucds.ucr.EntityClassDeviceX
 *     uk.nhs.connect.iucds.ucr.EntityClassLivingSubjectX
 *     uk.nhs.connect.iucds.ucr.EntityClassNonPersonLivingSubjectX
 *     uk.nhs.connect.iucds.ucr.EntityClassOrganizationX
 *     uk.nhs.connect.iucds.ucr.State
 *     uk.nhs.connect.iucds.ucr.EntityClassPlaceX
 *     uk.nhs.connect.iucds.ucr.EntityClassDocumentReceivingX
 *     uk.nhs.connect.iucds.ucr.EntityClassPersonOrOrgReceivingX
 */
public class EntityClassImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.EntityClass, uk.nhs.connect.iucds.ucr.EntityClassX, uk.nhs.connect.iucds.ucr.EntityClassRoot
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
