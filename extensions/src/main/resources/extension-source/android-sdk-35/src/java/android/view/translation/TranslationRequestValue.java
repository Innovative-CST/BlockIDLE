package android.view.translation;

import android.os.Parcel;
import android.os.Parcelable;

public final class TranslationRequestValue implements Parcelable
{
    @NonNull
    public static final Creator<TranslationRequestValue> CREATOR;
    
    TranslationRequestValue() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static TranslationRequestValue forText(@NonNull final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence getText() {
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
