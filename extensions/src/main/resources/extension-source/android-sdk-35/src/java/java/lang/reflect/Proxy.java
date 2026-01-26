package java.lang.reflect;

import java.io.Serializable;

public class Proxy implements Serializable {
	protected InvocationHandler h;

	protected Proxy(@RecentlyNonNull final InvocationHandler h) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Class<?> getProxyClass(@RecentlyNullable final ClassLoader loader,
			@RecentlyNonNull final Class<?>... interfaces) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Object newProxyInstance(@RecentlyNullable final ClassLoader loader,
			@RecentlyNonNull final Class<?>[] interfaces, @RecentlyNonNull final InvocationHandler h)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	public static boolean isProxyClass(@RecentlyNonNull final Class<?> cl) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static InvocationHandler getInvocationHandler(@RecentlyNonNull final Object proxy)
			throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}
}
