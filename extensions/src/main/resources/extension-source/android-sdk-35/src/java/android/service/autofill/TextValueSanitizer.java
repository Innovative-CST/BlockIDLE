package android.service.autofill;

import android.os.Parcel;
import java.util.regex.Pattern;
import android.os.Parcelable;

public final class TextValueSanitizer implements Sanitizer, Parcelable
{
    @NonNull
    public static final Creator<TextValueSanitizer> CREATOR;
    
    public TextValueSanitizer(@NonNull final Pattern regex, @NonNull final String subst) {
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
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
