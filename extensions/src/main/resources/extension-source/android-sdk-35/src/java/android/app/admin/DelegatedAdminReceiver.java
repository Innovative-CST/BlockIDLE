package android.app.admin;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class DelegatedAdminReceiver extends BroadcastReceiver
{
    public DelegatedAdminReceiver() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String onChoosePrivateKeyAlias(@NonNull final Context context, @NonNull final Intent intent, final int uid, @Nullable final Uri uri, @Nullable final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNetworkLogsAvailable(@NonNull final Context context, @NonNull final Intent intent, final long batchToken, final int networkLogsCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSecurityLogsAvailable(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
