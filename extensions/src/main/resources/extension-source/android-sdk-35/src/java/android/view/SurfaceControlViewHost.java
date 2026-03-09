package android.view;

import android.os.Parcel;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.window.InputTransferToken;
import android.os.IBinder;
import android.content.Context;

public class SurfaceControlViewHost
{
    public SurfaceControlViewHost(@NonNull final Context context, @NonNull final Display display, @Nullable final IBinder hostToken) {
        throw new RuntimeException("Stub!");
    }
    
    public SurfaceControlViewHost(@NonNull final Context context, @NonNull final Display display, @Nullable final InputTransferToken hostInputTransferToken) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() throws Throwable {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SurfacePackage getSurfacePackage() {
        throw new RuntimeException("Stub!");
    }
    
    public void setView(@NonNull final View view, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public View getView() {
        throw new RuntimeException("Stub!");
    }
    
    public void relayout(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void release() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean transferTouchGestureToHost() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class SurfacePackage implements Parcelable
    {
        @NonNull
        public static final Creator<SurfacePackage> CREATOR;
        
        public SurfacePackage(@NonNull final SurfacePackage other) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public SurfaceControl getSurfaceControl() {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyConfigurationChanged(@NonNull final Configuration c) {
            throw new RuntimeException("Stub!");
        }
        
        public void notifyDetachedFromWindow() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel out, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void release() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public InputTransferToken getInputTransferToken() {
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
}
