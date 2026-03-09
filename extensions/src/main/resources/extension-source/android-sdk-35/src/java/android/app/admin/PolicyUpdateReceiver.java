package android.app.admin;

import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public abstract class PolicyUpdateReceiver extends BroadcastReceiver
{
    public static final String ACTION_DEVICE_POLICY_CHANGED = "android.app.admin.action.DEVICE_POLICY_CHANGED";
    public static final String ACTION_DEVICE_POLICY_SET_RESULT = "android.app.admin.action.DEVICE_POLICY_SET_RESULT";
    public static final String EXTRA_ACCOUNT_TYPE = "android.app.admin.extra.ACCOUNT_TYPE";
    public static final String EXTRA_INTENT_FILTER = "android.app.admin.extra.INTENT_FILTER";
    public static final String EXTRA_PACKAGE_NAME = "android.app.admin.extra.PACKAGE_NAME";
    public static final String EXTRA_PERMISSION_NAME = "android.app.admin.extra.PERMISSION_NAME";
    
    public PolicyUpdateReceiver() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void onReceive(final Context context, final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPolicySetResult(@NonNull final Context context, @NonNull final String policyIdentifier, @NonNull final Bundle additionalPolicyParams, @NonNull final TargetUser targetUser, @NonNull final PolicyUpdateResult policyUpdateResult) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPolicyChanged(@NonNull final Context context, @NonNull final String policyIdentifier, @NonNull final Bundle additionalPolicyParams, @NonNull final TargetUser targetUser, @NonNull final PolicyUpdateResult policyUpdateResult) {
        throw new RuntimeException("Stub!");
    }
}
