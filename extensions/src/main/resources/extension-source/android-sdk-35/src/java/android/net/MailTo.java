package android.net;

import java.util.Map;

public class MailTo
{
    public static final String MAILTO_SCHEME = "mailto:";
    
    MailTo() {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isMailTo(final String url) {
        throw new RuntimeException("Stub!");
    }
    
    public static MailTo parse(final String url) throws ParseException {
        throw new RuntimeException("Stub!");
    }
    
    public String getTo() {
        throw new RuntimeException("Stub!");
    }
    
    public String getCc() {
        throw new RuntimeException("Stub!");
    }
    
    public String getSubject() {
        throw new RuntimeException("Stub!");
    }
    
    public String getBody() {
        throw new RuntimeException("Stub!");
    }
    
    public Map<String, String> getHeaders() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
