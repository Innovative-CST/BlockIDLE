package android.preference;

import android.os.Parcelable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public abstract class TwoStatePreference extends Preference
{
    @Deprecated
    public TwoStatePreference(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public TwoStatePreference(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public TwoStatePreference(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public TwoStatePreference(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setChecked(final boolean checked) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean shouldDisableDependents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSummaryOn(final CharSequence summary) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSummaryOn(final int summaryResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getSummaryOn() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSummaryOff(final CharSequence summary) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSummaryOff(final int summaryResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getSummaryOff() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean getDisableDependentsState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDisableDependentsState(final boolean disableDependentsState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected Object onGetDefaultValue(final TypedArray a, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onSetInitialValue(final boolean restoreValue, final Object defaultValue) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
}
