/*
 * XML Type:  ActRelationshipConditional
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ActRelationshipConditional
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ActRelationshipConditional(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.ActRelationshipConditionalX
 *     uk.nhs.connect.iucds.ucr.ActRelationshipReasonX
 */
public class ActRelationshipConditionalImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.ActRelationshipConditional, uk.nhs.connect.iucds.ucr.ActRelationshipConditionalX, uk.nhs.connect.iucds.ucr.ActRelationshipReason
{
    private static final long serialVersionUID = 1L;
    
    public ActRelationshipConditionalImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActRelationshipConditionalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
