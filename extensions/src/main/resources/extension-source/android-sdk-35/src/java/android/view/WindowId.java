package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public class WindowId implements Parcelable
{
    @NonNull
    public static final Creator<WindowId> CREATOR;
    
    WindowId() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFocused() {
        throw new RuntimeException("Stub!");
    }
    
    public void registerFocusObserver(final FocusObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterFocusObserver(final FocusObserver observer) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object otherObj) {
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
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public abstract static class FocusObserver
    {
        public FocusObserver() {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onFocusGained(final WindowId p0);
        
        public abstract void onFocusLost(final WindowId p0);
    }
}
