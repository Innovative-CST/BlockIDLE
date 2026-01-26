package android.view;

import android.os.Parcel;
import android.os.Parcelable;

public final class DragAndDropPermissions implements Parcelable
{
    @NonNull
    public static final Creator<DragAndDropPermissions> CREATOR;
    
    DragAndDropPermissions() {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel destination, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
