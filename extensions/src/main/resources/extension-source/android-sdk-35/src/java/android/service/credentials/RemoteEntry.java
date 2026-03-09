package android.service.credentials;

import android.os.Parcel;
import android.app.slice.Slice;
import android.os.Parcelable;

public final class RemoteEntry implements Parcelable
{
    @NonNull
    public static final Creator<RemoteEntry> CREATOR;
    
    public RemoteEntry(@NonNull final Slice slice) {
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
    public Slice getSlice() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
