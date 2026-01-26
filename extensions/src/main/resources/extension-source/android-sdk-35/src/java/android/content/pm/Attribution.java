package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public final class Attribution implements Parcelable
{
    @NonNull
    public static final Creator<Attribution> CREATOR;
    
    Attribution() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getTag() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLabel() {
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
    
    static {
        CREATOR = null;
    }
}
