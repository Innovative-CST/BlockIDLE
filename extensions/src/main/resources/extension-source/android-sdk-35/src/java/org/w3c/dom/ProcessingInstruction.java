package org.w3c.dom;

public interface ProcessingInstruction extends Node
{
    String getTarget();
    
    String getData();
    
    void setData(final String p0) throws DOMException;
}
