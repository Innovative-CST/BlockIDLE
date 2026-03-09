package android.app;

import android.os.Parcel;
import android.content.LocusId;
import android.os.Bundle;
import android.os.Parcelable;

public final class DirectAction implements Parcelable
{
    @NonNull
    public static final Creator<DirectAction> CREATOR;
    
    DirectAction() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public LocusId getLocusId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setLocusId(@Nullable final LocusId locusId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public DirectAction build() {
            throw new RuntimeException("Stub!");
        }
    }
}
