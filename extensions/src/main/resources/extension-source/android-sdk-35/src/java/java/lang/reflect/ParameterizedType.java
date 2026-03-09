package java.lang.reflect;

public interface ParameterizedType extends Type {
	@RecentlyNonNull
	Type[] getActualTypeArguments();

	@RecentlyNonNull
	Type getRawType();

	@RecentlyNullable
	Type getOwnerType();
}
