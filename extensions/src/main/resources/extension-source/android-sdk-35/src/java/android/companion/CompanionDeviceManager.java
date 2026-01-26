package android.companion;

import android.os.OutcomeReceiver;
import java.io.OutputStream;
import java.io.InputStream;
import android.content.ComponentName;
import java.util.List;
import android.content.IntentSender;
import java.util.concurrent.Executor;
import android.os.Handler;

public final class CompanionDeviceManager
{
    public static final String EXTRA_ASSOCIATION = "android.companion.extra.ASSOCIATION";
    @Deprecated
    public static final String EXTRA_DEVICE = "android.companion.extra.DEVICE";
    public static final int FLAG_CALL_METADATA = 1;
    public static final int RESULT_CANCELED = 0;
    public static final int RESULT_DISCOVERY_TIMEOUT = 2;
    public static final int RESULT_INTERNAL_ERROR = 3;
    public static final int RESULT_OK = -1;
    public static final int RESULT_USER_REJECTED = 1;
    
    CompanionDeviceManager() {
        throw new RuntimeException("Stub!");
    }
    
    public void associate(@NonNull final AssociationRequest request, @NonNull final Callback callback, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public void associate(@NonNull final AssociationRequest request, @NonNull final Executor executor, @NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IntentSender buildAssociationCancellationIntent() {
        throw new RuntimeException("Stub!");
    }
    
    public void enableSystemDataSyncForTypes(final int associationId, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public void disableSystemDataSyncForTypes(final int associationId, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public List<String> getAssociations() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public List<AssociationInfo> getMyAssociations() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void disassociate(@NonNull final String deviceMacAddress) {
        throw new RuntimeException("Stub!");
    }
    
    public void disassociate(final int associationId) {
        throw new RuntimeException("Stub!");
    }
    
    public void requestNotificationAccess(final ComponentName component) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasNotificationAccess(final ComponentName component) {
        throw new RuntimeException("Stub!");
    }
    
    public void startObservingDevicePresence(@NonNull final String deviceAddress) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    public void stopObservingDevicePresence(@NonNull final String deviceAddress) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    public void attachSystemDataTransport(final int associationId, @NonNull final InputStream in, @NonNull final OutputStream out) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    public void detachSystemDataTransport(final int associationId) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public IntentSender buildPermissionTransferUserConsentIntent(final int associationId) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isPermissionTransferUserConsented(final int associationId) {
        throw new RuntimeException("Stub!");
    }
    
    public void startSystemDataTransfer(final int associationId, @NonNull final Executor executor, @NonNull final OutcomeReceiver<Void, CompanionException> result) throws DeviceNotAssociatedException {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onDeviceFound(@NonNull final IntentSender intentSender) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAssociationPending(@NonNull final IntentSender intentSender) {
            throw new RuntimeException("Stub!");
        }
        
        public void onAssociationCreated(@NonNull final AssociationInfo associationInfo) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract void onFailure(@Nullable final CharSequence p0);
    }
}
