package android.adservices.common;

import android.os.Parcel;
import java.time.Duration;
import android.os.Parcelable;

public final class KeyedFrequencyCap implements Parcelable
{
    @NonNull
    public static final Creator<KeyedFrequencyCap> CREATOR;
    
    KeyedFrequencyCap() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int getAdCounterKey() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxCount() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Duration getInterval() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static final class Builder
    {
        public Builder(final int adCounterKey, final int maxCount, @NonNull final Duration interval) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setAdCounterKey(final int adCounterKey) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setMaxCount(final int maxCount) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setInterval(@NonNull final Duration interval) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public KeyedFrequencyCap build() {
            throw new RuntimeException("Stub!");
        }
    }
}
