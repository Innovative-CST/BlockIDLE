package android.hardware.display;

import android.os.Parcel;
import java.util.Set;
import android.view.Surface;
import android.os.Parcelable;

public final class VirtualDisplayConfig implements Parcelable
{
    @NonNull
    public static final Creator<VirtualDisplayConfig> CREATOR;
    
    VirtualDisplayConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDensityDpi() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Surface getSurface() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getDisplayCategories() {
        throw new RuntimeException("Stub!");
    }
    
    public float getRequestedRefreshRate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String name, final int width, final int height, final int densityDpi) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFlags(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSurface(@Nullable final Surface surface) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDisplayCategories(@NonNull final Set<String> displayCategories) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDisplayCategory(@NonNull final String displayCategory) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRequestedRefreshRate(final float requestedRefreshRate) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public VirtualDisplayConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
