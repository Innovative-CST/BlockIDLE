package android.app.usage;

public final class NetworkStats implements AutoCloseable
{
    NetworkStats() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getNextBucket(@Nullable final Bucket bucketOut) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasNextBucket() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public static class Bucket
    {
        public static final int DEFAULT_NETWORK_ALL = -1;
        public static final int DEFAULT_NETWORK_NO = 1;
        public static final int DEFAULT_NETWORK_YES = 2;
        public static final int METERED_ALL = -1;
        public static final int METERED_NO = 1;
        public static final int METERED_YES = 2;
        public static final int ROAMING_ALL = -1;
        public static final int ROAMING_NO = 1;
        public static final int ROAMING_YES = 2;
        public static final int STATE_ALL = -1;
        public static final int STATE_DEFAULT = 1;
        public static final int STATE_FOREGROUND = 2;
        public static final int TAG_NONE = 0;
        public static final int UID_ALL = -1;
        public static final int UID_REMOVED = -4;
        public static final int UID_TETHERING = -5;
        
        public Bucket() {
            throw new RuntimeException("Stub!");
        }
        
        public int getUid() {
            throw new RuntimeException("Stub!");
        }
        
        public int getTag() {
            throw new RuntimeException("Stub!");
        }
        
        public int getState() {
            throw new RuntimeException("Stub!");
        }
        
        public int getMetered() {
            throw new RuntimeException("Stub!");
        }
        
        public int getRoaming() {
            throw new RuntimeException("Stub!");
        }
        
        public int getDefaultNetworkStatus() {
            throw new RuntimeException("Stub!");
        }
        
        public long getStartTimeStamp() {
            throw new RuntimeException("Stub!");
        }
        
        public long getEndTimeStamp() {
            throw new RuntimeException("Stub!");
        }
        
        public long getRxBytes() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTxBytes() {
            throw new RuntimeException("Stub!");
        }
        
        public long getRxPackets() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTxPackets() {
            throw new RuntimeException("Stub!");
        }
    }
}
