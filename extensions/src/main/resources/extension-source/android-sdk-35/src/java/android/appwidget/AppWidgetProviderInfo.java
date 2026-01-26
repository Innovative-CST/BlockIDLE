package android.appwidget;

import android.content.pm.ActivityInfo;
import android.os.UserHandle;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.content.ComponentName;
import android.os.Parcelable;

public class AppWidgetProviderInfo implements Parcelable
{
    @NonNull
    public static final Creator<AppWidgetProviderInfo> CREATOR;
    public static final int RESIZE_BOTH = 3;
    public static final int RESIZE_HORIZONTAL = 1;
    public static final int RESIZE_NONE = 0;
    public static final int RESIZE_VERTICAL = 2;
    public static final int WIDGET_CATEGORY_HOME_SCREEN = 1;
    public static final int WIDGET_CATEGORY_KEYGUARD = 2;
    public static final int WIDGET_CATEGORY_SEARCHBOX = 4;
    public static final int WIDGET_FEATURE_CONFIGURATION_OPTIONAL = 4;
    public static final int WIDGET_FEATURE_HIDE_FROM_PICKER = 2;
    public static final int WIDGET_FEATURE_RECONFIGURABLE = 1;
    public int autoAdvanceViewId;
    public ComponentName configure;
    public int descriptionRes;
    public int generatedPreviewCategories;
    public int icon;
    public int initialKeyguardLayout;
    public int initialLayout;
    @Deprecated
    public String label;
    public int maxResizeHeight;
    public int maxResizeWidth;
    public int minHeight;
    public int minResizeHeight;
    public int minResizeWidth;
    public int minWidth;
    public int previewImage;
    public int previewLayout;
    public ComponentName provider;
    public int resizeMode;
    public int targetCellHeight;
    public int targetCellWidth;
    public int updatePeriodMillis;
    public int widgetCategory;
    public int widgetFeatures;
    
    public AppWidgetProviderInfo() {
        throw new RuntimeException("Stub!");
    }
    
    public AppWidgetProviderInfo(final Parcel in) {
        throw new RuntimeException("Stub!");
    }
    
    public final String loadLabel(final PackageManager packageManager) {
        throw new RuntimeException("Stub!");
    }
    
    public final Drawable loadIcon(@NonNull final Context context, final int density) {
        throw new RuntimeException("Stub!");
    }
    
    public final Drawable loadPreviewImage(@NonNull final Context context, final int density) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public final CharSequence loadDescription(@NonNull final Context context) {
        throw new RuntimeException("Stub!");
    }
    
    public final UserHandle getProfile() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ActivityInfo getActivityInfo() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public void writeToParcel(final Parcel out, final int flags) {
        throw new RuntimeException("Stub!");
    }
    
    public AppWidgetProviderInfo clone() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public int describeContents() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
    
    static {
        CREATOR = null;
    }
}
