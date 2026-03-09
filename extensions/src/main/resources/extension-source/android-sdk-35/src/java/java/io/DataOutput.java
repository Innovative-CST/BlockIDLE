package java.io;

public interface DataOutput {
	void write(final int p0) throws IOException;

	void write(final byte[] p0) throws IOException;

	void write(final byte[] p0, final int p1, final int p2) throws IOException;

	void writeBoolean(final boolean p0) throws IOException;

	void writeByte(final int p0) throws IOException;

	void writeShort(final int p0) throws IOException;

	void writeChar(final int p0) throws IOException;

	void writeInt(final int p0) throws IOException;

	void writeLong(final long p0) throws IOException;

	void writeFloat(final float p0) throws IOException;

	void writeDouble(final double p0) throws IOException;

	void writeBytes(final String p0) throws IOException;

	void writeChars(final String p0) throws IOException;

	void writeUTF(final String p0) throws IOException;
}
