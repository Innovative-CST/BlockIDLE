package android.location;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import android.content.Context;

public final class Geocoder
{
    public Geocoder(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public Geocoder(@NonNull final Context context, @NonNull final Locale locale) {
        throw new RuntimeException("Stub!");
    }
    
    public static boolean isPresent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public List<Address> getFromLocation(final double latitude, final double longitude, final int maxResults) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void getFromLocation(final double latitude, final double longitude, final int maxResults, @NonNull final GeocodeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public List<Address> getFromLocationName(@NonNull final String locationName, final int maxResults) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void getFromLocationName(@NonNull final String locationName, final int maxResults, @NonNull final GeocodeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public List<Address> getFromLocationName(@NonNull final String locationName, final int maxResults, final double lowerLeftLatitude, final double lowerLeftLongitude, final double upperRightLatitude, final double upperRightLongitude) throws IOException {
        throw new RuntimeException("Stub!");
    }
    
    public void getFromLocationName(@NonNull final String locationName, final int maxResults, final double lowerLeftLatitude, final double lowerLeftLongitude, final double upperRightLatitude, final double upperRightLongitude, @NonNull final GeocodeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface GeocodeListener
    {
        void onGeocode(@NonNull final List<Address> p0);
        
        default void onError(@Nullable final String errorMessage) {
            throw new RuntimeException("Stub!");
        }
    }
}
