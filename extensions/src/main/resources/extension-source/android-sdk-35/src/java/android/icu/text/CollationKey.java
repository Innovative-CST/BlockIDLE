package android.icu.text;

public final class CollationKey implements Comparable<CollationKey>
{
    public CollationKey(final String source, final byte[] key) {
        throw new RuntimeException("Stub!");
    }
    
    public String getSourceString() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] toByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int compareTo(final CollationKey target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object target) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean equals(final CollationKey target) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public CollationKey getBound(final int boundType, final int noOfLevels) {
        throw new RuntimeException("Stub!");
    }
    
    public CollationKey merge(final CollationKey source) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class BoundMode
    {
        public static final int LOWER = 0;
        public static final int UPPER = 1;
        public static final int UPPER_LONG = 2;
        
        BoundMode() {
            throw new RuntimeException("Stub!");
        }
    }
}
