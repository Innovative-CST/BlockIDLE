package android.text;

import java.util.Locale;

public interface InputFilter
{
    CharSequence filter(final CharSequence p0, final int p1, final int p2, final Spanned p3, final int p4, final int p5);
    
    public static class AllCaps implements InputFilter
    {
        public AllCaps() {
            throw new RuntimeException("Stub!");
        }
        
        public AllCaps(@NonNull final Locale locale) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public CharSequence filter(final CharSequence source, final int start, final int end, final Spanned dest, final int dstart, final int dend) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class LengthFilter implements InputFilter
    {
        public LengthFilter(final int max) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public CharSequence filter(final CharSequence source, final int start, final int end, final Spanned dest, final int dstart, final int dend) {
            throw new RuntimeException("Stub!");
        }
        
        public int getMax() {
            throw new RuntimeException("Stub!");
        }
    }
}
