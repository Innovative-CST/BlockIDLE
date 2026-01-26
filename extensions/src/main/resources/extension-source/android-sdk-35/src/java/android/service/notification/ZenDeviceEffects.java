package android.service.notification;

import android.os.Parcel;
import android.os.Parcelable;

public final class ZenDeviceEffects implements Parcelable
{
    @NonNull
    public static final Creator<ZenDeviceEffects> CREATOR;
    
    ZenDeviceEffects() {
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
    
    public boolean shouldDisplayGrayscale() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldSuppressAmbientDisplay() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldDimWallpaper() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldUseNightMode() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final ZenDeviceEffects zenDeviceEffects) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShouldDisplayGrayscale(final boolean grayscale) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShouldSuppressAmbientDisplay(final boolean suppressAmbientDisplay) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShouldDimWallpaper(final boolean dimWallpaper) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShouldUseNightMode(final boolean nightMode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ZenDeviceEffects build() {
            throw new RuntimeException("Stub!");
        }
    }
}
