package android.net.wifi.hotspot2.pps;

import android.os.Parcel;
import java.util.Collection;
import android.os.Parcelable;

public final class HomeSp implements Parcelable
{
    @NonNull
    public static final Creator<HomeSp> CREATOR;
    
    public HomeSp() {
        throw new RuntimeException("Stub!");
    }
    
    public HomeSp(final HomeSp source) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFqdn(final String fqdn) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFqdn() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFriendlyName(final String friendlyName) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFriendlyName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMatchAllOis(@Nullable final long[] matchAllOis) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public long[] getMatchAllOis() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMatchAnyOis(@Nullable final long[] matchAnyOis) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public long[] getMatchAnyOis() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOtherHomePartnersList(@NonNull final Collection<String> otherHomePartners) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<String> getOtherHomePartnersList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRoamingConsortiumOis(final long[] roamingConsortiumOis) {
        throw new RuntimeException("Stub!");
    }
    
    public long[] getRoamingConsortiumOis() {
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
    
    static {
        CREATOR = null;
    }
}
