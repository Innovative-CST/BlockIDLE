package android.icu.text;

public abstract class UnicodeFilter implements UnicodeMatcher
{
    UnicodeFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean contains(final int p0);
    
    @Override
    public int matches(final Replaceable text, final int[] offset, final int limit, final boolean incremental) {
        throw new RuntimeException("Stub!");
    }
}
