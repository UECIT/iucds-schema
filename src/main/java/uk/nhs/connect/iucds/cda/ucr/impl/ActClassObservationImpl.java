/*
 * XML Type:  ActClassObservation
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.ActClassObservation
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML ActClassObservation(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.ActClassObservationX
 *     uk.nhs.connect.iucds.cda.ucr.ActClassPublicHealthCaseX
 *     uk.nhs.connect.iucds.cda.ucr.ActClassROIX
 *     uk.nhs.connect.iucds.cda.ucr.ActClassObservationSeriesX
 */
public class ActClassObservationImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.ActClassObservation, uk.nhs.connect.iucds.cda.ucr.ActClassObservationX, uk.nhs.connect.iucds.cda.ucr.ActClassPublicHealthCase, uk.nhs.connect.iucds.cda.ucr.ActClassROI, uk.nhs.connect.iucds.cda.ucr.ActClassObservationSeries
{
    private static final long serialVersionUID = 1L;
    
    public ActClassObservationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActClassObservationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
