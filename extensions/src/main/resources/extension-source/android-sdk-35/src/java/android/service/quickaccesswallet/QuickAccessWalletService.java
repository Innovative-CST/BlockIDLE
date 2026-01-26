package android.service.quickaccesswallet;

import android.app.PendingIntent;
import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class QuickAccessWalletService extends Service
{
    public static final String ACTION_VIEW_WALLET = "android.service.quickaccesswallet.action.VIEW_WALLET";
    public static final String ACTION_VIEW_WALLET_SETTINGS = "android.service.quickaccesswallet.action.VIEW_WALLET_SETTINGS";
    public static final String SERVICE_INTERFACE = "android.service.quickaccesswallet.QuickAccessWalletService";
    public static final String SERVICE_META_DATA = "android.quickaccesswallet";
    
    public QuickAccessWalletService() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public IBinder onBind(@NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void onWalletCardsRequested(@NonNull final GetWalletCardsRequest p0, @NonNull final GetWalletCardsCallback p1);
    
    public abstract void onWalletCardSelected(@NonNull final SelectWalletCardRequest p0);
    
    public abstract void onWalletDismissed();
    
    public final void sendWalletServiceEvent(@NonNull final WalletServiceEvent serviceEvent) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PendingIntent getTargetActivityPendingIntent() {
        throw new RuntimeException("Stub!");
    }
}
