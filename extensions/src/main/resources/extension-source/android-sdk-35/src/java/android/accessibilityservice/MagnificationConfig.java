package android.accessibilityservice;

import android.os.Parcel;
import android.os.Parcelable;

public final class MagnificationConfig implements Parcelable
{
    @NonNull
    public static final Creator<MagnificationConfig> CREATOR;
    public static final int MAGNIFICATION_MODE_DEFAULT = 0;
    public static final int MAGNIFICATION_MODE_FULLSCREEN = 1;
    public static final int MAGNIFICATION_MODE_WINDOW = 2;
    
    MagnificationConfig() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActivated() {
        throw new RuntimeException("Stub!");
    }
    
    public float getScale() {
        throw new RuntimeException("Stub!");
    }
    
    public float getCenterX() {
        throw new RuntimeException("Stub!");
    }
    
    public float getCenterY() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flags) {
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
        
        @NonNull
        public Builder setMode(final int mode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setActivated(final boolean activated) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setScale(final float scale) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCenterX(final float centerX) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCenterY(final float centerY) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public MagnificationConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
