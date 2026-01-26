package android.location;

import android.os.Parcel;
import android.util.Printer;
import android.os.Bundle;
import android.os.Parcelable;

public class Location implements Parcelable
{
    @NonNull
    public static final Creator<Location> CREATOR;
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;
    
    public Location(@Nullable final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    public Location(@NonNull final Location location) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(@NonNull final Location location) {
        throw new RuntimeException("Stub!");
    }
    
    public void reset() {
        throw new RuntimeException("Stub!");
    }
    
    public float distanceTo(@NonNull final Location dest) {
        throw new RuntimeException("Stub!");
    }
    
    public float bearingTo(@NonNull final Location dest) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String getProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public void setProvider(@Nullable final String provider) {
        throw new RuntimeException("Stub!");
    }
    
    public long getTime() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTime(final long timeMs) {
        throw new RuntimeException("Stub!");
    }
    
    public long getElapsedRealtimeNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public long getElapsedRealtimeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getElapsedRealtimeAgeMillis() {
        throw new RuntimeException("Stub!");
    }
    
    public long getElapsedRealtimeAgeMillis(final long referenceRealtimeMs) {
        throw new RuntimeException("Stub!");
    }
    
    public void setElapsedRealtimeNanos(final long elapsedRealtimeNs) {
        throw new RuntimeException("Stub!");
    }
    
    public double getElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public void setElapsedRealtimeUncertaintyNanos(final double elapsedRealtimeUncertaintyNs) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeElapsedRealtimeUncertaintyNanos() {
        throw new RuntimeException("Stub!");
    }
    
    public double getLatitude() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLatitude(final double latitudeDegrees) {
        throw new RuntimeException("Stub!");
    }
    
    public double getLongitude() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLongitude(final double longitudeDegrees) {
        throw new RuntimeException("Stub!");
    }
    
    public float getAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccuracy(final float horizontalAccuracyMeters) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public double getAltitude() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAltitude(final double altitudeMeters) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAltitude() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAltitude() {
        throw new RuntimeException("Stub!");
    }
    
    public float getVerticalAccuracyMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public void setVerticalAccuracyMeters(final float altitudeAccuracyMeters) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasVerticalAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeVerticalAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public float getSpeed() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSpeed(final float speedMetersPerSecond) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSpeed() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSpeed() {
        throw new RuntimeException("Stub!");
    }
    
    public float getSpeedAccuracyMetersPerSecond() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSpeedAccuracyMetersPerSecond(final float speedAccuracyMeterPerSecond) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSpeedAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeSpeedAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public float getBearing() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBearing(final float bearingDegrees) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBearing() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeBearing() {
        throw new RuntimeException("Stub!");
    }
    
    public float getBearingAccuracyDegrees() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBearingAccuracyDegrees(final float bearingAccuracyDegrees) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasBearingAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeBearingAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public double getMslAltitudeMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMslAltitudeMeters(final double mslAltitudeMeters) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMslAltitude() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeMslAltitude() {
        throw new RuntimeException("Stub!");
    }
    
    public float getMslAltitudeAccuracyMeters() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMslAltitudeAccuracyMeters(final float mslAltitudeAccuracyMeters) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMslAltitudeAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    public void removeMslAltitudeAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isFromMockProvider() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isMock() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMock(final boolean mock) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    public void setExtras(@Nullable final Bundle extras) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isComplete() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dump(@NonNull final Printer pw, @Nullable final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static String convert(final double coordinate, final int outputType) {
        throw new RuntimeException("Stub!");
    }
    
    public static double convert(@NonNull final String coordinate) {
        throw new RuntimeException("Stub!");
    }
    
    public static void distanceBetween(final double startLatitude, final double startLongitude, final double endLatitude, final double endLongitude, final float[] results) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
