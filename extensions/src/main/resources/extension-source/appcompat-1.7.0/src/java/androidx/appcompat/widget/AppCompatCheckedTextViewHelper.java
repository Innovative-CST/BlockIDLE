package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CheckedTextViewCompat;
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
import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY })
class AppCompatCheckedTextViewHelper
{
    @NonNull
    private final CheckedTextView mView;
    private ColorStateList mCheckMarkTintList;
    private PorterDuff.Mode mCheckMarkTintMode;
    private boolean mHasCheckMarkTint;
    private boolean mHasCheckMarkTintMode;
    private boolean mSkipNextApply;
    
    AppCompatCheckedTextViewHelper(@NonNull final CheckedTextView view) {
        this.mCheckMarkTintList = null;
        this.mCheckMarkTintMode = null;
        this.mHasCheckMarkTint = false;
        this.mHasCheckMarkTintMode = false;
        this.mView = view;
    }
    
    void loadFromAttributes(@Nullable final AttributeSet attrs, final int defStyleAttr) {
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attrs, R.styleable.CheckedTextView, defStyleAttr, 0);
        ViewCompat.saveAttributeDataForStyleable((View)this.mView, this.mView.getContext(), R.styleable.CheckedTextView, attrs, a.getWrappedTypeArray(), defStyleAttr, 0);
        try {
            boolean checkMarkDrawableLoaded = false;
            if (a.hasValue(R.styleable.CheckedTextView_checkMarkCompat)) {
                final int resourceId = a.getResourceId(R.styleable.CheckedTextView_checkMarkCompat, 0);
                if (resourceId != 0) {
                    try {
                        this.mView.setCheckMarkDrawable(AppCompatResources.getDrawable(this.mView.getContext(), resourceId));
                        checkMarkDrawableLoaded = true;
                    }
                    catch (final Resources.NotFoundException ex) {}
                }
            }
            if (!checkMarkDrawableLoaded && a.hasValue(R.styleable.CheckedTextView_android_checkMark)) {
                final int resourceId = a.getResourceId(R.styleable.CheckedTextView_android_checkMark, 0);
                if (resourceId != 0) {
                    this.mView.setCheckMarkDrawable(AppCompatResources.getDrawable(this.mView.getContext(), resourceId));
                }
            }
            if (a.hasValue(R.styleable.CheckedTextView_checkMarkTint)) {
                CheckedTextViewCompat.setCheckMarkTintList(this.mView, a.getColorStateList(R.styleable.CheckedTextView_checkMarkTint));
            }
            if (a.hasValue(R.styleable.CheckedTextView_checkMarkTintMode)) {
                CheckedTextViewCompat.setCheckMarkTintMode(this.mView, DrawableUtils.parseTintMode(a.getInt(R.styleable.CheckedTextView_checkMarkTintMode, -1), (PorterDuff.Mode)null));
            }
        }
        finally {
            a.recycle();
        }
    }
    
    void setSupportCheckMarkTintList(final ColorStateList tint) {
        this.mCheckMarkTintList = tint;
        this.mHasCheckMarkTint = true;
        this.applyCheckMarkTint();
    }
    
    ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }
    
    void setSupportCheckMarkTintMode(@Nullable final PorterDuff.Mode tintMode) {
        this.mCheckMarkTintMode = tintMode;
        this.mHasCheckMarkTintMode = true;
        this.applyCheckMarkTint();
    }
    
    PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }
    
    void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
            return;
        }
        this.mSkipNextApply = true;
        this.applyCheckMarkTint();
    }
    
    void applyCheckMarkTint() {
        Drawable checkMarkDrawable = CheckedTextViewCompat.getCheckMarkDrawable(this.mView);
        if (checkMarkDrawable != null && (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode)) {
            checkMarkDrawable = DrawableCompat.wrap(checkMarkDrawable);
            checkMarkDrawable = checkMarkDrawable.mutate();
            if (this.mHasCheckMarkTint) {
                DrawableCompat.setTintList(checkMarkDrawable, this.mCheckMarkTintList);
            }
            if (this.mHasCheckMarkTintMode) {
                DrawableCompat.setTintMode(checkMarkDrawable, this.mCheckMarkTintMode);
            }
            if (checkMarkDrawable.isStateful()) {
                checkMarkDrawable.setState(this.mView.getDrawableState());
            }
            this.mView.setCheckMarkDrawable(checkMarkDrawable);
        }
    }
}
