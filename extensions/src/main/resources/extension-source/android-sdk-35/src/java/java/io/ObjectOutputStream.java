package java.io;

public class ObjectOutputStream extends OutputStream implements ObjectOutput, ObjectStreamConstants {
	public ObjectOutputStream(final OutputStream out) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected ObjectOutputStream() throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	public void useProtocolVersion(final int version) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final void writeObject(final Object obj) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void writeObjectOverride(final Object obj) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void writeUnshared(final Object obj) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void defaultWriteObject() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public PutField putFields() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void writeFields() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public void reset() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void annotateClass(final Class<?> cl) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void annotateProxyClass(final Class<?> cl) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected Object replaceObject(final Object obj) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected boolean enableReplaceObject(final boolean enable) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	protected void writeStreamHeader() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void writeClassDescriptor(final ObjectStreamClass desc) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final int val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] buf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void write(final byte[] buf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void flush() throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected void drain() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeBoolean(final boolean val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeByte(final int val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeShort(final int val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeChar(final int val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeInt(final int val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeLong(final long val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeFloat(final float val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeDouble(final double val) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeBytes(final String str) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeChars(final String str) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void writeUTF(final String str) throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract static class PutField {
		public PutField() {
			throw new RuntimeException("Stub!");
		}

		public abstract void put(final String p0, final boolean p1);

		public abstract void put(final String p0, final byte p1);

		public abstract void put(final String p0, final char p1);

		public abstract void put(final String p0, final short p1);

		public abstract void put(final String p0, final int p1);

		public abstract void put(final String p0, final long p1);

		public abstract void put(final String p0, final float p1);

		public abstract void put(final String p0, final double p1);

		public abstract void put(final String p0, final Object p1);

		@Deprecated
		public abstract void write(final ObjectOutput p0) throws IOException;
	}
}
