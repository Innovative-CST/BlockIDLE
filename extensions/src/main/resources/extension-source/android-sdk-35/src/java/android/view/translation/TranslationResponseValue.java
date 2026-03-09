package android.view.translation;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class TranslationResponseValue implements Parcelable
{
    @NonNull
    public static final Creator<TranslationResponseValue> CREATOR;
    public static final String EXTRA_DEFINITIONS = "android.view.translation.extra.DEFINITIONS";
    public static final int STATUS_ERROR = 1;
    public static final int STATUS_SUCCESS = 0;
    
    TranslationResponseValue() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static TranslationResponseValue forError() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStatusCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getText() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getTransliteration() {
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
        public Builder(final int statusCode) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setText(@NonNull final CharSequence value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@NonNull final Bundle value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTransliteration(@NonNull final CharSequence value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TranslationResponseValue build() {
            throw new RuntimeException("Stub!");
        }
    }
}
