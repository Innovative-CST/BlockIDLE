package java.util.logging;

import java.io.Serializable;

public class Level implements Serializable {
	@RecentlyNonNull
	public static final Level ALL;
	@RecentlyNonNull
	public static final Level CONFIG;
	@RecentlyNonNull
	public static final Level FINE;
	@RecentlyNonNull
	public static final Level FINER;
	@RecentlyNonNull
	public static final Level FINEST;
	@RecentlyNonNull
	public static final Level INFO;
	@RecentlyNonNull
	public static final Level OFF;
	@RecentlyNonNull
	public static final Level SEVERE;
	@RecentlyNonNull
	public static final Level WARNING;

	protected Level(@RecentlyNonNull final String name, final int value) {
		throw new RuntimeException("Stub!");
	}

	protected Level(@RecentlyNonNull final String name, final int value,
			@RecentlyNullable final String resourceBundleName) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNullable
	public String getResourceBundleName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public String getLocalizedName() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public final String toString() {
		throw new RuntimeException("Stub!");
	}

	public final int intValue() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static synchronized Level parse(@RecentlyNonNull final String name) throws IllegalArgumentException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object ox) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	static {
		ALL = null;
		CONFIG = null;
		FINE = null;
		FINER = null;
		FINEST = null;
		INFO = null;
		OFF = null;
		SEVERE = null;
		WARNING = null;
	}
}
