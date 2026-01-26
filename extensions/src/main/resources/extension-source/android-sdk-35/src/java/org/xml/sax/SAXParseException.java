package org.xml.sax;

public class SAXParseException extends SAXException
{
    public SAXParseException(final String message, final Locator locator) {
        throw new RuntimeException("Stub!");
    }
    
    public SAXParseException(final String message, final Locator locator, final Exception e) {
        throw new RuntimeException("Stub!");
    }
    
    public SAXParseException(final String message, final String publicId, final String systemId, final int lineNumber, final int columnNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public SAXParseException(final String message, final String publicId, final String systemId, final int lineNumber, final int columnNumber, final Exception e) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPublicId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSystemId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLineNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getColumnNumber() {
        throw new RuntimeException("Stub!");
    }
}
