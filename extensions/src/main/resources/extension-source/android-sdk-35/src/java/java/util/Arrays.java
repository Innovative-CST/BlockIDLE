package java.util;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongBinaryOperator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Arrays {
	Arrays() {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final int[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final int[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final long[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final long[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final short[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final short[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final char[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final char[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final byte[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final byte[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final float[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final float[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final double[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final double[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final byte[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final byte[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final char[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final char[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final short[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final short[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final int[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final int[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final long[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final long[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final float[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final float[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final double[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSort(@RecentlyNonNull final double[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static <T extends Comparable<? super T>> void parallelSort(@RecentlyNonNull final T[] a) {
		throw new RuntimeException("Stub!");
	}

	public static <T extends Comparable<? super T>> void parallelSort(@RecentlyNonNull final T[] a, final int fromIndex,
			final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void parallelSort(@RecentlyNonNull final T[] a,
			@RecentlyNullable final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void parallelSort(@RecentlyNonNull final T[] a, final int fromIndex, final int toIndex,
			@RecentlyNullable final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final Object[] a) {
		throw new RuntimeException("Stub!");
	}

	public static void sort(@RecentlyNonNull final Object[] a, final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void sort(@RecentlyNonNull final T[] a, @RecentlyNullable final Comparator<? super T> c) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void sort(@RecentlyNonNull final T[] a, final int fromIndex, final int toIndex,
			@RecentlyNullable final Comparator<? super T> c) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void parallelPrefix(@RecentlyNonNull final T[] array,
			@RecentlyNonNull final BinaryOperator<T> op) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void parallelPrefix(@RecentlyNonNull final T[] array, final int fromIndex, final int toIndex,
			@RecentlyNonNull final BinaryOperator<T> op) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelPrefix(@RecentlyNonNull final long[] array,
			@RecentlyNonNull final LongBinaryOperator op) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelPrefix(@RecentlyNonNull final long[] array, final int fromIndex, final int toIndex,
			@RecentlyNonNull final LongBinaryOperator op) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelPrefix(@RecentlyNonNull final double[] array,
			@RecentlyNonNull final DoubleBinaryOperator op) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelPrefix(@RecentlyNonNull final double[] array, final int fromIndex, final int toIndex,
			@RecentlyNonNull final DoubleBinaryOperator op) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelPrefix(@RecentlyNonNull final int[] array, @RecentlyNonNull final IntBinaryOperator op) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelPrefix(@RecentlyNonNull final int[] array, final int fromIndex, final int toIndex,
			@RecentlyNonNull final IntBinaryOperator op) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final long[] a, final long key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final long[] a, final int fromIndex, final int toIndex,
			final long key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final int[] a, final int key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final int[] a, final int fromIndex, final int toIndex,
			final int key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final short[] a, final short key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final short[] a, final int fromIndex, final int toIndex,
			final short key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final char[] a, final char key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final char[] a, final int fromIndex, final int toIndex,
			final char key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final byte[] a, final byte key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final byte[] a, final int fromIndex, final int toIndex,
			final byte key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final double[] a, final double key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final double[] a, final int fromIndex, final int toIndex,
			final double key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final float[] a, final float key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final float[] a, final int fromIndex, final int toIndex,
			final float key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final Object[] a, @RecentlyNonNull final Object key) {
		throw new RuntimeException("Stub!");
	}

	public static int binarySearch(@RecentlyNonNull final Object[] a, final int fromIndex, final int toIndex,
			@RecentlyNonNull final Object key) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int binarySearch(@RecentlyNonNull final T[] a, final T key,
			@RecentlyNullable final Comparator<? super T> c) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int binarySearch(@RecentlyNonNull final T[] a, final int fromIndex, final int toIndex,
			final T key, @RecentlyNullable final Comparator<? super T> c) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final long[] a, @RecentlyNullable final long[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final long[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final long[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final int[] a, @RecentlyNullable final int[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final int[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final int[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final short[] a, @RecentlyNullable final short[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final short[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final short[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final char[] a, @RecentlyNullable final char[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final char[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final char[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final byte[] a, @RecentlyNullable final byte[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final byte[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final byte[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final boolean[] a, @RecentlyNullable final boolean[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final boolean[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final boolean[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final double[] a, @RecentlyNullable final double[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final double[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final double[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final float[] a, @RecentlyNullable final float[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final float[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final float[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNullable final Object[] a, @RecentlyNullable final Object[] a2) {
		throw new RuntimeException("Stub!");
	}

	public static boolean equals(@RecentlyNonNull final Object[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final Object[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static <T> boolean equals(@RecentlyNullable final T[] a, @RecentlyNullable final T[] a2,
			@RecentlyNonNull final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}

	public static <T> boolean equals(@RecentlyNonNull final T[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final T[] b, final int bFromIndex, final int bToIndex,
			@RecentlyNonNull final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final long[] a, final long val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final long[] a, final int fromIndex, final int toIndex, final long val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final int[] a, final int val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final int[] a, final int fromIndex, final int toIndex, final int val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final short[] a, final short val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final short[] a, final int fromIndex, final int toIndex, final short val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final char[] a, final char val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final char[] a, final int fromIndex, final int toIndex, final char val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final byte[] a, final byte val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final byte[] a, final int fromIndex, final int toIndex, final byte val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final boolean[] a, final boolean val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final boolean[] a, final int fromIndex, final int toIndex,
			final boolean val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final double[] a, final double val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final double[] a, final int fromIndex, final int toIndex,
			final double val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final float[] a, final float val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final float[] a, final int fromIndex, final int toIndex, final float val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final Object[] a, @RecentlyNullable final Object val) {
		throw new RuntimeException("Stub!");
	}

	public static void fill(@RecentlyNonNull final Object[] a, final int fromIndex, final int toIndex,
			@RecentlyNullable final Object val) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> T[] copyOf(@RecentlyNonNull final T[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T, U> T[] copyOf(@RecentlyNonNull final U[] original, final int newLength,
			@RecentlyNonNull final Class<? extends T[]> newType) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static byte[] copyOf(@RecentlyNonNull final byte[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static short[] copyOf(@RecentlyNonNull final short[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static int[] copyOf(@RecentlyNonNull final int[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static long[] copyOf(@RecentlyNonNull final long[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static char[] copyOf(@RecentlyNonNull final char[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static float[] copyOf(@RecentlyNonNull final float[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static double[] copyOf(@RecentlyNonNull final double[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static boolean[] copyOf(@RecentlyNonNull final boolean[] original, final int newLength) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> T[] copyOfRange(@RecentlyNonNull final T[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T, U> T[] copyOfRange(@RecentlyNonNull final U[] original, final int from, final int to,
			@RecentlyNonNull final Class<? extends T[]> newType) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static byte[] copyOfRange(@RecentlyNonNull final byte[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static short[] copyOfRange(@RecentlyNonNull final short[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static int[] copyOfRange(@RecentlyNonNull final int[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static long[] copyOfRange(@RecentlyNonNull final long[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static char[] copyOfRange(@RecentlyNonNull final char[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static float[] copyOfRange(@RecentlyNonNull final float[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static double[] copyOfRange(@RecentlyNonNull final double[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static boolean[] copyOfRange(@RecentlyNonNull final boolean[] original, final int from, final int to) {
		throw new RuntimeException("Stub!");
	}

	@SafeVarargs
	@RecentlyNonNull
	public static <T> List<T> asList(@RecentlyNonNull final T... a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final long[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final int[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final short[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final char[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final byte[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final boolean[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final float[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final double[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int hashCode(@RecentlyNullable final Object[] a) {
		throw new RuntimeException("Stub!");
	}

	public static int deepHashCode(@RecentlyNullable final Object[] a) {
		throw new RuntimeException("Stub!");
	}

	public static boolean deepEquals(@RecentlyNullable final Object[] a1, @RecentlyNullable final Object[] a2) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final long[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final int[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final short[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final char[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final byte[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final boolean[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final float[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final double[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String toString(@RecentlyNullable final Object[] a) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static String deepToString(@RecentlyNullable final Object[] a) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void setAll(@RecentlyNonNull final T[] array,
			@RecentlyNonNull final IntFunction<? extends T> generator) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void parallelSetAll(@RecentlyNonNull final T[] array,
			@RecentlyNonNull final IntFunction<? extends T> generator) {
		throw new RuntimeException("Stub!");
	}

	public static void setAll(@RecentlyNonNull final int[] array, @RecentlyNonNull final IntUnaryOperator generator) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSetAll(@RecentlyNonNull final int[] array,
			@RecentlyNonNull final IntUnaryOperator generator) {
		throw new RuntimeException("Stub!");
	}

	public static void setAll(@RecentlyNonNull final long[] array, @RecentlyNonNull final IntToLongFunction generator) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSetAll(@RecentlyNonNull final long[] array,
			@RecentlyNonNull final IntToLongFunction generator) {
		throw new RuntimeException("Stub!");
	}

	public static void setAll(@RecentlyNonNull final double[] array,
			@RecentlyNonNull final IntToDoubleFunction generator) {
		throw new RuntimeException("Stub!");
	}

	public static void parallelSetAll(@RecentlyNonNull final double[] array,
			@RecentlyNonNull final IntToDoubleFunction generator) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Spliterator<T> spliterator(@RecentlyNonNull final T[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Spliterator<T> spliterator(@RecentlyNonNull final T[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Spliterator.OfInt spliterator(@RecentlyNonNull final int[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Spliterator.OfInt spliterator(@RecentlyNonNull final int[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Spliterator.OfLong spliterator(@RecentlyNonNull final long[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Spliterator.OfLong spliterator(@RecentlyNonNull final long[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Spliterator.OfDouble spliterator(@RecentlyNonNull final double[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static Spliterator.OfDouble spliterator(@RecentlyNonNull final double[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Stream<T> stream(@RecentlyNonNull final T[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Stream<T> stream(@RecentlyNonNull final T[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static IntStream stream(@RecentlyNonNull final int[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static IntStream stream(@RecentlyNonNull final int[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static LongStream stream(@RecentlyNonNull final long[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static LongStream stream(@RecentlyNonNull final long[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static DoubleStream stream(@RecentlyNonNull final double[] array) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static DoubleStream stream(@RecentlyNonNull final double[] array, final int startInclusive,
			final int endExclusive) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final boolean[] a, @RecentlyNullable final boolean[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final boolean[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final boolean[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final byte[] a, @RecentlyNullable final byte[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final byte[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final byte[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNullable final byte[] a, @RecentlyNullable final byte[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNonNull final byte[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final byte[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final short[] a, @RecentlyNullable final short[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final short[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final short[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNullable final short[] a, @RecentlyNullable final short[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNonNull final short[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final short[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final char[] a, @RecentlyNullable final char[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final char[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final char[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final int[] a, @RecentlyNullable final int[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final int[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final int[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNullable final int[] a, @RecentlyNullable final int[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNonNull final int[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final int[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final long[] a, @RecentlyNullable final long[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final long[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final long[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNullable final long[] a, @RecentlyNullable final long[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compareUnsigned(@RecentlyNonNull final long[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final long[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final float[] a, @RecentlyNullable final float[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final float[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final float[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNullable final double[] a, @RecentlyNullable final double[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int compare(@RecentlyNonNull final double[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final double[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static <T extends Comparable<? super T>> int compare(@RecentlyNullable final T[] a,
			@RecentlyNullable final T[] b) {
		throw new RuntimeException("Stub!");
	}

	public static <T extends Comparable<? super T>> int compare(@RecentlyNonNull final T[] a, final int aFromIndex,
			final int aToIndex, @RecentlyNonNull final T[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int compare(@RecentlyNullable final T[] a, @RecentlyNullable final T[] b,
			@RecentlyNonNull final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int compare(@RecentlyNonNull final T[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final T[] b, final int bFromIndex, final int bToIndex,
			@RecentlyNonNull final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final boolean[] a, @RecentlyNonNull final boolean[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final boolean[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final boolean[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final byte[] a, @RecentlyNonNull final byte[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(final byte[] a, final int aFromIndex, final int aToIndex, final byte[] b,
			final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final char[] a, @RecentlyNonNull final char[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final char[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final char[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final short[] a, @RecentlyNonNull final short[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final short[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final short[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final int[] a, @RecentlyNonNull final int[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final int[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final int[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final long[] a, @RecentlyNonNull final long[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final long[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final long[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final float[] a, @RecentlyNonNull final float[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final float[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final float[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final double[] a, @RecentlyNonNull final double[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final double[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final double[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final Object[] a, @RecentlyNonNull final Object[] b) {
		throw new RuntimeException("Stub!");
	}

	public static int mismatch(@RecentlyNonNull final Object[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final Object[] b, final int bFromIndex, final int bToIndex) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int mismatch(@RecentlyNonNull final T[] a, @RecentlyNonNull final T[] b,
			@RecentlyNonNull final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int mismatch(@RecentlyNonNull final T[] a, final int aFromIndex, final int aToIndex,
			@RecentlyNonNull final T[] b, final int bFromIndex, final int bToIndex,
			@RecentlyNonNull final Comparator<? super T> cmp) {
		throw new RuntimeException("Stub!");
	}
}
