package android.telephony;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class CellIdentityWcdma extends CellIdentity
{
    @NonNull
    public static final Parcelable.Creator<CellIdentityWcdma> CREATOR;
    
    CellIdentityWcdma() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMcc() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMnc() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLac() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPsc() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMccString() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMncString() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMobileNetworkOperator() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUarfcn() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getAdditionalPlmns() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ClosedSubscriberGroupInfo getClosedSubscriberGroupInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
