package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ContextWrapper;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.util.Log;
import android.view.ViewGroup;
import androidx.appcompat.R;
import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import android.graphics.Rect;
import android.view.WindowManager;
import android.widget.TextView;
import android.view.View;
import android.content.Context;
import androidx.annotation.RestrictTo;

@RestrictTo({ RestrictTo.Scope.LIBRARY_GROUP_PREFIX })
class TooltipPopup
{
    private static final String TAG = "TooltipPopup";
    private final Context mContext;
    private final View mContentView;
    private final TextView mMessageView;
    private final WindowManager.LayoutParams mLayoutParams;
    private final Rect mTmpDisplayFrame;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;
    
    TooltipPopup(@NonNull final Context context) {
        this.mLayoutParams = new WindowManager.LayoutParams();
        this.mTmpDisplayFrame = new Rect();
        this.mTmpAnchorPos = new int[2];
        this.mTmpAppPos = new int[2];
        this.mContext = context;
        this.mContentView = LayoutInflater.from(this.mContext).inflate(R.layout.abc_tooltip, (ViewGroup)null);
        this.mMessageView = (TextView)this.mContentView.findViewById(R.id.message);
        this.mLayoutParams.setTitle((CharSequence)this.getClass().getSimpleName());
        this.mLayoutParams.packageName = this.mContext.getPackageName();
        this.mLayoutParams.type = 1002;
        this.mLayoutParams.width = -2;
        this.mLayoutParams.height = -2;
        this.mLayoutParams.format = -3;
        this.mLayoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        this.mLayoutParams.flags = 24;
    }
    
    void show(final View anchorView, final int anchorX, final int anchorY, final boolean fromTouch, final CharSequence tooltipText) {
        if (this.isShowing()) {
            this.hide();
        }
        this.mMessageView.setText(tooltipText);
        this.computePosition(anchorView, anchorX, anchorY, fromTouch, this.mLayoutParams);
        final WindowManager wm = (WindowManager)this.mContext.getSystemService("window");
        wm.addView(this.mContentView, (ViewGroup.LayoutParams)this.mLayoutParams);
    }
    
    void hide() {
        if (!this.isShowing()) {
            return;
        }
        final WindowManager wm = (WindowManager)this.mContext.getSystemService("window");
        wm.removeView(this.mContentView);
    }
    
    boolean isShowing() {
        return this.mContentView.getParent() != null;
    }
    
    private void computePosition(final View anchorView, final int anchorX, final int anchorY, final boolean fromTouch, final WindowManager.LayoutParams outParams) {
        outParams.token = anchorView.getApplicationWindowToken();
        final int tooltipPreciseAnchorThreshold = this.mContext.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        int offsetX;
        if (anchorView.getWidth() >= tooltipPreciseAnchorThreshold) {
            offsetX = anchorX;
        }
        else {
            offsetX = anchorView.getWidth() / 2;
        }
        int offsetBelow;
        int offsetAbove;
        if (anchorView.getHeight() >= tooltipPreciseAnchorThreshold) {
            final int offsetExtra = this.mContext.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            offsetBelow = anchorY + offsetExtra;
            offsetAbove = anchorY - offsetExtra;
        }
        else {
            offsetBelow = anchorView.getHeight();
            offsetAbove = 0;
        }
        outParams.gravity = 49;
        final int tooltipOffset = this.mContext.getResources().getDimensionPixelOffset(fromTouch ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
        final View appView = getAppRootView(anchorView);
        if (appView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        appView.getWindowVisibleDisplayFrame(this.mTmpDisplayFrame);
        if (this.mTmpDisplayFrame.left < 0 && this.mTmpDisplayFrame.top < 0) {
            final Resources res = this.mContext.getResources();
            final int resourceId = res.getIdentifier("status_bar_height", "dimen", "android");
            int statusBarHeight;
            if (resourceId != 0) {
                statusBarHeight = res.getDimensionPixelSize(resourceId);
            }
            else {
                statusBarHeight = 0;
            }
            final DisplayMetrics metrics = res.getDisplayMetrics();
            this.mTmpDisplayFrame.set(0, statusBarHeight, metrics.widthPixels, metrics.heightPixels);
        }
        appView.getLocationOnScreen(this.mTmpAppPos);
        anchorView.getLocationOnScreen(this.mTmpAnchorPos);
        final int[] mTmpAnchorPos = this.mTmpAnchorPos;
        final int n = 0;
        mTmpAnchorPos[n] -= this.mTmpAppPos[0];
        final int[] mTmpAnchorPos2 = this.mTmpAnchorPos;
        final int n2 = 1;
        mTmpAnchorPos2[n2] -= this.mTmpAppPos[1];
        outParams.x = this.mTmpAnchorPos[0] + offsetX - appView.getWidth() / 2;
        final int spec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.mContentView.measure(spec, spec);
        final int tooltipHeight = this.mContentView.getMeasuredHeight();
        final int yAbove = this.mTmpAnchorPos[1] + offsetAbove - tooltipOffset - tooltipHeight;
        final int yBelow = this.mTmpAnchorPos[1] + offsetBelow + tooltipOffset;
        if (fromTouch) {
            if (yAbove >= 0) {
                outParams.y = yAbove;
            }
            else {
                outParams.y = yBelow;
            }
        }
        else if (yBelow + tooltipHeight <= this.mTmpDisplayFrame.height()) {
            outParams.y = yBelow;
        }
        else {
            outParams.y = yAbove;
        }
    }
    
    private static View getAppRootView(final View anchorView) {
        final View rootView = anchorView.getRootView();
        final ViewGroup.LayoutParams lp = rootView.getLayoutParams();
        if (lp instanceof WindowManager.LayoutParams && ((WindowManager.LayoutParams)lp).type == 2) {
            return rootView;
        }
        for (Context context = anchorView.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper)context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity)context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
