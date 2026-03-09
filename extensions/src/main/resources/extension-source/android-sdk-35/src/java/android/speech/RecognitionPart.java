package android.speech;

import android.os.Parcel;
import android.os.Parcelable;

public final class RecognitionPart implements Parcelable
{
    public static final int CONFIDENCE_LEVEL_HIGH = 5;
    public static final int CONFIDENCE_LEVEL_LOW = 1;
    public static final int CONFIDENCE_LEVEL_MEDIUM = 3;
    public static final int CONFIDENCE_LEVEL_MEDIUM_HIGH = 4;
    public static final int CONFIDENCE_LEVEL_MEDIUM_LOW = 2;
    public static final int CONFIDENCE_LEVEL_UNKNOWN = 0;
    @NonNull
    public static final Creator<RecognitionPart> CREATOR;
    
    RecognitionPart() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public String getRawText() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getFormattedText() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTimestampMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public int getConfidenceLevel() {
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
        public Builder(@NonNull final String rawText) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setRawText(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTimestampMillis(final long value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setConfidenceLevel(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RecognitionPart build() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setFormattedText(@NonNull final String value) {
            throw new RuntimeException("Stub!");
        }
    }
}
