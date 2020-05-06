/*
 * XML Type:  Unknown
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.Unknown
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML Unknown(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.AskedButUnknown
 *     uk.nhs.connect.iucds.cda.ucr.Unknown$Member
 */
public class UnknownImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.Unknown, uk.nhs.connect.iucds.cda.ucr.AskedButUnknown, uk.nhs.connect.iucds.cda.ucr.Unknown.Member
{
    private static final long serialVersionUID = 1L;
    
    public UnknownImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected UnknownImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.cda.ucr.Unknown$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.cda.ucr.Unknown.Member
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
