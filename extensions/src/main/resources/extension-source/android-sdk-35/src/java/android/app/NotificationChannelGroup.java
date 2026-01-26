package android.app;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;

public final class NotificationChannelGroup implements Parcelable
{
    @NonNull
    public static final Creator<NotificationChannelGroup> CREATOR;
    
    public NotificationChannelGroup(final String id, final CharSequence name) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public String getId() {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getName() {
        throw new RuntimeException("Stub!");
    }
    
    public String getDescription() {
        throw new RuntimeException("Stub!");
    }
    
    public List<NotificationChannel> getChannels() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isBlocked() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDescription(final String description) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
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
    
    public NotificationChannelGroup clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
