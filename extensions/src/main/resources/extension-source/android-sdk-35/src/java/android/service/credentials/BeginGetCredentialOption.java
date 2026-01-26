package android.service.credentials;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class BeginGetCredentialOption implements Parcelable
{
    @NonNull
    public static final Creator<BeginGetCredentialOption> CREATOR;
    
    public BeginGetCredentialOption(@NonNull final String id, @NonNull final String type, @NonNull final Bundle candidateQueryData) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getCandidateQueryData() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
