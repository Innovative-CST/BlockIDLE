package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class UiccPortInfo implements Parcelable
{
    @NonNull
    public static final Creator<UiccPortInfo> CREATOR;
    public static final String ICCID_REDACTED = "FFFFFFFFFFFFFFFFFFFF";
    
    UiccPortInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@Nullable final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getIccId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPortIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isActive() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLogicalSlotIndex() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
