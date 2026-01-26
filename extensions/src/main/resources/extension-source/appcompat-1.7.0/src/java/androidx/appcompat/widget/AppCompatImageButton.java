package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import androidx.annotation.RestrictTo;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import android.widget.ImageView;
import android.view.View;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.core.widget.TintableImageSourceView;
import androidx.core.view.TintableBackgroundView;
import android.widget.ImageButton;

public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView
{
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatImageHelper mImageHelper;
    private boolean mHasLevel;
    
    public AppCompatImageButton(@NonNull final Context context) {
        this(context, null);
    }
    
    public AppCompatImageButton(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, R.attr.imageButtonStyle);
    }
    
    public AppCompatImageButton(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(TintContextWrapper.wrap(context), attrs, defStyleAttr);
        this.mHasLevel = false;
        ThemeUtils.checkAppCompatTheme((View)this, this.getContext());
        (this.mBackgroundTintHelper = new AppCompatBackgroundHelper((View)this)).loadFromAttributes(attrs, defStyleAttr);
        (this.mImageHelper = new AppCompatImageHelper((ImageView)this)).loadFromAttributes(attrs, defStyleAttr);
    }
    
    public void setImageResource(@DrawableRes final int resId) {
        this.mImageHelper.setImageResource(resId);
    }
    
    public void setImageDrawable(@Nullable final Drawable drawable) {
        if (this.mImageHelper != null && drawable != null && !this.mHasLevel) {
            this.mImageHelper.obtainLevelFromDrawable(drawable);
        }
        super.setImageDrawable(drawable);
        if (this.mImageHelper != null) {
            this.mImageHelper.applySupportImageTint();
            if (!this.mHasLevel) {
                this.mImageHelper.applyImageLevel();
            }
        }
    }
    
    public void setImageBitmap(final Bitmap bm) {
        super.setImageBitmap(bm);
        if (this.mImageHelper != null) {
            this.mImageHelper.applySupportImageTint();
        }
    }
    
    public void setImageURI(@Nullable final Uri uri) {
        super.setImageURI(uri);
        if (this.mImageHelper != null) {
            this.mImageHelper.applySupportImageTint();
        }
    }
    
    public void setBackgroundResource(@DrawableRes final int resId) {
        super.setBackgroundResource(resId);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundResource(resId);
        }
    }
    
    public void setBackgroundDrawable(@Nullable final Drawable background) {
        super.setBackgroundDrawable(background);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundDrawable(background);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportBackgroundTintList(@Nullable final ColorStateList tint) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintList(tint);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        return (this.mBackgroundTintHelper != null) ? this.mBackgroundTintHelper.getSupportBackgroundTintList() : null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportBackgroundTintMode(@Nullable final PorterDuff.Mode tintMode) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintMode(tintMode);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return (this.mBackgroundTintHelper != null) ? this.mBackgroundTintHelper.getSupportBackgroundTintMode() : null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportImageTintList(@Nullable final ColorStateList tint) {
        if (this.mImageHelper != null) {
            this.mImageHelper.setSupportImageTintList(tint);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public ColorStateList getSupportImageTintList() {
        return (this.mImageHelper != null) ? this.mImageHelper.getSupportImageTintList() : null;
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    public void setSupportImageTintMode(@Nullable final PorterDuff.Mode tintMode) {
        if (this.mImageHelper != null) {
            this.mImageHelper.setSupportImageTintMode(tintMode);
        }
    }
    
    @RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
    @Nullable
    public PorterDuff.Mode getSupportImageTintMode() {
        return (this.mImageHelper != null) ? this.mImageHelper.getSupportImageTintMode() : null;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.applySupportBackgroundTint();
        }
        if (this.mImageHelper != null) {
            this.mImageHelper.applySupportImageTint();
        }
    }
    
    public boolean hasOverlappingRendering() {
        return this.mImageHelper.hasOverlappingRendering() && super.hasOverlappingRendering();
    }
    
    public void setImageLevel(final int level) {
        super.setImageLevel(level);
        this.mHasLevel = true;
    }
}
