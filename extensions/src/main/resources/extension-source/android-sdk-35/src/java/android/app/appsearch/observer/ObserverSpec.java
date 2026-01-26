package android.app.appsearch.observer;

import java.util.Collection;
import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class ObserverSpec implements Parcelable
{
    @NonNull
    public static final Creator<ObserverSpec> CREATOR;
    
    ObserverSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getFilterSchemas() {
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
        public Builder addFilterSchemas(@NonNull final String... schemas) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addFilterSchemas(@NonNull final Collection<String> schemas) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ObserverSpec build() {
            throw new RuntimeException("Stub!");
        }
    }
}
