package javax.xml.transform.dom;

import org.w3c.dom.Node;
import javax.xml.transform.Source;

public class DOMSource implements Source
{
    public static final String FEATURE = "http://javax.xml.transform.dom.DOMSource/feature";
    
    public DOMSource() {
        throw new RuntimeException("Stub!");
    }
    
    public DOMSource(final Node n) {
        throw new RuntimeException("Stub!");
    }
    
    public DOMSource(final Node node, final String systemID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNode(final Node node) {
        throw new RuntimeException("Stub!");
    }
    
    public Node getNode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSystemId(final String systemID) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getSystemId() {
        throw new RuntimeException("Stub!");
    }
}
