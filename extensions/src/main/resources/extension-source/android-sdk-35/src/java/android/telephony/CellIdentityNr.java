package android.telephony;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class CellIdentityNr extends CellIdentity
{
    @NonNull
    public static final Parcelable.Creator<CellIdentityNr> CREATOR;
    
    CellIdentityNr() {
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
    
    public long getNci() {
        throw new RuntimeException("Stub!");
    }
    
    public int getNrarfcn() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getBands() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPci() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTac() {
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
    
    @NonNull
    public Set<String> getAdditionalPlmns() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
