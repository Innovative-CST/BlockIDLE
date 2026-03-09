package android.view.translation;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class TranslationRequest implements Parcelable
{
    @NonNull
    public static final Creator<TranslationRequest> CREATOR;
    public static final int FLAG_DICTIONARY_RESULT = 2;
    public static final int FLAG_PARTIAL_RESPONSES = 8;
    public static final int FLAG_TRANSLATION_RESULT = 1;
    public static final int FLAG_TRANSLITERATION_RESULT = 4;
    
    TranslationRequest() {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlags() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<TranslationRequestValue> getTranslationRequestValues() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<ViewTranslationRequest> getViewTranslationRequests() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFlags(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTranslationRequestValues(@NonNull final List<TranslationRequestValue> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setViewTranslationRequests(@NonNull final List<ViewTranslationRequest> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TranslationRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
