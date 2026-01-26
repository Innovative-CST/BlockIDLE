package android.speech.tts;

import android.os.Parcel;
import java.util.Set;
import java.util.Locale;
import android.os.Parcelable;

public class Voice implements Parcelable
{
    @NonNull
    public static final Creator<Voice> CREATOR;
    public static final int LATENCY_HIGH = 400;
    public static final int LATENCY_LOW = 200;
    public static final int LATENCY_NORMAL = 300;
    public static final int LATENCY_VERY_HIGH = 500;
    public static final int LATENCY_VERY_LOW = 100;
    public static final int QUALITY_HIGH = 400;
    public static final int QUALITY_LOW = 200;
    public static final int QUALITY_NORMAL = 300;
    public static final int QUALITY_VERY_HIGH = 500;
    public static final int QUALITY_VERY_LOW = 100;
    
    public Voice(final String name, final Locale locale, final int quality, final int latency, final boolean requiresNetworkConnection, final Set<String> features) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public Locale getLocale() {
        throw new RuntimeException("Stub!");
    }
    
    public int getQuality() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLatency() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isNetworkConnectionRequired() {
        throw new RuntimeException("Stub!");
    }
    
    public String getName() {
        throw new RuntimeException("Stub!");
    }
    
    public Set<String> getFeatures() {
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
    public boolean equals(@Nullable final Object obj) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
