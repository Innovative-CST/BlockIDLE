package org.xmlpull.v1.sax2;

import org.xml.sax.SAXException;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.DTDHandler;
import org.xml.sax.EntityResolver;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.SAXNotRecognizedException;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import org.xml.sax.ErrorHandler;
import org.xml.sax.ContentHandler;
import org.xml.sax.Attributes;
import org.xml.sax.XMLReader;
import org.xml.sax.Locator;

public class Driver implements Locator, XMLReader, Attributes
{
    protected static final String APACHE_DYNAMIC_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/dynamic";
    protected static final String APACHE_SCHEMA_VALIDATION_FEATURE = "http://apache.org/xml/features/validation/schema";
    protected static final String DECLARATION_HANDLER_PROPERTY = "http://xml.org/sax/properties/declaration-handler";
    protected static final String LEXICAL_HANDLER_PROPERTY = "http://xml.org/sax/properties/lexical-handler";
    protected static final String NAMESPACES_FEATURE = "http://xml.org/sax/features/namespaces";
    protected static final String NAMESPACE_PREFIXES_FEATURE = "http://xml.org/sax/features/namespace-prefixes";
    protected static final String VALIDATION_FEATURE = "http://xml.org/sax/features/validation";
    protected ContentHandler contentHandler;
    protected ErrorHandler errorHandler;
    protected XmlPullParser pp;
    protected String systemId;
    
    public Driver() throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public Driver(final XmlPullParser pp) throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLength() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getURI(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getLocalName(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getQName(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getValue(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIndex(final String uri, final String localName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIndex(final String qName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType(final String uri, final String localName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getType(final String qName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getValue(final String uri, final String localName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getValue(final String qName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getPublicId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getSystemId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLineNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getColumnNumber() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getFeature(final String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFeature(final String name, final boolean value) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getProperty(final String name) throws SAXNotRecognizedException, SAXNotSupportedException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setProperty(final String name, final Object value) throws SAXNotRecognizedException, SAXNotSupportedException {
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
    public void parse(final InputSource source) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void parse(final String systemId) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public void parseSubTree(final XmlPullParser pp) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    protected void startElement(final String namespace, final String localName, final String qName) throws SAXException {
        throw new RuntimeException("Stub!");
    }
}
