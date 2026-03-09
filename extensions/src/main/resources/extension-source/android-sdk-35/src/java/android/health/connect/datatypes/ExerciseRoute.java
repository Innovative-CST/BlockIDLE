package android.health.connect.datatypes;

import android.health.connect.datatypes.units.Length;
import java.time.Instant;
import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class ExerciseRoute implements Parcelable
{
    @NonNull
    public static final Creator<ExerciseRoute> CREATOR;
    
    public ExerciseRoute(@NonNull final List<Location> routeLocations) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<Location> getRouteLocations() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean equals(final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Location implements Parcelable
    {
        @NonNull
        public static final Creator<Location> CREATOR;
        
        Location() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Instant getTime() {
            throw new RuntimeException("Stub!");
        }
        
        public double getLongitude() {
            throw new RuntimeException("Stub!");
        }
        
        public double getLatitude() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Length getHorizontalAccuracy() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Length getVerticalAccuracy() {
            throw new RuntimeException("Stub!");
        }
        
        @Nullable
        public Length getAltitude() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final Instant time, final double latitude, final double longitude) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setHorizontalAccuracy(@NonNull final Length horizontalAccuracy) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setVerticalAccuracy(@NonNull final Length verticalAccuracy) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setAltitude(@NonNull final Length altitude) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Location build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
}
