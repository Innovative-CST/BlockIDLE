package java.io;

public class DataInputStream extends FilterInputStream implements DataInput {
	public DataInputStream(final InputStream in) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int read(final byte[] b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final int read(final byte[] b, final int off, final int len) throws IOException {
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
	public final int skipBytes(final int n) throws IOException {
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

	@Deprecated
	@Override
	public final String readLine() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final String readUTF() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static final String readUTF(final DataInput in) throws IOException {
		throw new RuntimeException("Stub!");
	}
}
