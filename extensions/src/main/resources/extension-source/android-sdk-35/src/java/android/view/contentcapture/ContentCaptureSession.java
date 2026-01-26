package android.view.contentcapture;

import android.view.View;
import android.graphics.Insets;
import java.util.List;
import android.view.autofill.AutofillId;
import android.view.ViewStructure;

public abstract class ContentCaptureSession implements AutoCloseable
{
    ContentCaptureSession() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final ContentCaptureSessionId getContentCaptureSessionId() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final ContentCaptureSession createContentCaptureSession(@NonNull final ContentCaptureContext context) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setContentCaptureContext(@Nullable final ContentCaptureContext context) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final ContentCaptureContext getContentCaptureContext() {
        throw new RuntimeException("Stub!");
    }
    
    public final void destroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyViewAppeared(@NonNull final ViewStructure node) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyViewDisappeared(@NonNull final AutofillId id) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyViewsAppeared(@NonNull final List<ViewStructure> appearedNodes) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyViewsDisappeared(@NonNull final AutofillId hostId, @NonNull final long[] virtualIds) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyViewTextChanged(@NonNull final AutofillId id, @Nullable final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifyViewInsetsChanged(@NonNull final Insets viewInsets) {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifySessionResumed() {
        throw new RuntimeException("Stub!");
    }
    
    public final void notifySessionPaused() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final ViewStructure newViewStructure(@NonNull final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public AutofillId newAutofillId(@NonNull final AutofillId hostId, final long virtualChildId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final ViewStructure newVirtualViewStructure(@NonNull final AutofillId parentId, final long virtualId) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
