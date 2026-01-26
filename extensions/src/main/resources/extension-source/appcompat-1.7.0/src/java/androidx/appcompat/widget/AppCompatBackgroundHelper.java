package androidx.appcompat.widget;

import android.os.Build;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.view.View;

class AppCompatBackgroundHelper
{
    @NonNull
    private final View mView;
    private final AppCompatDrawableManager mDrawableManager;
    private int mBackgroundResId;
    private TintInfo mInternalBackgroundTint;
    private TintInfo mBackgroundTint;
    private TintInfo mTmpInfo;
    
    AppCompatBackgroundHelper(@NonNull final View view) {
        this.mBackgroundResId = -1;
        this.mView = view;
        this.mDrawableManager = AppCompatDrawableManager.get();
    }
    
    void loadFromAttributes(@Nullable final AttributeSet attrs, final int defStyleAttr) {
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attrs, R.styleable.ViewBackgroundHelper, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable(this.mView, this.mView.getContext(), R.styleable.ViewBackgroundHelper, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        try {
            if (a.hasValue(R.styleable.ViewBackgroundHelper_android_background)) {
                this.mBackgroundResId = a.getResourceId(R.styleable.ViewBackgroundHelper_android_background, -1);
                final ColorStateList tint = this.mDrawableManager.getTintList(this.mView.getContext(), this.mBackgroundResId);
                if (tint != null) {
                    this.setInternalBackgroundTint(tint);
                }
            }
            if (a.hasValue(R.styleable.ViewBackgroundHelper_backgroundTint)) {
                ViewCompat.setBackgroundTintList(this.mView, a.getColorStateList(R.styleable.ViewBackgroundHelper_backgroundTint));
            }
            if (a.hasValue(R.styleable.ViewBackgroundHelper_backgroundTintMode)) {
                ViewCompat.setBackgroundTintMode(this.mView, DrawableUtils.parseTintMode(a.getInt(R.styleable.ViewBackgroundHelper_backgroundTintMode, -1), (PorterDuff.Mode)null));
            }
        }
        finally {
            a.recycle();
        }
    }
    
    void onSetBackgroundResource(final int resId) {
        this.mBackgroundResId = resId;
        this.setInternalBackgroundTint((this.mDrawableManager != null) ? this.mDrawableManager.getTintList(this.mView.getContext(), resId) : null);
        this.applySupportBackgroundTint();
    }
    
    void onSetBackgroundDrawable(final Drawable background) {
        this.mBackgroundResId = -1;
        this.setInternalBackgroundTint(null);
        this.applySupportBackgroundTint();
    }
    
    void setSupportBackgroundTintList(final ColorStateList tint) {
        if (this.mBackgroundTint == null) {
            this.mBackgroundTint = new TintInfo();
        }
        this.mBackgroundTint.mTintList = tint;
        this.mBackgroundTint.mHasTintList = true;
        this.applySupportBackgroundTint();
    }
    
    ColorStateList getSupportBackgroundTintList() {
        return (this.mBackgroundTint != null) ? this.mBackgroundTint.mTintList : null;
    }
    
    void setSupportBackgroundTintMode(final PorterDuff.Mode tintMode) {
        if (this.mBackgroundTint == null) {
            this.mBackgroundTint = new TintInfo();
        }
        this.mBackgroundTint.mTintMode = tintMode;
        this.mBackgroundTint.mHasTintMode = true;
        this.applySupportBackgroundTint();
    }
    
    PorterDuff.Mode getSupportBackgroundTintMode() {
        return (this.mBackgroundTint != null) ? this.mBackgroundTint.mTintMode : null;
    }
    
    void applySupportBackgroundTint() {
        final Drawable background = this.mView.getBackground();
        if (background != null) {
            if (this.shouldApplyFrameworkTintUsingColorFilter() && this.applyFrameworkTintUsingColorFilter(background)) {
                return;
            }
            if (this.mBackgroundTint != null) {
                AppCompatDrawableManager.tintDrawable(background, this.mBackgroundTint, this.mView.getDrawableState());
            }
            else if (this.mInternalBackgroundTint != null) {
                AppCompatDrawableManager.tintDrawable(background, this.mInternalBackgroundTint, this.mView.getDrawableState());
            }
        }
    }
    
    void setInternalBackgroundTint(final ColorStateList tint) {
        if (tint != null) {
            if (this.mInternalBackgroundTint == null) {
                this.mInternalBackgroundTint = new TintInfo();
            }
            this.mInternalBackgroundTint.mTintList = tint;
            this.mInternalBackgroundTint.mHasTintList = true;
        }
        else {
            this.mInternalBackgroundTint = null;
        }
        this.applySupportBackgroundTint();
    }
    
    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        final int sdk = Build.VERSION.SDK_INT;
        if (sdk > 21) {
            return this.mInternalBackgroundTint != null;
        }
        return sdk == 21;
    }
    
    private boolean applyFrameworkTintUsingColorFilter(@NonNull final Drawable background) {
        if (this.mTmpInfo == null) {
            this.mTmpInfo = new TintInfo();
        }
        final TintInfo info = this.mTmpInfo;
        info.clear();
        final ColorStateList tintList = ViewCompat.getBackgroundTintList(this.mView);
        if (tintList != null) {
            info.mHasTintList = true;
            info.mTintList = tintList;
        }
        final PorterDuff.Mode mode = ViewCompat.getBackgroundTintMode(this.mView);
        if (mode != null) {
            info.mHasTintMode = true;
            info.mTintMode = mode;
        }
        if (info.mHasTintList || info.mHasTintMode) {
            AppCompatDrawableManager.tintDrawable(background, info, this.mView.getDrawableState());
            return true;
        }
        return false;
    }
}
