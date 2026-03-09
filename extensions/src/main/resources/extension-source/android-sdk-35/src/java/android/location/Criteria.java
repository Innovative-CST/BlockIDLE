package android.location;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public class Criteria implements Parcelable
{
    @Deprecated
    public static final int ACCURACY_COARSE = 2;
    @Deprecated
    public static final int ACCURACY_FINE = 1;
    @Deprecated
    public static final int ACCURACY_HIGH = 3;
    @Deprecated
    public static final int ACCURACY_LOW = 1;
    @Deprecated
    public static final int ACCURACY_MEDIUM = 2;
    @Deprecated
    @NonNull
    public static final Creator<Criteria> CREATOR;
    @Deprecated
    public static final int NO_REQUIREMENT = 0;
    @Deprecated
    public static final int POWER_HIGH = 3;
    @Deprecated
    public static final int POWER_LOW = 1;
    @Deprecated
    public static final int POWER_MEDIUM = 2;
    
    @Deprecated
    public Criteria() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Criteria(final Criteria criteria) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setHorizontalAccuracy(final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getHorizontalAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setVerticalAccuracy(final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getVerticalAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSpeedAccuracy(final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSpeedAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setBearingAccuracy(final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getBearingAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAccuracy(final int accuracy) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getAccuracy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPowerRequirement(final int powerRequirement) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPowerRequirement() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCostAllowed(final boolean costAllowed) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isCostAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAltitudeRequired(final boolean altitudeRequired) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isAltitudeRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSpeedRequired(final boolean speedRequired) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isSpeedRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setBearingRequired(final boolean bearingRequired) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isBearingRequired() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
