package android.telecom;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;

public final class CallEndpoint implements Parcelable
{
    @NonNull
    public static final Creator<CallEndpoint> CREATOR;
    public static final int TYPE_BLUETOOTH = 2;
    public static final int TYPE_EARPIECE = 1;
    public static final int TYPE_SPEAKER = 4;
    public static final int TYPE_STREAMING = 5;
    public static final int TYPE_UNKNOWN = -1;
    public static final int TYPE_WIRED_HEADSET = 3;
    
    public CallEndpoint(@NonNull final CharSequence name, final int type, @NonNull final ParcelUuid id) {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getEndpointName() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEndpointType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ParcelUuid getIdentifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel destination, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
