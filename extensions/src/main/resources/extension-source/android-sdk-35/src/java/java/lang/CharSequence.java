package java.lang;

import java.util.stream.IntStream;

public interface CharSequence {
	int length();

	char charAt(final int p0);

	default boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	CharSequence subSequence(final int p0, final int p1);

	@RecentlyNonNull
	String toString();

	@RecentlyNonNull
	default IntStream chars() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	default IntStream codePoints() {
		throw new RuntimeException("Stub!");
	}

	default int compare(@RecentlyNonNull final CharSequence cs1, @RecentlyNonNull final CharSequence cs2) {
		throw new RuntimeException("Stub!");
	}
}
