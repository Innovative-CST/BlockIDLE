package java.util.concurrent;

import java.util.Collection;
import java.util.Queue;

public interface BlockingQueue<E> extends Queue<E> {
	boolean add(final E p0);

	boolean offer(final E p0);

	void put(final E p0) throws InterruptedException;

	boolean offer(final E p0, final long p1, final TimeUnit p2) throws InterruptedException;

	E take() throws InterruptedException;

	E poll(final long p0, final TimeUnit p1) throws InterruptedException;

	int remainingCapacity();

	boolean remove(final Object p0);

	boolean contains(final Object p0);

	int drainTo(final Collection<? super E> p0);

	int drainTo(final Collection<? super E> p0, final int p1);
}
