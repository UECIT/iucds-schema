/*
 * XML Type:  EntityClassRoot
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.EntityClassRoot
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML EntityClassRoot(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassRootX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassMaterialX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassManufacturedMaterialX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassContainerX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassDeviceX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassLivingSubjectX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassNonPersonLivingSubjectX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassOrganizationX
 *     uk.nhs.connect.iucds.cda.ucr.State
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassPlaceX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassDocumentReceivingX
 *     uk.nhs.connect.iucds.cda.ucr.EntityClassPersonOrOrgReceivingX
 */
public class EntityClassRootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.EntityClassRoot, uk.nhs.connect.iucds.cda.ucr.EntityClassRootX, uk.nhs.connect.iucds.cda.ucr.EntityClassMaterial, uk.nhs.connect.iucds.cda.ucr.EntityClassLivingSubject, uk.nhs.connect.iucds.cda.ucr.EntityClassOrganization, uk.nhs.connect.iucds.cda.ucr.EntityClassPlace, uk.nhs.connect.iucds.cda.ucr.EntityClassDocumentReceiving
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassRootImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassRootImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
