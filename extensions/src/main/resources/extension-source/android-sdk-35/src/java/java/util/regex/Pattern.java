package java.util.regex;

import java.io.Serializable;
import java.util.function.Predicate;
import java.util.stream.Stream;

public final class Pattern implements Serializable {
	public static final int CANON_EQ = 128;
	public static final int CASE_INSENSITIVE = 2;
	public static final int COMMENTS = 4;
	public static final int DOTALL = 32;
	public static final int LITERAL = 16;
	public static final int MULTILINE = 8;
	public static final int UNICODE_CASE = 64;
	public static final int UNICODE_CHARACTER_CLASS = 256;
	public static final int UNIX_LINES = 1;

	Pattern() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Pattern compile(@RecentlyNonNull final String regex) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Pattern compile(@RecentlyNonNull final String regex, final int flags) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String pattern() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Matcher matcher(@RecentlyNonNull final CharSequence input) {
		throw new RuntimeException("Stub!");
	}

	public int flags() {
		throw new RuntimeException("Stub!");
	}

	public static boolean matches(@RecentlyNonNull final String regex, @RecentlyNonNull final CharSequence input) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String[] split(@RecentlyNonNull final CharSequence input, final int limit) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String[] split(@RecentlyNonNull final CharSequence input) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String quote(@RecentlyNonNull final String s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Predicate<String> asPredicate() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Predicate<String> asMatchPredicate() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public Stream<String> splitAsStream(@RecentlyNonNull final CharSequence input) {
		throw new RuntimeException("Stub!");
	}
}
