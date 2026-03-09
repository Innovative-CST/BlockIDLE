package java.sql;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public interface Clob {
	long length() throws SQLException;

	String getSubString(final long p0, final int p1) throws SQLException;

	Reader getCharacterStream() throws SQLException;

	InputStream getAsciiStream() throws SQLException;

	long position(final String p0, final long p1) throws SQLException;

	long position(final Clob p0, final long p1) throws SQLException;

	int setString(final long p0, final String p1) throws SQLException;

	int setString(final long p0, final String p1, final int p2, final int p3) throws SQLException;

	OutputStream setAsciiStream(final long p0) throws SQLException;

	Writer setCharacterStream(final long p0) throws SQLException;

	void truncate(final long p0) throws SQLException;

	void free() throws SQLException;

	Reader getCharacterStream(final long p0, final long p1) throws SQLException;
}
