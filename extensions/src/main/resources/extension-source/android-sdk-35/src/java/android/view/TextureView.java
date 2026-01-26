package android.view;

import android.graphics.SurfaceTexture;
import android.graphics.Rect;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.content.Context;

public class TextureView extends View
{
    public TextureView(@NonNull final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextureView(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextureView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public TextureView(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOpaque(final boolean opaque) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setLayerType(final int layerType, @Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setLayerPaint(@Nullable final Paint paint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getLayerType() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void buildLayer() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setForeground(final Drawable foreground) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setBackgroundDrawable(final Drawable background) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected final void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onVisibilityChanged(final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTransform(@Nullable final Matrix transform) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Matrix getTransform(@Nullable final Matrix transform) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Bitmap getBitmap(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Bitmap getBitmap(@NonNull final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAvailable() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Canvas lockCanvas() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Canvas lockCanvas(@Nullable final Rect dirty) {
        throw new RuntimeException("Stub!");
    }
    
    public void unlockCanvasAndPost(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SurfaceTexture getSurfaceTexture() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurfaceTexture(@NonNull final SurfaceTexture surfaceTexture) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public SurfaceTextureListener getSurfaceTextureListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSurfaceTextureListener(@Nullable final SurfaceTextureListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface SurfaceTextureListener
    {
        void onSurfaceTextureAvailable(@NonNull final SurfaceTexture p0, final int p1, final int p2);
        
        void onSurfaceTextureSizeChanged(@NonNull final SurfaceTexture p0, final int p1, final int p2);
        
        boolean onSurfaceTextureDestroyed(@NonNull final SurfaceTexture p0);
        
        void onSurfaceTextureUpdated(@NonNull final SurfaceTexture p0);
    }
}
