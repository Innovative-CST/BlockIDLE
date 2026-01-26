package android.service.carrier;

import android.os.Parcel;
import android.os.Parcelable;

public class CarrierIdentifier implements Parcelable
{
    @NonNull
    public static final Creator<CarrierIdentifier> CREATOR;
    
    public CarrierIdentifier(final String mcc, final String mnc, @Nullable final String spn, @Nullable final String imsi, @Nullable final String gid1, @Nullable final String gid2) {
        throw new RuntimeException("Stub!");
    }
    
    public CarrierIdentifier(@NonNull final String mcc, @NonNull final String mnc, @Nullable final String spn, @Nullable final String imsi, @Nullable final String gid1, @Nullable final String gid2, final int carrierid, final int specificCarrierId) {
        throw new RuntimeException("Stub!");
    }
    
    public CarrierIdentifier(final byte[] mccMnc, @Nullable final String gid1, @Nullable final String gid2) {
        throw new RuntimeException("Stub!");
    }
    
    public String getMcc() {
        throw new RuntimeException("Stub!");
    }
    
    public String getMnc() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getSpn() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getImsi() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getGid1() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getGid2() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCarrierId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSpecificCarrierId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
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
