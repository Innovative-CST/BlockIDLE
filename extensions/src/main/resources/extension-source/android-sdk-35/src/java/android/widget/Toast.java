package android.widget;

import android.content.res.Resources;
import android.view.View;
import android.content.Context;

public class Toast
{
    public static final int LENGTH_LONG = 1;
    public static final int LENGTH_SHORT = 0;
    
    public Toast(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public void show() {
        throw new RuntimeException("Stub!");
    }
    
    public void cancel() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Nullable
    public View getView() {
        throw new RuntimeException("Stub!");
    }
    
    public void setDuration(final int duration) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDuration() {
        throw new RuntimeException("Stub!");
    }
    
    public void setMargin(final float horizontalMargin, final float verticalMargin) {
        throw new RuntimeException("Stub!");
    }
    
    public float getHorizontalMargin() {
        throw new RuntimeException("Stub!");
    }
    
    public float getVerticalMargin() {
        throw new RuntimeException("Stub!");
    }
    
    public void setGravity(final int gravity, final int xOffset, final int yOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getGravity() {
        throw new RuntimeException("Stub!");
    }
    
    public int getXOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public int getYOffset() {
        throw new RuntimeException("Stub!");
    }
    
    public void addCallback(@NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeCallback(@NonNull final Callback callback) {
        throw new RuntimeException("Stub!");
    }
    
    public static Toast makeText(final Context context, final CharSequence text, final int duration) {
        throw new RuntimeException("Stub!");
    }
    
    public static Toast makeText(final Context context, final int resId, final int duration) throws Resources.NotFoundException {
        throw new RuntimeException("Stub!");
    }
    
    public void setText(final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setText(final CharSequence s) {
        throw new RuntimeException("Stub!");
    }
    
    public abstract static class Callback
    {
        public Callback() {
            throw new RuntimeException("Stub!");
        }
        
        public void onToastShown() {
            throw new RuntimeException("Stub!");
        }
        
        public void onToastHidden() {
            throw new RuntimeException("Stub!");
        }
    }
}
