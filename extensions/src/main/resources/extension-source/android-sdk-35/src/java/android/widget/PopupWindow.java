package android.widget;

import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.transition.Transition;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class PopupWindow
{
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    
    public PopupWindow(final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow(final Context context, final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow() {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow(final View contentView) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow(final View contentView, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public PopupWindow(final View contentView, final int width, final int height, final boolean focusable) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEnterTransition(@Nullable final Transition enterTransition) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Transition getEnterTransition() {
        throw new RuntimeException("Stub!");
    }
    
    public void setExitTransition(@Nullable final Transition exitTransition) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Transition getExitTransition() {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rect getEpicenterBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public void setEpicenterBounds(@Nullable final Rect bounds) {
        throw new RuntimeException("Stub!");
    }
    
    public Drawable getBackground() {
        throw new RuntimeException("Stub!");
    }
    
    public void setBackgroundDrawable(final Drawable background) {
        throw new RuntimeException("Stub!");
    }
    
    public float getElevation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setElevation(final float elevation) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAnimationStyle() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIgnoreCheekPress() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimationStyle(final int animationStyle) {
        throw new RuntimeException("Stub!");
    }
    
    public View getContentView() {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentView(final View contentView) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTouchInterceptor(final View.OnTouchListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isFocusable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setFocusable(final boolean focusable) {
        throw new RuntimeException("Stub!");
    }
    
    public int getInputMethodMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInputMethodMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public void setSoftInputMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getSoftInputMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTouchable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTouchable(final boolean touchable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isOutsideTouchable() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutsideTouchable(final boolean touchable) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClippingEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setClippingEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isClippedToScreen() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIsClippedToScreen(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isSplitTouchEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSplitTouchEnabled(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isLaidOutInScreen() {
        throw new RuntimeException("Stub!");
    }
    
    public void setIsLaidOutInScreen(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAttachedInDecor() {
        throw new RuntimeException("Stub!");
    }
    
    public void setAttachedInDecor(final boolean enabled) {
        throw new RuntimeException("Stub!");
    }
    
    public void setWindowLayoutType(final int layoutType) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWindowLayoutType() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isTouchModal() {
        throw new RuntimeException("Stub!");
    }
    
    public void setTouchModal(final boolean touchModal) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setWindowLayoutMode(final int widthSpec, final int heightSpec) {
        throw new RuntimeException("Stub!");
    }
    
    public int getHeight() {
        throw new RuntimeException("Stub!");
    }
    
    public void setHeight(final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public int getWidth() {
        throw new RuntimeException("Stub!");
    }
    
    public void setWidth(final int width) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOverlapAnchor(final boolean overlapAnchor) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getOverlapAnchor() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShowing() {
        throw new RuntimeException("Stub!");
    }
    
    public void showAtLocation(final View parent, final int gravity, final int x, final int y) {
        throw new RuntimeException("Stub!");
    }
    
    public void showAsDropDown(final View anchor) {
        throw new RuntimeException("Stub!");
    }
    
    public void showAsDropDown(final View anchor, final int xoff, final int yoff) {
        throw new RuntimeException("Stub!");
    }
    
    public void showAsDropDown(final View anchor, final int xoff, final int yoff, final int gravity) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAboveAnchor() {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxAvailableHeight(@NonNull final View anchor) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxAvailableHeight(@NonNull final View anchor, final int yOffset) {
        throw new RuntimeException("Stub!");
    }
    
    public int getMaxAvailableHeight(@NonNull final View anchor, final int yOffset, final boolean ignoreBottomDecorations) {
        throw new RuntimeException("Stub!");
    }
    
    public void dismiss() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnDismissListener(final OnDismissListener onDismissListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void update() {
        throw new RuntimeException("Stub!");
    }
    
    public void update(final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void update(final int x, final int y, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void update(final int x, final int y, final int width, final int height, final boolean force) {
        throw new RuntimeException("Stub!");
    }
    
    public void update(final View anchor, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public void update(final View anchor, final int xoff, final int yoff, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnDismissListener
    {
        void onDismiss();
    }
}
