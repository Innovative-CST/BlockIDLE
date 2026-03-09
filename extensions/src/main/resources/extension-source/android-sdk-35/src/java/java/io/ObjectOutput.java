package java.io;

public interface ObjectOutput extends DataOutput, AutoCloseable {
	void writeObject(final Object p0) throws IOException;

	void write(final int p0) throws IOException;

	void write(final byte[] p0) throws IOException;

	void write(final byte[] p0, final int p1, final int p2) throws IOException;

	void flush() throws IOException;

	void close() throws IOException;
}
