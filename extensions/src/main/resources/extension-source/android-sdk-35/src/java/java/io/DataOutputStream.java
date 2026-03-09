package java.io;

public class DataOutputStream extends FilterOutputStream implements DataOutput {
	protected int written;

	public DataOutputStream(final OutputStream out) {
		super(null);
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void write(final int b) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public synchronized void write(final byte[] b, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() throws IOException {
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

	public final int size() {
		throw new RuntimeException("Stub!");
	}
}
