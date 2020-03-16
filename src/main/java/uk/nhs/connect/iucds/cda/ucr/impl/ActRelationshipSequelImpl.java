/*
 * XML Type:  ActRelationshipSequel
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ActRelationshipSequel
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML ActRelationshipSequel(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.ActRelationshipSequelX
 *     uk.nhs.connect.iucds.cda.ucr.ActRelationshipExcerptX
 *     uk.nhs.connect.iucds.cda.ucr.ActRelationshipFulfillsX
 *     uk.nhs.connect.iucds.cda.ucr.ActRelationshipReplacementX
 */
public class ActRelationshipSequelImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.ActRelationshipSequel, uk.nhs.connect.iucds.cda.ucr.ActRelationshipSequelX, uk.nhs.connect.iucds.cda.ucr.ActRelationshipExcerpt, uk.nhs.connect.iucds.cda.ucr.ActRelationshipFulfills, uk.nhs.connect.iucds.cda.ucr.ActRelationshipReplacement
{
    private static final long serialVersionUID = 1L;
    
    public ActRelationshipSequelImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActRelationshipSequelImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
