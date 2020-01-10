/*
 * XML Type:  CalendarCycleTwoLetter
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.CalendarCycleTwoLetter
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML CalendarCycleTwoLetter(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.GregorianCalendarCycle
 *     uk.nhs.connect.iucds.ucr.CalendarCycleTwoLetter$Member
 */
public class CalendarCycleTwoLetterImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.CalendarCycleTwoLetter, uk.nhs.connect.iucds.ucr.GregorianCalendarCycle, uk.nhs.connect.iucds.ucr.CalendarCycleTwoLetter.Member
{
    private static final long serialVersionUID = 1L;
    
    public CalendarCycleTwoLetterImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CalendarCycleTwoLetterImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of uk.nhs.connect.iucds.ucr.CalendarCycleTwoLetter$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements uk.nhs.connect.iucds.ucr.CalendarCycleTwoLetter.Member
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
