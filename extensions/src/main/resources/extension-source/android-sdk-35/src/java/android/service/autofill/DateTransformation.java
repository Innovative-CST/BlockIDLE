package android.service.autofill;

import android.os.Parcel;
import android.icu.text.DateFormat;
import android.view.autofill.AutofillId;
import android.os.Parcelable;

public final class DateTransformation implements Transformation, Parcelable
{
    @NonNull
    public static final Creator<DateTransformation> CREATOR;
    
    public DateTransformation(@NonNull final AutofillId id, @NonNull final DateFormat dateFormat) {
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
