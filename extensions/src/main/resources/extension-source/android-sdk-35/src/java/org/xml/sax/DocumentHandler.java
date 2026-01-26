package org.xml.sax;

@Deprecated
public interface DocumentHandler
{
    @Deprecated
    void setDocumentLocator(final Locator p0);
    
    @Deprecated
    void startDocument() throws SAXException;
    
    @Deprecated
    void endDocument() throws SAXException;
    
    @Deprecated
    void startElement(final String p0, final AttributeList p1) throws SAXException;
    
    @Deprecated
    void endElement(final String p0) throws SAXException;
    
    @Deprecated
    void characters(final char[] p0, final int p1, final int p2) throws SAXException;
    
    @Deprecated
    void ignorableWhitespace(final char[] p0, final int p1, final int p2) throws SAXException;
    
    @Deprecated
    void processingInstruction(final String p0, final String p1) throws SAXException;
}
