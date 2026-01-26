package android.service.quickaccesswallet;

import android.os.Parcel;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class GetWalletCardsError implements Parcelable
{
    @NonNull
    public static final Creator<GetWalletCardsError> CREATOR;
    
    public GetWalletCardsError(@Nullable final Icon icon, @Nullable final CharSequence message) {
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
    
    @Nullable
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getMessage() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
