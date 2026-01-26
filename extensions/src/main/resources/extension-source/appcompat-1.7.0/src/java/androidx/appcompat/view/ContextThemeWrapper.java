package androidx.appcompat.view;

import androidx.annotation.RequiresApi;
import android.content.res.AssetManager;
import androidx.appcompat.R;
import android.os.Build;
import androidx.annotation.StyleRes;
import android.content.Context;
import android.view.LayoutInflater;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.content.ContextWrapper;

public class ContextThemeWrapper extends ContextWrapper
{
    private static Configuration sEmptyConfig;
    private int mThemeResource;
    private Resources.Theme mTheme;
    private LayoutInflater mInflater;
    private Configuration mOverrideConfiguration;
    private Resources mResources;
    
    public ContextThemeWrapper() {
        super((Context)null);
    }
    
    public ContextThemeWrapper(final Context base, @StyleRes final int themeResId) {
        super(base);
        this.mThemeResource = themeResId;
    }
    
    public ContextThemeWrapper(final Context base, final Resources.Theme theme) {
        super(base);
        this.mTheme = theme;
    }
    
    protected void attachBaseContext(final Context newBase) {
        super.attachBaseContext(newBase);
    }
    
    public void applyOverrideConfiguration(final Configuration overrideConfiguration) {
        if (this.mResources != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.mOverrideConfiguration != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.mOverrideConfiguration = new Configuration(overrideConfiguration);
    }
    
    public Resources getResources() {
        return this.getResourcesInternal();
    }
    
    private Resources getResourcesInternal() {
        if (this.mResources == null) {
            if (this.mOverrideConfiguration == null || (Build.VERSION.SDK_INT >= 26 && isEmptyConfiguration(this.mOverrideConfiguration))) {
                this.mResources = super.getResources();
            }
            else {
                final Context resContext = this.createConfigurationContext(this.mOverrideConfiguration);
                this.mResources = resContext.getResources();
            }
        }
        return this.mResources;
    }
    
    public void setTheme(final int resid) {
        if (this.mThemeResource != resid) {
            this.mThemeResource = resid;
            this.initializeTheme();
        }
    }
    
    public int getThemeResId() {
        return this.mThemeResource;
    }
    
    public Resources.Theme getTheme() {
        if (this.mTheme != null) {
            return this.mTheme;
        }
        if (this.mThemeResource == 0) {
            this.mThemeResource = R.style.Theme_AppCompat_Light;
        }
        this.initializeTheme();
        return this.mTheme;
    }
    
    public Object getSystemService(final String name) {
        if ("layout_inflater".equals((Object)name)) {
            if (this.mInflater == null) {
                this.mInflater = LayoutInflater.from(this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.mInflater;
        }
        return this.getBaseContext().getSystemService(name);
    }
    
    protected void onApplyThemeResource(final Resources.Theme theme, final int resid, final boolean first) {
        theme.applyStyle(resid, true);
    }
    
    private void initializeTheme() {
        final boolean first = this.mTheme == null;
        if (first) {
            this.mTheme = this.getResources().newTheme();
            final Resources.Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.mTheme.setTo(theme);
            }
        }
        this.onApplyThemeResource(this.mTheme, this.mThemeResource, first);
    }
    
    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }
    
    @RequiresApi(26)
    private static boolean isEmptyConfiguration(final Configuration overrideConfiguration) {
        if (overrideConfiguration == null) {
            return true;
        }
        if (ContextThemeWrapper.sEmptyConfig == null) {
            final Configuration emptyConfig = new Configuration();
            emptyConfig.fontScale = 0.0f;
            ContextThemeWrapper.sEmptyConfig = emptyConfig;
        }
        return overrideConfiguration.equals(ContextThemeWrapper.sEmptyConfig);
    }
}
