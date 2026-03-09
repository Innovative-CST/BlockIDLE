package java.util;

public abstract class AbstractCollection<E> implements Collection<E> {
	protected AbstractCollection() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public abstract Iterator<E> iterator();

	@Override
	public abstract int size();

	@Override
	public boolean isEmpty() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public Object[] toArray() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public <T> T[] toArray(@RecentlyNonNull final T[] a) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean containsAll(@RecentlyNonNull final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(@RecentlyNonNull final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeAll(@RecentlyNonNull final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean retainAll(@RecentlyNonNull final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}
}
