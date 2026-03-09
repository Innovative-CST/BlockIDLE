package java.security.spec;

import java.util.Optional;

public class EdDSAParameterSpec implements AlgorithmParameterSpec {
	public EdDSAParameterSpec(final boolean prehash) {
		throw new RuntimeException("Stub!");
	}

	public EdDSAParameterSpec(final boolean prehash, final byte[] context) {
		throw new RuntimeException("Stub!");
	}

	public boolean isPrehash() {
		throw new RuntimeException("Stub!");
	}

	public Optional<byte[]> getContext() {
		throw new RuntimeException("Stub!");
	}
}
