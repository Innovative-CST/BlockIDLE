package org.xml.sax;

public interface XMLFilter extends XMLReader
{
    void setParent(final XMLReader p0);
    
    XMLReader getParent();
}
