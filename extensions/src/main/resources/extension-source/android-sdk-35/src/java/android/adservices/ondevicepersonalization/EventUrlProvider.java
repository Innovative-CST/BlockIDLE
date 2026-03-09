package android.adservices.ondevicepersonalization;

import android.net.Uri;
import android.os.PersistableBundle;

public class EventUrlProvider
{
    EventUrlProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri createEventTrackingUrlWithResponse(@NonNull final PersistableBundle eventParams, @Nullable final byte[] responseData, @Nullable final String mimeType) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Uri createEventTrackingUrlWithRedirect(@NonNull final PersistableBundle eventParams, @Nullable final Uri destinationUrl) {
        throw new RuntimeException("Stub!");
    }
}
