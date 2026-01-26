package android.icu.text;

import java.text.CharacterIterator;

public abstract class SearchIterator
{
    public static final int DONE = -1;
    protected BreakIterator breakIterator;
    protected int matchLength;
    protected CharacterIterator targetText;
    
    protected SearchIterator(final CharacterIterator target, final BreakIterator breaker) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndex(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverlapping(final boolean allowOverlap) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBreakIterator(final BreakIterator breakiter) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTarget(final CharacterIterator text) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMatchStart() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getIndex();
    
    public int getMatchLength() {
        throw new RuntimeException("Stub!");
    }
    
    public BreakIterator getBreakIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public CharacterIterator getTarget() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMatchedText() {
        throw new RuntimeException("Stub!");
    }
    
    public int next() {
        throw new RuntimeException("Stub!");
    }
    
    public int previous() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOverlapping() {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public final int first() {
        throw new RuntimeException("Stub!");
    }
    
    public final int following(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public final int last() {
        throw new RuntimeException("Stub!");
    }
    
    public final int preceding(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    protected void setMatchLength(final int length) {
        throw new RuntimeException("Stub!");
    }
    
    protected abstract int handleNext(final int p0);
    
    protected abstract int handlePrevious(final int p0);
    
    public void setElementComparisonType(final ElementComparisonType type) {
        throw new RuntimeException("Stub!");
    }
    
    public ElementComparisonType getElementComparisonType() {
        throw new RuntimeException("Stub!");
    }
    
    public enum ElementComparisonType
    {
        STANDARD_ELEMENT_COMPARISON, 
        PATTERN_BASE_WEIGHT_IS_WILDCARD, 
        ANY_BASE_WEIGHT_IS_WILDCARD;
    }
}
