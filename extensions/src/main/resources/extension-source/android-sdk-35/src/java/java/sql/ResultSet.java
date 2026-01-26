package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Map;

public interface ResultSet extends Wrapper, AutoCloseable {
	int CLOSE_CURSORS_AT_COMMIT = 2;
	int CONCUR_READ_ONLY = 1007;
	int CONCUR_UPDATABLE = 1008;
	int FETCH_FORWARD = 1000;
	int FETCH_REVERSE = 1001;
	int FETCH_UNKNOWN = 1002;
	int HOLD_CURSORS_OVER_COMMIT = 1;
	int TYPE_FORWARD_ONLY = 1003;
	int TYPE_SCROLL_INSENSITIVE = 1004;
	int TYPE_SCROLL_SENSITIVE = 1005;

	boolean next() throws SQLException;

	void close() throws SQLException;

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

	InputStream getAsciiStream(final int p0) throws SQLException;

	@Deprecated
	InputStream getUnicodeStream(final int p0) throws SQLException;

	InputStream getBinaryStream(final int p0) throws SQLException;

	String getString(final String p0) throws SQLException;

	boolean getBoolean(final String p0) throws SQLException;

	byte getByte(final String p0) throws SQLException;

	short getShort(final String p0) throws SQLException;

	int getInt(final String p0) throws SQLException;

	long getLong(final String p0) throws SQLException;

	float getFloat(final String p0) throws SQLException;

	double getDouble(final String p0) throws SQLException;

	@Deprecated
	BigDecimal getBigDecimal(final String p0, final int p1) throws SQLException;

	byte[] getBytes(final String p0) throws SQLException;

	Date getDate(final String p0) throws SQLException;

	Time getTime(final String p0) throws SQLException;

	Timestamp getTimestamp(final String p0) throws SQLException;

	InputStream getAsciiStream(final String p0) throws SQLException;

	@Deprecated
	InputStream getUnicodeStream(final String p0) throws SQLException;

	InputStream getBinaryStream(final String p0) throws SQLException;

	SQLWarning getWarnings() throws SQLException;

	void clearWarnings() throws SQLException;

	String getCursorName() throws SQLException;

	ResultSetMetaData getMetaData() throws SQLException;

	Object getObject(final int p0) throws SQLException;

	Object getObject(final String p0) throws SQLException;

	int findColumn(final String p0) throws SQLException;

	Reader getCharacterStream(final int p0) throws SQLException;

	Reader getCharacterStream(final String p0) throws SQLException;

	BigDecimal getBigDecimal(final int p0) throws SQLException;

	BigDecimal getBigDecimal(final String p0) throws SQLException;

	boolean isBeforeFirst() throws SQLException;

	boolean isAfterLast() throws SQLException;

	boolean isFirst() throws SQLException;

	boolean isLast() throws SQLException;

	void beforeFirst() throws SQLException;

	void afterLast() throws SQLException;

	boolean first() throws SQLException;

	boolean last() throws SQLException;

	int getRow() throws SQLException;

	boolean absolute(final int p0) throws SQLException;

	boolean relative(final int p0) throws SQLException;

	boolean previous() throws SQLException;

	void setFetchDirection(final int p0) throws SQLException;

	int getFetchDirection() throws SQLException;

	void setFetchSize(final int p0) throws SQLException;

	int getFetchSize() throws SQLException;

	int getType() throws SQLException;

	int getConcurrency() throws SQLException;

	boolean rowUpdated() throws SQLException;

	boolean rowInserted() throws SQLException;

	boolean rowDeleted() throws SQLException;

	void updateNull(final int p0) throws SQLException;

	void updateBoolean(final int p0, final boolean p1) throws SQLException;

	void updateByte(final int p0, final byte p1) throws SQLException;

	void updateShort(final int p0, final short p1) throws SQLException;

	void updateInt(final int p0, final int p1) throws SQLException;

	void updateLong(final int p0, final long p1) throws SQLException;

	void updateFloat(final int p0, final float p1) throws SQLException;

	void updateDouble(final int p0, final double p1) throws SQLException;

	void updateBigDecimal(final int p0, final BigDecimal p1) throws SQLException;

	void updateString(final int p0, final String p1) throws SQLException;

	void updateBytes(final int p0, final byte[] p1) throws SQLException;

	void updateDate(final int p0, final Date p1) throws SQLException;

	void updateTime(final int p0, final Time p1) throws SQLException;

	void updateTimestamp(final int p0, final Timestamp p1) throws SQLException;

	void updateAsciiStream(final int p0, final InputStream p1, final int p2) throws SQLException;

	void updateBinaryStream(final int p0, final InputStream p1, final int p2) throws SQLException;

	void updateCharacterStream(final int p0, final Reader p1, final int p2) throws SQLException;

	void updateObject(final int p0, final Object p1, final int p2) throws SQLException;

	void updateObject(final int p0, final Object p1) throws SQLException;

	void updateNull(final String p0) throws SQLException;

	void updateBoolean(final String p0, final boolean p1) throws SQLException;

	void updateByte(final String p0, final byte p1) throws SQLException;

	void updateShort(final String p0, final short p1) throws SQLException;

	void updateInt(final String p0, final int p1) throws SQLException;

	void updateLong(final String p0, final long p1) throws SQLException;

	void updateFloat(final String p0, final float p1) throws SQLException;

	void updateDouble(final String p0, final double p1) throws SQLException;

	void updateBigDecimal(final String p0, final BigDecimal p1) throws SQLException;

	void updateString(final String p0, final String p1) throws SQLException;

	void updateBytes(final String p0, final byte[] p1) throws SQLException;

	void updateDate(final String p0, final Date p1) throws SQLException;

	void updateTime(final String p0, final Time p1) throws SQLException;

	void updateTimestamp(final String p0, final Timestamp p1) throws SQLException;

	void updateAsciiStream(final String p0, final InputStream p1, final int p2) throws SQLException;

	void updateBinaryStream(final String p0, final InputStream p1, final int p2) throws SQLException;

	void updateCharacterStream(final String p0, final Reader p1, final int p2) throws SQLException;

	void updateObject(final String p0, final Object p1, final int p2) throws SQLException;

	void updateObject(final String p0, final Object p1) throws SQLException;

	void insertRow() throws SQLException;

	void updateRow() throws SQLException;

	void deleteRow() throws SQLException;

	void refreshRow() throws SQLException;

	void cancelRowUpdates() throws SQLException;

	void moveToInsertRow() throws SQLException;

	void moveToCurrentRow() throws SQLException;

	Statement getStatement() throws SQLException;

	Object getObject(final int p0, final Map<String, Class<?>> p1) throws SQLException;

	Ref getRef(final int p0) throws SQLException;

	Blob getBlob(final int p0) throws SQLException;

	Clob getClob(final int p0) throws SQLException;

	Array getArray(final int p0) throws SQLException;

	Object getObject(final String p0, final Map<String, Class<?>> p1) throws SQLException;

	Ref getRef(final String p0) throws SQLException;

	Blob getBlob(final String p0) throws SQLException;

	Clob getClob(final String p0) throws SQLException;

	Array getArray(final String p0) throws SQLException;

	Date getDate(final int p0, final Calendar p1) throws SQLException;

	Date getDate(final String p0, final Calendar p1) throws SQLException;

	Time getTime(final int p0, final Calendar p1) throws SQLException;

	Time getTime(final String p0, final Calendar p1) throws SQLException;

	Timestamp getTimestamp(final int p0, final Calendar p1) throws SQLException;

	Timestamp getTimestamp(final String p0, final Calendar p1) throws SQLException;

	URL getURL(final int p0) throws SQLException;

	URL getURL(final String p0) throws SQLException;

	void updateRef(final int p0, final Ref p1) throws SQLException;

	void updateRef(final String p0, final Ref p1) throws SQLException;

	void updateBlob(final int p0, final Blob p1) throws SQLException;

	void updateBlob(final String p0, final Blob p1) throws SQLException;

	void updateClob(final int p0, final Clob p1) throws SQLException;

	void updateClob(final String p0, final Clob p1) throws SQLException;

	void updateArray(final int p0, final Array p1) throws SQLException;

	void updateArray(final String p0, final Array p1) throws SQLException;

	RowId getRowId(final int p0) throws SQLException;

	RowId getRowId(final String p0) throws SQLException;

	void updateRowId(final int p0, final RowId p1) throws SQLException;

	void updateRowId(final String p0, final RowId p1) throws SQLException;

	int getHoldability() throws SQLException;

	boolean isClosed() throws SQLException;

	void updateNString(final int p0, final String p1) throws SQLException;

	void updateNString(final String p0, final String p1) throws SQLException;

	void updateNClob(final int p0, final NClob p1) throws SQLException;

	void updateNClob(final String p0, final NClob p1) throws SQLException;

	NClob getNClob(final int p0) throws SQLException;

	NClob getNClob(final String p0) throws SQLException;

	SQLXML getSQLXML(final int p0) throws SQLException;

	SQLXML getSQLXML(final String p0) throws SQLException;

	void updateSQLXML(final int p0, final SQLXML p1) throws SQLException;

	void updateSQLXML(final String p0, final SQLXML p1) throws SQLException;

	String getNString(final int p0) throws SQLException;

	String getNString(final String p0) throws SQLException;

	Reader getNCharacterStream(final int p0) throws SQLException;

	Reader getNCharacterStream(final String p0) throws SQLException;

	void updateNCharacterStream(final int p0, final Reader p1, final long p2) throws SQLException;

	void updateNCharacterStream(final String p0, final Reader p1, final long p2) throws SQLException;

	void updateAsciiStream(final int p0, final InputStream p1, final long p2) throws SQLException;

	void updateBinaryStream(final int p0, final InputStream p1, final long p2) throws SQLException;

	void updateCharacterStream(final int p0, final Reader p1, final long p2) throws SQLException;

	void updateAsciiStream(final String p0, final InputStream p1, final long p2) throws SQLException;

	void updateBinaryStream(final String p0, final InputStream p1, final long p2) throws SQLException;

	void updateCharacterStream(final String p0, final Reader p1, final long p2) throws SQLException;

	void updateBlob(final int p0, final InputStream p1, final long p2) throws SQLException;

	void updateBlob(final String p0, final InputStream p1, final long p2) throws SQLException;

	void updateClob(final int p0, final Reader p1, final long p2) throws SQLException;

	void updateClob(final String p0, final Reader p1, final long p2) throws SQLException;

	void updateNClob(final int p0, final Reader p1, final long p2) throws SQLException;

	void updateNClob(final String p0, final Reader p1, final long p2) throws SQLException;

	void updateNCharacterStream(final int p0, final Reader p1) throws SQLException;

	void updateNCharacterStream(final String p0, final Reader p1) throws SQLException;

	void updateAsciiStream(final int p0, final InputStream p1) throws SQLException;

	void updateBinaryStream(final int p0, final InputStream p1) throws SQLException;

	void updateCharacterStream(final int p0, final Reader p1) throws SQLException;

	void updateAsciiStream(final String p0, final InputStream p1) throws SQLException;

	void updateBinaryStream(final String p0, final InputStream p1) throws SQLException;

	void updateCharacterStream(final String p0, final Reader p1) throws SQLException;

	void updateBlob(final int p0, final InputStream p1) throws SQLException;

	void updateBlob(final String p0, final InputStream p1) throws SQLException;

	void updateClob(final int p0, final Reader p1) throws SQLException;

	void updateClob(final String p0, final Reader p1) throws SQLException;

	void updateNClob(final int p0, final Reader p1) throws SQLException;

	void updateNClob(final String p0, final Reader p1) throws SQLException;
}
