package java.time.temporal;

public interface TemporalAccessor {
	boolean isSupported(final TemporalField p0);

	default ValueRange range(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	default int get(final TemporalField field) {
		throw new RuntimeException("Stub!");
	}

	long getLong(final TemporalField p0);

	default <R> R query(final TemporalQuery<R> query) {
		throw new RuntimeException("Stub!");
	}
}
