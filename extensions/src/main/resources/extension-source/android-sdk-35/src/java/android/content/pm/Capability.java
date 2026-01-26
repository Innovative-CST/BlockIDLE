package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class Capability implements Parcelable
{
    @NonNull
    public static final Creator<Capability> CREATOR;
    
    Capability() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getName() {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String name) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Capability build() {
            throw new RuntimeException("Stub!");
        }
    }
}
