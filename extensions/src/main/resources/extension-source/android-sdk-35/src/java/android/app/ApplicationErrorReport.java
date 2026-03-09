package android.app;

import android.util.Printer;
import android.os.Parcel;
import android.content.ComponentName;
import android.content.Context;
import android.os.Parcelable;

public class ApplicationErrorReport implements Parcelable
{
    @NonNull
    public static final Creator<ApplicationErrorReport> CREATOR;
    public static final int TYPE_ANR = 2;
    public static final int TYPE_BATTERY = 3;
    public static final int TYPE_CRASH = 1;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_RUNNING_SERVICE = 5;
    public AnrInfo anrInfo;
    public BatteryInfo batteryInfo;
    public CrashInfo crashInfo;
    public String installerPackageName;
    public String packageName;
    public String processName;
    public RunningServiceInfo runningServiceInfo;
    public boolean systemApp;
    public long time;
    public int type;
    
    public ApplicationErrorReport() {
        throw new RuntimeException("Stub!");
    }
    
    public static ComponentName getErrorReportReceiver(final Context context, final String packageName, final int appFlags) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void readFromParcel(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    public void dump(final Printer pw, final String prefix) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class AnrInfo
    {
        public String activity;
        public String cause;
        public String info;
        
        public AnrInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public AnrInfo(final Parcel in) {
            throw new RuntimeException("Stub!");
        }
        
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void dump(final Printer pw, final String prefix) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class BatteryInfo
    {
        public String checkinDetails;
        public long durationMicros;
        public String usageDetails;
        public int usagePercent;
        
        public BatteryInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public BatteryInfo(final Parcel in) {
            throw new RuntimeException("Stub!");
        }
        
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void dump(final Printer pw, final String prefix) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class CrashInfo
    {
        public String exceptionClassName;
        public String exceptionMessage;
        public String stackTrace;
        public String throwClassName;
        public String throwFileName;
        public int throwLineNumber;
        public String throwMethodName;
        
        public CrashInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public CrashInfo(final Throwable tr) {
            throw new RuntimeException("Stub!");
        }
        
        public CrashInfo(final Parcel in) {
            throw new RuntimeException("Stub!");
        }
        
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void dump(final Printer pw, final String prefix) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static class RunningServiceInfo
    {
        public long durationMillis;
        public String serviceDetails;
        
        public RunningServiceInfo() {
            throw new RuntimeException("Stub!");
        }
        
        public RunningServiceInfo(final Parcel in) {
            throw new RuntimeException("Stub!");
        }
        
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public void dump(final Printer pw, final String prefix) {
            throw new RuntimeException("Stub!");
        }
    }
}
