package android.location;

@Deprecated
public final class GpsStatus
{
    @Deprecated
    public static final int GPS_EVENT_FIRST_FIX = 3;
    @Deprecated
    public static final int GPS_EVENT_SATELLITE_STATUS = 4;
    @Deprecated
    public static final int GPS_EVENT_STARTED = 1;
    @Deprecated
    public static final int GPS_EVENT_STOPPED = 2;
    
    GpsStatus() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public static GpsStatus create(@NonNull final GnssStatus gnssStatus, final int timeToFirstFix) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getTimeToFirstFix() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Iterable<GpsSatellite> getSatellites() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMaxSatellites() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface NmeaListener
    {
        @Deprecated
        void onNmeaReceived(final long p0, final String p1);
    }
    
    @Deprecated
    public interface Listener
    {
        @Deprecated
        void onGpsStatusChanged(final int p0);
    }
}
