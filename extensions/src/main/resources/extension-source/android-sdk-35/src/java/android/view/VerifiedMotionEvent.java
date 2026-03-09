package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public final class VerifiedMotionEvent extends VerifiedInputEvent implements Parcelable
{
    @NonNull
    public static final Creator<VerifiedMotionEvent> CREATOR;
    
    VerifiedMotionEvent() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Boolean getFlag(final int flag) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRawX() {
        throw new RuntimeException("Stub!");
    }
    
    public float getRawY() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActionMasked() {
        throw new RuntimeException("Stub!");
    }
    
    public long getDownTimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMetaState() {
        throw new RuntimeException("Stub!");
    }
    
    public int getButtonState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
