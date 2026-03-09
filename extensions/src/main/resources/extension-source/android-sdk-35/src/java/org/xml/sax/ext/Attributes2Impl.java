package org.xml.sax.ext;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.AttributesImpl;

public class Attributes2Impl extends AttributesImpl implements Attributes2
{
    public Attributes2Impl() {
        throw new RuntimeException("Stub!");
    }
    
    public Attributes2Impl(final Attributes atts) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isDeclared(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isDeclared(final String uri, final String localName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isDeclared(final String qName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isSpecified(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isSpecified(final String uri, final String localName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isSpecified(final String qName) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAttributes(final Attributes atts) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addAttribute(final String uri, final String localName, final String qName, final String type, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeAttribute(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDeclared(final int index, final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSpecified(final int index, final boolean value) {
        throw new RuntimeException("Stub!");
    }
}
