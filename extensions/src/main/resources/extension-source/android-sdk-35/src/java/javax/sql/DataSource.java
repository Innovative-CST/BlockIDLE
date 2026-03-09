package javax.sql;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Wrapper;

public interface DataSource extends CommonDataSource, Wrapper
{
    Connection getConnection() throws SQLException;
    
    Connection getConnection(final String p0, final String p1) throws SQLException;
}
