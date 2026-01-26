package java.security;

import java.nio.ByteBuffer;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;

public abstract class Signature extends SignatureSpi {
	protected static final int SIGN = 2;
	protected static final int UNINITIALIZED = 0;
	protected static final int VERIFY = 3;
	protected int state;

	protected Signature(final String algorithm) {
		this.state = 0;
		throw new RuntimeException("Stub!");
	}

	public static Signature getInstance(final String algorithm) throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public static Signature getInstance(final String algorithm, final String provider)
			throws NoSuchAlgorithmException, NoSuchProviderException {
		throw new RuntimeException("Stub!");
	}

	public static Signature getInstance(final String algorithm, final Provider provider)
			throws NoSuchAlgorithmException {
		throw new RuntimeException("Stub!");
	}

	public final Provider getProvider() {
		throw new RuntimeException("Stub!");
	}

	public final void initVerify(final PublicKey publicKey) throws InvalidKeyException {
		throw new RuntimeException("Stub!");
	}

	public final void initVerify(final Certificate certificate) throws InvalidKeyException {
		throw new RuntimeException("Stub!");
	}

	public final void initSign(final PrivateKey privateKey) throws InvalidKeyException {
		throw new RuntimeException("Stub!");
	}

	public final void initSign(final PrivateKey privateKey, final SecureRandom random) throws InvalidKeyException {
		throw new RuntimeException("Stub!");
	}

	public final byte[] sign() throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final int sign(final byte[] outbuf, final int offset, final int len) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final boolean verify(final byte[] signature) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final boolean verify(final byte[] signature, final int offset, final int length) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final void update(final byte b) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final void update(final byte[] data) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final void update(final byte[] data, final int off, final int len) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final void update(final ByteBuffer data) throws SignatureException {
		throw new RuntimeException("Stub!");
	}

	public final String getAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final void setParameter(final String param, final Object value) throws InvalidParameterException {
		throw new RuntimeException("Stub!");
	}

	public final void setParameter(final AlgorithmParameterSpec params) throws InvalidAlgorithmParameterException {
		throw new RuntimeException("Stub!");
	}

	public final AlgorithmParameters getParameters() {
		throw new RuntimeException("Stub!");
	}

	@Deprecated
	public final Object getParameter(final String param) throws InvalidParameterException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new RuntimeException("Stub!");
	}
}
