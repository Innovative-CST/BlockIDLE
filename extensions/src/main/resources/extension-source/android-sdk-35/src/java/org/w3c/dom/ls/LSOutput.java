package org.w3c.dom.ls;

import java.io.OutputStream;
import java.io.Writer;

public interface LSOutput
{
    Writer getCharacterStream();
    
    void setCharacterStream(final Writer p0);
    
    OutputStream getByteStream();
    
    void setByteStream(final OutputStream p0);
    
    String getSystemId();
    
    void setSystemId(final String p0);
    
    String getEncoding();
    
    void setEncoding(final String p0);
}
