package javax.xml.transform.sax;

import org.xml.sax.XMLFilter;
import javax.xml.transform.Templates;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerFactory;

public abstract class SAXTransformerFactory extends TransformerFactory
{
    public static final String FEATURE = "http://javax.xml.transform.sax.SAXTransformerFactory/feature";
    public static final String FEATURE_XMLFILTER = "http://javax.xml.transform.sax.SAXTransformerFactory/feature/xmlfilter";
    
    protected SAXTransformerFactory() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract TransformerHandler newTransformerHandler(final Source p0) throws TransformerConfigurationException;
    
    public abstract TransformerHandler newTransformerHandler(final Templates p0) throws TransformerConfigurationException;
    
    public abstract TransformerHandler newTransformerHandler() throws TransformerConfigurationException;
    
    public abstract TemplatesHandler newTemplatesHandler() throws TransformerConfigurationException;
    
    public abstract XMLFilter newXMLFilter(final Source p0) throws TransformerConfigurationException;
    
    public abstract XMLFilter newXMLFilter(final Templates p0) throws TransformerConfigurationException;
}
