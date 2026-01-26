package org.xml.sax.helpers;

import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.InputSource;
import java.io.IOException;
import org.xml.sax.ErrorHandler;
import org.xml.sax.DocumentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import java.util.Locale;
import org.xml.sax.XMLReader;
import org.xml.sax.SAXException;
import org.xml.sax.ContentHandler;
import org.xml.sax.Parser;

public class XMLReaderAdapter implements Parser, ContentHandler
{
    public XMLReaderAdapter() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public XMLReaderAdapter(final XMLReader xmlReader) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setLocale(final Locale locale) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEntityResolver(final EntityResolver resolver) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDTDHandler(final DTDHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDocumentHandler(final DocumentHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setErrorHandler(final ErrorHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void parse(final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void parse(final InputSource input) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDocumentLocator(final Locator locator) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endDocument() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startPrefixMapping(final String prefix, final String uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endPrefixMapping(final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void startElement(final String uri, final String localName, final String qName, final Attributes atts) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endElement(final String uri, final String localName, final String qName) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void characters(final char[] ch, final int start, final int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void ignorableWhitespace(final char[] ch, final int start, final int length) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void processingInstruction(final String target, final String data) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void skippedEntity(final String name) throws SAXException {
        throw new RuntimeException("Stub!");
    }
}
