package android.app;

import android.view.MenuItem;
import android.view.View;
import android.content.Context;
import android.view.ActionProvider;

public class MediaRouteActionProvider extends ActionProvider
{
    public MediaRouteActionProvider(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setRouteTypes(final int types) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExtendedSettingsClickListener(final View.OnClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View onCreateActionView() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View onCreateActionView(final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onPerformDefaultAction() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean overridesItemVisibility() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isVisible() {
        throw new RuntimeException("Stub!");
    }
}
