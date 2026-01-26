package android.view.textclassifier;

import android.os.LocaleList;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable;

public final class TextSelection implements Parcelable
{
    @NonNull
    public static final Creator<TextSelection> CREATOR;
    
    TextSelection() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectionStartIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSelectionEndIndex() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEntityCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getEntity(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public float getConfidenceScore(final String entity) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public TextClassification getTextClassification() {
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
        public Builder(final int startIndex, final int endIndex) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setEntityType(@NonNull final String type, final float confidenceScore) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setId(@Nullable final String id) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTextClassification(@Nullable final TextClassification textClassification) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setExtras(@Nullable final Bundle extras) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TextSelection build() {
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
        
        public int getStartIndex() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEndIndex() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public LocaleList getDefaultLocales() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public String getCallingPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean shouldIncludeTextClassification() {
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
            public Builder(@NonNull final CharSequence text, final int startIndex, final int endIndex) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setDefaultLocales(@Nullable final LocaleList defaultLocales) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setIncludeTextClassification(final boolean includeTextClassification) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setExtras(@Nullable final Bundle extras) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Request build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
