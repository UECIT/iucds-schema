/*
 * XML Type:  ActClassContainer
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ActClassContainer
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML ActClassContainer(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.ActClassClinicalDocument1
 *     uk.nhs.connect.iucds.cda.ucr.ActClassDocument1$Member
 *     uk.nhs.connect.iucds.cda.ucr.ActClassComposition$Member
 *     uk.nhs.connect.iucds.cda.ucr.ActClassEntry
 *     uk.nhs.connect.iucds.cda.ucr.ActClassExtract
 *     uk.nhs.connect.iucds.cda.ucr.ActClassOrganizer
 *     uk.nhs.connect.iucds.cda.ucr.ActClassContainer$Member
 */
public class ActClassContainerImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.ActClassContainer, uk.nhs.connect.iucds.cda.ucr.ActClassComposition, uk.nhs.connect.iucds.cda.ucr.ActClassEntry, uk.nhs.connect.iucds.cda.ucr.ActClassExtract, uk.nhs.connect.iucds.cda.ucr.ActClassOrganizer, uk.nhs.connect.iucds.cda.ucr.ActClassContainer.Member
{
    private static final long serialVersionUID = 1L;
    
    public ActClassContainerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActClassContainerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.cda.ucr.ActClassContainer$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.cda.ucr.ActClassContainer.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
