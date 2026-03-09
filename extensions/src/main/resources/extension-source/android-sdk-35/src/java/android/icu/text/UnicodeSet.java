package android.icu.text;

import java.util.Iterator;
import java.util.Collection;
import java.text.ParsePosition;
import android.icu.util.Freezable;

public class UnicodeSet extends UnicodeFilter implements Iterable<String>, Comparable<UnicodeSet>, Freezable<UnicodeSet>
{
    public static final int ADD_CASE_MAPPINGS = 4;
    public static final UnicodeSet ALL_CODE_POINTS;
    @Deprecated
    public static final int CASE = 2;
    public static final int CASE_INSENSITIVE = 2;
    public static final UnicodeSet EMPTY;
    public static final int IGNORE_SPACE = 1;
    public static final int MAX_VALUE = 1114111;
    public static final int MIN_VALUE = 0;
    
    public UnicodeSet() {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final UnicodeSet other) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final int... pairs) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final String pattern, final boolean ignoreWhitespace) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final String pattern, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final String pattern, final ParsePosition pos, final SymbolTable symbols) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet(final String pattern, final ParsePosition pos, final SymbolTable symbols, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet set(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet set(final UnicodeSet other) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet applyPattern(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet applyPattern(final String pattern, final boolean ignoreWhitespace) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet applyPattern(final String pattern, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toPattern(final boolean escapeUnprintable) {
        throw new RuntimeException("Stub!");
    }
    
    public StringBuffer _generatePattern(final StringBuffer result, final boolean escapeUnprintable) {
        throw new RuntimeException("Stub!");
    }
    
    public StringBuffer _generatePattern(final StringBuffer result, final boolean escapeUnprintable, final boolean includeStrings) {
        throw new RuntimeException("Stub!");
    }
    
    public int size() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmpty() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasStrings() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean matchesIndexValue(final int v) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int matches(final Replaceable text, final int[] offset, final int limit, final boolean incremental) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addMatchSetTo(final UnicodeSet toUnionTo) {
        throw new RuntimeException("Stub!");
    }
    
    public int indexOf(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public int charAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet add(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet addAll(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet add(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet add(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet addAll(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet retainAll(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet complementAll(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet removeAll(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet removeAllStrings() {
        throw new RuntimeException("Stub!");
    }
    
    public static UnicodeSet from(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public static UnicodeSet fromAll(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet retain(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet retain(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet retain(final CharSequence cs) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet remove(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet remove(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet remove(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet complement(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet complement(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet complement() {
        throw new RuntimeException("Stub!");
    }
    
    public final UnicodeSet complement(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean contains(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean contains(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean contains(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsAll(final UnicodeSet b) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsAll(final String s) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsNone(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsNone(final UnicodeSet b) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean containsNone(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean containsSome(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean containsSome(final UnicodeSet s) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean containsSome(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet addAll(final UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet retainAll(final UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet removeAll(final UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet complementAll(final UnicodeSet c) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet clear() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRangeCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRangeStart(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRangeEnd(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet compact() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
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
    
    public <T extends Collection<String>> T addAllTo(final T target) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet add(final Iterable<?> source) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet addAll(final Iterable<?> source) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet applyIntPropertyValue(final int prop, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet applyPropertyAlias(final String propertyAlias, final String valueAlias) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet applyPropertyAlias(final String propertyAlias, final String valueAlias, final SymbolTable symbols) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet closeOver(final int attribute) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFrozen() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public UnicodeSet freeze() {
        throw new RuntimeException("Stub!");
    }
    
    public int span(final CharSequence s, final SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    public int span(final CharSequence s, final int start, final SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    public int spanBack(final CharSequence s, final SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    public int spanBack(final CharSequence s, final int fromIndex, final SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public UnicodeSet cloneAsThawed() {
        throw new RuntimeException("Stub!");
    }
    
    public Iterable<EntryRange> ranges() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Iterator<String> iterator() {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends CharSequence> boolean containsAll(final Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends CharSequence> boolean containsNone(final Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }
    
    public final <T extends CharSequence> boolean containsSome(final Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends CharSequence> UnicodeSet addAll(final T... collection) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends CharSequence> UnicodeSet removeAll(final Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }
    
    public <T extends CharSequence> UnicodeSet retainAll(final Iterable<T> collection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final UnicodeSet o) {
        throw new RuntimeException("Stub!");
    }
    
    public int compareTo(final UnicodeSet o, final ComparisonStyle style) {
        throw new RuntimeException("Stub!");
    }
    
    public int compareTo(final Iterable<String> other) {
        throw new RuntimeException("Stub!");
    }
    
    public Collection<String> strings() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ALL_CODE_POINTS = null;
        EMPTY = null;
    }
    
    public enum ComparisonStyle
    {
        SHORTER_FIRST, 
        LEXICOGRAPHIC, 
        LONGER_FIRST;
    }
    
    public static class EntryRange
    {
        public int codepoint;
        public int codepointEnd;
        
        EntryRange() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public enum SpanCondition
    {
        NOT_CONTAINED, 
        CONTAINED, 
        SIMPLE, 
        CONDITION_COUNT;
    }
}
