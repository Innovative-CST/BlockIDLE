package android.telephony;

import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable;

public final class NetworkScanRequest implements Parcelable
{
    @NonNull
    public static final Creator<NetworkScanRequest> CREATOR;
    public static final int SCAN_TYPE_ONE_SHOT = 0;
    public static final int SCAN_TYPE_PERIODIC = 1;
    
    public NetworkScanRequest(final int scanType, final RadioAccessSpecifier[] specifiers, final int searchPeriodicity, final int maxSearchTime, final boolean incrementalResults, final int incrementalResultsPeriodicity, final ArrayList<String> mccMncs) {
        throw new RuntimeException("Stub!");
    }
    
    public int getScanType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSearchPeriodicity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxSearchTime() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getIncrementalResults() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIncrementalResultsPeriodicity() {
        throw new RuntimeException("Stub!");
    }
    
    public RadioAccessSpecifier[] getSpecifiers() {
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<String> getPlmns() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
    
    static {
        CREATOR = null;
    }
}
