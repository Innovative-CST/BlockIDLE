package android.media;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class RouteDiscoveryPreference implements Parcelable
{
    @NonNull
    public static final Creator<RouteDiscoveryPreference> CREATOR;
    
    RouteDiscoveryPreference() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getPreferredFeatures() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean shouldPerformActiveScan() {
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
    
    @Override
    public String toString() {
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
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final List<String> preferredFeatures, final boolean activeScan) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final RouteDiscoveryPreference preference) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPreferredFeatures(@NonNull final List<String> preferredFeatures) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setShouldPerformActiveScan(final boolean activeScan) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RouteDiscoveryPreference build() {
            throw new RuntimeException("Stub!");
        }
    }
}
