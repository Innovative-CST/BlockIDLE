package java.io;

public class ObjectStreamClass implements Serializable {
	public static final ObjectStreamField[] NO_FIELDS;

	ObjectStreamClass() {
		throw new RuntimeException("Stub!");
	}

	public static ObjectStreamClass lookup(final Class<?> cl) {
		throw new RuntimeException("Stub!");
	}

	public static ObjectStreamClass lookupAny(final Class<?> cl) {
		throw new RuntimeException("Stub!");
	}

	public String getName() {
		throw new RuntimeException("Stub!");
	}

	public long getSerialVersionUID() {
		throw new RuntimeException("Stub!");
	}

	public Class<?> forClass() {
		throw new RuntimeException("Stub!");
	}

	public ObjectStreamField[] getFields() {
		throw new RuntimeException("Stub!");
	}

	public ObjectStreamField getField(final String name) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		NO_FIELDS = null;
	}
}
