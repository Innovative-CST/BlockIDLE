package org.w3c.dom;

public interface DOMImplementation
{
    boolean hasFeature(final String p0, final String p1);
    
    DocumentType createDocumentType(final String p0, final String p1, final String p2) throws DOMException;
    
    Document createDocument(final String p0, final String p1, final DocumentType p2) throws DOMException;
    
    Object getFeature(final String p0, final String p1);
}
