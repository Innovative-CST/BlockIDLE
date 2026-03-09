package android.app.appsearch;

import android.os.Parcel;
import java.util.Map;
import java.util.Set;
import android.os.Parcelable;

public final class GetSchemaResponse implements Parcelable
{
    @NonNull
    public static final Creator<GetSchemaResponse> CREATOR;
    
    GetSchemaResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<AppSearchSchema> getSchemas() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getSchemaTypesNotDisplayedBySystem() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Set<PackageIdentifier>> getSchemaTypesVisibleToPackages() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Set<Set<Integer>>> getRequiredPermissionsForSchemaTypeVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, PackageIdentifier> getPubliclyVisibleSchemas() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Set<SchemaVisibilityConfig>> getSchemaTypesVisibleToConfigs() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
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
        public Builder setVersion(final int version) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSchema(@NonNull final AppSearchSchema schema) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSchemaTypeNotDisplayedBySystem(@NonNull final String schemaType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSchemaTypeVisibleToPackages(@NonNull final String schemaType, @NonNull final Set<PackageIdentifier> packageIdentifiers) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRequiredPermissionsForSchemaTypeVisibility(@NonNull final String schemaType, @NonNull final Set<Set<Integer>> visibleToPermissionSets) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPubliclyVisibleSchema(@NonNull final String schemaType, @NonNull final PackageIdentifier packageIdentifier) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSchemaTypeVisibleToConfigs(@NonNull final String schemaType, @NonNull final Set<SchemaVisibilityConfig> visibleToConfigs) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GetSchemaResponse build() {
            throw new RuntimeException("Stub!");
        }
    }
}
