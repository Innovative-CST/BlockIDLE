package java.nio.file.attribute;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

public final class FileTime implements Comparable<FileTime> {
	FileTime() {
		throw new RuntimeException("Stub!");
	}

	public static FileTime from(final long value, final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public static FileTime fromMillis(final long value) {
		throw new RuntimeException("Stub!");
	}

	public static FileTime from(final Instant instant) {
		throw new RuntimeException("Stub!");
	}

	public long to(final TimeUnit unit) {
		throw new RuntimeException("Stub!");
	}

	public long toMillis() {
		throw new RuntimeException("Stub!");
	}

	public Instant toInstant() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int compareTo(final FileTime other) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
