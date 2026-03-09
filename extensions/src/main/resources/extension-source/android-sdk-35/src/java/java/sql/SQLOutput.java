package java.sql;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;

public interface SQLOutput {
	void writeString(final String p0) throws SQLException;

	void writeBoolean(final boolean p0) throws SQLException;

	void writeByte(final byte p0) throws SQLException;

	void writeShort(final short p0) throws SQLException;

	void writeInt(final int p0) throws SQLException;

	void writeLong(final long p0) throws SQLException;

	void writeFloat(final float p0) throws SQLException;

	void writeDouble(final double p0) throws SQLException;

	void writeBigDecimal(final BigDecimal p0) throws SQLException;

	void writeBytes(final byte[] p0) throws SQLException;

	void writeDate(final Date p0) throws SQLException;

	void writeTime(final Time p0) throws SQLException;

	void writeTimestamp(final Timestamp p0) throws SQLException;

	void writeCharacterStream(final Reader p0) throws SQLException;

	void writeAsciiStream(final InputStream p0) throws SQLException;

	void writeBinaryStream(final InputStream p0) throws SQLException;

	void writeObject(final SQLData p0) throws SQLException;

	void writeRef(final Ref p0) throws SQLException;

	void writeBlob(final Blob p0) throws SQLException;

	void writeClob(final Clob p0) throws SQLException;

	void writeStruct(final Struct p0) throws SQLException;

	void writeArray(final Array p0) throws SQLException;

	void writeURL(final URL p0) throws SQLException;

	void writeNString(final String p0) throws SQLException;

	void writeNClob(final NClob p0) throws SQLException;

	void writeRowId(final RowId p0) throws SQLException;

	void writeSQLXML(final SQLXML p0) throws SQLException;
}
