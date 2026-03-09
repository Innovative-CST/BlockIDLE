package java.security;

import java.util.Map;
import java.util.Set;

public final class Security {
	Security() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public static String getAlgorithmProperty(final String algName, final String propName) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized int insertProviderAt(final Provider provider, final int position) {
		throw new RuntimeException("Stub!");
	}

	public static int addProvider(final Provider provider) {
		throw new RuntimeException("Stub!");
	}

	public static synchronized void removeProvider(final String name) {
		throw new RuntimeException("Stub!");
	}

	public static Provider[] getProviders() {
		throw new RuntimeException("Stub!");
	}

	public static Provider getProvider(final String name) {
		throw new RuntimeException("Stub!");
	}

	public static Provider[] getProviders(final String filter) {
		throw new RuntimeException("Stub!");
	}

	public static Provider[] getProviders(final Map<String, String> filter) {
		throw new RuntimeException("Stub!");
	}

	public static String getProperty(final String key) {
		throw new RuntimeException("Stub!");
	}

	public static void setProperty(final String key, final String datum) {
		throw new RuntimeException("Stub!");
	}

	public static Set<String> getAlgorithms(final String serviceName) {
		throw new RuntimeException("Stub!");
	}
}
