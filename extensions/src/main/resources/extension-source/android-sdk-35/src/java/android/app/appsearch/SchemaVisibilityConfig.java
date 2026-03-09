package android.app.appsearch;

import android.os.Parcel;
import java.util.Set;
import java.util.List;
import android.os.Parcelable;

public final class SchemaVisibilityConfig implements Parcelable
{
    @NonNull
    public static final Creator<SchemaVisibilityConfig> CREATOR;
    
    SchemaVisibilityConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<PackageIdentifier> getAllowedPackages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Set<Integer>> getRequiredPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PackageIdentifier getPubliclyVisibleTargetPackage() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
    public final int describeContents() {
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
        public Builder addAllowedPackage(@NonNull final PackageIdentifier packageIdentifier) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearAllowedPackages() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRequiredPermissions(@NonNull final Set<Integer> visibleToPermissions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearRequiredPermissions() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPubliclyVisibleTargetPackage(@Nullable final PackageIdentifier packageIdentifier) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SchemaVisibilityConfig build() {
            throw new RuntimeException("Stub!");
        }
    }
}
