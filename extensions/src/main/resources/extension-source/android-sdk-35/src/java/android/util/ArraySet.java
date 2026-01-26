package android.util;

import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Set;
import java.util.Collection;

public final class ArraySet<E> implements Collection<E>, Set<E>
{
    public ArraySet() {
        throw new RuntimeException("Stub!");
    }
    
    public ArraySet(final int capacity) {
        throw new RuntimeException("Stub!");
    }
    
    public ArraySet(final ArraySet<E> set) {
        throw new RuntimeException("Stub!");
    }
    
    public ArraySet(final Collection<? extends E> set) {
        throw new RuntimeException("Stub!");
    }
    
    public ArraySet(@Nullable final E[] array) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    public void ensureCapacity(final int minimumCapacity) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean contains(final Object key) {
        throw new RuntimeException("Stub!");
    }
    
    public int indexOf(final Object key) {
        throw new RuntimeException("Stub!");
    }
    
    public E valueAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean add(final E value) {
        throw new RuntimeException("Stub!");
    }
    
    public void addAll(final ArraySet<? extends E> array) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean remove(final Object object) {
        throw new RuntimeException("Stub!");
    }
    
    public E removeAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeAll(final ArraySet<? extends E> array) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean removeIf(final Predicate<? super E> filter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int size() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void forEach(final Consumer<? super E> action) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object[] toArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object object) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Iterator<E> iterator() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean containsAll(final Collection<?> collection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean addAll(final Collection<? extends E> collection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        throw new RuntimeException("Stub!");
    }
}
