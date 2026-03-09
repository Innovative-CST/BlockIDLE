package android.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.transition.Transition;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.animation.Animator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.content.IntentSender;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.content.ComponentCallbacks2;

@Deprecated
public class Fragment implements ComponentCallbacks2, View.OnCreateContextMenuListener
{
    @Deprecated
    public Fragment() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Fragment instantiate(final Context context, final String fname) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static Fragment instantiate(final Context context, final String fname, @Nullable final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final boolean equals(@Nullable final Object o) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public final int hashCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final int getId() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final String getTag() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setArguments(final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Bundle getArguments() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isStateSaved() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setInitialSavedState(final SavedState state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTargetFragment(final Fragment fragment, final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Fragment getTargetFragment() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final int getTargetRequestCode() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Activity getActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public final Object getHost() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Resources getResources() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final CharSequence getText(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final String getString(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final String getString(final int resId, final Object... formatArgs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final FragmentManager getFragmentManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final FragmentManager getChildFragmentManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final Fragment getParentFragment() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isAdded() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isDetached() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isRemoving() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isInLayout() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isResumed() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isVisible() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean isHidden() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onHiddenChanged(final boolean hidden) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRetainInstance(final boolean retain) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final boolean getRetainInstance() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setHasOptionsMenu(final boolean hasMenu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMenuVisibility(final boolean menuVisible) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setUserVisibleHint(final boolean isVisibleToUser) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getUserVisibleHint() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public LoaderManager getLoaderManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startActivity(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startActivity(final Intent intent, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startActivityForResult(final Intent intent, final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startActivityForResult(final Intent intent, final int requestCode, final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startIntentSenderForResult(final IntentSender intent, final int requestCode, @Nullable final Intent fillInIntent, final int flagsMask, final int flagsValues, final int extraFlags, final Bundle options) throws IntentSender.SendIntentException {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final void requestPermissions(@NonNull final String[] permissions, final int requestCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onRequestPermissionsResult(final int requestCode, @NonNull final String[] permissions, @NonNull final int[] grantResults) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean shouldShowRequestPermissionRationale(@NonNull final String permission) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public LayoutInflater onGetLayoutInflater(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public final LayoutInflater getLayoutInflater() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onInflate(final AttributeSet attrs, final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onInflate(final Context context, final AttributeSet attrs, final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onInflate(final Activity activity, final AttributeSet attrs, final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onAttachFragment(final Fragment childFragment) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onAttach(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onAttach(final Activity activity) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Animator onCreateAnimator(final int transit, final boolean enter, final int nextAnim) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public View getView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onViewStateRestored(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onResume() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSaveInstanceState(final Bundle outState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode, final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onMultiWindowModeChanged(final boolean isInMultiWindowMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode, final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPictureInPictureModeChanged(final boolean isInPictureInPictureMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onConfigurationChanged(final Configuration newConfig) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPause() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onLowMemory() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onTrimMemory(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDestroyView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDetach() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater inflater) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onPrepareOptionsMenu(final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDestroyOptionsMenu() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onOptionsItemSelected(final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onOptionsMenuClosed(final Menu menu) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onCreateContextMenu(final ContextMenu menu, final View v, final ContextMenu.ContextMenuInfo menuInfo) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void registerForContextMenu(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void unregisterForContextMenu(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onContextItemSelected(final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setEnterSharedElementCallback(final SharedElementCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setExitSharedElementCallback(final SharedElementCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setEnterTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Transition getEnterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setReturnTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Transition getReturnTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setExitTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Transition getExitTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setReenterTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Transition getReenterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSharedElementEnterTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Transition getSharedElementEnterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSharedElementReturnTransition(final Transition transition) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Transition getSharedElementReturnTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAllowEnterTransitionOverlap(final boolean allow) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getAllowEnterTransitionOverlap() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAllowReturnTransitionOverlap(final boolean allow) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getAllowReturnTransitionOverlap() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void postponeEnterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startPostponedEnterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void dump(final String prefix, final FileDescriptor fd, final PrintWriter writer, final String[] args) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class InstantiationException extends AndroidRuntimeException
    {
        @Deprecated
        public InstantiationException(final String msg, final Exception cause) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class SavedState implements Parcelable
    {
        @Deprecated
        public static final ClassLoaderCreator<SavedState> CREATOR;
        
        SavedState() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public void writeToParcel(final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
