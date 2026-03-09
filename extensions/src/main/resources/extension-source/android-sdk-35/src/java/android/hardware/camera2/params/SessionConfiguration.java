package android.hardware.camera2.params;

import android.graphics.ColorSpace;
import android.hardware.camera2.CaptureRequest;
import android.os.Parcel;
import android.hardware.camera2.CameraCaptureSession;
import java.util.concurrent.Executor;
import java.util.List;
import android.os.Parcelable;

public final class SessionConfiguration implements Parcelable
{
    @NonNull
    public static final Creator<SessionConfiguration> CREATOR;
    public static final int SESSION_HIGH_SPEED = 1;
    public static final int SESSION_REGULAR = 0;
    
    public SessionConfiguration(final int sessionType, @NonNull final List<OutputConfiguration> outputs, @NonNull final Executor executor, @NonNull final CameraCaptureSession.StateCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    public SessionConfiguration(final int sessionType, @NonNull final List<OutputConfiguration> outputs) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    
    public int getSessionType() {
        throw new RuntimeException("Stub!");
    }
    
    public List<OutputConfiguration> getOutputConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    public CameraCaptureSession.StateCallback getStateCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public Executor getExecutor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputConfiguration(@NonNull final InputConfiguration input) {
        throw new RuntimeException("Stub!");
    }
    
    public InputConfiguration getInputConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSessionParameters(final CaptureRequest params) {
        throw new RuntimeException("Stub!");
    }
    
    public CaptureRequest getSessionParameters() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorSpace(@NonNull final ColorSpace.Named colorSpace) {
        throw new RuntimeException("Stub!");
    }
    
    public void clearColorSpace() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorSpace getColorSpace() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStateCallback(@NonNull final Executor executor, @NonNull final CameraCaptureSession.StateCallback cb) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
