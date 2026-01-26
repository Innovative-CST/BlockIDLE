package android.content.pm;

import android.os.Parcel;
import android.os.Parcelable;

public class Signature implements Parcelable
{
    @NonNull
    public static final Creator<Signature> CREATOR;
    
    public Signature(final byte[] signature) {
        throw new RuntimeException("Stub!");
    }
    
    public Signature(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    public char[] toChars() {
        throw new RuntimeException("Stub!");
    }
    
    public char[] toChars(final char[] existingArray, final int[] outLen) {
        throw new RuntimeException("Stub!");
    }
    
    public String toCharsString() {
        throw new RuntimeException("Stub!");
    }
    
    public byte[] toByteArray() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int parcelableFlags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
