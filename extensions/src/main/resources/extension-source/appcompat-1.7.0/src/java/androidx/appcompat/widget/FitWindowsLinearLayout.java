package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.annotation.RestrictTo;
import android.widget.LinearLayout;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class FitWindowsLinearLayout extends LinearLayout implements FitWindowsViewGroup
{
    private OnFitSystemWindowsListener mListener;
    
    public FitWindowsLinearLayout(@NonNull final Context context) {
        super(context);
    }
    
    public FitWindowsLinearLayout(@NonNull final Context context, @Nullable final AttributeSet attrs) {
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
