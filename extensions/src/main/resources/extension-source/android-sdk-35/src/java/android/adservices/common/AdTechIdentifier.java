package android.adservices.common;

import android.os.Parcel;
import android.os.Parcelable;

public final class AdTechIdentifier implements Parcelable
{
    @NonNull
    public static final Creator<AdTechIdentifier> CREATOR;
    
    AdTechIdentifier() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static AdTechIdentifier fromString(@NonNull final String source) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
