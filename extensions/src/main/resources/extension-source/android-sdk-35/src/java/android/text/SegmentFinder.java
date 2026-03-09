package android.text;

public abstract class SegmentFinder
{
    public static final int DONE = -1;
    
    public SegmentFinder() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract int previousStartBoundary(final int p0);
    
    public abstract int previousEndBoundary(final int p0);
    
    public abstract int nextStartBoundary(final int p0);
    
    public abstract int nextEndBoundary(final int p0);
    
    public static class PrescribedSegmentFinder extends SegmentFinder
    {
        public PrescribedSegmentFinder(@NonNull final int[] segments) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int previousStartBoundary(final int offset) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int previousEndBoundary(final int offset) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int nextStartBoundary(final int offset) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int nextEndBoundary(final int offset) {
            throw new RuntimeException("Stub!");
        }
    }
}
