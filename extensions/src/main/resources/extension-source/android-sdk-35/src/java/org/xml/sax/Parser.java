package org.xml.sax;

import java.io.IOException;
import java.util.Locale;

@Deprecated
public interface Parser
{
    @Deprecated
    void setLocale(final Locale p0) throws SAXException;
    
    @Deprecated
    void setEntityResolver(final EntityResolver p0);
    
    @Deprecated
    void setDTDHandler(final DTDHandler p0);
    
    @Deprecated
    void setDocumentHandler(final DocumentHandler p0);
    
    @Deprecated
    void setErrorHandler(final ErrorHandler p0);
    
    @Deprecated
    void parse(final InputSource p0) throws IOException, SAXException;
    
    @Deprecated
    void parse(final String p0) throws IOException, SAXException;
}
