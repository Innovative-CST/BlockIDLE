package java.util;

public interface Deque<E> extends Queue<E>, SequencedCollection<E> {
	void addFirst(final E p0);

	void addLast(final E p0);

	boolean offerFirst(final E p0);

	boolean offerLast(final E p0);

	E removeFirst();

	E removeLast();

	@RecentlyNullable
	E pollFirst();

	@RecentlyNullable
	E pollLast();

	E getFirst();

	E getLast();

	@RecentlyNullable
	E peekFirst();

	@RecentlyNullable
	E peekLast();

	boolean removeFirstOccurrence(@RecentlyNullable final Object p0);

	boolean removeLastOccurrence(@RecentlyNullable final Object p0);

	boolean add(final E p0);

	boolean offer(final E p0);

	E remove();

	@RecentlyNullable
	E poll();

	E element();

	@RecentlyNullable
	E peek();

	boolean addAll(@RecentlyNonNull final Collection<? extends E> p0);

	void push(final E p0);

	E pop();

	boolean remove(@RecentlyNullable final Object p0);

	boolean contains(@RecentlyNullable final Object p0);

	int size();

	@RecentlyNonNull
	Iterator<E> iterator();

	@RecentlyNonNull
	Iterator<E> descendingIterator();

	@RecentlyNonNull
	default Deque<E> reversed() {
		throw new RuntimeException("Stub!");
	}
}
