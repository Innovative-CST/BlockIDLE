package android.service.autofill;

import android.os.Parcel;
import android.icu.text.DateFormat;
import android.os.Parcelable;

public final class DateValueSanitizer implements Sanitizer, Parcelable
{
    @NonNull
    public static final Creator<DateValueSanitizer> CREATOR;
    
    public DateValueSanitizer(@NonNull final DateFormat dateFormat) {
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
