package android.service.notification;

import android.os.IBinder;
import android.content.Intent;
import android.content.ComponentName;
import android.net.Uri;
import android.app.Service;

@Deprecated
public abstract class ConditionProviderService extends Service
{
    @Deprecated
    public static final String EXTRA_RULE_ID = "android.service.notification.extra.RULE_ID";
    @Deprecated
    public static final String META_DATA_CONFIGURATION_ACTIVITY = "android.service.zen.automatic.configurationActivity";
    @Deprecated
    public static final String META_DATA_RULE_INSTANCE_LIMIT = "android.service.zen.automatic.ruleInstanceLimit";
    @Deprecated
    public static final String META_DATA_RULE_TYPE = "android.service.zen.automatic.ruleType";
    @Deprecated
    public static final String SERVICE_INTERFACE = "android.service.notification.ConditionProviderService";
    
    @Deprecated
    public ConditionProviderService() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void onConnected();
    
    @Deprecated
    public void onRequestConditions(final int relevance) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract void onSubscribe(final Uri p0);
    
    @Deprecated
    public abstract void onUnsubscribe(final Uri p0);
    
    @Deprecated
    public static final void requestRebind(final ComponentName componentName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void requestUnbind() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void notifyCondition(final Condition condition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void notifyConditions(final Condition... conditions) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
}
