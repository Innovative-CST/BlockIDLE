package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;

public interface SQLInput {
	String readString() throws SQLException;

	boolean readBoolean() throws SQLException;

	byte readByte() throws SQLException;

	short readShort() throws SQLException;

	int readInt() throws SQLException;

	long readLong() throws SQLException;

	float readFloat() throws SQLException;

	double readDouble() throws SQLException;

	BigDecimal readBigDecimal() throws SQLException;

	byte[] readBytes() throws SQLException;

	Date readDate() throws SQLException;

	Time readTime() throws SQLException;

	Timestamp readTimestamp() throws SQLException;

	Reader readCharacterStream() throws SQLException;

	InputStream readAsciiStream() throws SQLException;

	InputStream readBinaryStream() throws SQLException;

	Object readObject() throws SQLException;

	Ref readRef() throws SQLException;

	Blob readBlob() throws SQLException;

	Clob readClob() throws SQLException;

	Array readArray() throws SQLException;

	boolean wasNull() throws SQLException;

	URL readURL() throws SQLException;

	NClob readNClob() throws SQLException;

	String readNString() throws SQLException;

	SQLXML readSQLXML() throws SQLException;

	RowId readRowId() throws SQLException;
}
