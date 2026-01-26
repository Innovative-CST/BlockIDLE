package javax.xml.transform.dom;

import org.w3c.dom.Node;
import javax.xml.transform.Result;

public class DOMResult implements Result
{
    public static final String FEATURE = "http://javax.xml.transform.dom.DOMResult/feature";
    
    public DOMResult() {
        throw new RuntimeException("Stub!");
    }
    
    public DOMResult(final Node node) {
        throw new RuntimeException("Stub!");
    }
    
    public DOMResult(final Node node, final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    public DOMResult(final Node node, final Node nextSibling) {
        throw new RuntimeException("Stub!");
    }
    
    public DOMResult(final Node node, final Node nextSibling, final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setNode(final Node node) {
        throw new RuntimeException("Stub!");
    }
    
    public Node getNode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNextSibling(final Node nextSibling) {
        throw new RuntimeException("Stub!");
    }
    
    public Node getNextSibling() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSystemId(final String systemId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getSystemId() {
        throw new RuntimeException("Stub!");
    }
}
