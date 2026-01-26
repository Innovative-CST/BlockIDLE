package java.lang;

public abstract class Record {
	protected Record() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract boolean equals(@RecentlyNullable final Object p0);

	@Override
	public abstract int hashCode();

	@RecentlyNonNull
	@Override
	public abstract String toString();
}
