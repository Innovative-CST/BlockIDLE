package org.xml.sax.ext;

import org.xml.sax.SAXException;

public interface DeclHandler
{
    void elementDecl(final String p0, final String p1) throws SAXException;
    
    void attributeDecl(final String p0, final String p1, final String p2, final String p3, final String p4) throws SAXException;
    
    void internalEntityDecl(final String p0, final String p1) throws SAXException;
    
    void externalEntityDecl(final String p0, final String p1, final String p2) throws SAXException;
}
