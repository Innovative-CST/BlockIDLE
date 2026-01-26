package java.security;

public class DrbgParameters {
	DrbgParameters() {
		throw new RuntimeException("Stub!");
	}

	public static Instantiation instantiation(final int strength, final Capability capability,
			final byte[] personalizationString) {
		throw new RuntimeException("Stub!");
	}

	public static NextBytes nextBytes(final int strength, final boolean predictionResistance,
			final byte[] additionalInput) {
		throw new RuntimeException("Stub!");
	}

	public static Reseed reseed(final boolean predictionResistance, final byte[] additionalInput) {
		throw new RuntimeException("Stub!");
	}

	public enum Capability {
		PR_AND_RESEED, RESEED_ONLY, NONE;

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}

		public boolean supportsReseeding() {
			throw new RuntimeException("Stub!");
		}

		public boolean supportsPredictionResistance() {
			throw new RuntimeException("Stub!");
		}
	}

	public static final class Instantiation implements SecureRandomParameters {
		Instantiation() {
			throw new RuntimeException("Stub!");
		}

		public int getStrength() {
			throw new RuntimeException("Stub!");
		}

		public Capability getCapability() {
			throw new RuntimeException("Stub!");
		}

		public byte[] getPersonalizationString() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public String toString() {
			throw new RuntimeException("Stub!");
		}
	}

	public static final class NextBytes implements SecureRandomParameters {
		NextBytes() {
			throw new RuntimeException("Stub!");
		}

		public int getStrength() {
			throw new RuntimeException("Stub!");
		}

		public boolean getPredictionResistance() {
			throw new RuntimeException("Stub!");
		}

		public byte[] getAdditionalInput() {
			throw new RuntimeException("Stub!");
		}
	}

	public static final class Reseed implements SecureRandomParameters {
		Reseed() {
			throw new RuntimeException("Stub!");
		}

		public boolean getPredictionResistance() {
			throw new RuntimeException("Stub!");
		}

		public byte[] getAdditionalInput() {
			throw new RuntimeException("Stub!");
		}
	}
}
