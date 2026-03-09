package android.icu.text;

import java.text.CharacterIterator;

public abstract class UCharacterIterator implements Cloneable
{
    public static final int DONE = -1;
    
    protected UCharacterIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public static final UCharacterIterator getInstance(final Replaceable source) {
        throw new RuntimeException("Stub!");
    }
    
    public static final UCharacterIterator getInstance(final String source) {
        throw new RuntimeException("Stub!");
    }
    
    public static final UCharacterIterator getInstance(final char[] source) {
        throw new RuntimeException("Stub!");
    }
    
    public static final UCharacterIterator getInstance(final char[] source, final int start, final int limit) {
        throw new RuntimeException("Stub!");
    }
    
    public static final UCharacterIterator getInstance(final StringBuffer source) {
        throw new RuntimeException("Stub!");
    }
    
    public static final UCharacterIterator getInstance(final CharacterIterator source) {
        throw new RuntimeException("Stub!");
    }
    
    public CharacterIterator getCharacterIterator() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int current();
    
    public int currentCodePoint() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getLength();
    
    public abstract int getIndex();
    
    public abstract int next();
    
    public int nextCodePoint() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int previous();
    
    public int previousCodePoint() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setIndex(final int p0);
    
    public void setToLimit() {
        throw new RuntimeException("Stub!");
    }
    
    public void setToStart() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int getText(final char[] p0, final int p1);
    
    public final int getText(final char[] fillIn) {
        throw new RuntimeException("Stub!");
    }
    
    public String getText() {
        throw new RuntimeException("Stub!");
    }
    
    public int moveIndex(final int delta) {
        throw new RuntimeException("Stub!");
    }
    
    public int moveCodePointIndex(final int delta) {
        throw new RuntimeException("Stub!");
    }
    
    public Object clone() throws CloneNotSupportedException {
        throw new RuntimeException("Stub!");
    }
}
