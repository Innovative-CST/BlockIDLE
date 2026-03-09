package android.service.autofill;

import java.util.regex.Pattern;
import android.view.autofill.AutofillId;
import android.os.Parcel;
import android.os.Parcelable;

public final class ImageTransformation implements Transformation, Parcelable
{
    @NonNull
    public static final Creator<ImageTransformation> CREATOR;
    
    ImageTransformation() {
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
        @Deprecated
        public Builder(@NonNull final AutofillId id, @NonNull final Pattern regex, final int resId) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder(@NonNull final AutofillId id, @NonNull final Pattern regex, final int resId, @NonNull final CharSequence contentDescription) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public Builder addOption(@NonNull final Pattern regex, final int resId) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder addOption(@NonNull final Pattern regex, final int resId, @NonNull final CharSequence contentDescription) {
            throw new RuntimeException("Stub!");
        }
        
        public ImageTransformation build() {
            throw new RuntimeException("Stub!");
        }
    }
}
