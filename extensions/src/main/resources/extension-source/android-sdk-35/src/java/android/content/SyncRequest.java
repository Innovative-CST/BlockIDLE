package android.content;

import android.os.Bundle;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;

public class SyncRequest implements Parcelable
{
    @NonNull
    public static final Creator<SyncRequest> CREATOR;
    
    SyncRequest() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel parcel, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class Builder
    {
        public Builder() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder syncOnce() {
            throw new RuntimeException("Stub!");
        }
        
        public Builder syncPeriodic(final long pollFrequency, final long beforeSeconds) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setDisallowMetered(final boolean disallow) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setRequiresCharging(final boolean requiresCharging) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setSyncAdapter(final Account account, final String authority) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExtras(final Bundle bundle) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setNoRetry(final boolean noRetry) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setIgnoreSettings(final boolean ignoreSettings) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setIgnoreBackoff(final boolean ignoreBackoff) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setManual(final boolean isManual) {
            throw new RuntimeException("Stub!");
        }
        
        public Builder setExpedited(final boolean expedited) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Builder setScheduleAsExpeditedJob(final boolean scheduleAsExpeditedJob) {
            throw new RuntimeException("Stub!");
        }
        
        public SyncRequest build() {
            throw new RuntimeException("Stub!");
        }
    }
}
