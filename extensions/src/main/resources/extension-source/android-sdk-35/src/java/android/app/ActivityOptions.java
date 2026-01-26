package android.app;

import android.os.Bundle;
import android.graphics.Rect;
import android.util.Pair;
import android.graphics.Bitmap;
import android.view.View;
import android.content.Context;

public class ActivityOptions
{
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";
    public static final int MODE_BACKGROUND_ACTIVITY_START_ALLOWED = 1;
    public static final int MODE_BACKGROUND_ACTIVITY_START_DENIED = 2;
    public static final int MODE_BACKGROUND_ACTIVITY_START_SYSTEM_DEFINED = 0;
    
    ActivityOptions() {
        throw new RuntimeException("Stub!");
    }
    
    public static ActivityOptions makeCustomAnimation(final Context context, final int enterResId, final int exitResId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ActivityOptions makeCustomAnimation(@NonNull final Context context, final int enterResId, final int exitResId, final int backgroundColor) {
        throw new RuntimeException("Stub!");
    }
    
    public static ActivityOptions makeScaleUpAnimation(final View source, final int startX, final int startY, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public static ActivityOptions makeClipRevealAnimation(final View source, final int startX, final int startY, final int width, final int height) {
        throw new RuntimeException("Stub!");
    }
    
    public static ActivityOptions makeThumbnailScaleUpAnimation(final View source, final Bitmap thumbnail, final int startX, final int startY) {
        throw new RuntimeException("Stub!");
    }
    
    public static ActivityOptions makeSceneTransitionAnimation(final Activity activity, final View sharedElement, final String sharedElementName) {
        throw new RuntimeException("Stub!");
    }
    
    @SafeVarargs
    public static ActivityOptions makeSceneTransitionAnimation(final Activity activity, final Pair<View, String>... sharedElements) {
        throw new RuntimeException("Stub!");
    }
    
    public static ActivityOptions makeTaskLaunchBehind() {
        throw new RuntimeException("Stub!");
    }
    
    public static ActivityOptions makeBasic() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public static ActivityOptions makeLaunchIntoPip(@NonNull final PictureInPictureParams pictureInPictureParams) {
        throw new RuntimeException("Stub!");
    }
    
    public ActivityOptions setLaunchBounds(@Nullable final Rect screenSpacePixelRect) {
        throw new RuntimeException("Stub!");
    }
    
    @Nullable
    public Rect getLaunchBounds() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean getLockTaskMode() {
        throw new RuntimeException("Stub!");
    }
    
    public boolean isShareIdentityEnabled() {
        throw new RuntimeException("Stub!");
    }
    
    public int getSplashScreenStyle() {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ActivityOptions setSplashScreenStyle(final int style) {
        throw new RuntimeException("Stub!");
    }
    
    public ActivityOptions setLockTaskEnabled(final boolean lockTaskMode) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ActivityOptions setShareIdentityEnabled(final boolean shareIdentity) {
        throw new RuntimeException("Stub!");
    }
    
    public int getLaunchDisplayId() {
        throw new RuntimeException("Stub!");
    }
    
    public ActivityOptions setLaunchDisplayId(final int launchDisplayId) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ActivityOptions setPendingIntentCreatorBackgroundActivityStartMode(final int mode) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPendingIntentCreatorBackgroundActivityStartMode() {
        throw new RuntimeException("Stub!");
    }
    
    public void update(final ActivityOptions otherOptions) {
        throw new RuntimeException("Stub!");
    }
    
    public Bundle toBundle() {
        throw new RuntimeException("Stub!");
    }
    
    public void requestUsageTimeReport(final PendingIntent receiver) {
        throw new RuntimeException("Stub!");
    }
    
    public ActivityOptions setAppVerificationBundle(final Bundle bundle) {
        throw new RuntimeException("Stub!");
    }
    
    @NonNull
    public ActivityOptions setPendingIntentBackgroundActivityStartMode(final int state) {
        throw new RuntimeException("Stub!");
    }
    
    public int getPendingIntentBackgroundActivityStartMode() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void setPendingIntentBackgroundActivityLaunchAllowed(final boolean allowed) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public boolean isPendingIntentBackgroundActivityLaunchAllowed() {
        throw new RuntimeException("Stub!");
    }
    
    @Override
    public String toString() {
        throw new RuntimeException("Stub!");
    }
}
