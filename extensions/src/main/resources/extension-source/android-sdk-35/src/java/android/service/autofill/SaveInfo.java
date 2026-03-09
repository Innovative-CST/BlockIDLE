package android.service.autofill;

import android.content.IntentSender;
import android.view.autofill.AutofillId;
import android.os.Parcel;
import android.os.Parcelable;

public final class SaveInfo implements Parcelable
{
    @NonNull
    public static final Creator<SaveInfo> CREATOR;
    public static final int FLAG_DELAY_SAVE = 4;
    public static final int FLAG_DONT_SAVE_ON_FINISH = 2;
    public static final int FLAG_SAVE_ON_ALL_VIEWS_INVISIBLE = 1;
    public static final int NEGATIVE_BUTTON_STYLE_CANCEL = 0;
    public static final int NEGATIVE_BUTTON_STYLE_NEVER = 2;
    public static final int NEGATIVE_BUTTON_STYLE_REJECT = 1;
    public static final int POSITIVE_BUTTON_STYLE_CONTINUE = 1;
    public static final int POSITIVE_BUTTON_STYLE_SAVE = 0;
    public static final int SAVE_DATA_TYPE_ADDRESS = 2;
    public static final int SAVE_DATA_TYPE_CREDIT_CARD = 4;
    public static final int SAVE_DATA_TYPE_DEBIT_CARD = 32;
    public static final int SAVE_DATA_TYPE_EMAIL_ADDRESS = 16;
    public static final int SAVE_DATA_TYPE_GENERIC = 0;
    public static final int SAVE_DATA_TYPE_GENERIC_CARD = 128;
    public static final int SAVE_DATA_TYPE_PASSWORD = 1;
    public static final int SAVE_DATA_TYPE_PAYMENT_CARD = 64;
    public static final int SAVE_DATA_TYPE_USERNAME = 8;
    
    SaveInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int type, @NonNull final AutofillId[] requiredIds) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(final int type) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFlags(final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setOptionalIds(@NonNull final AutofillId[] ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setDescription(@Nullable final CharSequence description) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setCustomDescription(@NonNull final CustomDescription customDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setNegativeAction(final int style, @Nullable final IntentSender listener) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setPositiveAction(final int style) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setValidator(@NonNull final Validator validator) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder addSanitizer(@NonNull final Sanitizer sanitizer, @NonNull final AutofillId... ids) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTriggerId(@NonNull final AutofillId id) {
            throw new RuntimeException("Stub!");
        }
        
        public SaveInfo build() {
            throw new RuntimeException("Stub!");
        }
    }
}
