package android.app.admin;

import android.os.Parcel;
import java.util.List;
import android.os.Parcelable;

public final class SystemUpdatePolicy implements Parcelable
{
    @NonNull
    public static final Creator<SystemUpdatePolicy> CREATOR;
    public static final int TYPE_INSTALL_AUTOMATIC = 1;
    public static final int TYPE_INSTALL_WINDOWED = 2;
    public static final int TYPE_POSTPONE = 3;
    
    SystemUpdatePolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public static SystemUpdatePolicy createAutomaticInstallPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public static SystemUpdatePolicy createWindowedInstallPolicy(final int startTime, final int endTime) {
        throw new RuntimeException("Stub!");
    }
    
    public static SystemUpdatePolicy createPostponeInstallPolicy() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPolicyType() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInstallWindowStart() {
        throw new RuntimeException("Stub!");
    }
    
    public int getInstallWindowEnd() {
        throw new RuntimeException("Stub!");
    }
    
    public SystemUpdatePolicy setFreezePeriods(final List<FreezePeriod> freezePeriods) {
        throw new RuntimeException("Stub!");
    }
    
    public List<FreezePeriod> getFreezePeriods() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
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
    
    public static final class ValidationFailedException extends IllegalArgumentException implements Parcelable
    {
        @NonNull
        public static final Creator<ValidationFailedException> CREATOR;
        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_CLOSE = 6;
        public static final int ERROR_COMBINED_FREEZE_PERIOD_TOO_LONG = 5;
        public static final int ERROR_DUPLICATE_OR_OVERLAP = 2;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_CLOSE = 4;
        public static final int ERROR_NEW_FREEZE_PERIOD_TOO_LONG = 3;
        public static final int ERROR_UNKNOWN = 1;
        
        ValidationFailedException() {
            throw new RuntimeException("Stub!");
        }
        
        public int getErrorCode() {
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
}
