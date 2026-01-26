package android.media;

import java.util.UUID;

public abstract class DrmInitData
{
    DrmInitData() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract SchemeInitData get(final UUID p0);
    
    public int getSchemeInitDataCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SchemeInitData getSchemeInitDataAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public static final class SchemeInitData
    {
        @NonNull
        public static final UUID UUID_NIL;
        public final byte[] data;
        public final String mimeType;
        @NonNull
        public final UUID uuid;
        
        public SchemeInitData(@NonNull final UUID uuid, @NonNull final String mimeType, @NonNull final byte[] data) {
            this.data = null;
            this.mimeType = null;
            this.uuid = null;
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            UUID_NIL = null;
        }
    }
}
