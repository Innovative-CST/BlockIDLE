package android.media;

import java.util.Collection;
import android.os.Parcel;
import android.os.Bundle;
import java.util.Set;
import android.net.Uri;
import java.util.List;
import android.os.Parcelable;

public final class MediaRoute2Info implements Parcelable
{
    public static final int CONNECTION_STATE_CONNECTED = 2;
    public static final int CONNECTION_STATE_CONNECTING = 1;
    public static final int CONNECTION_STATE_DISCONNECTED = 0;
    @NonNull
    public static final Creator<MediaRoute2Info> CREATOR;
    public static final String FEATURE_LIVE_AUDIO = "android.media.route.feature.LIVE_AUDIO";
    public static final String FEATURE_LIVE_VIDEO = "android.media.route.feature.LIVE_VIDEO";
    public static final String FEATURE_REMOTE_AUDIO_PLAYBACK = "android.media.route.feature.REMOTE_AUDIO_PLAYBACK";
    public static final String FEATURE_REMOTE_PLAYBACK = "android.media.route.feature.REMOTE_PLAYBACK";
    public static final String FEATURE_REMOTE_VIDEO_PLAYBACK = "android.media.route.feature.REMOTE_VIDEO_PLAYBACK";
    public static final int PLAYBACK_VOLUME_FIXED = 0;
    public static final int PLAYBACK_VOLUME_VARIABLE = 1;
    public static final int SUITABILITY_STATUS_NOT_SUITABLE_FOR_TRANSFER = 2;
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_DEFAULT_TRANSFER = 0;
    public static final int SUITABILITY_STATUS_SUITABLE_FOR_MANUAL_TRANSFER = 1;
    public static final int TYPE_BLE_HEADSET = 26;
    public static final int TYPE_BLUETOOTH_A2DP = 8;
    public static final int TYPE_BUILTIN_SPEAKER = 2;
    public static final int TYPE_DOCK = 13;
    public static final int TYPE_GROUP = 2000;
    public static final int TYPE_HDMI = 9;
    public static final int TYPE_HDMI_ARC = 10;
    public static final int TYPE_HDMI_EARC = 29;
    public static final int TYPE_HEARING_AID = 23;
    public static final int TYPE_REMOTE_AUDIO_VIDEO_RECEIVER = 1003;
    public static final int TYPE_REMOTE_CAR = 1008;
    public static final int TYPE_REMOTE_COMPUTER = 1006;
    public static final int TYPE_REMOTE_GAME_CONSOLE = 1007;
    public static final int TYPE_REMOTE_SMARTPHONE = 1010;
    public static final int TYPE_REMOTE_SMARTWATCH = 1009;
    public static final int TYPE_REMOTE_SPEAKER = 1002;
    public static final int TYPE_REMOTE_TABLET = 1004;
    public static final int TYPE_REMOTE_TABLET_DOCKED = 1005;
    public static final int TYPE_REMOTE_TV = 1001;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_USB_ACCESSORY = 12;
    public static final int TYPE_USB_DEVICE = 11;
    public static final int TYPE_USB_HEADSET = 22;
    public static final int TYPE_WIRED_HEADPHONES = 4;
    public static final int TYPE_WIRED_HEADSET = 3;
    
    MediaRoute2Info() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getFeatures() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSystemRoute() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Uri getIconUri() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConnectionState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getClientPackageName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolumeHandling() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolumeMax() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVolume() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getDeduplicationIds() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSuitabilityStatus() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String id, @NonNull final CharSequence name) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final MediaRoute2Info routeInfo) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFeature(@NonNull final String feature) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFeatures(@NonNull final Collection<String> features) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearFeatures() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setType(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setIconUri(@Nullable final Uri iconUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@Nullable final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConnectionState(final int connectionState) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setClientPackageName(@Nullable final String packageName) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVolumeHandling(final int volumeHandling) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVolumeMax(final int volumeMax) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVolume(final int volume) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDeduplicationIds(@NonNull final Set<String> id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVisibilityPublic() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVisibilityRestricted(@NonNull final Set<String> allowedPackages) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSuitabilityStatus(final int suitabilityStatus) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MediaRoute2Info build() {
            throw new RuntimeException("Stub!");
        }
    }
}
