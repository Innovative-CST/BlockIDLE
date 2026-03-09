package java.io;

public interface ObjectInput extends DataInput, AutoCloseable {
	Object readObject() throws ClassNotFoundException, IOException;

	int read() throws IOException;

	int read(final byte[] p0) throws IOException;

	int read(final byte[] p0, final int p1, final int p2) throws IOException;

	long skip(final long p0) throws IOException;

	int available() throws IOException;

	void close() throws IOException;
}
