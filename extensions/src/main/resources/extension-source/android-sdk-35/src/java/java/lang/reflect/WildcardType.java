package java.lang.reflect;

public interface WildcardType extends Type {
	@RecentlyNonNull
	Type[] getUpperBounds();

	@RecentlyNonNull
	Type[] getLowerBounds();
}
