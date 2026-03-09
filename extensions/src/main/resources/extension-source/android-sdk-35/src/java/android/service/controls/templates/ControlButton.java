package android.service.controls.templates;

import android.os.Parcel;
import android.os.Parcelable;

public final class ControlButton implements Parcelable
{
    @NonNull
    public static final Creator<ControlButton> CREATOR;
    
    public ControlButton(final boolean checked, @NonNull final CharSequence actionDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CharSequence getActionDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
