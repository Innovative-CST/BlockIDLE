package androidx.appcompat.widget;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import android.view.View;

public class TooltipCompat
{
    public static void setTooltipText(@NonNull final View view, @Nullable final CharSequence tooltipText) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.setTooltipText(view, tooltipText);
        }
        else {
            TooltipCompatHandler.setTooltipText(view, tooltipText);
        }
    }
    
    private TooltipCompat() {
    }
    
    @RequiresApi(26)
    static class Api26Impl
    {
        private Api26Impl() {
        }
        
        @DoNotInline
        static void setTooltipText(final View view, final CharSequence tooltipText) {
            view.setTooltipText(tooltipText);
        }
    }
}
