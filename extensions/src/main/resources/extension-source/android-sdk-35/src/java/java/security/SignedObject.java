package java.security;

import java.io.IOException;
import java.io.Serializable;

public final class SignedObject implements Serializable {
	public SignedObject(final Serializable object, final PrivateKey signingKey, final Signature signingEngine)
			throws IOException, InvalidKeyException, SignatureException {
		throw new RuntimeException("Stub!");
	}

	public Object getObject() throws ClassNotFoundException, IOException {
		throw new RuntimeException("Stub!");
	}

	public byte[] getSignature() {
		throw new RuntimeException("Stub!");
	}

	public String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public boolean verify(final PublicKey verificationKey, final Signature verificationEngine)
			throws InvalidKeyException, SignatureException {
		throw new RuntimeException("Stub!");
	}
}
