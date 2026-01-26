package java.lang.reflect;

public interface Type {
	@RecentlyNonNull
	default String getTypeName() {
		throw new RuntimeException("Stub!");
	}
}
