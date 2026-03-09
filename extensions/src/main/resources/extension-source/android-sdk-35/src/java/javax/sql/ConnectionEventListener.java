package javax.sql;

import java.util.EventListener;

public interface ConnectionEventListener extends EventListener
{
    void connectionClosed(final ConnectionEvent p0);
    
    void connectionErrorOccurred(final ConnectionEvent p0);
}
