package android.content;

import android.os.Bundle;
import android.accounts.Account;
import android.os.IBinder;

public abstract class AbstractThreadedSyncAdapter
{
    @Deprecated
    public static final int LOG_SYNC_DETAILS = 2743;
    
    public AbstractThreadedSyncAdapter(final Context context, final boolean autoInitialize) {
        throw new RuntimeException("Stub!");
    }
    
    public AbstractThreadedSyncAdapter(final Context context, final boolean autoInitialize, final boolean allowParallelSyncs) {
        throw new RuntimeException("Stub!");
    }
    
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    public final IBinder getSyncAdapterBinder() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onUnsyncableAccount() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onPerformSync(final Account p0, final Bundle p1, final String p2, final ContentProviderClient p3, final SyncResult p4);
    
    public void onSecurityException(final Account account, final Bundle extras, final String authority, final SyncResult syncResult) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSyncCanceled() {
        throw new RuntimeException("Stub!");
    }
    
    public void onSyncCanceled(final Thread thread) {
        throw new RuntimeException("Stub!");
    }
}
