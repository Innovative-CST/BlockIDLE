package org.xml.sax.ext;

import org.xml.sax.Attributes;

public interface Attributes2 extends Attributes
{
    boolean isDeclared(final int p0);
    
    boolean isDeclared(final String p0);
    
    boolean isDeclared(final String p0, final String p1);
    
    boolean isSpecified(final int p0);
    
    boolean isSpecified(final String p0, final String p1);
    
    boolean isSpecified(final String p0);
}
