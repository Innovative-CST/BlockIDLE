package android.graphics.drawable;

import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.BlendMode;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.graphics.Canvas;
import android.graphics.Paint;
import java.io.InputStream;
import android.graphics.Bitmap;
import android.content.res.Resources;

public class BitmapDrawable extends Drawable
{
    @Deprecated
    public BitmapDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public BitmapDrawable(final Resources res) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public BitmapDrawable(final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public BitmapDrawable(final Resources res, final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public BitmapDrawable(final String filepath) {
        throw new RuntimeException("Stub!");
    }
    
    public BitmapDrawable(final Resources res, final String filepath) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public BitmapDrawable(final InputStream is) {
        throw new RuntimeException("Stub!");
    }
    
    public BitmapDrawable(final Resources res, final InputStream is) {
        throw new RuntimeException("Stub!");
    }
    
    public final Paint getPaint() {
        throw new RuntimeException("Stub!");
    }
    
    public final Bitmap getBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBitmap(@Nullable final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetDensity(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetDensity(final DisplayMetrics metrics) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTargetDensity(final int density) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setMipMap(final boolean mipMap) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasMipMap() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAntiAlias(final boolean aa) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasAntiAlias() {
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
    public void setDither(final boolean dither) {
        throw new RuntimeException("Stub!");
    }
    
    public Shader.TileMode getTileModeX() {
        throw new RuntimeException("Stub!");
    }
    
    public Shader.TileMode getTileModeY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTileModeX(final Shader.TileMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setTileModeY(final Shader.TileMode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTileModeXY(final Shader.TileMode xmode, final Shader.TileMode ymode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAutoMirrored(final boolean mirrored) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean isAutoMirrored() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onBoundsChange(final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Insets getOpticalInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getOutline(@NonNull final Outline outline) {
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
    public ColorFilter getColorFilter() {
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
    
    @Override
    public void inflate(final Resources r, final XmlPullParser parser, final AttributeSet attrs, final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void applyTheme(final Resources.Theme t) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean canApplyTheme() {
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
    public final ConstantState getConstantState() {
        throw new RuntimeException("Stub!");
    }
}
