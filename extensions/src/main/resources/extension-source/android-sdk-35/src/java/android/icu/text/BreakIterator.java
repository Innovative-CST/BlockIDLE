package android.icu.text;

import android.icu.util.ULocale;
import java.util.Locale;
import java.text.CharacterIterator;

public abstract class BreakIterator implements Cloneable
{
    public static final int DONE = -1;
    public static final int KIND_CHARACTER = 0;
    public static final int KIND_LINE = 2;
    public static final int KIND_SENTENCE = 3;
    @Deprecated
    public static final int KIND_TITLE = 4;
    public static final int KIND_WORD = 1;
    public static final int WORD_IDEO = 400;
    public static final int WORD_IDEO_LIMIT = 500;
    public static final int WORD_KANA = 300;
    public static final int WORD_KANA_LIMIT = 400;
    public static final int WORD_LETTER = 200;
    public static final int WORD_LETTER_LIMIT = 300;
    public static final int WORD_NONE = 0;
    public static final int WORD_NONE_LIMIT = 100;
    public static final int WORD_NUMBER = 100;
    public static final int WORD_NUMBER_LIMIT = 200;
    
    protected BreakIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int first();
    
    public abstract int last();
    
    public abstract int next(final int p0);
    
    public abstract int next();
    
    public abstract int previous();
    
    public abstract int following(final int p0);
    
    public int preceding(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBoundary(final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int current();
    
    public int getRuleStatus() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRuleStatusVec(final int[] fillInArray) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract CharacterIterator getText();
    
    public void setText(final String newText) {
        throw new RuntimeException("Stub!");
    }
    
    public void setText(final CharSequence newText) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setText(final CharacterIterator p0);
    
    public static BreakIterator getWordInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getWordInstance(final Locale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getWordInstance(final ULocale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getLineInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getLineInstance(final Locale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getLineInstance(final ULocale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getCharacterInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getCharacterInstance(final Locale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getCharacterInstance(final ULocale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getSentenceInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getSentenceInstance(final Locale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static BreakIterator getSentenceInstance(final ULocale where) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static BreakIterator getTitleInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static BreakIterator getTitleInstance(final Locale where) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static BreakIterator getTitleInstance(final ULocale where) {
        throw new RuntimeException("Stub!");
    }
    
    public static synchronized Locale[] getAvailableLocales() {
        throw new RuntimeException("Stub!");
    }
}
