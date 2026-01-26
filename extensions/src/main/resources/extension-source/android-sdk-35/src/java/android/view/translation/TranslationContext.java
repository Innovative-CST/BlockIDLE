package android.view.translation;

import android.os.Parcel;
import android.os.Parcelable;

public final class TranslationContext implements Parcelable
{
    @NonNull
    public static final Creator<TranslationContext> CREATOR;
    public static final int FLAG_DEFINITIONS = 4;
    public static final int FLAG_LOW_LATENCY = 1;
    public static final int FLAG_TRANSLITERATION = 2;
    
    TranslationContext() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TranslationSpec getSourceSpec() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public TranslationSpec getTargetSpec() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTranslationFlags() {
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
        public Builder(@NonNull final TranslationSpec sourceSpec, @NonNull final TranslationSpec targetSpec) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setTranslationFlags(final int value) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public TranslationContext build() {
            throw new RuntimeException("Stub!");
        }
    }
}
