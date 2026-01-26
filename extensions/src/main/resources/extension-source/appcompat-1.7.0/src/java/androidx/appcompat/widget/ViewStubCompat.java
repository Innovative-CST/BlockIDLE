package androidx.appcompat.widget;

import android.view.ViewParent;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import androidx.annotation.RestrictTo;
import android.view.View;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
public final class ViewStubCompat extends View
{
    private int mLayoutResource;
    private int mInflatedId;
    private WeakReference<View> mInflatedViewRef;
    private LayoutInflater mInflater;
    private OnInflateListener mInflateListener;
    
    public ViewStubCompat(@NonNull final Context context, @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }
    
    public ViewStubCompat(@NonNull final Context context, @Nullable final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        this.mLayoutResource = 0;
        final TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ViewStubCompat, defStyle, 0);
        this.mInflatedId = a.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
        this.mLayoutResource = a.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
        this.setId(a.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
        a.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    public int getInflatedId() {
        return this.mInflatedId;
    }
    
    public void setInflatedId(final int inflatedId) {
        this.mInflatedId = inflatedId;
    }
    
    public int getLayoutResource() {
        return this.mLayoutResource;
    }
    
    public void setLayoutResource(final int layoutResource) {
        this.mLayoutResource = layoutResource;
    }
    
    public void setLayoutInflater(final LayoutInflater inflater) {
        this.mInflater = inflater;
    }
    
    public LayoutInflater getLayoutInflater() {
        return this.mInflater;
    }
    
    protected void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        this.setMeasuredDimension(0, 0);
    }
    
    @SuppressLint({ "MissingSuperCall" })
    public void draw(@NonNull final Canvas canvas) {
    }
    
    protected void dispatchDraw(final Canvas canvas) {
    }
    
    public void setVisibility(final int visibility) {
        if (this.mInflatedViewRef != null) {
            final View view = (View)this.mInflatedViewRef.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(visibility);
        }
        else {
            super.setVisibility(visibility);
            if (visibility == 0 || visibility == 4) {
                this.inflate();
            }
        }
    }
    
    public View inflate() {
        final ViewParent viewParent = this.getParent();
        if (!(viewParent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.mLayoutResource != 0) {
            final ViewGroup parent = (ViewGroup)viewParent;
            LayoutInflater factory;
            if (this.mInflater != null) {
                factory = this.mInflater;
            }
            else {
                factory = LayoutInflater.from(this.getContext());
            }
            final View view = factory.inflate(this.mLayoutResource, parent, false);
            if (this.mInflatedId != -1) {
                view.setId(this.mInflatedId);
            }
            final int index = parent.indexOfChild((View)this);
            parent.removeViewInLayout((View)this);
            final ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            if (layoutParams != null) {
                parent.addView(view, index, layoutParams);
            }
            else {
                parent.addView(view, index);
            }
            this.mInflatedViewRef = (WeakReference<View>)new WeakReference((Object)view);
            if (this.mInflateListener != null) {
                this.mInflateListener.onInflate(this, view);
            }
            return view;
        }
        throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    
    public void setOnInflateListener(final OnInflateListener inflateListener) {
        this.mInflateListener = inflateListener;
    }
    
    public interface OnInflateListener
    {
        void onInflate(final ViewStubCompat p0, final View p1);
    }
}
