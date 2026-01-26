package java.security;

public final class AccessController {
	AccessController() {
		throw new RuntimeException("Stub!");
	}

	public static <T> T doPrivileged(final PrivilegedAction<T> action) {
		throw new RuntimeException("Stub!");
	}

	public static <T> T doPrivilegedWithCombiner(final PrivilegedAction<T> action) {
		throw new RuntimeException("Stub!");
	}

	public static <T> T doPrivileged(final PrivilegedAction<T> action, final AccessControlContext context) {
		throw new RuntimeException("Stub!");
	}

	public static <T> T doPrivileged(final PrivilegedExceptionAction<T> action) throws PrivilegedActionException {
		throw new RuntimeException("Stub!");
	}

	public static <T> T doPrivilegedWithCombiner(final PrivilegedExceptionAction<T> action)
			throws PrivilegedActionException {
		throw new RuntimeException("Stub!");
	}

	public static <T> T doPrivileged(final PrivilegedExceptionAction<T> action, final AccessControlContext context)
			throws PrivilegedActionException {
		throw new RuntimeException("Stub!");
	}

	public static AccessControlContext getContext() {
		throw new RuntimeException("Stub!");
	}

	public static void checkPermission(final Permission perm) throws AccessControlException {
		throw new RuntimeException("Stub!");
	}
}
