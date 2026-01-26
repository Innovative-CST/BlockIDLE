package android.content.pm;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class CapabilityParams implements Parcelable
{
    @NonNull
    public static final Creator<CapabilityParams> CREATOR;
    
    CapabilityParams() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getValue() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getAliases() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String key, @NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addAlias(@NonNull final String alias) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CapabilityParams build() {
            throw new RuntimeException("Stub!");
        }
    }
}
