package android.telephony;

import android.os.Parcel;
import android.os.Parcelable;

public final class RadioAccessSpecifier implements Parcelable
{
    @NonNull
    public static final Creator<RadioAccessSpecifier> CREATOR;
    
    public RadioAccessSpecifier(final int ran, final int[] bands, final int[] channels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRadioAccessNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getBands() {
        throw new RuntimeException("Stub!");
    }
    
    public int[] getChannels() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
