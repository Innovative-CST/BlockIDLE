package java.time.temporal;

public interface Temporal extends TemporalAccessor {
	boolean isSupported(final TemporalUnit p0);

	default Temporal with(final TemporalAdjuster adjuster) {
		throw new RuntimeException("Stub!");
	}

	Temporal with(final TemporalField p0, final long p1);

	default Temporal plus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	Temporal plus(final long p0, final TemporalUnit p1);

	default Temporal minus(final TemporalAmount amount) {
		throw new RuntimeException("Stub!");
	}

	default Temporal minus(final long amountToSubtract, final TemporalUnit unit) {
		throw new RuntimeException("Stub!");
	}

	long until(final Temporal p0, final TemporalUnit p1);
}
