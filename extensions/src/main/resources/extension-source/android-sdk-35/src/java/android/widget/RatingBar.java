package android.widget;

import android.util.AttributeSet;
import android.content.Context;

public class RatingBar extends AbsSeekBar
{
    public RatingBar(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public RatingBar(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public RatingBar(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public RatingBar(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setOnRatingBarChangeListener(final OnRatingBarChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public OnRatingBarChangeListener getOnRatingBarChangeListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIsIndicator(final boolean isIndicator) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isIndicator() {
        throw new RuntimeException("Stub!");
    }
    
    public void setNumStars(final int numStars) {
        throw new RuntimeException("Stub!");
    }
    
    public int getNumStars() {
        throw new RuntimeException("Stub!");
    }
    
    public void setRating(final float rating) {
        throw new RuntimeException("Stub!");
    }
    
    public float getRating() {
        throw new RuntimeException("Stub!");
    }
    
    public void setStepSize(final float stepSize) {
        throw new RuntimeException("Stub!");
    }
    
    public float getStepSize() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected synchronized void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public synchronized void setMax(final int max) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnRatingBarChangeListener
    {
        void onRatingChanged(final RatingBar p0, final float p1, final boolean p2);
    }
}
