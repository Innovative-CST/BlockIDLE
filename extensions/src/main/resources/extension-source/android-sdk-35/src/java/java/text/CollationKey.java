package java.text;

public abstract class CollationKey implements Comparable<CollationKey> {
	protected CollationKey(final String source) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract int compareTo(final CollationKey p0);

	public String getSourceString() {
		throw new RuntimeException("Stub!");
	}

	public abstract byte[] toByteArray();
}
