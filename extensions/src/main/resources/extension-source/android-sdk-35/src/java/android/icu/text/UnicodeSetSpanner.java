package android.icu.text;

public class UnicodeSetSpanner
{
    public UnicodeSetSpanner(final UnicodeSet source) {
        throw new RuntimeException("Stub!");
    }
    
    public UnicodeSet getUnicodeSet() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public int countIn(final CharSequence sequence) {
        throw new RuntimeException("Stub!");
    }
    
    public int countIn(final CharSequence sequence, final CountMethod countMethod) {
        throw new RuntimeException("Stub!");
    }
    
    public int countIn(final CharSequence sequence, final CountMethod countMethod, final UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    public String deleteFrom(final CharSequence sequence) {
        throw new RuntimeException("Stub!");
    }
    
    public String deleteFrom(final CharSequence sequence, final UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    public String replaceFrom(final CharSequence sequence, final CharSequence replacement) {
        throw new RuntimeException("Stub!");
    }
    
    public String replaceFrom(final CharSequence sequence, final CharSequence replacement, final CountMethod countMethod) {
        throw new RuntimeException("Stub!");
    }
    
    public String replaceFrom(final CharSequence sequence, final CharSequence replacement, final CountMethod countMethod, final UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence trim(final CharSequence sequence) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence trim(final CharSequence sequence, final TrimOption trimOption) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence trim(final CharSequence sequence, final TrimOption trimOption, final UnicodeSet.SpanCondition spanCondition) {
        throw new RuntimeException("Stub!");
    }
    
    public enum CountMethod
    {
        WHOLE_SPAN, 
        MIN_ELEMENTS;
    }
    
    public enum TrimOption
    {
        LEADING, 
        BOTH, 
        TRAILING;
    }
}
