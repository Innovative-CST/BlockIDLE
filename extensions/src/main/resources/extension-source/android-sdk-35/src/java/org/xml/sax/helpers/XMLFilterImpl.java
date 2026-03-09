package org.xml.sax.helpers;

import org.xml.sax.SAXParseException;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.XMLReader;
import org.xml.sax.ErrorHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.XMLFilter;

public class XMLFilterImpl implements XMLFilter, EntityResolver, DTDHandler, ContentHandler, ErrorHandler
{
    public XMLFilterImpl() {
        throw new RuntimeException("Stub!");
    }
    
    public XMLFilterImpl(final XMLReader parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setParent(final XMLReader parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public XMLReader getParent() {
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
    public void parse(final InputSource input) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void parse(final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public InputSource resolveEntity(final String publicId, final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void notationDecl(final String name, final String publicId, final String systemId) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unparsedEntityDecl(final String name, final String publicId, final String systemId, final String notationName) throws SAXException {
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
    public void startPrefixMapping(final String prefix, final String uri) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void endPrefixMapping(final String prefix) throws SAXException {
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
    
    @Override
    public void warning(final SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void error(final SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void fatalError(final SAXParseException e) throws SAXException {
        throw new RuntimeException("Stub!");
    }
}
