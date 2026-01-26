package org.xml.sax.helpers;

import org.xml.sax.AttributeList;
import org.xml.sax.Locator;
import org.xml.sax.InputSource;
import java.io.IOException;
import org.xml.sax.ErrorHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.Parser;
import org.xml.sax.SAXException;
import org.xml.sax.DocumentHandler;
import org.xml.sax.XMLReader;

public class ParserAdapter implements XMLReader, DocumentHandler
{
    public ParserAdapter() throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public ParserAdapter(final Parser parser) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFeature(final String name, final boolean value) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getFeature(final String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setProperty(final String name, final Object value) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getProperty(final String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEntityResolver(final EntityResolver resolver) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public EntityResolver getEntityResolver() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDTDHandler(final DTDHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public DTDHandler getDTDHandler() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setContentHandler(final ContentHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ContentHandler getContentHandler() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setErrorHandler(final ErrorHandler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ErrorHandler getErrorHandler() {
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
    public void startElement(final String qName, final AttributeList qAtts) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endElement(final String qName) throws SAXException {
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
}
