package android.widget;

import android.view.animation.Interpolator;
import android.content.Context;

public class Scroller
{
    public Scroller(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public Scroller(final Context context, final Interpolator interpolator) {
        throw new RuntimeException("Stub!");
    }
    
    public Scroller(final Context context, final Interpolator interpolator, final boolean flywheel) {
        throw new RuntimeException("Stub!");
    }
    
    public final void setFriction(final float friction) {
        throw new RuntimeException("Stub!");
    }
    
    public final boolean isFinished() {
        throw new RuntimeException("Stub!");
    }
    
    public final void forceFinished(final boolean finished) {
        throw new RuntimeException("Stub!");
    }
    
    public final int getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrX() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getCurrY() {
        throw new RuntimeException("Stub!");
    }
    
    public float getCurrVelocity() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getStartX() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getStartY() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getFinalX() {
        throw new RuntimeException("Stub!");
    }
    
    public final int getFinalY() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean computeScrollOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void startScroll(final int startX, final int startY, final int dx, final int dy) {
        throw new RuntimeException("Stub!");
    }
    
    public void startScroll(final int startX, final int startY, final int dx, final int dy, final int duration) {
        throw new RuntimeException("Stub!");
    }
    
    public void fling(final int startX, final int startY, final int velocityX, final int velocityY, final int minX, final int maxX, final int minY, final int maxY) {
        throw new RuntimeException("Stub!");
    }
    
    public void abortAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void extendDuration(final int extend) {
        throw new RuntimeException("Stub!");
    }
    
    public int timePassed() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFinalX(final int newX) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFinalY(final int newY) {
        throw new RuntimeException("Stub!");
    }
}
