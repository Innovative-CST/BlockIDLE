package javax.xml.transform;

public interface SourceLocator
{
    String getPublicId();
    
    String getSystemId();
    
    int getLineNumber();
    
    int getColumnNumber();
}
