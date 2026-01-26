package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import android.content.res.Resources;
import androidx.appcompat.content.res.AppCompatResources;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import androidx.annotation.NonNull;
import android.widget.CompoundButton;

class AppCompatCompoundButtonHelper
{
    @NonNull
    private final CompoundButton mView;
    private ColorStateList mButtonTintList;
    private PorterDuff.Mode mButtonTintMode;
    private boolean mHasButtonTint;
    private boolean mHasButtonTintMode;
    private boolean mSkipNextApply;
    
    AppCompatCompoundButtonHelper(@NonNull final CompoundButton view) {
        this.mButtonTintList = null;
        this.mButtonTintMode = null;
        this.mHasButtonTint = false;
        this.mHasButtonTintMode = false;
        this.mView = view;
    }
    
    void loadFromAttributes(@Nullable final AttributeSet attrs, final int defStyleAttr) {
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attrs, R.styleable.CompoundButton, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this.mView, this.mView.getContext(), R.styleable.CompoundButton, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        try {
            boolean buttonDrawableLoaded = false;
            if (a.hasValue(R.styleable.CompoundButton_buttonCompat)) {
                final int resourceId = a.getResourceId(R.styleable.CompoundButton_buttonCompat, 0);
                if (resourceId != 0) {
                    try {
                        this.mView.setButtonDrawable(AppCompatResources.getDrawable(this.mView.getContext(), resourceId));
                        buttonDrawableLoaded = true;
                    }
                    catch (final Resources.NotFoundException ex) {}
                }
            }
            if (!buttonDrawableLoaded && a.hasValue(R.styleable.CompoundButton_android_button)) {
                final int resourceId = a.getResourceId(R.styleable.CompoundButton_android_button, 0);
                if (resourceId != 0) {
                    this.mView.setButtonDrawable(AppCompatResources.getDrawable(this.mView.getContext(), resourceId));
                }
            }
            if (a.hasValue(R.styleable.CompoundButton_buttonTint)) {
                CompoundButtonCompat.setButtonTintList(this.mView, a.getColorStateList(R.styleable.CompoundButton_buttonTint));
            }
            if (a.hasValue(R.styleable.CompoundButton_buttonTintMode)) {
                CompoundButtonCompat.setButtonTintMode(this.mView, DrawableUtils.parseTintMode(a.getInt(R.styleable.CompoundButton_buttonTintMode, -1), (PorterDuff.Mode)null));
            }
        }
        finally {
            a.recycle();
        }
    }
    
    void setSupportButtonTintList(final ColorStateList tint) {
        this.mButtonTintList = tint;
        this.mHasButtonTint = true;
        this.applyButtonTint();
    }
    
    ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }
    
    void setSupportButtonTintMode(@Nullable final PorterDuff.Mode tintMode) {
        this.mButtonTintMode = tintMode;
        this.mHasButtonTintMode = true;
        this.applyButtonTint();
    }
    
    PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }
    
    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        this.applyButtonTint();
    }
    
    void applyButtonTint() {
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(this.mView);
        if (buttonDrawable != null && (this.mHasButtonTint || this.mHasButtonTintMode)) {
            buttonDrawable = DrawableCompat.wrap(buttonDrawable);
            buttonDrawable = buttonDrawable.mutate();
            if (this.mHasButtonTint) {
                DrawableCompat.setTintList(buttonDrawable, this.mButtonTintList);
            }
            if (this.mHasButtonTintMode) {
                DrawableCompat.setTintMode(buttonDrawable, this.mButtonTintMode);
            }
            if (buttonDrawable.isStateful()) {
                buttonDrawable.setState(this.mView.getDrawableState());
            }
            this.mView.setButtonDrawable(buttonDrawable);
        }
    }
}
