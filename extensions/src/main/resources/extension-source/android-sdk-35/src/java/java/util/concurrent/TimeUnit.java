package java.util.concurrent;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public enum TimeUnit {
	NANOSECONDS, MICROSECONDS, MILLISECONDS, SECONDS, MINUTES, HOURS, DAYS;

	public long convert(final long sourceDuration, final TimeUnit sourceUnit) {
		throw new RuntimeException("Stub!");
	}

	public long convert(final Duration duration) {
		throw new RuntimeException("Stub!");
	}

	public long toNanos(final long duration) {
		throw new RuntimeException("Stub!");
	}

	public long toMicros(final long duration) {
		throw new RuntimeException("Stub!");
	}

	public long toMillis(final long duration) {
		throw new RuntimeException("Stub!");
	}

	public long toSeconds(final long duration) {
		throw new RuntimeException("Stub!");
	}

	public long toMinutes(final long duration) {
		throw new RuntimeException("Stub!");
	}

	public long toHours(final long duration) {
		throw new RuntimeException("Stub!");
	}

	public long toDays(final long duration) {
		throw new RuntimeException("Stub!");
	}

	public void timedWait(final Object obj, final long timeout) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public void timedJoin(final Thread thread, final long timeout) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public void sleep(final long timeout) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	public ChronoUnit toChronoUnit() {
		throw new RuntimeException("Stub!");
	}

	public static TimeUnit of(final ChronoUnit chronoUnit) {
		throw new RuntimeException("Stub!");
	}
}
