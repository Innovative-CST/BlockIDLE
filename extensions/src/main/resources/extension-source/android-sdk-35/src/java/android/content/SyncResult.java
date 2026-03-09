package android.content;

import android.os.Parcel;
import android.os.Parcelable;

public final class SyncResult implements Parcelable
{
    public static final SyncResult ALREADY_IN_PROGRESS;
    @NonNull
    public static final Creator<SyncResult> CREATOR;
    public boolean databaseError;
    public long delayUntil;
    public boolean fullSyncRequested;
    public boolean moreRecordsToGet;
    public boolean partialSyncUnavailable;
    public final SyncStats stats;
    public final boolean syncAlreadyInProgress;
    public boolean tooManyDeletions;
    public boolean tooManyRetries;
    
    public SyncResult() {
        this.stats = null;
        this.syncAlreadyInProgress = false;
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasHardError() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasSoftError() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasError() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean madeSomeProgress() {
        throw new RuntimeException("Stub!");
    }
    
    public void clear() {
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
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    public String toDebugString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        ALREADY_IN_PROGRESS = null;
        CREATOR = null;
    }
}
