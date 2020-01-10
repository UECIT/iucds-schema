/*
 * XML Type:  ActDocumentStructureClass
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.ActDocumentStructureClass
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML ActDocumentStructureClass(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.ActDocumentStructureClassX
 *     uk.nhs.connect.iucds.ucr.ActClassClinicalDocument1
 *     uk.nhs.connect.iucds.ucr.ActClassDocument1$Member
 *     uk.nhs.connect.iucds.ucr.DocumentTableStructureX
 *     uk.nhs.connect.iucds.ucr.DocumentTableCellX
 *     uk.nhs.connect.iucds.ucr.DocumentTableRowStructureX
 *     uk.nhs.connect.iucds.ucr.DocumentTableRowGroupX
 *     uk.nhs.connect.iucds.ucr.TableRowGroupTypeX
 *     uk.nhs.connect.iucds.ucr.DocumentTableColumnStructureX
 *     uk.nhs.connect.iucds.ucr.DocumentListX
 *     uk.nhs.connect.iucds.ucr.ListTypeX
 */
public class ActDocumentStructureClassImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.ActDocumentStructureClass, uk.nhs.connect.iucds.ucr.ActDocumentStructureClassX, uk.nhs.connect.iucds.ucr.ActClassDocument1, uk.nhs.connect.iucds.ucr.DocumentTableStructure, uk.nhs.connect.iucds.ucr.DocumentList
{
    private static final long serialVersionUID = 1L;
    
    public ActDocumentStructureClassImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActDocumentStructureClassImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
