package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable
{
    @NonNull
    public static final Creator<AbsSavedState> CREATOR;
    public static final AbsSavedState EMPTY_STATE;
    
    protected AbsSavedState(final Parcelable superState) {
        throw new RuntimeException("Stub!");
    }
    
    protected AbsSavedState(final Parcel source) {
        throw new RuntimeException("Stub!");
    }
    
    protected AbsSavedState(final Parcel source, final ClassLoader loader) {
        throw new RuntimeException("Stub!");
    }
    
    public final Parcelable getSuperState() {
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
    
    static {
        CREATOR = null;
        EMPTY_STATE = null;
    }
}
