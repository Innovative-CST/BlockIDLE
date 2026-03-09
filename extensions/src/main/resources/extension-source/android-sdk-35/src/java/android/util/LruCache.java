package android.util;

import java.util.Map;

public class LruCache<K, V>
{
    public LruCache(final int maxSize) {
        throw new RuntimeException("Stub!");
    }
    
    public void resize(final int maxSize) {
        throw new RuntimeException("Stub!");
    }
    
    public final V get(final K key) {
        throw new RuntimeException("Stub!");
    }
    
    public final V put(final K key, final V value) {
        throw new RuntimeException("Stub!");
    }
    
    public void trimToSize(final int maxSize) {
        throw new RuntimeException("Stub!");
    }
    
    public final V remove(final K key) {
        throw new RuntimeException("Stub!");
    }
    
    protected void entryRemoved(final boolean evicted, final K key, final V oldValue, final V newValue) {
        throw new RuntimeException("Stub!");
    }
    
    protected V create(final K key) {
        throw new RuntimeException("Stub!");
    }
    
    protected int sizeOf(final K key, final V value) {
        throw new RuntimeException("Stub!");
    }
    
    public final void evictAll() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized int size() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized int maxSize() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized int hitCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized int missCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized int createCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized int putCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized int evictionCount() {
        throw new RuntimeException("Stub!");
    }
    
    public final synchronized Map<K, V> snapshot() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final synchronized String toString() {
        throw new RuntimeException("Stub!");
    }
}
