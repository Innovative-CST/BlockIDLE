package android.service.credentials;

import android.os.Parcel;
import android.app.slice.Slice;
import android.os.Parcelable;

public final class CreateEntry implements Parcelable
{
    @NonNull
    public static final Creator<CreateEntry> CREATOR;
    
    public CreateEntry(@NonNull final Slice slice) {
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
