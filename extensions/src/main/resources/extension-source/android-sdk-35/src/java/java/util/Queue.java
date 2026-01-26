package java.util;

public interface Queue<E> extends Collection<E> {
	boolean add(final E p0);

	boolean offer(final E p0);

	E remove();

	@RecentlyNullable
	E poll();

	E element();

	@RecentlyNullable
	E peek();
}
