package org.xml.sax.ext;

import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DefaultHandler2 extends DefaultHandler implements LexicalHandler, DeclHandler, EntityResolver2
{
    public DefaultHandler2() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startCDATA() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endCDATA() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startDTD(final String name, final String publicId, final String systemId) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endDTD() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startEntity(final String name) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endEntity(final String name) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void comment(final char[] ch, final int start, final int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void attributeDecl(final String eName, final String aName, final String type, final String mode, final String value) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void elementDecl(final String name, final String model) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void externalEntityDecl(final String name, final String publicId, final String systemId) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void internalEntityDecl(final String name, final String value) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public InputSource getExternalSubset(final String name, final String baseURI) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public InputSource resolveEntity(final String name, final String publicId, final String baseURI, final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public InputSource resolveEntity(final String publicId, final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
}
