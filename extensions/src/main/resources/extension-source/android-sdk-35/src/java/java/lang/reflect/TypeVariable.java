package java.lang.reflect;

public interface TypeVariable<D extends GenericDeclaration> extends Type {
	@RecentlyNonNull
	Type[] getBounds();

	@RecentlyNonNull
	D getGenericDeclaration();

	@RecentlyNonNull
	String getName();
}
