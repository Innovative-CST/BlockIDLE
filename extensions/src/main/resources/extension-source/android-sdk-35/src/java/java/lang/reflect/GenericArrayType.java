package java.lang.reflect;

public interface GenericArrayType extends Type {
	@RecentlyNonNull
	Type getGenericComponentType();
}
