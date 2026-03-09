package android.service.quickaccesswallet;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class GetWalletCardsResponse implements Parcelable
{
    @NonNull
    public static final Creator<GetWalletCardsResponse> CREATOR;
    
    public GetWalletCardsResponse(@NonNull final List<WalletCard> walletCards, final int selectedIndex) {
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
    public List<WalletCard> getWalletCards() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectedIndex() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
