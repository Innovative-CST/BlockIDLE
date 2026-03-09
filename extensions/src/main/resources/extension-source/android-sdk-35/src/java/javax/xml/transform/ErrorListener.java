package javax.xml.transform;

public interface ErrorListener
{
    void warning(final TransformerException p0) throws TransformerException;
    
    void error(final TransformerException p0) throws TransformerException;
    
    void fatalError(final TransformerException p0) throws TransformerException;
}
