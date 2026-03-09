package android.app.appsearch;

import android.app.appsearch.exceptions.AppSearchException;
import java.util.Collection;
import java.util.List;

public final class PutDocumentsRequest
{
    PutDocumentsRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<GenericDocument> getGenericDocuments() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<GenericDocument> getTakenActionGenericDocuments() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addGenericDocuments(@NonNull final GenericDocument... documents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addGenericDocuments(@NonNull final Collection<? extends GenericDocument> documents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addTakenActionGenericDocuments(@NonNull final GenericDocument... takenActionGenericDocuments) throws AppSearchException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addTakenActionGenericDocuments(@NonNull final Collection<? extends GenericDocument> takenActionGenericDocuments) throws AppSearchException {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PutDocumentsRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
