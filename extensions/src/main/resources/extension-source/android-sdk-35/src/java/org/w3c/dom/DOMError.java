package org.w3c.dom;

public interface DOMError
{
    public static final short SEVERITY_ERROR = 2;
    public static final short SEVERITY_FATAL_ERROR = 3;
    public static final short SEVERITY_WARNING = 1;
    
    short getSeverity();
    
    String getMessage();
    
    String getType();
    
    Object getRelatedException();
    
    Object getRelatedData();
    
    DOMLocator getLocation();
}
