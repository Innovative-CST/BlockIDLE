package javax.sql;

import java.sql.SQLException;
import java.sql.ResultSetMetaData;

public interface RowSetMetaData extends ResultSetMetaData
{
    void setColumnCount(final int p0) throws SQLException;
    
    void setAutoIncrement(final int p0, final boolean p1) throws SQLException;
    
    void setCaseSensitive(final int p0, final boolean p1) throws SQLException;
    
    void setSearchable(final int p0, final boolean p1) throws SQLException;
    
    void setCurrency(final int p0, final boolean p1) throws SQLException;
    
    void setNullable(final int p0, final int p1) throws SQLException;
    
    void setSigned(final int p0, final boolean p1) throws SQLException;
    
    void setColumnDisplaySize(final int p0, final int p1) throws SQLException;
    
    void setColumnLabel(final int p0, final String p1) throws SQLException;
    
    void setColumnName(final int p0, final String p1) throws SQLException;
    
    void setSchemaName(final int p0, final String p1) throws SQLException;
    
    void setPrecision(final int p0, final int p1) throws SQLException;
    
    void setScale(final int p0, final int p1) throws SQLException;
    
    void setTableName(final int p0, final String p1) throws SQLException;
    
    void setCatalogName(final int p0, final String p1) throws SQLException;
    
    void setColumnType(final int p0, final int p1) throws SQLException;
    
    void setColumnTypeName(final int p0, final String p1) throws SQLException;
}
