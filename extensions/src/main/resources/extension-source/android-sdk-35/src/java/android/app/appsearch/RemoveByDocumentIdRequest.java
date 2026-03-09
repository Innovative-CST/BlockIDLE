package android.app.appsearch;

import java.util.Collection;
import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class RemoveByDocumentIdRequest implements Parcelable
{
    @NonNull
    public static final Creator<RemoveByDocumentIdRequest> CREATOR;
    
    RemoveByDocumentIdRequest() {
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
        public RemoveByDocumentIdRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
