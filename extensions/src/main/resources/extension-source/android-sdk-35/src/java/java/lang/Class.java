package java.lang;

import java.io.InputStream;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.invoke.TypeDescriptor;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URL;
import java.security.ProtectionDomain;

public final class Class<T>
		implements Serializable, GenericDeclaration, Type, AnnotatedElement, TypeDescriptor.OfField<Class<?>> {
	Class() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String toGenericString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Class<?> forName(@RecentlyNonNull final String className) throws ClassNotFoundException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Class<?> forName(@RecentlyNonNull final String name, final boolean initialize,
			@RecentlyNullable final ClassLoader loader) throws ClassNotFoundException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	@RecentlyNonNull
	public native T newInstance() throws IllegalAccessException, InstantiationException;

	public boolean isInstance(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public boolean isAssignableFrom(@RecentlyNonNull final Class<?> cls) {
		throw new RuntimeException("Stub!");
	}

	public boolean isInterface() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isPrimitive() {
		throw new RuntimeException("Stub!");
	}

	public boolean isAnnotation() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSynthetic() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public ClassLoader getClassLoader() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public synchronized TypeVariable<Class<T>>[] getTypeParameters() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Class<? super T> getSuperclass() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Type getGenericSuperclass() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Package getPackage() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getPackageName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?>[] getInterfaces() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Type[] getGenericInterfaces() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Class<?> getComponentType() {
		throw new RuntimeException("Stub!");
	}

	public int getModifiers() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Object[] getSigners() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Method getEnclosingMethod() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Constructor<?> getEnclosingConstructor() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public native Class<?> getDeclaringClass();

	@RecentlyNullable
	public native Class<?> getEnclosingClass();

	@RecentlyNonNull
	public String getSimpleName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String getTypeName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getCanonicalName() {
		throw new RuntimeException("Stub!");
	}

	public native boolean isAnonymousClass();

	public boolean isLocalClass() {
		throw new RuntimeException("Stub!");
	}

	public boolean isMemberClass() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?>[] getClasses() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Field[] getFields() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Method[] getMethods() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Constructor<?>[] getConstructors() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Field getField(@RecentlyNonNull final String name) throws NoSuchFieldException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Method getMethod(@RecentlyNonNull final String name, @RecentlyNullable final Class<?>... parameterTypes)
			throws NoSuchMethodException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Constructor<T> getConstructor(@RecentlyNullable final Class<?>... parameterTypes)
			throws NoSuchMethodException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public native Class<?>[] getDeclaredClasses();

	@RecentlyNonNull
	public native Field[] getDeclaredFields();

	@RecentlyNullable
	public RecordComponent[] getRecordComponents() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Method[] getDeclaredMethods() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Constructor<?>[] getDeclaredConstructors() throws SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public native Field getDeclaredField(@RecentlyNonNull final String p0) throws NoSuchFieldException;

	@RecentlyNonNull
	public Method getDeclaredMethod(@RecentlyNonNull final String name,
			@RecentlyNullable final Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Constructor<T> getDeclaredConstructor(@RecentlyNullable final Class<?>... parameterTypes)
			throws NoSuchMethodException, SecurityException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public InputStream getResourceAsStream(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public URL getResource(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public ProtectionDomain getProtectionDomain() {
		throw new RuntimeException("Stub!");
	}

	public boolean desiredAssertionStatus() {
		throw new RuntimeException("Stub!");
	}

	public boolean isEnum() {
		throw new RuntimeException("Stub!");
	}

	public boolean isRecord() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public T[] getEnumConstants() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public T cast(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public <U> Class<? extends U> asSubclass(@RecentlyNonNull final Class<U> clazz) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public <A extends Annotation> A getAnnotation(@RecentlyNonNull final Class<A> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAnnotationPresent(@RecentlyNonNull final Class<? extends Annotation> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public <A extends Annotation> A[] getAnnotationsByType(@RecentlyNonNull final Class<A> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public <A extends Annotation> A[] getDeclaredAnnotationsByType(@RecentlyNonNull final Class<A> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Annotation[] getAnnotations() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public native <A extends Annotation> A getDeclaredAnnotation(@RecentlyNonNull final Class<A> p0);

	@RecentlyNonNull
	@Override
	public native Annotation[] getDeclaredAnnotations();

	@RecentlyNonNull
	public Class<?> getNestHost() {
		throw new RuntimeException("Stub!");
	}

	public boolean isNestmateOf(@RecentlyNonNull final Class<?> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?>[] getNestMembers() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String descriptorString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	@Override
	public Class<?> componentType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Class<?> arrayType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public Class<?>[] getPermittedSubclasses() {
		throw new RuntimeException("Stub!");
	}

	public boolean isSealed() {
		throw new RuntimeException("Stub!");
	}
}
