package android.appwidget;

import android.view.ViewGroup;
import android.graphics.Canvas;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RemoteViews;
import java.util.concurrent.Executor;
import android.util.AttributeSet;
import android.util.SizeF;
import java.util.List;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.graphics.Rect;
import android.content.ComponentName;
import android.content.Context;
import android.widget.FrameLayout;

public class AppWidgetHostView extends FrameLayout
{
    public AppWidgetHostView(final Context context) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public AppWidgetHostView(final Context context, final int animationIn, final int animationOut) {
        super(null);
        throw new RuntimeException("Stub!");
    }
    
    public void setAppWidget(final int appWidgetId, final AppWidgetProviderInfo info) {
        throw new RuntimeException("Stub!");
    }
    
    public static Rect getDefaultPaddingForWidget(final Context context, final ComponentName component, final Rect padding) {
        throw new RuntimeException("Stub!");
    }
    
    public int getAppWidgetId() {
        throw new RuntimeException("Stub!");
    }
    
    public AppWidgetProviderInfo getAppWidgetInfo() {
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
    protected void onLayout(final boolean changed, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void updateAppWidgetSize(final Bundle newOptions, final int minWidth, final int minHeight, final int maxWidth, final int maxHeight) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidgetSize(@NonNull final Bundle newOptions, @NonNull final List<SizeF> sizes) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidgetOptions(final Bundle options) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public LayoutParams generateLayoutParams(final AttributeSet attrs) {
        throw new RuntimeException("Stub!");
    }
    
    public void setExecutor(final Executor executor) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnLightBackground(final boolean onLightBackground) {
        throw new RuntimeException("Stub!");
    }
    
    public void updateAppWidget(final RemoteViews remoteViews) {
        throw new RuntimeException("Stub!");
    }
    
    protected void prepareView(final View view) {
        throw new RuntimeException("Stub!");
    }
    
    protected View getDefaultView() {
        throw new RuntimeException("Stub!");
    }
    
    protected View getErrorView() {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorResources(@NonNull final SparseIntArray colorMapping) {
        throw new RuntimeException("Stub!");
    }
    
    public void resetColorResources() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    protected void dispatchDraw(@NonNull final Canvas canvas) {
        throw new RuntimeException("Stub!");
    }
}
