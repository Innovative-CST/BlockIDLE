package java.io;

public interface DataInput {
	void readFully(final byte[] p0) throws IOException;

	void readFully(final byte[] p0, final int p1, final int p2) throws IOException;

	int skipBytes(final int p0) throws IOException;

	boolean readBoolean() throws IOException;

	byte readByte() throws IOException;

	int readUnsignedByte() throws IOException;

	short readShort() throws IOException;

	int readUnsignedShort() throws IOException;

	char readChar() throws IOException;

	int readInt() throws IOException;

	long readLong() throws IOException;

	float readFloat() throws IOException;

	double readDouble() throws IOException;

	String readLine() throws IOException;

	String readUTF() throws IOException;
}
