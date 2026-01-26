package org.w3c.dom;

public interface NameList
{
    String getName(final int p0);
    
    String getNamespaceURI(final int p0);
    
    int getLength();
    
    boolean contains(final String p0);
    
    boolean containsNS(final String p0, final String p1);
}
