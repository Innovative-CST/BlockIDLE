package android.text.style;

public interface TabStopSpan extends ParagraphStyle
{
    int getTabStop();
    
    public static class Standard implements TabStopSpan
    {
        public Standard(final int offset) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int getTabStop() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
}
