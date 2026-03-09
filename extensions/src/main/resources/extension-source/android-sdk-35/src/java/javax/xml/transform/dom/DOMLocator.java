package javax.xml.transform.dom;

import org.w3c.dom.Node;
import javax.xml.transform.SourceLocator;

public interface DOMLocator extends SourceLocator
{
    Node getOriginatingNode();
}
