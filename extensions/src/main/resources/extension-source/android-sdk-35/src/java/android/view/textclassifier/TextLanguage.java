package android.view.textclassifier;

import android.os.Parcel;
import android.os.Bundle;
import android.icu.util.ULocale;
import android.os.Parcelable;

public final class TextLanguage implements Parcelable
{
    @NonNull
    public static final Creator<TextLanguage> CREATOR;
    
    TextLanguage() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLocaleHypothesisCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ULocale getLocale(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public float getConfidenceScore(@NonNull final ULocale locale) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bundle getExtras() {
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
    public void writeToParcel(final Parcel dest, final int flags) {
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
        public Builder putLocale(@NonNull final ULocale locale, final float confidenceScore) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setId(@Nullable final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@NonNull final Bundle bundle) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextLanguage build() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class Request implements Parcelable
    {
        @NonNull
        public static final Creator<Request> CREATOR;
        
        Request() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public CharSequence getText() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getCallingPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Bundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final CharSequence text) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExtras(@NonNull final Bundle bundle) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Request build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
