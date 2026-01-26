package android.adservices.adselection;

import android.os.Parcel;
import android.adservices.common.AdData;
import android.os.Parcelable;

public final class AdWithBid implements Parcelable
{
    @NonNull
    public static final Creator<AdWithBid> CREATOR;
    
    public AdWithBid(@NonNull final AdData adData, final double bid) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AdData getAdData() {
        throw new RuntimeException("Stub!");
    }
    
    public double getBid() {
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
    
    static {
        CREATOR = null;
    }
}
