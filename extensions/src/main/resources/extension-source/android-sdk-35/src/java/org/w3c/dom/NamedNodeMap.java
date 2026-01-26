package org.w3c.dom;

public interface NamedNodeMap
{
    Node getNamedItem(final String p0);
    
    Node setNamedItem(final Node p0) throws DOMException;
    
    Node removeNamedItem(final String p0) throws DOMException;
    
    Node item(final int p0);
    
    int getLength();
    
    Node getNamedItemNS(final String p0, final String p1) throws DOMException;
    
    Node setNamedItemNS(final Node p0) throws DOMException;
    
    Node removeNamedItemNS(final String p0, final String p1) throws DOMException;
}
