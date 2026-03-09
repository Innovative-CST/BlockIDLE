package android.app;

import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.ArrayMap;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import android.content.res.Configuration;
import java.util.List;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

@Deprecated
public class FragmentController
{
    FragmentController() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static final FragmentController createController(final FragmentHostCallback<?> callbacks) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public FragmentManager getFragmentManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public LoaderManager getLoaderManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public Fragment findFragmentByWho(final String who) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void attachHost(final Fragment parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public View onCreateView(final View parent, final String name, final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void noteStateNotSaved() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Parcelable saveAllState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void restoreAllState(final Parcelable state, final List<Fragment> nonConfigList) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void restoreAllState(final Parcelable state, final FragmentManagerNonConfig nonConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public List<Fragment> retainNonConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public FragmentManagerNonConfig retainNestedNonConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchCreate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchActivityCreated() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchResume() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchPause() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchDestroyView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchMultiWindowModeChanged(final boolean isInMultiWindowMode, final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchPictureInPictureModeChanged(final boolean isInPictureInPictureMode, final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchLowMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchTrimMemory(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean dispatchCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean dispatchPrepareOptionsMenu(final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean dispatchOptionsItemSelected(final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean dispatchContextItemSelected(final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dispatchOptionsMenuClosed(final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean execPendingActions() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void doLoaderStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void doLoaderStop(final boolean retain) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void doLoaderDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void reportLoaderStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ArrayMap<String, LoaderManager> retainLoaderNonConfig() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void restoreLoaderNonConfig(final ArrayMap<String, LoaderManager> loaderManagers) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dumpLoaders(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
}
