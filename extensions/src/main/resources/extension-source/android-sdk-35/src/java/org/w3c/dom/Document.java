package org.w3c.dom;

public interface Document extends Node
{
    DocumentType getDoctype();
    
    DOMImplementation getImplementation();
    
    Element getDocumentElement();
    
    Element createElement(final String p0) throws DOMException;
    
    DocumentFragment createDocumentFragment();
    
    Text createTextNode(final String p0);
    
    Comment createComment(final String p0);
    
    CDATASection createCDATASection(final String p0) throws DOMException;
    
    ProcessingInstruction createProcessingInstruction(final String p0, final String p1) throws DOMException;
    
    Attr createAttribute(final String p0) throws DOMException;
    
    EntityReference createEntityReference(final String p0) throws DOMException;
    
    NodeList getElementsByTagName(final String p0);
    
    Node importNode(final Node p0, final boolean p1) throws DOMException;
    
    Element createElementNS(final String p0, final String p1) throws DOMException;
    
    Attr createAttributeNS(final String p0, final String p1) throws DOMException;
    
    NodeList getElementsByTagNameNS(final String p0, final String p1);
    
    Element getElementById(final String p0);
    
    String getInputEncoding();
    
    String getXmlEncoding();
    
    boolean getXmlStandalone();
    
    void setXmlStandalone(final boolean p0) throws DOMException;
    
    String getXmlVersion();
    
    void setXmlVersion(final String p0) throws DOMException;
    
    boolean getStrictErrorChecking();
    
    void setStrictErrorChecking(final boolean p0);
    
    String getDocumentURI();
    
    void setDocumentURI(final String p0);
    
    Node adoptNode(final Node p0) throws DOMException;
    
    DOMConfiguration getDomConfig();
    
    void normalizeDocument();
    
    Node renameNode(final Node p0, final String p1, final String p2) throws DOMException;
}
