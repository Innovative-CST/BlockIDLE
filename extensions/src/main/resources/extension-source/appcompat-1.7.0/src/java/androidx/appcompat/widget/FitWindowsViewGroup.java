package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public interface FitWindowsViewGroup
{
    void setOnFitSystemWindowsListener(final OnFitSystemWindowsListener p0);
    
    public interface OnFitSystemWindowsListener
    {
        void onFitSystemWindows(final Rect p0);
    }
}
