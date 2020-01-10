/*
 * XML Type:  ActRelationshipSequel
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ActRelationshipSequel
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ActRelationshipSequel(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.ActRelationshipSequelX
 *     uk.nhs.connect.iucds.ucr.ActRelationshipExcerptX
 *     uk.nhs.connect.iucds.ucr.ActRelationshipFulfillsX
 *     uk.nhs.connect.iucds.ucr.ActRelationshipReplacementX
 */
public class ActRelationshipSequelImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.ActRelationshipSequel, uk.nhs.connect.iucds.ucr.ActRelationshipSequelX, uk.nhs.connect.iucds.ucr.ActRelationshipExcerpt, uk.nhs.connect.iucds.ucr.ActRelationshipFulfills, uk.nhs.connect.iucds.ucr.ActRelationshipReplacement
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
