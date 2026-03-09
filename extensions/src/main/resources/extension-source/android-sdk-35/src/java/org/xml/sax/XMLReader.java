package org.xml.sax;

import java.io.IOException;

public interface XMLReader
{
    boolean getFeature(final String p0) throws SAXNotRecognizedException, SAXNotSupportedException;
    
    void setFeature(final String p0, final boolean p1) throws SAXNotRecognizedException, SAXNotSupportedException;
    
    Object getProperty(final String p0) throws SAXNotRecognizedException, SAXNotSupportedException;
    
    void setProperty(final String p0, final Object p1) throws SAXNotRecognizedException, SAXNotSupportedException;
    
    void setEntityResolver(final EntityResolver p0);
    
    EntityResolver getEntityResolver();
    
    void setDTDHandler(final DTDHandler p0);
    
    DTDHandler getDTDHandler();
    
    void setContentHandler(final ContentHandler p0);
    
    ContentHandler getContentHandler();
    
    void setErrorHandler(final ErrorHandler p0);
    
    ErrorHandler getErrorHandler();
    
    void parse(final InputSource p0) throws IOException, SAXException;
    
    void parse(final String p0) throws IOException, SAXException;
}
