package android.widget;

import android.view.ContextMenu;
import android.view.ViewStructure;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewDebug;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup;

public abstract class AdapterView<T extends Adapter> extends ViewGroup
{
    public static final int INVALID_POSITION = -1;
    public static final long INVALID_ROW_ID = Long.MIN_VALUE;
    public static final int ITEM_VIEW_TYPE_HEADER_OR_FOOTER = -2;
    public static final int ITEM_VIEW_TYPE_IGNORE = -1;
    
    public AdapterView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AdapterView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AdapterView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AdapterView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setOnItemClickListener(@Nullable final OnItemClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final OnItemClickListener getOnItemClickListener() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean performItemClick(final View view, final int position, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnItemLongClickListener(final OnItemLongClickListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    public final OnItemLongClickListener getOnItemLongClickListener() {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnItemSelectedListener(@Nullable final OnItemSelectedListener listener) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final OnItemSelectedListener getOnItemSelectedListener() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract T getAdapter();
    
    public abstract void setAdapter(final T p0);
    
    @Override
    public void addView(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void addView(final View child, final int index, final LayoutParams params) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeView(final View child) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeViewAt(final int index) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void removeAllViews() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public long getSelectedItemId() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract View getSelectedView();
    
    public Object getSelectedItem() {
        throw new RuntimeException("Stub!");
    }
    
    @ViewDebug.CapturedViewProperty
    public int getCount() {
        throw new RuntimeException("Stub!");
    }
    
    public int getPositionForView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFirstVisiblePosition() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLastVisiblePosition() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract void setSelection(final int p0);
    
    public void setEmptyView(final View emptyView) {
        throw new RuntimeException("Stub!");
    }
    
    public View getEmptyView() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFocusable(final int focusable) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setFocusableInTouchMode(final boolean focusable) {
        throw new RuntimeException("Stub!");
    }
    
    public Object getItemAtPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public long getItemIdAtPosition(final int position) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setOnClickListener(final OnClickListener l) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchSaveInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> container) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void onDetachedFromWindow() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected boolean canAnimate() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onProvideAutofillStructure(final ViewStructure structure, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public static class AdapterContextMenuInfo implements ContextMenu.ContextMenuInfo
    {
        public long id;
        public int position;
        public View targetView;
        
        public AdapterContextMenuInfo(final View targetView, final int position, final long id) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnItemSelectedListener
    {
        void onItemSelected(final AdapterView<?> p0, final View p1, final int p2, final long p3);
        
        void onNothingSelected(final AdapterView<?> p0);
    }
    
    public interface OnItemLongClickListener
    {
        boolean onItemLongClick(final AdapterView<?> p0, final View p1, final int p2, final long p3);
    }
    
    public interface OnItemClickListener
    {
        void onItemClick(final AdapterView<?> p0, final View p1, final int p2, final long p3);
    }
}
