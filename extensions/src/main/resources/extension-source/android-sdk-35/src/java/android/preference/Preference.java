package android.preference;

import android.os.Parcel;
import android.view.AbsSavedState;
import android.os.Parcelable;
import java.util.Set;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public class Preference implements Comparable<Preference>
{
    @Deprecated
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    
    @Deprecated
    public Preference(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Preference(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Preference(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Preference(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Object onGetDefaultValue(final TypedArray a, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIntent(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Intent getIntent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setFragment(final String fragment) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getFragment() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPreferenceDataStore(final PreferenceDataStore dataStore) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public PreferenceDataStore getPreferenceDataStore() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Bundle getExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Bundle peekExtras() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setLayoutResource(final int layoutResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getLayoutResource() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setWidgetLayoutResource(final int widgetLayoutResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getWidgetLayoutResource() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public View getView(final View convertView, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected View onCreateView(final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onBindView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOrder(final int order) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getOrder() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTitle(final CharSequence title) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setTitle(final int titleResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getTitleRes() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIcon(final Drawable icon) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIcon(final int iconResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Drawable getIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getSummary() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSummary(final CharSequence summary) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSummary(final int summaryResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSelectable(final boolean selectable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isSelectable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setShouldDisableView(final boolean shouldDisableView) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getShouldDisableView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRecycleEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isRecycleEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSingleLineTitle(final boolean singleLineTitle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isSingleLineTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIconSpaceReserved(final boolean iconSpaceReserved) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isIconSpaceReserved() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setKey(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean hasKey() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isPersistent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean shouldPersist() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPersistent(final boolean persistent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean callChangeListener(final Object newValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnPreferenceChangeListener(final OnPreferenceChangeListener onPreferenceChangeListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public OnPreferenceChangeListener getOnPreferenceChangeListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnPreferenceClickListener(final OnPreferenceClickListener onPreferenceClickListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public OnPreferenceClickListener getOnPreferenceClickListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Context getContext() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SharedPreferences getSharedPreferences() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public SharedPreferences.Editor getEditor() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean shouldCommit() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public int compareTo(final Preference another) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void notifyChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void notifyHierarchyChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PreferenceManager getPreferenceManager() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onAttachedToHierarchy(final PreferenceManager preferenceManager) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onAttachedToActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Preference findPreferenceInHierarchy(final String key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void notifyDependencyChange(final boolean disableDependents) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDependencyChanged(final Preference dependency, final boolean disableDependent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onParentChanged(final Preference parent, final boolean disableChild) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean shouldDisableDependents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDependency(final String dependencyKey) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getDependency() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public PreferenceGroup getParent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onPrepareForRemoval() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDefaultValue(final Object defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onSetInitialValue(final boolean restorePersistedValue, final Object defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean persistString(final String value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected String getPersistedString(final String defaultReturnValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean persistStringSet(final Set<String> values) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Set<String> getPersistedStringSet(final Set<String> defaultReturnValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean persistInt(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected int getPersistedInt(final int defaultReturnValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean persistFloat(final float value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected float getPersistedFloat(final float defaultReturnValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean persistLong(final long value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected long getPersistedLong(final long defaultReturnValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean persistBoolean(final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean getPersistedBoolean(final boolean defaultReturnValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void saveHierarchyState(final Bundle container) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void restoreHierarchyState(final Bundle container) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static class BaseSavedState extends AbsSavedState
    {
        @Deprecated
        @NonNull
        public static final Parcelable.Creator<BaseSavedState> CREATOR;
        
        @Deprecated
        public BaseSavedState(final Parcel source) {
            super((Parcelable)null);
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public BaseSavedState(final Parcelable superState) {
            super((Parcelable)null);
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
    }
    
    @Deprecated
    public interface OnPreferenceClickListener
    {
        @Deprecated
        boolean onPreferenceClick(final Preference p0);
    }
    
    @Deprecated
    public interface OnPreferenceChangeListener
    {
        @Deprecated
        boolean onPreferenceChange(final Preference p0, final Object p1);
    }
}
