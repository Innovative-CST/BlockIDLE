package android.service.quickaccesswallet;

import android.location.Location;
import java.util.List;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;

public final class WalletCard implements Parcelable
{
    public static final int CARD_TYPE_NON_PAYMENT = 2;
    public static final int CARD_TYPE_PAYMENT = 1;
    public static final int CARD_TYPE_UNKNOWN = 0;
    @NonNull
    public static final Creator<WalletCard> CREATOR;
    
    WalletCard() {
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
    
    @NonNull
    public int getCardType() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Icon getCardImage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public PendingIntent getPendingIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Icon getCardIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getCardLabel() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Icon getNonPaymentCardSecondaryImage() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Location> getCardLocations() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final String cardId, @NonNull final int cardType, @NonNull final Icon cardImage, @NonNull final CharSequence contentDescription, @NonNull final PendingIntent pendingIntent) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final String cardId, @NonNull final Icon cardImage, @NonNull final CharSequence contentDescription, @NonNull final PendingIntent pendingIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCardIcon(@Nullable final Icon cardIcon) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCardLabel(@Nullable final CharSequence cardLabel) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNonPaymentCardSecondaryImage(@Nullable final Icon nonPaymentCardSecondaryImage) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCardLocations(@NonNull final List<Location> cardLocations) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public WalletCard build() {
            throw new RuntimeException("Stub!");
        }
    }
}
