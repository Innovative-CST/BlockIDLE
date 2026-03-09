package android.widget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import android.graphics.Outline;
import android.view.ViewOutlineProvider;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.os.Bundle;
import android.graphics.BlendMode;
import android.content.res.ColorStateList;
import android.content.Intent;
import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.util.SizeF;
import java.util.Map;
import android.view.LayoutInflater;
import android.os.Parcelable;

public class RemoteViews implements Parcelable, LayoutInflater.Filter
{
    @NonNull
    public static final Creator<RemoteViews> CREATOR;
    public static final String EXTRA_CHECKED = "android.widget.extra.CHECKED";
    public static final String EXTRA_SHARED_ELEMENT_BOUNDS = "android.widget.extra.SHARED_ELEMENT_BOUNDS";
    public static final int MARGIN_BOTTOM = 3;
    public static final int MARGIN_END = 5;
    public static final int MARGIN_LEFT = 0;
    public static final int MARGIN_RIGHT = 2;
    public static final int MARGIN_START = 4;
    public static final int MARGIN_TOP = 1;
    
    public RemoteViews(final String packageName, final int layoutId) {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteViews(@NonNull final String packageName, final int layoutId, final int viewId) {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteViews(final RemoteViews landscape, final RemoteViews portrait) {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteViews(@NonNull final Map<SizeF, RemoteViews> remoteViews) {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteViews(final RemoteViews src) {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteViews(final Parcel parcel) {
        throw new RuntimeException("Stub!");
    }
    
    public RemoteViews(@NonNull final DrawInstructions drawInstructions) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public RemoteViews clone() {
        throw new RuntimeException("Stub!");
    }
    
    public String getPackage() {
        throw new RuntimeException("Stub!");
    }
    
    public int getLayoutId() {
        throw new RuntimeException("Stub!");
    }
    
    public void addView(final int viewId, final RemoteViews nestedView) {
        throw new RuntimeException("Stub!");
    }
    
    public void addStableView(final int viewId, @NonNull final RemoteViews nestedView, final int stableId) {
        throw new RuntimeException("Stub!");
    }
    
    public void removeAllViews(final int viewId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void showNext(final int viewId) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void showPrevious(final int viewId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDisplayedChild(final int viewId, final int childIndex) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewVisibility(final int viewId, final int visibility) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextViewText(final int viewId, final CharSequence text) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextViewTextSize(final int viewId, final int units, final float size) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextViewCompoundDrawables(final int viewId, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextViewCompoundDrawablesRelative(final int viewId, final int start, final int top, final int end, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageViewResource(final int viewId, final int srcId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageViewUri(final int viewId, final Uri uri) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageViewBitmap(final int viewId, final Bitmap bitmap) {
        throw new RuntimeException("Stub!");
    }
    
    public void setImageViewIcon(final int viewId, final Icon icon) {
        throw new RuntimeException("Stub!");
    }
    
    public void setEmptyView(final int viewId, final int emptyViewId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChronometer(final int viewId, final long base, final String format, final boolean started) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChronometerCountDown(final int viewId, final boolean isCountDown) {
        throw new RuntimeException("Stub!");
    }
    
    public void setProgressBar(final int viewId, final int max, final int progress, final boolean indeterminate) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnClickPendingIntent(final int viewId, final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnClickResponse(final int viewId, @NonNull final RemoteResponse response) {
        throw new RuntimeException("Stub!");
    }
    
    public void setPendingIntentTemplate(final int viewId, final PendingIntent pendingIntentTemplate) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnClickFillInIntent(final int viewId, final Intent fillInIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnCheckedChangeResponse(final int viewId, @NonNull final RemoteResponse response) {
        throw new RuntimeException("Stub!");
    }
    
    public void setOnStylusHandwritingPendingIntent(final int viewId, @Nullable final PendingIntent pendingIntent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setTextColor(final int viewId, final int color) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRemoteAdapter(final int appWidgetId, final int viewId, final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setRemoteAdapter(final int viewId, final Intent intent) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRemoteAdapter(final int viewId, @NonNull final RemoteCollectionItems items) {
        throw new RuntimeException("Stub!");
    }
    
    public void setScrollPosition(final int viewId, final int position) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRelativeScrollPosition(final int viewId, final int offset) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewPadding(final int viewId, final int left, final int top, final int right, final int bottom) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutMarginDimen(final int viewId, final int type, final int dimen) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutMarginAttr(final int viewId, final int type, final int attr) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutMargin(final int viewId, final int type, final float value, final int units) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutWidth(final int viewId, final float width, final int units) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutWidthDimen(final int viewId, final int widthDimen) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutWidthAttr(final int viewId, final int widthAttr) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutHeight(final int viewId, final float height, final int units) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutHeightDimen(final int viewId, final int heightDimen) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewLayoutHeightAttr(final int viewId, final int heightAttr) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewOutlinePreferredRadius(final int viewId, final float radius, final int units) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewOutlinePreferredRadiusDimen(final int viewId, final int resId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setViewOutlinePreferredRadiusAttr(final int viewId, final int attrId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBoolean(final int viewId, final String methodName, final boolean value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setByte(final int viewId, final String methodName, final byte value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setShort(final int viewId, final String methodName, final short value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setInt(final int viewId, final String methodName, final int value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntDimen(final int viewId, @NonNull final String methodName, final int dimenResource) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntDimen(final int viewId, @NonNull final String methodName, final float value, final int unit) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntDimenAttr(final int viewId, @NonNull final String methodName, final int dimenAttr) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColor(final int viewId, @NonNull final String methodName, final int colorResource) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorAttr(final int viewId, @NonNull final String methodName, final int colorAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorInt(final int viewId, @NonNull final String methodName, final int notNight, final int night) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorStateList(final int viewId, @NonNull final String methodName, @Nullable final ColorStateList value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorStateList(final int viewId, @NonNull final String methodName, @Nullable final ColorStateList notNight, @Nullable final ColorStateList night) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorStateList(final int viewId, @NonNull final String methodName, final int colorResource) {
        throw new RuntimeException("Stub!");
    }
    
    public void setColorStateListAttr(final int viewId, @NonNull final String methodName, final int colorAttr) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLong(final int viewId, final String methodName, final long value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloat(final int viewId, final String methodName, final float value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatDimen(final int viewId, @NonNull final String methodName, final int dimenResource) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatDimen(final int viewId, @NonNull final String methodName, final float value, final int unit) {
        throw new RuntimeException("Stub!");
    }
    
    public void setFloatDimenAttr(final int viewId, @NonNull final String methodName, final int dimenAttr) {
        throw new RuntimeException("Stub!");
    }
    
    public void setDouble(final int viewId, final String methodName, final double value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setChar(final int viewId, final String methodName, final char value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setString(final int viewId, final String methodName, final String value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCharSequence(final int viewId, final String methodName, final CharSequence value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCharSequence(final int viewId, @NonNull final String methodName, final int stringResource) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCharSequenceAttr(final int viewId, @NonNull final String methodName, final int stringAttribute) {
        throw new RuntimeException("Stub!");
    }
    
    public void setUri(final int viewId, final String methodName, final Uri value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBitmap(final int viewId, final String methodName, final Bitmap value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBlendMode(final int viewId, @NonNull final String methodName, @Nullable final BlendMode value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setBundle(final int viewId, final String methodName, final Bundle value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIntent(final int viewId, final String methodName, final Intent value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIcon(final int viewId, final String methodName, final Icon value) {
        throw new RuntimeException("Stub!");
    }
    
    public void setIcon(final int viewId, @NonNull final String methodName, @Nullable final Icon notNight, @Nullable final Icon night) {
        throw new RuntimeException("Stub!");
    }
    
    public void setContentDescription(final int viewId, final CharSequence contentDescription) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityTraversalBefore(final int viewId, final int nextId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setAccessibilityTraversalAfter(final int viewId, final int nextId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLabelFor(final int viewId, final int labeledId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setCompoundButtonChecked(final int viewId, final boolean checked) {
        throw new RuntimeException("Stub!");
    }
    
    public void setRadioGroupChecked(final int viewId, final int checkedId) {
        throw new RuntimeException("Stub!");
    }
    
    public void setLightBackgroundLayoutId(final int layoutId) {
        throw new RuntimeException("Stub!");
    }
    
    public View apply(final Context context, final ViewGroup parent) {
        throw new RuntimeException("Stub!");
    }
    
    public void reapply(final Context context, final View v) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public boolean onLoadClass(final Class clazz) {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public int getViewId() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
    
    public static class ActionException extends RuntimeException
    {
        public ActionException(final Exception ex) {
            throw new RuntimeException("Stub!");
        }
        
        public ActionException(final String message) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class DrawInstructions
    {
        DrawInstructions() {
            throw new RuntimeException("Stub!");
        }
        
        public static long getSupportedVersion() {
            throw new RuntimeException("Stub!");
        }
        
        public static final class Builder
        {
            public Builder(@NonNull final List<byte[]> instructions) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public DrawInstructions build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static final class RemoteCollectionItems implements Parcelable
    {
        @NonNull
        public static final Creator<RemoteCollectionItems> CREATOR;
        
        RemoteCollectionItems() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public int describeContents() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void writeToParcel(@NonNull final Parcel dest, final int flags) {
            throw new RuntimeException("Stub!");
        }
        
        public long getItemId(final int position) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RemoteViews getItemView(final int position) {
            throw new RuntimeException("Stub!");
        }
        
        public int getItemCount() {
            throw new RuntimeException("Stub!");
        }
        
        public int getViewTypeCount() {
            throw new RuntimeException("Stub!");
        }
        
        public boolean hasStableIds() {
            throw new RuntimeException("Stub!");
        }
        
        static {
            CREATOR = null;
        }
        
        public static final class Builder
        {
            public Builder() {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder addItem(final long id, @NonNull final RemoteViews view) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setHasStableIds(final boolean hasStableIds) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public Builder setViewTypeCount(final int viewTypeCount) {
                throw new RuntimeException("Stub!");
            }
            
            @NonNull
            public RemoteCollectionItems build() {
                throw new RuntimeException("Stub!");
            }
        }
    }
    
    public static class RemoteResponse
    {
        public RemoteResponse() {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static RemoteResponse fromPendingIntent(@NonNull final PendingIntent pendingIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public static RemoteResponse fromFillInIntent(@NonNull final Intent fillIntent) {
            throw new RuntimeException("Stub!");
        }
        
        @NonNull
        public RemoteResponse addSharedElement(final int viewId, @NonNull final String sharedElementName) {
            throw new RuntimeException("Stub!");
        }
    }
    
    public static final class RemoteViewOutlineProvider extends ViewOutlineProvider
    {
        public RemoteViewOutlineProvider(final float radius) {
            throw new RuntimeException("Stub!");
        }
        
        public float getRadius() {
            throw new RuntimeException("Stub!");
        }
        
        @Override
        public void getOutline(@NonNull final View view, @NonNull final Outline outline) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target({ ElementType.TYPE })
    public @interface RemoteView {
    }
}
