/*
 * XML Type:  NoInformation
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.NoInformation
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML NoInformation(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.Other
 *     uk.nhs.connect.iucds.ucr.AskedButUnknown
 *     uk.nhs.connect.iucds.ucr.Unknown$Member
 *     uk.nhs.connect.iucds.ucr.NoInformation$Member
 */
public class NoInformationImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.NoInformation, uk.nhs.connect.iucds.ucr.Other, uk.nhs.connect.iucds.ucr.Unknown, uk.nhs.connect.iucds.ucr.NoInformation.Member
{
    private static final long serialVersionUID = 1L;
    
    public NoInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected NoInformationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.NoInformation$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.NoInformation.Member
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
