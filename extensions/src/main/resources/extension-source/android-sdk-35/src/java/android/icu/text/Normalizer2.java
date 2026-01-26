package android.icu.text;

import java.io.InputStream;

public abstract class Normalizer2
{
    Normalizer2() {
        throw new RuntimeException("Stub!");
    }
    
    public static Normalizer2 getNFCInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static Normalizer2 getNFDInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static Normalizer2 getNFKCInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static Normalizer2 getNFKDInstance() {
        throw new RuntimeException("Stub!");
    }
    
    public static Normalizer2 getNFKCCasefoldInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Normalizer2 getInstance(final InputStream data, final String name, final Mode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public String normalize(final CharSequence src) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract StringBuilder normalize(final CharSequence p0, final StringBuilder p1);
    
    public abstract Appendable normalize(final CharSequence p0, final Appendable p1);
    
    public abstract StringBuilder normalizeSecondAndAppend(final StringBuilder p0, final CharSequence p1);
    
    public abstract StringBuilder append(final StringBuilder p0, final CharSequence p1);
    
    public abstract String getDecomposition(final int p0);
    
    public String getRawDecomposition(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public int composePair(final int a, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public int getCombiningClass(final int c) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean isNormalized(final CharSequence p0);
    
    public abstract Normalizer.QuickCheckResult quickCheck(final CharSequence p0);
    
    public abstract int spanQuickCheckYes(final CharSequence p0);
    
    public abstract boolean hasBoundaryBefore(final int p0);
    
    public abstract boolean hasBoundaryAfter(final int p0);
    
    public abstract boolean isInert(final int p0);
    
    public enum Mode
    {
        COMPOSE, 
        DECOMPOSE, 
        FCD, 
        COMPOSE_CONTIGUOUS;
    }
}
