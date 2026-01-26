package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public class AudioDescriptor implements Parcelable
{
    @NonNull
    public static final Creator<AudioDescriptor> CREATOR;
    public static final int STANDARD_EDID = 1;
    public static final int STANDARD_NONE = 0;
    public static final int STANDARD_SADB = 2;
    public static final int STANDARD_VSADB = 3;
    
    AudioDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStandard() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public byte[] getDescriptor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEncapsulationType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
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
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
