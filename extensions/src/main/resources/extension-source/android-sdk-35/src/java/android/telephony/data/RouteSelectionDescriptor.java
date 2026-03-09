package android.telephony.data;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class RouteSelectionDescriptor implements Parcelable
{
    @NonNull
    public static final Creator<RouteSelectionDescriptor> CREATOR;
    public static final int ROUTE_SSC_MODE_1 = 1;
    public static final int ROUTE_SSC_MODE_2 = 2;
    public static final int ROUTE_SSC_MODE_3 = 3;
    public static final int SESSION_TYPE_IPV4 = 0;
    public static final int SESSION_TYPE_IPV4V6 = 2;
    public static final int SESSION_TYPE_IPV6 = 1;
    
    RouteSelectionDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPrecedence() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSessionType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSscMode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<NetworkSliceInfo> getSliceInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getDataNetworkName() {
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
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
