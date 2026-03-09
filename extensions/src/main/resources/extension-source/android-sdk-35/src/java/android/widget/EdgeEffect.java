package android.widget;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.BlendMode;

public class EdgeEffect
{
    public static final BlendMode DEFAULT_BLEND_MODE;
    
    public EdgeEffect(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public EdgeEffect(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSize(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFinished() {
        throw new RuntimeException("Stub!");
    }
    
    public void finish() {
        throw new RuntimeException("Stub!");
    }
    
    public void onPull(final float deltaDistance) {
        throw new RuntimeException("Stub!");
    }
    
    public void onPull(final float deltaDistance, final float displacement) {
        throw new RuntimeException("Stub!");
    }
    
    public float onPullDistance(final float deltaDistance, final float displacement) {
        throw new RuntimeException("Stub!");
    }
    
    public float getDistance() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRelease() {
        throw new RuntimeException("Stub!");
    }
    
    public void onAbsorb(final int velocity) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBlendMode(@Nullable final BlendMode blendmode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getColor() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public BlendMode getBlendMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxHeight() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        DEFAULT_BLEND_MODE = null;
    }
}
