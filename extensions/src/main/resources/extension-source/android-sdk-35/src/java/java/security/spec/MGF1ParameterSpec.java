package java.security.spec;

public class MGF1ParameterSpec implements AlgorithmParameterSpec {
	public static final MGF1ParameterSpec SHA1;
	public static final MGF1ParameterSpec SHA224;
	public static final MGF1ParameterSpec SHA256;
	public static final MGF1ParameterSpec SHA384;
	public static final MGF1ParameterSpec SHA3_224;
	public static final MGF1ParameterSpec SHA3_256;
	public static final MGF1ParameterSpec SHA3_384;
	public static final MGF1ParameterSpec SHA3_512;
	public static final MGF1ParameterSpec SHA512;
	public static final MGF1ParameterSpec SHA512_224;
	public static final MGF1ParameterSpec SHA512_256;

	public MGF1ParameterSpec(final String mdName) {
		throw new RuntimeException("Stub!");
	}

	public String getDigestAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		SHA1 = null;
		SHA224 = null;
		SHA256 = null;
		SHA384 = null;
		SHA3_224 = null;
		SHA3_256 = null;
		SHA3_384 = null;
		SHA3_512 = null;
		SHA512 = null;
		SHA512_224 = null;
		SHA512_256 = null;
	}
}
