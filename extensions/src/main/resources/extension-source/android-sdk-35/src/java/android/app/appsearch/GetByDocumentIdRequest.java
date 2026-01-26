package android.app.appsearch;

import java.util.Collection;
import android.os.Parcel;
import java.util.List;
import java.util.Map;
import java.util.Set;
import android.os.Parcelable;

public final class GetByDocumentIdRequest implements Parcelable
{
    @NonNull
    public static final Creator<GetByDocumentIdRequest> CREATOR;
    public static final String PROJECTION_SCHEMA_TYPE_WILDCARD = "*";
    
    GetByDocumentIdRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getNamespace() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getIds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, List<String>> getProjections() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Map<String, List<PropertyPath>> getProjectionPaths() {
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
        public Builder(@NonNull final String namespace) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIds(@NonNull final String... ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addIds(@NonNull final Collection<String> ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addProjection(@NonNull final String schemaType, @NonNull final Collection<String> propertyPaths) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addProjectionPaths(@NonNull final String schemaType, @NonNull final Collection<PropertyPath> propertyPaths) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public GetByDocumentIdRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
