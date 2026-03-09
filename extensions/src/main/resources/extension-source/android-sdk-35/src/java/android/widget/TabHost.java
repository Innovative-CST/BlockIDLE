package android.widget;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import android.app.LocalActivityManager;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewTreeObserver;

@Deprecated
public class TabHost extends FrameLayout implements ViewTreeObserver.OnTouchModeChangeListener
{
    @Deprecated
    public TabHost(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public TabHost(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public TabHost(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public TabHost(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @NonNull
    public TabSpec newTabSpec(@NonNull final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setup() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setup(final LocalActivityManager activityGroup) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onTouchModeChanged(final boolean isInTouchMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void addTab(final TabSpec tabSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void clearAllTabs() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public TabWidget getTabWidget() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public int getCurrentTab() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public String getCurrentTabTag() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public View getCurrentTabView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public View getCurrentView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCurrentTabByTag(final String tag) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public FrameLayout getTabContentView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void dispatchWindowFocusChanged(final boolean hasFocus) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setCurrentTab(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnTabChangedListener(final OnTabChangeListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public class TabSpec
    {
        TabSpec() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TabSpec setIndicator(final CharSequence label) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TabSpec setIndicator(final CharSequence label, final Drawable icon) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TabSpec setIndicator(final View view) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TabSpec setContent(final int viewId) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TabSpec setContent(final TabContentFactory contentFactory) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public TabSpec setContent(final Intent intent) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @NonNull
        public String getTag() {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface TabContentFactory
    {
        @Deprecated
        View createTabContent(final String p0);
    }
    
    @Deprecated
    public interface OnTabChangeListener
    {
        @Deprecated
        void onTabChanged(final String p0);
    }
}
