package android.app.usage;

import android.os.Parcel;
import android.content.res.Configuration;
import android.os.Parcelable;

public final class ConfigurationStats implements Parcelable
{
    @NonNull
    public static final Creator<ConfigurationStats> CREATOR;
    
    public ConfigurationStats(final ConfigurationStats stats) {
        throw new RuntimeException("Stub!");
    }
    
    public Configuration getConfiguration() {
        throw new RuntimeException("Stub!");
    }
    
    public long getFirstTimeStamp() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastTimeStamp() {
        throw new RuntimeException("Stub!");
    }
    
    public long getLastTimeActive() {
        throw new RuntimeException("Stub!");
    }
    
    public long getTotalTimeActive() {
        throw new RuntimeException("Stub!");
    }
    
    public int getActivationCount() {
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
    }
}
