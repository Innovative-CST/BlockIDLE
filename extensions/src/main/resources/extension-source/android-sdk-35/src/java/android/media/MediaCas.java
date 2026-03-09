package android.media;

import android.os.Handler;
import android.content.Context;

public final class MediaCas implements AutoCloseable
{
    public static final int PLUGIN_STATUS_PHYSICAL_MODULE_CHANGED = 0;
    public static final int PLUGIN_STATUS_SESSION_NUMBER_CHANGED = 1;
    public static final int SCRAMBLING_MODE_AES128 = 9;
    public static final int SCRAMBLING_MODE_AES_CBC = 14;
    public static final int SCRAMBLING_MODE_AES_ECB = 10;
    public static final int SCRAMBLING_MODE_AES_SCTE52 = 11;
    public static final int SCRAMBLING_MODE_DVB_CISSA_V1 = 6;
    public static final int SCRAMBLING_MODE_DVB_CSA1 = 1;
    public static final int SCRAMBLING_MODE_DVB_CSA2 = 2;
    public static final int SCRAMBLING_MODE_DVB_CSA3_ENHANCE = 5;
    public static final int SCRAMBLING_MODE_DVB_CSA3_MINIMAL = 4;
    public static final int SCRAMBLING_MODE_DVB_CSA3_STANDARD = 3;
    public static final int SCRAMBLING_MODE_DVB_IDSA = 7;
    public static final int SCRAMBLING_MODE_MULTI2 = 8;
    public static final int SCRAMBLING_MODE_RESERVED = 0;
    public static final int SCRAMBLING_MODE_TDES_ECB = 12;
    public static final int SCRAMBLING_MODE_TDES_SCTE52 = 13;
    public static final int SESSION_USAGE_LIVE = 0;
    public static final int SESSION_USAGE_PLAYBACK = 1;
    public static final int SESSION_USAGE_RECORD = 2;
    public static final int SESSION_USAGE_TIMESHIFT = 3;
    
    public MediaCas(final int casSystemId) throws MediaCasException.UnsupportedCasException {
        throw new RuntimeException("Stub!");
    }
    
    public MediaCas(@NonNull final Context context, final int casSystemId, @Nullable final String tvInputServiceSessionId, final int priorityHint) throws MediaCasException.UnsupportedCasException {
        throw new RuntimeException("Stub!");
    }
    
    public MediaCas(@NonNull final Context context, final int casSystemId, @Nullable final String tvInputServiceSessionId, final int priorityHint, @Nullable final Handler handler, @Nullable final EventListener listener) throws MediaCasException.UnsupportedCasException {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isSystemIdSupported(final int CA_system_id) {
        throw new RuntimeException("Stub!");
    }
    
    public static PluginDescriptor[] enumeratePlugins() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEventListener(@Nullable final EventListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPrivateData(@NonNull final byte[] data) throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    public Session openSession() throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Session openSession(final int sessionUsage, final int scramblingMode) throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    public void processEmm(@NonNull final byte[] data, final int offset, final int length) throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    public void processEmm(@NonNull final byte[] data) throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    public void sendEvent(final int event, final int arg, @Nullable final byte[] data) throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    public void provision(@NonNull final String provisionString) throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    public void refreshEntitlements(final int refreshType, @Nullable final byte[] refreshData) throws MediaCasException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public interface EventListener
    {
        void onEvent(@NonNull final MediaCas p0, final int p1, final int p2, @Nullable final byte[] p3);
        
        default void onSessionEvent(@NonNull final MediaCas mediaCas, @NonNull final Session session, final int event, final int arg, @Nullable final byte[] data) {
            throw new RuntimeException("Stub!");
        }
        
        default void onPluginStatusUpdate(@NonNull final MediaCas mediaCas, final int status, final int arg) {
            throw new RuntimeException("Stub!");
        }
        
        default void onResourceLost(@NonNull final MediaCas mediaCas) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class PluginDescriptor
    {
        PluginDescriptor() {
            throw new RuntimeException("Stub!");
        }
        
        public int getSystemId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getName() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public final class Session implements AutoCloseable
    {
        Session() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object obj) {
            throw new RuntimeException("Stub!");
        }
        
        public void setPrivateData(@NonNull final byte[] data) throws MediaCasException {
            throw new RuntimeException("Stub!");
        }
        
        public void processEcm(@NonNull final byte[] data, final int offset, final int length) throws MediaCasException {
            throw new RuntimeException("Stub!");
        }
        
        public void processEcm(@NonNull final byte[] data) throws MediaCasException {
            throw new RuntimeException("Stub!");
        }
        
        public void sendSessionEvent(final int event, final int arg, @Nullable final byte[] data) throws MediaCasException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public byte[] getSessionId() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void close() {
            throw new RuntimeException("Stub!");
        }
    }
}
