package java.io;

import java.nio.channels.FileChannel;

public class RandomAccessFile implements DataOutput, DataInput, Closeable {
	public RandomAccessFile(final String name, final String mode) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public RandomAccessFile(final File file, final String mode) throws FileNotFoundException {
		throw new RuntimeException("Stub!");
	}

	public final FileDescriptor getFD() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public final FileChannel getChannel() {
		throw new RuntimeException("Stub!");
	}

	public int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int read(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public int read(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void readFully(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void readFully(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int skipBytes(final int n) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public long getFilePointer() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void seek(final long pos) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public long length() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void setLength(final long newLength) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final boolean readBoolean() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final byte readByte() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int readUnsignedByte() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final short readShort() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int readUnsignedShort() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final char readChar() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int readInt() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final long readLong() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final float readFloat() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final double readDouble() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final String readLine() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final String readUTF() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeBoolean(final boolean v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeByte(final int v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeShort(final int v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeChar(final int v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeInt(final int v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeLong(final long v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeFloat(final float v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeDouble(final double v) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeBytes(final String s) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeChars(final String s) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeUTF(final String str) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	protected void finalize() throws Throwable {
		throw new RuntimeException("Stub!");
	}
}
