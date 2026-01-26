package android.app.admin;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class UnsafeStateException extends IllegalStateException implements Parcelable
{
    @NonNull
    public static final Creator<UnsafeStateException> CREATOR;
    
    UnsafeStateException() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Integer> getReasons() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String getMessage() {
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
