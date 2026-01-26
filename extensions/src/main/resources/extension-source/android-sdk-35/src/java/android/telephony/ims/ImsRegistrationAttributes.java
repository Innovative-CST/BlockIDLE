package android.telephony.ims;

import android.os.Parcel;
import java.util.Set;
import android.os.Parcelable;

public final class ImsRegistrationAttributes implements Parcelable
{
    public static final int ATTR_EPDG_OVER_CELL_INTERNET = 1;
    @NonNull
    public static final Creator<ImsRegistrationAttributes> CREATOR;
    
    ImsRegistrationAttributes() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTransportType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getAttributeFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getFeatureTags() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SipDetails getSipDetails() {
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
    
    @Override
    public boolean equals(final Object o) {
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
