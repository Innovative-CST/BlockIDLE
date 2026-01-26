package android.icu.text;

import java.util.Enumeration;
import android.icu.util.ULocale;
import java.util.Locale;

public abstract class Transliterator
{
    public static final int FORWARD = 0;
    public static final int REVERSE = 1;
    
    Transliterator() {
        throw new RuntimeException("Stub!");
    }
    
    public final int transliterate(final Replaceable text, final int start, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public final void transliterate(final Replaceable text) {
        throw new RuntimeException("Stub!");
    }
    
    public final String transliterate(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public final void transliterate(final Replaceable text, final Position index, final String insertion) {
        throw new RuntimeException("Stub!");
    }
    
    public final void transliterate(final Replaceable text, final Position index, final int insertion) {
        throw new RuntimeException("Stub!");
    }
    
    public final void transliterate(final Replaceable text, final Position index) {
        throw new RuntimeException("Stub!");
    }
    
    public final void finishTransliteration(final Replaceable text, final Position index) {
        throw new RuntimeException("Stub!");
    }
    
    public void filteredTransliterate(final Replaceable text, final Position index, final boolean incremental) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getMaximumContextLength() {
        throw new RuntimeException("Stub!");
    }
    
    public final String getID() {
        throw new RuntimeException("Stub!");
    }
    
    public static final String getDisplayName(final String ID) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final String id, final Locale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public static String getDisplayName(final String id, final ULocale inLocale) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeFilter getFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilter(final UnicodeFilter filter) {
        throw new RuntimeException("Stub!");
    }
    
    public static final Transliterator getInstance(final String ID) {
        throw new RuntimeException("Stub!");
    }
    
    public static Transliterator getInstance(final String ID, final int dir) {
        throw new RuntimeException("Stub!");
    }
    
    public static final Transliterator createFromRules(final String ID, final String rules, final int dir) {
        throw new RuntimeException("Stub!");
    }
    
    public String toRules(final boolean escapeUnprintable) {
        throw new RuntimeException("Stub!");
    }
    
    public Transliterator[] getElements() {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet getSourceSet() {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet getTargetSet() {
        throw new RuntimeException("Stub!");
    }
    
    public final Transliterator getInverse() {
        throw new RuntimeException("Stub!");
    }
    
    public static final Enumeration<String> getAvailableIDs() {
        throw new RuntimeException("Stub!");
    }
    
    public static final Enumeration<String> getAvailableSources() {
        throw new RuntimeException("Stub!");
    }
    
    public static final Enumeration<String> getAvailableTargets(final String source) {
        throw new RuntimeException("Stub!");
    }
    
    public static final Enumeration<String> getAvailableVariants(final String source, final String target) {
        throw new RuntimeException("Stub!");
    }
    
    public static class Position
    {
        public int contextLimit;
        public int contextStart;
        public int limit;
        public int start;
        
        public Position() {
            throw new RuntimeException("Stub!");
        }
        
        public Position(final int contextStart, final int contextLimit, final int start) {
            throw new RuntimeException("Stub!");
        }
        
        public Position(final int contextStart, final int contextLimit, final int start, final int limit) {
            throw new RuntimeException("Stub!");
        }
        
        public Position(final Position pos) {
            throw new RuntimeException("Stub!");
        }
        
        public void set(final Position pos) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
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
        
        public final void validate(final int length) {
            throw new RuntimeException("Stub!");
        }
    }
}
