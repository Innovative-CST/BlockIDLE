package android.service.autofill;

import android.os.Parcel;
import android.view.autofill.AutofillId;
import android.os.Parcelable;

public final class LuhnChecksumValidator implements Validator, Parcelable
{
    @NonNull
    public static final Creator<LuhnChecksumValidator> CREATOR;
    
    public LuhnChecksumValidator(@NonNull final AutofillId... ids) {
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
