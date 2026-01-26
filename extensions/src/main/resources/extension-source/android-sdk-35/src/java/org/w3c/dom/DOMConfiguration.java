package org.w3c.dom;

public interface DOMConfiguration
{
    void setParameter(final String p0, final Object p1) throws DOMException;
    
    Object getParameter(final String p0) throws DOMException;
    
    boolean canSetParameter(final String p0, final Object p1);
    
    DOMStringList getParameterNames();
}
