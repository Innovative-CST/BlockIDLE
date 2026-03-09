package android.telecom;

import android.os.Parcel;
import java.util.List;
import android.os.Bundle;
import android.net.Uri;
import android.os.Parcelable;

public final class ConnectionRequest implements Parcelable
{
    @NonNull
    public static final Creator<ConnectionRequest> CREATOR;
    
    public ConnectionRequest(final PhoneAccountHandle accountHandle, final Uri handle, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public ConnectionRequest(final PhoneAccountHandle accountHandle, final Uri handle, final Bundle extras, final int videoState) {
        throw new RuntimeException("Stub!");
    }
    
    public PhoneAccountHandle getAccountHandle() {
        throw new RuntimeException("Stub!");
    }
    
    public Uri getAddress() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<Uri> getParticipants() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVideoState() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAdhocConferenceCall() {
        throw new RuntimeException("Stub!");
    }
    
    public Connection.RttTextStream getRttTextStream() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRequestingRtt() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel destination, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
