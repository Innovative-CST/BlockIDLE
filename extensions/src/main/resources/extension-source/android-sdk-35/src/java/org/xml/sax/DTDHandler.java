package org.xml.sax;

public interface DTDHandler
{
    void notationDecl(final String p0, final String p1, final String p2) throws SAXException;
    
    void unparsedEntityDecl(final String p0, final String p1, final String p2, final String p3) throws SAXException;
}
