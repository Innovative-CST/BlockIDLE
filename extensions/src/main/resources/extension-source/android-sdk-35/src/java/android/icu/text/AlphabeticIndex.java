package android.icu.text;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import android.icu.util.ULocale;

public final class AlphabeticIndex<V> implements Iterable<Bucket<V>>
{
    public AlphabeticIndex(final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex(final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex(final RuleBasedCollator collator) {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> addLabels(final UnicodeSet additions) {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> addLabels(final ULocale... additions) {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> addLabels(final Locale... additions) {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> setOverflowLabel(final String overflowLabel) {
        throw new RuntimeException("Stub!");
    }
    
    public String getUnderflowLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> setUnderflowLabel(final String underflowLabel) {
        throw new RuntimeException("Stub!");
    }
    
    public String getOverflowLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> setInflowLabel(final String inflowLabel) {
        throw new RuntimeException("Stub!");
    }
    
    public String getInflowLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxLabelCount() {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> setMaxLabelCount(final int maxLabelCount) {
        throw new RuntimeException("Stub!");
    }
    
    public ImmutableIndex<V> buildImmutableIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public List<String> getBucketLabels() {
        throw new RuntimeException("Stub!");
    }
    
    public RuleBasedCollator getCollator() {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> addRecord(final CharSequence name, final V data) {
        throw new RuntimeException("Stub!");
    }
    
    public int getBucketIndex(final CharSequence name) {
        throw new RuntimeException("Stub!");
    }
    
    public AlphabeticIndex<V> clearRecords() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBucketCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRecordCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Iterator<Bucket<V>> iterator() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Bucket<V> implements Iterable<Record<V>>
    {
        Bucket() {
            throw new RuntimeException("Stub!");
        }
        
        public String getLabel() {
            throw new RuntimeException("Stub!");
        }
        
        public LabelType getLabelType() {
            throw new RuntimeException("Stub!");
        }
        
        public int size() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Iterator<Record<V>> iterator() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        public enum LabelType
        {
            NORMAL, 
            UNDERFLOW, 
            INFLOW, 
            OVERFLOW;
        }
    }
    
    public static final class ImmutableIndex<V> implements Iterable<Bucket<V>>
    {
        ImmutableIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBucketCount() {
            throw new RuntimeException("Stub!");
        }
        
        public int getBucketIndex(final CharSequence name) {
            throw new RuntimeException("Stub!");
        }
        
        public Bucket<V> getBucket(final int index) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public Iterator<Bucket<V>> iterator() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class Record<V>
    {
        Record() {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequence getName() {
            throw new RuntimeException("Stub!");
        }
        
        public V getData() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
