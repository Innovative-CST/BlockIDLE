package android.service.quickaccesswallet;

import android.os.Parcel;
import android.os.Parcelable;

public final class GetWalletCardsRequest implements Parcelable
{
    @NonNull
    public static final Creator<GetWalletCardsRequest> CREATOR;
    
    public GetWalletCardsRequest(final int cardWidthPx, final int cardHeightPx, final int iconSizePx, final int maxCards) {
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
    
    public int getCardWidthPx() {
        throw new RuntimeException("Stub!");
    }
    
    public int getCardHeightPx() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIconSizePx() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxCards() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
