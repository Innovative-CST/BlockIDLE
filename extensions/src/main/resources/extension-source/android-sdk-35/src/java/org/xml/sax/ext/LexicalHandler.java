package org.xml.sax.ext;

import org.xml.sax.SAXException;

public interface LexicalHandler
{
    void startDTD(final String p0, final String p1, final String p2) throws SAXException;
    
    void endDTD() throws SAXException;
    
    void startEntity(final String p0) throws SAXException;
    
    void endEntity(final String p0) throws SAXException;
    
    void startCDATA() throws SAXException;
    
    void endCDATA() throws SAXException;
    
    void comment(final char[] p0, final int p1, final int p2) throws SAXException;
}
