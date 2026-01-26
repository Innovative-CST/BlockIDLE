package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff;
import androidx.core.widget.ImageViewCompat;
import androidx.appcompat.content.res.AppCompatResources;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.appcompat.R;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class AppCompatImageHelper
{
    @NonNull
    private final ImageView mView;
    private TintInfo mInternalImageTint;
    private TintInfo mImageTint;
    private TintInfo mTmpInfo;
    private int mLevel;
    
    public AppCompatImageHelper(@NonNull final ImageView view) {
        this.mLevel = 0;
        this.mView = view;
    }
    
    public void loadFromAttributes(final AttributeSet attrs, final int defStyleAttr) {
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attrs, R.styleable.AppCompatImageView, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this.mView, this.mView.getContext(), R.styleable.AppCompatImageView, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        try {
            Drawable drawable = this.mView.getDrawable();
            if (drawable == null) {
                final int id = a.getResourceId(R.styleable.AppCompatImageView_srcCompat, -1);
                if (id != -1) {
                    drawable = AppCompatResources.getDrawable(this.mView.getContext(), id);
                    if (drawable != null) {
                        this.mView.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                DrawableUtils.fixDrawable(drawable);
            }
            if (a.hasValue(R.styleable.AppCompatImageView_tint)) {
                ImageViewCompat.setImageTintList(this.mView, a.getColorStateList(R.styleable.AppCompatImageView_tint));
            }
            if (a.hasValue(R.styleable.AppCompatImageView_tintMode)) {
                ImageViewCompat.setImageTintMode(this.mView, DrawableUtils.parseTintMode(a.getInt(R.styleable.AppCompatImageView_tintMode, -1), (PorterDuff.Mode)null));
            }
        }
        finally {
            a.recycle();
        }
    }
    
    public void setImageResource(final int resId) {
        if (resId != 0) {
            final Drawable d = AppCompatResources.getDrawable(this.mView.getContext(), resId);
            if (d != null) {
                DrawableUtils.fixDrawable(d);
            }
            this.mView.setImageDrawable(d);
        }
        else {
            this.mView.setImageDrawable((Drawable)null);
        }
        this.applySupportImageTint();
    }
    
    boolean hasOverlappingRendering() {
        final Drawable background = this.mView.getBackground();
        return Build.VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable);
    }
    
    void setSupportImageTintList(final ColorStateList tint) {
        if (this.mImageTint == null) {
            this.mImageTint = new TintInfo();
        }
        this.mImageTint.mTintList = tint;
        this.mImageTint.mHasTintList = true;
        this.applySupportImageTint();
    }
    
    ColorStateList getSupportImageTintList() {
        return (this.mImageTint != null) ? this.mImageTint.mTintList : null;
    }
    
    void setSupportImageTintMode(final PorterDuff.Mode tintMode) {
        if (this.mImageTint == null) {
            this.mImageTint = new TintInfo();
        }
        this.mImageTint.mTintMode = tintMode;
        this.mImageTint.mHasTintMode = true;
        this.applySupportImageTint();
    }
    
    PorterDuff.Mode getSupportImageTintMode() {
        return (this.mImageTint != null) ? this.mImageTint.mTintMode : null;
    }
    
    void applySupportImageTint() {
        final Drawable imageViewDrawable = this.mView.getDrawable();
        if (imageViewDrawable != null) {
            DrawableUtils.fixDrawable(imageViewDrawable);
        }
        if (imageViewDrawable != null) {
            if (this.shouldApplyFrameworkTintUsingColorFilter() && this.applyFrameworkTintUsingColorFilter(imageViewDrawable)) {
                return;
            }
            if (this.mImageTint != null) {
                AppCompatDrawableManager.tintDrawable(imageViewDrawable, this.mImageTint, this.mView.getDrawableState());
            }
            else if (this.mInternalImageTint != null) {
                AppCompatDrawableManager.tintDrawable(imageViewDrawable, this.mInternalImageTint, this.mView.getDrawableState());
            }
        }
    }
    
    void setInternalImageTint(final ColorStateList tint) {
        if (tint != null) {
            if (this.mInternalImageTint == null) {
                this.mInternalImageTint = new TintInfo();
            }
            this.mInternalImageTint.mTintList = tint;
            this.mInternalImageTint.mHasTintList = true;
        }
        else {
            this.mInternalImageTint = null;
        }
        this.applySupportImageTint();
    }
    
    private boolean shouldApplyFrameworkTintUsingColorFilter() {
        final int sdk = Build.VERSION.SDK_INT;
        if (sdk > 21) {
            return this.mInternalImageTint != null;
        }
        return sdk == 21;
    }
    
    private boolean applyFrameworkTintUsingColorFilter(@NonNull final Drawable imageSource) {
        if (this.mTmpInfo == null) {
            this.mTmpInfo = new TintInfo();
        }
        final TintInfo info = this.mTmpInfo;
        info.clear();
        final ColorStateList tintList = ImageViewCompat.getImageTintList(this.mView);
        if (tintList != null) {
            info.mHasTintList = true;
            info.mTintList = tintList;
        }
        final PorterDuff.Mode mode = ImageViewCompat.getImageTintMode(this.mView);
        if (mode != null) {
            info.mHasTintMode = true;
            info.mTintMode = mode;
        }
        if (info.mHasTintList || info.mHasTintMode) {
            AppCompatDrawableManager.tintDrawable(imageSource, info, this.mView.getDrawableState());
            return true;
        }
        return false;
    }
    
    void obtainLevelFromDrawable(@NonNull final Drawable drawable) {
        this.mLevel = drawable.getLevel();
    }
    
    void applyImageLevel() {
        if (this.mView.getDrawable() != null) {
            this.mView.getDrawable().setLevel(this.mLevel);
        }
    }
}
