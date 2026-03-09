package android.media;

import java.util.concurrent.Executor;

public class Spatializer
{
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_MULTICHANNEL = 1;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_NONE = 0;
    public static final int SPATIALIZER_IMMERSIVE_LEVEL_OTHER = -1;
    
    Spatializer() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isHeadTrackerAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnHeadTrackerAvailableListener(@NonNull final Executor executor, @NonNull final OnHeadTrackerAvailableListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnHeadTrackerAvailableListener(@NonNull final OnHeadTrackerAvailableListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public int getImmersiveAudioLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canBeSpatialized(@NonNull final AudioAttributes attributes, @NonNull final AudioFormat format) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnSpatializerStateChangedListener(@NonNull final Executor executor, @NonNull final OnSpatializerStateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnSpatializerStateChangedListener(@NonNull final OnSpatializerStateChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnSpatializerStateChangedListener
    {
        void onSpatializerEnabledChanged(@NonNull final Spatializer p0, final boolean p1);
        
        void onSpatializerAvailableChanged(@NonNull final Spatializer p0, final boolean p1);
    }
    
    public interface OnHeadTrackerAvailableListener
    {
        void onHeadTrackerAvailableChanged(@NonNull final Spatializer p0, final boolean p1);
    }
}
