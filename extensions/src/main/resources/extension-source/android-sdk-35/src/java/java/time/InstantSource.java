package java.time;

public interface InstantSource {
	default InstantSource system() {
		throw new RuntimeException("Stub!");
	}

	default InstantSource tick(final InstantSource baseSource, final Duration tickDuration) {
		throw new RuntimeException("Stub!");
	}

	default InstantSource fixed(final Instant fixedInstant) {
		throw new RuntimeException("Stub!");
	}

	default InstantSource offset(final InstantSource baseSource, final Duration offsetDuration) {
		throw new RuntimeException("Stub!");
	}

	Instant instant();

	default long millis() {
		throw new RuntimeException("Stub!");
	}

	default Clock withZone(final ZoneId zone) {
		throw new RuntimeException("Stub!");
	}
}
