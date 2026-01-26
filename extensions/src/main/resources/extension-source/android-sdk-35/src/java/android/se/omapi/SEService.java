package android.se.omapi;

import java.util.concurrent.Executor;
import android.content.Context;

public final class SEService
{
    public static final String ACTION_SECURE_ELEMENT_STATE_CHANGED = "android.se.omapi.action.SECURE_ELEMENT_STATE_CHANGED";
    public static final String EXTRA_READER_NAME = "android.se.omapi.extra.READER_NAME";
    public static final String EXTRA_READER_STATE = "android.se.omapi.extra.READER_STATE";
    
    public SEService(@NonNull final Context context, @NonNull final Executor executor, @NonNull final OnConnectedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isConnected() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Reader[] getReaders() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Reader getUiccReader(final int slotNumber) {
        throw new RuntimeException("Stub!");
    }
    
    public void shutdown() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnConnectedListener
    {
        void onConnected();
    }
}
