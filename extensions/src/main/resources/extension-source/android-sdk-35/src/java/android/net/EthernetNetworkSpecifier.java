package android.net;

import android.os.Parcel;
import android.os.Parcelable;

public final class EthernetNetworkSpecifier extends NetworkSpecifier implements Parcelable
{
    @NonNull
    public static final Creator<EthernetNetworkSpecifier> CREATOR;
    
    public EthernetNetworkSpecifier(@NonNull final String interfaceName) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getInterfaceName() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canBeSatisfiedBy(@Nullable final NetworkSpecifier other) {
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
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
