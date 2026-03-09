package androidx.appcompat.app;

import androidx.annotation.RequiresPermission;
import android.annotation.SuppressLint;
import androidx.core.content.PermissionChecker;
import android.location.Location;
import java.util.Calendar;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.NonNull;
import android.location.LocationManager;
import android.content.Context;

class TwilightManager
{
    private static final String TAG = "TwilightManager";
    private static final int SUNRISE = 6;
    private static final int SUNSET = 22;
    private static TwilightManager sInstance;
    private final Context mContext;
    private final LocationManager mLocationManager;
    private final TwilightState mTwilightState;
    
    static TwilightManager getInstance(@NonNull Context context) {
        if (TwilightManager.sInstance == null) {
            context = context.getApplicationContext();
            TwilightManager.sInstance = new TwilightManager(context, (LocationManager)context.getSystemService("location"));
        }
        return TwilightManager.sInstance;
    }
    
    @VisibleForTesting
    static void setInstance(final TwilightManager twilightManager) {
        TwilightManager.sInstance = twilightManager;
    }
    
    @VisibleForTesting
    TwilightManager(@NonNull final Context context, @NonNull final LocationManager locationManager) {
        this.mTwilightState = new TwilightState();
        this.mContext = context;
        this.mLocationManager = locationManager;
    }
    
    boolean isNight() {
        final TwilightState state = this.mTwilightState;
        if (this.isStateValid()) {
            return state.isNight;
        }
        final Location location = this.getLastKnownLocation();
        if (location != null) {
            this.updateState(location);
            return state.isNight;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        final Calendar calendar = Calendar.getInstance();
        final int hour = calendar.get(11);
        return hour < 6 || hour >= 22;
    }
    
    @SuppressLint({ "MissingPermission" })
    private Location getLastKnownLocation() {
        Location coarseLoc = null;
        Location fineLoc = null;
        int permission = PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_COARSE_LOCATION");
        if (permission == 0) {
            coarseLoc = this.getLastKnownLocationForProvider("network");
        }
        permission = PermissionChecker.checkSelfPermission(this.mContext, "android.permission.ACCESS_FINE_LOCATION");
        if (permission == 0) {
            fineLoc = this.getLastKnownLocationForProvider("gps");
        }
        if (fineLoc != null && coarseLoc != null) {
            return (fineLoc.getTime() > coarseLoc.getTime()) ? fineLoc : coarseLoc;
        }
        return (fineLoc != null) ? fineLoc : coarseLoc;
    }
    
    @RequiresPermission(anyOf = { "android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION" })
    private Location getLastKnownLocationForProvider(final String provider) {
        try {
            if (this.mLocationManager.isProviderEnabled(provider)) {
                return this.mLocationManager.getLastKnownLocation(provider);
            }
        }
        catch (final Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", (Throwable)e);
        }
        return null;
    }
    
    private boolean isStateValid() {
        return this.mTwilightState.nextUpdate > System.currentTimeMillis();
    }
    
    private void updateState(@NonNull final Location location) {
        final TwilightState state = this.mTwilightState;
        final long now = System.currentTimeMillis();
        final TwilightCalculator calculator = TwilightCalculator.getInstance();
        calculator.calculateTwilight(now - 86400000L, location.getLatitude(), location.getLongitude());
        calculator.calculateTwilight(now, location.getLatitude(), location.getLongitude());
        final boolean isNight = calculator.state == 1;
        final long todaySunrise = calculator.sunrise;
        final long todaySunset = calculator.sunset;
        calculator.calculateTwilight(now + 86400000L, location.getLatitude(), location.getLongitude());
        final long tomorrowSunrise = calculator.sunrise;
        long nextUpdate = 0L;
        if (todaySunrise == -1L || todaySunset == -1L) {
            nextUpdate = now + 43200000L;
        }
        else {
            if (now > todaySunset) {
                nextUpdate += tomorrowSunrise;
            }
            else if (now > todaySunrise) {
                nextUpdate += todaySunset;
            }
            else {
                nextUpdate += todaySunrise;
            }
            nextUpdate += 60000L;
        }
        state.isNight = isNight;
        state.nextUpdate = nextUpdate;
    }
    
    private static class TwilightState
    {
        boolean isNight;
        long nextUpdate;
        
        TwilightState() {
        }
    }
}
