package org.w3c.dom.ls;

import org.w3c.dom.Node;
import org.w3c.dom.Element;

public interface LSParserFilter
{
    public static final short FILTER_ACCEPT = 1;
    public static final short FILTER_INTERRUPT = 4;
    public static final short FILTER_REJECT = 2;
    public static final short FILTER_SKIP = 3;
    
    short startElement(final Element p0);
    
    short acceptNode(final Node p0);
    
    int getWhatToShow();
}
