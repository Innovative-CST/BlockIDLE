package android.graphics.drawable;

import android.graphics.Region;
import android.graphics.Paint;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.BlendMode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Insets;
import android.graphics.Outline;
import android.util.DisplayMetrics;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Bitmap;

public class NinePatchDrawable extends Drawable
{
    @Deprecated
    public NinePatchDrawable(final Bitmap bitmap, final byte[] chunk, final Rect padding, final String srcName) {
        throw new RuntimeException("Stub!");
    }
    
    public NinePatchDrawable(final Resources res, final Bitmap bitmap, final byte[] chunk, final Rect padding, final String srcName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public NinePatchDrawable(@NonNull final NinePatch patch) {
        throw new RuntimeException("Stub!");
    }
    
    public NinePatchDrawable(@Nullable final Resources res, @NonNull final NinePatch patch) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetDensity(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetDensity(@NonNull final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetDensity(final int density) {
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
    public boolean getPadding(@NonNull final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getOutline(@NonNull final Outline outline) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Insets getOpticalInsets() {
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
    public void setColorFilter(@Nullable final ColorFilter colorFilter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setDither(final boolean dither) {
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
    public void setFilterBitmap(final boolean filter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isFilterBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void inflate(final Resources r, final XmlPullParser parser, final AttributeSet attrs, final Resources.Theme theme) throws IOException, XmlPullParserException {
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
    
    @NonNull
    public Paint getPaint() {
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
    public int getOpacity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Region getTransparentRegion() {
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
    protected boolean onStateChange(final int[] stateSet) {
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
}
