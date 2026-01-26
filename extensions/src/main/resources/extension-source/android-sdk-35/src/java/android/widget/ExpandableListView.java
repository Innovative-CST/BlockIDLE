package android.widget;

import android.view.ContextMenu;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;

public class ExpandableListView extends ListView
{
    public static final int CHILD_INDICATOR_INHERIT = -1;
    public static final int PACKED_POSITION_TYPE_CHILD = 1;
    public static final int PACKED_POSITION_TYPE_GROUP = 0;
    public static final int PACKED_POSITION_TYPE_NULL = 2;
    public static final long PACKED_POSITION_VALUE_NULL = 4294967295L;
    
    public ExpandableListView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ExpandableListView(final Context context, final AttributeSet attrs) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ExpandableListView(final Context context, final AttributeSet attrs, final int defStyleAttr) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public ExpandableListView(final Context context, final AttributeSet attrs, final int defStyleAttr, final int defStyleRes) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRtlPropertiesChanged(final int layoutDirection) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChildDivider(final Drawable childDivider) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setAdapter(final ListAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public ListAdapter getAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void setOnItemClickListener(final OnItemClickListener l) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAdapter(final ExpandableListAdapter adapter) {
        throw new RuntimeException("Stub!");
    }
    
    public ExpandableListAdapter getExpandableListAdapter() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public boolean performItemClick(final View v, final int position, final long id) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean expandGroup(final int groupPos) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean expandGroup(final int groupPos, final boolean animate) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean collapseGroup(final int groupPos) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnGroupCollapseListener(final OnGroupCollapseListener onGroupCollapseListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnGroupExpandListener(final OnGroupExpandListener onGroupExpandListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnGroupClickListener(final OnGroupClickListener onGroupClickListener) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnChildClickListener(final OnChildClickListener onChildClickListener) {
        throw new RuntimeException("Stub!");
    }
    
    public long getExpandableListPosition(final int flatListPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public int getFlatListPosition(final long packedPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public long getSelectedPosition() {
        throw new RuntimeException("Stub!");
    }
    
    public long getSelectedId() {
        throw new RuntimeException("Stub!");
    }
    
    public void setSelectedGroup(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean setSelectedChild(final int groupPosition, final int childPosition, final boolean shouldExpandGroup) {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isGroupExpanded(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getPackedPositionType(final long packedPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getPackedPositionGroup(final long packedPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public static int getPackedPositionChild(final long packedPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getPackedPositionForChild(final int groupPosition, final int childPosition) {
        throw new RuntimeException("Stub!");
    }
    
    public static long getPackedPositionForGroup(final int groupPosition) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onInitializeAccessibilityNodeInfoForItem(final View view, final int position, final AccessibilityNodeInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChildIndicator(final Drawable childIndicator) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChildIndicatorBounds(final int left, final int right) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChildIndicatorBoundsRelative(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    public void setGroupIndicator(final Drawable groupIndicator) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndicatorBounds(final int left, final int right) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIndicatorBoundsRelative(final int start, final int end) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public Parcelable onSaveInstanceState() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void onRestoreInstanceState(final Parcelable state) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public CharSequence getAccessibilityClassName() {
        throw new RuntimeException("Stub!");
    }
    
    public static class ExpandableListContextMenuInfo implements ContextMenu.ContextMenuInfo
    {
        public long id;
        public long packedPosition;
        public View targetView;
        
        public ExpandableListContextMenuInfo(final View targetView, final long packedPosition, final long id) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public interface OnGroupExpandListener
    {
        void onGroupExpand(final int p0);
    }
    
    public interface OnGroupCollapseListener
    {
        void onGroupCollapse(final int p0);
    }
    
    public interface OnGroupClickListener
    {
        boolean onGroupClick(final ExpandableListView p0, final View p1, final int p2, final long p3);
    }
    
    public interface OnChildClickListener
    {
        boolean onChildClick(final ExpandableListView p0, final View p1, final int p2, final int p3, final long p4);
    }
}
