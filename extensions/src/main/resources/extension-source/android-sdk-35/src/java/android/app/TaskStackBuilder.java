package android.app;

import android.os.Bundle;
import android.content.ComponentName;
import android.content.Intent;
import android.content.Context;

public class TaskStackBuilder
{
    TaskStackBuilder() {
        throw new RuntimeException("Stub!");
    }
    
    public static TaskStackBuilder create(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public TaskStackBuilder addNextIntent(final Intent nextIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public TaskStackBuilder addNextIntentWithParentStack(final Intent nextIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public TaskStackBuilder addParentStack(final Activity sourceActivity) {
        throw new RuntimeException("Stub!");
    }
    
    public TaskStackBuilder addParentStack(final Class<?> sourceActivityClass) {
        throw new RuntimeException("Stub!");
    }
    
    public TaskStackBuilder addParentStack(final ComponentName sourceActivityName) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIntentCount() {
        throw new RuntimeException("Stub!");
    }
    
    public Intent editIntentAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void startActivities() {
        throw new RuntimeException("Stub!");
    }
    
    public void startActivities(final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    public PendingIntent getPendingIntent(final int requestCode, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public PendingIntent getPendingIntent(final int requestCode, final int flags, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Intent[] getIntents() {
        throw new RuntimeException("Stub!");
    }
}
