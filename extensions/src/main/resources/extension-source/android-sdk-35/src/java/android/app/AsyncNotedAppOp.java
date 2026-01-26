package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class AsyncNotedAppOp implements Parcelable
{
    @NonNull
    public static final Creator<AsyncNotedAppOp> CREATOR;
    
    AsyncNotedAppOp() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getOp() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNotingUid() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAttributionTag() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getMessage() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTime() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
