package android.accessibilityservice;

import android.os.Parcel;
import android.view.MotionEvent;
import java.util.List;
import android.os.Parcelable;

public final class AccessibilityGestureEvent implements Parcelable
{
    @NonNull
    public static final Creator<AccessibilityGestureEvent> CREATOR;
    
    public AccessibilityGestureEvent(final int gestureId, final int displayId, @NonNull final List<MotionEvent> motionEvents) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisplayId() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGestureId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<MotionEvent> getMotionEvents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String gestureIdToString(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
