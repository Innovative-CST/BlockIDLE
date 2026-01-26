package android.view;

import android.graphics.Rect;
import java.util.function.Consumer;
import android.os.CancellationSignal;

public interface ScrollCaptureCallback
{
    void onScrollCaptureSearch(@NonNull final CancellationSignal p0, @NonNull final Consumer<Rect> p1);
    
    void onScrollCaptureStart(@NonNull final ScrollCaptureSession p0, @NonNull final CancellationSignal p1, @NonNull final Runnable p2);
    
    void onScrollCaptureImageRequest(@NonNull final ScrollCaptureSession p0, @NonNull final CancellationSignal p1, @NonNull final Rect p2, @NonNull final Consumer<Rect> p3);
    
    void onScrollCaptureEnd(@NonNull final Runnable p0);
}
