package android.adservices.common;

import android.os.Parcel;
import android.os.Parcelable;

public final class AdFilters implements Parcelable
{
    @NonNull
    public static final Creator<AdFilters> CREATOR;
    
    AdFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public FrequencyCapFilters getFrequencyCapFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public AppInstallFilters getAppInstallFilters() {
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
        public Builder setFrequencyCapFilters(@Nullable final FrequencyCapFilters frequencyCapFilters) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAppInstallFilters(@Nullable final AppInstallFilters appInstallFilters) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AdFilters build() {
            throw new RuntimeException("Stub!");
        }
    }
}
