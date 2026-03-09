package android.widget;

import android.graphics.ColorFilter;
import android.view.ViewDebug;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.content.res.ColorStateList;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

@RemoteViews.RemoteView
public class ImageView extends View
{
    public ImageView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ImageView(final Context context, @Nullable final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ImageView(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ImageView(final Context context, @Nullable final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean verifyDrawable(@NonNull final Drawable dr) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpDrawablesToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void invalidateDrawable(@NonNull final Drawable dr) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasOverlappingRendering() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getAdjustViewBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAdjustViewBounds(final boolean adjustViewBounds) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxWidth(final int maxWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMaxHeight(final int maxHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageResource(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageURI(@Nullable final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageDrawable(@Nullable final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageIcon(@Nullable final Icon icon) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getImageTintList() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public PorterDuff.Mode getImageTintMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getImageTintBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageBitmap(final Bitmap bm) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageState(final int[] state, final boolean merge) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSelected(final boolean selected) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageLevel(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScaleType(final ScaleType scaleType) {
        throw new RuntimeException("Stub!");
    }
    
    public ScaleType getScaleType() {
        throw new RuntimeException("Stub!");
    }
    
    public Matrix getImageMatrix() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageMatrix(final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getCropToPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCropToPadding(final boolean cropToPadding) {
        throw new RuntimeException("Stub!");
    }
    
    public int[] onCreateDrawableState(final int extraSpace) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean setFrame(final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void drawableStateChanged() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void drawableHotspotChanged(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void animateTransform(@Nullable final Matrix matrix) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.ExportedProperty(category = "layout")
    @Override
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBaseline(final int baseline) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBaselineAlignBottom(final boolean aligned) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getBaselineAlignBottom() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setColorFilter(final int color, final PorterDuff.Mode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setColorFilter(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public final void clearColorFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public ColorFilter getColorFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorFilter(final ColorFilter cf) {
        throw new RuntimeException("Stub!");
    }
    
    public int getImageAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isOpaque() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onVisibilityAggregated(final boolean isVisible) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setVisibility(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public enum ScaleType
    {
        MATRIX, 
        FIT_XY, 
        FIT_START, 
        FIT_CENTER, 
        FIT_END, 
        CENTER, 
        CENTER_CROP, 
        CENTER_INSIDE;
    }
}
