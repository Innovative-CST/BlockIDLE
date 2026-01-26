package android.service.autofill;

import java.util.regex.Pattern;
import android.view.autofill.AutofillId;
import android.os.Parcel;
import android.os.Parcelable;

public final class CharSequenceTransformation implements Transformation, Parcelable
{
    @NonNull
    public static final Creator<CharSequenceTransformation> CREATOR;
    
    CharSequenceTransformation() {
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
    
    public static class Builder
    {
        public Builder(@NonNull final AutofillId id, @NonNull final Pattern regex, @NonNull final String subst) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addField(@NonNull final AutofillId id, @NonNull final Pattern regex, @NonNull final String subst) {
            throw new RuntimeException("Stub!");
        }
        
        public CharSequenceTransformation build() {
            throw new RuntimeException("Stub!");
        }
    }
}
