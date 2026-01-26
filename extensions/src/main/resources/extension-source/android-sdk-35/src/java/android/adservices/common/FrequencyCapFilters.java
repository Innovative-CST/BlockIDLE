package android.adservices.common;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class FrequencyCapFilters implements Parcelable
{
    public static final int AD_EVENT_TYPE_CLICK = 3;
    public static final int AD_EVENT_TYPE_IMPRESSION = 1;
    public static final int AD_EVENT_TYPE_VIEW = 2;
    public static final int AD_EVENT_TYPE_WIN = 0;
    @NonNull
    public static final Creator<FrequencyCapFilters> CREATOR;
    
    FrequencyCapFilters() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<KeyedFrequencyCap> getKeyedFrequencyCapsForWinEvents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<KeyedFrequencyCap> getKeyedFrequencyCapsForImpressionEvents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<KeyedFrequencyCap> getKeyedFrequencyCapsForViewEvents() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<KeyedFrequencyCap> getKeyedFrequencyCapsForClickEvents() {
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
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyedFrequencyCapsForWinEvents(@NonNull final List<KeyedFrequencyCap> keyedFrequencyCapsForWinEvents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyedFrequencyCapsForImpressionEvents(@NonNull final List<KeyedFrequencyCap> keyedFrequencyCapsForImpressionEvents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyedFrequencyCapsForViewEvents(@NonNull final List<KeyedFrequencyCap> keyedFrequencyCapsForViewEvents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setKeyedFrequencyCapsForClickEvents(@NonNull final List<KeyedFrequencyCap> keyedFrequencyCapsForClickEvents) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public FrequencyCapFilters build() {
            throw new RuntimeException("Stub!");
        }
    }
}
