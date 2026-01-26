package org.w3c.dom;

public interface Text extends CharacterData
{
    Text splitText(final int p0) throws DOMException;
    
    boolean isElementContentWhitespace();
    
    String getWholeText();
    
    Text replaceWholeText(final String p0) throws DOMException;
}
