package org.xml.sax;

public interface Attributes
{
    int getLength();
    
    String getURI(final int p0);
    
    String getLocalName(final int p0);
    
    String getQName(final int p0);
    
    String getType(final int p0);
    
    String getValue(final int p0);
    
    int getIndex(final String p0, final String p1);
    
    int getIndex(final String p0);
    
    String getType(final String p0, final String p1);
    
    String getType(final String p0);
    
    String getValue(final String p0, final String p1);
    
    String getValue(final String p0);
}
