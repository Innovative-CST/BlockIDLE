package android.app.appsearch;

import java.util.Collection;
import android.os.Parcel;
import java.util.Set;
import java.util.List;
import android.os.Parcelable;

public final class SetSchemaResponse implements Parcelable
{
    @NonNull
    public static final Creator<SetSchemaResponse> CREATOR;
    
    SetSchemaResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MigrationFailure> getMigrationFailures() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getDeletedTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getMigratedTypes() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getIncompatibleTypes() {
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
        public Builder addMigrationFailures(@NonNull final Collection<MigrationFailure> migrationFailures) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addMigrationFailure(@NonNull final MigrationFailure migrationFailure) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDeletedTypes(@NonNull final Collection<String> deletedTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addDeletedType(@NonNull final String deletedType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIncompatibleTypes(@NonNull final Collection<String> incompatibleTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIncompatibleType(@NonNull final String incompatibleType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addMigratedTypes(@NonNull final Collection<String> migratedTypes) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addMigratedType(@NonNull final String migratedType) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SetSchemaResponse build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class MigrationFailure implements Parcelable
    {
        @NonNull
        public static final Creator<MigrationFailure> CREATOR;
        
        public MigrationFailure(@NonNull final String namespace, @NonNull final String documentId, @NonNull final String schemaType, @NonNull final AppSearchResult<?> failedResult) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getNamespace() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getDocumentId() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public String getSchemaType() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public AppSearchResult<Void> getAppSearchResult() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        @Override
        public String toString() {
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
    }
}
