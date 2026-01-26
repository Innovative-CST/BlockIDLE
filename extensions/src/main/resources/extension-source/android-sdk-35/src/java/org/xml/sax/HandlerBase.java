package org.xml.sax;

@Deprecated
public class HandlerBase implements EntityResolver, DTDHandler, DocumentHandler, ErrorHandler
{
    @Deprecated
    public HandlerBase() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public InputSource resolveEntity(final String publicId, final String systemId) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void notationDecl(final String name, final String publicId, final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void unparsedEntityDecl(final String name, final String publicId, final String systemId, final String notationName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void setDocumentLocator(final Locator locator) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void startDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void endDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void startElement(final String name, final AttributeList attributes) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void endElement(final String name) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void characters(final char[] ch, final int start, final int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void ignorableWhitespace(final char[] ch, final int start, final int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void processingInstruction(final String target, final String data) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void warning(final SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void error(final SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void fatalError(final SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
}
