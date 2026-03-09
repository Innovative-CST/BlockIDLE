package android.text;

import java.io.IOException;
import android.graphics.Paint;

public class SpannableStringBuilder implements CharSequence, GetChars, Spannable, Editable, Appendable
{
    public SpannableStringBuilder() {
        throw new RuntimeException("Stub!");
    }
    
    public SpannableStringBuilder(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public SpannableStringBuilder(final CharSequence text, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public static SpannableStringBuilder valueOf(final CharSequence source) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public char charAt(final int where) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int length() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder insert(final int where, final CharSequence tb, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder insert(final int where, final CharSequence tb) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder delete(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clear() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clearSpans() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder append(final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public SpannableStringBuilder append(final CharSequence text, final Object what, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder append(final CharSequence text, final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder append(final char text) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder replace(final int start, final int end, final CharSequence tb) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public SpannableStringBuilder replace(final int start, final int end, final CharSequence tb, final int tbstart, final int tbend) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSpan(final Object what, final int start, final int end, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeSpan(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanStart(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanEnd(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanFlags(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public <T> T[] getSpans(final int queryStart, final int queryEnd, @Nullable final Class<T> kind) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int nextSpanTransition(final int start, final int limit, final Class kind) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence subSequence(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getChars(final int start, final int end, final char[] dest, final int destoff) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTextWatcherDepth() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getTextRunCursor(final int contextStart, final int contextEnd, final int dir, final int offset, final int cursorOpt, final Paint p) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFilters(final InputFilter[] filters) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public InputFilter[] getFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
}
