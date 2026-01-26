package android.view;

import android.graphics.Rect;
import java.util.List;
import java.util.function.Consumer;

public final class ViewTreeObserver
{
    ViewTreeObserver() {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnWindowAttachListener(final OnWindowAttachListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnWindowAttachListener(final OnWindowAttachListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnWindowFocusChangeListener(final OnWindowFocusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnWindowFocusChangeListener(final OnWindowFocusChangeListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnWindowVisibilityChangeListener(@NonNull final OnWindowVisibilityChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnWindowVisibilityChangeListener(@NonNull final OnWindowVisibilityChangeListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnGlobalFocusChangeListener(final OnGlobalFocusChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnGlobalFocusChangeListener(final OnGlobalFocusChangeListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnGlobalLayoutListener(final OnGlobalLayoutListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void removeGlobalOnLayoutListener(final OnGlobalLayoutListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnGlobalLayoutListener(final OnGlobalLayoutListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnPreDrawListener(final OnPreDrawListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnPreDrawListener(final OnPreDrawListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnDrawListener(final OnDrawListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnDrawListener(final OnDrawListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void registerFrameCommitCallback(@NonNull final Runnable callback) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean unregisterFrameCommitCallback(@NonNull final Runnable callback) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnScrollChangedListener(final OnScrollChangedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnScrollChangedListener(final OnScrollChangedListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnTouchModeChangeListener(final OnTouchModeChangeListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnTouchModeChangeListener(final OnTouchModeChangeListener victim) {
        throw new RuntimeException("Stub!");
    }
    
    public void addOnSystemGestureExclusionRectsChangedListener(@NonNull final Consumer<List<Rect>> listener) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeOnSystemGestureExclusionRectsChangedListener(@NonNull final Consumer<List<Rect>> listener) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isAlive() {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchOnGlobalLayout() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean dispatchOnPreDraw() {
        throw new RuntimeException("Stub!");
    }
    
    public void dispatchOnDraw() {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnWindowVisibilityChangeListener
    {
        void onWindowVisibilityChanged(final int p0);
    }
    
    public interface OnWindowFocusChangeListener
    {
        void onWindowFocusChanged(final boolean p0);
    }
    
    public interface OnWindowAttachListener
    {
        void onWindowAttached();
        
        void onWindowDetached();
    }
    
    public interface OnTouchModeChangeListener
    {
        void onTouchModeChanged(final boolean p0);
    }
    
    public interface OnScrollChangedListener
    {
        void onScrollChanged();
    }
    
    public interface OnPreDrawListener
    {
        boolean onPreDraw();
    }
    
    public interface OnGlobalLayoutListener
    {
        void onGlobalLayout();
    }
    
    public interface OnGlobalFocusChangeListener
    {
        void onGlobalFocusChanged(final View p0, final View p1);
    }
    
    public interface OnDrawListener
    {
        void onDraw();
    }
}
