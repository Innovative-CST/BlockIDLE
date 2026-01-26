package android.view;

import android.window.InputTransferToken;
import android.graphics.Rect;
import android.graphics.Region;

public interface AttachedSurfaceControl
{
    @Nullable
    SurfaceControl.Transaction buildReparentTransaction(@NonNull final SurfaceControl p0);
    
    boolean applyTransactionOnDraw(@NonNull final SurfaceControl.Transaction p0);
    
    default int getBufferTransformHint() {
        throw new RuntimeException("Stub!");
    }
    
    default void addOnBufferTransformHintChangedListener(@NonNull final OnBufferTransformHintChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void removeOnBufferTransformHintChangedListener(@NonNull final OnBufferTransformHintChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    default void setTouchableRegion(@Nullable final Region r) {
        throw new RuntimeException("Stub!");
    }
    
    default void setChildBoundingInsets(@NonNull final Rect insets) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    default InputTransferToken getInputTransferToken() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnBufferTransformHintChangedListener
    {
        void onBufferTransformHintChanged(final int p0);
    }
}
