package org.xmlpull.v1;

import java.io.Writer;
import java.io.IOException;
import java.io.OutputStream;

public interface XmlSerializer
{
    void setFeature(final String p0, final boolean p1) throws IllegalArgumentException, IllegalStateException;
    
    boolean getFeature(final String p0);
    
    void setProperty(final String p0, final Object p1) throws IllegalArgumentException, IllegalStateException;
    
    Object getProperty(final String p0);
    
    void setOutput(final OutputStream p0, final String p1) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void setOutput(final Writer p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void startDocument(final String p0, final Boolean p1) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void endDocument() throws IOException, IllegalArgumentException, IllegalStateException;
    
    void setPrefix(final String p0, final String p1) throws IOException, IllegalArgumentException, IllegalStateException;
    
    String getPrefix(final String p0, final boolean p1) throws IllegalArgumentException;
    
    int getDepth();
    
    String getNamespace();
    
    String getName();
    
    XmlSerializer startTag(final String p0, final String p1) throws IOException, IllegalArgumentException, IllegalStateException;
    
    XmlSerializer attribute(final String p0, final String p1, final String p2) throws IOException, IllegalArgumentException, IllegalStateException;
    
    XmlSerializer endTag(final String p0, final String p1) throws IOException, IllegalArgumentException, IllegalStateException;
    
    XmlSerializer text(final String p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    XmlSerializer text(final char[] p0, final int p1, final int p2) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void cdsect(final String p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void entityRef(final String p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void processingInstruction(final String p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void comment(final String p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void docdecl(final String p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void ignorableWhitespace(final String p0) throws IOException, IllegalArgumentException, IllegalStateException;
    
    void flush() throws IOException;
}
