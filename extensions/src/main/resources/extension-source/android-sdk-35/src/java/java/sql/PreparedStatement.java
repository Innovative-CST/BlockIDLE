package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;

public interface PreparedStatement extends Statement {
	ResultSet executeQuery() throws SQLException;

	int executeUpdate() throws SQLException;

	void setNull(final int p0, final int p1) throws SQLException;

	void setBoolean(final int p0, final boolean p1) throws SQLException;

	void setByte(final int p0, final byte p1) throws SQLException;

	void setShort(final int p0, final short p1) throws SQLException;

	void setInt(final int p0, final int p1) throws SQLException;

	void setLong(final int p0, final long p1) throws SQLException;

	void setFloat(final int p0, final float p1) throws SQLException;

	void setDouble(final int p0, final double p1) throws SQLException;

	void setBigDecimal(final int p0, final BigDecimal p1) throws SQLException;

	void setString(final int p0, final String p1) throws SQLException;

	void setBytes(final int p0, final byte[] p1) throws SQLException;

	void setDate(final int p0, final Date p1) throws SQLException;

	void setTime(final int p0, final Time p1) throws SQLException;

	void setTimestamp(final int p0, final Timestamp p1) throws SQLException;

	void setAsciiStream(final int p0, final InputStream p1, final int p2) throws SQLException;

	@Deprecated
	void setUnicodeStream(final int p0, final InputStream p1, final int p2) throws SQLException;

	void setBinaryStream(final int p0, final InputStream p1, final int p2) throws SQLException;

	void clearParameters() throws SQLException;

	void setObject(final int p0, final Object p1, final int p2) throws SQLException;

	void setObject(final int p0, final Object p1) throws SQLException;

	boolean execute() throws SQLException;

	void addBatch() throws SQLException;

	void setCharacterStream(final int p0, final Reader p1, final int p2) throws SQLException;

	void setRef(final int p0, final Ref p1) throws SQLException;

	void setBlob(final int p0, final Blob p1) throws SQLException;

	void setClob(final int p0, final Clob p1) throws SQLException;

	void setArray(final int p0, final Array p1) throws SQLException;

	ResultSetMetaData getMetaData() throws SQLException;

	void setDate(final int p0, final Date p1, final Calendar p2) throws SQLException;

	void setTime(final int p0, final Time p1, final Calendar p2) throws SQLException;

	void setTimestamp(final int p0, final Timestamp p1, final Calendar p2) throws SQLException;

	void setNull(final int p0, final int p1, final String p2) throws SQLException;

	void setURL(final int p0, final URL p1) throws SQLException;

	ParameterMetaData getParameterMetaData() throws SQLException;

	void setRowId(final int p0, final RowId p1) throws SQLException;

	void setNString(final int p0, final String p1) throws SQLException;

	void setNCharacterStream(final int p0, final Reader p1, final long p2) throws SQLException;

	void setNClob(final int p0, final NClob p1) throws SQLException;

	void setClob(final int p0, final Reader p1, final long p2) throws SQLException;

	void setBlob(final int p0, final InputStream p1, final long p2) throws SQLException;

	void setNClob(final int p0, final Reader p1, final long p2) throws SQLException;

	void setSQLXML(final int p0, final SQLXML p1) throws SQLException;

	void setObject(final int p0, final Object p1, final int p2, final int p3) throws SQLException;

	void setAsciiStream(final int p0, final InputStream p1, final long p2) throws SQLException;

	void setBinaryStream(final int p0, final InputStream p1, final long p2) throws SQLException;

	void setCharacterStream(final int p0, final Reader p1, final long p2) throws SQLException;

	void setAsciiStream(final int p0, final InputStream p1) throws SQLException;

	void setBinaryStream(final int p0, final InputStream p1) throws SQLException;

	void setCharacterStream(final int p0, final Reader p1) throws SQLException;

	void setNCharacterStream(final int p0, final Reader p1) throws SQLException;

	void setClob(final int p0, final Reader p1) throws SQLException;

	void setBlob(final int p0, final InputStream p1) throws SQLException;

	void setNClob(final int p0, final Reader p1) throws SQLException;
}
