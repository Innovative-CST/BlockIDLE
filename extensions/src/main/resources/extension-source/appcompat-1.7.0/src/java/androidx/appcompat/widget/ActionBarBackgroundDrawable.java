package androidx.appcompat.widget;

import androidx.annotation.RequiresApi;
import android.graphics.Outline;
import android.graphics.ColorFilter;
import androidx.annotation.NonNull;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

class ActionBarBackgroundDrawable extends Drawable
{
    final ActionBarContainer mContainer;
    
    public ActionBarBackgroundDrawable(final ActionBarContainer container) {
        this.mContainer = container;
    }
    
    public void draw(@NonNull final Canvas canvas) {
        if (this.mContainer.mIsSplit) {
            if (this.mContainer.mSplitBackground != null) {
                this.mContainer.mSplitBackground.draw(canvas);
            }
        }
        else {
            if (this.mContainer.mBackground != null) {
                this.mContainer.mBackground.draw(canvas);
            }
            if (this.mContainer.mStackedBackground != null && this.mContainer.mIsStacked) {
                this.mContainer.mStackedBackground.draw(canvas);
            }
        }
    }
    
    public void setAlpha(final int alpha) {
    }
    
    public void setColorFilter(final ColorFilter cf) {
    }
    
    public int getOpacity() {
        return 0;
    }
    
    @RequiresApi(21)
    public void getOutline(@NonNull final Outline outline) {
        if (this.mContainer.mIsSplit) {
            if (this.mContainer.mSplitBackground != null) {
                Api21Impl.getOutline(this.mContainer.mBackground, outline);
            }
        }
        else if (this.mContainer.mBackground != null) {
            Api21Impl.getOutline(this.mContainer.mBackground, outline);
        }
    }
    
    @RequiresApi(21)
    private static class Api21Impl
    {
        public static void getOutline(final Drawable drawable, final Outline outline) {
            drawable.getOutline(outline);
        }
    }
}
