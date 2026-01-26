package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.widget.FrameLayout;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class FitWindowsFrameLayout extends FrameLayout implements FitWindowsViewGroup
{
    private OnFitSystemWindowsListener mListener;
    
    public FitWindowsFrameLayout(@NonNull final Context context) {
        super(context);
    }
    
    public FitWindowsFrameLayout(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(context, attrs);
    }
    
    public void setOnFitSystemWindowsListener(final OnFitSystemWindowsListener listener) {
        this.mListener = listener;
    }
    
    protected boolean fitSystemWindows(final Rect insets) {
        if (this.mListener != null) {
            this.mListener.onFitSystemWindows(insets);
        }
        return super.fitSystemWindows(insets);
    }
}
