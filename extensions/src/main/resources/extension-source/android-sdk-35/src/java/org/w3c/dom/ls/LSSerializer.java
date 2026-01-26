package org.w3c.dom.ls;

import org.w3c.dom.DOMException;
import org.w3c.dom.Node;
import org.w3c.dom.DOMConfiguration;

public interface LSSerializer
{
    DOMConfiguration getDomConfig();
    
    String getNewLine();
    
    void setNewLine(final String p0);
    
    boolean write(final Node p0, final LSOutput p1) throws LSException;
    
    boolean writeToURI(final Node p0, final String p1) throws LSException;
    
    String writeToString(final Node p0) throws DOMException, LSException;
}
