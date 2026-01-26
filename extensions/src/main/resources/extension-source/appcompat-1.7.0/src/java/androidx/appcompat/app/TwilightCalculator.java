package androidx.appcompat.app;

class TwilightCalculator
{
    private static TwilightCalculator sInstance;
    public static final int DAY = 0;
    public static final int NIGHT = 1;
    private static final float DEGREES_TO_RADIANS = 0.017453292f;
    private static final float J0 = 9.0E-4f;
    private static final float ALTIDUTE_CORRECTION_CIVIL_TWILIGHT = -0.10471976f;
    private static final float C1 = 0.0334196f;
    private static final float C2 = 3.49066E-4f;
    private static final float C3 = 5.236E-6f;
    private static final float OBLIQUITY = 0.4092797f;
    private static final long UTC_2000 = 946728000000L;
    public long sunset;
    public long sunrise;
    public int state;
    
    static TwilightCalculator getInstance() {
        if (TwilightCalculator.sInstance == null) {
            TwilightCalculator.sInstance = new TwilightCalculator();
        }
        return TwilightCalculator.sInstance;
    }
    
    public void calculateTwilight(final long time, final double latitude, final double longitude) {
        final float daysSince2000 = (time - 946728000000L) / 8.64E7f;
        final float meanAnomaly = 6.24006f + daysSince2000 * 0.01720197f;
        final double trueAnomaly = meanAnomaly + 0.03341960161924362 * Math.sin((double)meanAnomaly) + 3.4906598739326E-4 * Math.sin((double)(2.0f * meanAnomaly)) + 5.236000106378924E-6 * Math.sin((double)(3.0f * meanAnomaly));
        final double solarLng = trueAnomaly + 1.796593063 + 3.141592653589793;
        final double arcLongitude = -longitude / 360.0;
        final float n = (float)Math.round(daysSince2000 - 9.0E-4f - arcLongitude);
        final double solarTransitJ2000 = n + 9.0E-4f + arcLongitude + 0.0053 * Math.sin((double)meanAnomaly) + -0.0069 * Math.sin(2.0 * solarLng);
        final double solarDec = Math.asin(Math.sin(solarLng) * Math.sin(0.4092797040939331));
        final double latRad = latitude * 0.01745329238474369;
        final double cosHourAngle = (Math.sin(-0.10471975803375244) - Math.sin(latRad) * Math.sin(solarDec)) / (Math.cos(latRad) * Math.cos(solarDec));
        if (cosHourAngle >= 1.0) {
            this.state = 1;
            this.sunset = -1L;
            this.sunrise = -1L;
            return;
        }
        if (cosHourAngle <= -1.0) {
            this.state = 0;
            this.sunset = -1L;
            this.sunrise = -1L;
            return;
        }
        final float hourAngle = (float)(Math.acos(cosHourAngle) / 6.283185307179586);
        this.sunset = Math.round((solarTransitJ2000 + hourAngle) * 8.64E7) + 946728000000L;
        this.sunrise = Math.round((solarTransitJ2000 - hourAngle) * 8.64E7) + 946728000000L;
        if (this.sunrise < time && this.sunset > time) {
            this.state = 0;
        }
        else {
            this.state = 1;
        }
    }
}
