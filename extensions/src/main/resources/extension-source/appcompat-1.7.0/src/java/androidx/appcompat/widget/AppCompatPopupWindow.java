package androidx.appcompat.widget;

import android.os.Build;
import androidx.core.widget.PopupWindowCompat;
import android.view.View;
import androidx.appcompat.R;
import androidx.annotation.StyleRes;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.widget.PopupWindow;

class AppCompatPopupWindow extends PopupWindow
{
    private static final boolean COMPAT_OVERLAP_ANCHOR;
    private boolean mOverlapAnchor;
    
    public AppCompatPopupWindow(@NonNull final Context context, @Nullable final AttributeSet attrs, @AttrRes final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.init(context, attrs, defStyleAttr, 0);
    }
    
    public AppCompatPopupWindow(@NonNull final Context context, @Nullable final AttributeSet attrs, @AttrRes final int defStyleAttr, @StyleRes final int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.init(context, attrs, defStyleAttr, defStyleRes);
    }
    
    private void init(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(context, attrs, R.styleable.PopupWindow, defStyleAttr, defStyleRes);
        if (a.hasValue(R.styleable.PopupWindow_overlapAnchor)) {
            this.setSupportOverlapAnchor(a.getBoolean(R.styleable.PopupWindow_overlapAnchor, false));
        }
        this.setBackgroundDrawable(a.getDrawable(R.styleable.PopupWindow_android_popupBackground));
        a.recycle();
    }
    
    public void showAsDropDown(final View anchor, final int xoff, int yoff) {
        if (AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff);
    }
    
    public void showAsDropDown(final View anchor, final int xoff, int yoff, final int gravity) {
        if (AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            yoff -= anchor.getHeight();
        }
        super.showAsDropDown(anchor, xoff, yoff, gravity);
    }
    
    public void update(final View anchor, final int xoff, int yoff, final int width, final int height) {
        if (AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR && this.mOverlapAnchor) {
            yoff -= anchor.getHeight();
        }
        super.update(anchor, xoff, yoff, width, height);
    }
    
    private void setSupportOverlapAnchor(final boolean overlapAnchor) {
        if (AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = overlapAnchor;
        }
        else {
            PopupWindowCompat.setOverlapAnchor((PopupWindow)this, overlapAnchor);
        }
    }
    
    static {
        COMPAT_OVERLAP_ANCHOR = (Build.VERSION.SDK_INT < 21);
    }
}
