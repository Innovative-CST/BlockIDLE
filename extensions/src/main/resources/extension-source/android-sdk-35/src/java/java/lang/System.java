package java.lang;

import java.io.Console;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.channels.Channel;
import java.util.Map;
import java.util.Properties;

public final class System {
	public static final PrintStream err;
	public static final InputStream in;
	public static final PrintStream out;

	System() {
		throw new RuntimeException("Stub!");
	}

	public static void setIn(@RecentlyNullable final InputStream in) {
		throw new RuntimeException("Stub!");
	}

	public static void setOut(@RecentlyNullable final PrintStream out) {
		throw new RuntimeException("Stub!");
	}

	public static void setErr(@RecentlyNullable final PrintStream err) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Console console() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static Channel inheritedChannel() throws IOException {
		throw new RuntimeException("Stub!");
	}

	public static void setSecurityManager(@RecentlyNullable final SecurityManager s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static SecurityManager getSecurityManager() {
		throw new RuntimeException("Stub!");
	}

	public static native long currentTimeMillis();

	public static native long nanoTime();

	public static native void arraycopy(@RecentlyNonNull final Object p0, final int p1,
			@RecentlyNonNull final Object p2, final int p3, final int p4);

	public static int identityHashCode(@RecentlyNullable final Object x) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Properties getProperties() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String lineSeparator() {
		throw new RuntimeException("Stub!");
	}

	public static void setProperties(@RecentlyNullable final Properties props) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static String getProperty(@RecentlyNonNull final String key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static String getProperty(@RecentlyNonNull final String key, @RecentlyNullable final String def) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static String setProperty(@RecentlyNonNull final String key, @RecentlyNullable final String value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static String clearProperty(@RecentlyNonNull final String key) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public static String getenv(@RecentlyNonNull final String name) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Map<String, String> getenv() {
		throw new RuntimeException("Stub!");
	}

	public static void exit(final int status) {
		throw new RuntimeException("Stub!");
	}

	public static void gc() {
		throw new RuntimeException("Stub!");
	}

	public static void runFinalization() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static void runFinalizersOnExit(final boolean value) {
		throw new RuntimeException("Stub!");
	}

	public static void load(@RecentlyNonNull final String filename) {
		throw new RuntimeException("Stub!");
	}

	public static void loadLibrary(@RecentlyNonNull final String libname) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static native String mapLibraryName(@RecentlyNonNull final String p0);

	static {
		err = null;
		in = null;
		out = null;
	}
}
