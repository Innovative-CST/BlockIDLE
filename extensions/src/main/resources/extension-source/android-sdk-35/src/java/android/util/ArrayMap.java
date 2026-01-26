package android.util;

import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.Collection;
import java.util.Map;

public final class ArrayMap<K, V> implements Map<K, V>
{
    public ArrayMap() {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayMap(final int capacity) {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayMap(final ArrayMap<K, V> map) {
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
    public boolean containsKey(final Object key) {
        throw new RuntimeException("Stub!");
    }
    
    public int indexOfKey(final Object key) {
        throw new RuntimeException("Stub!");
    }
    
    public int indexOfValue(final Object value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean containsValue(final Object value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public V get(final Object key) {
        throw new RuntimeException("Stub!");
    }
    
    public K keyAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public V valueAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public V setValueAt(final int index, final V value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public V put(final K key, final V value) {
        throw new RuntimeException("Stub!");
    }
    
    public void putAll(final ArrayMap<? extends K, ? extends V> array) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public V remove(final Object key) {
        throw new RuntimeException("Stub!");
    }
    
    public V removeAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int size() {
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
    
    public boolean containsAll(final Collection<?> collection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void forEach(final BiConsumer<? super K, ? super V> action) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean removeAll(final Collection<?> collection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void replaceAll(final BiFunction<? super K, ? super V, ? extends V> function) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean retainAll(final Collection<?> collection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Set<K> keySet() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Collection<V> values() {
        throw new RuntimeException("Stub!");
    }
}
