/*
 * XML Type:  ContextControl
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ContextControl
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML ContextControl(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.ContextControlX
 *     uk.nhs.connect.iucds.cda.ucr.ContextControlAdditiveX
 *     uk.nhs.connect.iucds.cda.ucr.ContextControlOverridingX
 *     uk.nhs.connect.iucds.cda.ucr.ContextControlPropagatingX
 *     uk.nhs.connect.iucds.cda.ucr.ContextControlNonPropagatingX
 */
public class ContextControlImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.ContextControl, uk.nhs.connect.iucds.cda.ucr.ContextControlX, uk.nhs.connect.iucds.cda.ucr.ContextControlAdditive, uk.nhs.connect.iucds.cda.ucr.ContextControlOverriding, uk.nhs.connect.iucds.cda.ucr.ContextControlPropagating, uk.nhs.connect.iucds.cda.ucr.ContextControlNonPropagating
{
    private static final long serialVersionUID = 1L;
    
    public ContextControlImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ContextControlImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
