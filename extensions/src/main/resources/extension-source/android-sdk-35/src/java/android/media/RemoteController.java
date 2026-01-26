package android.media;

import android.view.KeyEvent;
import android.os.Looper;
import android.content.Context;

@Deprecated
public final class RemoteController
{
    @Deprecated
    public static final int POSITION_SYNCHRONIZATION_CHECK = 1;
    @Deprecated
    public static final int POSITION_SYNCHRONIZATION_NONE = 0;
    
    @Deprecated
    public RemoteController(final Context context, final OnClientUpdateListener updateListener) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RemoteController(final Context context, final OnClientUpdateListener updateListener, final Looper looper) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public long getEstimatedMediaPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean sendMediaKeyEvent(final KeyEvent keyEvent) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean seekTo(final long timeMs) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setArtworkConfiguration(final int width, final int height) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean clearArtworkConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setSynchronizationMode(final int sync) throws IllegalArgumentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MetadataEditor editMetadata() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public class MetadataEditor extends MediaMetadataEditor
    {
        MetadataEditor() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public synchronized void apply() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnClientUpdateListener
    {
        @Deprecated
        void onClientChange(final boolean p0);
        
        @Deprecated
        void onClientPlaybackStateUpdate(final int p0);
        
        @Deprecated
        void onClientPlaybackStateUpdate(final int p0, final long p1, final long p2, final float p3);
        
        @Deprecated
        void onClientTransportControlUpdate(final int p0);
        
        @Deprecated
        void onClientMetadataUpdate(final MetadataEditor p0);
    }
}
