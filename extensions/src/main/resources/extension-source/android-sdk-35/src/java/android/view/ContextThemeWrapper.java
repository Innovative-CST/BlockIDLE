package android.view;

import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.Context;
import android.content.ContextWrapper;

public class ContextThemeWrapper extends ContextWrapper
{
    public ContextThemeWrapper() {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ContextThemeWrapper(final Context base, final int themeResId) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ContextThemeWrapper(final Context base, final Resources.Theme theme) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void attachBaseContext(final Context newBase) {
        throw new RuntimeException("Stub!");
    }
    
    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AssetManager getAssets() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Resources getResources() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTheme(final int resid) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTheme(@Nullable final Resources.Theme theme) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Resources.Theme getTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Object getSystemService(final String name) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onApplyThemeResource(final Resources.Theme theme, final int resId, final boolean first) {
        throw new RuntimeException("Stub!");
    }
}
