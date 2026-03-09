package java.sql;

import java.io.InputStream;
import java.io.OutputStream;

public interface Blob {
	long length() throws SQLException;

	byte[] getBytes(final long p0, final int p1) throws SQLException;

	InputStream getBinaryStream() throws SQLException;

	long position(final byte[] p0, final long p1) throws SQLException;

	long position(final Blob p0, final long p1) throws SQLException;

	int setBytes(final long p0, final byte[] p1) throws SQLException;

	int setBytes(final long p0, final byte[] p1, final int p2, final int p3) throws SQLException;

	OutputStream setBinaryStream(final long p0) throws SQLException;

	void truncate(final long p0) throws SQLException;

	void free() throws SQLException;

	InputStream getBinaryStream(final long p0, final long p1) throws SQLException;
}
