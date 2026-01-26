package java.lang.runtime;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.TypeDescriptor;

public class ObjectMethods {
	ObjectMethods() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Object bootstrap(@RecentlyNonNull final MethodHandles.Lookup lookup,
			@RecentlyNonNull final String methodName, @RecentlyNonNull final TypeDescriptor type,
			@RecentlyNonNull final Class<?> recordClass, @RecentlyNullable final String names,
			@RecentlyNonNull final MethodHandle... getters) throws Throwable {
		throw new RuntimeException("Stub!");
	}
}
