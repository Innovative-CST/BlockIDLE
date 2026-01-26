package androidx.appcompat.app;

import android.view.Window;
import android.view.KeyEvent;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.R;
import android.util.TypedValue;
import android.app.Dialog;
import androidx.annotation.RestrictTo;
import androidx.annotation.IdRes;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.ViewTreeOnBackPressedDispatcherOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.core.view.KeyEventDispatcher;
import androidx.activity.ComponentDialog;

public class AppCompatDialog extends ComponentDialog implements AppCompatCallback
{
    private AppCompatDelegate mDelegate;
    private final KeyEventDispatcher.Component mKeyDispatcher;
    
    public AppCompatDialog(@NonNull final Context context) {
        this(context, 0);
    }
    
    public AppCompatDialog(@NonNull final Context context, final int theme) {
        super(context, getThemeResId(context, theme));
        this.mKeyDispatcher = this::superDispatchKeyEvent;
        final AppCompatDelegate delegate = this.getDelegate();
        delegate.setTheme(getThemeResId(context, theme));
        delegate.onCreate(null);
    }
    
    protected AppCompatDialog(@NonNull final Context context, final boolean cancelable, @Nullable final DialogInterface.OnCancelListener cancelListener) {
        super(context);
        this.mKeyDispatcher = this::superDispatchKeyEvent;
        this.setCancelable(cancelable);
        this.setOnCancelListener(cancelListener);
    }
    
    protected void onCreate(final Bundle savedInstanceState) {
        this.getDelegate().installViewFactory();
        super.onCreate(savedInstanceState);
        this.getDelegate().onCreate(savedInstanceState);
    }
    
    public ActionBar getSupportActionBar() {
        return this.getDelegate().getSupportActionBar();
    }
    
    public void setContentView(@LayoutRes final int layoutResID) {
        this.initViewTreeOwners();
        this.getDelegate().setContentView(layoutResID);
    }
    
    public void setContentView(@NonNull final View view) {
        this.initViewTreeOwners();
        this.getDelegate().setContentView(view);
    }
    
    public void setContentView(@NonNull final View view, final ViewGroup.LayoutParams params) {
        this.initViewTreeOwners();
        this.getDelegate().setContentView(view, params);
    }
    
    private void initViewTreeOwners() {
        ViewTreeLifecycleOwner.set(this.getWindow().getDecorView(), (LifecycleOwner)this);
        ViewTreeSavedStateRegistryOwner.set(this.getWindow().getDecorView(), (SavedStateRegistryOwner)this);
        ViewTreeOnBackPressedDispatcherOwner.set(this.getWindow().getDecorView(), (OnBackPressedDispatcherOwner)this);
    }
    
    @Nullable
    public <T extends View> T findViewById(@IdRes final int id) {
        return this.getDelegate().findViewById(id);
    }
    
    public void setTitle(final CharSequence title) {
        super.setTitle(title);
        this.getDelegate().setTitle(title);
    }
    
    public void setTitle(final int titleId) {
        super.setTitle(titleId);
        this.getDelegate().setTitle((CharSequence)this.getContext().getString(titleId));
    }
    
    public void addContentView(@NonNull final View view, final ViewGroup.LayoutParams params) {
        this.getDelegate().addContentView(view, params);
    }
    
    protected void onStop() {
        super.onStop();
        this.getDelegate().onStop();
    }
    
    public void dismiss() {
        super.dismiss();
        this.getDelegate().onDestroy();
    }
    
    public boolean supportRequestWindowFeature(final int featureId) {
        return this.getDelegate().requestWindowFeature(featureId);
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void invalidateOptionsMenu() {
        this.getDelegate().invalidateOptionsMenu();
    }
    
    @NonNull
    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create((Dialog)this, this);
        }
        return this.mDelegate;
    }
    
    private static int getThemeResId(final Context context, int themeId) {
        if (themeId == 0) {
            final TypedValue outValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, outValue, true);
            themeId = outValue.resourceId;
        }
        return themeId;
    }
    
    public void onSupportActionModeStarted(final ActionMode mode) {
    }
    
    public void onSupportActionModeFinished(final ActionMode mode) {
    }
    
    @Nullable
    public ActionMode onWindowStartingSupportActionMode(final ActionMode.Callback callback) {
        return null;
    }
    
    boolean superDispatchKeyEvent(final KeyEvent event) {
        return super.dispatchKeyEvent(event);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent event) {
        final View decor = this.getWindow().getDecorView();
        return KeyEventDispatcher.dispatchKeyEvent(this.mKeyDispatcher, decor, (Window.Callback)this, event);
    }
}
