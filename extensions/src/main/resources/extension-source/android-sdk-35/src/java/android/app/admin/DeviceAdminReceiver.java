package android.app.admin;

import android.os.PersistableBundle;
import android.net.Uri;
import android.os.UserHandle;
import android.content.Intent;
import android.content.ComponentName;
import android.content.Context;
import android.content.BroadcastReceiver;

public class DeviceAdminReceiver extends BroadcastReceiver
{
    public static final String ACTION_CHOOSE_PRIVATE_KEY_ALIAS = "android.app.action.CHOOSE_PRIVATE_KEY_ALIAS";
    public static final String ACTION_DEVICE_ADMIN_DISABLED = "android.app.action.DEVICE_ADMIN_DISABLED";
    public static final String ACTION_DEVICE_ADMIN_DISABLE_REQUESTED = "android.app.action.DEVICE_ADMIN_DISABLE_REQUESTED";
    public static final String ACTION_DEVICE_ADMIN_ENABLED = "android.app.action.DEVICE_ADMIN_ENABLED";
    public static final String ACTION_LOCK_TASK_ENTERING = "android.app.action.LOCK_TASK_ENTERING";
    public static final String ACTION_LOCK_TASK_EXITING = "android.app.action.LOCK_TASK_EXITING";
    public static final String ACTION_NETWORK_LOGS_AVAILABLE = "android.app.action.NETWORK_LOGS_AVAILABLE";
    public static final String ACTION_PASSWORD_CHANGED = "android.app.action.ACTION_PASSWORD_CHANGED";
    public static final String ACTION_PASSWORD_EXPIRING = "android.app.action.ACTION_PASSWORD_EXPIRING";
    public static final String ACTION_PASSWORD_FAILED = "android.app.action.ACTION_PASSWORD_FAILED";
    public static final String ACTION_PASSWORD_SUCCEEDED = "android.app.action.ACTION_PASSWORD_SUCCEEDED";
    public static final String ACTION_PROFILE_PROVISIONING_COMPLETE = "android.app.action.PROFILE_PROVISIONING_COMPLETE";
    public static final String ACTION_SECURITY_LOGS_AVAILABLE = "android.app.action.SECURITY_LOGS_AVAILABLE";
    public static final int BUGREPORT_FAILURE_FAILED_COMPLETING = 0;
    public static final int BUGREPORT_FAILURE_FILE_NO_LONGER_AVAILABLE = 1;
    public static final String DEVICE_ADMIN_META_DATA = "android.app.device_admin";
    public static final String EXTRA_DISABLE_WARNING = "android.app.extra.DISABLE_WARNING";
    public static final String EXTRA_LOCK_TASK_PACKAGE = "android.app.extra.LOCK_TASK_PACKAGE";
    public static final String EXTRA_TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE = "android.app.extra.TRANSFER_OWNERSHIP_ADMIN_EXTRAS_BUNDLE";
    
    public DeviceAdminReceiver() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public DevicePolicyManager getManager(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ComponentName getWho(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void onEnabled(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public CharSequence onDisableRequested(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDisabled(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPasswordChanged(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPasswordChanged(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPasswordFailed(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPasswordFailed(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPasswordSucceeded(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPasswordSucceeded(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPasswordExpiring(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPasswordExpiring(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public void onProfileProvisioningComplete(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onReadyForUserInitialization(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onLockTaskModeEntering(@NonNull final Context context, @NonNull final Intent intent, @NonNull final String pkg) {
        throw new RuntimeException("Stub!");
    }
    
    public void onLockTaskModeExiting(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public String onChoosePrivateKeyAlias(@NonNull final Context context, @NonNull final Intent intent, final int uid, @Nullable final Uri uri, @Nullable final String alias) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSystemUpdatePending(@NonNull final Context context, @NonNull final Intent intent, final long receivedTime) {
        throw new RuntimeException("Stub!");
    }
    
    public void onBugreportSharingDeclined(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onBugreportShared(@NonNull final Context context, @NonNull final Intent intent, @NonNull final String bugreportHash) {
        throw new RuntimeException("Stub!");
    }
    
    public void onBugreportFailed(@NonNull final Context context, @NonNull final Intent intent, final int failureCode) {
        throw new RuntimeException("Stub!");
    }
    
    public void onSecurityLogsAvailable(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onNetworkLogsAvailable(@NonNull final Context context, @NonNull final Intent intent, final long batchToken, final int networkLogsCount) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUserAdded(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle addedUser) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUserRemoved(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle removedUser) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUserStarted(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle startedUser) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUserStopped(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle stoppedUser) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUserSwitched(@NonNull final Context context, @NonNull final Intent intent, @NonNull final UserHandle switchedUser) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTransferOwnershipComplete(@NonNull final Context context, @Nullable final PersistableBundle bundle) {
        throw new RuntimeException("Stub!");
    }
    
    public void onTransferAffiliatedProfileOwnershipComplete(@NonNull final Context context, @NonNull final UserHandle user) {
        throw new RuntimeException("Stub!");
    }
    
    public void onOperationSafetyStateChanged(@NonNull final Context context, final int reason, final boolean isSafe) {
        throw new RuntimeException("Stub!");
    }
    
    public void onComplianceAcknowledgementRequired(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onReceive(@NonNull final Context context, @NonNull final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
