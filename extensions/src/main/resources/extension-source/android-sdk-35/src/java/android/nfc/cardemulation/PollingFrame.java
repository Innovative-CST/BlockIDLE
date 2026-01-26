package android.nfc.cardemulation;

import android.os.Parcel;
import android.os.Parcelable;

public final class PollingFrame implements Parcelable
{
    @NonNull
    public static final Creator<PollingFrame> CREATOR;
    public static final int POLLING_LOOP_TYPE_A = 65;
    public static final int POLLING_LOOP_TYPE_B = 66;
    public static final int POLLING_LOOP_TYPE_F = 70;
    public static final int POLLING_LOOP_TYPE_OFF = 88;
    public static final int POLLING_LOOP_TYPE_ON = 79;
    public static final int POLLING_LOOP_TYPE_UNKNOWN = 85;
    
    PollingFrame() {
        throw new RuntimeException("Stub!");
    }
    
    public int getType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getData() {
        throw new RuntimeException("Stub!");
    }
    
    public int getVendorSpecificGain() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestamp() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getTriggeredAutoTransact() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
