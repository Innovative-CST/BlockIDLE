package org.w3c.dom.ls;

import org.w3c.dom.Node;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.DOMConfiguration;

public interface LSParser
{
    public static final short ACTION_APPEND_AS_CHILDREN = 1;
    public static final short ACTION_INSERT_AFTER = 4;
    public static final short ACTION_INSERT_BEFORE = 3;
    public static final short ACTION_REPLACE = 5;
    public static final short ACTION_REPLACE_CHILDREN = 2;
    
    DOMConfiguration getDomConfig();
    
    LSParserFilter getFilter();
    
    void setFilter(final LSParserFilter p0);
    
    boolean getAsync();
    
    boolean getBusy();
    
    Document parse(final LSInput p0) throws DOMException, LSException;
    
    Document parseURI(final String p0) throws DOMException, LSException;
    
    Node parseWithContext(final LSInput p0, final Node p1, final short p2) throws DOMException, LSException;
    
    void abort();
}
