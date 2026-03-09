package android.widget;

import android.content.Intent;
import android.animation.ObjectAnimator;
import android.view.View;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;

public abstract class AdapterViewAnimator extends AdapterView<Adapter> implements Advanceable
{
    public AdapterViewAnimator(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AdapterViewAnimator(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AdapterViewAnimator(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AdapterViewAnimator(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setDisplayedChild(final int whichChild) {
        throw new RuntimeException("Stub!");
    }
    
    public int getDisplayedChild() {
        throw new RuntimeException("Stub!");
    }
    
    public void showNext() {
        throw new RuntimeException("Stub!");
    }
    
    public void showPrevious() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent ev) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    public View getCurrentView() {
        throw new RuntimeException("Stub!");
    }
    
    public ObjectAnimator getInAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInAnimation(final ObjectAnimator inAnimation) {
        throw new RuntimeException("Stub!");
    }
    
    public ObjectAnimator getOutAnimation() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutAnimation(final ObjectAnimator outAnimation) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInAnimation(final Context context, final int resourceID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOutAnimation(final Context context, final int resourceID) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAnimateFirstView(final boolean animate) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int getBaseline() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Adapter getAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAdapter(final Adapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRemoteViewsAdapter(final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setSelection(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public View getSelectedView() {
        throw new RuntimeException("Stub!");
    }
    
    public void deferNotifyDataSetChanged() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean onRemoteAdapterConnected() {
        throw new RuntimeException("Stub!");
    }
    
    public void onRemoteAdapterDisconnected() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void advance() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void fyiWillBeAdvancedByHostKThx() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
}
