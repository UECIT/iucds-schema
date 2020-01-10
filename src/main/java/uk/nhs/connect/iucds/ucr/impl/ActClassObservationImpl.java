/*
 * XML Type:  ActClassObservation
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ActClassObservation
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ActClassObservation(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.ActClassObservationX
 *     uk.nhs.connect.iucds.ucr.ActClassPublicHealthCaseX
 *     uk.nhs.connect.iucds.ucr.ActClassROIX
 *     uk.nhs.connect.iucds.ucr.ActClassObservationSeriesX
 */
public class ActClassObservationImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.ActClassObservation, uk.nhs.connect.iucds.ucr.ActClassObservationX, uk.nhs.connect.iucds.ucr.ActClassPublicHealthCase, uk.nhs.connect.iucds.ucr.ActClassROI, uk.nhs.connect.iucds.ucr.ActClassObservationSeries
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
