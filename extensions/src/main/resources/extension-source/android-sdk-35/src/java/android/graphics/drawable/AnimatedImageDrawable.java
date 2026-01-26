package android.graphics.drawable;

import android.graphics.Rect;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import org.xmlpull.v1.XmlPullParserException;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;

public class AnimatedImageDrawable extends Drawable implements Animatable2
{
    public static final int REPEAT_INFINITE = -1;
    
    public AnimatedImageDrawable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRepeatCount(final int repeatCount) {
        throw new RuntimeException("Stub!");
    }
    
    public int getRepeatCount() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void inflate(final Resources r, final XmlPullParser parser, final AttributeSet attrs, final Resources.Theme theme) throws IOException, XmlPullParserException {
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
    public void draw(@NonNull final Canvas canvas) {
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
    
    @Nullable
    @Override
    public ColorFilter getColorFilter() {
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
    public boolean onLayoutDirectionChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public final boolean isAutoMirrored() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean isRunning() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void stop() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void registerAnimationCallback(@NonNull final AnimationCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean unregisterAnimationCallback(@NonNull final AnimationCallback callback) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void clearAnimationCallbacks() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onBoundsChange(final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
}
