package android.preference;

import android.os.Parcelable;
import android.content.res.TypedArray;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

@Deprecated
public class EditTextPreference extends DialogPreference
{
    @Deprecated
    public EditTextPreference(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public EditTextPreference(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public EditTextPreference(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public EditTextPreference(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setText(final String text) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public String getText() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onBindDialogView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void showDialog(final Bundle state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onAddEditTextToDialogView(final View dialogView, final EditText editText) {
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
    public boolean shouldDisableDependents() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public EditText getEditText() {
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
