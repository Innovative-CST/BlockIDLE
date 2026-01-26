package android.service.quicksettings;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.app.PendingIntent;
import android.content.Intent;
import android.app.Dialog;
import android.app.Service;

public class TileService extends Service
{
    public static final String ACTION_QS_TILE = "android.service.quicksettings.action.QS_TILE";
    public static final String ACTION_QS_TILE_PREFERENCES = "android.service.quicksettings.action.QS_TILE_PREFERENCES";
    public static final String META_DATA_ACTIVE_TILE = "android.service.quicksettings.ACTIVE_TILE";
    public static final String META_DATA_TOGGLEABLE_TILE = "android.service.quicksettings.TOGGLEABLE_TILE";
    
    public TileService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    public void onTileAdded() {
        throw new RuntimeException("Stub!");
    }
    
    public void onTileRemoved() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStartListening() {
        throw new RuntimeException("Stub!");
    }
    
    public void onStopListening() {
        throw new RuntimeException("Stub!");
    }
    
    public void onClick() {
        throw new RuntimeException("Stub!");
    }
    
    public final void showDialog(final Dialog dialog) {
        throw new RuntimeException("Stub!");
    }
    
    public final void unlockAndRun(final Runnable runnable) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isSecure() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isLocked() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void startActivityAndCollapse(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public final void startActivityAndCollapse(@NonNull final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public final Tile getQsTile() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public static final void requestListeningState(final Context context, final ComponentName component) {
        throw new RuntimeException("Stub!");
    }
}
