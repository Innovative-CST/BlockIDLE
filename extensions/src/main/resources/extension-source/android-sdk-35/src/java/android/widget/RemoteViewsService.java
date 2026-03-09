package android.widget;

import android.os.IBinder;
import android.content.Intent;
import android.app.Service;

public abstract class RemoteViewsService extends Service
{
    public RemoteViewsService() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public IBinder onBind(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract RemoteViewsFactory onGetViewFactory(final Intent p0);
    
    public interface RemoteViewsFactory
    {
        void onCreate();
        
        void onDataSetChanged();
        
        void onDestroy();
        
        int getCount();
        
        RemoteViews getViewAt(final int p0);
        
        RemoteViews getLoadingView();
        
        int getViewTypeCount();
        
        long getItemId(final int p0);
        
        boolean hasStableIds();
    }
}
