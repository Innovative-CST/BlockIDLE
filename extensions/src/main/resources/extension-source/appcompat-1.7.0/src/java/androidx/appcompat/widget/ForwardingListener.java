package androidx.appcompat.widget;

import android.view.ViewParent;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.appcompat.view.menu.ShowableListMenu;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import android.view.View;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener
{
    private final float mScaledTouchSlop;
    private final int mTapTimeout;
    private final int mLongPressTimeout;
    final View mSrc;
    private Runnable mDisallowIntercept;
    private Runnable mTriggerLongPress;
    private boolean mForwarding;
    private int mActivePointerId;
    private final int[] mTmpLocation;
    
    public ForwardingListener(final View src) {
        this.mTmpLocation = new int[2];
        (this.mSrc = src).setLongClickable(true);
        src.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        this.mScaledTouchSlop = (float)ViewConfiguration.get(src.getContext()).getScaledTouchSlop();
        this.mTapTimeout = ViewConfiguration.getTapTimeout();
        this.mLongPressTimeout = (this.mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
    
    public abstract ShowableListMenu getPopup();
    
    public boolean onTouch(final View v, final MotionEvent event) {
        final boolean wasForwarding = this.mForwarding;
        boolean forwarding;
        if (wasForwarding) {
            forwarding = (this.onTouchForwarded(event) || !this.onForwardingStopped());
        }
        else {
            forwarding = (this.onTouchObserved(event) && this.onForwardingStarted());
            if (forwarding) {
                final long now = SystemClock.uptimeMillis();
                final MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
                this.mSrc.onTouchEvent(e);
                e.recycle();
            }
        }
        this.mForwarding = forwarding;
        return forwarding || wasForwarding;
    }
    
    public void onViewAttachedToWindow(final View v) {
    }
    
    public void onViewDetachedFromWindow(final View v) {
        this.mForwarding = false;
        this.mActivePointerId = -1;
        if (this.mDisallowIntercept != null) {
            this.mSrc.removeCallbacks(this.mDisallowIntercept);
        }
    }
    
    protected boolean onForwardingStarted() {
        final ShowableListMenu popup = this.getPopup();
        if (popup != null && !popup.isShowing()) {
            popup.show();
        }
        return true;
    }
    
    protected boolean onForwardingStopped() {
        final ShowableListMenu popup = this.getPopup();
        if (popup != null && popup.isShowing()) {
            popup.dismiss();
        }
        return true;
    }
    
    private boolean onTouchObserved(final MotionEvent srcEvent) {
        final View src = this.mSrc;
        if (!src.isEnabled()) {
            return false;
        }
        final int actionMasked = srcEvent.getActionMasked();
        switch (actionMasked) {
            case 0: {
                this.mActivePointerId = srcEvent.getPointerId(0);
                if (this.mDisallowIntercept == null) {
                    this.mDisallowIntercept = (Runnable)new DisallowIntercept();
                }
                src.postDelayed(this.mDisallowIntercept, (long)this.mTapTimeout);
                if (this.mTriggerLongPress == null) {
                    this.mTriggerLongPress = (Runnable)new TriggerLongPress();
                }
                src.postDelayed(this.mTriggerLongPress, (long)this.mLongPressTimeout);
                break;
            }
            case 2: {
                final int activePointerIndex = srcEvent.findPointerIndex(this.mActivePointerId);
                if (activePointerIndex < 0) {
                    break;
                }
                final float x = srcEvent.getX(activePointerIndex);
                final float y = srcEvent.getY(activePointerIndex);
                if (!pointInView(src, x, y, this.mScaledTouchSlop)) {
                    this.clearCallbacks();
                    src.getParent().requestDisallowInterceptTouchEvent(true);
                    return true;
                }
                break;
            }
            case 1:
            case 3: {
                this.clearCallbacks();
                break;
            }
        }
        return false;
    }
    
    private void clearCallbacks() {
        if (this.mTriggerLongPress != null) {
            this.mSrc.removeCallbacks(this.mTriggerLongPress);
        }
        if (this.mDisallowIntercept != null) {
            this.mSrc.removeCallbacks(this.mDisallowIntercept);
        }
    }
    
    void onLongPress() {
        this.clearCallbacks();
        final View src = this.mSrc;
        if (!src.isEnabled() || src.isLongClickable()) {
            return;
        }
        if (!this.onForwardingStarted()) {
            return;
        }
        src.getParent().requestDisallowInterceptTouchEvent(true);
        final long now = SystemClock.uptimeMillis();
        final MotionEvent e = MotionEvent.obtain(now, now, 3, 0.0f, 0.0f, 0);
        src.onTouchEvent(e);
        e.recycle();
        this.mForwarding = true;
    }
    
    private boolean onTouchForwarded(final MotionEvent srcEvent) {
        final View src = this.mSrc;
        final ShowableListMenu popup = this.getPopup();
        if (popup == null || !popup.isShowing()) {
            return false;
        }
        final DropDownListView dst = (DropDownListView)popup.getListView();
        if (dst == null || !dst.isShown()) {
            return false;
        }
        final MotionEvent dstEvent = MotionEvent.obtainNoHistory(srcEvent);
        this.toGlobalMotionEvent(src, dstEvent);
        this.toLocalMotionEvent((View)dst, dstEvent);
        final boolean handled = dst.onForwardedEvent(dstEvent, this.mActivePointerId);
        dstEvent.recycle();
        final int action = srcEvent.getActionMasked();
        final boolean keepForwarding = action != 1 && action != 3;
        return handled && keepForwarding;
    }
    
    private static boolean pointInView(final View view, final float localX, final float localY, final float slop) {
        return localX >= -slop && localY >= -slop && localX < view.getRight() - view.getLeft() + slop && localY < view.getBottom() - view.getTop() + slop;
    }
    
    private boolean toLocalMotionEvent(final View view, final MotionEvent event) {
        final int[] loc = this.mTmpLocation;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float)(-loc[0]), (float)(-loc[1]));
        return true;
    }
    
    private boolean toGlobalMotionEvent(final View view, final MotionEvent event) {
        final int[] loc = this.mTmpLocation;
        view.getLocationOnScreen(loc);
        event.offsetLocation((float)loc[0], (float)loc[1]);
        return true;
    }
    
    private class DisallowIntercept implements Runnable
    {
        DisallowIntercept() {
        }
        
        public void run() {
            final ViewParent parent = ForwardingListener.this.mSrc.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }
    
    private class TriggerLongPress implements Runnable
    {
        TriggerLongPress() {
        }
        
        public void run() {
            ForwardingListener.this.onLongPress();
        }
    }
}
