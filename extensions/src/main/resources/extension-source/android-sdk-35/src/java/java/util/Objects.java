package java.util;

import java.util.function.Supplier;

public final class Objects {
	Objects() {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final Object a, @RecentlyNullable final Object b) {
		throw new RuntimeException("Stub!");
	}

	public static boolean deepEquals(@RecentlyNullable final Object a, @RecentlyNullable final Object b) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	public static int hash(@RecentlyNullable final Object... values) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final Object o, @RecentlyNonNull final String nullDefault) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int compare(final T a, final T b, @RecentlyNonNull final Comparator<? super T> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> T requireNonNull(@RecentlyNullable final T obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> T requireNonNull(@RecentlyNullable final T obj, @RecentlyNonNull final String message) {
		throw new RuntimeException("Stub!");
	}

	public static boolean isNull(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	public static boolean nonNull(@RecentlyNullable final Object obj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> T requireNonNullElse(@RecentlyNullable final T obj, @RecentlyNonNull final T defaultObj) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> T requireNonNullElseGet(@RecentlyNullable final T obj,
			@RecentlyNonNull final Supplier<? extends T> supplier) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> T requireNonNull(@RecentlyNullable final T obj,
			@RecentlyNonNull final Supplier<String> messageSupplier) {
		throw new RuntimeException("Stub!");
	}

	public static int checkIndex(final int index, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static int checkFromToIndex(final int fromIndex, final int toIndex, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static int checkFromIndexSize(final int fromIndex, final int size, final int length) {
		throw new RuntimeException("Stub!");
	}

	public static long checkIndex(final long index, final long length) {
		throw new RuntimeException("Stub!");
	}

	public static long checkFromToIndex(final long fromIndex, final long toIndex, final long length) {
		throw new RuntimeException("Stub!");
	}

	public static long checkFromIndexSize(final long fromIndex, final long size, final long length) {
		throw new RuntimeException("Stub!");
	}
}
