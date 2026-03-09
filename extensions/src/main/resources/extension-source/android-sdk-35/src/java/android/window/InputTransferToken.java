package android.window;

import android.os.Parcel;
import android.os.Parcelable;

public final class InputTransferToken implements Parcelable
{
    @NonNull
    public static final Creator<InputTransferToken> CREATOR;
    
    InputTransferToken() {
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
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
