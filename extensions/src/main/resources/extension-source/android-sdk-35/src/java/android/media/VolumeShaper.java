package android.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class VolumeShaper implements AutoCloseable
{
    VolumeShaper() {
        throw new RuntimeException("Stub!");
    }
    
    public void apply(@NonNull final Operation operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void replace(@NonNull final Configuration configuration, @NonNull final Operation operation, final boolean join) {
        throw new RuntimeException("Stub!");
    }
    
    public float getVolume() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void close() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void finalize() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class Configuration implements Parcelable
    {
        @NonNull
        public static final Creator<Configuration> CREATOR;
        public static final Configuration CUBIC_RAMP;
        public static final int INTERPOLATOR_TYPE_CUBIC = 2;
        public static final int INTERPOLATOR_TYPE_CUBIC_MONOTONIC = 3;
        public static final int INTERPOLATOR_TYPE_LINEAR = 1;
        public static final int INTERPOLATOR_TYPE_STEP = 0;
        public static final Configuration LINEAR_RAMP;
        public static final Configuration SCURVE_RAMP;
        public static final Configuration SINE_RAMP;
        
        Configuration() {
            throw new RuntimeException("Stub!");
        }
        
        public static int getMaximumCurvePoints() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public int getInterpolatorType() {
            throw new RuntimeException("Stub!");
        }
        
        public long getDuration() {
            throw new RuntimeException("Stub!");
        }
        
        public float[] getTimes() {
            throw new RuntimeException("Stub!");
        }
        
        public float[] getVolumes() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
            CUBIC_RAMP = null;
            LINEAR_RAMP = null;
            SCURVE_RAMP = null;
            SINE_RAMP = null;
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            public Builder(@NonNull final Configuration configuration) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setInterpolatorType(final int interpolatorType) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setDuration(final long durationMillis) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setCurve(@NonNull final float[] times, @NonNull final float[] volumes) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder reflectTimes() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder invertVolumes() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder scaleToEndVolume(final float volume) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder scaleToStartVolume(final float volume) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Configuration build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class Operation implements Parcelable
    {
        @NonNull
        public static final Creator<Operation> CREATOR;
        public static final Operation PLAY;
        public static final Operation REVERSE;
        
        Operation() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public String toString() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int hashCode() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean equals(final Object o) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
            PLAY = null;
            REVERSE = null;
        }
    }
}
