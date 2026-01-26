package android.telephony;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class CellIdentityLte extends CellIdentity
{
    @NonNull
    public static final Parcelable.Creator<CellIdentityLte> CREATOR;
    
    CellIdentityLte() {
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
    
    public int getCi() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPci() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTac() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEarfcn() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getBands() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBandwidth() {
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
    
    @NonNull
    public Set<String> getAdditionalPlmns() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ClosedSubscriberGroupInfo getClosedSubscriberGroupInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
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
