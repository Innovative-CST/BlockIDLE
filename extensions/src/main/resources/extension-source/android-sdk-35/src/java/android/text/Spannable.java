package android.text;

public interface Spannable extends Spanned
{
    void setSpan(final Object p0, final int p1, final int p2, final int p3);
    
    void removeSpan(final Object p0);
    
    public static class Factory
    {
        public Factory() {
            throw new RuntimeException("Stub!");
        }
        
        public static Factory getInstance() {
            throw new RuntimeException("Stub!");
        }
        
        public Spannable newSpannable(final CharSequence source) {
            throw new RuntimeException("Stub!");
        }
    }
}
