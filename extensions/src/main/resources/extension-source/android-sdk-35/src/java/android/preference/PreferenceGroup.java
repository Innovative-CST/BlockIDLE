package android.preference;

import android.os.Bundle;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public abstract class PreferenceGroup extends Preference
{
    @Deprecated
    public PreferenceGroup(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PreferenceGroup(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public PreferenceGroup(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOrderingAsAdded(final boolean orderingAsAdded) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isOrderingAsAdded() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void addItemFromInflater(final Preference preference) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getPreferenceCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Preference getPreference(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean addPreference(final Preference preference) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean removePreference(final Preference preference) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removeAll() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean onPrepareAddPreference(final Preference preference) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Preference findPreference(final CharSequence key) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean isOnSameScreenAsChildren() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onAttachedToActivity() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onPrepareForRemoval() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void notifyDependencyChange(final boolean disableDependents) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void dispatchSaveInstanceState(final Bundle container) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void dispatchRestoreInstanceState(final Bundle container) {
        throw new RuntimeException("Stub!");
    }
}
