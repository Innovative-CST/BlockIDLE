package android.app;

import java.text.NumberFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.content.DialogInterface;
import android.content.Context;

@Deprecated
public class ProgressDialog extends AlertDialog
{
    @Deprecated
    public static final int STYLE_HORIZONTAL = 1;
    @Deprecated
    public static final int STYLE_SPINNER = 0;
    
    @Deprecated
    public ProgressDialog(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public ProgressDialog(final Context context, final int theme) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static ProgressDialog show(final Context context, final CharSequence title, final CharSequence message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static ProgressDialog show(final Context context, final CharSequence title, final CharSequence message, final boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static ProgressDialog show(final Context context, final CharSequence title, final CharSequence message, final boolean indeterminate, final boolean cancelable) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public static ProgressDialog show(final Context context, final CharSequence title, final CharSequence message, final boolean indeterminate, final boolean cancelable, final DialogInterface.OnCancelListener cancelListener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProgress(final int value) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setSecondaryProgress(final int secondaryProgress) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getProgress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getSecondaryProgress() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public int getMax() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setMax(final int max) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void incrementProgressBy(final int diff) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void incrementSecondaryProgressBy(final int diff) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProgressDrawable(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIndeterminateDrawable(final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setIndeterminate(final boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isIndeterminate() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void setMessage(final CharSequence message) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProgressStyle(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProgressNumberFormat(final String format) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProgressPercentFormat(final NumberFormat format) {
        throw new RuntimeException("Stub!");
    }
}
