package android.graphics.drawable;

import android.graphics.Outline;
import android.graphics.Insets;
import android.graphics.Rect;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class InsetDrawable extends DrawableWrapper
{
    public InsetDrawable(@Nullable final Drawable drawable, final int inset) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public InsetDrawable(@Nullable final Drawable drawable, final float inset) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public InsetDrawable(@Nullable final Drawable drawable, final int insetLeft, final int insetTop, final int insetRight, final int insetBottom) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public InsetDrawable(@Nullable final Drawable drawable, final float insetLeftFraction, final float insetTopFraction, final float insetRightFraction, final float insetBottomFraction) {
        super(null);
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
    public boolean getPadding(final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Insets getOpticalInsets() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getOpacity() {
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
    public void getOutline(@NonNull final Outline outline) {
        throw new RuntimeException("Stub!");
    }
}
