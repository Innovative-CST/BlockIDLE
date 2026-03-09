package javax.xml.transform.sax;

import javax.xml.transform.Templates;
import org.xml.sax.ContentHandler;

public interface TemplatesHandler extends ContentHandler
{
    Templates getTemplates();
    
    void setSystemId(final String p0);
    
    String getSystemId();
}
