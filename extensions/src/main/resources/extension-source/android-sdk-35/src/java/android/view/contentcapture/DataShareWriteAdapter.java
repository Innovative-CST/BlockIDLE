package android.view.contentcapture;

import android.os.ParcelFileDescriptor;

public interface DataShareWriteAdapter
{
    void onWrite(@NonNull final ParcelFileDescriptor p0);
    
    void onRejected();
    
    default void onError(final int errorCode) {
        throw new RuntimeException("Stub!");
    }
}
