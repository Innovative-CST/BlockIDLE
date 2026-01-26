package org.xmlpull.v1;

import java.util.ArrayList;
import java.util.HashMap;

public class XmlPullParserFactory
{
    public static final String PROPERTY_NAME = "org.xmlpull.v1.XmlPullParserFactory";
    protected String classNamesLocation;
    protected HashMap<String, Boolean> features;
    protected ArrayList parserClasses;
    protected ArrayList serializerClasses;
    
    protected XmlPullParserFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFeature(final String name, final boolean state) throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getFeature(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNamespaceAware(final boolean awareness) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNamespaceAware() {
        throw new RuntimeException("Stub!");
    }
    
    public void setValidating(final boolean validating) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isValidating() {
        throw new RuntimeException("Stub!");
    }
    
    public XmlPullParser newPullParser() throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public XmlSerializer newSerializer() throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public static XmlPullParserFactory newInstance() throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public static XmlPullParserFactory newInstance(final String unused, final Class unused2) throws XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
}
