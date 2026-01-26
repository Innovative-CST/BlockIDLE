package javax.sql;

import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.EventObject;

public class StatementEvent extends EventObject
{
    public StatementEvent(final PooledConnection con, final PreparedStatement statement) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public StatementEvent(final PooledConnection con, final PreparedStatement statement, final SQLException exception) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public PreparedStatement getStatement() {
        throw new RuntimeException("Stub!");
    }
    
    public SQLException getSQLException() {
        throw new RuntimeException("Stub!");
    }
}
