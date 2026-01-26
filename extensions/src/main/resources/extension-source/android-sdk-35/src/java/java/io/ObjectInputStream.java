package java.io;

public class ObjectInputStream extends InputStream implements ObjectInput, ObjectStreamConstants {
	public ObjectInputStream(final InputStream in) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected ObjectInputStream() throws IOException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public final Object readObject() throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	protected Object readObjectOverride() throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	public Object readUnshared() throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	public void defaultReadObject() throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	public GetField readFields() throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	public void registerValidation(final ObjectInputValidation obj, final int prio)
			throws InvalidObjectException, NotActiveException {
		throw new RuntimeException("Stub!");
	}

	protected Class<?> resolveClass(final ObjectStreamClass desc) throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	protected Class<?> resolveProxyClass(final String[] interfaces) throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	protected Object resolveObject(final Object obj) throws IOException {
		throw new RuntimeException("Stub!");
	}

	protected boolean enableResolveObject(final boolean enable) throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	protected void readStreamHeader() throws IOException, StreamCorruptedException {
		throw new RuntimeException("Stub!");
	}

	protected ObjectStreamClass readClassDescriptor() throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int read(final byte[] buf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int available() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void close() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean readBoolean() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public byte readByte() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int readUnsignedByte() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public char readChar() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public short readShort() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int readUnsignedShort() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int readInt() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public long readLong() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public float readFloat() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public double readDouble() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void readFully(final byte[] buf) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void readFully(final byte[] buf, final int off, final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int skipBytes(final int len) throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@Override
	public String readLine() throws IOException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String readUTF() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public abstract static class GetField {
		public GetField() {
			throw new RuntimeException("Stub!");
		}

		public abstract ObjectStreamClass getObjectStreamClass();

		public abstract boolean defaulted(final String p0) throws IOException;

		public abstract boolean get(final String p0, final boolean p1) throws IOException;

		public abstract byte get(final String p0, final byte p1) throws IOException;

		public abstract char get(final String p0, final char p1) throws IOException;

		public abstract short get(final String p0, final short p1) throws IOException;

		public abstract int get(final String p0, final int p1) throws IOException;

		public abstract long get(final String p0, final long p1) throws IOException;

		public abstract float get(final String p0, final float p1) throws IOException;

		public abstract double get(final String p0, final double p1) throws IOException;

		public abstract Object get(final String p0, final Object p1) throws IOException;
	}
}
