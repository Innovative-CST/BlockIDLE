package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Map;

public interface CallableStatement extends PreparedStatement {
	void registerOutParameter(final int p0, final int p1) throws SQLException;

	void registerOutParameter(final int p0, final int p1, final int p2) throws SQLException;

	boolean wasNull() throws SQLException;

	String getString(final int p0) throws SQLException;

	boolean getBoolean(final int p0) throws SQLException;

	byte getByte(final int p0) throws SQLException;

	short getShort(final int p0) throws SQLException;

	int getInt(final int p0) throws SQLException;

	long getLong(final int p0) throws SQLException;

	float getFloat(final int p0) throws SQLException;

	double getDouble(final int p0) throws SQLException;

	@Deprecated
	BigDecimal getBigDecimal(final int p0, final int p1) throws SQLException;

	byte[] getBytes(final int p0) throws SQLException;

	Date getDate(final int p0) throws SQLException;

	Time getTime(final int p0) throws SQLException;

	Timestamp getTimestamp(final int p0) throws SQLException;

	Object getObject(final int p0) throws SQLException;

	BigDecimal getBigDecimal(final int p0) throws SQLException;

	Object getObject(final int p0, final Map<String, Class<?>> p1) throws SQLException;

	Ref getRef(final int p0) throws SQLException;

	Blob getBlob(final int p0) throws SQLException;

	Clob getClob(final int p0) throws SQLException;

	Array getArray(final int p0) throws SQLException;

	Date getDate(final int p0, final Calendar p1) throws SQLException;

	Time getTime(final int p0, final Calendar p1) throws SQLException;

	Timestamp getTimestamp(final int p0, final Calendar p1) throws SQLException;

	void registerOutParameter(final int p0, final int p1, final String p2) throws SQLException;

	void registerOutParameter(final String p0, final int p1) throws SQLException;

	void registerOutParameter(final String p0, final int p1, final int p2) throws SQLException;

	void registerOutParameter(final String p0, final int p1, final String p2) throws SQLException;

	URL getURL(final int p0) throws SQLException;

	void setURL(final String p0, final URL p1) throws SQLException;

	void setNull(final String p0, final int p1) throws SQLException;

	void setBoolean(final String p0, final boolean p1) throws SQLException;

	void setByte(final String p0, final byte p1) throws SQLException;

	void setShort(final String p0, final short p1) throws SQLException;

	void setInt(final String p0, final int p1) throws SQLException;

	void setLong(final String p0, final long p1) throws SQLException;

	void setFloat(final String p0, final float p1) throws SQLException;

	void setDouble(final String p0, final double p1) throws SQLException;

	void setBigDecimal(final String p0, final BigDecimal p1) throws SQLException;

	void setString(final String p0, final String p1) throws SQLException;

	void setBytes(final String p0, final byte[] p1) throws SQLException;

	void setDate(final String p0, final Date p1) throws SQLException;

	void setTime(final String p0, final Time p1) throws SQLException;

	void setTimestamp(final String p0, final Timestamp p1) throws SQLException;

	void setAsciiStream(final String p0, final InputStream p1, final int p2) throws SQLException;

	void setBinaryStream(final String p0, final InputStream p1, final int p2) throws SQLException;

	void setObject(final String p0, final Object p1, final int p2, final int p3) throws SQLException;

	void setObject(final String p0, final Object p1, final int p2) throws SQLException;

	void setObject(final String p0, final Object p1) throws SQLException;

	void setCharacterStream(final String p0, final Reader p1, final int p2) throws SQLException;

	void setDate(final String p0, final Date p1, final Calendar p2) throws SQLException;

	void setTime(final String p0, final Time p1, final Calendar p2) throws SQLException;

	void setTimestamp(final String p0, final Timestamp p1, final Calendar p2) throws SQLException;

	void setNull(final String p0, final int p1, final String p2) throws SQLException;

	String getString(final String p0) throws SQLException;

	boolean getBoolean(final String p0) throws SQLException;

	byte getByte(final String p0) throws SQLException;

	short getShort(final String p0) throws SQLException;

	int getInt(final String p0) throws SQLException;

	long getLong(final String p0) throws SQLException;

	float getFloat(final String p0) throws SQLException;

	double getDouble(final String p0) throws SQLException;

	byte[] getBytes(final String p0) throws SQLException;

	Date getDate(final String p0) throws SQLException;

	Time getTime(final String p0) throws SQLException;

	Timestamp getTimestamp(final String p0) throws SQLException;

	Object getObject(final String p0) throws SQLException;

	BigDecimal getBigDecimal(final String p0) throws SQLException;

	Object getObject(final String p0, final Map<String, Class<?>> p1) throws SQLException;

	Ref getRef(final String p0) throws SQLException;

	Blob getBlob(final String p0) throws SQLException;

	Clob getClob(final String p0) throws SQLException;

	Array getArray(final String p0) throws SQLException;

	Date getDate(final String p0, final Calendar p1) throws SQLException;

	Time getTime(final String p0, final Calendar p1) throws SQLException;

	Timestamp getTimestamp(final String p0, final Calendar p1) throws SQLException;

	URL getURL(final String p0) throws SQLException;

	RowId getRowId(final int p0) throws SQLException;

	RowId getRowId(final String p0) throws SQLException;

	void setRowId(final String p0, final RowId p1) throws SQLException;

	void setNString(final String p0, final String p1) throws SQLException;

	void setNCharacterStream(final String p0, final Reader p1, final long p2) throws SQLException;

	void setNClob(final String p0, final NClob p1) throws SQLException;

	void setClob(final String p0, final Reader p1, final long p2) throws SQLException;

	void setBlob(final String p0, final InputStream p1, final long p2) throws SQLException;

	void setNClob(final String p0, final Reader p1, final long p2) throws SQLException;

	NClob getNClob(final int p0) throws SQLException;

	NClob getNClob(final String p0) throws SQLException;

	void setSQLXML(final String p0, final SQLXML p1) throws SQLException;

	SQLXML getSQLXML(final int p0) throws SQLException;

	SQLXML getSQLXML(final String p0) throws SQLException;

	String getNString(final int p0) throws SQLException;

	String getNString(final String p0) throws SQLException;

	Reader getNCharacterStream(final int p0) throws SQLException;

	Reader getNCharacterStream(final String p0) throws SQLException;

	Reader getCharacterStream(final int p0) throws SQLException;

	Reader getCharacterStream(final String p0) throws SQLException;

	void setBlob(final String p0, final Blob p1) throws SQLException;

	void setClob(final String p0, final Clob p1) throws SQLException;

	void setAsciiStream(final String p0, final InputStream p1, final long p2) throws SQLException;

	void setBinaryStream(final String p0, final InputStream p1, final long p2) throws SQLException;

	void setCharacterStream(final String p0, final Reader p1, final long p2) throws SQLException;

	void setAsciiStream(final String p0, final InputStream p1) throws SQLException;

	void setBinaryStream(final String p0, final InputStream p1) throws SQLException;

	void setCharacterStream(final String p0, final Reader p1) throws SQLException;

	void setNCharacterStream(final String p0, final Reader p1) throws SQLException;

	void setClob(final String p0, final Reader p1) throws SQLException;

	void setBlob(final String p0, final InputStream p1) throws SQLException;

	void setNClob(final String p0, final Reader p1) throws SQLException;
}
