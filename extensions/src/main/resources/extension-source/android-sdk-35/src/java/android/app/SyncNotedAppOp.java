package android.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class SyncNotedAppOp implements Parcelable
{
    @NonNull
    public static final Creator<SyncNotedAppOp> CREATOR;
    
    public SyncNotedAppOp(final int opCode, @Nullable final String attributionTag) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getOp() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getAttributionTag() {
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
