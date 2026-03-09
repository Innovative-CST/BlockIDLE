package javax.sql;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import java.sql.SQLException;
import java.io.PrintWriter;

public interface CommonDataSource
{
    PrintWriter getLogWriter() throws SQLException;
    
    void setLogWriter(final PrintWriter p0) throws SQLException;
    
    void setLoginTimeout(final int p0) throws SQLException;
    
    int getLoginTimeout() throws SQLException;
    
    Logger getParentLogger() throws SQLFeatureNotSupportedException;
}
