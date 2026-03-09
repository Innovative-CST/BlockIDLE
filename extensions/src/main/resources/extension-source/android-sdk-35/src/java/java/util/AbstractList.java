package java.util;

public abstract class AbstractList<E> extends AbstractCollection<E> implements List<E> {
	protected transient int modCount;

	protected AbstractList() {
		this.modCount = 0;
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public abstract E get(final int p0);

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
	public int indexOf(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int lastIndexOf(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
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
	public ListIterator<E> listIterator() {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public ListIterator<E> listIterator(final int index) {
		throw new RuntimeException("Stub!");
	}

	@RecentlyNonNull
	@Override
	public List<E> subList(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(@RecentlyNullable final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	protected void removeRange(final int fromIndex, final int toIndex) {
		throw new RuntimeException("Stub!");
	}
}
