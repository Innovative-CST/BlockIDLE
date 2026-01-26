package android.appwidget;

import android.os.Bundle;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class AppWidgetProvider extends BroadcastReceiver
{
    public AppWidgetProvider() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onReceive(final Context context, final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] appWidgetIds) {
        throw new RuntimeException("Stub!");
    }
    
    public void onAppWidgetOptionsChanged(final Context context, final AppWidgetManager appWidgetManager, final int appWidgetId, final Bundle newOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDeleted(final Context context, final int[] appWidgetIds) {
        throw new RuntimeException("Stub!");
    }
    
    public void onEnabled(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void onDisabled(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void onRestored(final Context context, final int[] oldWidgetIds, final int[] newWidgetIds) {
        throw new RuntimeException("Stub!");
    }
}
