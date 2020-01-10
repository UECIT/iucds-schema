/*
 * XML Type:  ActClassContract
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ActClassContract
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ActClassContract(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.ActClassContractX
 *     uk.nhs.connect.iucds.ucr.ActClassFinancialContractX
 */
public class ActClassContractImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.ActClassContract, uk.nhs.connect.iucds.ucr.ActClassContractX, uk.nhs.connect.iucds.ucr.ActClassFinancialContract
{
    private static final long serialVersionUID = 1L;
    
    public ActClassContractImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActClassContractImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
