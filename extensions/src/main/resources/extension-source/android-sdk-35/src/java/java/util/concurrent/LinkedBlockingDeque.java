package java.util.concurrent;

import java.io.Serializable;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LinkedBlockingDeque<E> extends AbstractQueue<E> implements BlockingDeque<E>, Serializable {
	public LinkedBlockingDeque() {
		throw new RuntimeException("Stub!");
	}

	public LinkedBlockingDeque(final int capacity) {
		throw new RuntimeException("Stub!");
	}

	public LinkedBlockingDeque(final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addFirst(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void addLast(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offerFirst(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offerLast(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putFirst(final E e) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void putLast(final E e) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offerFirst(final E e, final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offerLast(final E e, final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E removeFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E removeLast() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pollFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pollLast() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E takeFirst() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E takeLast() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pollFirst(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pollLast(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E getFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E getLast() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peekFirst() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peekLast() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeFirstOccurrence(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeLastOccurrence(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean add(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offer(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void put(final E e) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean offer(final E e, final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E remove() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E poll() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E take() throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E poll(final long timeout, final TimeUnit unit) throws InterruptedException {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E element() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E peek() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int remainingCapacity() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int drainTo(final Collection<? super E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int drainTo(final Collection<? super E> c, final int maxElements) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void push(final E e) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public E pop() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean remove(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int size() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean contains(final Object o) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean addAll(final Collection<? extends E> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Object[] toArray() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public <T> T[] toArray(final T[] a) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void clear() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Iterator<E> iterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Iterator<E> descendingIterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public Spliterator<E> spliterator() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public void forEach(final Consumer<? super E> action) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeIf(final Predicate<? super E> filter) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean removeAll(final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean retainAll(final Collection<?> c) {
		throw new RuntimeException("Stub!");
	}
}
