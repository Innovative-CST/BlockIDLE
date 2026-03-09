package android.telecom;

import android.os.Parcel;
import android.os.Bundle;
import android.graphics.drawable.Icon;
import android.os.Parcelable;

public final class StatusHints implements Parcelable
{
    @NonNull
    public static final Creator<StatusHints> CREATOR;
    
    public StatusHints(final CharSequence label, final Icon icon, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getLabel() {
        throw new RuntimeException("Stub!");
    }
    
    public Icon getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object other) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
