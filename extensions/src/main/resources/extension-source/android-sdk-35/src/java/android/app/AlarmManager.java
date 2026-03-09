package android.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.Executor;
import android.os.Handler;

public class AlarmManager
{
    public static final String ACTION_NEXT_ALARM_CLOCK_CHANGED = "android.app.action.NEXT_ALARM_CLOCK_CHANGED";
    public static final String ACTION_SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED = "android.app.action.SCHEDULE_EXACT_ALARM_PERMISSION_STATE_CHANGED";
    public static final int ELAPSED_REALTIME = 3;
    public static final int ELAPSED_REALTIME_WAKEUP = 2;
    public static final long INTERVAL_DAY = 86400000L;
    public static final long INTERVAL_FIFTEEN_MINUTES = 900000L;
    public static final long INTERVAL_HALF_DAY = 43200000L;
    public static final long INTERVAL_HALF_HOUR = 1800000L;
    public static final long INTERVAL_HOUR = 3600000L;
    public static final int RTC = 1;
    public static final int RTC_WAKEUP = 0;
    
    AlarmManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final int type, final long triggerAtMillis, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void set(final int type, final long triggerAtMillis, @Nullable final String tag, @NonNull final OnAlarmListener listener, @Nullable final Handler targetHandler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRepeating(final int type, final long triggerAtMillis, final long intervalMillis, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindow(final int type, final long windowStartMillis, final long windowLengthMillis, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindow(final int type, final long windowStartMillis, final long windowLengthMillis, @Nullable final String tag, @NonNull final OnAlarmListener listener, @Nullable final Handler targetHandler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindow(final int type, final long windowStartMillis, final long windowLengthMillis, @Nullable final String tag, @NonNull final Executor executor, @NonNull final OnAlarmListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExact(final int type, final long triggerAtMillis, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExact(final int type, final long triggerAtMillis, @Nullable final String tag, @NonNull final OnAlarmListener listener, @Nullable final Handler targetHandler) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAlarmClock(@NonNull final AlarmClockInfo info, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInexactRepeating(final int type, final long triggerAtMillis, final long intervalMillis, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAndAllowWhileIdle(final int type, final long triggerAtMillis, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExactAndAllowWhileIdle(final int type, final long triggerAtMillis, @NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel(@NonNull final PendingIntent operation) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel(@NonNull final OnAlarmListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelAll() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTime(final long millis) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTimeZone(final String timeZone) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canScheduleExactAlarms() {
        throw new RuntimeException("Stub!");
    }
    
    public AlarmClockInfo getNextAlarmClock() {
        throw new RuntimeException("Stub!");
    }
    
    public static final class AlarmClockInfo implements Parcelable
    {
        @NonNull
        public static final Creator<AlarmClockInfo> CREATOR;
        
        public AlarmClockInfo(final long triggerTime, final PendingIntent showIntent) {
            throw new RuntimeException("Stub!");
        }
        
        public long getTriggerTime() {
            throw new RuntimeException("Stub!");
        }
        
        public PendingIntent getShowIntent() {
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
    
    public interface OnAlarmListener
    {
        void onAlarm();
    }
}
