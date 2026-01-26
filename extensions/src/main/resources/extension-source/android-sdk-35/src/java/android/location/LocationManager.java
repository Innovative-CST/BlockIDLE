package android.location;

import android.os.Handler;
import java.util.Set;
import android.os.Bundle;
import android.location.provider.ProviderProperties;
import java.util.List;
import android.app.PendingIntent;
import android.os.Looper;
import java.util.function.Consumer;
import java.util.concurrent.Executor;
import android.os.CancellationSignal;

public class LocationManager
{
    public static final String ACTION_GNSS_CAPABILITIES_CHANGED = "android.location.action.GNSS_CAPABILITIES_CHANGED";
    public static final String EXTRA_GNSS_CAPABILITIES = "android.location.extra.GNSS_CAPABILITIES";
    public static final String EXTRA_LOCATION_ENABLED = "android.location.extra.LOCATION_ENABLED";
    public static final String EXTRA_PROVIDER_ENABLED = "android.location.extra.PROVIDER_ENABLED";
    public static final String EXTRA_PROVIDER_NAME = "android.location.extra.PROVIDER_NAME";
    public static final String FUSED_PROVIDER = "fused";
    public static final String GPS_PROVIDER = "gps";
    public static final String KEY_FLUSH_COMPLETE = "flushComplete";
    public static final String KEY_LOCATIONS = "locations";
    public static final String KEY_LOCATION_CHANGED = "location";
    public static final String KEY_PROVIDER_ENABLED = "providerEnabled";
    public static final String KEY_PROXIMITY_ENTERING = "entering";
    @Deprecated
    public static final String KEY_STATUS_CHANGED = "status";
    public static final String MODE_CHANGED_ACTION = "android.location.MODE_CHANGED";
    public static final String NETWORK_PROVIDER = "network";
    public static final String PASSIVE_PROVIDER = "passive";
    public static final String PROVIDERS_CHANGED_ACTION = "android.location.PROVIDERS_CHANGED";
    
    LocationManager() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLocationEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isProviderEnabled(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Location getLastKnownLocation(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    public void getCurrentLocation(@NonNull final String provider, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final Consumer<Location> consumer) {
        throw new RuntimeException("Stub!");
    }
    
    public void getCurrentLocation(@NonNull final String provider, @NonNull final LocationRequest locationRequest, @Nullable final CancellationSignal cancellationSignal, @NonNull final Executor executor, @NonNull final Consumer<Location> consumer) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestSingleUpdate(@NonNull final String provider, @NonNull final LocationListener listener, @Nullable final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestSingleUpdate(@NonNull final Criteria criteria, @NonNull final LocationListener listener, @Nullable final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestSingleUpdate(@NonNull final String provider, @NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestSingleUpdate(@NonNull final Criteria criteria, @NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestLocationUpdates(@NonNull final String provider, final long minTimeMs, final float minDistanceM, @NonNull final LocationListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestLocationUpdates(@NonNull final String provider, final long minTimeMs, final float minDistanceM, @NonNull final LocationListener listener, @Nullable final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestLocationUpdates(@NonNull final String provider, final long minTimeMs, final float minDistanceM, @NonNull final Executor executor, @NonNull final LocationListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestLocationUpdates(final long minTimeMs, final float minDistanceM, @NonNull final Criteria criteria, @NonNull final LocationListener listener, @Nullable final Looper looper) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestLocationUpdates(final long minTimeMs, final float minDistanceM, @NonNull final Criteria criteria, @NonNull final Executor executor, @NonNull final LocationListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestLocationUpdates(@NonNull final String provider, final long minTimeMs, final float minDistanceM, @NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void requestLocationUpdates(final long minTimeMs, final float minDistanceM, @NonNull final Criteria criteria, @NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestLocationUpdates(@NonNull final String provider, @NonNull final LocationRequest locationRequest, @NonNull final Executor executor, @NonNull final LocationListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestLocationUpdates(@NonNull final String provider, @NonNull final LocationRequest locationRequest, @NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestFlush(@NonNull final String provider, @NonNull final LocationListener listener, final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestFlush(@NonNull final String provider, @NonNull final PendingIntent pendingIntent, final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeUpdates(@NonNull final LocationListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeUpdates(@NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasProvider(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getAllProviders() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<String> getProviders(final boolean enabledOnly) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public List<String> getProviders(@NonNull final Criteria criteria, final boolean enabledOnly) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getBestProvider(@NonNull final Criteria criteria, final boolean enabledOnly) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public LocationProvider getProvider(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ProviderProperties getProviderProperties(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean sendExtraCommand(@NonNull final String provider, @NonNull final String command, @Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public void addTestProvider(@NonNull final String provider, final boolean requiresNetwork, final boolean requiresSatellite, final boolean requiresCell, final boolean hasMonetaryCost, final boolean supportsAltitude, final boolean supportsSpeed, final boolean supportsBearing, final int powerUsage, final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    public void addTestProvider(@NonNull final String provider, @NonNull final ProviderProperties properties) {
        throw new RuntimeException("Stub!");
    }
    
    public void addTestProvider(@NonNull final String provider, @NonNull final ProviderProperties properties, @NonNull final Set<String> extraAttributionTags) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeTestProvider(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTestProviderLocation(@NonNull final String provider, @NonNull final Location location) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearTestProviderLocation(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTestProviderEnabled(@NonNull final String provider, final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearTestProviderEnabled(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTestProviderStatus(@NonNull final String provider, final int status, @Nullable final Bundle extras, final long updateTime) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearTestProviderStatus(@NonNull final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    public void addProximityAlert(final double latitude, final double longitude, final float radius, final long expiration, @NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeProximityAlert(@NonNull final PendingIntent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public GnssCapabilities getGnssCapabilities() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGnssYearOfHardware() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getGnssHardwareModelName() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public List<GnssAntennaInfo> getGnssAntennaInfos() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public GpsStatus getGpsStatus(@Nullable final GpsStatus status) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean addGpsStatusListener(final GpsStatus.Listener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removeGpsStatusListener(final GpsStatus.Listener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean registerGnssStatusCallback(@NonNull final GnssStatus.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerGnssStatusCallback(@NonNull final GnssStatus.Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerGnssStatusCallback(@NonNull final Executor executor, @NonNull final GnssStatus.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterGnssStatusCallback(@NonNull final GnssStatus.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean addNmeaListener(@NonNull final GpsStatus.NmeaListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removeNmeaListener(@NonNull final GpsStatus.NmeaListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean addNmeaListener(@NonNull final OnNmeaMessageListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addNmeaListener(@NonNull final OnNmeaMessageListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean addNmeaListener(@NonNull final Executor executor, @NonNull final OnNmeaMessageListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeNmeaListener(@NonNull final OnNmeaMessageListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean registerGnssMeasurementsCallback(@NonNull final GnssMeasurementsEvent.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerGnssMeasurementsCallback(@NonNull final GnssMeasurementsEvent.Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerGnssMeasurementsCallback(@NonNull final Executor executor, @NonNull final GnssMeasurementsEvent.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerGnssMeasurementsCallback(@NonNull final GnssMeasurementRequest request, @NonNull final Executor executor, @NonNull final GnssMeasurementsEvent.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterGnssMeasurementsCallback(@NonNull final GnssMeasurementsEvent.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerAntennaInfoListener(@NonNull final Executor executor, @NonNull final GnssAntennaInfo.Listener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterAntennaInfoListener(@NonNull final GnssAntennaInfo.Listener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean registerGnssNavigationMessageCallback(@NonNull final GnssNavigationMessage.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerGnssNavigationMessageCallback(@NonNull final GnssNavigationMessage.Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean registerGnssNavigationMessageCallback(@NonNull final Executor executor, @NonNull final GnssNavigationMessage.Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void unregisterGnssNavigationMessageCallback(@NonNull final GnssNavigationMessage.Callback callback) {
        throw new RuntimeException("Stub!");
    }
}
