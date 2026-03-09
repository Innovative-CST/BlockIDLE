package android.app.slice;

import android.net.Uri;
import android.content.Context;

@Deprecated
public class SliceMetrics
{
    @Deprecated
    public SliceMetrics(@NonNull final Context context, @NonNull final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void logVisible() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void logHidden() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void logTouch(final int actionType, @NonNull final Uri subSlice) {
        throw new RuntimeException("Stub!");
    }
}
