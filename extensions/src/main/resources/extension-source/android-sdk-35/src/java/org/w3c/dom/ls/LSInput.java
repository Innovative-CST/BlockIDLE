package org.w3c.dom.ls;

import java.io.InputStream;
import java.io.Reader;

public interface LSInput
{
    Reader getCharacterStream();
    
    void setCharacterStream(final Reader p0);
    
    InputStream getByteStream();
    
    void setByteStream(final InputStream p0);
    
    String getStringData();
    
    void setStringData(final String p0);
    
    String getSystemId();
    
    void setSystemId(final String p0);
    
    String getPublicId();
    
    void setPublicId(final String p0);
    
    String getBaseURI();
    
    void setBaseURI(final String p0);
    
    String getEncoding();
    
    void setEncoding(final String p0);
    
    boolean getCertifiedText();
    
    void setCertifiedText(final boolean p0);
}
