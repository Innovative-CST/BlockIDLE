package android.gesture;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.graphics.Path;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class GestureOverlayView extends FrameLayout
{
    public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;
    public static final int GESTURE_STROKE_TYPE_SINGLE = 0;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    
    public GestureOverlayView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GestureOverlayView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GestureOverlayView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public GestureOverlayView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ArrayList<GesturePoint> getCurrentStroke() {
        throw new RuntimeException("Stub!");
    }
    
    public int getOrientation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOrientation(final int orientation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUncertainGestureColor(final int color) {
        throw new RuntimeException("Stub!");
    }
    
    public int getUncertainGestureColor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getGestureColor() {
        throw new RuntimeException("Stub!");
    }
    
    public float getGestureStrokeWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureStrokeWidth(final float gestureStrokeWidth) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGestureStrokeType() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureStrokeType(final int gestureStrokeType) {
        throw new RuntimeException("Stub!");
    }
    
    public float getGestureStrokeLengthThreshold() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureStrokeLengthThreshold(final float gestureStrokeLengthThreshold) {
        throw new RuntimeException("Stub!");
    }
    
    public float getGestureStrokeSquarenessTreshold() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureStrokeSquarenessTreshold(final float gestureStrokeSquarenessTreshold) {
        throw new RuntimeException("Stub!");
    }
    
    public float getGestureStrokeAngleThreshold() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureStrokeAngleThreshold(final float gestureStrokeAngleThreshold) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isEventsInterceptionEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEventsInterceptionEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFadeEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFadeEnabled(final boolean fadeEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public Gesture getGesture() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGesture(final Gesture gesture) {
        throw new RuntimeException("Stub!");
    }
    
    public Path getGesturePath() {
        throw new RuntimeException("Stub!");
    }
    
    public Path getGesturePath(final Path path) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGestureVisible() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGestureVisible(final boolean visible) {
        throw new RuntimeException("Stub!");
    }
    
    public long getFadeOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFadeOffset(final long fadeOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnGestureListener(final OnGestureListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnGestureListener(final OnGestureListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllOnGestureListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnGesturePerformedListener(final OnGesturePerformedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnGesturePerformedListener(final OnGesturePerformedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllOnGesturePerformedListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnGesturingListener(final OnGesturingListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnGesturingListener(final OnGesturingListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllOnGesturingListeners() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGesturing() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void clear(final boolean animated) {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelClearAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancelGesture() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean dispatchTouchEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnGesturingListener
    {
        void onGesturingStarted(final GestureOverlayView p0);
        
        void onGesturingEnded(final GestureOverlayView p0);
    }
    
    public interface OnGesturePerformedListener
    {
        void onGesturePerformed(final GestureOverlayView p0, final Gesture p1);
    }
    
    public interface OnGestureListener
    {
        void onGestureStarted(final GestureOverlayView p0, final MotionEvent p1);
        
        void onGesture(final GestureOverlayView p0, final MotionEvent p1);
        
        void onGestureEnded(final GestureOverlayView p0, final MotionEvent p1);
        
        void onGestureCancelled(final GestureOverlayView p0, final MotionEvent p1);
    }
}
