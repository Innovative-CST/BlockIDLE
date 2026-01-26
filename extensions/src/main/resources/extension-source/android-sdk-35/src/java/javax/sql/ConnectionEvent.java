package javax.sql;

import java.sql.SQLException;
import java.util.EventObject;

public class ConnectionEvent extends EventObject
{
    public ConnectionEvent(final PooledConnection con) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ConnectionEvent(final PooledConnection con, final SQLException ex) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public SQLException getSQLException() {
        throw new RuntimeException("Stub!");
    }
}
