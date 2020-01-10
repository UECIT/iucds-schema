/*
 * An XML document type.
 * Localname: ToolkitErrorInfo
 * Namespace: urn:nhs-itk:ns:201005
 * Java type: uk.nhs.itk.ToolkitErrorInfoDocument
 *
 * Automatically generated - do not modify.
 */
package uk.nhs.itk.impl;
/**
 * A document containing one ToolkitErrorInfo(@urn:nhs-itk:ns:201005) element.
 *
 * This is a complex type.
 */
public class ToolkitErrorInfoDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements uk.nhs.itk.ToolkitErrorInfoDocument
{
    private static final long serialVersionUID = 1L;
    
    public ToolkitErrorInfoDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOOLKITERRORINFO$0 = 
        new javax.xml.namespace.QName("urn:nhs-itk:ns:201005", "ToolkitErrorInfo");
    
    
    /**
     * Gets the "ToolkitErrorInfo" element
     */
    public uk.nhs.itk.ToolkitErrorInfoStruct getToolkitErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.ToolkitErrorInfoStruct target = null;
            target = (uk.nhs.itk.ToolkitErrorInfoStruct)get_store().find_element_user(TOOLKITERRORINFO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ToolkitErrorInfo" element
     */
    public void setToolkitErrorInfo(uk.nhs.itk.ToolkitErrorInfoStruct toolkitErrorInfo)
    {
        generatedSetterHelperImpl(toolkitErrorInfo, TOOLKITERRORINFO$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ToolkitErrorInfo" element
     */
    public uk.nhs.itk.ToolkitErrorInfoStruct addNewToolkitErrorInfo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            uk.nhs.itk.ToolkitErrorInfoStruct target = null;
            target = (uk.nhs.itk.ToolkitErrorInfoStruct)get_store().add_element_user(TOOLKITERRORINFO$0);
            return target;
        }
    }
}
