package java.lang.reflect;

public interface GenericDeclaration extends AnnotatedElement {
	@RecentlyNonNull
	TypeVariable<?>[] getTypeParameters();
}
