/*
 * XML Type:  messagetype.root
 * Namespace: NPFIT:HL7:Localisation
 * Java type: uk.nhs.connect.npfit.hl7.localisation.MessagetypeRoot
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.hl7.localisation.impl;
/**
 * An XML messagetype.root(@NPFIT:HL7:Localisation).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.Oid
 *     uk.nhs.connect.iucds.ucr.Uuid
 *     uk.nhs.connect.iucds.ucr.Ruid
 */
public class MessagetypeRootImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.npfit.hl7.localisation.MessagetypeRoot, uk.nhs.connect.iucds.ucr.Oid, uk.nhs.connect.iucds.ucr.Uuid, uk.nhs.connect.iucds.ucr.Ruid
{
    private static final long serialVersionUID = 1L;
    
    public MessagetypeRootImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected MessagetypeRootImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
