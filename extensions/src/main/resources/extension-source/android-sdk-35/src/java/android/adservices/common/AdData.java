package android.adservices.common;

import java.util.Set;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public final class AdData implements Parcelable
{
    @NonNull
    public static final Creator<AdData> CREATOR;
    
    AdData() {
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
    
    @NonNull
    public Uri getRenderUri() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getMetadata() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getAdCounterKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AdFilters getAdFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAdRenderId() {
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
    
    @Override
    public String toString() {
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
        public Builder setRenderUri(@NonNull final Uri renderUri) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMetadata(@NonNull final String metadata) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdCounterKeys(@NonNull final Set<Integer> adCounterKeys) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdFilters(@Nullable final AdFilters adFilters) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdRenderId(@Nullable final String adRenderId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AdData build() {
            throw new RuntimeException("Stub!");
        }
    }
}
