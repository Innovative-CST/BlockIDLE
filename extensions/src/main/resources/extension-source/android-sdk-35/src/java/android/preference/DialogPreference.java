package android.preference;

import android.os.Parcelable;
import android.app.Dialog;
import android.view.View;
import android.os.Bundle;
import android.app.AlertDialog;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.content.DialogInterface;

@Deprecated
public abstract class DialogPreference extends Preference implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, PreferenceManager.OnActivityDestroyListener
{
    @Deprecated
    public DialogPreference(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DialogPreference(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DialogPreference(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public DialogPreference(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDialogTitle(final CharSequence dialogTitle) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDialogTitle(final int dialogTitleResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getDialogTitle() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDialogMessage(final CharSequence dialogMessage) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDialogMessage(final int dialogMessageResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getDialogMessage() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDialogIcon(final Drawable dialogIcon) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDialogIcon(final int dialogIconRes) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Drawable getDialogIcon() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPositiveButtonText(final CharSequence positiveButtonText) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPositiveButtonText(final int positiveButtonTextResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getPositiveButtonText() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setNegativeButtonText(final CharSequence negativeButtonText) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setNegativeButtonText(final int negativeButtonTextResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public CharSequence getNegativeButtonText() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDialogLayoutResource(final int dialogLayoutResId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getDialogLayoutResource() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onPrepareDialogBuilder(final AlertDialog.Builder builder) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void showDialog(final Bundle state) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected View onCreateDialogView() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onBindDialogView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onClick(final DialogInterface dialog, final int which) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onDismiss(final DialogInterface dialog) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void onDialogClosed(final boolean positiveResult) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Dialog getDialog() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onActivityDestroy() {
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
