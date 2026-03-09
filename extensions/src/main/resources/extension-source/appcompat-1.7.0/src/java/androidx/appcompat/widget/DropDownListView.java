package androidx.appcompat.widget;

import java.lang.reflect.Field;
import androidx.annotation.DoNotInline;
import android.widget.AdapterView;
import android.annotation.SuppressLint;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.annotation.NonNull;
import android.content.Context;
import androidx.core.widget.ListViewAutoScrollHelper;
import androidx.core.view.ViewPropertyAnimatorCompat;
import android.graphics.Rect;
import android.widget.ListView;

class DropDownListView extends ListView
{
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private final Rect mSelectorRect;
    private int mSelectionLeftPadding;
    private int mSelectionTopPadding;
    private int mSelectionRightPadding;
    private int mSelectionBottomPadding;
    private int mMotionPosition;
    private GateKeeperDrawable mSelector;
    private boolean mListSelectionHidden;
    private boolean mHijackFocus;
    private boolean mDrawsInPressedState;
    private ViewPropertyAnimatorCompat mClickAnimation;
    private ListViewAutoScrollHelper mScrollHelper;
    ResolveHoverRunnable mResolveHoverRunnable;
    
    DropDownListView(@NonNull final Context context, final boolean hijackFocus) {
        super(context, (AttributeSet)null, R.attr.dropDownListViewStyle);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = hijackFocus;
        this.setCacheColorHint(0);
    }
    
    private boolean superIsSelectedChildViewEnabled() {
        if (Build.VERSION.SDK_INT >= 33) {
            return Api33Impl.isSelectedChildViewEnabled((AbsListView)this);
        }
        return PreApi33Impl.isSelectedChildViewEnabled((AbsListView)this);
    }
    
    private void superSetSelectedChildViewEnabled(final boolean enabled) {
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setSelectedChildViewEnabled((AbsListView)this, enabled);
        }
        else {
            PreApi33Impl.setSelectedChildViewEnabled((AbsListView)this, enabled);
        }
    }
    
    public boolean isInTouchMode() {
        return (this.mHijackFocus && this.mListSelectionHidden) || super.isInTouchMode();
    }
    
    public boolean hasWindowFocus() {
        return this.mHijackFocus || super.hasWindowFocus();
    }
    
    public boolean isFocused() {
        return this.mHijackFocus || super.isFocused();
    }
    
    public boolean hasFocus() {
        return this.mHijackFocus || super.hasFocus();
    }
    
    public void setSelector(final Drawable sel) {
        super.setSelector((Drawable)(this.mSelector = ((sel != null) ? new GateKeeperDrawable(sel) : null)));
        final Rect padding = new Rect();
        if (sel != null) {
            sel.getPadding(padding);
        }
        this.mSelectionLeftPadding = padding.left;
        this.mSelectionTopPadding = padding.top;
        this.mSelectionRightPadding = padding.right;
        this.mSelectionBottomPadding = padding.bottom;
    }
    
    protected void drawableStateChanged() {
        if (this.mResolveHoverRunnable != null) {
            return;
        }
        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.updateSelectorStateCompat();
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        final boolean drawSelectorOnTop = false;
        this.drawSelectorCompat(canvas);
        super.dispatchDraw(canvas);
    }
    
    public boolean onTouchEvent(final MotionEvent ev) {
        switch (ev.getAction()) {
            case 0: {
                this.mMotionPosition = this.pointToPosition((int)ev.getX(), (int)ev.getY());
                break;
            }
        }
        if (this.mResolveHoverRunnable != null) {
            this.mResolveHoverRunnable.cancel();
        }
        return super.onTouchEvent(ev);
    }
    
    public int lookForSelectablePosition(int position, final boolean lookDown) {
        final ListAdapter adapter = this.getAdapter();
        if (adapter == null || this.isInTouchMode()) {
            return -1;
        }
        final int count = adapter.getCount();
        if (!this.getAdapter().areAllItemsEnabled()) {
            if (lookDown) {
                for (position = Math.max(0, position); position < count && !adapter.isEnabled(position); ++position) {}
            }
            else {
                for (position = Math.min(position, count - 1); position >= 0 && !adapter.isEnabled(position); --position) {}
            }
            if (position < 0 || position >= count) {
                return -1;
            }
            return position;
        }
        else {
            if (position < 0 || position >= count) {
                return -1;
            }
            return position;
        }
    }
    
    public int measureHeightOfChildrenCompat(final int widthMeasureSpec, final int startPosition, final int endPosition, final int maxHeight, final int disallowPartialChildPosition) {
        final int paddingTop = this.getListPaddingTop();
        final int paddingBottom = this.getListPaddingBottom();
        final int reportedDividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        if (adapter == null) {
            return paddingTop + paddingBottom;
        }
        int returnedHeight = paddingTop + paddingBottom;
        final int dividerHeight = (reportedDividerHeight > 0 && divider != null) ? reportedDividerHeight : 0;
        int prevHeightWithoutPartialChild = 0;
        View child = null;
        int viewType = 0;
        for (int count = adapter.getCount(), i = 0; i < count; ++i) {
            final int newType = adapter.getItemViewType(i);
            if (newType != viewType) {
                child = null;
                viewType = newType;
            }
            child = adapter.getView(i, child, (ViewGroup)this);
            ViewGroup.LayoutParams childLp = child.getLayoutParams();
            if (childLp == null) {
                childLp = this.generateDefaultLayoutParams();
                child.setLayoutParams(childLp);
            }
            int heightMeasureSpec;
            if (childLp.height > 0) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(childLp.height, 1073741824);
            }
            else {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            child.measure(widthMeasureSpec, heightMeasureSpec);
            child.forceLayout();
            if (i > 0) {
                returnedHeight += dividerHeight;
            }
            returnedHeight += child.getMeasuredHeight();
            if (returnedHeight >= maxHeight) {
                return (disallowPartialChildPosition >= 0 && i > disallowPartialChildPosition && prevHeightWithoutPartialChild > 0 && returnedHeight != maxHeight) ? prevHeightWithoutPartialChild : maxHeight;
            }
            if (disallowPartialChildPosition >= 0 && i >= disallowPartialChildPosition) {
                prevHeightWithoutPartialChild = returnedHeight;
            }
        }
        return returnedHeight;
    }
    
    private void setSelectorEnabled(final boolean enabled) {
        if (this.mSelector != null) {
            this.mSelector.setEnabled(enabled);
        }
    }
    
    public boolean onHoverEvent(@NonNull final MotionEvent ev) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(ev);
        }
        final int action = ev.getActionMasked();
        if (action == 10 && this.mResolveHoverRunnable == null) {
            (this.mResolveHoverRunnable = new ResolveHoverRunnable()).post();
        }
        final boolean handled = super.onHoverEvent(ev);
        if (action == 9 || action == 7) {
            final int position = this.pointToPosition((int)ev.getX(), (int)ev.getY());
            if (position != -1 && position != this.getSelectedItemPosition()) {
                final View hoveredItem = this.getChildAt(position - this.getFirstVisiblePosition());
                if (hoveredItem.isEnabled()) {
                    this.requestFocus();
                    if (Build.VERSION.SDK_INT >= 30 && Api30Impl.canPositionSelectorForHoveredItem()) {
                        Api30Impl.positionSelectorForHoveredItem(this, position, hoveredItem);
                    }
                    else {
                        this.setSelectionFromTop(position, hoveredItem.getTop() - this.getTop());
                    }
                }
                this.updateSelectorStateCompat();
            }
        }
        else {
            this.setSelection(-1);
        }
        return handled;
    }
    
    protected void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }
    
    public boolean onForwardedEvent(final MotionEvent event, final int activePointerId) {
        boolean handledEvent = true;
        boolean clearPressedItem = false;
        final int actionMasked = event.getActionMasked();
        switch (actionMasked) {
            case 3: {
                handledEvent = false;
                break;
            }
            case 1: {
                handledEvent = false;
            }
            case 2: {
                final int activeIndex = event.findPointerIndex(activePointerId);
                if (activeIndex < 0) {
                    handledEvent = false;
                    break;
                }
                final int x = (int)event.getX(activeIndex);
                final int y = (int)event.getY(activeIndex);
                final int position = this.pointToPosition(x, y);
                if (position == -1) {
                    clearPressedItem = true;
                    break;
                }
                final View child = this.getChildAt(position - this.getFirstVisiblePosition());
                this.setPressedItem(child, position, (float)x, (float)y);
                handledEvent = true;
                if (actionMasked == 1) {
                    this.clickPressedItem(child, position);
                    break;
                }
                break;
            }
        }
        if (!handledEvent || clearPressedItem) {
            this.clearPressedItem();
        }
        if (handledEvent) {
            if (this.mScrollHelper == null) {
                this.mScrollHelper = new ListViewAutoScrollHelper((ListView)this);
            }
            this.mScrollHelper.setEnabled(true);
            this.mScrollHelper.onTouch((View)this, event);
        }
        else if (this.mScrollHelper != null) {
            this.mScrollHelper.setEnabled(false);
        }
        return handledEvent;
    }
    
    private void clickPressedItem(final View child, final int position) {
        final long id = this.getItemIdAtPosition(position);
        this.performItemClick(child, position, id);
    }
    
    void setListSelectionHidden(final boolean hideListSelection) {
        this.mListSelectionHidden = hideListSelection;
    }
    
    private void updateSelectorStateCompat() {
        final Drawable selector = this.getSelector();
        if (selector != null && this.touchModeDrawsInPressedStateCompat() && this.isPressed()) {
            selector.setState(this.getDrawableState());
        }
    }
    
    private void drawSelectorCompat(final Canvas canvas) {
        if (!this.mSelectorRect.isEmpty()) {
            final Drawable selector = this.getSelector();
            if (selector != null) {
                selector.setBounds(this.mSelectorRect);
                selector.draw(canvas);
            }
        }
    }
    
    private void positionSelectorLikeTouchCompat(final int position, final View sel, final float x, final float y) {
        this.positionSelectorLikeFocusCompat(position, sel);
        final Drawable selector = this.getSelector();
        if (selector != null && position != -1) {
            DrawableCompat.setHotspot(selector, x, y);
        }
    }
    
    private void positionSelectorLikeFocusCompat(final int position, final View sel) {
        final Drawable selector = this.getSelector();
        final boolean manageState = selector != null && position != -1;
        if (manageState) {
            selector.setVisible(false, false);
        }
        this.positionSelectorCompat(position, sel);
        if (manageState) {
            final Rect bounds = this.mSelectorRect;
            final float x = bounds.exactCenterX();
            final float y = bounds.exactCenterY();
            selector.setVisible(this.getVisibility() == 0, false);
            DrawableCompat.setHotspot(selector, x, y);
        }
    }
    
    private void positionSelectorCompat(final int position, final View sel) {
        final Rect selectorRect = this.mSelectorRect;
        selectorRect.set(sel.getLeft(), sel.getTop(), sel.getRight(), sel.getBottom());
        final Rect rect = selectorRect;
        rect.left -= this.mSelectionLeftPadding;
        final Rect rect2 = selectorRect;
        rect2.top -= this.mSelectionTopPadding;
        final Rect rect3 = selectorRect;
        rect3.right += this.mSelectionRightPadding;
        final Rect rect4 = selectorRect;
        rect4.bottom += this.mSelectionBottomPadding;
        final boolean isChildViewEnabled = this.superIsSelectedChildViewEnabled();
        if (sel.isEnabled() != isChildViewEnabled) {
            this.superSetSelectedChildViewEnabled(!isChildViewEnabled);
            if (position != -1) {
                this.refreshDrawableState();
            }
        }
    }
    
    private void clearPressedItem() {
        this.setPressed(this.mDrawsInPressedState = false);
        this.drawableStateChanged();
        final View motionView = this.getChildAt(this.mMotionPosition - this.getFirstVisiblePosition());
        if (motionView != null) {
            motionView.setPressed(false);
        }
        if (this.mClickAnimation != null) {
            this.mClickAnimation.cancel();
            this.mClickAnimation = null;
        }
    }
    
    private void setPressedItem(final View child, final int position, final float x, final float y) {
        this.mDrawsInPressedState = true;
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.drawableHotspotChanged((View)this, x, y);
        }
        if (!this.isPressed()) {
            this.setPressed(true);
        }
        this.layoutChildren();
        if (this.mMotionPosition != -1) {
            final View motionView = this.getChildAt(this.mMotionPosition - this.getFirstVisiblePosition());
            if (motionView != null && motionView != child && motionView.isPressed()) {
                motionView.setPressed(false);
            }
        }
        this.mMotionPosition = position;
        final float childX = x - child.getLeft();
        final float childY = y - child.getTop();
        if (Build.VERSION.SDK_INT >= 21) {
            Api21Impl.drawableHotspotChanged(child, childX, childY);
        }
        if (!child.isPressed()) {
            child.setPressed(true);
        }
        this.positionSelectorLikeTouchCompat(position, child, x, y);
        this.setSelectorEnabled(false);
        this.refreshDrawableState();
    }
    
    private boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState;
    }
    
    private static class GateKeeperDrawable extends DrawableWrapperCompat
    {
        private boolean mEnabled;
        
        GateKeeperDrawable(final Drawable drawable) {
            super(drawable);
            this.mEnabled = true;
        }
        
        void setEnabled(final boolean enabled) {
            this.mEnabled = enabled;
        }
        
        public boolean setState(final int[] stateSet) {
            return this.mEnabled && super.setState(stateSet);
        }
        
        public void draw(@NonNull final Canvas canvas) {
            if (this.mEnabled) {
                super.draw(canvas);
            }
        }
        
        public void setHotspot(final float x, final float y) {
            if (this.mEnabled) {
                super.setHotspot(x, y);
            }
        }
        
        public void setHotspotBounds(final int left, final int top, final int right, final int bottom) {
            if (this.mEnabled) {
                super.setHotspotBounds(left, top, right, bottom);
            }
        }
        
        public boolean setVisible(final boolean visible, final boolean restart) {
            return this.mEnabled && super.setVisible(visible, restart);
        }
    }
    
    private class ResolveHoverRunnable implements Runnable
    {
        ResolveHoverRunnable() {
        }
        
        public void run() {
            DropDownListView.this.mResolveHoverRunnable = null;
            DropDownListView.this.drawableStateChanged();
        }
        
        public void cancel() {
            DropDownListView.this.mResolveHoverRunnable = null;
            DropDownListView.this.removeCallbacks((Runnable)this);
        }
        
        public void post() {
            DropDownListView.this.post((Runnable)this);
        }
    }
    
    @RequiresApi(30)
    static class Api30Impl
    {
        private static Method sPositionSelector;
        private static Method sSetSelectedPositionInt;
        private static Method sSetNextSelectedPositionInt;
        private static boolean sHasMethods;
        
        private Api30Impl() {
        }
        
        static boolean canPositionSelectorForHoveredItem() {
            return Api30Impl.sHasMethods;
        }
        
        @SuppressLint({ "BanUncheckedReflection" })
        static void positionSelectorForHoveredItem(final DropDownListView view, final int position, final View sel) {
            try {
                Api30Impl.sPositionSelector.invoke((Object)view, new Object[] { position, sel, false, -1, -1 });
                Api30Impl.sSetSelectedPositionInt.invoke((Object)view, new Object[] { position });
                Api30Impl.sSetNextSelectedPositionInt.invoke((Object)view, new Object[] { position });
            }
            catch (final IllegalAccessException e) {
                e.printStackTrace();
            }
            catch (final InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
        
        static {
            try {
                (Api30Impl.sPositionSelector = AbsListView.class.getDeclaredMethod("positionSelector", Integer.TYPE, View.class, Boolean.TYPE, Float.TYPE, Float.TYPE)).setAccessible(true);
                (Api30Impl.sSetSelectedPositionInt = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE)).setAccessible(true);
                (Api30Impl.sSetNextSelectedPositionInt = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE)).setAccessible(true);
                Api30Impl.sHasMethods = true;
            }
            catch (final NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }
    
    @RequiresApi(21)
    static class Api21Impl
    {
        private Api21Impl() {
        }
        
        @DoNotInline
        static void drawableHotspotChanged(final View view, final float x, final float y) {
            view.drawableHotspotChanged(x, y);
        }
    }
    
    static class PreApi33Impl
    {
        private static final Field sIsChildViewEnabled;
        
        private PreApi33Impl() {
        }
        
        static boolean isSelectedChildViewEnabled(final AbsListView view) {
            if (PreApi33Impl.sIsChildViewEnabled != null) {
                try {
                    return PreApi33Impl.sIsChildViewEnabled.getBoolean((Object)view);
                }
                catch (final IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            return false;
        }
        
        static void setSelectedChildViewEnabled(final AbsListView view, final boolean enabled) {
            if (PreApi33Impl.sIsChildViewEnabled != null) {
                try {
                    PreApi33Impl.sIsChildViewEnabled.set((Object)view, (Object)enabled);
                }
                catch (final IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        
        static {
            Field isChildViewEnabled = null;
            try {
                isChildViewEnabled = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                isChildViewEnabled.setAccessible(true);
            }
            catch (final NoSuchFieldException e) {
                e.printStackTrace();
            }
            sIsChildViewEnabled = isChildViewEnabled;
        }
    }
    
    @RequiresApi(33)
    static class Api33Impl
    {
        private Api33Impl() {
        }
        
        @DoNotInline
        static boolean isSelectedChildViewEnabled(final AbsListView view) {
            return view.isSelectedChildViewEnabled();
        }
        
        @DoNotInline
        static void setSelectedChildViewEnabled(final AbsListView view, final boolean enabled) {
            view.setSelectedChildViewEnabled(enabled);
        }
    }
}
