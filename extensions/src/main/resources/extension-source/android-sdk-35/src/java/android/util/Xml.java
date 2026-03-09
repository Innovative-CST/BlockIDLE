package android.util;

import java.io.UnsupportedEncodingException;
import org.xmlpull.v1.XmlSerializer;
import org.xmlpull.v1.XmlPullParser;
import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import org.xml.sax.SAXException;
import org.xml.sax.ContentHandler;

public class Xml
{
    public static String FEATURE_RELAXED;
    
    Xml() {
        throw new RuntimeException("Stub!");
    }
    
    public static void parse(final String xml, final ContentHandler contentHandler) throws SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public static void parse(final Reader in, final ContentHandler contentHandler) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public static void parse(final InputStream in, final Encoding encoding, final ContentHandler contentHandler) throws IOException, SAXException {
        throw new RuntimeException("Stub!");
    }
    
    public static XmlPullParser newPullParser() {
        throw new RuntimeException("Stub!");
    }
    
    public static XmlSerializer newSerializer() {
        throw new RuntimeException("Stub!");
    }
    
    public static Encoding findEncodingByName(final String encodingName) throws UnsupportedEncodingException {
        throw new RuntimeException("Stub!");
    }
    
    public static AttributeSet asAttributeSet(final XmlPullParser parser) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        Xml.FEATURE_RELAXED = "http://xmlpull.org/v1/doc/features.html#relaxed";
    }
    
    public enum Encoding
    {
        US_ASCII, 
        UTF_8, 
        UTF_16, 
        ISO_8859_1;
    }
}
