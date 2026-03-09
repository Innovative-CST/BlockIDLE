package android.preference;

import android.os.Parcel;
import android.content.res.Resources;
import android.os.Parcelable;
import android.app.Fragment;
import android.widget.ListView;
import android.content.Intent;
import android.view.View;
import java.util.List;
import android.os.Bundle;
import android.view.MenuItem;
import android.app.ListActivity;

@Deprecated
public abstract class PreferenceActivity extends ListActivity implements PreferenceFragment.OnPreferenceStartFragmentCallback
{
    @Deprecated
    public static final String EXTRA_NO_HEADERS = ":android:no_headers";
    @Deprecated
    public static final String EXTRA_SHOW_FRAGMENT = ":android:show_fragment";
    @Deprecated
    public static final String EXTRA_SHOW_FRAGMENT_ARGUMENTS = ":android:show_fragment_args";
    @Deprecated
    public static final String EXTRA_SHOW_FRAGMENT_SHORT_TITLE = ":android:show_fragment_short_title";
    @Deprecated
    public static final String EXTRA_SHOW_FRAGMENT_TITLE = ":android:show_fragment_title";
    @Deprecated
    public static final long HEADER_ID_UNDEFINED = -1L;
    
    @Deprecated
    public PreferenceActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onCreate(@Nullable final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onBackPressed() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasHeaders() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isMultiPane() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onIsMultiPane() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean onIsHidingHeaders() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Header onGetInitialHeader() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Header onGetNewHeader() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onBuildHeaders(final List<Header> target) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void invalidateHeaders() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void loadHeadersFromResource(final int resid, final List<Header> target) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean isValidFragment(final String fragmentName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setListFooter(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onDestroy() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onRestoreInstanceState(final Bundle state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onContentChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onListItemClick(final ListView l, final View v, final int position, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onHeaderClick(final Header header, final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Intent onBuildStartFragmentIntent(final String fragmentName, final Bundle args, final int titleRes, final int shortTitleRes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startWithFragment(final String fragmentName, final Bundle args, final Fragment resultTo, final int resultRequestCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startWithFragment(final String fragmentName, final Bundle args, final Fragment resultTo, final int resultRequestCode, final int titleRes, final int shortTitleRes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void showBreadCrumbs(final CharSequence title, final CharSequence shortTitle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setParentTitle(final CharSequence title, final CharSequence shortTitle, final View.OnClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void switchToHeader(final String fragmentName, final Bundle args) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void switchToHeader(final Header header) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startPreferenceFragment(final Fragment fragment, final boolean push) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void startPreferencePanel(final String fragmentClass, final Bundle args, final int titleRes, final CharSequence titleText, final Fragment resultTo, final int resultRequestCode) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void finishPreferencePanel(final Fragment caller, final int resultCode, final Intent resultData) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onPreferenceStartFragment(final PreferenceFragment caller, final Preference pref) {
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
    @Override
    protected void onNewIntent(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static final class Header implements Parcelable
    {
        @Deprecated
        @NonNull
        public static final Creator<Header> CREATOR;
        @Deprecated
        public CharSequence breadCrumbShortTitle;
        @Deprecated
        public int breadCrumbShortTitleRes;
        @Deprecated
        public CharSequence breadCrumbTitle;
        @Deprecated
        public int breadCrumbTitleRes;
        @Deprecated
        public Bundle extras;
        @Deprecated
        public String fragment;
        @Deprecated
        public Bundle fragmentArguments;
        @Deprecated
        public int iconRes;
        @Deprecated
        public long id;
        @Deprecated
        public Intent intent;
        @Deprecated
        public CharSequence summary;
        @Deprecated
        public int summaryRes;
        @Deprecated
        public CharSequence title;
        @Deprecated
        public int titleRes;
        
        @Deprecated
        public Header() {
            this.id = -1L;
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CharSequence getTitle(final Resources res) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CharSequence getSummary(final Resources res) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CharSequence getBreadCrumbTitle(final Resources res) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public CharSequence getBreadCrumbShortTitle(final Resources res) {
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
        
        @Deprecated
        public void readFromParcel(final Parcel in) {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
}
