package javax.sql;

import java.sql.SQLException;
import java.sql.Connection;

public interface PooledConnection
{
    Connection getConnection() throws SQLException;
    
    void close() throws SQLException;
    
    void addConnectionEventListener(final ConnectionEventListener p0);
    
    void removeConnectionEventListener(final ConnectionEventListener p0);
    
    void addStatementEventListener(final StatementEventListener p0);
    
    void removeStatementEventListener(final StatementEventListener p0);
}
