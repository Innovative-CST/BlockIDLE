package android.graphics.drawable;

import android.graphics.Outline;
import android.graphics.Insets;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.content.res.ColorStateList;
import android.graphics.Rect;

public class GradientDrawable extends Drawable
{
    public static final int LINE = 2;
    public static final int LINEAR_GRADIENT = 0;
    public static final int OVAL = 1;
    public static final int RADIAL_GRADIENT = 1;
    public static final int RECTANGLE = 0;
    public static final int RING = 3;
    public static final int SWEEP_GRADIENT = 2;
    
    public GradientDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public GradientDrawable(final Orientation orientation, final int[] colors) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean getPadding(final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCornerRadii(@Nullable final float[] radii) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public float[] getCornerRadii() {
        throw new RuntimeException("Stub!");
    }
    
    public void setCornerRadius(final float radius) {
        throw new RuntimeException("Stub!");
    }
    
    public float getCornerRadius() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStroke(final int width, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStroke(final int width, final ColorStateList colorStateList) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStroke(final int width, final int color, final float dashWidth, final float dashGap) {
        throw new RuntimeException("Stub!");
    }
    
    public void setStroke(final int width, final ColorStateList colorStateList, final float dashWidth, final float dashGap) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSize(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShape(final int shape) {
        throw new RuntimeException("Stub!");
    }
    
    public int getShape() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGradientType(final int gradient) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGradientType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGradientCenter(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public float getGradientCenterX() {
        throw new RuntimeException("Stub!");
    }
    
    public float getGradientCenterY() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGradientRadius(final float gradientRadius) {
        throw new RuntimeException("Stub!");
    }
    
    public float getGradientRadius() {
        throw new RuntimeException("Stub!");
    }
    
    public void setUseLevel(final boolean useLevel) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getUseLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public Orientation getOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrientation(final Orientation orientation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColors(@Nullable final int[] colors) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColors(@Nullable final int[] colors, @Nullable final float[] offsets) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public int[] getColors() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInnerRadiusRatio(final float innerRadiusRatio) {
        throw new RuntimeException("Stub!");
    }
    
    public float getInnerRadiusRatio() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInnerRadius(final int innerRadius) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInnerRadius() {
        throw new RuntimeException("Stub!");
    }
    
    public void setThicknessRatio(final float thicknessRatio) {
        throw new RuntimeException("Stub!");
    }
    
    public float getThicknessRatio() {
        throw new RuntimeException("Stub!");
    }
    
    public void setThickness(final int thickness) {
        throw new RuntimeException("Stub!");
    }
    
    public int getThickness() {
        throw new RuntimeException("Stub!");
    }
    
    public void setPadding(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColor(final int argb) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColor(@Nullable final ColorStateList colorStateList) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorStateList getColor() {
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
    public int getChangingConfigurations() {
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
    public void setDither(final boolean dither) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    @Override
    public ColorFilter getColorFilter() {
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
    public void setTintBlendMode(@NonNull final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getOpacity() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onBoundsChange(final Rect r) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean onLevelChange(final int level) {
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
    public int getIntrinsicWidth() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getIntrinsicHeight() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Insets getOpticalInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ConstantState getConstantState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void getOutline(final Outline outline) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }
    
    public enum Orientation
    {
        TOP_BOTTOM, 
        TR_BL, 
        RIGHT_LEFT, 
        BR_TL, 
        BOTTOM_TOP, 
        BL_TR, 
        LEFT_RIGHT, 
        TL_BR;
    }
}
