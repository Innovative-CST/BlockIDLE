package java.security;

import java.nio.ByteBuffer;

public class SecureClassLoader extends ClassLoader {
	protected SecureClassLoader(final ClassLoader parent) {
		throw new RuntimeException("Stub!");
	}

	protected SecureClassLoader() {
		throw new RuntimeException("Stub!");
	}

	protected final Class<?> defineClass(final String name, final byte[] b, final int off, final int len,
			final CodeSource cs) {
		throw new RuntimeException("Stub!");
	}

	protected final Class<?> defineClass(final String name, final ByteBuffer b, final CodeSource cs) {
		throw new RuntimeException("Stub!");
	}

	protected PermissionCollection getPermissions(final CodeSource codesource) {
		throw new RuntimeException("Stub!");
	}
}
