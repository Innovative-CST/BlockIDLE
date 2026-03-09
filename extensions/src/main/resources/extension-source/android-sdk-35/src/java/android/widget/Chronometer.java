package android.widget;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

@RemoteViews.RemoteView
public class Chronometer extends TextView
{
    public Chronometer(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Chronometer(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Chronometer(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public Chronometer(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setCountDown(final boolean countDown) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isCountDown() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTheFinalCountDown() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBase(final long base) {
        throw new RuntimeException("Stub!");
    }
    
    public long getBase() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFormat(final String format) {
        throw new RuntimeException("Stub!");
    }
    
    public String getFormat() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnChronometerTickListener(final OnChronometerTickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public OnChronometerTickListener getOnChronometerTickListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void start() {
        throw new RuntimeException("Stub!");
    }
    
    public void stop() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onWindowVisibilityChanged(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onVisibilityChanged(final View changedView, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getContentDescription() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnChronometerTickListener
    {
        void onChronometerTick(final Chronometer p0);
    }
}
