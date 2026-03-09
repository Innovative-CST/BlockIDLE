package android.preference;

import android.os.Parcelable;
import android.content.res.TypedArray;
import android.app.AlertDialog;
import java.util.Set;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public class MultiSelectListPreference extends DialogPreference
{
    @Deprecated
    public MultiSelectListPreference(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MultiSelectListPreference(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MultiSelectListPreference(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public MultiSelectListPreference(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setEntries(final CharSequence[] entries) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setEntries(final int entriesResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence[] getEntries() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setEntryValues(final CharSequence[] entryValues) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setEntryValues(final int entryValuesResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence[] getEntryValues() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setValues(final Set<String> values) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Set<String> getValues() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int findIndexOfValue(final String value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onPrepareDialogBuilder(final AlertDialog.Builder builder) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onDialogClosed(final boolean positiveResult) {
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
}
