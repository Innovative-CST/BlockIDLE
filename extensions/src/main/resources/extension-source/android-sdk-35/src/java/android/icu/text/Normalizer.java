package android.icu.text;

public final class Normalizer implements Cloneable
{
    public static final int COMPARE_CODE_POINT_ORDER = 32768;
    public static final int COMPARE_IGNORE_CASE = 65536;
    public static final int FOLD_CASE_DEFAULT = 0;
    public static final int FOLD_CASE_EXCLUDE_SPECIAL_I = 1;
    public static final int INPUT_IS_FCD = 131072;
    public static final QuickCheckResult MAYBE;
    public static final QuickCheckResult NO;
    public static final QuickCheckResult YES;
    
    Normalizer() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Object clone() {
        throw new RuntimeException("Stub!");
    }
    
    public static int compare(final char[] s1, final int s1Start, final int s1Limit, final char[] s2, final int s2Start, final int s2Limit, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static int compare(final String s1, final String s2, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static int compare(final char[] s1, final char[] s2, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static int compare(final int char32a, final int char32b, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    public static int compare(final int char32a, final String str2, final int options) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        MAYBE = null;
        NO = null;
        YES = null;
    }
    
    public static final class QuickCheckResult
    {
        QuickCheckResult() {
            throw new RuntimeException("Stub!");
        }
    }
}
