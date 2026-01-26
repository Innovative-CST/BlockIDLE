package android.telephony.ims.feature;

public class MmTelFeature
{
    MmTelFeature() {
        throw new RuntimeException("Stub!");
    }
    
    public static class MmTelCapabilities
    {
        public static final int CAPABILITY_TYPE_CALL_COMPOSER = 16;
        public static final int CAPABILITY_TYPE_CALL_COMPOSER_BUSINESS_ONLY = 32;
        public static final int CAPABILITY_TYPE_SMS = 8;
        public static final int CAPABILITY_TYPE_UT = 4;
        public static final int CAPABILITY_TYPE_VIDEO = 2;
        public static final int CAPABILITY_TYPE_VOICE = 1;
        
        MmTelCapabilities() {
            throw new RuntimeException("Stub!");
        }
        
        public final boolean isCapable(final int capabilities) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
    }
}
