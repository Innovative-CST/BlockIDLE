package android.inputmethodservice;

import android.view.MotionEvent;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;

@Deprecated
public class KeyboardView extends View implements OnClickListener
{
    @Deprecated
    public KeyboardView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public KeyboardView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public KeyboardView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    protected void onAttachedToWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setOnKeyboardActionListener(final OnKeyboardActionListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected OnKeyboardActionListener getOnKeyboardActionListener() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setKeyboard(final Keyboard keyboard) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public Keyboard getKeyboard() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean setShifted(final boolean shifted) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isShifted() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPreviewEnabled(final boolean previewEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isPreviewEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setVerticalCorrection(final int verticalOffset) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPopupParent(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPopupOffset(final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setProximityCorrectionEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isProximityCorrectionEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public void onClick(final View v) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onSizeChanged(final int w, final int h, final int oldw, final int oldh) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void invalidateAllKeys() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void invalidateKey(final int keyIndex) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected boolean onLongPress(final Keyboard.Key popupKey) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onHoverEvent(final MotionEvent event) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onTouchEvent(final MotionEvent me) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void swipeRight() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void swipeLeft() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void swipeUp() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    protected void swipeDown() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void closing() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean handleBack() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public interface OnKeyboardActionListener
    {
        @Deprecated
        void onPress(final int p0);
        
        @Deprecated
        void onRelease(final int p0);
        
        @Deprecated
        void onKey(final int p0, final int[] p1);
        
        @Deprecated
        void onText(final CharSequence p0);
        
        @Deprecated
        void swipeLeft();
        
        @Deprecated
        void swipeRight();
        
        @Deprecated
        void swipeDown();
        
        @Deprecated
        void swipeUp();
    }
}
