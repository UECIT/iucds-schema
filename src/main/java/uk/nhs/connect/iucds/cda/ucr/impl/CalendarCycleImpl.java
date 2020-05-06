/*
 * XML Type:  CalendarCycle
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.cda.ucr.CalendarCycle
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.cda.ucr.impl;
/**
 * An XML CalendarCycle(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.cda.ucr.CalendarCycleOneLetter
 *     uk.nhs.connect.iucds.cda.ucr.GregorianCalendarCycle
 *     uk.nhs.connect.iucds.cda.ucr.CalendarCycleTwoLetter$Member
 */
public class CalendarCycleImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.cda.ucr.CalendarCycle, uk.nhs.connect.iucds.cda.ucr.CalendarCycleOneLetter, uk.nhs.connect.iucds.cda.ucr.CalendarCycleTwoLetter
{
    private static final long serialVersionUID = 1L;
    
    public CalendarCycleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CalendarCycleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
