package android.service.autofill;

import android.os.Parcel;
import java.util.regex.Pattern;
import android.view.autofill.AutofillId;
import android.os.Parcelable;

public final class RegexValidator implements Validator, Parcelable
{
    @NonNull
    public static final Creator<RegexValidator> CREATOR;
    
    public RegexValidator(@NonNull final AutofillId id, @NonNull final Pattern regex) {
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
