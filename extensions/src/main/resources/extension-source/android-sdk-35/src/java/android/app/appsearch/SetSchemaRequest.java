package android.app.appsearch;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class SetSchemaRequest
{
    public static final int READ_ASSISTANT_APP_SEARCH_DATA = 6;
    public static final int READ_CALENDAR = 2;
    public static final int READ_CONTACTS = 3;
    public static final int READ_EXTERNAL_STORAGE = 4;
    public static final int READ_HOME_APP_SEARCH_DATA = 5;
    public static final int READ_SMS = 1;
    
    SetSchemaRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<AppSearchSchema> getSchemas() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getSchemasNotDisplayedBySystem() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Set<PackageIdentifier>> getSchemasVisibleToPackages() {
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
    public Map<String, Set<SchemaVisibilityConfig>> getSchemasVisibleToConfigs() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, Migrator> getMigrators() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isForceOverride() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVersion() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSchemas(@NonNull final AppSearchSchema... schemas) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSchemas(@NonNull final Collection<AppSearchSchema> schemas) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSchemaTypeDisplayedBySystem(@NonNull final String schemaType, final boolean displayed) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addRequiredPermissionsForSchemaTypeVisibility(@NonNull final String schemaType, @NonNull final Set<Integer> permissions) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearRequiredPermissionsForSchemaTypeVisibility(@NonNull final String schemaType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setSchemaTypeVisibilityForPackage(@NonNull final String schemaType, final boolean visible, @NonNull final PackageIdentifier packageIdentifier) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPubliclyVisibleSchema(@NonNull final String schema, @Nullable final PackageIdentifier packageIdentifier) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSchemaTypeVisibleToConfig(@NonNull final String schemaType, @NonNull final SchemaVisibilityConfig schemaVisibilityConfig) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder clearSchemaTypeVisibleToConfigs(@NonNull final String schemaType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMigrator(@NonNull final String schemaType, @NonNull final Migrator migrator) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMigrators(@NonNull final Map<String, Migrator> migrators) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setForceOverride(final boolean forceOverride) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setVersion(final int version) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SetSchemaRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
