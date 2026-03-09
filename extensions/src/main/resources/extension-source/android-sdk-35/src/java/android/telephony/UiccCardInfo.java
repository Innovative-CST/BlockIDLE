package android.telephony;

import java.util.Collection;
import android.os.Parcel;
import android.os.Parcelable;

public final class UiccCardInfo implements Parcelable
{
    @NonNull
    public static final Creator<UiccCardInfo> CREATOR;
    
    UiccCardInfo() {
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
    
    public boolean isEuicc() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCardId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getEid() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getIccId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSlotIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPhysicalSlotIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isRemovable() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMultipleEnabledProfilesSupported() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Collection<UiccPortInfo> getPorts() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
