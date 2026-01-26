package android.view;

import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.RemoteViews;

@RemoteViews.RemoteView
public final class ViewStub extends View
{
    public ViewStub(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewStub(final Context context, final int layoutResource) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewStub(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewStub(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ViewStub(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public int getInflatedId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setInflatedId(final int inflatedId) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayoutResource() {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutResource(final int layoutResource) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLayoutInflater(final LayoutInflater inflater) {
        throw new RuntimeException("Stub!");
    }
    
    public LayoutInflater getLayoutInflater() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void draw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setVisibility(final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public View inflate() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnInflateListener(final OnInflateListener inflateListener) {
        throw new RuntimeException("Stub!");
    }
    
    public interface OnInflateListener
    {
        void onInflate(final ViewStub p0, final View p1);
    }
}
