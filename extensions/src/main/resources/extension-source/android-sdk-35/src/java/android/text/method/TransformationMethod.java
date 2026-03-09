package android.text.method;

import android.graphics.Rect;
import android.view.View;

public interface TransformationMethod
{
    CharSequence getTransformation(final CharSequence p0, final View p1);
    
    void onFocusChanged(final View p0, final CharSequence p1, final boolean p2, final int p3, final Rect p4);
}
