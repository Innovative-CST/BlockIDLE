package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public final class VpnProfileState implements Parcelable
{
    @NonNull
    public static final Creator<VpnProfileState> CREATOR;
    public static final int STATE_CONNECTED = 2;
    public static final int STATE_CONNECTING = 1;
    public static final int STATE_DISCONNECTED = 0;
    public static final int STATE_FAILED = 3;
    
    public VpnProfileState(final int state, @Nullable final String sessionKey, final boolean alwaysOn, final boolean lockdown) {
        throw new RuntimeException("Stub!");
    }
    
    public int getState() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlwaysOn() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLockdownEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
