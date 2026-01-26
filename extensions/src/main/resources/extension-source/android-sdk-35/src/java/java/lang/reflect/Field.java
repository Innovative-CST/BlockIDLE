package java.lang.reflect;

import java.lang.annotation.Annotation;

public final class Field extends AccessibleObject implements Member {
	Field() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Class<?> getDeclaringClass() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getModifiers() {
		throw new RuntimeException("Stub!");
	}

	public boolean isEnumConstant() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isSynthetic() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Class<?> getType() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Type getGenericType() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
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

	@RecentlyNullable
	public native Object get(@RecentlyNullable final Object p0) throws IllegalAccessException, IllegalArgumentException;

	public native boolean getBoolean(@RecentlyNullable final Object p0)
			throws IllegalAccessException, IllegalArgumentException;

	public native byte getByte(@RecentlyNullable final Object p0)
			throws IllegalAccessException, IllegalArgumentException;

	public native char getChar(@RecentlyNullable final Object p0)
			throws IllegalAccessException, IllegalArgumentException;

	public native short getShort(@RecentlyNullable final Object p0)
			throws IllegalAccessException, IllegalArgumentException;

	public native int getInt(@RecentlyNullable final Object p0) throws IllegalAccessException, IllegalArgumentException;

	public native long getLong(@RecentlyNullable final Object p0)
			throws IllegalAccessException, IllegalArgumentException;

	public native float getFloat(@RecentlyNullable final Object p0)
			throws IllegalAccessException, IllegalArgumentException;

	public native double getDouble(@RecentlyNullable final Object p0)
			throws IllegalAccessException, IllegalArgumentException;

	public native void set(@RecentlyNullable final Object p0, @RecentlyNullable final Object p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setBoolean(@RecentlyNullable final Object p0, final boolean p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setByte(@RecentlyNullable final Object p0, final byte p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setChar(@RecentlyNullable final Object p0, final char p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setShort(@RecentlyNullable final Object p0, final short p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setInt(@RecentlyNullable final Object p0, final int p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setLong(@RecentlyNullable final Object p0, final long p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setFloat(@RecentlyNullable final Object p0, final float p1)
			throws IllegalAccessException, IllegalArgumentException;

	public native void setDouble(@RecentlyNullable final Object p0, final double p1)
			throws IllegalAccessException, IllegalArgumentException;

	@RecentlyNullable
	@Override
	public <T extends Annotation> T getAnnotation(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T extends Annotation> T[] getAnnotationsByType(@RecentlyNonNull final Class<T> annotationClass) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean isAnnotationPresent(@RecentlyNonNull final Class<? extends Annotation> annotationType) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public native Annotation[] getDeclaredAnnotations();
}
