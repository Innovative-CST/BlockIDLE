package java.lang.reflect;

public interface Member {
	int DECLARED = 1;
	int PUBLIC = 0;

	@RecentlyNonNull
	Class<?> getDeclaringClass();

	@RecentlyNonNull
	String getName();

	int getModifiers();

	boolean isSynthetic();
}
