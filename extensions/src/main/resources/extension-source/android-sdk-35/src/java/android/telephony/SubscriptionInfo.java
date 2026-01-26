package android.telephony;

import android.os.Parcel;
import java.util.Set;
import android.os.ParcelUuid;
import android.graphics.Bitmap;
import android.content.Context;
import android.os.Parcelable;

public class SubscriptionInfo implements Parcelable
{
    @NonNull
    public static final Creator<SubscriptionInfo> CREATOR;
    
    SubscriptionInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionId() {
        throw new RuntimeException("Stub!");
    }
    
    public String getIccId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSimSlotIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCarrierId() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getDisplayName() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getCarrierName() {
        throw new RuntimeException("Stub!");
    }
    
    public Bitmap createIconBitmap(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIconTint() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getNumber() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataRoaming() {
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
    
    @Nullable
    public String getMccString() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getMncString() {
        throw new RuntimeException("Stub!");
    }
    
    public String getCountryIso() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEmbedded() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOpportunistic() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ParcelUuid getGroupUuid() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSubscriptionType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCardId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPortIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getUsageSetting() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOnlyNonTerrestrialNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<Integer> getServiceCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
