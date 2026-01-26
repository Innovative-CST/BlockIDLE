package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class CellIdentity implements Parcelable
{
    @NonNull
    public static final Creator<CellIdentity> CREATOR;
    
    CellIdentity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getOperatorAlphaLong() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getOperatorAlphaShort() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int type) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
