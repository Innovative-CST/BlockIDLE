package javax.net.ssl;

import java.util.EventObject;

public class SSLSessionBindingEvent extends EventObject
{
    public SSLSessionBindingEvent(final SSLSession session, final String name) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public SSLSession getSession() {
        throw new RuntimeException("Stub!");
    }
}
