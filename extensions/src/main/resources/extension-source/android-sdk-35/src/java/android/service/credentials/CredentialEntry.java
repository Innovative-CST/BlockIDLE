package android.service.credentials;

import android.os.Parcel;
import android.app.slice.Slice;
import android.os.Parcelable;

public final class CredentialEntry implements Parcelable
{
    @NonNull
    public static final Creator<CredentialEntry> CREATOR;
    
    public CredentialEntry(@NonNull final String beginGetCredentialOptionId, @NonNull final String type, @NonNull final Slice slice) {
        throw new RuntimeException("Stub!");
    }
    
    public CredentialEntry(@NonNull final BeginGetCredentialOption beginGetCredentialOption, @NonNull final Slice slice) {
        throw new RuntimeException("Stub!");
    }
    
    public CredentialEntry(@NonNull final String type, @NonNull final Slice slice) {
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
    
    @NonNull
    public String getBeginGetCredentialOptionId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Slice getSlice() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
