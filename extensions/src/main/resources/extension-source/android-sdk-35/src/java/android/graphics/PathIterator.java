package android.graphics;

import java.util.Iterator;

public class PathIterator implements Iterator<Segment>
{
    public static final int VERB_CLOSE = 5;
    public static final int VERB_CONIC = 3;
    public static final int VERB_CUBIC = 4;
    public static final int VERB_DONE = 6;
    public static final int VERB_LINE = 1;
    public static final int VERB_MOVE = 0;
    public static final int VERB_QUAD = 2;
    
    PathIterator() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int next(@NonNull final float[] points, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasNext() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int peek() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public Segment next() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Segment
    {
        Segment() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public int getVerb() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public float[] getPoints() {
            throw new RuntimeException("Stub!");
        }
        
        public float getConicWeight() {
            throw new RuntimeException("Stub!");
        }
    }
}
