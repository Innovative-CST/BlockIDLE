package android.icu.text;

import android.icu.util.ULocale;
import java.util.Locale;
import java.text.CharacterIterator;

public final class StringSearch extends SearchIterator
{
    public StringSearch(final String pattern, final CharacterIterator target, final RuleBasedCollator collator, final BreakIterator breakiter) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public StringSearch(final String pattern, final CharacterIterator target, final RuleBasedCollator collator) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public StringSearch(final String pattern, final CharacterIterator target, final Locale locale) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public StringSearch(final String pattern, final CharacterIterator target, final ULocale locale) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public StringSearch(final String pattern, final String target) {
        super(null, null);
        throw new RuntimeException("Stub!");
    }
    
    public RuleBasedCollator getCollator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCollator(final RuleBasedCollator collator) {
        throw new RuntimeException("Stub!");
    }
    
    public String getPattern() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPattern(final String pattern) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCanonical() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCanonical(final boolean allowCanonical) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTarget(final CharacterIterator text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setIndex(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handleNext(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int handlePrevious(final int position) {
        throw new RuntimeException("Stub!");
    }
}
