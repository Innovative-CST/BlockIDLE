package org.w3c.dom;

public interface Element extends Node
{
    String getTagName();
    
    String getAttribute(final String p0);
    
    void setAttribute(final String p0, final String p1) throws DOMException;
    
    void removeAttribute(final String p0) throws DOMException;
    
    Attr getAttributeNode(final String p0);
    
    Attr setAttributeNode(final Attr p0) throws DOMException;
    
    Attr removeAttributeNode(final Attr p0) throws DOMException;
    
    NodeList getElementsByTagName(final String p0);
    
    String getAttributeNS(final String p0, final String p1) throws DOMException;
    
    void setAttributeNS(final String p0, final String p1, final String p2) throws DOMException;
    
    void removeAttributeNS(final String p0, final String p1) throws DOMException;
    
    Attr getAttributeNodeNS(final String p0, final String p1) throws DOMException;
    
    Attr setAttributeNodeNS(final Attr p0) throws DOMException;
    
    NodeList getElementsByTagNameNS(final String p0, final String p1) throws DOMException;
    
    boolean hasAttribute(final String p0);
    
    boolean hasAttributeNS(final String p0, final String p1) throws DOMException;
    
    TypeInfo getSchemaTypeInfo();
    
    void setIdAttribute(final String p0, final boolean p1) throws DOMException;
    
    void setIdAttributeNS(final String p0, final String p1, final boolean p2) throws DOMException;
    
    void setIdAttributeNode(final Attr p0, final boolean p1) throws DOMException;
}
