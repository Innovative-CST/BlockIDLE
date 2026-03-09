package java.time.chrono;

public enum IsoEra implements Era {
	BCE, CE;

	public static IsoEra of(final int isoEra) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int getValue() {
		throw new RuntimeException("Stub!");
	}
}
