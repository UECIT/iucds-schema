/*
 * XML Type:  content.oid
 * Namespace: NPFIT:HL7:Localisation
 * Java type: uk.nhs.connect.npfit.hl7.localisation.ContentOid
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.hl7.localisation.impl;
/**
 * An XML content.oid(@NPFIT:HL7:Localisation).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.Oid
 *     uk.nhs.connect.iucds.cda.ucr.Uuid
 *     uk.nhs.connect.iucds.cda.ucr.Ruid
 */
public class ContentOidImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.npfit.hl7.localisation.ContentOid, uk.nhs.connect.iucds.cda.ucr.Oid, uk.nhs.connect.iucds.cda.ucr.Uuid, uk.nhs.connect.iucds.cda.ucr.Ruid
{
    private static final long serialVersionUID = 1L;
    
    public ContentOidImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ContentOidImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
