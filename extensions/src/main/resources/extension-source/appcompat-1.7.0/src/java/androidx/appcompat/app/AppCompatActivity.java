package androidx.appcompat.app;

import androidx.core.os.LocaleListCompat;
import android.view.Window;
import android.os.Build;
import androidx.appcompat.widget.VectorEnabledTintResources;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.core.app.NavUtils;
import android.content.Intent;
import androidx.core.app.ActivityCompat;
import android.app.Activity;
import androidx.annotation.CallSuper;
import androidx.appcompat.view.ActionMode;
import android.view.MenuItem;
import androidx.annotation.IdRes;
import android.util.DisplayMetrics;
import android.content.res.Configuration;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import android.view.ViewGroup;
import android.view.View;
import android.view.MenuInflater;
import androidx.appcompat.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;
import androidx.annotation.ContentView;
import androidx.annotation.LayoutRes;
import android.content.res.Resources;
import androidx.core.app.TaskStackBuilder;
import androidx.fragment.app.FragmentActivity;

public class AppCompatActivity extends FragmentActivity implements AppCompatCallback, TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider
{
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AppCompatDelegate mDelegate;
    private Resources mResources;
    
    public AppCompatActivity() {
        this.initDelegate();
    }
    
    @ContentView
    public AppCompatActivity(@LayoutRes final int contentLayoutId) {
        super(contentLayoutId);
        this.initDelegate();
    }
    
    private void initDelegate() {
        this.getSavedStateRegistry().registerSavedStateProvider("androidx:appcompat", (SavedStateRegistry.SavedStateProvider)new SavedStateRegistry.SavedStateProvider() {
            @NonNull
            public Bundle saveState() {
                final Bundle outState = new Bundle();
                AppCompatActivity.this.getDelegate().onSaveInstanceState(outState);
                return outState;
            }
        });
        this.addOnContextAvailableListener((OnContextAvailableListener)new OnContextAvailableListener() {
            public void onContextAvailable(@NonNull final Context context) {
                final AppCompatDelegate delegate = AppCompatActivity.this.getDelegate();
                delegate.installViewFactory();
                delegate.onCreate(AppCompatActivity.this.getSavedStateRegistry().consumeRestoredStateForKey("androidx:appcompat"));
            }
        });
    }
    
    protected void attachBaseContext(final Context newBase) {
        super.attachBaseContext(this.getDelegate().attachBaseContext2(newBase));
    }
    
    public void setTheme(@StyleRes final int resId) {
        super.setTheme(resId);
        this.getDelegate().setTheme(resId);
    }
    
    protected void onPostCreate(@Nullable final Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        this.getDelegate().onPostCreate(savedInstanceState);
    }
    
    @Nullable
    public ActionBar getSupportActionBar() {
        return this.getDelegate().getSupportActionBar();
    }
    
    public void setSupportActionBar(@Nullable final Toolbar toolbar) {
        this.getDelegate().setSupportActionBar(toolbar);
    }
    
    @NonNull
    public MenuInflater getMenuInflater() {
        return this.getDelegate().getMenuInflater();
    }
    
    public void setContentView(@LayoutRes final int layoutResID) {
        this.initViewTreeOwners();
        this.getDelegate().setContentView(layoutResID);
    }
    
    public void setContentView(final View view) {
        this.initViewTreeOwners();
        this.getDelegate().setContentView(view);
    }
    
    public void setContentView(final View view, final ViewGroup.LayoutParams params) {
        this.initViewTreeOwners();
        this.getDelegate().setContentView(view, params);
    }
    
    public void addContentView(final View view, final ViewGroup.LayoutParams params) {
        this.initViewTreeOwners();
        this.getDelegate().addContentView(view, params);
    }
    
    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(this.getWindow().getDecorView(), (LifecycleOwner)this);
        ViewTreeViewModelStoreOwner.set(this.getWindow().getDecorView(), (ViewModelStoreOwner)this);
        ViewTreeSavedStateRegistryOwner.set(this.getWindow().getDecorView(), (SavedStateRegistryOwner)this);
        ViewTreeOnBackPressedDispatcherOwner.set(this.getWindow().getDecorView(), (OnBackPressedDispatcherOwner)this);
    }
    
    public void onConfigurationChanged(@NonNull final Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        this.getDelegate().onConfigurationChanged(newConfig);
        if (this.mResources != null) {
            final Configuration currConfig = super.getResources().getConfiguration();
            final DisplayMetrics currMetrics = super.getResources().getDisplayMetrics();
            this.mResources.updateConfiguration(currConfig, currMetrics);
        }
    }
    
    protected void onPostResume() {
        super.onPostResume();
        this.getDelegate().onPostResume();
    }
    
    protected void onStart() {
        super.onStart();
        this.getDelegate().onStart();
    }
    
    protected void onStop() {
        super.onStop();
        this.getDelegate().onStop();
    }
    
    public <T extends View> T findViewById(@IdRes final int id) {
        return this.getDelegate().findViewById(id);
    }
    
    public final boolean onMenuItemSelected(final int featureId, @NonNull final MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        final ActionBar ab = this.getSupportActionBar();
        return item.getItemId() == 16908332 && ab != null && (ab.getDisplayOptions() & 0x4) != 0x0 && this.onSupportNavigateUp();
    }
    
    protected void onDestroy() {
        super.onDestroy();
        this.getDelegate().onDestroy();
    }
    
    protected void onTitleChanged(final CharSequence title, final int color) {
        super.onTitleChanged(title, color);
        this.getDelegate().setTitle(title);
    }
    
    public boolean supportRequestWindowFeature(final int featureId) {
        return this.getDelegate().requestWindowFeature(featureId);
    }
    
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }
    
    public void invalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }
    
    @CallSuper
    public void onSupportActionModeStarted(@NonNull final ActionMode mode) {
    }
    
    @CallSuper
    public void onSupportActionModeFinished(@NonNull final ActionMode mode) {
    }
    
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(@NonNull final ActionMode.Callback callback) {
        return null;
    }
    
    @Nullable
    public ActionMode startSupportActionMode(@NonNull final ActionMode.Callback callback) {
        return this.getDelegate().startSupportActionMode(callback);
    }
    
    @Deprecated
    public void setSupportProgressBarVisibility(final boolean visible) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(final boolean visible) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminate(final boolean indeterminate) {
    }
    
    @Deprecated
    public void setSupportProgress(final int progress) {
    }
    
    public void onCreateSupportNavigateUpTaskStack(@NonNull final TaskStackBuilder builder) {
        builder.addParentStack((Activity)this);
    }
    
    public void onPrepareSupportNavigateUpTaskStack(@NonNull final TaskStackBuilder builder) {
    }
    
    public boolean onSupportNavigateUp() {
        final Intent upIntent = this.getSupportParentActivityIntent();
        if (upIntent != null) {
            if (this.supportShouldUpRecreateTask(upIntent)) {
                final TaskStackBuilder b = TaskStackBuilder.create((Context)this);
                this.onCreateSupportNavigateUpTaskStack(b);
                this.onPrepareSupportNavigateUpTaskStack(b);
                b.startActivities();
                try {
                    ActivityCompat.finishAffinity((Activity)this);
                }
                catch (final IllegalStateException e) {
                    this.finish();
                }
            }
            else {
                this.supportNavigateUpTo(upIntent);
            }
            return true;
        }
        return false;
    }
    
    @Nullable
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent((Activity)this);
    }
    
    public boolean supportShouldUpRecreateTask(@NonNull final Intent targetIntent) {
        return NavUtils.shouldUpRecreateTask((Activity)this, targetIntent);
    }
    
    public void supportNavigateUpTo(@NonNull final Intent upIntent) {
        NavUtils.navigateUpTo((Activity)this, upIntent);
    }
    
    public void onContentChanged() {
        this.onSupportContentChanged();
    }
    
    @Deprecated
    public void onSupportContentChanged() {
    }
    
    @Nullable
    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return this.getDelegate().getDrawerToggleDelegate();
    }
    
    public boolean onMenuOpened(final int featureId, final Menu menu) {
        return super.onMenuOpened(featureId, menu);
    }
    
    public void onPanelClosed(final int featureId, @NonNull final Menu menu) {
        super.onPanelClosed(featureId, menu);
    }
    
    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create((Activity)this, this);
        }
        return this.mDelegate;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent event) {
        final int keyCode = event.getKeyCode();
        final ActionBar actionBar = this.getSupportActionBar();
        return (keyCode == 82 && actionBar != null && actionBar.onMenuKeyEvent(event)) || super.dispatchKeyEvent(event);
    }
    
    public Resources getResources() {
        if (this.mResources == null && VectorEnabledTintResources.shouldBeUsed()) {
            this.mResources = (Resources)new VectorEnabledTintResources((Context)this, super.getResources());
        }
        return (this.mResources == null) ? super.getResources() : this.mResources;
    }
    
    private boolean performMenuItemShortcut(final KeyEvent event) {
        if (Build.VERSION.SDK_INT < 26 && !event.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(event.getMetaState()) && event.getRepeatCount() == 0 && !KeyEvent.isModifierKey(event.getKeyCode())) {
            final Window currentWindow = this.getWindow();
            if (currentWindow != null && currentWindow.getDecorView() != null) {
                final View decorView = currentWindow.getDecorView();
                if (decorView.dispatchKeyShortcutEvent(event)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        return this.performMenuItemShortcut(event) || super.onKeyDown(keyCode, event);
    }
    
    public void openOptionsMenu() {
        final ActionBar actionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (actionBar == null || !actionBar.openOptionsMenu())) {
            super.openOptionsMenu();
        }
    }
    
    public void closeOptionsMenu() {
        final ActionBar actionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (actionBar == null || !actionBar.closeOptionsMenu())) {
            super.closeOptionsMenu();
        }
    }
    
    protected void onNightModeChanged(final int mode) {
    }
    
    protected void onLocalesChanged(@NonNull final LocaleListCompat locales) {
    }
}
