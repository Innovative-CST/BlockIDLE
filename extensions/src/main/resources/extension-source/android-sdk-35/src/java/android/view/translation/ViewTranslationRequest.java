package android.view.translation;

import android.os.Parcel;
import android.view.autofill.AutofillId;
import java.util.Set;
import android.os.Parcelable;

public final class ViewTranslationRequest implements Parcelable
{
    @NonNull
    public static final Creator<ViewTranslationRequest> CREATOR;
    public static final String ID_TEXT = "android:text";
    
    ViewTranslationRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TranslationRequestValue getValue(@NonNull final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Set<String> getKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AutofillId getAutofillId() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(@NonNull final AutofillId autofillId) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final AutofillId autofillId, final long virtualChildId) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setValue(@NonNull final String key, @NonNull final TranslationRequestValue value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public ViewTranslationRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
