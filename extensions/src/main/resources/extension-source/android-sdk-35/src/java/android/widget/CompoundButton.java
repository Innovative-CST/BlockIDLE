package android.widget;

import android.view.autofill.AutofillValue;
import android.os.Parcelable;
import android.graphics.Canvas;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Icon;
import android.graphics.drawable.Drawable;
import android.view.ViewDebug;
import android.util.AttributeSet;
import android.content.Context;

public abstract class CompoundButton extends Button implements Checkable
{
    public CompoundButton(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CompoundButton(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CompoundButton(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public CompoundButton(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void toggle() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performClick() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty
    @Override
    public boolean isChecked() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setStateDescription(@Nullable final CharSequence stateDescription) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setChecked(final boolean checked) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCheckedChangeListener(@Nullable final OnCheckedChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setButtonDrawable(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setButtonDrawable(@Nullable final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Drawable getButtonDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setButtonIcon(@Nullable final Icon icon) {
        throw new RuntimeException("Stub!");
    }
    
    public void setButtonTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getButtonTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setButtonTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setButtonTintBlendMode(@Nullable final BlendMode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getButtonTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getButtonTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCompoundPaddingLeft() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getCompoundPaddingRight() {
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
    protected boolean verifyDrawable(@NonNull final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
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
    public void autofill(final AutofillValue value) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAutofillType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public AutofillValue getAutofillValue() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnCheckedChangeListener
    {
        void onCheckedChanged(final CompoundButton p0, final boolean p1);
    }
}
