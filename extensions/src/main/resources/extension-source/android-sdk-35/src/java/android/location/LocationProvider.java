package android.location;

@Deprecated
public class LocationProvider
{
    @Deprecated
    public static final int AVAILABLE = 2;
    @Deprecated
    public static final int OUT_OF_SERVICE = 0;
    @Deprecated
    public static final int TEMPORARILY_UNAVAILABLE = 1;
    
    LocationProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean meetsCriteria(final Criteria criteria) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean requiresNetwork() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean requiresSatellite() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean requiresCell() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasMonetaryCost() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean supportsAltitude() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean supportsSpeed() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean supportsBearing() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPowerRequirement() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getAccuracy() {
        throw new RuntimeException("Stub!");
    }
}
