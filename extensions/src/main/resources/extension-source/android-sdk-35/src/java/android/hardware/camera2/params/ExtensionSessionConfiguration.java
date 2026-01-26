package android.hardware.camera2.params;

import android.graphics.ColorSpace;
import android.hardware.camera2.CameraExtensionSession;
import java.util.concurrent.Executor;
import java.util.List;

public final class ExtensionSessionConfiguration
{
    public ExtensionSessionConfiguration(final int extension, @NonNull final List<OutputConfiguration> outputs, @NonNull final Executor executor, @NonNull final CameraExtensionSession.StateCallback listener) {
        throw new RuntimeException("Stub!");
    }
    
    public int getExtension() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPostviewOutputConfiguration(@Nullable final OutputConfiguration postviewOutput) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public OutputConfiguration getPostviewOutputConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<OutputConfiguration> getOutputConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public CameraExtensionSession.StateCallback getStateCallback() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Executor getExecutor() {
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
}
