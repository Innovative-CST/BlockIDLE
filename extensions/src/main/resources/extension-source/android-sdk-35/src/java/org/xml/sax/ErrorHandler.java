package org.xml.sax;

public interface ErrorHandler
{
    void warning(final SAXParseException p0) throws SAXException;
    
    void error(final SAXParseException p0) throws SAXException;
    
    void fatalError(final SAXParseException p0) throws SAXException;
}
