package androidx.appcompat.text;

import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import java.util.Locale;
import androidx.annotation.RestrictTo;
import android.text.method.TransformationMethod;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public class AllCapsTransformationMethod implements TransformationMethod
{
    private Locale mLocale;
    
    public AllCapsTransformationMethod(final Context context) {
        this.mLocale = context.getResources().getConfiguration().locale;
    }
    
    public CharSequence getTransformation(final CharSequence source, final View view) {
        return (CharSequence)((source != null) ? source.toString().toUpperCase(this.mLocale) : null);
    }
    
    public void onFocusChanged(final View view, final CharSequence sourceText, final boolean focused, final int direction, final Rect previouslyFocusedRect) {
    }
}
