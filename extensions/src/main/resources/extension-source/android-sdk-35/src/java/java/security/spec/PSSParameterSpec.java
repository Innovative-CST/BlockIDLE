package java.security.spec;

public class PSSParameterSpec implements AlgorithmParameterSpec {
	public static final PSSParameterSpec DEFAULT;
	public static final int TRAILER_FIELD_BC = 1;

	public PSSParameterSpec(final String mdName, final String mgfName, final AlgorithmParameterSpec mgfSpec,
			final int saltLen, final int trailerField) {
		throw new RuntimeException("Stub!");
	}

	public PSSParameterSpec(final int saltLen) {
		throw new RuntimeException("Stub!");
	}

	public String getDigestAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public String getMGFAlgorithm() {
		throw new RuntimeException("Stub!");
	}

	public AlgorithmParameterSpec getMGFParameters() {
		throw new RuntimeException("Stub!");
	}

	public int getSaltLength() {
		throw new RuntimeException("Stub!");
	}

	public int getTrailerField() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	static {
		DEFAULT = null;
	}
}
