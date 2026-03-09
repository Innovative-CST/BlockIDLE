package android.health.connect.changelog;

import android.os.Parcel;
import android.os.Parcelable;

public final class ChangeLogTokenResponse implements Parcelable
{
    @NonNull
    public static final Creator<ChangeLogTokenResponse> CREATOR;
    
    ChangeLogTokenResponse() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getToken() {
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
    
    static {
        CREATOR = null;
    }
}
