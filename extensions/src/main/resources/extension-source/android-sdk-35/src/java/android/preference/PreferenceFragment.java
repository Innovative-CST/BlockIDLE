package android.preference;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.app.Fragment;

@Deprecated
public abstract class PreferenceFragment extends Fragment
{
    @Deprecated
    public PreferenceFragment() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onCreate(@Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @RecentlyNullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDestroyView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onSaveInstanceState(final Bundle outState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PreferenceManager getPreferenceManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPreferenceScreen(final PreferenceScreen preferenceScreen) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PreferenceScreen getPreferenceScreen() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void addPreferencesFromIntent(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void addPreferencesFromResource(final int preferencesResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onPreferenceTreeClick(final PreferenceScreen preferenceScreen, final Preference preference) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Preference findPreference(final CharSequence key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface OnPreferenceStartFragmentCallback
    {
        @Deprecated
        boolean onPreferenceStartFragment(final PreferenceFragment p0, final Preference p1);
    }
}
