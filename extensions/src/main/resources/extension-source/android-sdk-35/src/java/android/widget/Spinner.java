package android.widget;

import android.view.PointerIcon;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.content.Context;
import android.content.DialogInterface;

public class Spinner extends AbsSpinner implements DialogInterface.OnClickListener
{
    public static final int MODE_DIALOG = 0;
    public static final int MODE_DROPDOWN = 1;
    
    public Spinner(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Spinner(final Context context, final int mode) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Spinner(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Spinner(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Spinner(final Context context, final AttributeSet attrs, final int defStyleAttr, final int mode) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Spinner(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes, final int mode) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Spinner(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes, final int mode, final Resources.Theme popupTheme) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Context getPopupContext() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPopupBackgroundDrawable(final Drawable background) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPopupBackgroundResource(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getPopupBackground() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownVerticalOffset(final int pixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownVerticalOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownHorizontalOffset(final int pixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownHorizontalOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDropDownWidth(final int pixels) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDropDownWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAdapter(final SpinnerAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setOnItemClickListener(final OnItemClickListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performClick() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onClick(final DialogInterface dialog, final int which) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPrompt(final CharSequence prompt) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPromptId(final int promptId) {
        throw new RuntimeException("Stub!");
    }
    
    public CharSequence getPrompt() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public PointerIcon onResolvePointerIcon(final MotionEvent event, final int pointerIndex) {
        throw new RuntimeException("Stub!");
    }
}
