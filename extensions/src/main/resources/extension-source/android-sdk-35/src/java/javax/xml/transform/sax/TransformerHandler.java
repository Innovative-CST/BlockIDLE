package javax.xml.transform.sax;

import javax.xml.transform.Transformer;
import javax.xml.transform.Result;
import org.xml.sax.DTDHandler;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.ContentHandler;

public interface TransformerHandler extends ContentHandler, LexicalHandler, DTDHandler
{
    void setResult(final Result p0) throws IllegalArgumentException;
    
    void setSystemId(final String p0);
    
    String getSystemId();
    
    Transformer getTransformer();
}
