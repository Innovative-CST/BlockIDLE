package android.net.wifi.hotspot2;

import android.os.Parcel;
import android.net.wifi.hotspot2.pps.Credential;
import android.net.wifi.hotspot2.pps.HomeSp;
import android.os.Parcelable;

public final class PasspointConfiguration implements Parcelable
{
    @NonNull
    public static final Creator<PasspointConfiguration> CREATOR;
    
    public PasspointConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    public PasspointConfiguration(final PasspointConfiguration source) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHomeSp(final HomeSp homeSp) {
        throw new RuntimeException("Stub!");
    }
    
    public HomeSp getHomeSp() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCredential(final Credential credential) {
        throw new RuntimeException("Stub!");
    }
    
    public Credential getCredential() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSubscriptionExpirationTimeInMillis(final long subscriptionExpirationTimeInMillis) {
        throw new RuntimeException("Stub!");
    }
    
    public long getSubscriptionExpirationTimeMillis() {
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
    public boolean equals(final Object thatObject) {
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
    
    public boolean isOsuProvisioned() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getUniqueId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDecoratedIdentityPrefix(@Nullable final String decoratedIdentityPrefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getDecoratedIdentityPrefix() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
