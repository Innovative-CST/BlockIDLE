package android.location;

import android.os.Bundle;
import java.util.List;

public interface LocationListener
{
    void onLocationChanged(@NonNull final Location p0);
    
    default void onLocationChanged(@NonNull final List<Location> locations) {
        throw new RuntimeException("Stub!");
    }
    
    default void onFlushComplete(final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    default void onStatusChanged(final String provider, final int status, final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    default void onProviderEnabled(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    default void onProviderDisabled(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
}
