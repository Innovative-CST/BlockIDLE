package javax.xml.transform;

public interface Result
{
    public static final String PI_DISABLE_OUTPUT_ESCAPING = "javax.xml.transform.disable-output-escaping";
    public static final String PI_ENABLE_OUTPUT_ESCAPING = "javax.xml.transform.enable-output-escaping";
    
    void setSystemId(final String p0);
    
    String getSystemId();
}
