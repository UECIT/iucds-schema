/*
 * XML Type:  RoleStatus
 * Namespace: urn:hl7-org:v3
 * Java type: uk.nhs.connect.iucds.ucr.RoleStatus
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.iucds.ucr.impl;
/**
 * An XML RoleStatus(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     uk.nhs.connect.iucds.ucr.RoleStatusX
 *     uk.nhs.connect.iucds.ucr.RoleStatusNormalX
 */
public class RoleStatusImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements uk.nhs.connect.iucds.ucr.RoleStatus, uk.nhs.connect.iucds.ucr.RoleStatusX, uk.nhs.connect.iucds.ucr.RoleStatusNormal
{
    private static final long serialVersionUID = 1L;
    
    public RoleStatusImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected RoleStatusImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
