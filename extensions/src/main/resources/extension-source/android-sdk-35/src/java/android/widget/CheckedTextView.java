package android.widget;

import android.os.Parcelable;
import android.graphics.Canvas;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.ViewDebug;
import android.util.AttributeSet;
import android.content.Context;

public class CheckedTextView extends TextView implements Checkable
{
    public CheckedTextView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CheckedTextView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CheckedTextView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CheckedTextView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void toggle() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    @Override
    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setChecked(final boolean checked) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCheckMarkDrawable(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCheckMarkDrawable(@Nullable final Drawable d) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCheckMarkTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getCheckMarkTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCheckMarkTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCheckMarkTintBlendMode(@Nullable final BlendMode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getCheckMarkTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getCheckMarkTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setVisibility(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean verifyDrawable(@NonNull final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getCheckMarkDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected int[] onCreateDrawableState(final int extraSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
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
}
