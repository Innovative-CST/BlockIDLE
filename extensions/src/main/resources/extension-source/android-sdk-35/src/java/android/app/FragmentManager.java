package android.app;

import android.view.View;
import android.content.Context;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.util.List;
import android.os.Bundle;

@Deprecated
public abstract class FragmentManager
{
    @Deprecated
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    
    @Deprecated
    public FragmentManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract FragmentTransaction beginTransaction();
    
    @Deprecated
    public abstract boolean executePendingTransactions();
    
    @Deprecated
    public abstract Fragment findFragmentById(final int p0);
    
    @Deprecated
    public abstract Fragment findFragmentByTag(final String p0);
    
    @Deprecated
    public abstract void popBackStack();
    
    @Deprecated
    public abstract boolean popBackStackImmediate();
    
    @Deprecated
    public abstract void popBackStack(final String p0, final int p1);
    
    @Deprecated
    public abstract boolean popBackStackImmediate(final String p0, final int p1);
    
    @Deprecated
    public abstract void popBackStack(final int p0, final int p1);
    
    @Deprecated
    public abstract boolean popBackStackImmediate(final int p0, final int p1);
    
    @Deprecated
    public abstract int getBackStackEntryCount();
    
    @Deprecated
    public abstract BackStackEntry getBackStackEntryAt(final int p0);
    
    @Deprecated
    public abstract void addOnBackStackChangedListener(final OnBackStackChangedListener p0);
    
    @Deprecated
    public abstract void removeOnBackStackChangedListener(final OnBackStackChangedListener p0);
    
    @Deprecated
    public abstract void putFragment(final Bundle p0, final String p1, final Fragment p2);
    
    @Deprecated
    public abstract Fragment getFragment(final Bundle p0, final String p1);
    
    @Deprecated
    public abstract List<Fragment> getFragments();
    
    @Deprecated
    public abstract Fragment.SavedState saveFragmentInstanceState(final Fragment p0);
    
    @Deprecated
    public abstract boolean isDestroyed();
    
    @Deprecated
    public abstract void registerFragmentLifecycleCallbacks(final FragmentLifecycleCallbacks p0, final boolean p1);
    
    @Deprecated
    public abstract void unregisterFragmentLifecycleCallbacks(final FragmentLifecycleCallbacks p0);
    
    @Deprecated
    public abstract Fragment getPrimaryNavigationFragment();
    
    @Deprecated
    public abstract void dump(final String p0, final FileDescriptor p1, final PrintWriter p2, final String[] p3);
    
    @Deprecated
    public static void enableDebugLogging(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void invalidateOptionsMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract boolean isStateSaved();
    
    @Deprecated
    public abstract static class FragmentLifecycleCallbacks
    {
        @Deprecated
        public FragmentLifecycleCallbacks() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentPreAttached(final FragmentManager fm, final Fragment f, final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentAttached(final FragmentManager fm, final Fragment f, final Context context) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentPreCreated(final FragmentManager fm, final Fragment f, final Bundle savedInstanceState) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentCreated(final FragmentManager fm, final Fragment f, final Bundle savedInstanceState) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentActivityCreated(final FragmentManager fm, final Fragment f, final Bundle savedInstanceState) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentViewCreated(final FragmentManager fm, final Fragment f, final View v, final Bundle savedInstanceState) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentStarted(final FragmentManager fm, final Fragment f) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentResumed(final FragmentManager fm, final Fragment f) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentPaused(final FragmentManager fm, final Fragment f) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentStopped(final FragmentManager fm, final Fragment f) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentSaveInstanceState(final FragmentManager fm, final Fragment f, final Bundle outState) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentViewDestroyed(final FragmentManager fm, final Fragment f) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentDestroyed(final FragmentManager fm, final Fragment f) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public void onFragmentDetached(final FragmentManager fm, final Fragment f) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public interface OnBackStackChangedListener
    {
        @Deprecated
        void onBackStackChanged();
    }
    
    @Deprecated
    public interface BackStackEntry
    {
        @Deprecated
        int getId();
        
        @Deprecated
        String getName();
        
        @Deprecated
        int getBreadCrumbTitleRes();
        
        @Deprecated
        int getBreadCrumbShortTitleRes();
        
        @Deprecated
        CharSequence getBreadCrumbTitle();
        
        @Deprecated
        CharSequence getBreadCrumbShortTitle();
    }
}
