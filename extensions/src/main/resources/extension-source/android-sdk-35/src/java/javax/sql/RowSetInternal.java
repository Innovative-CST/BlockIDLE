package javax.sql;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;

public interface RowSetInternal
{
    Object[] getParams() throws SQLException;
    
    Connection getConnection() throws SQLException;
    
    void setMetaData(final RowSetMetaData p0) throws SQLException;
    
    ResultSet getOriginal() throws SQLException;
    
    ResultSet getOriginalRow() throws SQLException;
}
