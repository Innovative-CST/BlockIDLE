package java.security;

import java.net.URI;
import java.util.Map;

public final class DomainLoadStoreParameter implements KeyStore.LoadStoreParameter {
	public DomainLoadStoreParameter(final URI configuration,
			final Map<String, KeyStore.ProtectionParameter> protectionParams) {
		throw new RuntimeException("Stub!");
	}

	public URI getConfiguration() {
		throw new RuntimeException("Stub!");
	}

	public Map<String, KeyStore.ProtectionParameter> getProtectionParams() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public KeyStore.ProtectionParameter getProtectionParameter() {
		throw new RuntimeException("Stub!");
	}
}
