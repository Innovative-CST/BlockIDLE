package org.w3c.dom;

public interface CharacterData extends Node
{
    String getData() throws DOMException;
    
    void setData(final String p0) throws DOMException;
    
    int getLength();
    
    String substringData(final int p0, final int p1) throws DOMException;
    
    void appendData(final String p0) throws DOMException;
    
    void insertData(final int p0, final String p1) throws DOMException;
    
    void deleteData(final int p0, final int p1) throws DOMException;
    
    void replaceData(final int p0, final int p1, final String p2) throws DOMException;
}
