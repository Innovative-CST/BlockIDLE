package java.security;

import java.nio.ByteBuffer;
import java.security.spec.AlgorithmParameterSpec;

public abstract class SignatureSpi {
	protected SecureRandom appRandom;

	public SignatureSpi() {
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineInitVerify(final PublicKey p0) throws InvalidKeyException;

	protected abstract void engineInitSign(final PrivateKey p0) throws InvalidKeyException;

	protected void engineInitSign(final PrivateKey privateKey, final SecureRandom random) throws InvalidKeyException {
		throw new RuntimeException("Stub!");
	}

	protected abstract void engineUpdate(final byte p0) throws SignatureException;

	protected abstract void engineUpdate(final byte[] p0, final int p1, final int p2) throws SignatureException;

	protected void engineUpdate(final ByteBuffer input) {
		throw new RuntimeException("Stub!");
	}

	protected abstract byte[] engineSign() throws SignatureException;

	protected int engineSign(final byte[] outbuf, final int offset, final int len) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	protected abstract boolean engineVerify(final byte[] p0) throws SignatureException;

	protected boolean engineVerify(final byte[] sigBytes, final int offset, final int length)
			throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected abstract void engineSetParameter(final String p0, final Object p1) throws InvalidParameterException;

	protected void engineSetParameter(final AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	protected AlgorithmParameters engineGetParameters() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	protected abstract Object engineGetParameter(final String p0) throws InvalidParameterException;

	public Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}
}
