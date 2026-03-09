package android.view.translation;

import android.os.Parcel;
import android.icu.util.ULocale;
import android.os.Parcelable;

public final class TranslationSpec implements Parcelable
{
    @NonNull
    public static final Creator<TranslationSpec> CREATOR;
    public static final int DATA_FORMAT_TEXT = 1;
    
    public TranslationSpec(@NonNull final ULocale locale, final int dataFormat) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ULocale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public int getDataFormat() {
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
}
