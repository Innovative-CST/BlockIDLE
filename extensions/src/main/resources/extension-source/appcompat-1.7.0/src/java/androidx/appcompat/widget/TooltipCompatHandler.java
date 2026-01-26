package androidx.appcompat.widget;

import android.util.Log;
import androidx.core.view.ViewCompat;
import android.view.accessibility.AccessibilityManager;
import android.view.MotionEvent;
import androidx.core.view.ViewConfigurationCompat;
import android.view.ViewConfiguration;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import android.view.View;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
class TooltipCompatHandler implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener
{
    private static final String TAG = "TooltipCompatHandler";
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500L;
    private static final long HOVER_HIDE_TIMEOUT_MS = 15000L;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000L;
    private final View mAnchor;
    private final CharSequence mTooltipText;
    private final int mHoverSlop;
    private final Runnable mShowRunnable;
    private final Runnable mHideRunnable;
    private int mAnchorX;
    private int mAnchorY;
    private TooltipPopup mPopup;
    private boolean mFromTouch;
    private boolean mForceNextChangeSignificant;
    private static TooltipCompatHandler sPendingHandler;
    private static TooltipCompatHandler sActiveHandler;
    
    public static void setTooltipText(final View view, final CharSequence tooltipText) {
        if (TooltipCompatHandler.sPendingHandler != null && TooltipCompatHandler.sPendingHandler.mAnchor == view) {
            setPendingHandler(null);
        }
        if (TextUtils.isEmpty(tooltipText)) {
            if (TooltipCompatHandler.sActiveHandler != null && TooltipCompatHandler.sActiveHandler.mAnchor == view) {
                TooltipCompatHandler.sActiveHandler.hide();
            }
            view.setOnLongClickListener((View.OnLongClickListener)null);
            view.setLongClickable(false);
            view.setOnHoverListener((View.OnHoverListener)null);
        }
        else {
            new TooltipCompatHandler(view, tooltipText);
        }
    }
    
    private TooltipCompatHandler(final View anchor, final CharSequence tooltipText) {
        this.mShowRunnable = (() -> this.show(false));
        this.mHideRunnable = this::hide;
        this.mAnchor = anchor;
        this.mTooltipText = tooltipText;
        this.mHoverSlop = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(this.mAnchor.getContext()));
        this.forceNextChangeSignificant();
        this.mAnchor.setOnLongClickListener((View.OnLongClickListener)this);
        this.mAnchor.setOnHoverListener((View.OnHoverListener)this);
    }
    
    public boolean onLongClick(final View v) {
        this.mAnchorX = v.getWidth() / 2;
        this.mAnchorY = v.getHeight() / 2;
        this.show(true);
        return true;
    }
    
    public boolean onHover(final View v, final MotionEvent event) {
        if (this.mPopup != null && this.mFromTouch) {
            return false;
        }
        final AccessibilityManager manager = (AccessibilityManager)this.mAnchor.getContext().getSystemService("accessibility");
        if (manager.isEnabled() && manager.isTouchExplorationEnabled()) {
            return false;
        }
        switch (event.getAction()) {
            case 7: {
                if (this.mAnchor.isEnabled() && this.mPopup == null && this.updateAnchorPos(event)) {
                    setPendingHandler(this);
                    break;
                }
                break;
            }
            case 10: {
                this.forceNextChangeSignificant();
                this.hide();
                break;
            }
        }
        return false;
    }
    
    public void onViewAttachedToWindow(final View v) {
    }
    
    public void onViewDetachedFromWindow(final View v) {
        this.hide();
    }
    
    void show(final boolean fromTouch) {
        if (!this.mAnchor.isAttachedToWindow()) {
            return;
        }
        setPendingHandler(null);
        if (TooltipCompatHandler.sActiveHandler != null) {
            TooltipCompatHandler.sActiveHandler.hide();
        }
        TooltipCompatHandler.sActiveHandler = this;
        this.mFromTouch = fromTouch;
        (this.mPopup = new TooltipPopup(this.mAnchor.getContext())).show(this.mAnchor, this.mAnchorX, this.mAnchorY, this.mFromTouch, this.mTooltipText);
        this.mAnchor.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
        long timeout;
        if (this.mFromTouch) {
            timeout = 2500L;
        }
        else if ((ViewCompat.getWindowSystemUiVisibility(this.mAnchor) & 0x1) == 0x1) {
            timeout = 3000L - ViewConfiguration.getLongPressTimeout();
        }
        else {
            timeout = 15000L - ViewConfiguration.getLongPressTimeout();
        }
        this.mAnchor.removeCallbacks(this.mHideRunnable);
        this.mAnchor.postDelayed(this.mHideRunnable, timeout);
    }
    
    void hide() {
        if (TooltipCompatHandler.sActiveHandler == this) {
            TooltipCompatHandler.sActiveHandler = null;
            if (this.mPopup != null) {
                this.mPopup.hide();
                this.mPopup = null;
                this.forceNextChangeSignificant();
                this.mAnchor.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (TooltipCompatHandler.sPendingHandler == this) {
            setPendingHandler(null);
        }
        this.mAnchor.removeCallbacks(this.mHideRunnable);
    }
    
    private static void setPendingHandler(final TooltipCompatHandler handler) {
        if (TooltipCompatHandler.sPendingHandler != null) {
            TooltipCompatHandler.sPendingHandler.cancelPendingShow();
        }
        TooltipCompatHandler.sPendingHandler = handler;
        if (TooltipCompatHandler.sPendingHandler != null) {
            TooltipCompatHandler.sPendingHandler.scheduleShow();
        }
    }
    
    private void scheduleShow() {
        this.mAnchor.postDelayed(this.mShowRunnable, (long)ViewConfiguration.getLongPressTimeout());
    }
    
    private void cancelPendingShow() {
        this.mAnchor.removeCallbacks(this.mShowRunnable);
    }
    
    private boolean updateAnchorPos(final MotionEvent event) {
        final int newAnchorX = (int)event.getX();
        final int newAnchorY = (int)event.getY();
        if (this.mForceNextChangeSignificant || Math.abs(newAnchorX - this.mAnchorX) > this.mHoverSlop || Math.abs(newAnchorY - this.mAnchorY) > this.mHoverSlop) {
            this.mAnchorX = newAnchorX;
            this.mAnchorY = newAnchorY;
            this.mForceNextChangeSignificant = false;
            return true;
        }
        return false;
    }
    
    private void forceNextChangeSignificant() {
        this.mForceNextChangeSignificant = true;
    }
}
