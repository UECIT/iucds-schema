/*
 * XML Type:  RoleClassPartitive
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.RoleClassPartitive
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML RoleClassPartitive(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.RoleClassPartitiveX
 *     uk.nhs.connect.iucds.ucr.RoleClassIngredientEntityX
 *     uk.nhs.connect.iucds.ucr.RoleClassInactiveIngredientX
 *     uk.nhs.connect.iucds.ucr.RoleClassLocatedEntityX
 *     uk.nhs.connect.iucds.ucr.RoleClassSpecimenX
 */
public class RoleClassPartitiveImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.RoleClassPartitive, uk.nhs.connect.iucds.ucr.RoleClassPartitiveX, uk.nhs.connect.iucds.ucr.RoleClassIngredientEntity, uk.nhs.connect.iucds.ucr.RoleClassLocatedEntity, uk.nhs.connect.iucds.ucr.RoleClassSpecimen
{
    private static final long serialVersionUID = 1L;
    
    public RoleClassPartitiveImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleClassPartitiveImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
