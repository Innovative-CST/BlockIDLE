package android.view.autofill;

import android.os.Parcel;
import android.view.View;
import android.os.Parcelable;

public final class AutofillId implements Parcelable
{
    @NonNull
    public static final Creator<AutofillId> CREATOR;
    
    AutofillId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AutofillId create(@NonNull final View host, final int virtualId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
