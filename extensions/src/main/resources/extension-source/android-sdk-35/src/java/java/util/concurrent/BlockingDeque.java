package java.util.concurrent;

import java.util.Deque;
import java.util.Iterator;

public interface BlockingDeque<E> extends BlockingQueue<E>, Deque<E> {
	void addFirst(final E p0);

	void addLast(final E p0);

	boolean offerFirst(final E p0);

	boolean offerLast(final E p0);

	void putFirst(final E p0) throws InterruptedException;

	void putLast(final E p0) throws InterruptedException;

	boolean offerFirst(final E p0, final long p1, final TimeUnit p2) throws InterruptedException;

	boolean offerLast(final E p0, final long p1, final TimeUnit p2) throws InterruptedException;

	E takeFirst() throws InterruptedException;

	E takeLast() throws InterruptedException;

	E pollFirst(final long p0, final TimeUnit p1) throws InterruptedException;

	E pollLast(final long p0, final TimeUnit p1) throws InterruptedException;

	boolean removeFirstOccurrence(final Object p0);

	boolean removeLastOccurrence(final Object p0);

	boolean add(final E p0);

	boolean offer(final E p0);

	void put(final E p0) throws InterruptedException;

	boolean offer(final E p0, final long p1, final TimeUnit p2) throws InterruptedException;

	E remove();

	E poll();

	E take() throws InterruptedException;

	E poll(final long p0, final TimeUnit p1) throws InterruptedException;

	E element();

	E peek();

	boolean remove(final Object p0);

	boolean contains(final Object p0);

	int size();

	Iterator<E> iterator();

	void push(final E p0);
}
