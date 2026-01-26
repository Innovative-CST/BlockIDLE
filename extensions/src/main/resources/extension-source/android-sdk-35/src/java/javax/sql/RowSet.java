package javax.sql;

import java.net.URL;
import java.sql.NClob;
import java.sql.RowId;
import java.sql.SQLXML;
import java.util.Calendar;
import java.sql.Array;
import java.sql.Clob;
import java.sql.Blob;
import java.sql.Ref;
import java.io.Reader;
import java.io.InputStream;
import java.sql.Timestamp;
import java.sql.Time;
import java.sql.Date;
import java.math.BigDecimal;
import java.util.Map;
import java.sql.SQLException;
import java.sql.ResultSet;

public interface RowSet extends ResultSet
{
    String getUrl() throws SQLException;
    
    void setUrl(final String p0) throws SQLException;
    
    String getDataSourceName();
    
    void setDataSourceName(final String p0) throws SQLException;
    
    String getUsername();
    
    void setUsername(final String p0) throws SQLException;
    
    String getPassword();
    
    void setPassword(final String p0) throws SQLException;
    
    int getTransactionIsolation();
    
    void setTransactionIsolation(final int p0) throws SQLException;
    
    Map<String, Class<?>> getTypeMap() throws SQLException;
    
    void setTypeMap(final Map<String, Class<?>> p0) throws SQLException;
    
    String getCommand();
    
    void setCommand(final String p0) throws SQLException;
    
    boolean isReadOnly();
    
    void setReadOnly(final boolean p0) throws SQLException;
    
    int getMaxFieldSize() throws SQLException;
    
    void setMaxFieldSize(final int p0) throws SQLException;
    
    int getMaxRows() throws SQLException;
    
    void setMaxRows(final int p0) throws SQLException;
    
    boolean getEscapeProcessing() throws SQLException;
    
    void setEscapeProcessing(final boolean p0) throws SQLException;
    
    int getQueryTimeout() throws SQLException;
    
    void setQueryTimeout(final int p0) throws SQLException;
    
    void setType(final int p0) throws SQLException;
    
    void setConcurrency(final int p0) throws SQLException;
    
    void setNull(final int p0, final int p1) throws SQLException;
    
    void setNull(final String p0, final int p1) throws SQLException;
    
    void setNull(final int p0, final int p1, final String p2) throws SQLException;
    
    void setNull(final String p0, final int p1, final String p2) throws SQLException;
    
    void setBoolean(final int p0, final boolean p1) throws SQLException;
    
    void setBoolean(final String p0, final boolean p1) throws SQLException;
    
    void setByte(final int p0, final byte p1) throws SQLException;
    
    void setByte(final String p0, final byte p1) throws SQLException;
    
    void setShort(final int p0, final short p1) throws SQLException;
    
    void setShort(final String p0, final short p1) throws SQLException;
    
    void setInt(final int p0, final int p1) throws SQLException;
    
    void setInt(final String p0, final int p1) throws SQLException;
    
    void setLong(final int p0, final long p1) throws SQLException;
    
    void setLong(final String p0, final long p1) throws SQLException;
    
    void setFloat(final int p0, final float p1) throws SQLException;
    
    void setFloat(final String p0, final float p1) throws SQLException;
    
    void setDouble(final int p0, final double p1) throws SQLException;
    
    void setDouble(final String p0, final double p1) throws SQLException;
    
    void setBigDecimal(final int p0, final BigDecimal p1) throws SQLException;
    
    void setBigDecimal(final String p0, final BigDecimal p1) throws SQLException;
    
    void setString(final int p0, final String p1) throws SQLException;
    
    void setString(final String p0, final String p1) throws SQLException;
    
    void setBytes(final int p0, final byte[] p1) throws SQLException;
    
    void setBytes(final String p0, final byte[] p1) throws SQLException;
    
    void setDate(final int p0, final Date p1) throws SQLException;
    
    void setTime(final int p0, final Time p1) throws SQLException;
    
    void setTimestamp(final int p0, final Timestamp p1) throws SQLException;
    
    void setTimestamp(final String p0, final Timestamp p1) throws SQLException;
    
    void setAsciiStream(final int p0, final InputStream p1, final int p2) throws SQLException;
    
    void setAsciiStream(final String p0, final InputStream p1, final int p2) throws SQLException;
    
    void setBinaryStream(final int p0, final InputStream p1, final int p2) throws SQLException;
    
    void setBinaryStream(final String p0, final InputStream p1, final int p2) throws SQLException;
    
    void setCharacterStream(final int p0, final Reader p1, final int p2) throws SQLException;
    
    void setCharacterStream(final String p0, final Reader p1, final int p2) throws SQLException;
    
    void setAsciiStream(final int p0, final InputStream p1) throws SQLException;
    
    void setAsciiStream(final String p0, final InputStream p1) throws SQLException;
    
    void setBinaryStream(final int p0, final InputStream p1) throws SQLException;
    
    void setBinaryStream(final String p0, final InputStream p1) throws SQLException;
    
    void setCharacterStream(final int p0, final Reader p1) throws SQLException;
    
    void setCharacterStream(final String p0, final Reader p1) throws SQLException;
    
    void setNCharacterStream(final int p0, final Reader p1) throws SQLException;
    
    void setObject(final int p0, final Object p1, final int p2, final int p3) throws SQLException;
    
    void setObject(final String p0, final Object p1, final int p2, final int p3) throws SQLException;
    
    void setObject(final int p0, final Object p1, final int p2) throws SQLException;
    
    void setObject(final String p0, final Object p1, final int p2) throws SQLException;
    
    void setObject(final String p0, final Object p1) throws SQLException;
    
    void setObject(final int p0, final Object p1) throws SQLException;
    
    void setRef(final int p0, final Ref p1) throws SQLException;
    
    void setBlob(final int p0, final Blob p1) throws SQLException;
    
    void setBlob(final int p0, final InputStream p1, final long p2) throws SQLException;
    
    void setBlob(final int p0, final InputStream p1) throws SQLException;
    
    void setBlob(final String p0, final InputStream p1, final long p2) throws SQLException;
    
    void setBlob(final String p0, final Blob p1) throws SQLException;
    
    void setBlob(final String p0, final InputStream p1) throws SQLException;
    
    void setClob(final int p0, final Clob p1) throws SQLException;
    
    void setClob(final int p0, final Reader p1, final long p2) throws SQLException;
    
    void setClob(final int p0, final Reader p1) throws SQLException;
    
    void setClob(final String p0, final Reader p1, final long p2) throws SQLException;
    
    void setClob(final String p0, final Clob p1) throws SQLException;
    
    void setClob(final String p0, final Reader p1) throws SQLException;
    
    void setArray(final int p0, final Array p1) throws SQLException;
    
    void setDate(final int p0, final Date p1, final Calendar p2) throws SQLException;
    
    void setDate(final String p0, final Date p1) throws SQLException;
    
    void setDate(final String p0, final Date p1, final Calendar p2) throws SQLException;
    
    void setTime(final int p0, final Time p1, final Calendar p2) throws SQLException;
    
    void setTime(final String p0, final Time p1) throws SQLException;
    
    void setTime(final String p0, final Time p1, final Calendar p2) throws SQLException;
    
    void setTimestamp(final int p0, final Timestamp p1, final Calendar p2) throws SQLException;
    
    void setTimestamp(final String p0, final Timestamp p1, final Calendar p2) throws SQLException;
    
    void clearParameters() throws SQLException;
    
    void execute() throws SQLException;
    
    void addRowSetListener(final RowSetListener p0);
    
    void removeRowSetListener(final RowSetListener p0);
    
    void setSQLXML(final int p0, final SQLXML p1) throws SQLException;
    
    void setSQLXML(final String p0, final SQLXML p1) throws SQLException;
    
    void setRowId(final int p0, final RowId p1) throws SQLException;
    
    void setRowId(final String p0, final RowId p1) throws SQLException;
    
    void setNString(final int p0, final String p1) throws SQLException;
    
    void setNString(final String p0, final String p1) throws SQLException;
    
    void setNCharacterStream(final int p0, final Reader p1, final long p2) throws SQLException;
    
    void setNCharacterStream(final String p0, final Reader p1, final long p2) throws SQLException;
    
    void setNCharacterStream(final String p0, final Reader p1) throws SQLException;
    
    void setNClob(final String p0, final NClob p1) throws SQLException;
    
    void setNClob(final String p0, final Reader p1, final long p2) throws SQLException;
    
    void setNClob(final String p0, final Reader p1) throws SQLException;
    
    void setNClob(final int p0, final Reader p1, final long p2) throws SQLException;
    
    void setNClob(final int p0, final NClob p1) throws SQLException;
    
    void setNClob(final int p0, final Reader p1) throws SQLException;
    
    void setURL(final int p0, final URL p1) throws SQLException;
}
