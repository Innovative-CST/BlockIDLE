package androidx.appcompat.widget;

import androidx.annotation.RequiresApi;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.graphics.drawable.AnimationDrawable;
import androidx.annotation.VisibleForTesting;
import android.graphics.drawable.ClipDrawable;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.drawable.WrappedDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.graphics.Bitmap;
import android.widget.ProgressBar;

class AppCompatProgressBarHelper
{
    private static final int[] TINT_ATTRS;
    private final ProgressBar mView;
    private Bitmap mSampleTile;
    
    AppCompatProgressBarHelper(final ProgressBar view) {
        this.mView = view;
    }
    
    void loadFromAttributes(final AttributeSet attrs, final int defStyleAttr) {
        final TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mView.getContext(), attrs, AppCompatProgressBarHelper.TINT_ATTRS, defStyleAttr, 0);
        Drawable drawable = a.getDrawableIfKnown(0);
        if (drawable != null) {
            this.mView.setIndeterminateDrawable(this.tileifyIndeterminate(drawable));
        }
        drawable = a.getDrawableIfKnown(1);
        if (drawable != null) {
            this.mView.setProgressDrawable(this.tileify(drawable, false));
        }
        a.recycle();
    }
    
    @VisibleForTesting
    Drawable tileify(final Drawable drawable, final boolean clip) {
        if (drawable instanceof WrappedDrawable) {
            Drawable inner = ((WrappedDrawable)drawable).getWrappedDrawable();
            if (inner != null) {
                inner = this.tileify(inner, clip);
                ((WrappedDrawable)drawable).setWrappedDrawable(inner);
            }
        }
        else {
            if (drawable instanceof LayerDrawable) {
                final LayerDrawable background = (LayerDrawable)drawable;
                final int N = background.getNumberOfLayers();
                final Drawable[] outDrawables = new Drawable[N];
                for (int i = 0; i < N; ++i) {
                    final int id = background.getId(i);
                    outDrawables[i] = this.tileify(background.getDrawable(i), id == 16908301 || id == 16908303);
                }
                final LayerDrawable clone = new LayerDrawable(outDrawables);
                for (int j = 0; j < N; ++j) {
                    clone.setId(j, background.getId(j));
                    if (Build.VERSION.SDK_INT >= 23) {
                        Api23Impl.transferLayerProperties(background, clone, j);
                    }
                }
                return (Drawable)clone;
            }
            if (drawable instanceof BitmapDrawable) {
                final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                final Bitmap tileBitmap = bitmapDrawable.getBitmap();
                if (this.mSampleTile == null) {
                    this.mSampleTile = tileBitmap;
                }
                final ShapeDrawable shapeDrawable = new ShapeDrawable(this.getDrawableShape());
                final BitmapShader bitmapShader = new BitmapShader(tileBitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP);
                shapeDrawable.getPaint().setShader((Shader)bitmapShader);
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return (Drawable)(clip ? new ClipDrawable((Drawable)shapeDrawable, 3, 1) : shapeDrawable);
            }
        }
        return drawable;
    }
    
    private Drawable tileifyIndeterminate(Drawable drawable) {
        if (drawable instanceof AnimationDrawable) {
            final AnimationDrawable background = (AnimationDrawable)drawable;
            final int N = background.getNumberOfFrames();
            final AnimationDrawable newBg = new AnimationDrawable();
            newBg.setOneShot(background.isOneShot());
            for (int i = 0; i < N; ++i) {
                final Drawable frame = this.tileify(background.getFrame(i), true);
                frame.setLevel(10000);
                newBg.addFrame(frame, background.getDuration(i));
            }
            newBg.setLevel(10000);
            drawable = (Drawable)newBg;
        }
        return drawable;
    }
    
    private Shape getDrawableShape() {
        final float[] roundedCorners = { 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f };
        return (Shape)new RoundRectShape(roundedCorners, (RectF)null, (float[])null);
    }
    
    Bitmap getSampleTile() {
        return this.mSampleTile;
    }
    
    static {
        TINT_ATTRS = new int[] { 16843067, 16843068 };
    }
    
    @RequiresApi(23)
    private static class Api23Impl
    {
        public static void transferLayerProperties(final LayerDrawable src, final LayerDrawable dst, final int i) {
            dst.setLayerGravity(i, src.getLayerGravity(i));
            dst.setLayerWidth(i, src.getLayerWidth(i));
            dst.setLayerHeight(i, src.getLayerHeight(i));
            dst.setLayerInsetLeft(i, src.getLayerInsetLeft(i));
            dst.setLayerInsetRight(i, src.getLayerInsetRight(i));
            dst.setLayerInsetTop(i, src.getLayerInsetTop(i));
            dst.setLayerInsetBottom(i, src.getLayerInsetBottom(i));
            dst.setLayerInsetStart(i, src.getLayerInsetStart(i));
            dst.setLayerInsetEnd(i, src.getLayerInsetEnd(i));
        }
    }
}
