package java.util;

import java.util.random.RandomGenerator;

public class Collections {
	@RecentlyNonNull
	public static final List EMPTY_LIST;
	@RecentlyNonNull
	public static final Map EMPTY_MAP;
	@RecentlyNonNull
	public static final Set EMPTY_SET;

	Collections() {
		throw new RuntimeException("Stub!");
	}

	public static <T extends Comparable<? super T>> void sort(@RecentlyNonNull final List<T> list) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void sort(@RecentlyNonNull final List<T> list, @RecentlyNullable final Comparator<? super T> c) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int binarySearch(@RecentlyNonNull final List<? extends Comparable<? super T>> list,
			@RecentlyNonNull final T key) {
		throw new RuntimeException("Stub!");
	}

	public static <T> int binarySearch(@RecentlyNonNull final List<? extends T> list, final T key,
			@RecentlyNullable final Comparator<? super T> c) {
		throw new RuntimeException("Stub!");
	}

	public static void reverse(@RecentlyNonNull final List<?> list) {
		throw new RuntimeException("Stub!");
	}

	public static void shuffle(@RecentlyNonNull final List<?> list) {
		throw new RuntimeException("Stub!");
	}

	public static void shuffle(@RecentlyNonNull final List<?> list, @RecentlyNonNull final Random rnd) {
		throw new RuntimeException("Stub!");
	}

	public static void shuffle(@RecentlyNonNull final List<?> list, @RecentlyNonNull final RandomGenerator rnd) {
		throw new RuntimeException("Stub!");
	}

	public static void swap(@RecentlyNonNull final List<?> list, final int i, final int j) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void fill(@RecentlyNonNull final List<? super T> list, final T obj) {
		throw new RuntimeException("Stub!");
	}

	public static <T> void copy(@RecentlyNonNull final List<? super T> dest,
			@RecentlyNonNull final List<? extends T> src) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T extends Object & Comparable<? super T>> T min(
			@RecentlyNonNull final Collection<? extends T> coll) {
		throw new RuntimeException("Stub!");
	}

	public static <T> T min(@RecentlyNonNull final Collection<? extends T> coll,
			@RecentlyNullable final Comparator<? super T> comp) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T extends Object & Comparable<? super T>> T max(
			@RecentlyNonNull final Collection<? extends T> coll) {
		throw new RuntimeException("Stub!");
	}

	public static <T> T max(@RecentlyNonNull final Collection<? extends T> coll,
			@RecentlyNullable final Comparator<? super T> comp) {
		throw new RuntimeException("Stub!");
	}

	public static void rotate(@RecentlyNonNull final List<?> list, final int distance) {
		throw new RuntimeException("Stub!");
	}

	public static <T> boolean replaceAll(@RecentlyNonNull final List<T> list, final T oldVal, final T newVal) {
		throw new RuntimeException("Stub!");
	}

	public static int indexOfSubList(@RecentlyNonNull final List<?> source, @RecentlyNonNull final List<?> target) {
		throw new RuntimeException("Stub!");
	}

	public static int lastIndexOfSubList(@RecentlyNonNull final List<?> source, @RecentlyNonNull final List<?> target) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Collection<T> unmodifiableCollection(@RecentlyNonNull final Collection<? extends T> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> SequencedCollection<T> unmodifiableSequencedCollection(
			@RecentlyNonNull final SequencedCollection<? extends T> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Set<T> unmodifiableSet(@RecentlyNonNull final Set<? extends T> s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> SequencedSet<T> unmodifiableSequencedSet(@RecentlyNonNull final SequencedSet<? extends T> s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> SortedSet<T> unmodifiableSortedSet(@RecentlyNonNull final SortedSet<T> s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> NavigableSet<T> unmodifiableNavigableSet(@RecentlyNonNull final NavigableSet<T> s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> List<T> unmodifiableList(@RecentlyNonNull final List<? extends T> list) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> Map<K, V> unmodifiableMap(@RecentlyNonNull final Map<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> SequencedMap<K, V> unmodifiableSequencedMap(
			@RecentlyNonNull final SequencedMap<? extends K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> SortedMap<K, V> unmodifiableSortedMap(@RecentlyNonNull final SortedMap<K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(
			@RecentlyNonNull final NavigableMap<K, ? extends V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Collection<T> synchronizedCollection(@RecentlyNonNull final Collection<T> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Set<T> synchronizedSet(@RecentlyNonNull final Set<T> s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> SortedSet<T> synchronizedSortedSet(@RecentlyNonNull final SortedSet<T> s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> NavigableSet<T> synchronizedNavigableSet(@RecentlyNonNull final NavigableSet<T> s) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> List<T> synchronizedList(@RecentlyNonNull final List<T> list) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> Map<K, V> synchronizedMap(@RecentlyNonNull final Map<K, V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> SortedMap<K, V> synchronizedSortedMap(@RecentlyNonNull final SortedMap<K, V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(@RecentlyNonNull final NavigableMap<K, V> m) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> Collection<E> checkedCollection(@RecentlyNonNull final Collection<E> c,
			@RecentlyNonNull final Class<E> type) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> Queue<E> checkedQueue(@RecentlyNonNull final Queue<E> queue,
			@RecentlyNonNull final Class<E> type) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> Set<E> checkedSet(@RecentlyNonNull final Set<E> s, @RecentlyNonNull final Class<E> type) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> SortedSet<E> checkedSortedSet(@RecentlyNonNull final SortedSet<E> s,
			@RecentlyNonNull final Class<E> type) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> NavigableSet<E> checkedNavigableSet(@RecentlyNonNull final NavigableSet<E> s,
			@RecentlyNonNull final Class<E> type) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> List<E> checkedList(@RecentlyNonNull final List<E> list, @RecentlyNonNull final Class<E> type) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> Map<K, V> checkedMap(@RecentlyNonNull final Map<K, V> m,
			@RecentlyNonNull final Class<K> keyType, @RecentlyNonNull final Class<V> valueType) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> SortedMap<K, V> checkedSortedMap(@RecentlyNonNull final SortedMap<K, V> m,
			@RecentlyNonNull final Class<K> keyType, @RecentlyNonNull final Class<V> valueType) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> NavigableMap<K, V> checkedNavigableMap(@RecentlyNonNull final NavigableMap<K, V> m,
			@RecentlyNonNull final Class<K> keyType, @RecentlyNonNull final Class<V> valueType) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Iterator<T> emptyIterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> ListIterator<T> emptyListIterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Enumeration<T> emptyEnumeration() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final <T> Set<T> emptySet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> SortedSet<E> emptySortedSet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> NavigableSet<E> emptyNavigableSet() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final <T> List<T> emptyList() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final <K, V> Map<K, V> emptyMap() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final <K, V> SortedMap<K, V> emptySortedMap() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static final <K, V> NavigableMap<K, V> emptyNavigableMap() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Set<T> singleton(final T o) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> List<T> singletonList(final T o) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <K, V> Map<K, V> singletonMap(final K key, final V value) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> List<T> nCopies(final int n, final T o) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Comparator<T> reverseOrder() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Comparator<T> reverseOrder(@RecentlyNullable final Comparator<T> cmp) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Enumeration<T> enumeration(@RecentlyNonNull final Collection<T> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> ArrayList<T> list(@RecentlyNonNull final Enumeration<T> e) {
		throw new RuntimeException("Stub!");
	}

	public static int frequency(@RecentlyNonNull final Collection<?> c, @RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	public static boolean disjoint(@RecentlyNonNull final Collection<?> c1, @RecentlyNonNull final Collection<?> c2) {
		throw new RuntimeException("Stub!");
	}

	@SafeVarargs
	public static <T> boolean addAll(@RecentlyNonNull final Collection<? super T> c,
			@RecentlyNonNull final T... elements) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> Set<E> newSetFromMap(@RecentlyNonNull final Map<E, Boolean> map) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <E> SequencedSet<E> newSequencedSetFromMap(@RecentlyNonNull final SequencedMap<E, Boolean> map) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	public static <T> Queue<T> asLifoQueue(@RecentlyNonNull final Deque<T> deque) {
		throw new RuntimeException("Stub!");
	}

	static {
		EMPTY_LIST = null;
		EMPTY_MAP = null;
		EMPTY_SET = null;
	}
}
