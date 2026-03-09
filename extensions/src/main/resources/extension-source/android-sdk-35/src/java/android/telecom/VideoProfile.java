package android.telecom;

import android.os.Parcel;
import android.os.Parcelable;

public class VideoProfile implements Parcelable
{
    @NonNull
    public static final Creator<VideoProfile> CREATOR;
    public static final int QUALITY_DEFAULT = 4;
    public static final int QUALITY_HIGH = 1;
    public static final int QUALITY_LOW = 3;
    public static final int QUALITY_MEDIUM = 2;
    public static final int STATE_AUDIO_ONLY = 0;
    public static final int STATE_BIDIRECTIONAL = 3;
    public static final int STATE_PAUSED = 4;
    public static final int STATE_RX_ENABLED = 2;
    public static final int STATE_TX_ENABLED = 1;
    
    public VideoProfile(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public VideoProfile(final int videoState, final int quality) {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getQuality() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public static String videoStateToString(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isAudioOnly(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isVideo(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isTransmissionEnabled(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isReceptionEnabled(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isBidirectional(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isPaused(final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class CameraCapabilities implements Parcelable
    {
        @NonNull
        public static final Creator<CameraCapabilities> CREATOR;
        
        public CameraCapabilities(final int width, final int height) {
            throw new RuntimeException("Stub!");
        }
        
        public CameraCapabilities(final int width, final int height, final boolean zoomSupported, final float maxZoom) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public int getWidth() {
            throw new RuntimeException("Stub!");
        }
        
        public int getHeight() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean isZoomSupported() {
            throw new RuntimeException("Stub!");
        }
        
        public float getMaxZoom() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
