package android.preference;

import android.content.res.TypedArray;
import android.net.Uri;
import android.content.Intent;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public class RingtonePreference extends Preference implements PreferenceManager.OnActivityResultListener
{
    @Deprecated
    public RingtonePreference(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RingtonePreference(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RingtonePreference(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RingtonePreference(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getRingtoneType() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRingtoneType(final int type) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getShowDefault() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setShowDefault(final boolean showDefault) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getShowSilent() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setShowSilent(final boolean showSilent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onPrepareRingtonePickerIntent(final Intent ringtonePickerIntent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onSaveRingtone(final Uri ringtoneUri) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected Uri onRestoreRingtone() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected Object onGetDefaultValue(final TypedArray a, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onSetInitialValue(final boolean restorePersistedValue, final Object defaultValueObj) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onAttachedToHierarchy(final PreferenceManager preferenceManager) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        throw new RuntimeException("Stub!");
    }
}
