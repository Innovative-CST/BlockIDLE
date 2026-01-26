package android.graphics.drawable;

import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import android.graphics.BitmapFactory;
import android.util.TypedValue;
import java.io.InputStream;
import android.graphics.Outline;
import android.graphics.Insets;
import android.graphics.Region;
import android.content.res.Resources;
import android.graphics.BlendMode;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;

public abstract class Drawable
{
    public Drawable() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void draw(@NonNull final Canvas p0);
    
    public void setBounds(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBounds(@NonNull final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public final void copyBounds(@NonNull final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Rect copyBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public final Rect getBounds() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Rect getDirtyBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public void setChangingConfigurations(final int configs) {
        throw new RuntimeException("Stub!");
    }
    
    public int getChangingConfigurations() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setDither(final boolean dither) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFilterBitmap(final boolean filter) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFilterBitmap() {
        throw new RuntimeException("Stub!");
    }
    
    public final void setCallback(@Nullable final Callback cb) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Callback getCallback() {
        throw new RuntimeException("Stub!");
    }
    
    public void invalidateSelf() {
        throw new RuntimeException("Stub!");
    }
    
    public void scheduleSelf(@NonNull final Runnable what, final long when) {
        throw new RuntimeException("Stub!");
    }
    
    public void unscheduleSelf(@NonNull final Runnable what) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayoutDirection() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean setLayoutDirection(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onLayoutDirectionChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setAlpha(final int p0);
    
    public int getAlpha() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setColorFilter(@Nullable final ColorFilter p0);
    
    @Deprecated
    public void setColorFilter(final int color, @NonNull final PorterDuff.Mode mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTint(final int tintColor) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTintList(@Nullable final ColorStateList tint) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTintMode(@Nullable final PorterDuff.Mode tintMode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTintBlendMode(@Nullable final BlendMode blendMode) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ColorFilter getColorFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public void clearColorFilter() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHotspot(final float x, final float y) {
        throw new RuntimeException("Stub!");
    }
    
    public void setHotspotBounds(final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void getHotspotBounds(@NonNull final Rect outRect) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isProjected() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isStateful() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean hasFocusStateSpecified() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setState(@NonNull final int[] stateSet) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public int[] getState() {
        throw new RuntimeException("Stub!");
    }
    
    public void jumpToCurrentState() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Drawable getCurrent() {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean setLevel(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getLevel() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setVisible(final boolean visible, final boolean restart) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isVisible() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAutoMirrored(final boolean mirrored) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAutoMirrored() {
        throw new RuntimeException("Stub!");
    }
    
    public void applyTheme(@NonNull final Resources.Theme t) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean canApplyTheme() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract int getOpacity();
    
    public static int resolveOpacity(final int op1, final int op2) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Region getTransparentRegion() {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean onStateChange(@NonNull final int[] state) {
        throw new RuntimeException("Stub!");
    }
    
    protected boolean onLevelChange(final int level) {
        throw new RuntimeException("Stub!");
    }
    
    protected void onBoundsChange(@NonNull final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public int getIntrinsicWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getIntrinsicHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMinimumHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getPadding(@NonNull final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Insets getOpticalInsets() {
        throw new RuntimeException("Stub!");
    }
    
    public void getOutline(@NonNull final Outline outline) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public Drawable mutate() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Drawable createFromStream(@Nullable final InputStream is, @Nullable final String srcName) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Drawable createFromResourceStream(@Nullable final Resources res, @Nullable final TypedValue value, @Nullable final InputStream is, @Nullable final String srcName) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public static Drawable createFromResourceStream(@Nullable final Resources res, @Nullable final TypedValue value, @Nullable final InputStream is, @Nullable final String srcName, @Nullable final BitmapFactory.Options opts) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Drawable createFromXml(@NonNull final Resources r, @NonNull final XmlPullParser parser) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Drawable createFromXml(@NonNull final Resources r, @NonNull final XmlPullParser parser, @Nullable final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Drawable createFromXmlInner(@NonNull final Resources r, @NonNull final XmlPullParser parser, @NonNull final AttributeSet attrs) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static Drawable createFromXmlInner(@NonNull final Resources r, @NonNull final XmlPullParser parser, @NonNull final AttributeSet attrs, @Nullable final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public static Drawable createFromPath(final String pathName) {
        throw new RuntimeException("Stub!");
    }
    
    public void inflate(@NonNull final Resources r, @NonNull final XmlPullParser parser, @NonNull final AttributeSet attrs) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    public void inflate(@NonNull final Resources r, @NonNull final XmlPullParser parser, @NonNull final AttributeSet attrs, @Nullable final Resources.Theme theme) throws IOException, XmlPullParserException {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public ConstantState getConstantState() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class ConstantState
    {
        public ConstantState() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public abstract Drawable newDrawable();
        
        @NonNull
        public Drawable newDrawable(@Nullable final Resources res) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public Drawable newDrawable(@Nullable final Resources res, @Nullable final Resources.Theme theme) {
            throw new RuntimeException("Stub!");
        }
        
        public abstract int getChangingConfigurations();
        
        public boolean canApplyTheme() {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface Callback
    {
        void invalidateDrawable(@NonNull final Drawable p0);
        
        void scheduleDrawable(@NonNull final Drawable p0, @NonNull final Runnable p1, final long p2);
        
        void unscheduleDrawable(@NonNull final Drawable p0, @NonNull final Runnable p1);
    }
}
