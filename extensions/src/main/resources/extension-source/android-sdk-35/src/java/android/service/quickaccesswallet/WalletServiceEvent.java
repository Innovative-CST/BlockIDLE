package android.service.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;

public final class WalletServiceEvent implements Parcelable
{
    @NonNull
    public static final Creator<WalletServiceEvent> CREATOR;
    public static final int TYPE_NFC_PAYMENT_STARTED = 1;
    
    public WalletServiceEvent(final int eventType) {
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
    
    public int getEventType() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
