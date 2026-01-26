package android.graphics.drawable;

import android.graphics.BlendMode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.Canvas;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class LayerDrawable extends Drawable implements Callback
{
    public static final int INSET_UNDEFINED = Integer.MIN_VALUE;
    public static final int PADDING_MODE_NEST = 0;
    public static final int PADDING_MODE_STACK = 1;
    
    public LayerDrawable(@NonNull final Drawable[] layers) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void inflate(@NonNull final Resources r, @NonNull final XmlPullParser parser, @NonNull final AttributeSet attrs, @Nullable final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void applyTheme(@NonNull final Resources.Theme t) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canApplyTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isProjected() {
        throw new RuntimeException("Stub!");
    }
    
    public int addLayer(final Drawable dr) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable findDrawableByLayerId(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setId(final int index, final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public int getId(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumberOfLayers() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setDrawableByLayerId(final int id, final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public int findIndexByLayerId(final int id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDrawable(final int index, final Drawable drawable) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getDrawable(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerSize(final int index, final int w, final int h) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerWidth(final int index, final int w) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerWidth(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerHeight(final int index, final int h) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerHeight(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerGravity(final int index, final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerGravity(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInset(final int index, final int l, final int t, final int r, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInsetRelative(final int index, final int s, final int t, final int e, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInsetLeft(final int index, final int l) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerInsetLeft(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInsetRight(final int index, final int r) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerInsetRight(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInsetTop(final int index, final int t) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerInsetTop(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInsetBottom(final int index, final int b) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerInsetBottom(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInsetStart(final int index, final int s) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerInsetStart(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayerInsetEnd(final int index, final int e) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayerInsetEnd(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPaddingMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPaddingMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void invalidateDrawable(@NonNull final Drawable who) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void scheduleDrawable(@NonNull final Drawable who, @NonNull final Runnable what, final long when) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void unscheduleDrawable(@NonNull final Drawable who, @NonNull final Runnable what) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getPadding(final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPadding(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPaddingRelative(final int start, final int top, final int end, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLeftPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public int getRightPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public int getStartPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public int getEndPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public int getTopPadding() {
        throw new RuntimeException("Stub!");
    }
    
    public int getBottomPadding() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getOutline(@NonNull final Outline outline) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setHotspot(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setHotspotBounds(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getHotspotBounds(final Rect outRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean setVisible(final boolean visible, final boolean restart) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDither(final boolean dither) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAlpha(final int alpha) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setColorFilter(final ColorFilter colorFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintList(final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintBlendMode(@NonNull final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOpacity(final int opacity) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getOpacity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAutoMirrored(final boolean mirrored) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isAutoMirrored() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void jumpToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean hasFocusStateSpecified() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onStateChange(final int[] state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onLevelChange(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onBoundsChange(final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIntrinsicWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIntrinsicHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ConstantState getConstantState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onLayoutDirectionChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
}
