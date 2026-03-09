package android.adservices.ondevicepersonalization;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class RenderingConfig implements Parcelable
{
    @NonNull
    public static final Creator<RenderingConfig> CREATOR;
    
    RenderingConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeys(@NonNull final List<String> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addKey(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RenderingConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
