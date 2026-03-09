package android.view;

import android.content.Context;
import android.os.Handler;

public class GestureDetector
{
    @Deprecated
    public GestureDetector(@NonNull final OnGestureListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public GestureDetector(@NonNull final OnGestureListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public GestureDetector(@Nullable final Context context, @NonNull final OnGestureListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public GestureDetector(@Nullable final Context context, @NonNull final OnGestureListener listener, @Nullable final Handler handler) {
        throw new RuntimeException("Stub!");
    }
    
    public GestureDetector(@Nullable final Context context, @NonNull final OnGestureListener listener, @Nullable final Handler handler, final boolean unused) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDoubleTapListener(@Nullable final OnDoubleTapListener onDoubleTapListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContextClickListener(@Nullable final OnContextClickListener onContextClickListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIsLongpressEnabled(final boolean isLongpressEnabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLongpressEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onTouchEvent(@NonNull final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onGenericMotionEvent(@NonNull final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    public static class SimpleOnGestureListener implements OnGestureListener, OnDoubleTapListener, OnContextClickListener
    {
        public SimpleOnGestureListener() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onSingleTapUp(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onLongPress(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onScroll(@Nullable final MotionEvent e1, @NonNull final MotionEvent e2, final float distanceX, final float distanceY) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onFling(@Nullable final MotionEvent e1, @NonNull final MotionEvent e2, final float velocityX, final float velocityY) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void onShowPress(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onDown(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onDoubleTap(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onDoubleTapEvent(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onSingleTapConfirmed(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public boolean onContextClick(@NonNull final MotionEvent e) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnGestureListener
    {
        boolean onDown(@NonNull final MotionEvent p0);
        
        void onShowPress(@NonNull final MotionEvent p0);
        
        boolean onSingleTapUp(@NonNull final MotionEvent p0);
        
        boolean onScroll(@Nullable final MotionEvent p0, @NonNull final MotionEvent p1, final float p2, final float p3);
        
        void onLongPress(@NonNull final MotionEvent p0);
        
        boolean onFling(@Nullable final MotionEvent p0, @NonNull final MotionEvent p1, final float p2, final float p3);
    }
    
    public interface OnDoubleTapListener
    {
        boolean onSingleTapConfirmed(@NonNull final MotionEvent p0);
        
        boolean onDoubleTap(@NonNull final MotionEvent p0);
        
        boolean onDoubleTapEvent(@NonNull final MotionEvent p0);
    }
    
    public interface OnContextClickListener
    {
        boolean onContextClick(@NonNull final MotionEvent p0);
    }
}
