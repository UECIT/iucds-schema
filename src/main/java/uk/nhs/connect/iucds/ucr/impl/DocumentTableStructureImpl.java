/*
 * XML Type:  DocumentTableStructure
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.DocumentTableStructure
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML DocumentTableStructure(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.DocumentTableStructureX
 *     uk.nhs.connect.iucds.ucr.DocumentTableCellX
 *     uk.nhs.connect.iucds.ucr.DocumentTableRowStructureX
 *     uk.nhs.connect.iucds.ucr.DocumentTableRowGroupX
 *     uk.nhs.connect.iucds.ucr.TableRowGroupTypeX
 *     uk.nhs.connect.iucds.ucr.DocumentTableColumnStructureX
 */
public class DocumentTableStructureImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.DocumentTableStructure, uk.nhs.connect.iucds.ucr.DocumentTableStructureX, uk.nhs.connect.iucds.ucr.DocumentTableCell, uk.nhs.connect.iucds.ucr.DocumentTableRowStructure, uk.nhs.connect.iucds.ucr.DocumentTableColumnStructure
{
    private static final long serialVersionUID = 1L;
    
    public DocumentTableStructureImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected DocumentTableStructureImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
