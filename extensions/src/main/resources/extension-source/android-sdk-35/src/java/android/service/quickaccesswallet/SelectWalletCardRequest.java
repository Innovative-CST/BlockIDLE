package android.service.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;

public final class SelectWalletCardRequest implements Parcelable
{
    @NonNull
    public static final Creator<SelectWalletCardRequest> CREATOR;
    
    public SelectWalletCardRequest(@NonNull final String cardId) {
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
    
    @NonNull
    public String getCardId() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
