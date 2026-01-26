package java.util;

public final class Spliterators {
	Spliterators() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Spliterator<T> emptySpliterator() {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfInt emptyIntSpliterator() {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfLong emptyLongSpliterator() {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfDouble emptyDoubleSpliterator() {
		throw new RuntimeException("Stub!");
	}

	public static <T> Spliterator<T> spliterator(final Object[] array, final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Spliterator<T> spliterator(final Object[] array, final int fromIndex, final int toIndex,
			final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfInt spliterator(final int[] array, final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfInt spliterator(final int[] array, final int fromIndex, final int toIndex,
			final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfLong spliterator(final long[] array, final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfLong spliterator(final long[] array, final int fromIndex, final int toIndex,
			final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfDouble spliterator(final double[] array, final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfDouble spliterator(final double[] array, final int fromIndex, final int toIndex,
			final int additionalCharacteristics) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Spliterator<T> spliterator(final Collection<? extends T> c, final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Spliterator<T> spliterator(final Iterator<? extends T> iterator, final long size,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Spliterator<T> spliteratorUnknownSize(final Iterator<? extends T> iterator,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfInt spliterator(final PrimitiveIterator.OfInt iterator, final long size,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfInt spliteratorUnknownSize(final PrimitiveIterator.OfInt iterator,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfLong spliterator(final PrimitiveIterator.OfLong iterator, final long size,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfLong spliteratorUnknownSize(final PrimitiveIterator.OfLong iterator,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfDouble spliterator(final PrimitiveIterator.OfDouble iterator, final long size,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static Spliterator.OfDouble spliteratorUnknownSize(final PrimitiveIterator.OfDouble iterator,
			final int characteristics) {
		throw new RuntimeException("Stub!");
	}

	public static <T> Iterator<T> iterator(final Spliterator<? extends T> spliterator) {
		throw new RuntimeException("Stub!");
	}

	public static PrimitiveIterator.OfInt iterator(final Spliterator.OfInt spliterator) {
		throw new RuntimeException("Stub!");
	}

	public static PrimitiveIterator.OfLong iterator(final Spliterator.OfLong spliterator) {
		throw new RuntimeException("Stub!");
	}

	public static PrimitiveIterator.OfDouble iterator(final Spliterator.OfDouble spliterator) {
		throw new RuntimeException("Stub!");
	}

	public abstract static class AbstractDoubleSpliterator implements Spliterator.OfDouble {
		protected AbstractDoubleSpliterator(final long est, final int additionalCharacteristics) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public Spliterator.OfDouble trySplit() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public long estimateSize() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int characteristics() {
			throw new RuntimeException("Stub!");
		}
	}

	public abstract static class AbstractIntSpliterator implements Spliterator.OfInt {
		protected AbstractIntSpliterator(final long est, final int additionalCharacteristics) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public Spliterator.OfInt trySplit() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public long estimateSize() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int characteristics() {
			throw new RuntimeException("Stub!");
		}
	}

	public abstract static class AbstractLongSpliterator implements Spliterator.OfLong {
		protected AbstractLongSpliterator(final long est, final int additionalCharacteristics) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public Spliterator.OfLong trySplit() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public long estimateSize() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int characteristics() {
			throw new RuntimeException("Stub!");
		}
	}

	public abstract static class AbstractSpliterator<T> implements Spliterator<T> {
		protected AbstractSpliterator(final long est, final int additionalCharacteristics) {
			throw new RuntimeException("Stub!");
		}

		@Override
		public Spliterator<T> trySplit() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public long estimateSize() {
			throw new RuntimeException("Stub!");
		}

		@Override
		public int characteristics() {
			throw new RuntimeException("Stub!");
		}
	}
}
