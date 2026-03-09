package android.app.usage;

import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.os.Parcel;
import android.os.Parcelable;

public final class UsageEvents implements Parcelable
{
    @NonNull
    public static final Creator<UsageEvents> CREATOR;
    
    UsageEvents() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasNextEvent() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getNextEvent(final Event eventOut) {
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
    
    public static final class Event
    {
        public static final int ACTIVITY_PAUSED = 2;
        public static final int ACTIVITY_RESUMED = 1;
        public static final int ACTIVITY_STOPPED = 23;
        public static final int CONFIGURATION_CHANGE = 5;
        public static final int DEVICE_SHUTDOWN = 26;
        public static final int DEVICE_STARTUP = 27;
        public static final int FOREGROUND_SERVICE_START = 19;
        public static final int FOREGROUND_SERVICE_STOP = 20;
        public static final int KEYGUARD_HIDDEN = 18;
        public static final int KEYGUARD_SHOWN = 17;
        @Deprecated
        public static final int MOVE_TO_BACKGROUND = 2;
        @Deprecated
        public static final int MOVE_TO_FOREGROUND = 1;
        public static final int NONE = 0;
        public static final int SCREEN_INTERACTIVE = 15;
        public static final int SCREEN_NON_INTERACTIVE = 16;
        public static final int SHORTCUT_INVOCATION = 8;
        public static final int STANDBY_BUCKET_CHANGED = 11;
        public static final int USER_INTERACTION = 7;
        
        public Event() {
            throw new RuntimeException("Stub!");
        }
        
        public String getPackageName() {
            throw new RuntimeException("Stub!");
        }
        
        public String getClassName() {
            throw new RuntimeException("Stub!");
        }
        
        public long getTimeStamp() {
            throw new RuntimeException("Stub!");
        }
        
        public int getEventType() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public PersistableBundle getExtras() {
            throw new RuntimeException("Stub!");
        }
        
        public Configuration getConfiguration() {
            throw new RuntimeException("Stub!");
        }
        
        public String getShortcutId() {
            throw new RuntimeException("Stub!");
        }
        
        public int getAppStandbyBucket() {
            throw new RuntimeException("Stub!");
        }
    }
}
