package java.time;

public abstract class Clock implements InstantSource {
	protected Clock() {
		throw new RuntimeException("Stub!");
	}

	public static Clock systemUTC() {
		throw new RuntimeException("Stub!");
	}

	public static Clock systemDefaultZone() {
		throw new RuntimeException("Stub!");
	}

	public static Clock system(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static Clock tickMillis(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static Clock tickSeconds(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static Clock tickMinutes(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static Clock tick(final Clock baseClock, final Duration tickDuration) {
		throw new RuntimeException("Stub!");
	}

	public static Clock fixed(final Instant fixedInstant, final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}

	public static Clock offset(final Clock baseClock, final Duration offsetDuration) {
		throw new RuntimeException("Stub!");
	}

	public abstract ZoneId getZone();

	@Override
	public abstract Clock withZone(final ZoneId p0);

	@Override
	public long millis() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract Instant instant();

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}
}
