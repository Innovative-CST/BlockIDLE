package android.view.translation;

import android.os.Parcel;
import android.util.SparseArray;
import android.os.Parcelable;

public final class TranslationResponse implements Parcelable
{
    @NonNull
    public static final Creator<TranslationResponse> CREATOR;
    public static final int TRANSLATION_STATUS_CONTEXT_UNSUPPORTED = 2;
    public static final int TRANSLATION_STATUS_SUCCESS = 0;
    public static final int TRANSLATION_STATUS_UNKNOWN_ERROR = 1;
    
    TranslationResponse() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTranslationStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SparseArray<TranslationResponseValue> getTranslationResponseValues() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public SparseArray<ViewTranslationResponse> getViewTranslationResponses() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFinalResponse() {
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
        public Builder(final int translationStatus) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTranslationResponseValues(@NonNull final SparseArray<TranslationResponseValue> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setViewTranslationResponses(@NonNull final SparseArray<ViewTranslationResponse> value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFinalResponse(final boolean value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TranslationResponse build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTranslationResponseValue(final int index, @NonNull final TranslationResponseValue value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setViewTranslationResponse(final int index, @NonNull final ViewTranslationResponse response) {
            throw new RuntimeException("Stub!");
        }
    }
}
