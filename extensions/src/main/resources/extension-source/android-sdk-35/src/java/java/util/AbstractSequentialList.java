package java.util;

public abstract class AbstractSequentialList<E> extends AbstractList<E> {
	protected AbstractSequentialList() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E get(final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E set(final int index, final E element) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void add(final int index, final E element) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E remove(final int index) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(final int index, @RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public abstract ListIterator<E> listIterator(final int p0);
}
