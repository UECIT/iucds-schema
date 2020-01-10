/*
 * An XML document type.
 * Localname: messageType
 * Namespace: NPFIT:HL7:Localisation
 * Java type: uk.nhs.connect.npfit.hl7.localisation.MessageTypeDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.connect.npfit.hl7.localisation.impl;
/**
 * A document containing one messageType(@NPFIT:HL7:Localisation) element.
 *
 * This is a complex type.
 */
public class MessageTypeDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.connect.npfit.hl7.localisation.MessageTypeDocument
{
    private static final long serialVersionUID = 1L;
    
    public MessageTypeDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MESSAGETYPE$0 = 
        new javax.xml.namespace.QName("NPFIT:HL7:Localisation", "messageType");
    
    
    /**
     * Gets the "messageType" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.MessageType getMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.MessageType target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.MessageType)get_store().find_element_user(MESSAGETYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "messageType" element
     */
    public void setMessageType(uk.nhs.connect.npfit.hl7.localisation.MessageType messageType)
    {
        generatedSetterHelperImpl(messageType, MESSAGETYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "messageType" element
     */
    public uk.nhs.connect.npfit.hl7.localisation.MessageType addNewMessageType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.connect.npfit.hl7.localisation.MessageType target = null;
            target = (uk.nhs.connect.npfit.hl7.localisation.MessageType)get_store().add_element_user(MESSAGETYPE$0);
            return target;
        }
    }
}
