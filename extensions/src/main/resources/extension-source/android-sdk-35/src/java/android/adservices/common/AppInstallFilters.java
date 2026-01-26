package android.adservices.common;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class AppInstallFilters implements Parcelable
{
    @NonNull
    public static final Creator<AppInstallFilters> CREATOR;
    
    AppInstallFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getPackageNames() {
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
        public Builder setPackageNames(@NonNull final Set<String> packageNames) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AppInstallFilters build() {
            throw new RuntimeException("Stub!");
        }
    }
}
