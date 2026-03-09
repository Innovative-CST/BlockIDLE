package android.text;

public class SpannableString implements CharSequence, GetChars, Spannable
{
    public SpannableString(final CharSequence source) {
        throw new RuntimeException("Stub!");
    }
    
    public static SpannableString valueOf(final CharSequence source) {
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
    public final CharSequence subSequence(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void getChars(final int start, final int end, final char[] dest, final int off) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final int length() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanStart(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanFlags(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int nextSpanTransition(final int start, final int limit, final Class kind) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public <T> T[] getSpans(final int queryStart, final int queryEnd, final Class<T> kind) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getSpanEnd(final Object what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final char charAt(final int i) {
        throw new RuntimeException("Stub!");
    }
}
